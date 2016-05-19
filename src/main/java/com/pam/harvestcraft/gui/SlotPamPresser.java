package com.pam.harvestcraft.gui;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPamPresser extends Slot {
    public SlotPamPresser(IInventory inventory, int index, int xPos, int yPos) {
        super(inventory, index, xPos, yPos);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return true;
    }
}
