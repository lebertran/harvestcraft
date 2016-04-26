package com.pam.harvestcraft.item;

import com.pam.harvestcraft.handlers.CustomLootPool;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.KilledByPlayer;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;

import java.util.ArrayList;

public class LootHelper {
    public static final ArrayList<CustomLootPool> addtionalLootPools = new ArrayList<CustomLootPool>();

    static {
        // LootTable for GAMEPLAY_FISHING_JUNK
        final ArrayList<LootEntryItem> gameplayFishingJunkEntries = new ArrayList<LootEntryItem>();
        gameplayFishingJunkEntries.add(createLootEntryItem(ItemRegistry.seaweedItem, 10, 0));

        addtionalLootPools.add(new CustomLootPool(
                LootTableList.GAMEPLAY_FISHING_JUNK,
                gameplayFishingJunkEntries, false));

        // LootTable for GAMEPLAY_FISHING_FISH
        final ArrayList<LootEntryItem> gameplayFishingFishEntries = new ArrayList<LootEntryItem>();
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.anchovyrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.bassrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.carprawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.catfishrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.charrrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.eelrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.greenheartfishItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.grouperrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.herringrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.jellyfishrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.mudfishrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.octopusrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.perchrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.snapperrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.tilapiarawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.troutrawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.tunarawItem, 25, 0));
        gameplayFishingFishEntries.add(createLootEntryItem(ItemRegistry.walleyerawItem, 25, 0));

        addtionalLootPools.add(new CustomLootPool(
                LootTableList.GAMEPLAY_FISHING_FISH,
                gameplayFishingFishEntries, false));

        // LootTable for SQUIDS
        final ArrayList<LootEntryItem> squidEntries = new ArrayList<LootEntryItem>();
        squidEntries.add(createLootEntryItem(ItemRegistry.calamarirawItem, 50, 0,
                new LootFunction[]{new SetCount(new LootCondition[]{}, new RandomValueRange(1,2))},
                new KilledByPlayer(false)));

        addtionalLootPools.add(new CustomLootPool(
                LootTableList.ENTITIES_SQUID,
                squidEntries, true));
    }


    private static LootEntryItem createLootEntryItem(Item item, int weight, int quality) {
        return createLootEntryItem(item, weight, quality, new LootFunction[]{}, new LootCondition[] {});
    }

    private static LootEntryItem createLootEntryItem(Item item, int weight, int quality, LootFunction[] lootFunctions, LootCondition... lootConditions) {
        return new LootEntryItem(item, weight, quality, lootFunctions, lootConditions);
    }
}
