package com.pam.harvestcraft.addons;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.growables.BlockPamFruit;
import com.pam.harvestcraft.blocks.growables.BlockPamFruitLog;
import com.pam.harvestcraft.blocks.growables.PamCropGrowable;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockPotato;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class RightClickHarvesting {

    public static final RightClickHarvesting instance = new RightClickHarvesting();

    private static final HashMap<String, PropertyInteger> ageCache = new HashMap<>();

    private RightClickHarvesting() {}

    public void register() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
        if (!HarvestCraft.config.enableEasyHarvest) return;

        if (event.getWorld().isRemote) {
            return;
        }

        if (event.getEntityPlayer() == null) return;
        if (event.getHand() != EnumHand.MAIN_HAND) return;

        final IBlockState blockState = event.getWorld().getBlockState(event.getPos());
        if (blockState == null) return;

        if (blockState.getBlock() instanceof BlockCrops) {
            harvestCrops(blockState, event.getEntityPlayer(), event.getWorld(), event.getPos());
        }

        if (blockState.getBlock() instanceof BlockPamFruit || blockState.getBlock() instanceof BlockPamFruitLog) {
            harvestFruit(blockState, event.getEntityPlayer(), event.getWorld(), event.getPos());
        }
    }

    public static void harvestCrops(IBlockState blockState, EntityPlayer player, World world, BlockPos blockPos) {
        final BlockCrops crops = (BlockCrops) blockState.getBlock();
        if (crops.getMetaFromState(blockState) >= crops.func_185526_g()) {
            final ItemStack stack = player.getHeldItemMainhand();
            final int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.fortune, stack);

            final List<ItemStack> drops = crops.getDrops(world, blockPos, blockState, fortune);

            // This removes exactly one seed from drops in order to make this more fair compared to vanilla
            // as one seed stays planted.
            for (Iterator<ItemStack> iterator = drops.iterator(); iterator.hasNext();) {
                final ItemStack drop = iterator.next();
                // Remove a seed, then break.
                if (! drop.getItem().getClass().equals(crops.getItemDropped(blockState, world.rand, fortune).getClass())
                        || crops instanceof BlockCarrot || crops instanceof BlockPotato) {
                    iterator.remove();
                    break;
                }
            }

            // Reset growth level
            world.setBlockState(blockPos, blockState.withProperty(getAge(crops), 0));

            for (ItemStack drop : drops) {
                dropItem(drop, world, blockPos);
            }
        }
    }

    public static void harvestFruit(IBlockState blockState, EntityPlayer player, World world, BlockPos blockPos) {
        final PamCropGrowable blockPamFruit =  (PamCropGrowable) blockState.getBlock();

        if (blockPamFruit.isMature(blockState)) {
            final ItemStack stack = player.getHeldItemMainhand();
            final int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.fortune, stack);
            final List<ItemStack> drops = blockPamFruit.getDrops(world, blockPos, blockState, fortune);

            // This removes exactly one fruit from drops in order to make this more fair compared to "vanilla"
            // as one fruit stays planted.
            if (drops.size() > 0) drops.remove(drops.size() - 1);

            // Both are identical now, but that can change in the future.
            final PropertyInteger ageProperty = blockPamFruit instanceof BlockPamFruit ? BlockPamFruit.AGE : BlockPamFruitLog.AGE;

            world.setBlockState(blockPos, blockState.withProperty(ageProperty, 0), 3);

            for (ItemStack drop : drops) {
                dropItem(drop, world, blockPos);
            }
        }
    }

    private static void dropItem(ItemStack itemStack, World world, BlockPos pos) {
        if (world.restoringBlockSnapshots || world.isRemote) return;

        float f = 0.5F;
        double d0 = (world.rand.nextFloat() * f) + 0.25D;
        double d1 = (world.rand.nextFloat() * f) + 0.25D;
        double d2 = (world.rand.nextFloat() * f) + 0.25D;

        final EntityItem entityItem = new EntityItem(world, pos.getX() + d0, pos.getY() + d1, pos.getZ() + d2, itemStack);
        entityItem.setDefaultPickupDelay();
        world.spawnEntityInWorld(entityItem);
    }

    // Reflection :(
    private static PropertyInteger getAge(BlockCrops crops) {
        if (ageCache.containsKey(crops.getRegistryName().toString())) {
            return ageCache.get(crops.getRegistryName().toString());
        }

        PropertyInteger age = tryGetAgeByReflection(crops.getClass(), crops, "func_185524_e");
        if (age != null) {
            ageCache.put(crops.getRegistryName().toString(), age);
            return age;
        }

        age = tryGetAgeByReflection(crops.getClass().getSuperclass(), crops, "func_185524_e");
        if (age != null) {
            ageCache.put(crops.getRegistryName().toString(), age);
            return age;
        }

        age = tryGetAgeByReflection(crops.getClass(), crops, "getAge");
        if (age != null) {
            ageCache.put(crops.getRegistryName().toString(), age);
            return age;
        }

        age = tryGetAgeByReflection(crops.getClass().getSuperclass(), crops, "getAge");
        if (age != null) {
            ageCache.put(crops.getRegistryName().toString(), age);
            return age;
        }

        FMLLog.bigWarning("Could not get PropertyInteger from crop %s via reflection.", crops.getUnlocalizedName());
        return null;
    }

    private static PropertyInteger tryGetAgeByReflection(Class clazz, BlockCrops obj, String methodName) {
        try {
            final Method dropMethod = clazz.getDeclaredMethod(methodName);
            dropMethod.setAccessible(true);

            return (PropertyInteger) dropMethod.invoke(obj);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

}
