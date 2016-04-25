package com.pam.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;

public class ItemBlockSaplings extends ItemBlockVariants {
    public ItemBlockSaplings(Block block) {
        super(block);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return ("" + I18n.translateToLocal("harvestcraft." + this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }
}
