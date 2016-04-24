package com.pam.harvestcraft.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockSaplings extends ItemBlockVariants
{
	public ItemBlockSaplings(Block block)
	{
		super(block);
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack)
	{
		return ("" + StatCollector.translateToLocal("harvestcraft." + this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		switch (stack.getItemDamage())
		{
		case 0:
			//list.add(StatCollector.translateToLocal("Apple Sapling"));
			break;
		
		}
	}
}
