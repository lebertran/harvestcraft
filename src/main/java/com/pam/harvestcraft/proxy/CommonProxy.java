package com.pam.harvestcraft.proxy;

import com.pam.harvestcraft.Config;
import com.pam.harvestcraft.addons.Waila;
import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.gui.GuiHandler;
import com.pam.harvestcraft.gui.MarketItems;
import com.pam.harvestcraft.handlers.WorldLoadEventHandler;
import com.pam.harvestcraft.item.*;
import com.pam.harvestcraft.tileentity.TileEntityMarket;
import com.pam.harvestcraft.worldgen.BushWorldWorldGen;
import com.pam.harvestcraft.worldgen.FruitTreeWorldGen;
import com.pam.harvestcraft.worldgen.LogFruitTreeWorldGen;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        Config.instance.load(e);

        BlockRegistry.loadBlockRegistry();
        ItemRegistry.loadItemRegistry();

        Config.instance.configureGardenDrops();

        PamFoodRecipes.getRecipes();
        PamOtherRecipes.getRecipes();
        PamFoodOreDictionaryRegistry.getRegistry();
        PamOtherOreDictionaryRegistry.getRegistry();
        PamCropSeedDropRegistry.getSeedDrops();
        MarketItems.registerItems();
        PacketHandler.init();

        GameRegistry.registerTileEntity(TileEntityMarket.class, "PamMarket");

        MinecraftForge.EVENT_BUS.register(new WorldLoadEventHandler());
    }

    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new BushWorldWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new FruitTreeWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new LogFruitTreeWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    public void registerHandlers(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    public void registerRenderInformation(FMLPreInitializationEvent event) {
    }

    public World getClientWorld() {
        return null;
    }
}
