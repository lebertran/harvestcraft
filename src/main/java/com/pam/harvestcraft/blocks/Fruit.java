package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.growables.BlockPamFruit;
import com.pam.harvestcraft.blocks.growables.BlockPamSapling;
import com.pam.harvestcraft.blocks.growables.BlockStage;
import com.pam.harvestcraft.blocks.growables.ItemBlockCropFruit;
import com.pam.harvestcraft.item.ItemRegistry;
import com.pam.harvestcraft.item.items.ItemPamFood;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.text.MessageFormat;

public enum Fruit implements IFruit {

    APPLE("apple", SaplingType.TEMPERATE),
    ALMOND("almond", SaplingType.WARM),
    APRICOT("apricot", SaplingType.WARM),
    AVOCADO("avocado", SaplingType.TEMPERATE),
    BANANA("banana", SaplingType.WARM),
    CASHEW("cashew", SaplingType.WARM),
    CHERRY("cherry", SaplingType.TEMPERATE),
    CHESTNUT("chestnut", SaplingType.TEMPERATE),
    COCONUT("coconut", SaplingType.WARM),
    DATE("date", SaplingType.WARM),
    DRAGONFRUIT("dragonfruit", SaplingType.WARM),
    DURIAN("durian", SaplingType.WARM),
    FIG("fig", SaplingType.WARM),
    GOOSEBERRY("gooseberry", SaplingType.TEMPERATE),
    GRAPEFRUIT("grapefruit", SaplingType.WARM),
    LEMON("lemon", SaplingType.WARM),
    LIME("lime", SaplingType.WARM),
    MANGO("mango", SaplingType.WARM),
    NUTMEG("nutmeg", SaplingType.TEMPERATE),
    OLIVE("olive", SaplingType.WARM),
    ORANGE("orange", SaplingType.WARM),
    PAPAYA("papaya", SaplingType.WARM),
    PEACH("peach", SaplingType.WARM),
    PEAR("pear", SaplingType.TEMPERATE),
    PECAN("pecan", SaplingType.WARM),
    PEPPERCORN("peppercorn", SaplingType.WARM),
    PERSIMMON("persimmon", SaplingType.WARM),
    PISTACHIO("pistachio", SaplingType.WARM),
    PLUM("plum", SaplingType.TEMPERATE),
    POMEGRANATE("pomegranate", SaplingType.WARM),
    STARFRUIT("starfruit", SaplingType.WARM),
    VANILLABEAN("vanillabean", SaplingType.WARM),
    WALNUT("walnut", SaplingType.TEMPERATE);

    private static final String FRUIT_BLOCK_NAME = "pam{0}";
    private static final String ITEM_NAME = "{0}Item";
    private static final String SAPLING_NAME = "{0}_sapling";

    private final String fruitName;
    private final SaplingType type;

    private Item yield;
    private BlockPamSapling sapling;
    private BlockPamFruit fruitBlock;

    private static boolean isInitialized = false;

    Fruit(final String fruitName, final SaplingType type) {
        this.fruitName = fruitName;
        this.type = type;
    }

    @Override
    public SaplingType type() {
        return this.type;
    }

    @Override
    public Item yield() {
        return this.yield;
    }

    @Override
    public BlockStage block() {
        return this.fruitBlock;
    }

    @Override
    public BlockPamSapling sapling() {
        return this.sapling;
    }

    private void setYield(final Item item) {
        this.yield = item;
    }

    private void setSapling(final BlockPamSapling sapling) {
        this.sapling = sapling;
    }

    private void setFruitBlock(final BlockPamFruit fruitBlock) {
        this.fruitBlock = fruitBlock;
    }

    public static void registerAll() {
        if (isInitialized) return;

        for (Fruit fruit : Fruit.values()) {
            fruit.register();
        }

        isInitialized = true;
    }

    private void register() {
        final String saplingName = MessageFormat.format(SAPLING_NAME, fruitName);
        final BlockPamSapling sapling = new BlockPamSapling(saplingName, this);
        final ItemBlock saplingItemBlock = new ItemBlock(sapling);
        BlockRegistry.registerBlock(saplingName, saplingItemBlock, sapling);

        setSapling(sapling);

        final BlockPamFruit pamFruit;
        switch (this) {
            case APPLE:
                pamFruit = new BlockPamFruit(sapling, Items.APPLE);
                setYield(Items.APPLE);
                break;
            default:
                final Item foodItem = new ItemPamFood(HarvestCraft.config.cropfoodRestore, HarvestCraft.config.snacksaturation);
                ItemRegistry.registerItem(foodItem, MessageFormat.format(ITEM_NAME, fruitName));
                setYield(foodItem);

                pamFruit = new BlockPamFruit(sapling, foodItem);
                break;
        }
        setFruitBlock(pamFruit);

        final ItemBlock itemBlock = new ItemBlockCropFruit(pamFruit);

        BlockRegistry.registerBlock(getFruitBlockName(fruitName), itemBlock, pamFruit);
    }

    private static String getFruitBlockName(String fruitName) {
        return MessageFormat.format(FRUIT_BLOCK_NAME, fruitName.substring(0, 1).toUpperCase() + fruitName.substring(1).toLowerCase());
    }
}
