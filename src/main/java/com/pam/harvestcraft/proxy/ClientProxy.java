package com.pam.harvestcraft.proxy;

import com.pam.harvestcraft.blocks.ItemModels;
import com.pam.harvestcraft.item.ItemRenderRegister;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
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

    public void registerRenderInformation(FMLPreInitializationEvent event)
    {
       // TileEntityHandler.registerTileEntityRenderers(); //@TODO: What should this do?
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
}

