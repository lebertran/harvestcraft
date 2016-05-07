package com.pam.harvestcraft;

import com.pam.harvestcraft.gui.GuiHandler;
import com.pam.harvestcraft.gui.MarketItems;
import com.pam.harvestcraft.handlers.WorldLoadEventHandler;
import com.pam.harvestcraft.item.*;
import com.pam.harvestcraft.proxy.CommonProxy;
import com.pam.harvestcraft.proxy.PacketHandler;
import com.pam.harvestcraft.tileentity.TileEntityMarket;
import com.pam.harvestcraft.worldgen.BushWorldWorldGen;
import com.pam.harvestcraft.worldgen.FruitTreeWorldGen;
import com.pam.harvestcraft.worldgen.LogFruitTreeWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class HarvestCraft {

    @Instance(Reference.MODID)
    public static HarvestCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static CreativeTabs modTab = new CreativeTabs(Reference.MODID) {
        public Item getTabIconItem() {
            return Items.wheat;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.instance.load(event);
        proxy.preInit(event);
        Config.instance.configureGardenDrops();

        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

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

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        GameRegistry.registerWorldGenerator(new BushWorldWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new FruitTreeWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new LogFruitTreeWorldGen(), 0);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}