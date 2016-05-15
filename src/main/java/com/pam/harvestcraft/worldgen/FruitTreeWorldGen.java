package com.pam.harvestcraft.worldgen;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.blocks.growables.BlockPamFruit;
import com.pam.harvestcraft.blocks.growables.BlockPamLogFruit;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;
import static com.pam.harvestcraft.HarvestCraft.config;

import java.util.Random;

public class FruitTreeWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
        int xCh = chunkX * 16 + random.nextInt(16);
        int yCh = random.nextInt(128) + 64;
        int zCh = chunkZ * 16 + random.nextInt(16);

        final BiomeGenBase biome = world.getBiomeGenForCoords(new BlockPos(xChunk + 16, 0, zChunk + 16));
        final BlockPos blockPos = new BlockPos(xCh, yCh, zCh);

        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DEAD)) {
            return;
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST))
                && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.COLD))
                && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY))
                && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))) {
            {
                switch (random.nextInt(9)) {
                    case 0:
                        if (config.appletreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamApple);
                            break;
                        }
                    case 1:
                        if (config.avocadotreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamAvocado);
                            break;
                        }
                    case 2:
                        if (config.cherrytreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamCherry);
                            break;
                        }
                    case 3:
                        if (config.chestnuttreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamChestnut);
                            break;
                        }
                    case 4:
                        if (config.nutmegtreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamNutmeg);
                            break;
                        }
                    case 5:
                        if (config.peartreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamPear);
                            break;
                        }
                    case 6:
                        if (config.plumtreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamPlum);
                            break;
                        }
                    case 7:
                        if (config.walnuttreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamWalnut);
                            break;
                        }
                    case 8:
                        if (config.gooseberrytreeGeneration) {
                            generateFruitTree(world, blockPos, BlockRegistry.pamGooseberry);
                            break;
                        }
                }
            }
        }

        if ( (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.PLAINS)) && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY))
        && ( BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.HOT) || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WET)) ) ) {
            switch (random.nextInt(25)) {
                case 0:
                    if (config.bananatreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamBanana);
                        break;
                    }
                case 1:
                    if (config.cinnamontreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamCinnamon);
                        break;
                    }
                case 2:
                    if (config.coconuttreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamCoconut);
                        break;
                    }
                case 3:
                    if (config.datetreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamDate);
                        break;
                    }
                case 4:
                    if (config.dragonfruittreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamDragonfruit);
                        break;
                    }
                case 5:
                    if (config.papayatreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPapaya);
                        break;
                    }
                case 6:
                    if (config.almondtreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamAlmond);
                        break;
                    }
                case 7:
                    if (config.apricottreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamApricot);
                        break;
                    }
                case 8:
                    if (config.cashewtreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamCashew);
                        break;
                    }
                case 9:
                    if (config.duriantreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamDurian);
                        break;
                    }
                case 10:
                    if (config.figtreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamFig);
                        break;
                    }
                case 11:
                    if (config.grapefruittreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamGrapefruit);
                        break;
                    }
                case 12:
                    if (config.lemontreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamLemon);
                        break;
                    }
                case 13:
                    if (config.limetreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamLime);
                        break;
                    }
                case 14:
                    if (config.mangotreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamMango);
                        break;
                    }
                case 15:
                    if (config.orangetreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamOrange);
                        break;
                    }
                case 16:
                    if (config.paperbarktreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPaperbark);
                        break;
                    }
                case 17:
                    if (config.peachtreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPeach);
                        break;
                    }
                case 18:
                    if (config.pecantreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPecan);
                        break;
                    }
                case 19:
                    if (config.peppercorntreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPeppercorn);
                        break;
                    }
                case 20:
                    if (config.persimmontreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPersimmon);
                        break;
                    }
                case 21:
                    if (config.pistachiotreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPistachio);
                        break;
                    }
                case 22:
                    if (config.pomegranatetreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamPomegranate);
                        break;
                    }
                case 23:
                    if (config.starfruittreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamStarfruit);
                        break;
                    }
                case 24:
                    if (config.vanillabeantreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamVanillabean);
                        break;
                    }
                case 25:
                    if (config.olivetreeGeneration) {
                        generateFruitTree(world, blockPos, BlockRegistry.pamOlive);
                    }
            }
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.CONIFEROUS))) {
            if (config.mapletreeGeneration) {
                generateFruitTree(world, blockPos, BlockRegistry.pamMaple);
            }
        }

    }

    public void generateFruitTree(World world, BlockPos pos, BlockPamFruit fruitBlock) {
        int posX = (pos.getX() + world.rand.nextInt(8)) - world.rand.nextInt(8);
        int posY = (pos.getY() + world.rand.nextInt(4)) - world.rand.nextInt(4);
        int posZ = (pos.getZ() + world.rand.nextInt(8)) - world.rand.nextInt(8);
        final BlockPos newPos = new BlockPos(posX, posY, posZ);

        fruitBlock.getSapling().generateTree(world, newPos, world.getBlockState(newPos), world.rand);
    }

    public void generateFruitTree(World world, BlockPos pos, BlockPamLogFruit fruitBlock) {
        int posX = (pos.getX() + world.rand.nextInt(8)) - world.rand.nextInt(8);
        int posY = (pos.getY() + world.rand.nextInt(4)) - world.rand.nextInt(4);
        int posZ = (pos.getZ() + world.rand.nextInt(8)) - world.rand.nextInt(8);
        final BlockPos newPos = new BlockPos(posX, posY, posZ);

        fruitBlock.getSapling().generateTree(world, newPos, world.getBlockState(newPos), world.rand);
    }
}

