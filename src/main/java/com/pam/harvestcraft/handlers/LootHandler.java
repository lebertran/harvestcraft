package com.pam.harvestcraft.handlers;

import com.pam.harvestcraft.item.LootHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableManager;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Modified functions from github.com/cyanobacterium/AdditionalLootTables
 * <p>
 * mostly (C) 2016 Chris Hall under the MIT License
 */
public class LootHandler {
    private static LootTableManager reference = null;

    public static void init(final LootTableManager lootTableManager) {
        synchronized (lootTableManager) {
            if (lootTableManager == reference) return;
            reference = lootTableManager;

            for (ResourceLocation key : LootHelper.additionalLoot.keySet()) {
                LootTable vanillaLootTable = lootTableManager.getLootTableFromLocation(key);

                try {
                    addPoolsToLootTable(vanillaLootTable, LootHelper.additionalLoot.get(key));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static LootPool[] getPoolsFromLootTable(LootTable lootTable) throws
            IllegalAccessException, NoSuchFieldException {
        Field[] fields = LootTable.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().isArray() &&
                    field.getType().getComponentType().isAssignableFrom(LootPool.class)) {
                field.setAccessible(true);

                return (LootPool[]) field.get(lootTable);
            }
        }

        throw new NoSuchFieldException("Could not find LootPool[] field in LootTable");
    }

    public static void addPoolsToLootTable(LootTable lootTable, LootPool lootPool)
            throws IllegalAccessException, NoSuchFieldException {
        LootPool[] vanillaLootPools = getPoolsFromLootTable(lootTable);

        List<LootPool> newLootPoolsList = new ArrayList<LootPool>();
        newLootPoolsList.addAll(Arrays.asList(vanillaLootPools));
        newLootPoolsList.add(lootPool);

        LootPool[] newLootPools = newLootPoolsList.toArray(new LootPool[newLootPoolsList.size()]);

        Field[] fields = LootTable.class.getDeclaredFields();

        for (Field field : fields) {
            if (field.getType().isArray() &&
                    field.getType().getComponentType().isAssignableFrom(LootPool.class)) {
                field.setAccessible(true);

                Field newField = Field.class.getDeclaredField("modifiers");
                newField.setAccessible(true);
                newField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                field.set(lootTable, newLootPools);
                break;
            }
        }
    }
}
