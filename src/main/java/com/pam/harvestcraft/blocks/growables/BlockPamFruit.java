package com.pam.harvestcraft.blocks.growables;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockPamFruit extends Block implements IGrowable, PamCropGrowable {

    private static final int MATURE_AGE = 2;

    private final BlockPamSapling sapling;

    private final Item fruitItem;

    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, MATURE_AGE);
    public String BASE_STAGE_ID = null;

    public BlockPamFruit(BlockPamSapling sapling, Item fruit) {
        super(Material.PLANTS);
        this.setTickRandomly(true);
        setSoundType(SoundType.WOOD);
        this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, 0));
        this.sapling = sapling;
        this.fruitItem = fruit;
    }

    @Override
    public PropertyInteger getAgeProperty() {
        return AGE;
    }

    public Item getFruitItem() {
        if (fruitItem == null) {
            FMLLog.bigWarning("Cannot get fruit %s.", getUnlocalizedName());
        }

        return fruitItem;
    }

    public BlockPamSapling getSapling() {
        if (sapling == null) {
            FMLLog.bigWarning("Cannot get sapling for fruit %s.", getUnlocalizedName());
        }

        return sapling;
    }

    @Override
    public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos) {
        if (getMetaFromState(blockState) >= MATURE_AGE) {
            return 0f;
        }

        return 5f;
    }

    public String getStageId(int stage) {
        if (BASE_STAGE_ID == null) {
            BASE_STAGE_ID = getUnlocalizedName().replaceFirst("pam", "").replaceFirst("tile.", "").toLowerCase() + "_stage";
        }

        return BASE_STAGE_ID + stage;
    }

    @Override
    public int getMatureAge() {
        return MATURE_AGE;
    }

    @Override
    public boolean isMature(IBlockState state) {
        return getMetaFromState(state) >= MATURE_AGE;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        final List<ItemStack> drops = new ArrayList<>();
        if (getMetaFromState(state) >= MATURE_AGE) {
            drops.add(new ItemStack(getFruitItem(), 1));
            drops.add(new ItemStack(getFruitItem(), 1));
        }
        return drops;
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        final Block leafBlock = world.getBlockState(pos.up()).getBlock();

        return isSuitableSoilBlock(leafBlock);
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
        validatePosition(worldIn, pos);
    }

    public void validatePosition(World world, BlockPos pos) {

        if (!this.canPlaceBlockAt(world, pos)) {
            world.setBlockToAir(pos);
        }
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    private boolean isSuitableSoilBlock(Block leafBlock) {
        return leafBlock == Blocks.LEAVES || leafBlock == Blocks.LEAVES2;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(AGE, meta);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(AGE);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, AGE);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        int i = state.getValue(AGE);

        if (i < MATURE_AGE && rand.nextInt(25) == 0) {
            state = state.withProperty(AGE, i + 1);
            worldIn.setBlockState(pos, state, 2);
        }

        super.updateTick(worldIn, pos, state, rand);
    }

    private void grow(World worldIn, BlockPos pos, IBlockState state) {
        int i = state.getValue(AGE) + MathHelper.getRandomIntegerInRange(worldIn.rand, 1, 2);
        if (i > MATURE_AGE) {
            i = MATURE_AGE;
        }
        worldIn.setBlockState(pos, state.withProperty(AGE, i), 2);
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return state.getValue(AGE) < MATURE_AGE;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return true;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        this.grow(worldIn, pos, state);
    }
}
