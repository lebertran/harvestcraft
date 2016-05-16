package com.pam.harvestcraft.worldgen;

import com.pam.harvestcraft.blocks.BlockPamSapling;
import com.pam.harvestcraft.blocks.FruitRegistry;
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
                            generateFruitTree(world, blockPos, FruitRegistry.APPLE);
                            break;
                        }
                    case 1:
                        if (config.avocadotreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.AVOCADO);
                            break;
                        }
                    case 2:
                        if (config.cherrytreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.CHERRY);
                            break;
                        }
                    case 3:
                        if (config.chestnuttreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.CHESTNUT);
                            break;
                        }
                    case 4:
                        if (config.nutmegtreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.NUTMEG);
                            break;
                        }
                    case 5:
                        if (config.peartreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.PEAR);
                            break;
                        }
                    case 6:
                        if (config.plumtreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.PLUM);
                            break;
                        }
                    case 7:
                        if (config.walnuttreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.WALNUT);
                            break;
                        }
                    case 8:
                        if (config.gooseberrytreeGeneration) {
                            generateFruitTree(world, blockPos, FruitRegistry.GOOSEBERRY);
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
                        generateFruitTree(world, blockPos, FruitRegistry.BANANA);
                        break;
                    }
                case 1:
                    if (config.cinnamontreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.CINNAMON);
                        break;
                    }
                case 2:
                    if (config.coconuttreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.COCONUT);
                        break;
                    }
                case 3:
                    if (config.datetreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.DATE);
                        break;
                    }
                case 4:
                    if (config.dragonfruittreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.DRAGONFRUIT);
                        break;
                    }
                case 5:
                    if (config.papayatreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.PAPAYA);
                        break;
                    }
                case 6:
                    if (config.almondtreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.ALMOND);
                        break;
                    }
                case 7:
                    if (config.apricottreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.APRICOT);
                        break;
                    }
                case 8:
                    if (config.cashewtreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.CASHEW);
                        break;
                    }
                case 9:
                    if (config.duriantreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.DURIAN);
                        break;
                    }
                case 10:
                    if (config.figtreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.FIG);
                        break;
                    }
                case 11:
                    if (config.grapefruittreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.GRAPEFRUIT);
                        break;
                    }
                case 12:
                    if (config.lemontreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.LEMON);
                        break;
                    }
                case 13:
                    if (config.limetreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.LIME);
                        break;
                    }
                case 14:
                    if (config.mangotreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.MANGO);
                        break;
                    }
                case 15:
                    if (config.orangetreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.ORANGE);
                        break;
                    }
                case 16:
                    if (config.paperbarktreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.PAPERBARK);
                        break;
                    }
                case 17:
                    if (config.peachtreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.PEACH);
                        break;
                    }
                case 18:
                    if (config.pecantreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.PECAN);
                        break;
                    }
                case 19:
                    if (config.peppercorntreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.PEPPERCORN);
                        break;
                    }
                case 20:
                    if (config.persimmontreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.PERSIMMON);
                        break;
                    }
                case 21:
                    if (config.pistachiotreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.PISTACHIO);
                        break;
                    }
                case 22:
                    if (config.pomegranatetreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.POMEGRANATE);
                        break;
                    }
                case 23:
                    if (config.starfruittreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.STARFRUIT);
                        break;
                    }
                case 24:
                    if (config.vanillabeantreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.VANILLABEAN);
                        break;
                    }
                case 25:
                    if (config.olivetreeGeneration) {
                        generateFruitTree(world, blockPos, FruitRegistry.OLIVE);
                    }
            }
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.CONIFEROUS))) {
            if (config.mapletreeGeneration) {
                generateFruitTree(world, blockPos, FruitRegistry.MAPLE);
            }
        }

    }

    public void generateFruitTree(World world, BlockPos pos, String fruitName) {
        int posX = (pos.getX() + world.rand.nextInt(8)) - world.rand.nextInt(8);
        int posY = (pos.getY() + world.rand.nextInt(4)) - world.rand.nextInt(4);
        int posZ = (pos.getZ() + world.rand.nextInt(8)) - world.rand.nextInt(8);
        final BlockPos newPos = new BlockPos(posX, posY, posZ);

        final BlockPamSapling sapling = FruitRegistry.getSapling(fruitName);
        if (sapling == null) return;

        sapling.generateTree(world, newPos, world.getBlockState(newPos), world.rand);
    }
}

