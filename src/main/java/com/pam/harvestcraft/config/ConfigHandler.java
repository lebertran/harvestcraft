package com.pam.harvestcraft.config;

import com.pam.harvestcraft.blocks.gardens.BlockBaseGarden;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigHandler {

    private final Configuration config;

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_CROPS = "crops";
    public static final String CATEGORY_GARDENS = "gardens";
    public static final String CATEGORY_FRUIT_TREES = "fruit trees";
    public static final String CATEGORY_SALT = "salt";
    public static final String CATEGORY_BEE = "beekeeping";
    public static final String CATEGORY_MARKET_SALES = "market sales";
    public static final String CATEGORY_MARKET_PRICES = "market prices";
    public static final String CATEGORY_MARKET_CURRENCY = "market currency";
    public static final String CATEGORY_CANDLES = "candles";
    public static final String CATEGORY_DIMENSIONS = "dimensions";
    public static final String CATEGORY_SEEDS = "seeds";
    public static final String CATEGORY_MISC_RECIPES = "miscellaneous recipes";

    /**
     * Defaults
     */
    private static final int defaultCropFoodRestore = 1;
    private static final double defaultSaturationSmall = 0.6000000238418579D;
    private static final double defaultSaturationMeal = 1.2000000476837158D;
    private static final double defaultSaturationMeatyMeal = 1.600000023841858D;

    /**
     * Config
     */
    public boolean squiddropCalamari;

    public int cropfoodRestore;
    public float cropsaturationRestore;
    public float snacksaturation;
    public float mealsaturation;
    public float meatymealsaturation;
    public int freshmilkfrombucket;
    public int freshwaterfrombucket;
    public boolean enablesaltfromwaterbucketrecipe;
    public int seedrarity;

    public boolean enablecroptoseedRecipe;
    public boolean enableTofuAsMeatInRecipes;
    public boolean enableTofuAsMilkInRecipes;

    public boolean enablelistAllwaterfreshwater;
    public boolean enablelistAllwatervanillawaterbucket;

    public final HashMap<String, Boolean> seedDropFromGrass = new HashMap<>();

    private final Map<String, String[]> gardenDropConfig = new HashMap<>();


    // Block configuration variables
    public int gardenRarity;
    public int gardendropAmount;
    public boolean enablegardenSpread;
    public int gardenspreadRate;
    public boolean enablearidgardenGeneration;
    public boolean enablefrostgardenGeneration;
    public boolean enabletropicalgardenGeneration;
    public boolean enablewindygardenGeneration;
    public boolean enableshadedgardenGeneration;
    public boolean enablesoggygardenGeneration;
    public int temperatefruittreeRarity;
    public int tropicalfruittreeRarity;
    public int coniferousfruittreeRarity;
    public boolean appletreeGeneration;
    public boolean almondtreeGeneration;
    public boolean apricottreeGeneration;
    public boolean avocadotreeGeneration;
    public boolean bananatreeGeneration;
    public boolean cashewtreeGeneration;
    public boolean cherrytreeGeneration;
    public boolean chestnuttreeGeneration;
    public boolean cinnamontreeGeneration;
    public boolean coconuttreeGeneration;
    public boolean datetreeGeneration;
    public boolean dragonfruittreeGeneration;
    public boolean duriantreeGeneration;
    public boolean figtreeGeneration;
    public boolean grapefruittreeGeneration;
    public boolean lemontreeGeneration;
    public boolean limetreeGeneration;
    public boolean mapletreeGeneration;
    public boolean mangotreeGeneration;
    public boolean nutmegtreeGeneration;
    public boolean olivetreeGeneration;
    public boolean orangetreeGeneration;
    public boolean papayatreeGeneration;
    public boolean paperbarktreeGeneration;
    public boolean peachtreeGeneration;
    public boolean peartreeGeneration;
    public boolean pecantreeGeneration;
    public boolean peppercorntreeGeneration;
    public boolean persimmontreeGeneration;
    public boolean pistachiotreeGeneration;
    public boolean plumtreeGeneration;
    public boolean pomegranatetreeGeneration;
    public boolean starfruittreeGeneration;
    public boolean vanillabeantreeGeneration;
    public boolean walnuttreeGeneration;
    public boolean gooseberrytreeGeneration;
    public boolean rightclickharvestCrop;
    public boolean rightclickharvestFruit;
    public boolean enablecropspecialplanting;

    // Market configuration
    public boolean marketsellSeeds;
    public boolean marketselltemperateSaplings;
    public boolean marketselltropicalSaplings;
    public boolean marketsellconiferousSaplings;
    public boolean marketsellPig;
    public boolean marketsellSheep;
    public boolean marketsellCow;
    public boolean marketsellChicken;
    public boolean marketsellHorse;
    public boolean marketsellBonemeal;
    public int marketblockrecipeItem;
    public int marketseedPrice;
    public int marketsaplingPrice;
    public int marketpigPrice;
    public int marketsheepPrice;
    public int marketcowPrice;
    public int marketchickenPrice;
    public int markethorsePrice;
    public int marketbonemealPrice;
    public int marketcurrencySeeds;
    public int marketcurrencytemperateSaplings;
    public int marketcurrencytropicalSaplings;
    public int marketcurrencyconiferousSaplings;
    public int marketcurrencyPig;
    public int marketcurrencySheep;
    public int marketcurrencyCow;
    public int marketcurrencyChicken;
    public int marketcurrencyHorse;
    public int marketcurrencyBonemeal;


    public ConfigHandler(Configuration config) {
        this.config = config;

        initSettings();
    }

    public void initSettings() {
        config.load();

        initGeneralSettings();
        initCropSettings();
        initSeedDropSettings();
        initFoodTreesSettings();
        initGardenSettings();
        initMarketSettings();
        initMiscRecipesSettings();

        if (config.hasChanged()) {
            config.save();
        }
    }

    private void initGeneralSettings() {
        squiddropCalamari = config.get(CATEGORY_GENERAL, "squiddropCalamari", true).getBoolean();
    }

    private void initCropSettings() {
        cropfoodRestore = config.get(CATEGORY_CROPS, "cropfoodRestore", defaultCropFoodRestore).getInt();
        cropsaturationRestore = (float) config.get(CATEGORY_CROPS, "cropsaturationRestore", defaultSaturationSmall).getDouble();
        snacksaturation = (float) config.get(CATEGORY_CROPS, "snacksaturation", defaultSaturationSmall).getDouble();
        mealsaturation = (float) config.get(CATEGORY_CROPS, "mealsaturation", defaultSaturationMeal).getDouble();
        meatymealsaturation = (float) config.get(CATEGORY_CROPS, "meatymealsaturation", defaultSaturationMeatyMeal).getDouble();
        rightclickharvestCrop = config.get(CATEGORY_CROPS, "rightclickharvestCrop", true).getBoolean();
        enablecropspecialplanting = config.get(CATEGORY_CROPS, "enablecropspecialplanting", true).getBoolean();
    }

    private void initFoodTreesSettings() {
        temperatefruittreeRarity = config.get(CATEGORY_FRUIT_TREES, "temperatefruittreeRarity", 24).getInt();
        tropicalfruittreeRarity = config.get(CATEGORY_FRUIT_TREES, "tropicalfruittreeRarity", 32).getInt();
        coniferousfruittreeRarity = config.get(CATEGORY_FRUIT_TREES, "coniferousfruittreeRarity", 24).getInt();
        appletreeGeneration = config.get(CATEGORY_FRUIT_TREES, "appletreeGeneration", true).getBoolean();
        almondtreeGeneration = config.get(CATEGORY_FRUIT_TREES, "almondtreeGeneration", true).getBoolean();
        apricottreeGeneration = config.get(CATEGORY_FRUIT_TREES, "apricottreeGeneration", true).getBoolean();
        avocadotreeGeneration = config.get(CATEGORY_FRUIT_TREES, "avocadotreeGeneration", true).getBoolean();
        bananatreeGeneration = config.get(CATEGORY_FRUIT_TREES, "bananatreeGeneration", true).getBoolean();
        cashewtreeGeneration = config.get(CATEGORY_FRUIT_TREES, "cashewtreeGeneration", true).getBoolean();
        cherrytreeGeneration = config.get(CATEGORY_FRUIT_TREES, "cherrytreeGeneration", true).getBoolean();
        chestnuttreeGeneration = config.get(CATEGORY_FRUIT_TREES, "chestnuttreeGeneration", true).getBoolean();
        cinnamontreeGeneration = config.get(CATEGORY_FRUIT_TREES, "cinnamontreeGeneration", true).getBoolean();
        coconuttreeGeneration = config.get(CATEGORY_FRUIT_TREES, "coconuttreeGeneration", true).getBoolean();
        datetreeGeneration = config.get(CATEGORY_FRUIT_TREES, "datetreeGeneration", true).getBoolean();
        dragonfruittreeGeneration = config.get(CATEGORY_FRUIT_TREES, "dragonfruittreeGeneration", true).getBoolean();
        duriantreeGeneration = config.get(CATEGORY_FRUIT_TREES, "duriantreeGeneration", true).getBoolean();
        figtreeGeneration = config.get(CATEGORY_FRUIT_TREES, "figtreeGeneration", true).getBoolean();
        grapefruittreeGeneration = config.get(CATEGORY_FRUIT_TREES, "grapefruittreeGeneration", true).getBoolean();
        lemontreeGeneration = config.get(CATEGORY_FRUIT_TREES, "lemontreeGeneration", true).getBoolean();
        limetreeGeneration = config.get(CATEGORY_FRUIT_TREES, "limetreeGeneration", true).getBoolean();
        mapletreeGeneration = config.get(CATEGORY_FRUIT_TREES, "mapletreeGeneration", true).getBoolean();
        mangotreeGeneration = config.get(CATEGORY_FRUIT_TREES, "mangotreeGeneration", true).getBoolean();
        nutmegtreeGeneration = config.get(CATEGORY_FRUIT_TREES, "nutmegtreeGeneration", true).getBoolean();
        olivetreeGeneration = config.get(CATEGORY_FRUIT_TREES, "olivetreeGeneration", true).getBoolean();
        orangetreeGeneration = config.get(CATEGORY_FRUIT_TREES, "orangetreeGeneration", true).getBoolean();
        papayatreeGeneration = config.get(CATEGORY_FRUIT_TREES, "papayatreeGeneration", true).getBoolean();
        paperbarktreeGeneration = config.get(CATEGORY_FRUIT_TREES, "paperbarktreeGeneration", true).getBoolean();
        peachtreeGeneration = config.get(CATEGORY_FRUIT_TREES, "peachtreeGeneration", true).getBoolean();
        peartreeGeneration = config.get(CATEGORY_FRUIT_TREES, "peartreeGeneration", true).getBoolean();
        pecantreeGeneration = config.get(CATEGORY_FRUIT_TREES, "pecantreeGeneration", true).getBoolean();
        peppercorntreeGeneration = config.get(CATEGORY_FRUIT_TREES, "peppercorntreeGeneration", true).getBoolean();
        persimmontreeGeneration = config.get(CATEGORY_FRUIT_TREES, "persimmontreeGeneration", true).getBoolean();
        pistachiotreeGeneration = config.get(CATEGORY_FRUIT_TREES, "pistachiotreeGeneration", true).getBoolean();
        plumtreeGeneration = config.get(CATEGORY_FRUIT_TREES, "plumtreeGeneration", true).getBoolean();
        pomegranatetreeGeneration = config.get(CATEGORY_FRUIT_TREES, "pomegranatetreeGeneration", true).getBoolean();
        starfruittreeGeneration = config.get(CATEGORY_FRUIT_TREES, "starfruittreeGeneration", true).getBoolean();
        vanillabeantreeGeneration = config.get(CATEGORY_FRUIT_TREES, "vanillabeantreeGeneration", true).getBoolean();
        walnuttreeGeneration = config.get(CATEGORY_FRUIT_TREES, "walnuttreeGeneration", true).getBoolean();
        gooseberrytreeGeneration = config.get(CATEGORY_FRUIT_TREES, "gooseberrytreeGeneration", true).getBoolean();
        rightclickharvestFruit = config.get(CATEGORY_FRUIT_TREES, "rightclickharvestFruit", true).getBoolean();
    }

    private void initGardenSettings() {
        gardenRarity = config.get(CATEGORY_GARDENS, "gardenRarity", 2).getInt();
        gardendropAmount = config.get(CATEGORY_GARDENS, "gardendropAmount", 3).getInt();
        enablegardenSpread = config.get(CATEGORY_GARDENS, "enablegardenSpread", true).getBoolean();
        gardenspreadRate = config.get(CATEGORY_GARDENS, "gardenspreadRate", 100).getInt();
        enablearidgardenGeneration = config.get(CATEGORY_GARDENS, "enablearidgardenGeneration", true).getBoolean();
        enablefrostgardenGeneration = config.get(CATEGORY_GARDENS, "enablefrostgardenGeneration", true).getBoolean();
        enabletropicalgardenGeneration = config.get(CATEGORY_GARDENS, "enabletropicalgardenGeneration", true).getBoolean();
        enablewindygardenGeneration = config.get(CATEGORY_GARDENS, "enablewindygardenGeneration", true).getBoolean();
        enableshadedgardenGeneration = config.get(CATEGORY_GARDENS, "enableshadedgardenGeneration", true).getBoolean();
        enablesoggygardenGeneration = config.get(CATEGORY_GARDENS, "enablesoggygardenGeneration", true).getBoolean();

        // Garden drop configuration
        gardenDropConfig.put("aridGarden", config.getStringList("aridGarden", "drops",
                new String[]{"harvestcraft:cactusfruitItem"}, ""));
        gardenDropConfig.put("frostGarden", config.getStringList("frostGarden", "drops",
                new String[]{"harvestcraft:raspberryItem", "harvestcraft:oatsItem", "harvestcraft:ryeItem",
                        "harvestcraft:celeryItem", "harvestcraft:peasItem", "harvestcraft:beetItem",
                        "harvestcraft:rutabagaItem", "harvestcraft:broccoliItem", "harvestcraft:cauliflowerItem",
                        "harvestcraft:cabbageItem", "harvestcraft:spinachItem"}, ""));
        gardenDropConfig.put("shadedGarden", config.getStringList("shadedGarden", "drops",
                new String[]{"harvestcraft:whitemushroomItem", "harvestcraft:blackberryItem", "harvestcraft:zucchiniItem",
                        "harvestcraft:radishItem", "harvestcraft:rhubarbItem", "harvestcraft:tealeafItem",
                        "harvestcraft:garlicItem", "harvestcraft:sweetpotatoItem", "harvestcraft:turnipItem",
                        "harvestcraft:spiceleafItem", "harvestcraft:beanItem", "harvestcraft:leekItem",
                        "harvestcraft:scallionItem", "harvestcraft:tomatoItem"}, ""));
        gardenDropConfig.put("soggyGarden", config.getStringList("soggyGarden", "drops",
                new String[]{"harvestcraft:brusselsproutItem", "harvestcraft:spiceleafItem", "harvestcraft:blueberryItem",
                        "harvestcraft:asparagusItem", "harvestcraft:cranberryItem", "harvestcraft:riceItem",
                        "harvestcraft:seaweedItem", "harvestcraft:waterchestnutItem", "harvestcraft:okraItem"}, ""));
        gardenDropConfig.put("tropicalGarden", config.getStringList("tropicalGarden", "drops",
                new String[]{"harvestcraft:grapeItem", "harvestcraft:pineappleItem", "harvestcraft:kiwiItem",
                        "harvestcraft:sesameseedsItem", "harvestcraft:curryleafItem", "harvestcraft:bambooshootItem",
                        "harvestcraft:cantaloupeItem", "harvestcraft:gingerItem", "harvestcraft:coffeebeanItem",
                        "harvestcraft:soybeanItem", "harvestcraft:eggplantItem"}, ""));
        gardenDropConfig.put("windyGarden", config.getStringList("windyGarden", "drops",
                new String[]{"harvestcraft:strawberryItem", "harvestcraft:barleyItem", "harvestcraft:cornItem",
                        "harvestcraft:cucumberItem", "harvestcraft:wintersquashItem", "harvestcraft:mustardseedsItem",
                        "harvestcraft:onionItem", "harvestcraft:parsnipItem", "harvestcraft:peanutItem",
                        "minecraft:potato", "minecraft:carrot", "harvestcraft:lettuceItem",
                        "harvestcraft:artichokeItem", "harvestcraft:bellpepperItem", "harvestcraft:chilipepperItem",
                        "minecraft:wheat",}, ""));
    }
    
    private void initMarketSettings() {
        marketsellSeeds = config.get(CATEGORY_MARKET_SALES, "marketsellSeeds", true).getBoolean();
        marketselltemperateSaplings = config.get(CATEGORY_MARKET_SALES, "marketselltemperateSaplings", true).getBoolean();
        marketselltropicalSaplings = config.get(CATEGORY_MARKET_SALES, "marketselltropicalSaplings", true).getBoolean();
        marketsellconiferousSaplings = config.get(CATEGORY_MARKET_SALES, "marketsellconiferousSaplings", true).getBoolean();
        marketsellPig = config.get(CATEGORY_MARKET_SALES, "marketsellPig", true).getBoolean();
        marketsellSheep = config.get(CATEGORY_MARKET_SALES, "marketsellSheep", true).getBoolean();
        marketsellCow = config.get(CATEGORY_MARKET_SALES, "marketsellCow", true).getBoolean();
        marketsellChicken = config.get(CATEGORY_MARKET_SALES, "marketsellChicken", true).getBoolean();
        marketsellHorse = config.get(CATEGORY_MARKET_SALES, "marketsellHorse", true).getBoolean();
        marketsellBonemeal = config.get(CATEGORY_MARKET_SALES, "marketsellBonemeal", true).getBoolean();
        marketseedPrice = config.get(CATEGORY_MARKET_PRICES, "marketseedPrice", 1).getInt();
        marketsaplingPrice = config.get(CATEGORY_MARKET_PRICES, "marketsaplingPrice", 3).getInt();
        marketpigPrice = config.get(CATEGORY_MARKET_PRICES, "marketpigPrice", 6).getInt();
        marketsheepPrice = config.get(CATEGORY_MARKET_PRICES, "marketsheepPrice", 6).getInt();
        marketcowPrice = config.get(CATEGORY_MARKET_PRICES, "marketcowPrice", 9).getInt();
        marketchickenPrice = config.get(CATEGORY_MARKET_PRICES, "marketchickenPrice", 3).getInt();
        markethorsePrice = config.get(CATEGORY_MARKET_PRICES, "markethorsePrice", 12).getInt();
        marketbonemealPrice = config.get(CATEGORY_MARKET_PRICES, "marketbonemealPrice", 3).getInt();
        marketcurrencySeeds = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencySeeds", 0).getInt();
        marketcurrencytemperateSaplings = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencytemperateSaplings", 0).getInt();
        marketcurrencytropicalSaplings = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencytropicalSaplings", 0).getInt();
        marketcurrencyconiferousSaplings = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencyconiferousSaplings", 0).getInt();
        marketcurrencyPig = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencyPig", 0).getInt();
        marketcurrencySheep = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencySheep", 0).getInt();
        marketcurrencyCow = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencyCow", 0).getInt();
        marketcurrencyChicken = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencyChicken", 0).getInt();
        marketcurrencyHorse = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencyHorse", 0).getInt();
        marketcurrencyBonemeal = config.get(CATEGORY_MARKET_CURRENCY, "marketcurrencyBonemeal", 0).getInt();
    }

    private void initSeedDropSettings() {
        seedrarity = config.get(CATEGORY_SEEDS, "seedrarity", 1).getInt();

        initSeedDropFromGrassSetting("asparagusseeddropfromgrass", "asparagusItem");
        initSeedDropFromGrassSetting("barleyseeddropfromgrass", "barleyItem");
        initSeedDropFromGrassSetting("beanseeddropfromgrass", "beanItem");
        initSeedDropFromGrassSetting("beetseeddropfromgrass", "beetItem");
        initSeedDropFromGrassSetting("broccoliseeddropfromgrass", "broccoliItem");
        initSeedDropFromGrassSetting("cauliflowerseeddropfromgrass", "cauliflowerItem");
        initSeedDropFromGrassSetting("celeryseeddropfromgrass", "celeryItem");
        initSeedDropFromGrassSetting("cranberryseeddropfromgrass", "cranberryItem");
        initSeedDropFromGrassSetting("garlicseeddropfromgrass", "garlicItem");
        initSeedDropFromGrassSetting("gingerseeddropfromgrass", "gingerItem");
        initSeedDropFromGrassSetting("leekseeddropfromgrass", "leekItem");
        initSeedDropFromGrassSetting("lettuceseeddropfromgrass", "lettuceItem");
        initSeedDropFromGrassSetting("oatsseeddropfromgrass", "oatsItem");
        initSeedDropFromGrassSetting("onionseeddropfromgrass", "onionItem");
        initSeedDropFromGrassSetting("parsnipseeddropfromgrass", "parsnipItem");
        initSeedDropFromGrassSetting("peanutseeddropfromgrass", "peanutItem");
        initSeedDropFromGrassSetting("pineappleseeddropfromgrass", "pineappleItem");
        initSeedDropFromGrassSetting("radishseeddropfromgrass", "radishItem");
        initSeedDropFromGrassSetting("riceseeddropfromgrass", "riceItem");
        initSeedDropFromGrassSetting("rutabagaseeddropfromgrass", "rutabagaItem");
        initSeedDropFromGrassSetting("ryeseeddropfromgrass", "ryeItem");
        initSeedDropFromGrassSetting("scallionseeddropfromgrass", "scallionItem");
        initSeedDropFromGrassSetting("soybeanseeddropfromgrass", "soybeanItem");
        initSeedDropFromGrassSetting("spiceleafseeddropfromgrass", "spiceleafItem");
        initSeedDropFromGrassSetting("sunflowerseeddropfromgrass", "sunflowerItem");
        initSeedDropFromGrassSetting("sweetpotatoseeddropfromgrass", "sweetpotatoItem");
        initSeedDropFromGrassSetting("teaseeddropfromgrass", "teaItem");
        initSeedDropFromGrassSetting("turnipseeddropfromgrass", "turnipItem");
        initSeedDropFromGrassSetting("whitemushroomseeddropfromgrass", "whitemushroomItem");

        initSeedDropFromGrassSetting("artichokeseeddropfromgrass", "artichokeItem");
        initSeedDropFromGrassSetting("bellpepperseeddropfromgrass", "bellpepperItem");
        initSeedDropFromGrassSetting("blackberryseeddropfromgrass", "blackberryItem");
        initSeedDropFromGrassSetting("blueberryseeddropfromgrass", "blueberryItem");
        initSeedDropFromGrassSetting("brusselsproutseeddropfromgrass", "brusselsproutItem");
        initSeedDropFromGrassSetting("cabbageseeddropfromgrass", "cabbageItem");
        initSeedDropFromGrassSetting("cactusfruitseeddropfromgrass", "cactusfruitItem");
        initSeedDropFromGrassSetting("candleberryseeddropfromgrass", "candleberryItem");
        initSeedDropFromGrassSetting("cantaloupeseeddropfromgrass", "cantaloupeItem");
        initSeedDropFromGrassSetting("chilipepperseeddropfromgrass", "chilipepperItem");
        initSeedDropFromGrassSetting("coffeeseeddropfromgrass", "coffeeItem");
        initSeedDropFromGrassSetting("cornseeddropfromgrass", "cornItem");
        initSeedDropFromGrassSetting("cottonseeddropfromgrass", "cottonItem");
        initSeedDropFromGrassSetting("cucumberseeddropfromgrass", "cucumberItem");
        initSeedDropFromGrassSetting("eggplantseeddropfromgrass", "eggplantItem");
        initSeedDropFromGrassSetting("grapeseeddropfromgrass", "grapeItem");
        initSeedDropFromGrassSetting("kiwiseeddropfromgrass", "kiwiItem");
        initSeedDropFromGrassSetting("mustardseeddropfromgrass", "mustardItem");
        initSeedDropFromGrassSetting("okraseeddropfromgrass", "okraItem");
        initSeedDropFromGrassSetting("peasseeddropfromgrass", "peasItem");
        initSeedDropFromGrassSetting("raspberryseeddropfromgrass", "raspberryItem");
        initSeedDropFromGrassSetting("rhubarbseeddropfromgrass", "rhubarbItem");
        initSeedDropFromGrassSetting("seaweedseeddropfromgrass", "seaweedItem");
        initSeedDropFromGrassSetting("strawberryseeddropfromgrass", "strawberryItem");
        initSeedDropFromGrassSetting("tomatoseeddropfromgrass", "tomatoItem");
        initSeedDropFromGrassSetting("wintersquashseeddropfromgrass", "wintersquashItem");
        initSeedDropFromGrassSetting("zucchiniseeddropfromgrass", "zucchiniItem");
        initSeedDropFromGrassSetting("bambooshootseeddropfromgrass", "bambooshootItem");
        initSeedDropFromGrassSetting("spinachseeddropfromgrass", "spinachItem");
        initSeedDropFromGrassSetting("curryleafseeddropfromgrass", "curryleafItem");
        initSeedDropFromGrassSetting("sesameseedsseeddropfromgrass", "sesameseedsItem");
        initSeedDropFromGrassSetting("waterchestnutseeddropfromgrass", "waterchestnutItem");
    }

    private void initMiscRecipesSettings() {
        freshmilkfrombucket = config.get(CATEGORY_MISC_RECIPES, "freshmilkfrombucket", 4).getInt();
        freshwaterfrombucket = config.get(CATEGORY_MISC_RECIPES, "freshwaterfrombucket", 1).getInt();
        enablesaltfromwaterbucketrecipe = config.get(CATEGORY_MISC_RECIPES, "enablesaltfromwaterbucketrecipe", true).getBoolean();
        enablecroptoseedRecipe = config.get(CATEGORY_MISC_RECIPES, "enablecroptoseedRecipe", true).getBoolean();
        enableTofuAsMeatInRecipes = config.get(CATEGORY_MISC_RECIPES, "enabletofuasmeatinRecipes", true).getBoolean();
        enableTofuAsMilkInRecipes = config.get(CATEGORY_MISC_RECIPES, "enabletofuasmilkinRecipes", true).getBoolean();
        enablelistAllwaterfreshwater = config.get(CATEGORY_MISC_RECIPES, "enablelistAllwaterfreshwater", true).getBoolean();
        enablelistAllwatervanillawaterbucket = config.get(CATEGORY_MISC_RECIPES, "enablelistAllwatervanillawaterbucket", true).getBoolean();
        marketblockrecipeItem = config.get(CATEGORY_MISC_RECIPES, "marketblockrecipeItem", 0).getInt();
    }

    private void initSeedDropFromGrassSetting(String key, String item) {
        boolean doDrop = config.get(CATEGORY_SEEDS, key, false).getBoolean();

        seedDropFromGrass.put(item, doDrop);
    }

    /**
     * Configures drops from the various gardens; this needs to happen after the item registries are updated
     */
    public void configureGardenDrops() {
        final Pattern ITEM_STACK_PATTERN = Pattern.compile("(?:([0-9]+)x)?([\\w:]+)(?:[@:]([0-9]+))?");
        final Matcher ITEM_STACK_MATCHER = ITEM_STACK_PATTERN.matcher("");

        for (String garden : gardenDropConfig.keySet()) {
            System.out.println("Registering drops for '" + garden + "'.");

            List<ItemStack> drops = new ArrayList<>();
            String[] itemNames = gardenDropConfig.get(garden);

            for (String baseItemName : itemNames) {
                ITEM_STACK_MATCHER.reset(baseItemName);
                if (ITEM_STACK_MATCHER.find()) {
                    String itemName = ITEM_STACK_MATCHER.group(2);
                    int metadata = 0;
                    if (ITEM_STACK_MATCHER.group(3) != null) {
                        metadata = Integer.parseInt(ITEM_STACK_MATCHER.group(3));
                    }
                    int stackSize = 1;
                    if (ITEM_STACK_MATCHER.group(1) != null) {
                        stackSize = Integer.parseInt(ITEM_STACK_MATCHER.group(1));
                    }
                    ItemStack drop = GameRegistry.makeItemStack(itemName, metadata, stackSize, null);

                    // Check to make sure we got a valid item
                    if (drop != null) {
                        drops.add(drop);
                    } else {
                        // Otherwise, let the user know about it...
                        System.err.println("Unable to find item '" + baseItemName + "' to add to this garden.");
                    }
                }
            }

            BlockBaseGarden.drops.put(garden, drops);
        }
    }
}
