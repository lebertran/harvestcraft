package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;


public class PamOtherOreDictionaryRegistry {
    
    public static final String toolPot = "toolPot";
    public static final String toolSkillet = "toolSkillet";
    public static final String toolSaucepan = "toolSaucepan";
    public static final String toolBakeware = "toolBakeware";
    public static final String toolCuttingboard = "toolCuttingboard";
    public static final String toolMortarandpestle = "toolMortarandpestle";
    public static final String toolMixingbowl = "toolMixingbowl";
    public static final String toolJuicer = "toolJuicer";

    public static final String cropCotton = "cropCotton";
    public static final String seedCotton = "seedCotton";
    public static final String materialCloth = "materialCloth";

    public static final String cropCandle = "cropCandle";
    public static final String cropCandleberry = "cropCandleberry";
    public static final String seedCandleberry = "seedCandleberry";

    public static final String dustSalt = "dustSalt";
    public static final String itemSalt = "itemSalt";

    public static final String foodHoneydrop = "foodHoneydrop";
    public static final String dropHoney = "dropHoney";

    public static final String flowerRed = "flowerRed";
    public static final String flowerYellow = "flowerYellow";

    public static final String blockTorch = "blockTorch";
    public static final String logWood = "logWood";
    

    public static void getRegistry() {
        OreDictionary.registerOre(toolPot,  ItemRegistry.potItem);
        OreDictionary.registerOre(toolSkillet,  ItemRegistry.skilletItem);
        OreDictionary.registerOre(toolSaucepan,  ItemRegistry.saucepanItem);
        OreDictionary.registerOre(toolBakeware,  ItemRegistry.bakewareItem);
        OreDictionary.registerOre(toolCuttingboard,  ItemRegistry.cuttingboardItem);
        OreDictionary.registerOre(toolMortarandpestle,  ItemRegistry.mortarandpestleItem);
        OreDictionary.registerOre(toolMixingbowl,  ItemRegistry.mixingbowlItem);
        OreDictionary.registerOre(toolJuicer,  ItemRegistry.juicerItem);

        OreDictionary.registerOre(cropCotton,  ItemRegistry.cottonItem);
        OreDictionary.registerOre(seedCotton,  ItemRegistry.cottonseedItem);
        OreDictionary.registerOre(materialCloth,  ItemRegistry.wovencottonItem);

        OreDictionary.registerOre(cropCandle,  ItemRegistry.candleberryItem);
        OreDictionary.registerOre(cropCandleberry,  ItemRegistry.candleberryItem);
        OreDictionary.registerOre(seedCandleberry,  ItemRegistry.candleberryseedItem);

        OreDictionary.registerOre(dustSalt,  ItemRegistry.saltItem);
        OreDictionary.registerOre(itemSalt,  ItemRegistry.saltItem);

        OreDictionary.registerOre(foodHoneydrop,  ItemRegistry.honeyItem);
        OreDictionary.registerOre(dropHoney,  ItemRegistry.honeyItem);

        OreDictionary.registerOre(flowerRed,  Blocks.red_flower);
        OreDictionary.registerOre(flowerYellow,  Blocks.yellow_flower);

        OreDictionary.registerOre(blockTorch,  Blocks.torch);
        OreDictionary.registerOre(logWood,  BlockRegistry.pamMaple);
        OreDictionary.registerOre(logWood,  BlockRegistry.pamPaperbark);
        OreDictionary.registerOre(logWood,  BlockRegistry.pamCinnamon);
    }
}
