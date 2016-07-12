package com.pam.harvestcraft.proxy;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.addons.RightClickHarvesting;
import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.blocks.Crop;
import com.pam.harvestcraft.blocks.Fruit;
import com.pam.harvestcraft.blocks.FruitLog;
import com.pam.harvestcraft.item.GeneralOreRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import com.pam.harvestcraft.item.RecipeRegistry;
import com.pam.harvestcraft.item.SeedDropRegistry;
import com.pam.harvestcraft.loottables.LootTableLoadEventHandler;
import com.pam.harvestcraft.tileentities.MarketItems;
import com.pam.harvestcraft.tileentities.TileEntityApiary;
import com.pam.harvestcraft.tileentities.TileEntityMarket;
import com.pam.harvestcraft.tileentities.TileEntityPresser;
import com.pam.harvestcraft.worldgen.BeehiveWorldGen;
import com.pam.harvestcraft.worldgen.BushWorldWorldGen;
import com.pam.harvestcraft.worldgen.FruitTreeWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        Crop.registerAll();
        Fruit.registerAll();
        FruitLog.registerAll();
        BlockRegistry.initBlockRegistry();
        ItemRegistry.registerItems();
        MarketItems.registerItems();

        GameRegistry.registerTileEntity(TileEntityApiary.class, "PamApiary");
        GameRegistry.registerTileEntity(TileEntityMarket.class, "PamMarket");
        GameRegistry.registerTileEntity(TileEntityPresser.class, "PamPresser");

        GeneralOreRegistry.initOreRegistry();

        HarvestCraft.config.configureGardenDrops();

        MinecraftForge.EVENT_BUS.register(new LootTableLoadEventHandler());
        RightClickHarvesting.instance.register();

    }

    public void init(FMLInitializationEvent e) {
        RecipeRegistry.registerRecipes();
        SeedDropRegistry.getSeedDrops();
        PacketHandler.init();


        GameRegistry.registerWorldGenerator(new BushWorldWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new FruitTreeWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new BeehiveWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
