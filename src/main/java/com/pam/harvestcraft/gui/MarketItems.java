package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;

public class MarketItems {
    private static ArrayList<MarketData> items = new ArrayList();

    public static void registerItems(MarketData data) {
        items.add(data);
    }

    public static MarketData getData(int i) {
        return (MarketData) items.get(i);
    }

    public static int getSize() {
        return items.size();
    }

    public static void registerItems() {
        if (BlockRegistry.marketsellSeeds) {
            if (BlockRegistry.marketcurrencySeeds == 0) {
                for (int i = 0; i < 60; i++) {
                    registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
                }
                registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
                registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
                registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
            }
            if (BlockRegistry.marketcurrencySeeds == 1) {
                for (int i = 0; i < 60; i++) {
                    registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
                }
            }
            if (BlockRegistry.marketcurrencySeeds == 2) {
                for (int i = 0; i < 60; i++) {
                    registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
                }
            }
            if (BlockRegistry.marketcurrencySeeds == 3) {
                for (int i = 0; i < 60; i++) {
                    registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
                }
            }
            if (BlockRegistry.marketcurrencySeeds == 4) {
                for (int i = 0; i < 60; i++) {
                    registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
                }
            }
            if (BlockRegistry.marketcurrencySeeds == 5) {
                for (int i = 0; i < 60; i++) {
                    registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.wheat_seeds), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
                    registerItems(new MarketData(new ItemStack(Items.melon_seeds), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
                }
            }
        }

        if (BlockRegistry.marketselltemperateSaplings) {
            if (BlockRegistry.marketcurrencytemperateSaplings == 0) {
                for (int i = 0; i < 9; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
            }

            if (BlockRegistry.marketcurrencytemperateSaplings == 1) {
                for (int i = 0; i < 9; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytemperateSaplings == 2) {
                for (int i = 0; i < 9; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytemperateSaplings == 3) {
                for (int i = 0; i < 9; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytemperateSaplings == 4) {
                for (int i = 0; i < 9; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytemperateSaplings == 5) {
                for (int i = 0; i < 9; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytemperateSaplings == 6) {
                for (int i = 0; i < 9; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
            }
        }

        if (BlockRegistry.marketselltropicalSaplings) {
            if (BlockRegistry.marketcurrencytropicalSaplings == 0) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
            }

            if (BlockRegistry.marketcurrencytropicalSaplings == 1) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytropicalSaplings == 2) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytropicalSaplings == 3) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytropicalSaplings == 4) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytropicalSaplings == 5) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytropicalSaplings == 6) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencytropicalSaplings == 7) {
                for (int i = 0; i < 24; i++) {
                    registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
                }
                registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
            }
        }

        if (BlockRegistry.marketsellconiferousSaplings) {
            if (BlockRegistry.marketcurrencyconiferousSaplings == 0) {
                registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencyconiferousSaplings == 1) {
                registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencyconiferousSaplings == 2) {
                registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencyconiferousSaplings == 3) {
                registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencyconiferousSaplings == 4) {
                registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
            }
            if (BlockRegistry.marketcurrencyconiferousSaplings == 5) {
                registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Blocks.sapling, 1, 1), BlockRegistry.marketsaplingPrice));
                registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), new ItemStack(Blocks.sapling, 1, 1), BlockRegistry.marketsaplingPrice));
            }
        }

        final Side side = FMLCommonHandler.instance().getEffectiveSide();

        final ItemStack pigegg = new ItemStack(Items.spawn_egg, 1, 90);
        final ItemStack sheepegg = new ItemStack(Items.spawn_egg, 1, 91);
        final ItemStack cowegg = new ItemStack(Items.spawn_egg, 1, 92);
        final ItemStack chickenegg = new ItemStack(Items.spawn_egg, 93);
        final ItemStack horseegg = new ItemStack(Items.spawn_egg, 100);


        if (side.isClient()) {
            ItemMonsterPlacer.func_185078_a(pigegg, EntityList.classToStringMapping.get(EntityPig.class));
            ItemMonsterPlacer.func_185078_a(sheepegg, EntityList.classToStringMapping.get(EntitySheep.class));
            ItemMonsterPlacer.func_185078_a(cowegg, EntityList.classToStringMapping.get(EntityCow.class));
            ItemMonsterPlacer.func_185078_a(chickenegg, EntityList.classToStringMapping.get(EntityChicken.class));
            ItemMonsterPlacer.func_185078_a(horseegg, EntityList.classToStringMapping.get(EntityHorse.class));
        }

        if (BlockRegistry.marketsellPig) {
            if (BlockRegistry.marketcurrencyPig == 0) {
                registerItems(new MarketData(pigegg, new ItemStack(Items.emerald), BlockRegistry.marketpigPrice));
            }
            if (BlockRegistry.marketcurrencyPig == 1) {
                registerItems(new MarketData(pigegg, new ItemStack(Items.diamond), BlockRegistry.marketpigPrice));
            }
            if (BlockRegistry.marketcurrencyPig == 2) {
                registerItems(new MarketData(pigegg, new ItemStack(Items.gold_ingot), BlockRegistry.marketpigPrice));
            }
            if (BlockRegistry.marketcurrencyPig == 3) {
                registerItems(new MarketData(pigegg, new ItemStack(Items.gold_nugget), BlockRegistry.marketpigPrice));
            }
            if (BlockRegistry.marketcurrencyPig == 4) {
                registerItems(new MarketData(pigegg, new ItemStack(Items.iron_ingot), BlockRegistry.marketpigPrice));
            }
            if (BlockRegistry.marketcurrencyPig == 5) {
                registerItems(new MarketData(pigegg, new ItemStack(Items.egg), BlockRegistry.marketpigPrice));
            }
        }
        if (BlockRegistry.marketsellSheep) {
            if (BlockRegistry.marketcurrencySheep == 0) {
                registerItems(new MarketData(sheepegg, new ItemStack(Items.emerald), BlockRegistry.marketsheepPrice));
            }
            if (BlockRegistry.marketcurrencySheep == 1) {
                registerItems(new MarketData(sheepegg, new ItemStack(Items.diamond), BlockRegistry.marketsheepPrice));
            }
            if (BlockRegistry.marketcurrencySheep == 2) {
                registerItems(new MarketData(sheepegg, new ItemStack(Items.gold_ingot), BlockRegistry.marketsheepPrice));
            }
            if (BlockRegistry.marketcurrencySheep == 3) {
                registerItems(new MarketData(sheepegg, new ItemStack(Items.gold_nugget), BlockRegistry.marketsheepPrice));
            }
            if (BlockRegistry.marketcurrencySheep == 4) {
                registerItems(new MarketData(sheepegg, new ItemStack(Items.iron_ingot), BlockRegistry.marketsheepPrice));
            }
            if (BlockRegistry.marketcurrencySheep == 5) {
                registerItems(new MarketData(sheepegg, new ItemStack(Items.egg), BlockRegistry.marketsheepPrice));
            }
        }
        if (BlockRegistry.marketsellCow) {
            if (BlockRegistry.marketcurrencyCow == 0) {
                registerItems(new MarketData(cowegg, new ItemStack(Items.emerald), BlockRegistry.marketcowPrice));
            }
            if (BlockRegistry.marketcurrencyCow == 1) {
                registerItems(new MarketData(cowegg, new ItemStack(Items.diamond), BlockRegistry.marketcowPrice));
            }
            if (BlockRegistry.marketcurrencyCow == 2) {
                registerItems(new MarketData(cowegg, new ItemStack(Items.gold_ingot), BlockRegistry.marketcowPrice));
            }
            if (BlockRegistry.marketcurrencyCow == 3) {
                registerItems(new MarketData(cowegg, new ItemStack(Items.gold_nugget), BlockRegistry.marketcowPrice));
            }
            if (BlockRegistry.marketcurrencyCow == 4) {
                registerItems(new MarketData(cowegg, new ItemStack(Items.iron_ingot), BlockRegistry.marketcowPrice));
            }
            if (BlockRegistry.marketcurrencyCow == 5) {
                registerItems(new MarketData(cowegg, new ItemStack(Items.egg), BlockRegistry.marketcowPrice));
            }
        }
        if (BlockRegistry.marketsellChicken) {
            if (BlockRegistry.marketcurrencyChicken == 0) {
                registerItems(new MarketData(chickenegg, new ItemStack(Items.emerald), BlockRegistry.marketchickenPrice));
            }
            if (BlockRegistry.marketcurrencyChicken == 1) {
                registerItems(new MarketData(chickenegg, new ItemStack(Items.diamond), BlockRegistry.marketchickenPrice));
            }
            if (BlockRegistry.marketcurrencyChicken == 2) {
                registerItems(new MarketData(chickenegg, new ItemStack(Items.gold_ingot), BlockRegistry.marketchickenPrice));
            }
            if (BlockRegistry.marketcurrencyChicken == 3) {
                registerItems(new MarketData(chickenegg, new ItemStack(Items.gold_nugget), BlockRegistry.marketchickenPrice));
            }
            if (BlockRegistry.marketcurrencyChicken == 4) {
                registerItems(new MarketData(chickenegg, new ItemStack(Items.iron_ingot), BlockRegistry.marketchickenPrice));
            }
            if (BlockRegistry.marketcurrencyChicken == 5) {
                registerItems(new MarketData(chickenegg, new ItemStack(Items.egg), BlockRegistry.marketchickenPrice));
            }
        }
        if (BlockRegistry.marketsellHorse) {
            if (BlockRegistry.marketcurrencyHorse == 0) {
                registerItems(new MarketData(horseegg, new ItemStack(Items.emerald), BlockRegistry.markethorsePrice));
            }
            if (BlockRegistry.marketcurrencyHorse == 1) {
                registerItems(new MarketData(horseegg, new ItemStack(Items.diamond), BlockRegistry.markethorsePrice));
            }
            if (BlockRegistry.marketcurrencyHorse == 2) {
                registerItems(new MarketData(horseegg, new ItemStack(Items.gold_ingot), BlockRegistry.markethorsePrice));
            }
            if (BlockRegistry.marketcurrencyHorse == 3) {
                registerItems(new MarketData(horseegg, new ItemStack(Items.gold_nugget), BlockRegistry.markethorsePrice));
            }
            if (BlockRegistry.marketcurrencyHorse == 4) {
                registerItems(new MarketData(horseegg, new ItemStack(Items.iron_ingot), BlockRegistry.markethorsePrice));
            }
            if (BlockRegistry.marketcurrencyHorse == 5) {
                registerItems(new MarketData(horseegg, new ItemStack(Items.egg), BlockRegistry.markethorsePrice));
            }
        }

        if (BlockRegistry.marketsellBonemeal) {
            if (BlockRegistry.marketcurrencyBonemeal == 0) {
                registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.emerald), BlockRegistry.marketbonemealPrice));
            }
            if (BlockRegistry.marketcurrencyBonemeal == 1) {
                registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.diamond), BlockRegistry.marketbonemealPrice));
            }
            if (BlockRegistry.marketcurrencyBonemeal == 2) {
                registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.gold_ingot), BlockRegistry.marketbonemealPrice));
            }
            if (BlockRegistry.marketcurrencyBonemeal == 3) {
                registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.gold_nugget), BlockRegistry.marketbonemealPrice));
            }
            if (BlockRegistry.marketcurrencyBonemeal == 4) {
                registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.iron_ingot), BlockRegistry.marketbonemealPrice));
            }
        }
    }
}
