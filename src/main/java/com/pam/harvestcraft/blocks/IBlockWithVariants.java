package com.pam.harvestcraft.blocks;

import net.minecraft.item.ItemStack;

public interface IBlockWithVariants {
    String getVariantUnlocalizedName(ItemStack stack);
}
