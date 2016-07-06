package com.pam.harvestcraft.item.items;

import com.pam.harvestcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPamSeedFood extends ItemSeedFood {

    public final float saturation;

    public ItemPamSeedFood(int healAmount, float saturation, Block crops) {
        super(healAmount, saturation, crops, Blocks.FARMLAND);

        this.saturation = saturation;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);

        tooltip.add(Reference.getSaturationText(saturation));
    }
}
