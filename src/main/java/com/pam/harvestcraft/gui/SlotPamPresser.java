package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.item.PresserRecipes;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPamPresser extends Slot {
    public SlotPamPresser(IInventory inventory, int index, int xPos, int yPos) {
        super(inventory, index, xPos, yPos);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        if (PresserRecipes.getPressingResult(stack) != null) return true;
        return false;
    }
}
