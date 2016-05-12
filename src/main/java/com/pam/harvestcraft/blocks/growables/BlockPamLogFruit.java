package com.pam.harvestcraft.blocks.growables;

import com.pam.harvestcraft.HarvestCraft;
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
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;

import java.util.List;
import java.util.Random;

public class BlockPamLogFruit extends Block implements IGrowable, PamGrowable {

    private static final int MATURE_AGE = 2;

    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, MATURE_AGE);

    public BlockPamLogFruit() {
        super(Material.plants);
        this.setCreativeTab(HarvestCraft.modTab);
        this.setHardness(5);
        this.setTickRandomly(true);
        this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, 0));
    }

    @Override
    public int getMatureAge() {
        return MATURE_AGE;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (getMetaFromState(state) >= MATURE_AGE) {
            return getCrop(state.getBlock());
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
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return state.getValue(AGE) < 2;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return true;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        this.grow(worldIn, pos, state);
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (state.getValue(AGE) == MATURE_AGE) {
            if (worldIn.isRemote) {
                return true;
            }

            final Block currentBlock = worldIn.getBlockState(pos).getBlock();

            final ItemStack savedStack = new ItemStack(getCrop(currentBlock));

            worldIn.setBlockState(pos, state.withProperty(AGE, 0), 3);
            EntityItem entityItem = new EntityItem(worldIn, playerIn.posX, playerIn.posY - 1D, playerIn.posZ, savedStack);
            worldIn.spawnEntityInWorld(entityItem);
            entityItem.onCollideWithPlayer(playerIn);
            return true;
        }
        return false;
    }

    private Item getCrop(Block currentBlock) {
        if (currentBlock == BlockRegistry.pamCinnamon) {
            return ItemRegistry.cinnamonItem;
        } else if (currentBlock == BlockRegistry.pamMaple) {
            return ItemRegistry.maplesyrupItem;
        } else if (currentBlock == BlockRegistry.pamPaperbark) {
            return Items.paper;
        } else {
            FMLLog.bigWarning("currentBlock is not cinnamon, maple or paperbark. This should not happen. Returning wheat.");
            return Items.wheat;
        }
    }


    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i <= MATURE_AGE; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }


}
