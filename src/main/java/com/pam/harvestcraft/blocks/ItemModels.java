package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.blocks.blocks.BlockBaseGarden;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ItemModels {
    private static final HashMap<Item, ItemModelList> models = new HashMap<>();

    public static void preInit() {
        defineItemModels();
        prepareModels();
    }

    public static void init() {
        registerModels();
    }

    private static void defineItemModels() {

        for (BlockBaseGarden garden : BlockRegistry.gardens.values()) {
            registerItemModels(getItem(garden), new ItemModelList("gardens/")
                    .add(0, garden.getName()));
        }

        for (Crop crop : Crop.values()) {
            registerItemModels(getItem(crop.cropBlock()), new ItemModelList("crops/")
                    .add(0, crop.cropBlock().getStageId(0))
                    .add(1, crop.cropBlock().getStageId(1))
                    .add(2, crop.cropBlock().getStageId(2))
                    .add(3, crop.cropBlock().getStageId(3)));
        }
        for (Fruit fruit : Fruit.values()) {
            registerItemModels(getItem(fruit.sapling()), new ItemModelList("saplings/")
                    .add(0, fruit.sapling().getName()));

            registerItemModels(getItem(fruit.block()), new ItemModelList("fruits/")
                    .add(0, fruit.block().getStageId(0))
                    .add(1, fruit.block().getStageId(1))
                    .add(2, fruit.block().getStageId(2)));
        }

        for (FruitLog fruitLog : FruitLog.values()) {
            registerItemModels(getItem(fruitLog.sapling()), new ItemModelList("saplings/")
                    .add(0, fruitLog.sapling().getName()));

            registerItemModels(getItem(fruitLog.block()), new ItemModelList("fruits/")
                    .add(0, fruitLog.block().getStageId(0))
                    .add(1, fruitLog.block().getStageId(1))
                    .add(2, fruitLog.block().getStageId(2)));
        }
    }

    private static void registerItemModels(Item item, ItemModelList list) {
        models.put(item, list);
    }

    private static void prepareModels() {
        for (Map.Entry<Item, ItemModelList> entry : models.entrySet()) {
            Item item = entry.getKey();

            Collection<String> registrations = entry.getValue().getRegistrations().values();

            for (String registration : registrations) {
                if (item == null || registration == null) continue;

                ModelBakery.registerItemVariants(item, new ResourceLocation(registration));
            }
        }
    }

    private static void registerModels() {
        for (HashMap.Entry<Item, ItemModelList> entry : models.entrySet()) {
            Item item = entry.getKey();

            HashMap<Integer, String> registrations = entry.getValue().getRegistrations();

            for (Map.Entry<Integer, String> registration : registrations.entrySet()) {
                int meta = registration.getKey();
                String path = registration.getValue();

                ModelResourceLocation resource = new ModelResourceLocation(path, "inventory");

                Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, resource);
            }
        }
    }

    private static Item getItem(Block block) {
        return Item.getItemFromBlock(block);
    }
}
