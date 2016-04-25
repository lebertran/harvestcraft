package com.pam.harvestcraft.item;

import com.pam.harvestcraft.HarvestCraft;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemPamPotionFood extends ItemFood {
    public ItemPamPotionFood(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setCreativeTab(HarvestCraft.modTab);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }
}
