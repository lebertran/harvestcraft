package com.pam.harvestcraft.config;

import com.pam.harvestcraft.HarvestCraft;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ConfigSyncMessage implements IMessage, IMessageHandler<ConfigSyncMessage, IMessage> {
    @Override
    public void toBytes(final ByteBuf buf) {
        final ConfigHandler config = HarvestCraft.config;

        buf.writeBoolean(config.squiddropCalamari);

        buf.writeInt(config.cropfoodRestore);
        buf.writeFloat(config.cropsaturationRestore);

        buf.writeFloat(config.snacksaturation);
        buf.writeFloat(config.mealsaturation);
        buf.writeFloat(config.meatymealsaturation);

        buf.writeInt(config.freshmilkfrombucket);
        buf.writeInt(config.freshwaterfrombucket);
        buf.writeInt(config.freshwaterfrombucket);
        buf.writeBoolean(config.enablesaltfromwaterbucketrecipe);
        buf.writeInt(config.seedrarity);

        buf.writeBoolean(config.enablecroptoseedRecipe);
        buf.writeBoolean(config.enableTofuAsMeatInRecipes);
        buf.writeBoolean(config.enableTofuAsMilkInRecipes);

        buf.writeBoolean(config.enablelistAllwaterfreshwater);
        buf.writeBoolean(config.enablelistAllwatervanillawaterbucket);
        buf.writeInt(config.gardenRarity);
        buf.writeInt(config.gardendropAmount);
        buf.writeInt(config.gardenSpreadMax);
        buf.writeBoolean(config.enablegardenSpread);
        buf.writeInt(config.gardenspreadRate);

        buf.writeBoolean(config.enablearidgardenGeneration);
        buf.writeBoolean(config.enablefrostgardenGeneration);
        buf.writeBoolean(config.enabletropicalgardenGeneration);
        buf.writeBoolean(config.enablewindygardenGeneration);
        buf.writeBoolean(config.enableshadedgardenGeneration);
        buf.writeBoolean(config.enablesoggygardenGeneration);

        buf.writeInt(config.temperatefruittreeRarity);
        buf.writeInt(config.tropicalfruittreeRarity);
        buf.writeInt(config.coniferousfruittreeRarity);

        buf.writeBoolean(config.appletreeGeneration);
        buf.writeBoolean(config.almondtreeGeneration);
        buf.writeBoolean(config.apricottreeGeneration);
        buf.writeBoolean(config.avocadotreeGeneration);
        buf.writeBoolean(config.bananatreeGeneration);
        buf.writeBoolean(config.cashewtreeGeneration);
        buf.writeBoolean(config.cherrytreeGeneration);
        buf.writeBoolean(config.chestnuttreeGeneration);
        buf.writeBoolean(config.cinnamontreeGeneration);
        buf.writeBoolean(config.coconuttreeGeneration);
        buf.writeBoolean(config.datetreeGeneration);
        buf.writeBoolean(config.dragonfruittreeGeneration);
        buf.writeBoolean(config.duriantreeGeneration);
        buf.writeBoolean(config.figtreeGeneration);
        buf.writeBoolean(config.grapefruittreeGeneration);
        buf.writeBoolean(config.lemontreeGeneration);
        buf.writeBoolean(config.limetreeGeneration);
        buf.writeBoolean(config.mapletreeGeneration);
        buf.writeBoolean(config.mangotreeGeneration);
        buf.writeBoolean(config.nutmegtreeGeneration);
        buf.writeBoolean(config.olivetreeGeneration);
        buf.writeBoolean(config.orangetreeGeneration);
        buf.writeBoolean(config.papayatreeGeneration);
        buf.writeBoolean(config.paperbarktreeGeneration);
        buf.writeBoolean(config.peachtreeGeneration);
        buf.writeBoolean(config.peartreeGeneration);
        buf.writeBoolean(config.pecantreeGeneration);
        buf.writeBoolean(config.peppercorntreeGeneration);
        buf.writeBoolean(config.persimmontreeGeneration);
        buf.writeBoolean(config.pistachiotreeGeneration);
        buf.writeBoolean(config.plumtreeGeneration);
        buf.writeBoolean(config.pomegranatetreeGeneration);
        buf.writeBoolean(config.starfruittreeGeneration);
        buf.writeBoolean(config.vanillabeantreeGeneration);
        buf.writeBoolean(config.walnuttreeGeneration);
        buf.writeBoolean(config.gooseberrytreeGeneration);
        buf.writeBoolean(config.enablecropspecialplanting);

        buf.writeBoolean(config.marketsellSeeds);
        buf.writeBoolean(config.marketselltemperateSaplings);
        buf.writeBoolean(config.marketselltropicalSaplings);
        buf.writeBoolean(config.marketsellconiferousSaplings);
        buf.writeBoolean(config.marketsellPig);
        buf.writeBoolean(config.marketsellSheep);
        buf.writeBoolean(config.marketsellCow);
        buf.writeBoolean(config.marketsellChicken);
        buf.writeBoolean(config.marketsellHorse);
        buf.writeBoolean(config.marketsellBonemeal);

        buf.writeInt(config.marketblockrecipeItem);
        buf.writeInt(config.marketseedPrice);
        buf.writeInt(config.marketsaplingPrice);
        buf.writeInt(config.marketpigPrice);
        buf.writeInt(config.marketsheepPrice);
        buf.writeInt(config.marketcowPrice);
        buf.writeInt(config.marketchickenPrice);
        buf.writeInt(config.markethorsePrice);
        buf.writeInt(config.marketbonemealPrice);
        buf.writeInt(config.marketcurrencySeeds);
        buf.writeInt(config.marketcurrencytemperateSaplings);
        buf.writeInt(config.marketcurrencytropicalSaplings);
        buf.writeInt(config.marketcurrencyconiferousSaplings);
        buf.writeInt(config.marketcurrencyPig);
        buf.writeInt(config.marketcurrencySheep);
        buf.writeInt(config.marketcurrencyCow);
        buf.writeInt(config.marketcurrencyChicken);
        buf.writeInt(config.marketcurrencyHorse);
        buf.writeInt(config.marketcurrencyBonemeal);

        buf.writeBoolean(config.enableEasyHarvest);
        buf.writeBoolean(config.enableBeehiveGeneration);
        buf.writeInt(config.beehiveRarity);
    }

    @Override
    public void fromBytes(final ByteBuf buf) {
        final ConfigHandler config = HarvestCraft.config;

        config.squiddropCalamari = buf.readBoolean();

        config.cropfoodRestore = buf.readInt();
        config.cropsaturationRestore = buf.readFloat();

        config.snacksaturation = buf.readFloat();
        config.mealsaturation = buf.readFloat();
        config.meatymealsaturation = buf.readFloat();

        config.freshmilkfrombucket = buf.readInt();
        config.freshwaterfrombucket = buf.readInt();
        config.freshwaterfrombucket = buf.readInt();
        config.enablesaltfromwaterbucketrecipe = buf.readBoolean();
        config.seedrarity = buf.readInt();

        config.enablecroptoseedRecipe = buf.readBoolean();
        config.enableTofuAsMeatInRecipes = buf.readBoolean();
        config.enableTofuAsMilkInRecipes = buf.readBoolean();

        config.enablelistAllwaterfreshwater = buf.readBoolean();
        config.enablelistAllwatervanillawaterbucket = buf.readBoolean();
        config.gardenRarity = buf.readInt();
        config.gardendropAmount = buf.readInt();
        config.gardenSpreadMax = buf.readInt();
        config.enablegardenSpread = buf.readBoolean();
        config.gardenspreadRate = buf.readInt();

        config.enablearidgardenGeneration = buf.readBoolean();
        config.enablefrostgardenGeneration = buf.readBoolean();
        config.enabletropicalgardenGeneration = buf.readBoolean();
        config.enablewindygardenGeneration = buf.readBoolean();
        config.enableshadedgardenGeneration = buf.readBoolean();
        config.enablesoggygardenGeneration = buf.readBoolean();

        config.temperatefruittreeRarity = buf.readInt();
        config.tropicalfruittreeRarity = buf.readInt();
        config.coniferousfruittreeRarity = buf.readInt();

        config.appletreeGeneration = buf.readBoolean();
        config.almondtreeGeneration = buf.readBoolean();
        config.apricottreeGeneration = buf.readBoolean();
        config.avocadotreeGeneration = buf.readBoolean();
        config.bananatreeGeneration = buf.readBoolean();
        config.cashewtreeGeneration = buf.readBoolean();
        config.cherrytreeGeneration = buf.readBoolean();
        config.chestnuttreeGeneration = buf.readBoolean();
        config.cinnamontreeGeneration = buf.readBoolean();
        config.coconuttreeGeneration = buf.readBoolean();
        config.datetreeGeneration = buf.readBoolean();
        config.dragonfruittreeGeneration = buf.readBoolean();
        config.duriantreeGeneration = buf.readBoolean();
        config.figtreeGeneration = buf.readBoolean();
        config.grapefruittreeGeneration = buf.readBoolean();
        config.lemontreeGeneration = buf.readBoolean();
        config.limetreeGeneration = buf.readBoolean();
        config.mapletreeGeneration = buf.readBoolean();
        config.mangotreeGeneration = buf.readBoolean();
        config.nutmegtreeGeneration = buf.readBoolean();
        config.olivetreeGeneration = buf.readBoolean();
        config.orangetreeGeneration = buf.readBoolean();
        config.papayatreeGeneration = buf.readBoolean();
        config.paperbarktreeGeneration = buf.readBoolean();
        config.peachtreeGeneration = buf.readBoolean();
        config.peartreeGeneration = buf.readBoolean();
        config.pecantreeGeneration = buf.readBoolean();
        config.peppercorntreeGeneration = buf.readBoolean();
        config.persimmontreeGeneration = buf.readBoolean();
        config.pistachiotreeGeneration = buf.readBoolean();
        config.plumtreeGeneration = buf.readBoolean();
        config.pomegranatetreeGeneration = buf.readBoolean();
        config.starfruittreeGeneration = buf.readBoolean();
        config.vanillabeantreeGeneration = buf.readBoolean();
        config.walnuttreeGeneration = buf.readBoolean();
        config.gooseberrytreeGeneration = buf.readBoolean();
        config.enablecropspecialplanting = buf.readBoolean();

        config.marketsellSeeds = buf.readBoolean();
        config.marketselltemperateSaplings = buf.readBoolean();
        config.marketselltropicalSaplings = buf.readBoolean();
        config.marketsellconiferousSaplings = buf.readBoolean();
        config.marketsellPig = buf.readBoolean();
        config.marketsellSheep = buf.readBoolean();
        config.marketsellCow = buf.readBoolean();
        config.marketsellChicken = buf.readBoolean();
        config.marketsellHorse = buf.readBoolean();
        config.marketsellBonemeal = buf.readBoolean();

        config.marketblockrecipeItem = buf.readInt();
        config.marketseedPrice = buf.readInt();
        config.marketsaplingPrice = buf.readInt();
        config.marketpigPrice = buf.readInt();
        config.marketsheepPrice = buf.readInt();
        config.marketcowPrice = buf.readInt();
        config.marketchickenPrice = buf.readInt();
        config.markethorsePrice = buf.readInt();
        config.marketbonemealPrice = buf.readInt();
        config.marketcurrencySeeds = buf.readInt();
        config.marketcurrencytemperateSaplings = buf.readInt();
        config.marketcurrencytropicalSaplings = buf.readInt();
        config.marketcurrencyconiferousSaplings = buf.readInt();
        config.marketcurrencyPig = buf.readInt();
        config.marketcurrencySheep = buf.readInt();
        config.marketcurrencyCow = buf.readInt();
        config.marketcurrencyChicken = buf.readInt();
        config.marketcurrencyHorse = buf.readInt();
        config.marketcurrencyBonemeal = buf.readInt();

        config.enableEasyHarvest = buf.readBoolean();
        config.enableBeehiveGeneration = buf.readBoolean();
        config.beehiveRarity = buf.readInt();

        config.onConfigChanged();
    }

    @Override
    public IMessage onMessage(final ConfigSyncMessage message, final MessageContext ctx) {
        return null;
    }
}
