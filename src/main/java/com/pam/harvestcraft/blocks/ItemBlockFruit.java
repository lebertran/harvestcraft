package com.pam.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemBlockFruit extends ItemBlock
{
	public ItemBlockFruit(Block block)
	{
		super(block);
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack)
	{
		return ("" + StatCollector.translateToLocal("harvestcraft." + this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
	}
}
