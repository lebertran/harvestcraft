package com.pam.harvestcraft.proxy;

import com.pam.harvestcraft.addons.Waila;
import com.pam.harvestcraft.blocks.ItemModels;
import com.pam.harvestcraft.item.ItemRenderRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ItemModels.preInit();

        Waila.init();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ItemModels.init();
        ItemRenderRegister.registerItemRenderer();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    @Override
    public void registerRenderInformation(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    @Override
    public World getClientWorld() {
        return FMLClientHandler.instance().getClient().theWorld;
    }
}

