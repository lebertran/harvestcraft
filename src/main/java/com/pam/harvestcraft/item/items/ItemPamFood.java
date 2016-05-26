package com.pam.harvestcraft.item.items;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.Reference;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPamFood extends ItemFood {

    public final float saturation;

    public ItemPamFood(int healAmount, float saturation) {
        super(healAmount, saturation, false);

        this.saturation = saturation;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);

        tooltip.add(Reference.getSaturationText(saturation));
    }
}
