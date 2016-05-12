package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentity.TileEntityMarket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerMarket extends Container {
    public ContainerMarket(IInventory par1IInventory, TileEntityMarket tileEntity) {
        tileEntity.getSizeInventory();

        addSlotToContainer(new Slot(tileEntity, 0, 113, 38));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(par1IInventory, j + i * 9 + 9, j * 18 + 8, i * 18 + 95));
            }
        }

        for (int i = 0; i < 9; i++) {
            addSlotToContainer(new Slot(par1IInventory, i, i * 18 + 8, 153));
        }
    }

    public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int slotIndex) {
        ItemStack itemStack = null;
        Slot slot = (Slot) this.inventorySlots.get(slotIndex);
        if ((slot != null) && (slot.getHasStack())) {
            ItemStack slotStack = slot.getStack();
            itemStack = slotStack.copy();

            if (slotIndex >= 1) {
                if (slotStack.getItem() == net.minecraft.init.Items.emerald) {
                    if (!mergeItemStack(slotStack, 0, 1, false)) {
                        return null;
                    }
                } else if ((slotIndex >= 1) && (slotIndex < 28)) {
                    if (!mergeItemStack(slotStack, 27, 37, false)) {
                        return null;
                    }
                } else if ((slotIndex >= 1) && (slotIndex < 37) && (!mergeItemStack(slotStack, 1, 28, false))) {
                    return null;
                }
            } else if (!mergeItemStack(slotStack, 1, 37, false)) {
                return null;
            }

            if (slotStack.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }

            if (slotStack.stackSize == itemStack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(entityPlayer, slotStack);
        }

        return itemStack;
    }


    public void onContainerClosed(EntityPlayer par1EntityPlayer) {
        super.onContainerClosed(par1EntityPlayer);
    }
}
