package com.pam.harvestcraft.worldgen;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class FruitTreeWorldGen implements IWorldGenerator {

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

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST))
                && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.COLD))
                && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SPOOKY))
                && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))) {
            {
                switch (random.nextInt(9)) {
                    case 0:
                        if (BlockRegistry.appletreeGeneration) {
                            this.generateAppleTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 1:
                        if (BlockRegistry.avocadotreeGeneration) {
                            this.generateAvocadoTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 2:
                        if (BlockRegistry.cherrytreeGeneration) {
                            this.generateCherryTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 3:
                        if (BlockRegistry.chestnuttreeGeneration) {
                            this.generateChestnutTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 4:
                        if (BlockRegistry.nutmegtreeGeneration) {
                            this.generateNutmegTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 5:
                        if (BlockRegistry.peartreeGeneration) {
                            this.generatePearTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 6:
                        if (BlockRegistry.plumtreeGeneration) {
                            this.generatePlumTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 7:
                        if (BlockRegistry.walnuttreeGeneration) {
                            this.generateWalnutTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 8:
                        if (BlockRegistry.gooseberrytreeGeneration) {
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
                && (!BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.DRY)))) {
            {
                switch (random.nextInt(25)) {
                    case 0:
                        if (BlockRegistry.bananatreeGeneration) {
                            this.generateBananaTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 1:
                        if (BlockRegistry.cinnamontreeGeneration) {
                            this.generateCinnamonTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 2:
                        if (BlockRegistry.coconuttreeGeneration) {
                            this.generateCoconutTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 3:
                        if (BlockRegistry.datetreeGeneration) {
                            this.generateDateTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 4:
                        if (BlockRegistry.dragonfruittreeGeneration) {
                            this.generateDragonfruitTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 5:
                        if (BlockRegistry.papayatreeGeneration) {
                            this.generatePapayaTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 6:
                        if (BlockRegistry.almondtreeGeneration) {
                            this.generateAlmondTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 7:
                        if (BlockRegistry.apricottreeGeneration) {
                            this.generateApricotTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 8:
                        if (BlockRegistry.cashewtreeGeneration) {
                            this.generateCashewTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 9:
                        if (BlockRegistry.duriantreeGeneration) {
                            this.generateDurianTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 10:
                        if (BlockRegistry.figtreeGeneration) {
                            this.generateFigTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 11:
                        if (BlockRegistry.grapefruittreeGeneration) {
                            this.generateGrapefruitTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 12:
                        if (BlockRegistry.lemontreeGeneration) {
                            this.generateLemonTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 13:
                        if (BlockRegistry.limetreeGeneration) {
                            this.generateLimeTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 14:
                        if (BlockRegistry.mangotreeGeneration) {
                            this.generateMangoTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 15:
                        if (BlockRegistry.orangetreeGeneration) {
                            this.generateOrangeTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 16:
                        if (BlockRegistry.paperbarktreeGeneration) {
                            this.generatePaperbarkTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 17:
                        if (BlockRegistry.peachtreeGeneration) {
                            this.generatePeachTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 18:
                        if (BlockRegistry.pecantreeGeneration) {
                            this.generatePecanTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 19:
                        if (BlockRegistry.peppercorntreeGeneration) {
                            this.generatePeppercornTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 20:
                        if (BlockRegistry.persimmontreeGeneration) {
                            this.generatePersimmonTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 21:
                        if (BlockRegistry.pistachiotreeGeneration) {
                            this.generatePistachioTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 22:
                        if (BlockRegistry.pomegranatetreeGeneration) {
                            this.generatePomegranateTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 23:
                        if (BlockRegistry.starfruittreeGeneration) {
                            this.generateStarfruitTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 24:
                        if (BlockRegistry.vanillabeantreeGeneration) {
                            this.generateVanillabeanTree(world, random, xCh, yCh + 64, zCh);
                        }
                    case 25:
                        if (BlockRegistry.olivetreeGeneration) {
                            this.generateOliveTree(world, random, xCh, yCh + 64, zCh);
                        }

                        break;
                }
            }
        }

        if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.MOUNTAIN))
                || (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.CONIFEROUS))) {
            this.generateMapleTree(world, random, xCh, yCh + 64, zCh);
        }

    }

    public boolean generateAppleTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamApple.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateAvocadoTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamAvocado.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateCherryTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamCherry.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateChestnutTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamChestnut.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateNutmegTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamNutmeg.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePearTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPear.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePlumTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPlum.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateWalnutTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamWalnut.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateGooseberryTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamGooseberry.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.temperatefruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateAlmondTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamAlmond.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateApricotTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamApricot.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateBananaTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamBanana.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateCashewTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamCashew.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateCoconutTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamCoconut.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateDateTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamDate.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateDragonfruitTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamDragonfruit.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateDurianTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamDurian.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateFigTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamFig.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateGrapefruitTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamGrapefruit.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateLemonTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamLemon.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateLimeTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamLime.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateMangoTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamMango.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateOliveTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamOlive.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateOrangeTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamOrange.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePapayaTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPapaya.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePeachTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPeach.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePecanTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPecan.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePeppercornTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPeppercorn.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePersimmonTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPersimmon.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePistachioTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPistachio.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePomegranateTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPomegranate.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateStarfruitTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamStarfruit.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateVanillabeanTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamVanillabean.getDefaultState();

        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new FruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generateCinnamonTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamCinnamon.getDefaultState();
        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new LogFruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }


    public boolean generateMapleTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamMaple.getDefaultState();
        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new LogFruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }

    public boolean generatePaperbarkTree(World world, Random random, int x, int y, int z) {
        final IBlockState logBlockState = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        final IBlockState leavesBlockState = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, false);
        final IBlockState fruitBlockState = BlockRegistry.pamPaperbark.getDefaultState();
        {
            for (int tries = 0; tries < BlockRegistry.tropicalfruittreeRarity; tries++) {
                int posX = (x + random.nextInt(8)) - random.nextInt(8);
                int posY = (y + random.nextInt(4)) - random.nextInt(4);
                int posZ = (z + random.nextInt(8)) - random.nextInt(8);
                BlockPos pos = new BlockPos(posX, posY, posZ);
                if (world.isAirBlock(pos) && Blocks.yellow_flower.canBlockStay(world, pos, world.getBlockState(pos))) {
                    new LogFruitTreeGen(true, 5, logBlockState, leavesBlockState, false, fruitBlockState).generate(world, random, pos);

                }
            }
        }
        return false;
    }
}

