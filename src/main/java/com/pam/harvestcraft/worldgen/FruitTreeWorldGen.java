package com.pam.harvestcraft.worldgen;

import java.util.Random;

import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class FruitTreeWorldGen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
		int xCh = chunkX * 16 + random.nextInt(16);
		int yCh = random.nextInt(128);
		int zCh = chunkZ * 16 + random.nextInt(16);

		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenerator(new BlockPos(xChunk + 16, 0, zChunk + 16));

		if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DEAD)) 
		{
			return;
		}

		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.COLD)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN)))		
		{
			{
				switch (random.nextInt(9))
				{
				case 0: 
				if (BlockRegistry.appletreeGeneration)
				{
					this.generateAppleTree(world, random, xCh, yCh + 64, zCh);
				}
				case 1: 
				if (BlockRegistry.avocadotreeGeneration)
				{
					this.generateAvocadoTree(world, random, xCh, yCh + 64, zCh);
				}
				case 2: 
				if (BlockRegistry.cherrytreeGeneration)
				{
					this.generateCherryTree(world, random, xCh, yCh + 64, zCh);
				}
				case 3: 
				if (BlockRegistry.chestnuttreeGeneration)
				{
					this.generateChestnutTree(world, random, xCh, yCh + 64, zCh);
				}
				case 4: 
				if (BlockRegistry.nutmegtreeGeneration)
				{
					this.generateNutmegTree(world, random, xCh, yCh + 64, zCh);
				}
				case 5: 
				if (BlockRegistry.peartreeGeneration)
				{
					this.generatePearTree(world, random, xCh, yCh + 64, zCh);
				}
				case 6: 
				if (BlockRegistry.plumtreeGeneration)
				{
					this.generatePlumTree(world, random, xCh, yCh + 64, zCh);
				}
				case 7: 
					if (BlockRegistry.walnuttreeGeneration)
					{
						this.generateWalnutTree(world, random, xCh, yCh + 64, zCh);
					}
				case 8: 
				if (BlockRegistry.gooseberrytreeGeneration)
				{
					this.generateGooseberryTree(world, random, xCh, yCh + 64, zCh);
				}
				break;
				}
			}
		}
		
		if (((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WET)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) 
				&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY))) 
				|| ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.HOT)) 
						&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) 
						&& (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY))))
		{
			{
				switch (random.nextInt(24))
				{
				case 0: 
				if (BlockRegistry.bananatreeGeneration)
				  {
					this.generateBananaTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 1: 
				if (BlockRegistry.cinnamontreeGeneration)
				  {
					this.generateCinnamonTree(world, random, xCh, yCh + 64, zCh);				  
					}
				case 2: 
				if (BlockRegistry.coconuttreeGeneration)
				  {
					this.generateCoconutTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 3: 
				if (BlockRegistry.datetreeGeneration)
				  {
					this.generateDateTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 4: 
				if (BlockRegistry.dragonfruittreeGeneration)
				  {
					this.generateDragonfruitTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 5: 
				if (BlockRegistry.papayatreeGeneration)
				  {
					this.generatePapayaTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 6: 
				if (BlockRegistry.almondtreeGeneration)
				  {
					this.generateAlmondTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 7: 
				if (BlockRegistry.apricottreeGeneration)
				  {
					this.generateApricotTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 8: 
				if (BlockRegistry.cashewtreeGeneration)
				  {
					this.generateCashewTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 9: 
				if (BlockRegistry.duriantreeGeneration)
				  {
					this.generateDurianTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 10: 
				if (BlockRegistry.figtreeGeneration)
				  {
					this.generateFigTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 11: 
				if (BlockRegistry.grapefruittreeGeneration)
				  {
					this.generateGrapefruitTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 12: 
				if (BlockRegistry.lemontreeGeneration)
				  {
					this.generateLemonTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 13: 
				if (BlockRegistry.limetreeGeneration)
				  {
					this.generateLimeTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 14: 
				if (BlockRegistry.mangotreeGeneration)
				  {
					this.generateMangoTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 15: 
				if (BlockRegistry.orangetreeGeneration)
				  {
					this.generateOrangeTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 16: 
				if (BlockRegistry.paperbarktreeGeneration)
				  {
					this.generatePaperbarkTree(world, random, xCh, yCh + 64, zCh);
					}
				case 17: 
				if (BlockRegistry.peachtreeGeneration)
				  {
					this.generatePeachTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 18: 
				if (BlockRegistry.pecantreeGeneration)
				  {
					this.generatePecanTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 19: 
				if (BlockRegistry.peppercorntreeGeneration)
				  {
					this.generatePeppercornTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 20: 
				if (BlockRegistry.persimmontreeGeneration)
				  {
					this.generatePersimmonTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 21: 
				if (BlockRegistry.pistachiotreeGeneration)
				  {
					this.generatePistachioTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 22: 
				if (BlockRegistry.pomegranatetreeGeneration)
				  {
					this.generatePomegranateTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 23: 
				if (BlockRegistry.starfruittreeGeneration)
				  {
					this.generateStarfruitTree(world, random, xCh, yCh + 64, zCh);
				  }
				case 24: 
				if (BlockRegistry.vanillabeantreeGeneration)
				  {
					this.generateVanillabeanTree(world, random, xCh, yCh + 64, zCh);
				  }
				  
				  break;
				}
			}
		}
		
		if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY)) 
				|| (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))
				|| (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.CONIFEROUS)))
		{
			this.generateMapleTree(world, random, xCh, yCh + 64, zCh);
		}
	
	}

	public boolean generateAppleTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamApple.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateAvocadoTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamAvocado.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateCherryTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamCherry.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateChestnutTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamChestnut.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateNutmegTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamNutmeg.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePearTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPear.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePlumTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPlum.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateWalnutTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamWalnut.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateGooseberryTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamGooseberry.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateAlmondTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamAlmond.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateApricotTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamApricot.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateBananaTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamBanana.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateCashewTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamCashew.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateCoconutTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamCoconut.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateDateTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamDate.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateDragonfruitTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamDragonfruit.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateDurianTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamDurian.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateFigTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamFig.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateGrapefruitTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamGrapefruit.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateLemonTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamLemon.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateLimeTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamLime.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateMangoTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamMango.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateOliveTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamOlive.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateOrangeTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamOrange.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePapayaTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPapaya.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePeachTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPeach.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePecanTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPecan.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePeppercornTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPeppercorn.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePersimmonTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPersimmon.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePistachioTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPistachio.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePomegranateTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPomegranate.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateStarfruitTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamStarfruit.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateVanillabeanTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamVanillabean.getDefaultState();

		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new FruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generateCinnamonTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamCinnamon.getDefaultState();
		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new LogFruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	
	
	public boolean generateMapleTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamMaple.getDefaultState();
		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new LogFruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
	
	public boolean generatePaperbarkTree(World world, Random random, int x, int y, int z)
	{
		final IBlockState a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
		final IBlockState b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
		final IBlockState c = BlockRegistry.pamPaperbark.getDefaultState();
		{
			for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++)
			{
				int i1 = (x + random.nextInt(8)) - random.nextInt(8);
				int j1 = (y + random.nextInt(4)) - random.nextInt(4);
				int k1 = (z + random.nextInt(8)) - random.nextInt(8);
				BlockPos pos = new BlockPos(i1, j1, k1);
				if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos)))
				{
					new LogFruitTreeGen(true, 5, a, b, false, c).generate(world, random, pos);

				}
			}
		}
		return false;
	}
}

