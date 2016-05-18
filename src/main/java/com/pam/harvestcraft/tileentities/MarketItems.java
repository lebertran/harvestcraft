package com.pam.harvestcraft.tileentities;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;

import java.util.ArrayList;

public class MarketItems {

    public enum CurrencyType {
        DEFAULT, SEEDS, SAPLING, ANIMAL
    }

    private static final ArrayList<MarketData> items = new ArrayList<>();

    public static void registerItems(MarketData data) {
        items.add(data);
    }

    public static MarketData getData(int i) {
        return items.get(i);
    }

    public static int getSize() {
        return items.size();
    }

    public static void registerItems() {

        if (HarvestCraft.config.marketsellSeeds) {
            registerSeeds();
        }

        if (HarvestCraft.config.marketselltemperateSaplings) {
            registerTemperateSaplings();
        }

        if (HarvestCraft.config.marketselltropicalSaplings) {
            registerTropicalSaplings();
        }

        if (HarvestCraft.config.marketsellconiferousSaplings) {
            registerConiferousSaplings();
        }

        registerAnimalEggs();

        if (HarvestCraft.config.marketsellBonemeal) {
            registerBonemeal();
        }
    }

    private static void registerBonemeal() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencyBonemeal, CurrencyType.DEFAULT);

        registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), currency, HarvestCraft.config.marketbonemealPrice));
    }

    private static void registerAnimalEggs() {

        final ItemStack pigEgg = new ItemStack(Items.spawn_egg, 1, 90);
        final ItemStack sheepEgg = new ItemStack(Items.spawn_egg, 1, 91);
        final ItemStack cowEgg = new ItemStack(Items.spawn_egg, 1, 92);
        final ItemStack chickenEgg = new ItemStack(Items.spawn_egg, 93);
        final ItemStack horseEgg = new ItemStack(Items.spawn_egg, 100);

        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            ItemMonsterPlacer.func_185078_a(pigEgg, EntityList.classToStringMapping.get(EntityPig.class));
            ItemMonsterPlacer.func_185078_a(sheepEgg, EntityList.classToStringMapping.get(EntitySheep.class));
            ItemMonsterPlacer.func_185078_a(cowEgg, EntityList.classToStringMapping.get(EntityCow.class));
            ItemMonsterPlacer.func_185078_a(chickenEgg, EntityList.classToStringMapping.get(EntityChicken.class));
            ItemMonsterPlacer.func_185078_a(horseEgg, EntityList.classToStringMapping.get(EntityHorse.class));
        }

        if (HarvestCraft.config.marketsellPig) {
            final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencyPig, CurrencyType.ANIMAL);
            registerItems(new MarketData(pigEgg, currency, HarvestCraft.config.marketpigPrice));
        }

        if (HarvestCraft.config.marketsellSheep) {
            final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencySheep, CurrencyType.ANIMAL);
            registerItems(new MarketData(sheepEgg, currency, HarvestCraft.config.marketsheepPrice));
        }

        if (HarvestCraft.config.marketsellCow) {
            final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencyCow, CurrencyType.ANIMAL);
            registerItems(new MarketData(cowEgg, currency, HarvestCraft.config.marketcowPrice));
        }

        if (HarvestCraft.config.marketsellChicken) {
            final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencyChicken, CurrencyType.ANIMAL);
            registerItems(new MarketData(chickenEgg, currency, HarvestCraft.config.marketchickenPrice));
        }

        if (HarvestCraft.config.marketsellHorse) {
            final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencyHorse, CurrencyType.ANIMAL);
            registerItems(new MarketData(horseEgg, currency, HarvestCraft.config.markethorsePrice));
        }
    }

    private static void registerConiferousSaplings() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencyconiferousSaplings, CurrencyType.SAPLING);

        registerItems(new MarketData(new ItemStack(FruitRegistry.getSapling(FruitRegistry.MAPLE), 1), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 1), currency, HarvestCraft.config.marketsaplingPrice));
    }

    private static void registerTropicalSaplings() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencytropicalSaplings, CurrencyType.SAPLING);

        for (Block sapling : FruitRegistry.warmSaplings.values()) {
            registerItems(new MarketData(new ItemStack(sapling, 1), currency, HarvestCraft.config.marketsaplingPrice));
        }
        registerItems(new MarketData(new ItemStack(FruitRegistry.getSapling(FruitRegistry.CINNAMON), 1), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(FruitRegistry.getSapling(FruitRegistry.PAPERBARK), 1), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 3), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 4), currency, HarvestCraft.config.marketsaplingPrice));
    }

    private static void registerTemperateSaplings() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencytemperateSaplings, CurrencyType.SAPLING);

        for (Block sapling : FruitRegistry.temperateSaplings.values()) {
            registerItems(new MarketData(new ItemStack(sapling, 1), currency, HarvestCraft.config.marketsaplingPrice));
        }

        registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 0), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 2), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.sapling, 1, 5), currency, HarvestCraft.config.marketsaplingPrice));
    }

    private static void registerSeeds() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencySeeds, CurrencyType.SEEDS);

        for (Item seed : CropRegistry.getSeeds().values()) {
            registerItems(new MarketData(new ItemStack(seed), currency, HarvestCraft.config.marketseedPrice));

        }
        registerItems(new MarketData(new ItemStack(Items.wheat_seeds), currency, HarvestCraft.config.marketseedPrice));
        registerItems(new MarketData(new ItemStack(Items.pumpkin_seeds), currency, HarvestCraft.config.marketseedPrice));
        registerItems(new MarketData(new ItemStack(Items.melon_seeds), currency, HarvestCraft.config.marketseedPrice));
    }
    
    private static ItemStack getCurrency(int config, CurrencyType currencyType) {
        switch (config) {
            case 1:
                return new ItemStack(Items.diamond);
            case 2:
                return new ItemStack(Items.gold_ingot);
            case 3:
                return new ItemStack(Items.gold_nugget);
            case 4:
                return new ItemStack(Items.iron_ingot);
            case 5:
                if (currencyType.equals(CurrencyType.ANIMAL))
                    return new ItemStack(Items.egg);
                if (currencyType.equals(CurrencyType.SEEDS))
                    return new ItemStack(Items.wheat_seeds);
                if (currencyType.equals(CurrencyType.SAPLING))
                    return new ItemStack(Blocks.sapling);
                else
                    return null;
            case 6:
                return new ItemStack(Items.apple);
            case 7:
                return new ItemStack(Items.dye);
            case 0:
            default:
                return new ItemStack(Items.emerald);
        }
    }

}
