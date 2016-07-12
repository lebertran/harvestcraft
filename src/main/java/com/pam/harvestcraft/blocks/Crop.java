package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.growables.BlockPamCrop;
import com.pam.harvestcraft.blocks.growables.ItemBlockCropFruit;
import com.pam.harvestcraft.item.ItemRegistry;
import com.pam.harvestcraft.item.items.ItemPamSeedFood;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;

import java.text.MessageFormat;

public enum Crop {
    BLACKBERRY("blackberry"),
    BLUEBERRY("blueberry"),
    CANDLEBERRY("candleberry"),
    RASPBERRY("raspberry"),
    STRAWBERRY("strawberry"),
    CACTUSFRUIT("cactusfruit"),
    ASPARAGUS("asparagus"),
    BARLEY("barley"),
    OATS("oats"),
    RYE("rye"),
    CORN("corn"),
    BAMBOOSHOOT("bambooshoot"),
    CANTALOUPE("cantaloupe"),
    CUCUMBER("cucumber"),
    WINTERSQUASH("wintersquash"),
    ZUCCHINI("zucchini"),
    BEET("beet"),
    ONION("onion"),
    PARSNIP("parsnip"),
    PEANUT("peanut"),
    RADISH("radish"),
    RUTABAGA("rutabaga"),
    SWEETPOTATO("sweetpotato"),
    TURNIP("turnip"),
    RHUBARB("rhubarb"),
    CELERY("celery"),
    GARLIC("garlic"),
    GINGER("ginger"),
    SPICELEAF("spiceleaf"),
    TEALEAF("tealeaf"),
    COFFEE("coffeebean"),
    MUSTARD("mustardseeds"),
    BROCCOLI("broccoli"),
    CAULIFLOWER("cauliflower"),
    LEEK("leek"),
    LETTUCE("lettuce"),
    SCALLION("scallion"),
    ARTICHOKE("artichoke"),
    BRUSSELSPROUT("brusselsprout"),
    CABBAGE("cabbage"),
    SPINACH("spinach"),
    WHITEMUSHROOM("whitemushroom"),
    BEAN("bean"),
    SOYBEAN("soybean"),
    BELLPEPPER("bellpepper"),
    CHILIPEPPER("chilipepper"),
    EGGPLANT("eggplant"),
    OKRA("okra"),
    PEAS("peas"),
    TOMATO("tomato"),
    COTTON("cotton", false),
    PINEAPPLE("pineapple"),
    GRAPE("grape"),
    KIWI("kiwi"),
    CRANBERRY("cranberry"),
    RICE("rice"),
    SEAWEED("seaweed"),
    CURRYLEAF("curryleaf"),
    SESAME("sesameseeds"),
    WATERCHESTNUT("waterchestnut");

    private final String cropName;
    private final boolean edible;

    private Item seed;
    private ItemPamSeedFood food;
    private BlockPamCrop cropBlock;

    Crop(final String cropName) {
        this(cropName, true);
    }

    Crop(final String cropName, final boolean edible) {
        this.cropName = cropName;
        this.edible = edible;
    }

    public static void registerAll() {
        if (isInitialized) return;

        for (final Crop crop : values()) {
            crop.register();
        }

        isInitialized = true;
    }

    public String getCropName() {
        return this.cropName;
    }

    public Item seed() {
        return this.seed;
    }

    public ItemSeedFood food() {
        return this.food;
    }

    public BlockPamCrop cropBlock() {
        return this.cropBlock;
    }

    private boolean isEdible() {
        return this.edible;
    }

    private void register() {
        final String registryName = MessageFormat.format(CROP_BLOCK_NAME, this.getCropName());

        final BlockPamCrop cropBlock = new BlockPamCrop(registryName, this);
        final ItemBlock cropItemBlock = new ItemBlockCropFruit(cropBlock);
        BlockRegistry.registerBlock(registryName, cropItemBlock, cropBlock);

        final ItemPamSeedFood foodItem = createItem(cropBlock);
        foodItem.setEdible(isEdible());
        ItemRegistry.registerItem(foodItem, MessageFormat.format(ITEM_NAME, this.getCropName()));

        final Item seedItem = createSeed(cropBlock);
        ItemRegistry.registerItem(seedItem, getSeedName());

        this.seed = seedItem;
        this.food = foodItem;
        this.cropBlock = cropBlock;
    }

    private static boolean isInitialized = false;

    private static final String CROP_BLOCK_NAME = "pam{0}Crop";
    private static final String ITEM_NAME = "{0}Item";
    private static final String SEED_ITEM_NAME = "{0}seedItem";

    //@workaround
    private String getSeedName() {
        // Some seeds were named inconsistently. To create compatibility with world running on
        // HarvestCraft before version 1.9b, we fix these names here.

        switch (this) {
            case COFFEE:
                return "coffeeseedItem";
            case MUSTARD:
                return "mustardseedItem";
            case TEALEAF:
                return "teaseedItem";
            default:
                return MessageFormat.format(SEED_ITEM_NAME, getCropName());
        }
    }

    private static ItemPamSeedFood createItem(BlockPamCrop cropBlock) {
        return new ItemPamSeedFood(HarvestCraft.config.cropfoodRestore, HarvestCraft.config.cropsaturationRestore, cropBlock);
    }

    private static Item createSeed(BlockPamCrop cropBlock) {
        return new ItemSeeds(cropBlock, Blocks.FARMLAND);
    }
}
