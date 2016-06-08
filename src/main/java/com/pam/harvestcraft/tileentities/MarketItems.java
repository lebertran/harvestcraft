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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

import java.util.ArrayList;

public class MarketItems {

    private enum CurrencyType {
        DEFAULT, SEEDS, SAPLING, ANIMAL
    }

    private static final ArrayList<MarketData> items = new ArrayList<>();

    private static void registerItems(MarketData data) {
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

        registerItems(new MarketData(new ItemStack(Items.DYE, 1, 15), currency, HarvestCraft.config.marketbonemealPrice));
    }

    private static void registerAnimalEggs() {

        final ItemStack pigEgg = new ItemStack(Items.SPAWN_EGG, 1, 90);
        final ItemStack sheepEgg = new ItemStack(Items.SPAWN_EGG, 1, 91);
        final ItemStack cowEgg = new ItemStack(Items.SPAWN_EGG, 1, 92);
        final ItemStack chickenEgg = new ItemStack(Items.SPAWN_EGG, 1, 93);
        final ItemStack horseEgg = new ItemStack(Items.SPAWN_EGG, 1, 100);

        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            ItemMonsterPlacer.applyEntityIdToItemStack(pigEgg, EntityList.getEntityStringFromClass(EntityPig.class));
            ItemMonsterPlacer.applyEntityIdToItemStack(sheepEgg, EntityList.getEntityStringFromClass(EntitySheep.class));
            ItemMonsterPlacer.applyEntityIdToItemStack(cowEgg, EntityList.getEntityStringFromClass(EntityCow.class));
            ItemMonsterPlacer.applyEntityIdToItemStack(chickenEgg, EntityList.getEntityStringFromClass(EntityChicken.class));
            ItemMonsterPlacer.applyEntityIdToItemStack(horseEgg, EntityList.getEntityStringFromClass(EntityHorse.class));
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
        registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 1), currency, HarvestCraft.config.marketsaplingPrice));
    }

    private static void registerTropicalSaplings() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencytropicalSaplings, CurrencyType.SAPLING);

        for (Block sapling : FruitRegistry.warmSaplings.values()) {
            registerItems(new MarketData(new ItemStack(sapling, 1), currency, HarvestCraft.config.marketsaplingPrice));
        }
        registerItems(new MarketData(new ItemStack(FruitRegistry.getSapling(FruitRegistry.CINNAMON), 1), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(FruitRegistry.getSapling(FruitRegistry.PAPERBARK), 1), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 3), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 4), currency, HarvestCraft.config.marketsaplingPrice));
    }

    private static void registerTemperateSaplings() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencytemperateSaplings, CurrencyType.SAPLING);

        for (Block sapling : FruitRegistry.temperateSaplings.values()) {
            registerItems(new MarketData(new ItemStack(sapling, 1), currency, HarvestCraft.config.marketsaplingPrice));
        }

        registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 0), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 2), currency, HarvestCraft.config.marketsaplingPrice));
        registerItems(new MarketData(new ItemStack(Blocks.SAPLING, 1, 5), currency, HarvestCraft.config.marketsaplingPrice));
    }

    private static void registerSeeds() {
        final ItemStack currency = getCurrency(HarvestCraft.config.marketcurrencySeeds, CurrencyType.SEEDS);

        for (Item seed : CropRegistry.getSeeds().values()) {
            registerItems(new MarketData(new ItemStack(seed), currency, HarvestCraft.config.marketseedPrice));

        }
        registerItems(new MarketData(new ItemStack(Items.WHEAT_SEEDS), currency, HarvestCraft.config.marketseedPrice));
        registerItems(new MarketData(new ItemStack(Items.PUMPKIN_SEEDS), currency, HarvestCraft.config.marketseedPrice));
        registerItems(new MarketData(new ItemStack(Items.MELON_SEEDS), currency, HarvestCraft.config.marketseedPrice));
    }
    
    private static ItemStack getCurrency(int config, CurrencyType currencyType) {
        switch (config) {
            case 1:
                return new ItemStack(Items.DIAMOND);
            case 2:
                return new ItemStack(Items.GOLD_INGOT);
            case 3:
                return new ItemStack(Items.GOLD_NUGGET);
            case 4:
                return new ItemStack(Items.IRON_INGOT);
            case 5:
                if (currencyType.equals(CurrencyType.ANIMAL))
                    return new ItemStack(Items.EGG);
                if (currencyType.equals(CurrencyType.SEEDS))
                    return new ItemStack(Items.WHEAT_SEEDS);
                if (currencyType.equals(CurrencyType.SAPLING))
                    return new ItemStack(Blocks.SAPLING);
                else
                    return null;
            case 6:
                return new ItemStack(Items.APPLE);
            case 7:
                return new ItemStack(Items.DYE);
            case 0:
            default:
                return new ItemStack(Items.EMERALD);
        }
    }

}
