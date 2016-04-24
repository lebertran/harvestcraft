package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AridGardenBlock extends BlockBaseGarden
{
	private final String name = "aridgarden";

	public AridGardenBlock()
	{	
		super("aridGarden", Material.grass);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		setCreativeTab(HarvestCraft.modTab);
	}
	
	//@SideOnly(Side.CLIENT)
    //public void initModel() {
    //    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    //}
	
	protected boolean canPlaceBlockOn(Block ground) {
        return ground == Blocks.sand;
    }
	
	public String getName() {
		return name;
	}
	
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        return net.minecraftforge.common.EnumPlantType.Desert;
    }

    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}