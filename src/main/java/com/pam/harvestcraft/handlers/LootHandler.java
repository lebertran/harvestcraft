package com.pam.harvestcraft.handlers;

import com.pam.harvestcraft.item.LootHelper;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;

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

            for (CustomLootPool customLootPool : LootHelper.addtionalLootPools) {
                final LootTable vanillaLootTable =
                        lootTableManager.getLootTableFromLocation(customLootPool.getResourceLocation());

                try {
                    addPoolsToLootTable(vanillaLootTable, customLootPool);
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
    private static LootEntry[] getVanillaLootEntries(LootPool[] vanillaLootPools) throws IllegalAccessException,
            NoSuchFieldException{
        // We now assume that there is only one LootPool (element 0) so that loots are added to that LootPool.
        // Other LootPools are just appended it the new LootPools array

        Field[] fields = LootPool.class.getDeclaredFields();

        for (Field field : fields) {
            if (field.getType().isArray() && field.getType().getComponentType().isAssignableFrom(LootPool.class)) {
                field.setAccessible(true);

                return (LootEntry[]) field.get(vanillaLootPools[0]);
            }
        }

        throw new NoSuchFieldException("Could not find LootPool[] field in LootTable");

    }

    private static LootPool mergeLootPools(final LootPool basePool, final LootEntryItem[] lootEntries) throws IllegalAccessException {
        final Field[] fields = LootPool.class.getDeclaredFields();

        List<LootEntry> baseLootEntries = new ArrayList<LootEntry>();
        LootCondition[] baseLootConditions = new LootCondition[] {};
        RandomValueRange baseRolls = new RandomValueRange(1);
        RandomValueRange baseBonusRolls = new RandomValueRange(0);

        for (Field field : fields) {
            if (field.getType().isArray()) {
                if (field.getType().isAssignableFrom(LootEntry.class)) {
                    field.setAccessible(true);
                    baseLootEntries = Arrays.asList((LootEntry[]) field.get(basePool));
                } else if (field.getType().isAssignableFrom(LootCondition.class)) {
                    field.setAccessible(true);
                    baseLootConditions = (LootCondition[]) field.get(basePool);
                }
            } else {
                if (field.getType().isAssignableFrom(RandomValueRange.class)) {
                    if (field.getName().equals("rolls")) {
                        field.setAccessible(true);
                        baseRolls = (RandomValueRange) field.get(basePool);
                    } else if (field.getName().equals("bonusRolls")) {
                        field.setAccessible(true);
                        baseBonusRolls = (RandomValueRange) field.get(basePool);
                    }
                }
            }
        }

        baseLootEntries.addAll(Arrays.asList(lootEntries));

        return new LootPool(baseLootEntries.toArray(new LootEntry[baseLootEntries.size()]), baseLootConditions, baseRolls, baseBonusRolls);
    }


    public static void addPoolsToLootTable(LootTable lootTable, CustomLootPool lootPool)
            throws IllegalAccessException, NoSuchFieldException {
        final LootPool[] vanillaLootPools = getPoolsFromLootTable(lootTable);

        final ArrayList<LootPool> newLootPoolsList = new ArrayList<LootPool>();
        newLootPoolsList.addAll(Arrays.asList(vanillaLootPools));

        if (lootPool.isSeperateLootPool()) {
            newLootPoolsList.add(lootPool.createDefaultLootPool());
        } else {
            newLootPoolsList.set(0, mergeLootPools(vanillaLootPools[0], lootPool.getLootEntries()));
        }

        final LootPool[] newLootPools = newLootPoolsList.toArray(new LootPool[newLootPoolsList.size()]);

        final Field[] fields = LootTable.class.getDeclaredFields();

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
