package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.growables.BlockPamFruit;
import com.pam.harvestcraft.worldgen.FruitTreeGen;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.FMLLog;

import java.util.Random;

public class BlockPamSapling extends BlockBush implements IGrowable {

    public final String name;
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
    private BlockPamFruit fruit;
    private final SaplingType saplingType;

    public BlockPamSapling(String name, SaplingType saplingType) {
        super();
        this.setStepSound(SoundType.PLANT);
        this.setHardness(0.0F);
        this.setCreativeTab(HarvestCraft.modTab);
        this.saplingType = saplingType;
        this.name = name;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SAPLING_AABB;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        Block soilBlock = world.getBlockState(pos.down()).getBlock();

        return this.isSuitableSoilBlock(soilBlock);
    }

    @Override
    public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock) {
        this.validatePosition(world, pos, state);
    }

    public void validatePosition(World world, BlockPos pos, IBlockState state) {
        if (!this.canPlaceBlockAt(world, pos)) {
            this.dropBlockAsItem(world, pos, state, 0);

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

    public boolean isSuitableSoilBlock(Block soilBlock) {
        return soilBlock == Blocks.grass || soilBlock == Blocks.dirt || soilBlock == Blocks.farmland;
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote) {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        this.generateTree(worldIn, pos, state, rand);
    }

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {

        if (!TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
            return;
        }

        final BlockPlanks.EnumType planks;

        switch (saplingType) {
            case WARM:
                planks = BlockPlanks.EnumType.JUNGLE;
                break;
            case COLD:
                planks = BlockPlanks.EnumType.SPRUCE;
                break;
            case TEMPERATE:
            default:
                planks = BlockPlanks.EnumType.OAK;
        }

        worldIn.setBlockToAir(pos);
        final IBlockState log = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, planks);
        final IBlockState leaves = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, planks)
                .withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruit = getFruit().getDefaultState();
        if (!new FruitTreeGen(5, log, leaves, false, fruit).generate(worldIn, rand, pos)) {
            worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
        }
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        this.grow(worldIn, pos, state, rand);
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        final IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }


    public void setFruit(BlockPamFruit fruit) {
        this.fruit = fruit;
    }

    public BlockPamFruit getFruit() {
        if (fruit == null) {
            FMLLog.bigWarning("Fruit for sapling %s not found.", getUnlocalizedName());
            return null;
        }

        return fruit;
    }

    public enum SaplingType {
        TEMPERATE, WARM, COLD
    }
}