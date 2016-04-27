package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.FMLLog;

import java.util.List;
import java.util.Random;

public class BlockPamCrop extends BlockCrops implements IGrowable, IPlantable {

    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 3);

    private static final AxisAlignedBB[] CROPS_AABB = new AxisAlignedBB[]{new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};

    public final String registerName;

    public BlockPamCrop(String registerName) {
        super();

        this.registerName = registerName;

        this.setDefaultState(blockState.getBaseState().withProperty(getAge(), 0));
        this.setCreativeTab(HarvestCraft.modTab);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        // CROPS_AABB is based on an age range from 0 to 7. Times two should fix that issue.
        return CROPS_AABB[state.getValue(getAge()) * 2];
    }

    public boolean isSuitableSoilBlock(Block soilBlock) {
        return soilBlock == Blocks.farmland;
    }

    protected PropertyInteger getAge() {
        return AGE;
    }

    public int getHarvestReadyAge() {
        return 3;
    }

    public boolean isHarvestReady(IBlockState state) {
        return state.getValue(getAge()) >= getHarvestReadyAge();
    }


    protected Item getSeeds() {
        final Item seeds = ItemRegistry.seedsMap.get(this);

        if (seeds == null) {
            FMLLog.bigWarning("No seeds have been set up.");
            return new Item();
        }

        return seeds;
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(getSeeds());
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return !isHarvestReady(state);
    }

    protected Item getHarvestedItem() {
        final Item harvestedItem = ItemRegistry.harvestedItemMap.get(this);
        if (harvestedItem == null) {
            FMLLog.bigWarning("No harvested item has been set up.");
            return new Item();
        }

        return harvestedItem;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(getAge(), meta);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        this.checkAndDropBlock(worldIn, pos, state);

        if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {
            int i = this.getMetaFromState(state);

            if (i < this.getHarvestReadyAge()) {
                float f = getGrowthChance(this, worldIn, pos);

                if (rand.nextInt((int) (25.0F / f) + 1) == 0) {
                    worldIn.setBlockState(pos, this.getStateFromMeta(i + 1), 2);
                }
            }
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (!isHarvestReady(state)) {
            return getSeeds();
        } else {
            return getHarvestedItem();
        }
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(getAge());
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        Block soilBlock = world.getBlockState(pos.down()).getBlock();

        return this.isSuitableSoilBlock(soilBlock);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (isHarvestReady(state)) {
            if (worldIn.isRemote) {
                return true;
            }

            final ItemStack savedStack = new ItemStack(getHarvestedItem());

            worldIn.setBlockState(pos, state.withProperty(AGE, 0), 3);
            final EntityItem entityItem = new EntityItem(worldIn, playerIn.posX, playerIn.posY - 1D, playerIn.posZ, savedStack);
            worldIn.spawnEntityInWorld(entityItem);
            entityItem.onCollideWithPlayer(playerIn);
            return true;
        }
        return false;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, 0));
        list.add(new ItemStack(itemIn, 1, 3));
    }


    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Crop;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, AGE);
    }

    protected int getRandomInt(World world) {
        return MathHelper.getRandomIntegerInRange(world.rand, 1, 3);
    }

    @Override
    public void grow(World worldIn, BlockPos pos, IBlockState state) {
        int newGrowth = getMetaFromState(state) + getRandomInt(worldIn);
        int maxGrowth = getHarvestReadyAge();

        if (newGrowth > maxGrowth) {
            newGrowth = maxGrowth;
        }

        worldIn.setBlockState(pos, getStateFromMeta(newGrowth), 2);
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        grow(worldIn, pos, state);
    }

    @Override
    public int hashCode() {
        return registerName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof BlockPamCrop && registerName.equals(((BlockPamCrop) obj).registerName));
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {

        List<ItemStack> ret = new java.util.ArrayList<ItemStack>();

        Random rand = world instanceof World ? ((World) world).rand : new Random();

        int age = getMetaFromState(state);

        int count = quantityDropped(state, fortune, rand);
        for (int i = 0; i < count; i++) {
            Item item = this.getItemDropped(state, rand, fortune);
            if (item != null) {
                ret.add(new ItemStack(item, 1, this.damageDropped(state)));
            }
        }

        if (age >= getHarvestReadyAge()) {
            for (int i = 0; i < 3 + fortune; ++i) {
                if (rand.nextInt(2 * getHarvestReadyAge()) <= age) {
                    ret.add(new ItemStack(this.getSeed(), 1, 0));
                }
            }
        }

        return ret;
    }
}
