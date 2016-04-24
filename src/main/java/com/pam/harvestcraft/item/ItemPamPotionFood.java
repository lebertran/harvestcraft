package com.pam.harvestcraft.item;

import com.pam.harvestcraft.harvestcraft;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemPamPotionFood extends ItemFood
{
	public ItemPamPotionFood(int par2, float par3, boolean par4)
	{
		super(par2, par3, par4);
		setCreativeTab(harvestcraft.modTab);
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.DRINK;
	}
}
