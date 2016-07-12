package com.pam.harvestcraft.worldgen;

import com.pam.harvestcraft.blocks.Fruit;
import com.pam.harvestcraft.blocks.FruitLog;
import com.pam.harvestcraft.blocks.growables.BlockPamSapling;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import static com.pam.harvestcraft.HarvestCraft.config;

public class FruitTreeWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
        final int xCh = chunkX * 16 + random.nextInt(16);
        final int yCh = random.nextInt(128) + 64;
        final int zCh = chunkZ * 16 + random.nextInt(16);

        final Biome biome = world.getBiome(new BlockPos(xChunk + 16, 0, zChunk + 16));
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
                            generateFruitTree(world, blockPos, Fruit.APPLE);
                            break;
                        }
                    case 1:
                        if (config.avocadotreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.AVOCADO);
                            break;
                        }
                    case 2:
                        if (config.cherrytreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.CHERRY);
                            break;
                        }
                    case 3:
                        if (config.chestnuttreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.CHESTNUT);
                            break;
                        }
                    case 4:
                        if (config.nutmegtreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.NUTMEG);
                            break;
                        }
                    case 5:
                        if (config.peartreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.PEAR);
                            break;
                        }
                    case 6:
                        if (config.plumtreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.PLUM);
                            break;
                        }
                    case 7:
                        if (config.walnuttreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.WALNUT);
                            break;
                        }
                    case 8:
                        if (config.gooseberrytreeGeneration) {
                            generateFruitTree(world, blockPos, Fruit.GOOSEBERRY);
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
                        generateFruitTree(world, blockPos, Fruit.BANANA);
                        break;
                    }
                case 1:
                    if (config.cinnamontreeGeneration) {
                        generateFruitTree(world, blockPos, FruitLog.CINNAMON);
                        break;
                    }
                case 2:
                    if (config.coconuttreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.COCONUT);
                        break;
                    }
                case 3:
                    if (config.datetreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.DATE);
                        break;
                    }
                case 4:
                    if (config.dragonfruittreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.DRAGONFRUIT);
                        break;
                    }
                case 5:
                    if (config.papayatreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.PAPAYA);
                        break;
                    }
                case 6:
                    if (config.almondtreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.ALMOND);
                        break;
                    }
                case 7:
                    if (config.apricottreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.APRICOT);
                        break;
                    }
                case 8:
                    if (config.cashewtreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.CASHEW);
                        break;
                    }
                case 9:
                    if (config.duriantreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.DURIAN);
                        break;
                    }
                case 10:
                    if (config.figtreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.FIG);
                        break;
                    }
                case 11:
                    if (config.grapefruittreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.GRAPEFRUIT);
                        break;
                    }
                case 12:
                    if (config.lemontreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.LEMON);
                        break;
                    }
                case 13:
                    if (config.limetreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.LIME);
                        break;
                    }
                case 14:
                    if (config.mangotreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.MANGO);
                        break;
                    }
                case 15:
                    if (config.orangetreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.ORANGE);
                        break;
                    }
                case 16:
                    if (config.paperbarktreeGeneration) {
                        generateFruitTree(world, blockPos, FruitLog.PAPERBARK);
                        break;
                    }
                case 17:
                    if (config.peachtreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.PEACH);
                        break;
                    }
                case 18:
                    if (config.pecantreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.PECAN);
                        break;
                    }
                case 19:
                    if (config.peppercorntreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.PEPPERCORN);
                        break;
                    }
                case 20:
                    if (config.persimmontreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.PERSIMMON);
                        break;
                    }
                case 21:
                    if (config.pistachiotreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.PISTACHIO);
                        break;
                    }
                case 22:
                    if (config.pomegranatetreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.POMEGRANATE);
                        break;
                    }
                case 23:
                    if (config.starfruittreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.STARFRUIT);
                        break;
                    }
                case 24:
                    if (config.vanillabeantreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.VANILLABEAN);
                        break;
                    }
                case 25:
                    if (config.olivetreeGeneration) {
                        generateFruitTree(world, blockPos, Fruit.OLIVE);
                    }
            }
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.CONIFEROUS))) {
            if (config.mapletreeGeneration) {
                generateFruitTree(world, blockPos, FruitLog.MAPLE);
            }
        }

    }

    private void generateFruitTree(World world, BlockPos pos, Fruit fruit) {
        final BlockPamSapling sapling = fruit.sapling();
        if (sapling == null) return;

        sapling.worldGenTrees(world, pos);
    }

    private void generateFruitTree(World world, BlockPos pos, FruitLog fruit) {
        final BlockPamSapling sapling = fruit.sapling();
        if (sapling == null) return;

        sapling.worldGenTrees(world, pos);
    }
}

