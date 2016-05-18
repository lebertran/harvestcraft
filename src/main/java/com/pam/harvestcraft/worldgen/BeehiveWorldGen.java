package com.pam.harvestcraft.worldgen;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class BeehiveWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (!HarvestCraft.config.enableBeehiveGeneration) return;

        final BiomeGenBase biome = world.getBiomeGenForCoords(new BlockPos(chunkX, 0, chunkZ));

        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.END) || BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.NETHER)) {
            return;
        }

        tryGenerateBeehives(world, random, chunkX * 16, chunkZ * 16);
    }

    private static void tryGenerateBeehives(World world, Random random, int chunkX, int chunkZ) {
        final BlockPos.MutableBlockPos variableBlockPos = new BlockPos.MutableBlockPos();

        for (int i = 0; i < HarvestCraft.config.beehiveRarity; ++i) {
            int x = chunkX + random.nextInt(16);
            int y = random.nextInt(128) - 1;
            int z = chunkZ + random.nextInt(16);
            variableBlockPos.set(x, y, z);

            if (!isBlockLeaves(world, variableBlockPos)) continue;

            int newY = getHeightBelowLeaves(world, x, y, z);

            if (newY < 0) continue;

            variableBlockPos.setY(newY);
            world.setBlockState(variableBlockPos, BlockRegistry.beehive.getDefaultState());
        }
    }

    private static boolean isBlockLeaves(World world, BlockPos blockPos) {
        final Block block = world.getBlockState(blockPos).getBlock();

        return block == Blocks.leaves || block == Blocks.leaves2;
    }

    private static int getHeightBelowLeaves(World world, int posX, int posY, int posZ) {
        final BlockPos.MutableBlockPos variableBlockPos = new BlockPos.MutableBlockPos();
        variableBlockPos.set(posX, posY, posZ);

        // Starting from a known leaves block, descend until air block is reached.
        // If another block is reached (non-leaves, non-air), abort and return -1.
        for (int y = posY, sealevel = world.getSeaLevel(); y >= sealevel; --y) {
            variableBlockPos.setY(y);
            final Block block = world.getBlockState(variableBlockPos).getBlock();

            if (block == Blocks.leaves || block == Blocks.leaves2) continue;

            if (world.isAirBlock(variableBlockPos)) return y;

            return -1;
        }
        return -1;
    }

}
