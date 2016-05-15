package com.pam.harvestcraft.blocks.growables;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.BlockPamSapling;
import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockPamLogFruit extends Block implements IGrowable, PamGrowable {

    private static final int MATURE_AGE = 2;
    private final BlockPamSapling sapling;
    private String fruit;
    private Item fruitItem;

    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, MATURE_AGE);
    public String BASE_STAGE_ID = null;

    public BlockPamLogFruit(BlockPamSapling sapling, String fruit) {
        super(Material.plants);
        this.setHardness(5);
        this.setTickRandomly(true);
        this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, 0));
        this.sapling = sapling;
        this.fruit = fruit;
    }

    public BlockPamLogFruit(BlockPamSapling sapling, Item fruit) {
        super(Material.plants);
        this.setHardness(5);
        this.setTickRandomly(true);
        this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, 0));
        this.sapling = sapling;
        this.fruitItem = fruit;
    }

    public Item getFruit() {
        if (fruitItem == null) {
            fruitItem = ItemRegistry.items.containsKey(fruit) ? ItemRegistry.items.get(fruit) : null;
        }

        if (fruit == null && fruitItem == null) {
            FMLLog.bigWarning("Cannot get fruit %s.", getUnlocalizedName());
        }

        return fruitItem;
    }
    public BlockPamSapling getSapling() {
        return sapling;
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
        return getMetaFromState(state) >= getMatureAge();
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (isMature(state)) {
            return getFruit();
        }
        return null;
    }

    @Override
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

    public void grow(World worldIn, BlockPos pos, IBlockState state) {
        int i = state.getValue(AGE) + MathHelper.getRandomIntegerInRange(worldIn.rand, 2, 5);
        if (i > MATURE_AGE) {
            i = 2;
        }
        worldIn.setBlockState(pos, state.withProperty(AGE, i), 2);
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        final List<ItemStack> drops = new ArrayList<>();
        if (getMetaFromState(state) >= MATURE_AGE) {
            drops.add(new ItemStack(getFruit(), 1));
            drops.add(new ItemStack(getFruit(), 1));
        }
        return drops;
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return !isMature(state);
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
