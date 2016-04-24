package com.pam.harvestcraft.blocks;

import java.util.Random;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.worldgen.FruitTreeGen;
import com.pam.harvestcraft.worldgen.LogFruitTreeGen;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPamSapling extends BlockBush implements IGrowable
{

	public String name;
	
	public BlockPamSapling(String name)
	{
		super();
		//@TODO: necessary?
		//this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.8F, 0.9F);
		this.setCreativeTab(HarvestCraft.modTab);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		this.setStepSound(SoundType.PLANT);
		this.setHardness(0.0F);

	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos)
	{
		Block soilBlock = world.getBlockState(pos.down()).getBlock();

		return this.isSuitableSoilBlock(soilBlock);
	}

	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		this.validatePosition(world, pos, state);
	}

	public void validatePosition(World world, BlockPos pos, IBlockState state)
	{
		if (!this.canPlaceBlockAt(world, pos))
		{
			this.dropBlockAsItem(world, pos, state, 0);

			world.setBlockToAir(pos);
		}
	}

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState worldIn, World pos, BlockPos state) {
        return null;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

	public boolean isSuitableSoilBlock(Block soilBlock)
	{
		return soilBlock == Blocks.grass || soilBlock == Blocks.dirt || soilBlock == Blocks.farmland;
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (!worldIn.isRemote)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
			{
				this.grow(worldIn, pos, state, rand);
			}
		}
	}

	public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		this.generateTree(worldIn, pos, state, rand);
	}

	public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) 
	{
		if (this == BlockRegistry.pamappleSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamApple.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamavocadoSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamAvocado.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamcherrySapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamCherry.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamchestnutSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamChestnut.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamnutmegSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamNutmeg.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampearSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPear.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamplumSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPlum.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamwalnutSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamWalnut.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamgooseberrySapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamGooseberry.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		
		if (this == BlockRegistry.pamalmondSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamAlmond.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamapricotSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamApricot.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pambananaSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamBanana.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamcashewSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamCashew.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamcoconutSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamCoconut.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamdateSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamDate.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamdragonfruitSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamDragonfruit.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamdurianSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamDurian.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamfigSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamFig.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamgrapefruitSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamGrapefruit.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamlemonSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamLemon.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamlimeSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamLime.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pammangoSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamMango.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamoliveSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamOlive.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamorangeSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamOrange.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampapayaSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPapaya.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampeachSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPeach.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampecanSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPecan.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampeppercornSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPeppercorn.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampersimmonSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPersimmon.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampistachioSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPistachio.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampomegranateSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPomegranate.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamstarfruitSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamStarfruit.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamvanillabeanSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamVanillabean.getDefaultState();
			if(!new FruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pamcinnamonSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamCinnamon.getDefaultState();
			if(!new LogFruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pammapleSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamMaple.getDefaultState();
			if(!new LogFruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
		if (this == BlockRegistry.pampaperbarkSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) 
			{
				return;
			}
			worldIn.setBlockToAir(pos);
			final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
			final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
			final IBlockState c = BlockRegistry.pamPaperbark.getDefaultState();
			if(!new LogFruitTreeGen(true, 5, a, b, false, c).generate(worldIn, rand, pos))
			{
				worldIn.setBlockState(pos, state); //Re-add the sapling if the tree failed to grow
			}
		}
    }


	/**
	 * Whether this IGrowable can grow
	 */
	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	{
		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		return worldIn.rand.nextFloat() < 0.45D;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		this.grow(worldIn, pos, state, rand);
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }


}