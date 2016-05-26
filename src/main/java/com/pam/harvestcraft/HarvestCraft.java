package com.pam.harvestcraft;

import com.pam.harvestcraft.config.ConfigHandler;
import com.pam.harvestcraft.gui.GuiHandler;
import com.pam.harvestcraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@SuppressWarnings("unused")
@Mod(modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        dependencies = "required-after:Forge@[12.16.1.1900,)")
public class HarvestCraft {

    @Instance(Reference.MODID)
    public static HarvestCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs modTab = new CreativeTabs(Reference.MODID) {
        public Item getTabIconItem() {
            return Items.WHEAT;
        }
    };

    public static ConfigHandler config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        config = new ConfigHandler(new Configuration(event.getSuggestedConfigurationFile()));

        proxy.preInit(event);

        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}