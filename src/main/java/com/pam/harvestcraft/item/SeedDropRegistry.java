package com.pam.harvestcraft.item;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.Crop;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import java.util.Map;

public class SeedDropRegistry {

    public static void getSeedDrops() {
        for (Map.Entry<Crop, Boolean> entry : HarvestCraft.config.seedDropFromGrass.entrySet()) {
            if (entry.getValue()) {
                final Item item = entry.getKey().seed();

                if (item == null) continue;

                MinecraftForge.addGrassSeed(new ItemStack(item, 1, 0), HarvestCraft.config.seedrarity);
            }
        }
    }
}


