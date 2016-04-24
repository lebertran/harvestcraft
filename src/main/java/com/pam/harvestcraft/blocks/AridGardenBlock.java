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
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AridGardenBlock extends BlockBaseGarden
{
	private final String name = "aridgarden";

	public AridGardenBlock()
	{	
		super("aridGarden", Material.grass);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		setCreativeTab(harvestcraft.modTab);
	}
	
	//@SideOnly(Side.CLIENT)
    //public void initModel() {
    //    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    //}
	
	@Override
	protected boolean canPlaceBlockOn(Block ground)
    {
        return ground == Blocks.sand;
    }
	
	public String getName()
	{
		return name;
	}
	
	@Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return net.minecraftforge.common.EnumPlantType.Desert;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}