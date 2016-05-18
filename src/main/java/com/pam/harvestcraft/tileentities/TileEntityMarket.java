package com.pam.harvestcraft.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class TileEntityMarket extends TileEntity implements IInventory {
    public int stockNum = 0;
    private ItemStack paySlot = null;

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        if (this.paySlot != null) {
            ItemStack var2 = this.paySlot;
            this.paySlot = null;
            return var2;
        }
        return null;
    }

    @Override
    public String getName() {
        return "Market";
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void closeInventory(EntityPlayer player) {}

    @Override
    public void clear() {}

    @Override
    public ITextComponent getDisplayName() {
        return new TextComponentString("Market");
    }

    @Override
    public void openInventory(EntityPlayer player) {}

    @Override
    public void setField(int id, int value) {}

    @Override
    public int getSizeInventory() {
        return 1;
    }

    @Override
    public ItemStack getStackInSlot(int par1) {
        return paySlot;
    }

    @Override
    public ItemStack decrStackSize(int par1, int par2) {
        if (this.paySlot != null) {
            ItemStack var3;

            if (this.paySlot.stackSize <= par2) {
                var3 = this.paySlot;
                this.paySlot = null;
                this.markDirty();
                return var3;
            }
            var3 = this.paySlot.splitStack(par2);

            if (this.paySlot.stackSize == 0) {
                this.paySlot = null;
            }

            this.markDirty();
            return var3;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
        this.paySlot = par2ItemStack;

        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }

        this.markDirty();
    }

    public void takeCurrencyFromSlot(int price) {
        if (this.paySlot != null) {
            this.paySlot.stackSize -= price;
        }
        this.markDirty();
    }

    public void clearInventory() {
        this.paySlot = null;
    }

    @Override
    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        this.stockNum = par1NBTTagCompound.getInteger("StockNum");
    }

    @Override
    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("StockNum", stockNum);
    }

    public int getBrowsingInfo() {
        return stockNum;
    }

    public void setBrowsingInfo(int stockNum) {
        this.stockNum = stockNum;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
        return worldObj.getTileEntity(getPos()) == this
                && par1EntityPlayer.getDistanceSq(getPos().getX() + 0.5D, getPos().getY() + 0.5D, getPos().getZ() + 0.5D) <= 64.0D;
    }

    @Override
    public void invalidate() {
        updateContainingBlockInfo();
        super.invalidate();
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return false;
    }
}