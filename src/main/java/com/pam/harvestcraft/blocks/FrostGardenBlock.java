package com.pam.harvestcraft.blocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;
import com.pam.harvestcraft.Reference;
import com.pam.harvestcraft.harvestcraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FrostGardenBlock extends BlockBaseGarden
{
	private final String name = "frostgarden";
	public static List<ItemStack> drops;
	
	public FrostGardenBlock()
	{	
		super("frostGarden", Material.grass);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		setCreativeTab(harvestcraft.modTab);
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block ground)
    {
        return ground == Blocks.grass;
    }
	
	public String getName()
	{
		return name;
	}
	
	@Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return net.minecraftforge.common.EnumPlantType.Plains;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}