package com.pam.harvestcraft.blocks.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.tileentities.TileEntityApiary;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class ApiaryBlock extends BlockContainerRotating {

    public static final String registryName = "apiary";


    public ApiaryBlock() {
        super(Material.wood);
        setStepSound(SoundType.WOOD);
        setCreativeTab(HarvestCraft.modTab);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityApiary();
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        final TileEntityApiary te;
        final Random random = worldIn.rand;

        if ((te = (TileEntityApiary)worldIn.getTileEntity(pos)) != null) {
            for (int i = 0; i < te.getSizeInventory(); ++i) {
                final ItemStack itemStack = te.getStackInSlot(i);
                if (itemStack == null) continue;

                float f = random.nextFloat() * 0.8f + 0.1f;
                float f1 = random.nextFloat() * 0.8f + 0.1f;
                float f2 = random.nextFloat() * 0.8f + 0.1f;

                while (itemStack.stackSize > 0) {
                    int j = Math.min(random.nextInt(21) + 10, itemStack.stackSize);

                    itemStack.stackSize -= j;
                    final EntityItem entityItem =
                            new EntityItem(worldIn, pos.getX() + f, pos.getY() + f1,
                                    pos.getZ() + f2, new ItemStack(itemStack.getItem(), j, itemStack.getItemDamage()));
                    if (itemStack.hasTagCompound()) {
                        entityItem.getEntityItem().readFromNBT((NBTTagCompound) itemStack.getTagCompound().copy());
                    }
                    float f3 = 0.05f;

                    entityItem.motionX = random.nextGaussian() * f3;
                    entityItem.motionY = random.nextGaussian() * f3 + 0.2f;
                    entityItem.motionZ = random.nextGaussian() * f3;
                    worldIn.spawnEntityInWorld(entityItem);
                }
                worldIn.updateComparatorOutputLevel(pos, worldIn.getBlockState(pos).getBlock());

                super.randomTick(worldIn, pos, state, random);
            }
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        final TileEntity tileEntity = worldIn.getTileEntity(pos);

        if (tileEntity == null) {
            return false;
        }

        playerIn.openGui(HarvestCraft.instance, 0, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
}
