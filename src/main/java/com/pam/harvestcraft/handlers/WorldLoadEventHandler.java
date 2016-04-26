package com.pam.harvestcraft.handlers;

import com.pam.harvestcraft.Reference;
import net.minecraft.world.storage.loot.LootTableManager;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class WorldLoadEventHandler {

    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {
        if (event.getWorld() == null || event.getWorld().isRemote) return;

        LootTableManager lootTableManager = event.getWorld().getLootTableManager();

        if (lootTableManager == null) {
            FMLLog.severe("[%s] LootTableManager is null.", Reference.MODID);
            return;
        }

        LootHandler.init(lootTableManager);
    }


}
