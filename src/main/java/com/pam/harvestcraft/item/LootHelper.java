package com.pam.harvestcraft.item;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LootHelper {
    public static final HashMap<ResourceLocation, LootPool> additionalLoot = new HashMap<ResourceLocation, LootPool>();

    static {
        // LootTable for GAMEPLAY_FISHING_JUNK
        final ArrayList<LootEntryItem> gameplayFishingJunkEntries = new ArrayList<LootEntryItem>();
        gameplayFishingJunkEntries.add(createLootEntryItem(ItemRegistry.seaweedItem, 10, 1));

        final LootPool fishingJunkLootPool = createLootPool(gameplayFishingJunkEntries);

        // LootTable for GAMEPLAY_FISHING_FISH
        final ArrayList<LootEntryItem> gameplayFishingFishEntries = new ArrayList<LootEntryItem>();
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.anchovyrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.bassrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.carprawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.catfishrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.charrrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.eelrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.greenheartfishItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.grouperrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.herringrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.jellyfishrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.mudfishrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.octopusrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.perchrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.snapperrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.tilapiarawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.troutrawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.tunarawItem, 25, 1));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.walleyerawItem, 25, 1));

        final LootPool fishingFishLootPool = createLootPool(gameplayFishingFishEntries);

        // LootTable for SQUIDS
        final ArrayList<LootEntryItem> squidEntries = new ArrayList<LootEntryItem>();
        squidEntries.add(createLootEntryItem(ItemRegistry.calamarirawItem, 50, 1));
        squidEntries.add(createLootEntryItem(ItemRegistry.calamarirawItem, 25, 1));

        final LootPool squidLootPool = createLootPool(squidEntries);

        // Add all modified loot tables to hashmap
        additionalLoot.put(LootTableList.GAMEPLAY_FISHING_JUNK, fishingJunkLootPool);
        additionalLoot.put(LootTableList.GAMEPLAY_FISHING_FISH, fishingFishLootPool);
        additionalLoot.put(LootTableList.ENTITIES_SQUID, squidLootPool);
    }


    private static LootEntryItem createLootEntryItem(Item item, int weight, int quality) {
        return new LootEntryItem(item, weight, quality, new LootFunction[]{}, new LootCondition[]{});
    }

    private static LootPool createLootPool(List<LootEntryItem> lootEntryItems) {
        return new LootPool(
                lootEntryItems.toArray(new LootEntry[lootEntryItems.size()]),
                null, new RandomValueRange(1), new RandomValueRange(1));
    }
}
