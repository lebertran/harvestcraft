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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class BlockPamFruit extends Block implements IGrowable, PamGrowable {

    private static final int MATURE_AGE = 2;

    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, MATURE_AGE);

    public BlockPamFruit() {
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
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        final Block leafBlock = world.getBlockState(pos.up()).getBlock();

        return this.isSuitableSoilBlock(leafBlock);
    }

    @Override
    public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock) {
        this.validatePosition(world, pos);
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

    public boolean isSuitableSoilBlock(Block leafBlock) {
        return leafBlock == Blocks.leaves;
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

    public void grow(World worldIn, BlockPos pos, IBlockState state) {
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

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (state.getValue(AGE) == MATURE_AGE) {
            if (worldIn.isRemote) {
                return true;
            }

            final ItemStack savedStack;

            final Block currentBlock = worldIn.getBlockState(pos).getBlock();

            if (currentBlock == BlockRegistry.pamApple) {
                savedStack = new ItemStack(Items.apple);
            } else if (currentBlock == BlockRegistry.pamAlmond) {
                savedStack = new ItemStack(ItemRegistry.almondItem);
            } else if (currentBlock == BlockRegistry.pamApricot) {
                savedStack = new ItemStack(ItemRegistry.apricotItem);
            } else if (currentBlock == BlockRegistry.pamAvocado) {
                savedStack = new ItemStack(ItemRegistry.avocadoItem);
            } else if (currentBlock == BlockRegistry.pamBanana) {
                savedStack = new ItemStack(ItemRegistry.bananaItem);
            } else if (currentBlock == BlockRegistry.pamCashew) {
                savedStack = new ItemStack(ItemRegistry.cashewItem);
            } else if (currentBlock == BlockRegistry.pamCherry) {
                savedStack = new ItemStack(ItemRegistry.cherryItem);
            } else if (currentBlock == BlockRegistry.pamChestnut) {
                savedStack = new ItemStack(ItemRegistry.chestnutItem);
            } else if (currentBlock == BlockRegistry.pamCoconut) {
                savedStack = new ItemStack(ItemRegistry.coconutItem);
            } else if (currentBlock == BlockRegistry.pamDate) {
                savedStack = new ItemStack(ItemRegistry.dateItem);
            } else if (currentBlock == BlockRegistry.pamDragonfruit) {
                savedStack = new ItemStack(ItemRegistry.dragonfruitItem);
            } else if (currentBlock == BlockRegistry.pamDurian) {
                savedStack = new ItemStack(ItemRegistry.durianItem);
            } else if (currentBlock == BlockRegistry.pamFig) {
                savedStack = new ItemStack(ItemRegistry.figItem);
            } else if (currentBlock == BlockRegistry.pamGooseberry) {
                savedStack = new ItemStack(ItemRegistry.gooseberryItem);
            } else if (currentBlock == BlockRegistry.pamGrapefruit) {
                savedStack = new ItemStack(ItemRegistry.grapefruitItem);
            } else if (currentBlock == BlockRegistry.pamLemon) {
                savedStack = new ItemStack(ItemRegistry.lemonItem);
            } else if (currentBlock == BlockRegistry.pamLime) {
                savedStack = new ItemStack(ItemRegistry.limeItem);
            } else if (currentBlock == BlockRegistry.pamMango) {
                savedStack = new ItemStack(ItemRegistry.mangoItem);
            } else if (currentBlock == BlockRegistry.pamNutmeg) {
                savedStack = new ItemStack(ItemRegistry.nutmegItem);
            } else if (currentBlock == BlockRegistry.pamOlive) {
                savedStack = new ItemStack(ItemRegistry.oliveItem);
            } else if (currentBlock == BlockRegistry.pamOrange) {
                savedStack = new ItemStack(ItemRegistry.orangeItem);
            } else if (currentBlock == BlockRegistry.pamPapaya) {
                savedStack = new ItemStack(ItemRegistry.papayaItem);
            } else if (currentBlock == BlockRegistry.pamPeach) {
                savedStack = new ItemStack(ItemRegistry.peachItem);
            } else if (currentBlock == BlockRegistry.pamPear) {
                savedStack = new ItemStack(ItemRegistry.pearItem);
            } else if (currentBlock == BlockRegistry.pamPecan) {
                savedStack = new ItemStack(ItemRegistry.pecanItem);
            } else if (currentBlock == BlockRegistry.pamPeppercorn) {
                savedStack = new ItemStack(ItemRegistry.peppercornItem);
            } else if (currentBlock == BlockRegistry.pamPersimmon) {
                savedStack = new ItemStack(ItemRegistry.persimmonItem);
            } else if (currentBlock == BlockRegistry.pamPistachio) {
                savedStack = new ItemStack(ItemRegistry.pistachioItem);
            } else if (currentBlock == BlockRegistry.pamPlum) {
                savedStack = new ItemStack(ItemRegistry.plumItem);
            } else if (currentBlock == BlockRegistry.pamPomegranate) {
                savedStack = new ItemStack(ItemRegistry.pomegranateItem);
            } else if (currentBlock == BlockRegistry.pamStarfruit) {
                savedStack = new ItemStack(ItemRegistry.starfruitItem);
            } else if (currentBlock == BlockRegistry.pamVanillabean) {
                savedStack = new ItemStack(ItemRegistry.vanillabeanItem);
            } else if (currentBlock == BlockRegistry.pamWalnut) {
                savedStack = new ItemStack(ItemRegistry.walnutItem);
            } else {
                FMLLog.bigWarning("Current block %s does not have a corrresponding item. Please report", currentBlock.getRegistryName());
                return true;
            }

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
        for (int i = 0; i <= MATURE_AGE; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }


}
