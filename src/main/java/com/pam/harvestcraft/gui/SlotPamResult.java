package com.pam.harvestcraft.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPamResult extends Slot {

    private final EntityPlayer thePlayer;
    public SlotPamResult(EntityPlayer entityPlayer, IInventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
        thePlayer = entityPlayer;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return false;
    }
}
