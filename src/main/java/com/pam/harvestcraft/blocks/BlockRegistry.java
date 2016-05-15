package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.blocks.gardens.*;
import com.pam.harvestcraft.blocks.growables.BlockPamCrop;
import com.pam.harvestcraft.blocks.growables.BlockPamFruit;
import com.pam.harvestcraft.blocks.growables.BlockPamLogFruit;
import com.pam.harvestcraft.blocks.growables.ItemBlockFruit;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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

    public static final ArrayList<BlockPamSapling> temperateSaplings = new ArrayList<>();
    public static final ArrayList<BlockPamSapling> warmSaplings = new ArrayList<>();
    public static final ArrayList<BlockPamSapling> logSaplings = new ArrayList<>();
    public static final ArrayList<BlockPamSapling> saplings = new ArrayList<>();
    public static final ArrayList<BlockBaseGarden> gardens = new ArrayList<>();
    public static final ArrayList<BlockPamCrop> crops = new ArrayList<>();
    public static final ArrayList<BlockPamFruit> fruits = new ArrayList<>();
    public static final ArrayList<BlockPamLogFruit> logFruits = new ArrayList<>();

    // Crops
    public static Block pamblackberryCrop;
    public static Block pamblueberryCrop;
    public static Block pamcandleberryCrop;
    public static Block pamraspberryCrop;
    public static Block pamstrawberryCrop;
    public static Block pamcactusfruitCrop;
    public static Block pamasparagusCrop;
    public static Block pambarleyCrop;
    public static Block pamoatsCrop;
    public static Block pamryeCrop;
    public static Block pamcornCrop;
    public static Block pambambooshootCrop;
    public static Block pamcantaloupeCrop;
    public static Block pamcucumberCrop;
    public static Block pamwintersquashCrop;
    public static Block pamzucchiniCrop;
    public static Block pambeetCrop;
    public static Block pamonionCrop;
    public static Block pamparsnipCrop;
    public static Block pampeanutCrop;
    public static Block pamradishCrop;
    public static Block pamrutabagaCrop;
    public static Block pamsweetpotatoCrop;
    public static Block pamturnipCrop;
    public static Block pamrhubarbCrop;
    public static Block pamceleryCrop;
    public static Block pamgarlicCrop;
    public static Block pamgingerCrop;
    public static Block pamspiceleafCrop;
    public static Block pamtealeafCrop;
    public static Block pamcoffeebeanCrop;
    public static Block pammustardseedsCrop;
    public static Block pambroccoliCrop;
    public static Block pamcauliflowerCrop;
    public static Block pamleekCrop;
    public static Block pamlettuceCrop;
    public static Block pamscallionCrop;
    public static Block pamartichokeCrop;
    public static Block pambrusselsproutCrop;
    public static Block pamcabbageCrop;
    public static Block pamspinachCrop;
    public static Block pamwhitemushroomCrop;
    public static Block pambeanCrop;
    public static Block pamsoybeanCrop;
    public static Block pambellpepperCrop;
    public static Block pamchilipepperCrop;
    public static Block pameggplantCrop;
    public static Block pamokraCrop;
    public static Block pampeasCrop;
    public static Block pamtomatoCrop;
    public static Block pamcottonCrop;
    public static Block pampineappleCrop;
    public static Block pamgrapeCrop;
    public static Block pamkiwiCrop;
    public static Block pamcranberryCrop;
    public static Block pamriceCrop;
    public static Block pamseaweedCrop;
    public static Block pamcurryleafCrop;
    public static Block pamsesameseedsCrop;
    public static Block pamwaterchestnutCrop;

    // Tree fruits
    public static BlockPamFruit pamApple;
    public static BlockPamFruit pamAlmond;
    public static BlockPamFruit pamApricot;
    public static BlockPamFruit pamAvocado;
    public static BlockPamFruit pamBanana;
    public static BlockPamFruit pamCashew;
    public static BlockPamFruit pamCherry;
    public static BlockPamFruit pamChestnut;
    public static BlockPamLogFruit pamCinnamon;
    public static BlockPamFruit pamCoconut;
    public static BlockPamFruit pamDate;
    public static BlockPamFruit pamDragonfruit;
    public static BlockPamFruit pamDurian;
    public static BlockPamFruit pamFig;
    public static BlockPamFruit pamGooseberry;
    public static BlockPamFruit pamGrapefruit;
    public static BlockPamFruit pamLemon;
    public static BlockPamFruit pamLime;
    public static BlockPamLogFruit pamMaple;
    public static BlockPamFruit pamMango;
    public static BlockPamFruit pamNutmeg;
    public static BlockPamFruit pamOlive;
    public static BlockPamFruit pamOrange;
    public static BlockPamFruit pamPapaya;
    public static BlockPamLogFruit pamPaperbark;
    public static BlockPamFruit pamPeach;
    public static BlockPamFruit pamPear;
    public static BlockPamFruit pamPecan;
    public static BlockPamFruit pamPeppercorn;
    public static BlockPamFruit pamPersimmon;
    public static BlockPamFruit pamPistachio;
    public static BlockPamFruit pamPlum;
    public static BlockPamFruit pamPomegranate;
    public static BlockPamFruit pamStarfruit;
    public static BlockPamFruit pamVanillabean;
    public static BlockPamFruit pamWalnut;

    public static ItemBlock marketItemBlock;
    public static final String marketItemName = "market";

    public static void loadBlockRegistry() {
        registerMarket();
        registerGardens();
        registerCrops();
        registerFruitAndSaplings();
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

    private static void registerCrops() {
        pamblackberryCrop = registerBlockCrop("pamblackberryCrop");
        pamblueberryCrop = registerBlockCrop("pamblueberryCrop");
        pamcandleberryCrop = registerBlockCrop("pamcandleberryCrop");
        pamraspberryCrop = registerBlockCrop("pamraspberryCrop");
        pamstrawberryCrop = registerBlockCrop("pamstrawberryCrop");
        pamcactusfruitCrop = registerBlockCrop("pamcactusfruitCrop");
        pamasparagusCrop = registerBlockCrop("pamasparagusCrop");
        pambarleyCrop = registerBlockCrop("pambarleyCrop");
        pamoatsCrop = registerBlockCrop("pamoatsCrop");
        pamryeCrop = registerBlockCrop("pamryeCrop");
        pamcornCrop = registerBlockCrop("pamcornCrop");
        pambambooshootCrop = registerBlockCrop("pambambooshootCrop");
        pamcantaloupeCrop = registerBlockCrop("pamcantaloupeCrop");
        pamcucumberCrop = registerBlockCrop("pamcucumberCrop");
        pamwintersquashCrop = registerBlockCrop("pamwintersquashCrop");
        pamzucchiniCrop = registerBlockCrop("pamzucchiniCrop");
        pambeetCrop = registerBlockCrop("pambeetCrop");
        pamonionCrop = registerBlockCrop("pamonionCrop");
        pamparsnipCrop = registerBlockCrop("pamparsnipCrop");
        pampeanutCrop = registerBlockCrop("pampeanutCrop");
        pamradishCrop = registerBlockCrop("pamradishCrop");
        pamrutabagaCrop = registerBlockCrop("pamrutabagaCrop");
        pamsweetpotatoCrop = registerBlockCrop("pamsweetpotatoCrop");
        pamturnipCrop = registerBlockCrop("pamturnipCrop");
        pamrhubarbCrop = registerBlockCrop("pamrhubarbCrop");
        pamceleryCrop = registerBlockCrop("pamceleryCrop");
        pamgarlicCrop = registerBlockCrop("pamgarlicCrop");
        pamgingerCrop = registerBlockCrop("pamgingerCrop");
        pamspiceleafCrop = registerBlockCrop("pamspiceleafCrop");
        pamtealeafCrop = registerBlockCrop("pamtealeafCrop");
        pamcoffeebeanCrop = registerBlockCrop("pamcoffeebeanCrop");
        pammustardseedsCrop = registerBlockCrop("pammustardseedsCrop");
        pambroccoliCrop = registerBlockCrop("pambroccoliCrop");
        pamcauliflowerCrop = registerBlockCrop("pamcauliflowerCrop");
        pamleekCrop = registerBlockCrop("pamleekCrop");
        pamlettuceCrop = registerBlockCrop("pamlettuceCrop");
        pamscallionCrop = registerBlockCrop("pamscallionCrop");
        pamartichokeCrop = registerBlockCrop("pamartichokeCrop");
        pambrusselsproutCrop = registerBlockCrop("pambrusselsproutCrop");
        pamcabbageCrop = registerBlockCrop("pamcabbageCrop");
        pamspinachCrop = registerBlockCrop("pamspinachCrop");
        pamwhitemushroomCrop = registerBlockCrop("pamwhitemushroomCrop");
        pambeanCrop = registerBlockCrop("pambeanCrop");
        pamsoybeanCrop = registerBlockCrop("pamsoybeanCrop");
        pambellpepperCrop = registerBlockCrop("pambellpepperCrop");
        pamchilipepperCrop = registerBlockCrop("pamchilipepperCrop");
        pameggplantCrop = registerBlockCrop("pameggplantCrop");
        pamokraCrop = registerBlockCrop("pamokraCrop");
        pampeasCrop = registerBlockCrop("pampeasCrop");
        pamtomatoCrop = registerBlockCrop("pamtomatoCrop");
        pamcottonCrop = registerBlockCrop("pamcottonCrop");
        pampineappleCrop = registerBlockCrop("pampineappleCrop");
        pamgrapeCrop = registerBlockCrop("pamgrapeCrop");
        pamkiwiCrop = registerBlockCrop("pamkiwiCrop");
        pamcranberryCrop = registerBlockCrop("pamcranberryCrop");
        pamriceCrop = registerBlockCrop("pamriceCrop");
        pamseaweedCrop = registerBlockCrop("pamseaweedCrop");
        pamcurryleafCrop = registerBlockCrop("pamcurryleafCrop");
        pamsesameseedsCrop = registerBlockCrop("pamsesameseedsCrop");
        pamwaterchestnutCrop = registerBlockCrop("pamwaterchestnutCrop");
    }

    private static void registerFruitAndSaplings() {
        pamCinnamon = registerBlockLogFruit("pamCinnamon", "cinnamon_sapling", BlockPamSapling.SaplingType.WARM, "cinnamonItem");
        pamMaple = registerBlockLogFruit("pamMaple", "maple_sapling", BlockPamSapling.SaplingType.COLD, "maplesyrupItem");
        pamPaperbark = registerBlockLogFruit("pamPaperbark", "paperbark_sapling", BlockPamSapling.SaplingType.WARM, Items.paper);
        pamApple = registerBlockFruit("pamApple", "apple_sapling", BlockPamSapling.SaplingType.TEMPERATE, Items.apple);
        pamAlmond = registerBlockFruit("pamAlmond", "almond_sapling", BlockPamSapling.SaplingType.WARM, "almondItem");
        pamApricot = registerBlockFruit("pamApricot", "apricot_sapling", BlockPamSapling.SaplingType.WARM, "apricotItem");
        pamAvocado = registerBlockFruit("pamAvocado", "avocado_sapling", BlockPamSapling.SaplingType.TEMPERATE, "avocadoItem");
        pamBanana = registerBlockFruit("pamBanana", "banana_sapling", BlockPamSapling.SaplingType.WARM, "bananaItem");
        pamCashew = registerBlockFruit("pamCashew", "cashew_sapling", BlockPamSapling.SaplingType.WARM, "cashewItem");
        pamCherry = registerBlockFruit("pamCherry", "cherry_sapling", BlockPamSapling.SaplingType.TEMPERATE, "cherryItem");
        pamChestnut = registerBlockFruit("pamChestnut", "chestnut_sapling", BlockPamSapling.SaplingType.TEMPERATE, "chestnutItem");
        pamCoconut = registerBlockFruit("pamCoconut", "coconut_sapling", BlockPamSapling.SaplingType.WARM, "coconutItem");
        pamDate = registerBlockFruit("pamDate", "date_sapling", BlockPamSapling.SaplingType.WARM, "dateItem");
        pamDragonfruit = registerBlockFruit("pamDragonfruit", "dragonfruit_sapling", BlockPamSapling.SaplingType.WARM, "dragonfruitItem");
        pamDurian = registerBlockFruit("pamDurian", "durian_sapling", BlockPamSapling.SaplingType.WARM, "durianItem");
        pamFig = registerBlockFruit("pamFig", "fig_sapling", BlockPamSapling.SaplingType.WARM, "figItem");
        pamGooseberry = registerBlockFruit("pamGooseberry", "gooseberry_sapling", BlockPamSapling.SaplingType.TEMPERATE, "gooseberryItem");
        pamGrapefruit = registerBlockFruit("pamGrapefruit", "grapefruit_sapling", BlockPamSapling.SaplingType.WARM, "grapefruitItem");
        pamLemon = registerBlockFruit("pamLemon", "lemon_sapling", BlockPamSapling.SaplingType.WARM, "lemonItem");
        pamLime = registerBlockFruit("pamLime", "lime_sapling", BlockPamSapling.SaplingType.WARM, "limeItem");
        pamMango = registerBlockFruit("pamMango", "mango_sapling", BlockPamSapling.SaplingType.WARM, "mangoItem");
        pamNutmeg = registerBlockFruit("pamNutmeg", "nutmeg_sapling", BlockPamSapling.SaplingType.TEMPERATE, "nutmegItem");
        pamOlive = registerBlockFruit("pamOlive", "olive_sapling", BlockPamSapling.SaplingType.WARM, "oliveItem");
        pamOrange = registerBlockFruit("pamOrange", "orange_sapling", BlockPamSapling.SaplingType.WARM, "orangeItem");
        pamPapaya = registerBlockFruit("pamPapaya", "papaya_sapling", BlockPamSapling.SaplingType.WARM, "papayaItem");
        pamPeach = registerBlockFruit("pamPeach", "peach_sapling", BlockPamSapling.SaplingType.WARM, "peachItem");
        pamPear = registerBlockFruit("pamPear", "pear_sapling", BlockPamSapling.SaplingType.TEMPERATE, "pearItem");
        pamPecan = registerBlockFruit("pamPecan", "pecan_sapling", BlockPamSapling.SaplingType.WARM, "pecanItem");
        pamPeppercorn = registerBlockFruit("pamPeppercorn", "peppercorn_sapling", BlockPamSapling.SaplingType.WARM, "peppercornItem");
        pamPersimmon = registerBlockFruit("pamPersimmon", "persimmon_sapling", BlockPamSapling.SaplingType.WARM, "persimmonItem");
        pamPistachio = registerBlockFruit("pamPistachio", "pistachio_sapling", BlockPamSapling.SaplingType.WARM, "pistachioItem");
        pamPlum = registerBlockFruit("pamPlum", "plum_sapling", BlockPamSapling.SaplingType.TEMPERATE, "plumItem");
        pamPomegranate = registerBlockFruit("pamPomegranate", "pomegranate_sapling", BlockPamSapling.SaplingType.WARM, "pomegranateItem");
        pamStarfruit = registerBlockFruit("pamStarfruit", "starfruit_sapling", BlockPamSapling.SaplingType.WARM, "starfruitItem");
        pamVanillabean = registerBlockFruit("pamVanillabean", "vanillabean_sapling", BlockPamSapling.SaplingType.WARM, "vanillabeanItem");
        pamWalnut = registerBlockFruit("pamWalnut", "walnut_sapling", BlockPamSapling.SaplingType.TEMPERATE, "walnutItem");

        saplings.addAll(logSaplings);
        saplings.addAll(temperateSaplings);
        saplings.addAll(warmSaplings);
    }

    private static Block registerBlockCrop(String registerName) {
        final BlockPamCrop pamCrop = new BlockPamCrop(registerName);
        final ItemBlock itemBlock = new ItemBlockFruit(pamCrop);

        crops.add(pamCrop);

        return registerBlock(registerName, itemBlock, pamCrop);
    }

    private static BlockPamFruit registerBlockFruit(String registerName, String sapling_name, BlockPamSapling.SaplingType saplingType, String fruit) {
        final BlockPamSapling pamSapling = new BlockPamSapling(sapling_name, saplingType);
        BlockRegistry.registerBlock(sapling_name, pamSapling);

        if (saplingType.equals(BlockPamSapling.SaplingType.TEMPERATE)) {
            temperateSaplings.add(pamSapling);
        } else if (saplingType.equals(BlockPamSapling.SaplingType.WARM)) {
            warmSaplings.add(pamSapling);
        }

        final BlockPamFruit pamFruit = new BlockPamFruit(pamSapling, fruit);
        final ItemBlock itemBlock = new ItemBlockFruit(pamFruit);

        pamSapling.setFruit(pamFruit);
        fruits.add(pamFruit);


        return (BlockPamFruit) registerBlock(registerName, itemBlock, pamFruit);
    }

    /**
     * Only use these for vanilla items.
     */
    private static BlockPamFruit registerBlockFruit(String registerName, String sapling_name, BlockPamSapling.SaplingType saplingType, Item fruit) {
        final BlockPamSapling pamSapling = new BlockPamSapling(sapling_name, saplingType);
        BlockRegistry.registerBlock(sapling_name, pamSapling);

        if (saplingType.equals(BlockPamSapling.SaplingType.TEMPERATE)) {
            temperateSaplings.add(pamSapling);
        } else if (saplingType.equals(BlockPamSapling.SaplingType.WARM)) {
            warmSaplings.add(pamSapling);
        }

        final BlockPamFruit pamFruit = new BlockPamFruit(pamSapling, fruit);
        final ItemBlock itemBlock = new ItemBlockFruit(pamFruit);

        pamSapling.setFruit(pamFruit);
        fruits.add(pamFruit);


        return (BlockPamFruit) registerBlock(registerName, itemBlock, pamFruit);
    }

    private static BlockPamLogFruit registerBlockLogFruit(String registerName, String saplingName, BlockPamSapling.SaplingType saplingType, String fruit) {
        final BlockPamSapling pamSapling = new BlockPamSapling(saplingName, saplingType);
        BlockRegistry.registerBlock(saplingName, pamSapling);
        logSaplings.add(pamSapling);

        final BlockPamLogFruit pamLogFruit = new BlockPamLogFruit(pamSapling, fruit);
        final ItemBlock itemBlock = new ItemBlockFruit(pamLogFruit);

        logFruits.add(pamLogFruit);
        pamSapling.setFruit(pamLogFruit);

        return (BlockPamLogFruit) registerBlock(registerName, itemBlock, pamLogFruit);
    }

    /**
     * Only use these for vanilla items.
     */
    private static BlockPamLogFruit registerBlockLogFruit(String registerName, String saplingName, BlockPamSapling.SaplingType saplingType, Item fruit) {
        final BlockPamSapling pamSapling = new BlockPamSapling(saplingName, saplingType);
        BlockRegistry.registerBlock(saplingName, pamSapling);
        logSaplings.add(pamSapling);

        final BlockPamLogFruit pamLogFruit = new BlockPamLogFruit(pamSapling, fruit);
        final ItemBlock itemBlock = new ItemBlockFruit(pamLogFruit);

        logFruits.add(pamLogFruit);
        pamSapling.setFruit(pamLogFruit);

        return (BlockPamLogFruit) registerBlock(registerName, itemBlock, pamLogFruit);
    }

    private static Block registerBlock(String registerName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(registerName);
        block.setUnlocalizedName(registerName);

        GameRegistry.register(block);

        itemBlock.setRegistryName(registerName);
        itemBlock.setUnlocalizedName(registerName);
        GameRegistry.register(itemBlock);

        return block;
    }

    public static void registerBlock(String registerName, Block block) {
        final ItemBlock itemBlock = new ItemBlock(block);
        registerBlock(registerName, itemBlock, block);
    }

    public static void addGardens(BlockBaseGarden... gardensToAdd) {
        gardens.addAll(Arrays.asList(gardensToAdd));
    }
}
