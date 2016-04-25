package com.pam.harvestcraft.worldgen;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class LogFruitTreeWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
        int xCh = chunkX * 16 + random.nextInt(16);
        int yCh = random.nextInt(128);
        int zCh = chunkZ * 16 + random.nextInt(16);

        BiomeGenBase biome = world.getBiomeGenForCoords(new BlockPos(xChunk + 16, 0, zChunk + 16));

        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DEAD)) {
            return;
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SANDY)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MESA))) {
            this.generateAridGarden(world, random, xCh, yCh + 64, zCh);
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))) {
            this.generateFrostGarden(world, random, xCh, yCh + 64, zCh);
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY))) {
            this.generateShadedGarden(world, random, xCh, yCh + 64, zCh);
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SWAMP)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.RIVER))) {
            this.generateSoggyGarden(world, random, xCh, yCh + 64, zCh);
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.JUNGLE)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.OCEAN))) {
            this.generateTropicalGarden(world, random, xCh, yCh + 64, zCh);
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SAVANNA))) {
            this.generateWindyGarden(world, random, xCh, yCh + 64, zCh);
        }


    }

    public boolean generateAridGarden(World world, Random random, int x, int y, int z) {
        for (int tries = 0; tries < 32; tries++) {
            int posX = (x + random.nextInt(8)) - random.nextInt(8);
            int posY = (y + random.nextInt(4)) - random.nextInt(4);
            int posZ = (z + random.nextInt(8)) - random.nextInt(8);
            BlockPos pos = new BlockPos(posX, posY, posZ);
            if (world.isAirBlock(pos) && Blocks.cactus.canBlockStay(world, pos)) {
                world.setBlockState(pos, BlockRegistry.AridGardenBlock.getDefaultState(), 2);
            }
        }

        return true;
    }

    public boolean generateFrostGarden(World world, Random random, int x, int y, int z) {
        for (int tries = 0; tries < 32; tries++) {
            int posX = (x + random.nextInt(8)) - random.nextInt(8);
            int posY = (y + random.nextInt(4)) - random.nextInt(4);
            int posZ = (z + random.nextInt(8)) - random.nextInt(8);
            BlockPos pos = new BlockPos(posX, posY, posZ);
            if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                world.setBlockState(pos, BlockRegistry.FrostGardenBlock.getDefaultState(), 2);
            }
        }

        return true;
    }

    public boolean generateShadedGarden(World world, Random random, int x, int y, int z) {
        for (int tries = 0; tries < 32; tries++) {
            int posX = (x + random.nextInt(8)) - random.nextInt(8);
            int posY = (y + random.nextInt(4)) - random.nextInt(4);
            int posZ = (z + random.nextInt(8)) - random.nextInt(8);
            BlockPos pos = new BlockPos(posX, posY, posZ);
            if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                world.setBlockState(pos, BlockRegistry.ShadedGardenBlock.getDefaultState(), 2);
            }
        }

        return true;
    }

    public boolean generateSoggyGarden(World world, Random random, int x, int y, int z) {
        for (int tries = 0; tries < 32; tries++) {
            int posX = (x + random.nextInt(8)) - random.nextInt(8);
            int posY = (y + random.nextInt(4)) - random.nextInt(4);
            int posZ = (z + random.nextInt(8)) - random.nextInt(8);
            BlockPos pos = new BlockPos(posX, posY, posZ);
            if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                world.setBlockState(pos, BlockRegistry.SoggyGardenBlock.getDefaultState(), 2);
            }
        }

        return true;
    }

    public boolean generateTropicalGarden(World world, Random random, int x, int y, int z) {
        for (int tries = 0; tries < 32; tries++) {
            int posX = (x + random.nextInt(8)) - random.nextInt(8);
            int posY = (y + random.nextInt(4)) - random.nextInt(4);
            int posZ = (z + random.nextInt(8)) - random.nextInt(8);
            BlockPos pos = new BlockPos(posX, posY, posZ);
            if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                world.setBlockState(pos, BlockRegistry.TropicalGardenBlock.getDefaultState(), 2);
            }
        }

        return true;
    }

    public boolean generateWindyGarden(World world, Random random, int x, int y, int z) {
        for (int tries = 0; tries < 32; tries++) {
            int posX = (x + random.nextInt(8)) - random.nextInt(8);
            int posY = (y + random.nextInt(4)) - random.nextInt(4);
            int posZ = (z + random.nextInt(8)) - random.nextInt(8);
            BlockPos pos = new BlockPos(posX, posY, posZ);
            if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                world.setBlockState(pos, BlockRegistry.WindyGardenBlock.getDefaultState(), 2);
            }
        }

        return true;
    }

}

