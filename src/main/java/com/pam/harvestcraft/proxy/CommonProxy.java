package com.pam.harvestcraft.proxy;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.market.MarketItems;
import com.pam.harvestcraft.item.*;
import com.pam.harvestcraft.loottables.LootTableLoadEventHandler;
import com.pam.harvestcraft.tileentity.TileEntityMarket;
import com.pam.harvestcraft.worldgen.BushWorldWorldGen;
import com.pam.harvestcraft.worldgen.FruitTreeWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        BlockRegistry.loadBlockRegistry();
        ItemRegistry.loadItemRegistry();

        onBlocksAndItemsLoaded();
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new BushWorldWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new FruitTreeWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    public void onBlocksAndItemsLoaded() {
        HarvestCraft.config.configureGardenDrops();

        PamFoodRecipes.registerRecipes();
        PamOtherRecipes.getRecipes();
        PamFoodOreDictionaryRegistry.getRegistry();
        PamOtherOreDictionaryRegistry.getRegistry();
        PamCropSeedDropRegistry.getSeedDrops();
        MarketItems.registerItems();
        PacketHandler.init();

        GameRegistry.registerTileEntity(TileEntityMarket.class, "PamMarket");

        MinecraftForge.EVENT_BUS.register(new LootTableLoadEventHandler());
    }
}
