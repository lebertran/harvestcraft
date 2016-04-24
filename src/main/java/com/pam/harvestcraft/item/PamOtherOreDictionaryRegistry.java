/*    */ package com.pam.harvestcraft.item;
import com.pam.harvestcraft.blocks.BlockRegistry;

/*    */ 
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraftforge.oredict.OreDictionary;
/*    */ 
/*    */ 
/*    */ public class PamOtherOreDictionaryRegistry
/*    */ {
/*    */   public static void getRegistry()
/*    */   {
/* 11 */     OreDictionary.registerOre("toolPot", ItemRegistry.potItem);
/* 12 */     OreDictionary.registerOre("toolSkillet", ItemRegistry.skilletItem);
/* 13 */     OreDictionary.registerOre("toolSaucepan", ItemRegistry.saucepanItem);
/* 14 */     OreDictionary.registerOre("toolBakeware", ItemRegistry.bakewareItem);
/* 15 */     OreDictionary.registerOre("toolCuttingboard", ItemRegistry.cuttingboardItem);
/* 16 */     OreDictionary.registerOre("toolMortarandpestle", ItemRegistry.mortarandpestleItem);
/* 17 */     OreDictionary.registerOre("toolMixingbowl", ItemRegistry.mixingbowlItem);
/* 18 */     OreDictionary.registerOre("toolJuicer", ItemRegistry.juicerItem);
/*    */     
/* 20 */     OreDictionary.registerOre("cropCotton", ItemRegistry.cottonItem);
/* 21 */     OreDictionary.registerOre("seedCotton", ItemRegistry.cottonseedItem);
/* 22 */     OreDictionary.registerOre("materialCloth", ItemRegistry.wovencottonItem);
/*    */     
/* 24 */     OreDictionary.registerOre("cropCandle", ItemRegistry.candleberryItem);
/* 25 */     OreDictionary.registerOre("cropCandleberry", ItemRegistry.candleberryItem);
/* 26 */     OreDictionary.registerOre("seedCandleberry", ItemRegistry.candleberryseedItem);
/* 27 */     //OreDictionary.registerOre("materialPressedwax", ItemRegistry.waxItem);
/* 28 */     //OreDictionary.registerOre("materialHardenedleather", ItemRegistry.hardenedleatherItem);
/*    */     
/* 30 */     //OreDictionary.registerOre("grainBait", ItemRegistry.grainbaitItem);
/* 31 */     //OreDictionary.registerOre("veggieBait", ItemRegistry.veggiebaitItem);
/* 32 */     //OreDictionary.registerOre("fruitBait", ItemRegistry.fruitbaitItem);
/* 33 */     //OreDictionary.registerOre("fishtrapBait", ItemRegistry.fishtrapbaitItem);
/*    */     
/* 35 */     OreDictionary.registerOre("dustSalt", ItemRegistry.saltItem);
/* 36 */     OreDictionary.registerOre("itemSalt", ItemRegistry.saltItem);
/*    */     
/* 38 */     //OreDictionary.registerOre("beeQueen", ItemRegistry.queenbeeItem);
/* 39 */     //OreDictionary.registerOre("materialWaxcomb", ItemRegistry.waxcombItem);
/* 40 */     //OreDictionary.registerOre("materialHoneycomb", ItemRegistry.honeycombItem);
/* 41 */     OreDictionary.registerOre("foodHoneydrop", ItemRegistry.honeyItem);
/* 42 */     OreDictionary.registerOre("dropHoney", ItemRegistry.honeyItem);
/* 43 */     //OreDictionary.registerOre("materialPressedwax", ItemRegistry.beeswaxItem);
/* 44 */     //OreDictionary.registerOre("grubBee", ItemRegistry.grubItem);
/*    */     
/* 46 */     OreDictionary.registerOre("flowerRed", Blocks.red_flower);
/* 47 */     OreDictionary.registerOre("flowerYellow", Blocks.yellow_flower);
/*    */     
/* 49 */     OreDictionary.registerOre("blockTorch", Blocks.torch);
/* 50 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco1);
/* 51 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco2);
/* 52 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco3);
/* 53 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco4);
/* 54 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco5);
/* 55 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco6);
/* 56 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco7);
/* 57 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco8);
/* 58 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco9);
/* 59 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco10);
/* 60 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco11);
/* 61 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco12);
/* 62 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco13);
/* 63 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco14);
/* 64 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco15);
/* 65 */     //OreDictionary.registerOre("blockTorch", BlockRegistry.pamcandleDeco16);

	OreDictionary.registerOre("logWood", BlockRegistry.pamMaple);
	OreDictionary.registerOre("logWood", BlockRegistry.pamPaperbark);
	OreDictionary.registerOre("logWood", BlockRegistry.pamCinnamon);
/*    */   }
/*    */ }
