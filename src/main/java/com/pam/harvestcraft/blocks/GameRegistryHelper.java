package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GameRegistryHelper {
    public static void registerBlock(Block block, String registryName) {
        block.setCreativeTab(HarvestCraft.modTab);
        block.setUnlocalizedName(registryName);

        GameRegistry.register(block.setRegistryName(registryName));
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
}
