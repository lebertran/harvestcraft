package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.growables.BlockPamFruitLog;
import com.pam.harvestcraft.blocks.growables.BlockPamSapling;
import com.pam.harvestcraft.blocks.growables.BlockStage;
import com.pam.harvestcraft.blocks.growables.ItemBlockCropFruit;
import com.pam.harvestcraft.item.ItemRegistry;
import com.pam.harvestcraft.item.items.ItemPamFood;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.text.MessageFormat;

public enum FruitLog implements IFruit{
    CINNAMON("cinnamon", SaplingType.WARM),
    MAPLE("maple", SaplingType.COLD),
    PAPERBARK("paperbark", SaplingType.WARM);

    private static final String FRUIT_BLOCK_NAME = "pam{0}";
    private static final String ITEM_NAME = "{0}Item";
    private static final String SAPLING_NAME = "{0}_sapling";

    private static boolean isInitialized = false;

    private final String fruitName;
    private final SaplingType type;

    private BlockPamSapling sapling;
    private Item yield;
    private BlockPamFruitLog logBlock;

    FruitLog(final String fruitName, final SaplingType type) {
        this.fruitName = fruitName;
        this.type = type;
    }

    @Override
    public SaplingType type() {
        return this.type;
    }

    private void setYield(final Item item) {
        this.yield = item;
    }

    private void setSapling(final BlockPamSapling sapling) {
        this.sapling = sapling;
    }

    private void setLogBlock(final BlockPamFruitLog logBlock) {
        this.logBlock = logBlock;
    }

    @Override
    public BlockPamSapling sapling() {
        return this.sapling;
    }

    @Override
    public Item yield() {
        return this.yield;
    }

    @Override
    public BlockStage block() {
        return this.logBlock;
    }

    public static void registerAll() {
        if (isInitialized) {
            return;
        }

        for (FruitLog fruitLog : FruitLog.values()) {
            fruitLog.register();
        }

        isInitialized = true;
    }

    private void register() {
        final String saplingName = MessageFormat.format(SAPLING_NAME, fruitName);
        final BlockPamSapling sapling = new BlockPamSapling(saplingName, this);
        final ItemBlock saplingItemBlock = new ItemBlock(sapling);
        BlockRegistry.registerBlock(saplingName, saplingItemBlock, sapling);

        setSapling(sapling);

        final BlockPamFruitLog pamFruit;
        switch (this) {
            case PAPERBARK:
                pamFruit = new BlockPamFruitLog(sapling, Items.PAPER);
                setYield(Items.PAPER);
                break;
            default:
                final Item foodItem = new ItemPamFood(HarvestCraft.config.cropfoodRestore, HarvestCraft.config.snacksaturation);
                ItemRegistry.registerItem(foodItem, getItemName());
                setYield(foodItem);

                pamFruit = new BlockPamFruitLog(sapling, foodItem);
                break;
        }
        setLogBlock(pamFruit);

        final ItemBlock itemBlock = new ItemBlockCropFruit(pamFruit);

        BlockRegistry.registerBlock(getFruitBlockName(fruitName), itemBlock, pamFruit);
    }

    private static String getFruitBlockName(String fruitName) {
        return MessageFormat.format(FRUIT_BLOCK_NAME, fruitName.substring(0, 1).toUpperCase() + fruitName.substring(1).toLowerCase());
    }

    private String getItemName() {
        // For some reason, the item for maple trees is maplesyrupItem, not mapleItem.
        // We fix this here.
        if (equals(MAPLE)) return "maplesyrupItem";

        return MessageFormat.format(ITEM_NAME, fruitName);
    }
}
