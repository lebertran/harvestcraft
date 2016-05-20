package com.pam.harvestcraft.tileentities;

import com.pam.harvestcraft.item.PresserRecipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityPresser extends TileEntity implements IInventory, ITickable {

    private ItemStack[] inventory = new ItemStack[3];
    public short cookTime;


    @Override
    public int getSizeInventory() {
        return inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return inventory[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if (inventory[index] != null) {
            if (inventory[index].stackSize <= count) {
                final ItemStack itemStack = inventory[index];
                inventory[index] = null;
                return itemStack;
            }

            final ItemStack itemStack = inventory[index].splitStack(count);
            if (inventory[index].stackSize == 0) {
                inventory[index] = null;
            }
            return itemStack;
        }

        return null;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        inventory[index] = stack;

        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public String getName() {
        return "Presser";
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TextComponentString(getName());
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);

        final NBTTagList tagList = compound.getTagList("Items", 10);
        inventory = new ItemStack[getSizeInventory()];

        for (int i = 0; i < tagList.tagCount(); ++i) {
            final NBTTagCompound stackTag = tagList.getCompoundTagAt(i);
            final byte slot = stackTag.getByte("Slot");

            if (slot < 0 || slot >= inventory.length) continue;
            inventory[slot] = ItemStack.loadItemStackFromNBT(stackTag);
        }

        cookTime = compound.getShort("CookTime");
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        compound.setShort("CookTime", cookTime);

        final NBTTagList tagList = new NBTTagList();
        for (int i = 0; i < inventory.length; ++i) {
            if (inventory[i] == null) continue;

            final NBTTagCompound stackTag = new NBTTagCompound();
            stackTag.setByte("Slot", (byte) i);
            inventory[i].writeToNBT(stackTag);
            tagList.appendTag(stackTag);
        }
        compound.setTag("Items", tagList);
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @SideOnly(value = Side.CLIENT)
    public int getCookProgressScaled(int scale) {
        return cookTime * scale / 125;
    }
    
    @Override
    public void update() {
        boolean needsUpdate = false;

        if (worldObj.isRemote) return;

        if (canRun()) {
            ++cookTime;

            if (cookTime >= 125) {
                cookTime = 0;
                pressComb();
                needsUpdate = true;
            }
        } else {
            cookTime = 0;
        }

        if (needsUpdate != cookTime > 0) {
            needsUpdate = true;
        }

        if (needsUpdate) {
            markDirty();
            worldObj.notifyBlockUpdate(pos, worldObj.getBlockState(pos), worldObj.getBlockState(pos), 3);
        }
    }

    private boolean canRun() {
        if (inventory[0] == null) return false;

        final ItemStack[] results = PresserRecipes.getPressingResult(inventory[0]);
        if (results == null) return false;

        if (inventory[1] != null) {
            if (!inventory[1].isItemEqual(results[0])) return false;
            if (inventory[1].stackSize + results[0].stackSize > inventory[1].getMaxStackSize()) return false;
        }

        if (results[1] != null && inventory[2] != null) {
            if (!inventory[2].isItemEqual(results[1])) return false;
            if (inventory[2].stackSize + results[1].stackSize > inventory[2].getMaxStackSize()) return false;
        }

        return true;
    }

    public void pressComb() {
        if (!canRun()) return;

        final ItemStack[] results = PresserRecipes.getPressingResult(inventory[0]);
        if (results == null) return;

        if (inventory[1] == null) {
            inventory[1] = results[0].copy();
        } else if (inventory[1].stackSize + results[0].stackSize <= results[0].getMaxStackSize()) {
            inventory[1].stackSize += results[0].stackSize;
        }

        if (results[1] != null) {
            if (inventory[2] == null) {
                inventory[2] = results[1].copy();
            } else if (inventory[2].isItemEqual(results[1])) {
                inventory[2].stackSize += results[1].stackSize;
            }
        }

        --inventory[0].stackSize;
        if (inventory[0].stackSize <= 0) {
            inventory[0] = null;
        }
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        if (worldObj.getTileEntity(getPos()) != this) return false;

        return player.getDistanceSq(getPos()) <= 64;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {}

    @Override
    public int getFieldCount() {return 0;}

    @Override
    public void clear() {}

    @Override
    public Packet<?> getDescriptionPacket() {
        NBTTagCompound tag = new NBTTagCompound();
        writeToNBT(tag);

        return new SPacketUpdateTileEntity(getPos(), 1, tag);
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }
}
