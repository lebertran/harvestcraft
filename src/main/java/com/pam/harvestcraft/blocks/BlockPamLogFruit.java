package com.pam.harvestcraft.blocks;

import java.util.List;
import java.util.Random;

import com.pam.harvestcraft.harvestcraft;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPamLogFruit extends Block  implements IGrowable
{

	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 2);
	
	public BlockPamLogFruit() 
	{
		super(Material.plants);
		this.setCreativeTab(harvestcraft.modTab);
		this.setHardness(5);
		this.setTickRandomly(true);
		this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
	}

	
	
	
	public int quantityDropped(Random random)
    {
        return 0;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	}


	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((Integer) state.getValue(AGE)).intValue();
	}

	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] { AGE });
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		int i = ((Integer) state.getValue(AGE)).intValue();

		if (i < 2 && rand.nextInt(25) == 0)
		{
			state = state.withProperty(AGE, Integer.valueOf(i + 1));
			worldIn.setBlockState(pos, state, 2);
		}

		super.updateTick(worldIn, pos, state, rand);
	}

	public void grow(World worldIn, BlockPos pos, IBlockState state)
	{
		int i = ((Integer) state.getValue(AGE)).intValue() + MathHelper.getRandomIntegerInRange(worldIn.rand, 2, 5);
		if (i > 2)
		{
			i = 2;
		}
		worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i)), 2);
	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	{
		return ((Integer) state.getValue(AGE)).intValue() < 2;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		return true;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		this.grow(worldIn, pos, state);
	}
	

	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if (((Integer) state.getValue(AGE)).intValue() == 2)
		{
			if (worldIn.isRemote)
			{
				return true;
			}
			
			ItemStack savedStack;
			
			Block currentBlock = worldIn.getBlockState(pos).getBlock();
			 
            if(currentBlock == BlockRegistry.pamCinnamon){
                savedStack = new ItemStack(Items.apple);
            }
            if(currentBlock == BlockRegistry.pamMaple){
                savedStack = new ItemStack(Items.apple);
            }
            if(currentBlock == BlockRegistry.pamPaperbark){
                savedStack = new ItemStack(Items.paper);
            }
            else
                savedStack = new ItemStack(Items.wheat);
 
            
            worldIn.setBlockState(pos, state.withProperty(AGE, 0), 3);
            EntityItem entityItem = new EntityItem(worldIn, playerIn.posX, playerIn.posY - 1D, playerIn.posZ, savedStack);
			worldIn.spawnEntityInWorld(entityItem);
			entityItem.onCollideWithPlayer(playerIn);
			return true;
		}
		return false;
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		list.add(new ItemStack(itemIn, 1, 0));
		list.add(new ItemStack(itemIn, 1, 1));
		list.add(new ItemStack(itemIn, 1, 2));
	}

	
}
