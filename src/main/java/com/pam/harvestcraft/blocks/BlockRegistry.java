package com.pam.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class BlockRegistry {
    // Garden blocks
    public static Block aridGardenBlock;
    public static Block frostGardenBlock;
    public static Block tropicalGardenBlock;
    public static Block windyGardenBlock;
    public static Block shadedGardenBlock;
    public static Block soggyGardenBlock;

    // Sapling lists
    public static Block[] PamTemperateSaplings;
    public static Block[] PamWarmSaplings;
    public static Block[] PamLogSaplings;

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

    // Tree fruits and saplings
    public static Block pamApple;
    public static Block pamappleSapling;
    public static Block pamAlmond;
    public static Block pamalmondSapling;
    public static Block pamApricot;
    public static Block pamapricotSapling;
    public static Block pamAvocado;
    public static Block pamavocadoSapling;
    public static Block pamBanana;
    public static Block pambananaSapling;
    public static Block pamCashew;
    public static Block pamcashewSapling;
    public static Block pamCherry;
    public static Block pamcherrySapling;
    public static Block pamChestnut;
    public static Block pamchestnutSapling;
    public static Block pamCinnamon;
    public static Block pamcinnamonSapling;
    public static Block pamCoconut;
    public static Block pamcoconutSapling;
    public static Block pamDate;
    public static Block pamdateSapling;
    public static Block pamDragonfruit;
    public static Block pamdragonfruitSapling;
    public static Block pamDurian;
    public static Block pamdurianSapling;
    public static Block pamFig;
    public static Block pamfigSapling;
    public static Block pamGooseberry;
    public static Block pamgooseberrySapling;
    public static Block pamGrapefruit;
    public static Block pamgrapefruitSapling;
    public static Block pamLemon;
    public static Block pamlemonSapling;
    public static Block pamLime;
    public static Block pamlimeSapling;
    public static Block pamMaple;
    public static Block pammapleSapling;
    public static Block pamMango;
    public static Block pammangoSapling;
    public static Block pamNutmeg;
    public static Block pamnutmegSapling;
    public static Block pamOlive;
    public static Block pamoliveSapling;
    public static Block pamOrange;
    public static Block pamorangeSapling;
    public static Block pamPapaya;
    public static Block pampapayaSapling;
    public static Block pamPaperbark;
    public static Block pampaperbarkSapling;
    public static Block pamPeach;
    public static Block pampeachSapling;
    public static Block pamPear;
    public static Block pampearSapling;
    public static Block pamPecan;
    public static Block pampecanSapling;
    public static Block pamPeppercorn;
    public static Block pampeppercornSapling;
    public static Block pamPersimmon;
    public static Block pampersimmonSapling;
    public static Block pamPistachio;
    public static Block pampistachioSapling;
    public static Block pamPlum;
    public static Block pamplumSapling;
    public static Block pamPomegranate;
    public static Block pampomegranateSapling;
    public static Block pamStarfruit;
    public static Block pamstarfruitSapling;
    public static Block pamVanillabean;
    public static Block pamvanillabeanSapling;
    public static Block pamWalnut;
    public static Block pamwalnutSapling;

    // Block configuration variables
    public static int gardenRarity;
    public static int gardendropAmount;
    public static boolean enablegardenSpread;
    public static int gardenspreadRate;
    public static boolean enablearidgardenGeneration;
    public static boolean enablefrostgardenGeneration;
    public static boolean enabletropicalgardenGeneration;
    public static boolean enablewindygardenGeneration;
    public static boolean enableshadedgardenGeneration;
    public static boolean enablesoggygardenGeneration;
    public static int temperatefruittreeRarity;
    public static int tropicalfruittreeRarity;
    public static int coniferousfruittreeRarity;
    public static boolean appletreeGeneration;
    public static boolean almondtreeGeneration;
    public static boolean apricottreeGeneration;
    public static boolean avocadotreeGeneration;
    public static boolean bananatreeGeneration;
    public static boolean cashewtreeGeneration;
    public static boolean cherrytreeGeneration;
    public static boolean chestnuttreeGeneration;
    public static boolean cinnamontreeGeneration;
    public static boolean coconuttreeGeneration;
    public static boolean datetreeGeneration;
    public static boolean dragonfruittreeGeneration;
    public static boolean duriantreeGeneration;
    public static boolean figtreeGeneration;
    public static boolean grapefruittreeGeneration;
    public static boolean lemontreeGeneration;
    public static boolean limetreeGeneration;
    public static boolean mapletreeGeneration;
    public static boolean mangotreeGeneration;
    public static boolean nutmegtreeGeneration;
    public static boolean olivetreeGeneration;
    public static boolean orangetreeGeneration;
    public static boolean papayatreeGeneration;
    public static boolean paperbarktreeGeneration;
    public static boolean peachtreeGeneration;
    public static boolean peartreeGeneration;
    public static boolean pecantreeGeneration;
    public static boolean peppercorntreeGeneration;
    public static boolean persimmontreeGeneration;
    public static boolean pistachiotreeGeneration;
    public static boolean plumtreeGeneration;
    public static boolean pomegranatetreeGeneration;
    public static boolean starfruittreeGeneration;
    public static boolean vanillabeantreeGeneration;
    public static boolean walnuttreeGeneration;
    public static boolean gooseberrytreeGeneration;
    public static boolean rightclickharvestCrop;
    public static boolean rightclickharvestFruit;
    public static boolean enablecropspecialplanting;

    public static void initBlockConfig(Configuration config) {
        gardenRarity = config.get("gardens", "gardenRarity", 2).getInt();
        gardendropAmount = config.get("gardens", "gardendropAmount", 3).getInt();
        enablegardenSpread = config.get("gardens", "enablegardenSpread", true).getBoolean(true);
        gardenspreadRate = config.get("gardens", "gardenspreadRate", 100).getInt();
        enablearidgardenGeneration = config.get("gardens", "enablearidgardenGeneration", true).getBoolean(true);
        enablefrostgardenGeneration = config.get("gardens", "enablefrostgardenGeneration", true).getBoolean(true);
        enabletropicalgardenGeneration = config.get("gardens", "enabletropicalgardenGeneration", true).getBoolean(true);
        enablewindygardenGeneration = config.get("gardens", "enablewindygardenGeneration", true).getBoolean(true);
        enableshadedgardenGeneration = config.get("gardens", "enableshadedgardenGeneration", true).getBoolean(true);
        enablesoggygardenGeneration = config.get("gardens", "enablesoggygardenGeneration", true).getBoolean(true);
        temperatefruittreeRarity = config.get("fruit trees", "temperatefruittreeRarity", 24).getInt();
        tropicalfruittreeRarity = config.get("fruit trees", "tropicalfruittreeRarity", 32).getInt();
        coniferousfruittreeRarity = config.get("fruit trees", "coniferousfruittreeRarity", 24).getInt();
        appletreeGeneration = config.get("fruit trees", "appletreeGeneration", true).getBoolean(true);
        almondtreeGeneration = config.get("fruit trees", "almondtreeGeneration", true).getBoolean(true);
        apricottreeGeneration = config.get("fruit trees", "apricottreeGeneration", true).getBoolean(true);
        avocadotreeGeneration = config.get("fruit trees", "avocadotreeGeneration", true).getBoolean(true);
        bananatreeGeneration = config.get("fruit trees", "bananatreeGeneration", true).getBoolean(true);
        cashewtreeGeneration = config.get("fruit trees", "cashewtreeGeneration", true).getBoolean(true);
        cherrytreeGeneration = config.get("fruit trees", "cherrytreeGeneration", true).getBoolean(true);
        chestnuttreeGeneration = config.get("fruit trees", "chestnuttreeGeneration", true).getBoolean(true);
        cinnamontreeGeneration = config.get("fruit trees", "cinnamontreeGeneration", true).getBoolean(true);
        coconuttreeGeneration = config.get("fruit trees", "coconuttreeGeneration", true).getBoolean(true);
        datetreeGeneration = config.get("fruit trees", "datetreeGeneration", true).getBoolean(true);
        dragonfruittreeGeneration = config.get("fruit trees", "dragonfruittreeGeneration", true).getBoolean(true);
        duriantreeGeneration = config.get("fruit trees", "duriantreeGeneration", true).getBoolean(true);
        figtreeGeneration = config.get("fruit trees", "figtreeGeneration", true).getBoolean(true);
        grapefruittreeGeneration = config.get("fruit trees", "grapefruittreeGeneration", true).getBoolean(true);
        lemontreeGeneration = config.get("fruit trees", "lemontreeGeneration", true).getBoolean(true);
        limetreeGeneration = config.get("fruit trees", "limetreeGeneration", true).getBoolean(true);
        mapletreeGeneration = config.get("fruit trees", "mapletreeGeneration", true).getBoolean(true);
        mangotreeGeneration = config.get("fruit trees", "mangotreeGeneration", true).getBoolean(true);
        nutmegtreeGeneration = config.get("fruit trees", "nutmegtreeGeneration", true).getBoolean(true);
        olivetreeGeneration = config.get("fruit trees", "olivetreeGeneration", true).getBoolean(true);
        orangetreeGeneration = config.get("fruit trees", "orangetreeGeneration", true).getBoolean(true);
        papayatreeGeneration = config.get("fruit trees", "papayatreeGeneration", true).getBoolean(true);
        paperbarktreeGeneration = config.get("fruit trees", "paperbarktreeGeneration", true).getBoolean(true);
        peachtreeGeneration = config.get("fruit trees", "peachtreeGeneration", true).getBoolean(true);
        peartreeGeneration = config.get("fruit trees", "peartreeGeneration", true).getBoolean(true);
        pecantreeGeneration = config.get("fruit trees", "pecantreeGeneration", true).getBoolean(true);
        peppercorntreeGeneration = config.get("fruit trees", "peppercorntreeGeneration", true).getBoolean(true);
        persimmontreeGeneration = config.get("fruit trees", "persimmontreeGeneration", true).getBoolean(true);
        pistachiotreeGeneration = config.get("fruit trees", "pistachiotreeGeneration", true).getBoolean(true);
        plumtreeGeneration = config.get("fruit trees", "plumtreeGeneration", true).getBoolean(true);
        pomegranatetreeGeneration = config.get("fruit trees", "pomegranatetreeGeneration", true).getBoolean(true);
        starfruittreeGeneration = config.get("fruit trees", "starfruittreeGeneration", true).getBoolean(true);
        vanillabeantreeGeneration = config.get("fruit trees", "vanillabeantreeGeneration", true).getBoolean(true);
        walnuttreeGeneration = config.get("fruit trees", "walnuttreeGeneration", true).getBoolean(true);
        gooseberrytreeGeneration = config.get("fruit trees", "gooseberrytreeGeneration", true).getBoolean(true);
        rightclickharvestCrop = config.get("crops", "rightclickharvestCrop", true).getBoolean(true);
        rightclickharvestFruit = config.get("fruit trees", "rightclickharvestFruit", true).getBoolean(true);
        enablecropspecialplanting = config.get("crops", "enablecropspecialplanting", true).getBoolean(true);
    }

    public static void loadBlockRegistry() {
        aridGardenBlock = new AridGardenBlock();
        frostGardenBlock = new FrostGardenBlock();
        tropicalGardenBlock = new TropicalGardenBlock();
        windyGardenBlock = new WindyGardenBlock();
        shadedGardenBlock = new ShadedGardenBlock();
        soggyGardenBlock = new SoggyGardenBlock();

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

        pamApple = registerBlockFruit("pamApple");
        pamappleSapling = new BlockPamSapling("apple_sapling");
        pamAlmond = registerBlockFruit("pamAlmond");
        pamalmondSapling = new BlockPamSapling("almond_sapling");
        pamApricot = registerBlockFruit("pamApricot");
        pamapricotSapling = new BlockPamSapling("apricot_sapling");
        pamAvocado = registerBlockFruit("pamAvocado");
        pamavocadoSapling = new BlockPamSapling("avocado_sapling");
        pamBanana = registerBlockFruit("pamBanana");
        pambananaSapling = new BlockPamSapling("banana_sapling");
        pamCashew = registerBlockFruit("pamCashew");
        pamcashewSapling = new BlockPamSapling("cashew_sapling");
        pamCherry = registerBlockFruit("pamCherry");
        pamcherrySapling = new BlockPamSapling("cherry_sapling");
        pamChestnut = registerBlockFruit("pamChestnut");
        pamchestnutSapling = new BlockPamSapling("chestnut_sapling");
        pamCinnamon = registerBlockLogFruit("pamCinnamon");
        pamcinnamonSapling = new BlockPamSapling("cinnamon_sapling");
        pamCoconut = registerBlockFruit("pamCoconut");
        pamcoconutSapling = new BlockPamSapling("coconut_sapling");
        pamDate = registerBlockFruit("pamDate");
        pamdateSapling = new BlockPamSapling("date_sapling");
        pamDragonfruit = registerBlockFruit("pamDragonfruit");
        pamdragonfruitSapling = new BlockPamSapling("dragonfruit_sapling");
        pamDurian = registerBlockFruit("pamDurian");
        pamdurianSapling = new BlockPamSapling("durian_sapling");
        pamFig = registerBlockFruit("pamFig");
        pamfigSapling = new BlockPamSapling("fig_sapling");
        pamGooseberry = registerBlockFruit("pamGooseberry");
        pamgooseberrySapling = new BlockPamSapling("gooseberry_sapling");
        pamGrapefruit = registerBlockFruit("pamGrapefruit");
        pamgrapefruitSapling = new BlockPamSapling("grapefruit_sapling");
        pamLemon = registerBlockFruit("pamLemon");
        pamlemonSapling = new BlockPamSapling("lemon_sapling");
        pamLime = registerBlockFruit("pamLime");
        pamlimeSapling = new BlockPamSapling("lime_sapling");
        pamMaple = registerBlockLogFruit("pamMaple");
        pammapleSapling = new BlockPamSapling("maple_sapling");
        pamMango = registerBlockFruit("pamMango");
        pammangoSapling = new BlockPamSapling("mango_sapling");
        pamNutmeg = registerBlockFruit("pamNutmeg");
        pamnutmegSapling = new BlockPamSapling("nutmeg_sapling");
        pamOlive = registerBlockFruit("pamOlive");
        pamoliveSapling = new BlockPamSapling("olive_sapling");
        pamOrange = registerBlockFruit("pamOrange");
        pamorangeSapling = new BlockPamSapling("orange_sapling");
        pamPapaya = registerBlockFruit("pamPapaya");
        pampapayaSapling = new BlockPamSapling("papaya_sapling");
        pamPaperbark = registerBlockLogFruit("pamPaperbark");
        pampaperbarkSapling = new BlockPamSapling("paperbark_sapling");
        pamPeach = registerBlockFruit("pamPeach");
        pampeachSapling = new BlockPamSapling("peach_sapling");
        pamPear = registerBlockFruit("pamPear");
        pampearSapling = new BlockPamSapling("pear_sapling");
        pamPecan = registerBlockFruit("pamPecan");
        pampecanSapling = new BlockPamSapling("pecan_sapling");
        pamPeppercorn = registerBlockFruit("pamPeppercorn");
        pampeppercornSapling = new BlockPamSapling("peppercorn_sapling");
        pamPersimmon = registerBlockFruit("pamPersimmon");
        pampersimmonSapling = new BlockPamSapling("persimmon_sapling");
        pamPistachio = registerBlockFruit("pamPistachio");
        pampistachioSapling = new BlockPamSapling("pistachio_sapling");
        pamPlum = registerBlockFruit("pamPlum");
        pamplumSapling = new BlockPamSapling("plum_sapling");
        pamPomegranate = registerBlockFruit("pamPomegranate");
        pampomegranateSapling = new BlockPamSapling("pomegranate_sapling");
        pamStarfruit = registerBlockFruit("pamStarfruit");
        pamstarfruitSapling = new BlockPamSapling("starfruit_sapling");
        pamVanillabean = registerBlockFruit("pamVanillabean");
        pamvanillabeanSapling = new BlockPamSapling("vanillabean_sapling");
        pamWalnut = registerBlockFruit("pamWalnut");
        pamwalnutSapling = new BlockPamSapling("walnut_sapling");

        // Assign saplings to arrays
        PamTemperateSaplings = new Block[]{pamappleSapling, pamavocadoSapling, pamcherrySapling, pamchestnutSapling, pamnutmegSapling, pampearSapling, pamplumSapling, pamwalnutSapling, pamgooseberrySapling};
        PamWarmSaplings = new Block[]{pamalmondSapling, pamapricotSapling, pambananaSapling, pamcashewSapling, pamcoconutSapling, pamdateSapling, pamdragonfruitSapling, pamdurianSapling, pamfigSapling, pamgrapefruitSapling, pamlemonSapling, pamlimeSapling, pammangoSapling, pamoliveSapling, pamorangeSapling, pampapayaSapling, pampeachSapling, pampecanSapling, pampeppercornSapling, pampersimmonSapling, pampistachioSapling, pampomegranateSapling, pamstarfruitSapling, pamvanillabeanSapling};
        PamLogSaplings = new Block[]{pamcinnamonSapling, pammapleSapling, pampaperbarkSapling};
    }

    private static Block registerBlockCrop(String registerName) {
        final Block pamCrop = new BlockPamCrop();
        final ItemBlock itemBlock = new ItemBlockFruit(pamCrop);

        return registerBlock(registerName, itemBlock, pamCrop);
    }

    private static Block registerBlockFruit(String registerName) {
        final Block pamFruit = new BlockPamFruit();
        final ItemBlock itemBlock = new ItemBlockFruit(pamFruit);

        return registerBlock(registerName, itemBlock, pamFruit);
    }

    private static Block registerBlockLogFruit(String registerName) {
        final Block pamLogFruit = new BlockPamLogFruit();
        final ItemBlock itemBlock = new ItemBlockFruit(pamLogFruit);

        return registerBlock(registerName, itemBlock, pamLogFruit);
    }

    private static Block registerBlock(String registerName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(registerName);
        block.setUnlocalizedName(registerName);

        GameRegistry.register(block);
        try {
            itemBlock.setRegistryName(registerName);

            GameRegistry.register(itemBlock);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return block;
    }

}
