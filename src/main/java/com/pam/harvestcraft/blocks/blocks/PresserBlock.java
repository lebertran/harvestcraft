package com.pam.harvestcraft.blocks.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.tileentities.TileEntityPresser;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class PresserBlock extends BlockContainerRotating {

    public static final String registryName = "presser";

    public PresserBlock() {
        super(Material.WOOD);
        setSoundType(SoundType.WOOD);
        setCreativeTab(HarvestCraft.modTab);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityPresser();
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }


    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);

        if (stack.hasDisplayName()) {
            //@TODO line 89
        }
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        final TileEntityPresser entityPresser = (TileEntityPresser) worldIn.getTileEntity(pos);

        if (entityPresser != null) {
            for (int i = 0; i < entityPresser.getSizeInventory(); ++i) {
                final ItemStack stack = entityPresser.getStackInSlot(i);
                if (stack == null) continue;

                final EntityItem item = new EntityItem(worldIn, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                        new ItemStack(stack.getItem(), stack.stackSize, stack.getItemDamage()));
                if (stack.getTagCompound() != null) {
                    item.getEntityItem().readFromNBT((NBTTagCompound) stack.getTagCompound().copy());
                }
                worldIn.spawnEntityInWorld(item);
            }
            worldIn.updateComparatorOutputLevel(pos, state.getBlock());
        }

        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        final TileEntity te = worldIn.getTileEntity(pos);

        if (te == null) return false;

        playerIn.openGui(HarvestCraft.instance, 1, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
}
