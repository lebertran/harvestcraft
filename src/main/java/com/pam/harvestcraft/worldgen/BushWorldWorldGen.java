package com.pam.harvestcraft.worldgen;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.blocks.gardens.BlockBaseGarden;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import static com.pam.harvestcraft.HarvestCraft.config;

public class BushWorldWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
        int xCh = chunkX * 16 + random.nextInt(16);
        int yCh = random.nextInt(128);
        int zCh = chunkZ * 16 + random.nextInt(16);

        final BiomeGenBase biome = world.getBiomeGenForCoords(new BlockPos(xChunk + 16, 0, zChunk + 16));
        final BlockPos blockPos = new BlockPos(xCh, yCh + 64, zCh);

        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DEAD)) {
            return;
        }

        if (config.enablearidgardenGeneration && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SANDY)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MESA))) {
            generateGarden(BlockRegistry.aridGardenBlock, world, blockPos);
        }

        if (config.enablefrostgardenGeneration && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))) {
            generateGarden(BlockRegistry.frostGardenBlock, world, blockPos);
        }

        if (config.enableshadedgardenGeneration && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY))) {
            generateGarden(BlockRegistry.shadedGardenBlock, world, blockPos);
        }

        if (config.enablesoggygardenGeneration && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SWAMP)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.RIVER))) {
            generateGarden(BlockRegistry.soggyGardenBlock, world, blockPos);
        }

        if (config.enabletropicalgardenGeneration && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.JUNGLE)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.OCEAN))) {
            generateGarden(BlockRegistry.tropicalGardenBlock, world, blockPos);
        }

        if (config.enablewindygardenGeneration && (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SAVANNA))) {
            generateGarden(BlockRegistry.windyGardenBlock, world, blockPos);
        }
    }

    public void generateGarden(BlockBaseGarden gardenBlock, World world, BlockPos pos) {

        final int tries = 32 * HarvestCraft.config.gardenRarity;

        for (int tryNum = 0; tryNum < tries; tryNum++) {
            int posX = (pos.getX() + world.rand.nextInt(8)) - world.rand.nextInt(8);
            int posY = (pos.getY() + world.rand.nextInt(4)) - world.rand.nextInt(4);
            int posZ = (pos.getZ() + world.rand.nextInt(8)) - world.rand.nextInt(8);

            final BlockPos newPos = new BlockPos(posX, posY, posZ);

            if (gardenBlock.canPlaceBlockAt(world, newPos)) {
                world.setBlockState(newPos, gardenBlock.getDefaultState(), 2);
            }
        }
    }

}
