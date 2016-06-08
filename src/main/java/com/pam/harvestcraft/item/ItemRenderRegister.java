package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.FruitRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.FMLLog;

public final class ItemRenderRegister {

    public static void registerItemRenderer() {
        for (Item item : ItemRegistry.items.values()) {
            register(item);
        }
    }

    private static void register(final Item item) {
        final String resName = item.getRegistryName().toString();

        final ModelResourceLocation res =
                new ModelResourceLocation(resName, "inventory");
        Minecraft.getMinecraft().getRenderItem().
                getItemModelMesher().register(item, 0, res);
    }
}
