package com.pam.harvestcraft.blocks.gardens;

import com.pam.harvestcraft.HarvestCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.*;

import static com.pam.harvestcraft.HarvestCraft.config;

public abstract class BlockBaseGarden extends BlockBush {
    public static final Map<String, List<ItemStack>> drops = new HashMap<>();
    private final String type;

    public BlockBaseGarden(String type) {
        super(Material.grass);
        this.type = type;
        this.setCreativeTab(HarvestCraft.modTab);
        this.setTickRandomly(true);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        super.updateTick(worldIn, pos, state, rand);

        if (config.enablegardenSpread && rand.nextInt(100 - config.gardenspreadRate) == 0) {
            int amount = config.gardenSpreadMax;

            for (BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-4, -1, -4), pos.add(4, 1, 4))) {
                if (worldIn.getBlockState(blockpos).getBlock() == this) {
                    --amount;

                    if (amount <= 0) return;
                }
            }

            BlockPos newGardenPos = pos.add(rand.nextInt(3) - 1, rand.nextInt(2) - rand.nextInt(2), rand.nextInt(3) - 1);

            for (int k = 0; k < 4; ++k) {
                if (worldIn.isAirBlock(newGardenPos) && canBlockStay(worldIn, newGardenPos, getDefaultState())) {
                    pos = newGardenPos;
                }

                newGardenPos = pos.add(rand.nextInt(3) - 1, rand.nextInt(2) - rand.nextInt(2), rand.nextInt(3) - 1);
            }

            if (worldIn.getBlockState(newGardenPos).getBlock().isReplaceable(worldIn, newGardenPos) &&
                    canBlockStay(worldIn, newGardenPos, getDefaultState())) {
                worldIn.setBlockState(newGardenPos, getDefaultState(), 2);
            }
        }
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    public abstract String getName();

    /**
     * Overriding this in order to allow dropping the garden when sneaking.
     */
    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) {
        player.triggerAchievement(StatList.func_188055_a(this));
        player.addExhaustion(0.025F);

        if (player.isSneaking() || canSilkHarvest(worldIn, pos, state, player) && EnchantmentHelper.getEnchantmentLevel(Enchantments.silkTouch, stack) > 0) {
            List<ItemStack> items = new ArrayList<>();
            ItemStack itemstack = createStackedBlock(state);

            if (itemstack != null) {
                items.add(itemstack);
            }

            ForgeEventFactory.fireBlockHarvesting(items, worldIn, pos, state, 0, 1.0f, true, player);
            for (ItemStack item : items) {
                spawnAsEntity(worldIn, pos, item);
            }
        } else {
            harvesters.set(player);
            final int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.fortune, stack);
            dropBlockAsItem(worldIn, pos, state, i);
            harvesters.set(null);
        }
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> newStack = new ArrayList<>();
        List<ItemStack> ourDrops = drops.get(type);
        Collections.shuffle(ourDrops);

        int len = Math.min(config.gardendropAmount, ourDrops.size());

        for (int i = 0; i < len; i++) {
            ItemStack drop = ourDrops.get(i);

            // This should never happen, but check it anyway...
            if (drop == null) {
                System.err.println("Tried to get a null item for garden '" + type + "'.");
                continue;
            }

            // Add it to our drops...
            newStack.add(drop.copy());
        }
        return newStack;
    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}
