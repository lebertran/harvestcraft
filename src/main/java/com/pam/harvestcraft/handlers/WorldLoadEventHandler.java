package com.pam.harvestcraft.handlers;

import com.pam.harvestcraft.Reference;
import com.pam.harvestcraft.item.LootHelper;
import com.sun.javafx.collections.MappingChange;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableManager;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * Modified functions from github.com/cyanobacterium/AdditionalLootTables
 *
 * mostly (C) 2016 Chris Hall under the MIT License
 */
public class WorldLoadEventHandler {


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
