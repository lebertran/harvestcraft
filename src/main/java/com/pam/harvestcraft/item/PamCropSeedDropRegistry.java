package com.pam.harvestcraft.item;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.CropRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import java.util.Map;

public class PamCropSeedDropRegistry {

    public static void getSeedDrops() {
        for (Map.Entry<String, Boolean> entry : HarvestCraft.config.seedDropFromGrass.entrySet()) {
            if (entry.getValue()) {
                final Item item = CropRegistry.getSeed(entry.getKey());

                MinecraftForge.addGrassSeed(new ItemStack(item, 1, 0), HarvestCraft.config.seedrarity);
            }
        }
    }
}


