package com.pam.harvestcraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPamTool extends Item
{
	public ItemPamTool()
	{
		setMaxStackSize(1);
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
	{
		return false;
	}
}