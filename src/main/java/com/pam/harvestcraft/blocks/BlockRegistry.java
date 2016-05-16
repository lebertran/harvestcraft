package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.blocks.gardens.*;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Arrays;

public final class BlockRegistry {

    // Market blocks
    public static Block pamMarket;

    // Garden blocks
    public static AridGardenBlock aridGardenBlock;
    public static FrostGardenBlock frostGardenBlock;
    public static TropicalGardenBlock tropicalGardenBlock;
    public static WindyGardenBlock windyGardenBlock;
    public static ShadedGardenBlock shadedGardenBlock;
    public static SoggyGardenBlock soggyGardenBlock;

    public static final ArrayList<BlockBaseGarden> gardens = new ArrayList<>();

    public static ItemBlock marketItemBlock;
    public static final String marketItemName = "market";

    public static void loadBlockRegistry() {
        registerMarket();
        registerGardens();
    }

    private static void registerMarket() {
        pamMarket = new BlockPamMarket().setHardness(1.0F).setResistance(1.0F);
        marketItemBlock = new ItemBlock(pamMarket);
        ItemRegistry.items.put(marketItemName, marketItemBlock);

        registerBlock(marketItemName, marketItemBlock, pamMarket);
    }

    private static void registerGardens() {
        aridGardenBlock = new AridGardenBlock();
        frostGardenBlock = new FrostGardenBlock();
        tropicalGardenBlock = new TropicalGardenBlock();
        windyGardenBlock = new WindyGardenBlock();
        shadedGardenBlock = new ShadedGardenBlock();
        soggyGardenBlock = new SoggyGardenBlock();

        addGardens(aridGardenBlock, frostGardenBlock, tropicalGardenBlock, windyGardenBlock, shadedGardenBlock, soggyGardenBlock);
    }


    private static void registerBlock(String registerName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(registerName);
        block.setUnlocalizedName(registerName);

        GameRegistry.register(block);

        itemBlock.setRegistryName(registerName);
        itemBlock.setUnlocalizedName(registerName);
        GameRegistry.register(itemBlock);
    }

    public static void registerBlock(String registerName, Block block) {
        final ItemBlock itemBlock = new ItemBlock(block);
        registerBlock(registerName, itemBlock, block);
    }

    public static void addGardens(BlockBaseGarden... gardensToAdd) {
        gardens.addAll(Arrays.asList(gardensToAdd));
    }
}
