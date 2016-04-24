 package com.pam.harvestcraft.item;
 
 import com.pam.harvestcraft.blocks.BlockRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
 
 
 
 public class PamFoodRecipes
 {
/*  16 */   public static String[] cropName = { "cropAsparagus", "cropBarley", "cropBean", "cropBeet", "cropBroccoli", "cropCauliflower", "cropCelery", "cropCranberry", "cropGarlic", "cropGinger", "cropLeek", "cropLettuce", "cropOats", "cropOnion", "cropParsnip", "cropPeanut", "cropPineapple", "cropRadish", "cropRice", "cropRutabaga", "cropRye", "cropScallion", "cropSoybean", "cropSpiceleaf", "cropSweetpotato", "cropTea", "cropTurnip", "cropWhitemushroom", "cropArtichoke", "cropBellpepper", "cropBlackberry", "cropBlueberry", "cropBrusselsprout", "cropCabbage", "cropCactusfruit", "cropCandleberry", "cropCantaloupe", "cropChilipepper", "cropCoffee", "cropCorn", "cropCotton", "cropCucumber", "cropEggplant", "cropGrape", "cropKiwi", "cropMustard", "cropOkra", "cropPeas", "cropRaspberry", "cropRhubarb", "cropSeaweed", "cropStrawberry", "cropTomato", "cropWintersquash", "cropZucchini", "cropBambooshoot", "cropSpinach", "cropCurryleaf", "cropSesame", "cropWaterchestnut" };
   
public static void getRecipes()
   {
/*  39 */     for (int i = 0; i < 9; i++)
     {
/*  41 */       CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(BlockRegistry.PamTemperateSaplings[i], new Object[] { ItemRegistry.PamTemperateFruits[i], ItemRegistry.PamTemperateFruits[i], ItemRegistry.PamTemperateFruits[i], new ItemStack(Blocks.sapling, 1, 0) }));
     }
/*  43 */     for (int i = 0; i < 24; i++)
     {
/*  45 */       CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(BlockRegistry.PamWarmSaplings[i], new Object[] { ItemRegistry.PamWarmFruits[i], ItemRegistry.PamWarmFruits[i], ItemRegistry.PamWarmFruits[i], new ItemStack(Blocks.sapling, 1, 3) }));
     }
     
/*  48 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(BlockRegistry.pamcinnamonSapling, new Object[] { ItemRegistry.cinnamonItem, ItemRegistry.cinnamonItem, ItemRegistry.cinnamonItem, new ItemStack(Blocks.sapling, 1, 3) }));
/*  49 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(BlockRegistry.pampaperbarkSapling, new Object[] { Items.paper, Items.paper, Items.paper, new ItemStack(Blocks.sapling, 1, 3) }));
/*  50 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(BlockRegistry.pammapleSapling, new Object[] { ItemRegistry.maplesyrupItem, ItemRegistry.maplesyrupItem, ItemRegistry.maplesyrupItem, new ItemStack(Blocks.sapling, 1, 1) }));
     
/*  52 */     if (ItemRegistry.enablecroptoseedRecipe)
     {
/*  54 */       for (int i = 0; i < 60; i++)
       {
/*  56 */         if ((!BlockRegistry.enablecropspecialplanting) || ((ItemRegistry.PamCropItems[i] != ItemRegistry.cranberryItem) && (ItemRegistry.PamCropItems[i] != ItemRegistry.riceItem) && (ItemRegistry.PamCropItems[i] != ItemRegistry.seaweedItem)))
         {
 
 
/*  60 */           CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.PamSeeds[i], new Object[] { ItemRegistry.PamCropItems[i] }));
         }
       }
     }
/*  64 */     for (int i = 0; i < 60; i++)
     {
/*  66 */       CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.PamCropItems[i], 2), new Object[] { cropName[i], cropName[i] }));
     }
     
/*  69 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.sunflowerseedsItem, 2, 0), new Object[] { new ItemStack(Blocks.double_plant, 1, 0), new ItemStack(Blocks.double_plant, 1, 0) }));
     
/*  71 */     if (ItemRegistry.enablesaltfromwaterbucketrecipe)
     {
/*  73 */       CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saltItem, new Object[] { "toolPot", "listAllwater" }));
     }
     
/*  76 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.freshwaterItem, new Object[] { "listAllwater" }));
     
/*  78 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Items.sugar, new Object[] { "toolPot", "foodHoneydrop" }));
/*  79 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Items.sugar, new Object[] { "toolPot", "dropHoney" }));
     
/*  81 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Items.fish, new Object[] { "listAllfishraw" }));
     
 
/*  84 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.freshwaterItem, ItemRegistry.freshwaterfrombucket), new Object[] { Items.water_bucket }));
/*  85 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.freshmilkItem, ItemRegistry.freshmilkfrombucket), new Object[] { Items.milk_bucket }));
     
/*  87 */     CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Items.cake, 1), new Object[] { "AAA", "BEB", "CCC", Character.valueOf('A'), "listAllmilk", Character.valueOf('B'), "honeyEqualssugar", Character.valueOf('C'), "flourEqualswheat", Character.valueOf('E'), "listAllegg" }));
     
 
 
/*  91 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(Items.mushroom_stew, new Object[] { Items.bowl, "listAllmushroom", "listAllmushroom" }));
     
/*  93 */     GameRegistry.addSmelting(ItemRegistry.doughItem, new ItemStack(Items.bread, 1, 0), 0.1F);
/*  94 */     GameRegistry.addSmelting(Items.bread, new ItemStack(ItemRegistry.toastItem, 1, 0), 0.1F);
/*  95 */     GameRegistry.addSmelting(Items.pumpkin_seeds, new ItemStack(ItemRegistry.roastedpumpkinseedsItem, 1, 0), 0.1F);
/*  96 */     GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
/*  97 */     GameRegistry.addSmelting(Blocks.red_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
     
/*  99 */     //GameRegistry.addSmelting(ItemRegistry.muttonrawItem, new ItemStack(ItemRegistry.muttoncookedItem, 1, 0), 0.1F);
/* 100 */     GameRegistry.addSmelting(ItemRegistry.calamarirawItem, new ItemStack(ItemRegistry.calamaricookedItem, 1, 0), 0.1F);
     
/* 102 */     GameRegistry.addSmelting(ItemRegistry.asparagusItem, new ItemStack(ItemRegistry.grilledasparagusItem, 1, 0), 0.1F);
/* 103 */     GameRegistry.addSmelting(ItemRegistry.riceItem, new ItemStack(ItemRegistry.ricecakeItem, 1, 0), 0.1F);
/* 104 */     GameRegistry.addSmelting(ItemRegistry.tealeafItem, new ItemStack(ItemRegistry.teaItem, 1, 0), 0.1F);
/* 105 */     GameRegistry.addSmelting(ItemRegistry.cornItem, new ItemStack(ItemRegistry.popcornItem, 1, 0), 0.1F);
/* 106 */     GameRegistry.addSmelting(ItemRegistry.sweetpotatoItem, new ItemStack(ItemRegistry.bakedsweetpotatoItem, 1, 0), 0.1F);
/* 107 */     GameRegistry.addSmelting(ItemRegistry.coffeebeanItem, new ItemStack(ItemRegistry.coffeeItem, 1, 0), 0.1F);
/* 108 */     GameRegistry.addSmelting(ItemRegistry.eggplantItem, new ItemStack(ItemRegistry.grilledeggplantItem, 1, 0), 0.1F);
/* 109 */     GameRegistry.addSmelting(ItemRegistry.grapeItem, new ItemStack(ItemRegistry.raisinsItem, 1, 0), 0.1F);
/* 110 */     GameRegistry.addSmelting(ItemRegistry.whitemushroomItem, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
/* 111 */     GameRegistry.addSmelting(ItemRegistry.coconutItem, new ItemStack(ItemRegistry.toastedcoconutItem, 1, 0), 0.1F);
/* 112 */     GameRegistry.addSmelting(ItemRegistry.vanillabeanItem, new ItemStack(ItemRegistry.vanillaItem, 1, 0), 0.1F);
/* 113 */     GameRegistry.addSmelting(ItemRegistry.chestnutItem, new ItemStack(ItemRegistry.roastedchestnutItem, 1, 0), 0.1F);
/* 114 */     GameRegistry.addSmelting(ItemRegistry.sesameseedsItem, new ItemStack(ItemRegistry.toastedsesameseedsItem, 1, 0), 0.1F);
     
/* 116 */     GameRegistry.addSmelting(ItemRegistry.anchovyrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 117 */     GameRegistry.addSmelting(ItemRegistry.bassrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 118 */     GameRegistry.addSmelting(ItemRegistry.carprawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 119 */     GameRegistry.addSmelting(ItemRegistry.catfishrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 120 */     GameRegistry.addSmelting(ItemRegistry.charrrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 121 */     GameRegistry.addSmelting(ItemRegistry.eelrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 122 */     GameRegistry.addSmelting(ItemRegistry.grouperrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 123 */     GameRegistry.addSmelting(ItemRegistry.herringrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 124 */     GameRegistry.addSmelting(ItemRegistry.mudfishrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 125 */     GameRegistry.addSmelting(ItemRegistry.perchrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 126 */     GameRegistry.addSmelting(ItemRegistry.snapperrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 127 */     GameRegistry.addSmelting(ItemRegistry.tilapiarawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 128 */     GameRegistry.addSmelting(ItemRegistry.troutrawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 129 */     GameRegistry.addSmelting(ItemRegistry.tunarawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
/* 130 */     GameRegistry.addSmelting(ItemRegistry.walleyerawItem, new ItemStack(Items.cooked_fish, 1, 0), 0.1F);
     
 
/* 133 */     GameRegistry.addSmelting(ItemRegistry.clamrawItem, new ItemStack(ItemRegistry.clamcookedItem, 1, 0), 0.1F);
/* 134 */     GameRegistry.addSmelting(ItemRegistry.crabrawItem, new ItemStack(ItemRegistry.crabcookedItem, 1, 0), 0.1F);
/* 135 */     GameRegistry.addSmelting(ItemRegistry.crayfishrawItem, new ItemStack(ItemRegistry.crayfishcookedItem, 1, 0), 0.1F);
/* 136 */     GameRegistry.addSmelting(ItemRegistry.frograwItem, new ItemStack(ItemRegistry.frogcookedItem, 1, 0), 0.1F);
/* 137 */     GameRegistry.addSmelting(ItemRegistry.octopusrawItem, new ItemStack(ItemRegistry.octopuscookedItem, 1, 0), 0.1F);
/* 138 */     GameRegistry.addSmelting(ItemRegistry.scalloprawItem, new ItemStack(ItemRegistry.scallopcookedItem, 1, 0), 0.1F);
/* 139 */     GameRegistry.addSmelting(ItemRegistry.shrimprawItem, new ItemStack(ItemRegistry.shrimpcookedItem, 1, 0), 0.1F);
/* 140 */     GameRegistry.addSmelting(ItemRegistry.snailrawItem, new ItemStack(ItemRegistry.snailcookedItem, 1, 0), 0.1F);
/* 141 */     GameRegistry.addSmelting(ItemRegistry.turtlerawItem, new ItemStack(ItemRegistry.turtlecookedItem, 1, 0), 0.1F);
     
 
/* 144 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.silkentofuItem, new Object[] { "toolSaucepan", "cropSoybean" }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.firmtofuItem, new Object[] { "toolSkillet", "foodSilkentofu" }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.soymilkItem, new Object[] { "toolPot", "cropSoybean" }));

/* 144 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", Items.wheat }));
/* 145 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropRice" }));
/* 146 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", Items.potato }));
/* 147 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropRye" }));
/* 148 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropOats" }));
/* 149 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.flourItem, new Object[] { "toolMortarandpestle", "cropBarley" }));
/* 150 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "foodSalt" }));
/* 151 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "dustSalt" }));
/* 152 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.doughItem, new Object[] { "toolMixingbowl", "listAllwater", "foodFlour", "itemSalt" }));
     
/* 154 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pastaItem, new Object[] { "toolMixingbowl", "foodDough", "foodButter" }));
/* 155 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.heavycreamItem, new Object[] { "toolMixingbowl", "listAllmilk" }));
/* 156 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "foodSalt" }));
/* 157 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "dustSalt" }));
/* 158 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.butterItem, new Object[] { "toolSaucepan", "listAllheavycream", "itemSalt" }));
     
 
/* 161 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "foodSalt" }));
/* 162 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "dustSalt" }));
/* 163 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cheeseItem, new Object[] { "toolPot", "listAllmilk", "itemSalt" }));
     
 
/* 166 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "foodSalt", Items.snowball }));
/* 167 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "dustSalt", Items.snowball }));
/* 168 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.icecreamItem, new Object[] { "toolMixingbowl", "listAllmilk", "itemSalt", Items.snowball }));
     
/* 170 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grilledcheeseItem, new Object[] { "toolSkillet", "foodToast", "foodButter", "foodCheese" }));
/* 171 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.applesauceItem, new Object[] { "toolPot", "cropApple" }));
/* 172 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.applejuiceItem, new Object[] { "toolJuicer", "cropApple" }));
/* 173 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.applepieItem, new Object[] { "toolBakeware", "cropApple", "listAllsugar", "foodDough" }));
/* 174 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.caramelappleItem, new Object[] { "cropApple", "foodCaramel", "stickWood" }));
/* 175 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pumpkinbreadItem, new Object[] { "toolBakeware", Blocks.pumpkin, "listAllsugar", "foodDough" }));
/* 176 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pumpkinsoupItem, new Object[] { "toolPot", Blocks.pumpkin, "listAllheavycream", "foodStock" }));
/* 177 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.melonjuiceItem, new Object[] { "toolJuicer", Items.melon }));
/* 178 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.melonsmoothieItem, new Object[] { "toolJuicer", Items.melon, Items.snowball }));
/* 179 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.carrotjuiceItem, new Object[] { "toolJuicer", Items.carrot }));
/* 180 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.carrotcakeItem, new Object[] { "toolBakeware", Items.carrot, "listAllsugar", "foodDough" }));
/* 181 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.carrotsoupItem, new Object[] { "toolPot", Items.carrot, "listAllheavycream", "foodStock" }));
/* 182 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.glazedcarrotsItem, new Object[] { "toolSaucepan", Items.carrot, "foodButter", "listAllsugar" }));
/* 183 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.butteredpotatoItem, new Object[] { Items.baked_potato, "foodButter" }));
/* 184 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.loadedbakedpotatoItem, new Object[] { "foodButteredpotato", "listAllporkcooked", "foodCheese" }));
/* 185 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "foodSalt" }));
/* 186 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "dustSalt" }));
/* 187 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, new Object[] { "toolMixingbowl", "foodButteredpotato", "itemSalt" }));
     
/* 189 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potatosaladItem, new Object[] { "toolCuttingboard", Items.baked_potato, "foodMayo" }));
/* 190 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "foodSalt", "foodStock" }));
/* 191 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "dustSalt", "foodStock" }));
/* 192 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potatosoupItem, new Object[] { "toolPot", Items.potato, "itemSalt", "foodStock" }));
     
/* 194 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "foodSalt" }));
/* 195 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "dustSalt" }));
/* 196 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friesItem, new Object[] { "toolBakeware", Items.potato, "itemSalt" }));
     
/* 198 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" }));
/* 199 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" }));
/* 200 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stuffedmushroomItem, new Object[] { "toolBakeware", "listAllmushroom", "foodCheese", "foodToast" }));
/* 201 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grilledmushroomItem, new Object[] { "toolSkillet", "listAllmushroom" }));
/* 202 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickensandwichItem, new Object[] { "toolSkillet", "listAllchickenraw", Items.bread, "foodMayo" }));
/* 203 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickennoodlesoupItem, new Object[] { "toolPot", "listAllchickenraw", Items.carrot, "foodPasta", "foodStock" }));
/* 204 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickenpotpieItem, new Object[] { "toolBakeware", "listAllchickenraw", Items.potato, Items.carrot, "foodDough" }));
/* 205 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.breadedporkchopItem, new Object[] { "toolSkillet", "listAllporkraw", "foodFlour" }));
/* 206 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hotdogItem, new Object[] { "toolPot", "listAllporkraw", Items.bread }));
/* 207 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bakedhamItem, new Object[] { "toolBakeware", "listAllporkraw", "cropApple", "listAllsugar" }));
/* 208 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hamburgerItem, new Object[] { "toolSkillet", "listAllbeefraw", "foodToast" }));
/* 209 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cheeseburgerItem, new Object[] { "foodHamburger", "foodCheese" }));
/* 210 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.baconcheeseburgerItem, new Object[] { "foodCheeseburger", "listAllporkcooked" }));
/* 211 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potroastItem, new Object[] { "toolPot", "listAllbeefraw", Items.potato, Items.carrot, "foodStock" }));
/* 212 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, new Object[] { "toolSkillet", "listAllfishraw", "foodMayo", Items.bread }));
/* 213 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, new Object[] { "toolBakeware", "listAllfishraw", "foodFlour" }));
/* 214 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishandchipsItem, new Object[] { "foodFishsticks", "foodFries" }));
/* 215 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mayoItem, new Object[] { "toolJuicer", "listAllegg" }));
/* 216 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friedeggItem, new Object[] { "toolSkillet", "listAllegg" }));
/* 217 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.scrambledeggItem, new Object[] { "toolSaucepan", "listAllegg" }));
/* 218 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.boiledeggItem, new Object[] { "toolPot", "listAllegg" }));
/* 219 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.eggsaladItem, new Object[] { "toolCuttingboard", "foodBoiledegg", "foodMayo" }));
/* 220 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.caramelItem, new Object[] { "toolSaucepan", "listAllsugar" }));
/* 221 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "foodSalt" }));
/* 222 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "dustSalt" }));
/* 223 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.taffyItem, new Object[] { "toolSaucepan", "listAllsugar", "listAllwater", "itemSalt" }));
     
/* 225 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spidereyesoupItem, new Object[] { "toolPot", Items.spider_eye, "foodStock" }));
/* 226 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "foodSalt", "foodSalt" }));
/* 227 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "dustSalt", "dustSalt" }));
/* 228 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "itemSalt" }));
/* 229 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "dustSalt" }));
/* 230 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "itemSalt", "foodSalt" }));
/* 231 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zombiejerkyItem, new Object[] { Items.rotten_flesh, "foodSalt", "dustSalt" }));
     
/* 233 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cocoapowderItem, new Object[] { "toolMortarandpestle", new ItemStack(Items.dye, 1, 3) }));
/* 234 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatebarItem, new Object[] { "toolSaucepan", "foodCocoapowder", "foodButter", "listAllmilk" }));
/* 235 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hotchocolateItem, new Object[] { "toolJuicer", "foodCocoapowder", "listAllmilk" }));
/* 236 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolateicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodCocoapowder" }));
/* 237 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" }));
/* 238 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" }));
/* 239 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, new Object[] { "toolPot", Items.potato, Items.carrot, "listAllmushroom", "foodStock" }));
/* 240 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", Items.bone }));
/* 241 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", "listAllmeatraw" }));
/* 242 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), new Object[] { "toolPot", "listAllveggie" }));
/* 243 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fruitsaladItem, new Object[] { "toolCuttingboard", "listAllfruit", "listAllfruit" }));
     
/* 245 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spagettiItem, new Object[] { "toolSaucepan", "cropTomato", "foodPasta", "cropSpiceleaf" }));
/* 246 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spagettiandmeatballsItem, new Object[] { "toolMixingbowl", "foodSpagetti", "listAllbeefcooked" }));
/* 247 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.tomatosoupItem, new Object[] { "toolPot", "cropTomato", "foodStock" }));
/* 248 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.ketchupItem, new Object[] { "toolJuicer", "cropTomato" }));
/* 249 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickenparmasanItem, new Object[] { "toolBakeware", "listAllchickencooked", "cropTomato", "foodCheese" }));
/* 250 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pizzaItem, new Object[] { "toolBakeware", "foodDough", "cropTomato", "foodCheese", "listAllporkraw" }));
     
/* 252 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", Items.carrot }));
/* 253 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropOnion" }));
/* 254 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropRadish" }));
/* 255 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropCucumber" }));
/* 256 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropBellpepper" }));
/* 257 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropSpiceleaf" }));
/* 258 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropZucchini" }));
/* 259 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropASparagus" }));
/* 260 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropBroccoli" }));
/* 261 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropPeas" }));
/* 262 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropTomato" }));
/* 263 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropSunflower" }));
/* 264 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropWalnut" }));
/* 265 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropCauliflower" }));
/* 266 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.springsaladItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropRhubarb" }));
/* 267 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.porklettucewrapItem, new Object[] { "toolCuttingboard", "cropLettuce", "listAllporkcooked" }));
/* 268 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, new Object[] { "toolCuttingboard", "cropLettuce", "listAllfishcooked" }));
/* 269 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bltItem, new Object[] { "toolCuttingboard", "cropLettuce", "cropTomato", "listAllporkcooked", "foodToast" }));
/* 270 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.leafychickensandwichItem, new Object[] { "foodChickensandwich", "cropLettuce" }));
/* 271 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.leafyfishsandwichItem, new Object[] { "foodFishsandwich", "cropLettuce" }));
/* 272 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.deluxecheeseburgerItem, new Object[] { "foodCheeseburger", "cropLettuce", "cropTomato" }));
/* 273 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.delightedmealItem, new Object[] { "foodDeluxecheeseburger", "foodFries", "listAllsmoothie" }));
/* 274 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.delightedmealItem, new Object[] { "foodDeluxecheeseburger", "foodZucchinifries", "listAllsmoothie" }));
     
/* 276 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.onionsoupItem, new Object[] { "toolPot", "cropOnion", "foodStock", "foodGrilledcheese" }));
/* 277 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potatocakesItem, new Object[] { "toolSkillet", "cropOnion", Items.potato, "foodButter" }));
/* 278 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hashItem, new Object[] { "toolSkillet", "cropOnion", "listAllbeefcooked", Items.potato, "foodKetchup" }));
/* 279 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.braisedonionsItem, new Object[] { "toolSaucepan", "cropOnion", "foodButter", "foodStock" }));
/* 280 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.heartybreakfastItem, new Object[] { "listAllporkcooked", "foodFriedegg", "foodToast", "foodPotatocakes", "listAlljuice" }));
/* 281 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.heartybreakfastItem, new Object[] { "listAllporkcooked", "foodFriedegg", "foodToast", "foodPotatocakes", "foodChocolatemilk" }));
     
/* 283 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cornonthecobItem, new Object[] { "cropCorn", "foodButter" }));
/* 284 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cornmealItem, new Object[] { "toolMortarandpestle", "cropCorn" }));
/* 285 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cornbreadItem, new Object[] { "toolSkillet", "foodCornmeal", "listAllegg", "listAllmilk" }));
/* 286 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.tortillaItem, new Object[] { "toolSkillet", "foodCornmeal", "listAllwater" }));
/* 287 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.nachoesItem, new Object[] { "toolCuttingboard", "foodTortilla", "foodCheese" }));
/* 288 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.tacoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodCheese", "foodTortilla" }));
/* 289 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, new Object[] { "toolCuttingboard", "listAllfishcooked", "cropLettuce", "foodCheese", "foodTortilla" }));
/* 290 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.creamedcornItem, new Object[] { "toolSaucepan", "cropCorn", "cropOnion", "foodHeavycream" }));
     
/* 292 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberrysmoothieItem, new Object[] { "toolJuicer", "cropStrawberry", Items.snowball }));
/* 293 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberrypieItem, new Object[] { "toolBakeware", "cropStrawberry", "foodDough", "listAllsugar" }));
/* 294 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberrysaladItem, new Object[] { "cropStrawberry", "foodFruitsalad" }));
/* 295 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberryjuiceItem, new Object[] { "toolJuicer", "cropStrawberry" }));
/* 296 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatestrawberryItem, new Object[] { "toolSaucepan", "cropStrawberry", "foodChocolatebar" }));
     
/* 298 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peanutbutterItem, new Object[] { "toolJuicer", "cropPeanut" }));
/* 299 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "listAllseed", "listAllseed", "listAllseed", "listAllseed", "listAllseed", "listAllseed", "foodRaisins", "foodChocolatebar" }));
/* 300 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "foodSaltedsunflowerseeds", "foodRaisins", "foodChocolatebar" }));
/* 301 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "listAllnut", "listAllnut", "foodRaisins", "foodChocolatebar" }));
/* 302 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.trailmixItem, new Object[] { "foodRoastedpumpkinseeds", "foodRaisins", "foodChocolatebar" }));
/* 303 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pbandjItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGrapejelly", Items.bread }));
/* 304 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peanutbuttercookiesItem, new Object[] { "toolBakeware", "listAllnutbutter", "foodFlour", "listAllegg", "listAllsugar" }));
     
/* 306 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapejuiceItem, new Object[] { "toolJuicer", "cropGrape" }));
/* 307 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vinegarItem, new Object[] { "toolPot", "foodGrapejuice" }));
/* 308 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapejellyItem, new Object[] { "toolSaucepan", "cropGrape", "listAllsugar" }));
/* 309 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapesaladItem, new Object[] { "cropGrape", "foodFruitsalad" }));
/* 310 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raisincookiesItem, new Object[] { "toolBakeware", "foodFlour", "listAllegg", "listAllsugar", "foodRaisins" }));
     
/* 312 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "foodSalt", "foodVinegar" }));
/* 313 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "dustSalt", "foodVinegar" }));
/* 314 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.picklesItem, new Object[] { "toolPot", "cropCucumber", "itemSalt", "foodVinegar" }));
     
/* 316 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cucumbersaladItem, new Object[] { "toolCuttingboard", "cropCucumber", "foodSpringsalad" }));
/* 317 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cucumbersoupItem, new Object[] { "toolPot", "cropCucumber", "foodStock", "listAllheavycream" }));
/* 318 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vegetarianlettucewrapItem, new Object[] { "toolCuttingboard", "cropCucumber", "cropLettuce", "cropTomato" }));
/* 319 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.marinatedcucumbersItem, new Object[] { "toolPot", "cropCucumber", "cropOnion", "listAllsugar", "foodVinegar" }));
     
/* 321 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.ricesoupItem, new Object[] { "toolPot", "cropRice", "foodStock" }));
/* 322 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friedriceItem, new Object[] { "toolSkillet", "cropRice", Items.carrot, "listAllegg", "cropOnion" }));
/* 323 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mushroomrisottoItem, new Object[] { "toolBakeware", "cropRice", "listAllmushroom", "cropOnion", "foodCheese" }));
/* 324 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "foodSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" }));
/* 325 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "dustSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" }));
/* 326 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.curryItem, new Object[] { "toolSaucepan", "cropRice", "itemSalt", "cropChilipepper", "foodCoconutmilk", "listAllspice" }));
     
/* 328 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.rainbowcurryItem, new Object[] { "toolSkillet", "cropRice", "flowerRed", "flowerYellow", "flowerOrange", "flowerGreen", "flowerPurple", "flowerBlue" }));
     
/* 330 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.refriedbeansItem, new Object[] { "toolSkillet", "cropBean", "cropOnion", "foodButter" }));
/* 331 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bakedbeansItem, new Object[] { "toolPot", "cropBean", "listAllporkcooked", "listAllsugar" }));
/* 332 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropOnion", "listAllporkcooked" }));
/* 333 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropBellpepper", "listAllporkcooked" }));
/* 334 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, new Object[] { "toolPot", "cropBean", "cropRice", "cropChilipepper", "listAllporkcooked" }));
/* 335 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropOnion", "listAllbeefcooked" }));
/* 336 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropBellpepper", "listAllbeefcooked" }));
/* 337 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chiliItem, new Object[] { "toolPot", "cropBean", "cropChilipepper", "listAllbeefcooked" }));
/* 338 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beanburritoItem, new Object[] { "toolSkillet", "cropBean", "foodTortilla", "cropRice", "foodCheese" }));
     
/* 340 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stuffedpepperItem, new Object[] { "toolBakeware", "cropBellpepper", "cropTomato", "cropRice" }));
/* 341 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "cropBean" }));
/* 342 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "cropChilipepper" }));
/* 343 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" }));
/* 344 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" }));
/* 345 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.veggiestirfryItem, new Object[] { "toolSkillet", "cropBellpepper", Items.carrot, "cropRice", "cropOnion", "listAllmushroom" }));
/* 346 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grilledskewersItem, new Object[] { "toolCuttingboard", "cropBellpepper", "cropOnion", Items.carrot, "stickWood" }));
/* 347 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.supremepizzaItem, new Object[] { "toolCuttingboard", "foodPizza", "cropBellpepper", "cropOnion", "cropSpiceleaf" }));
/* 348 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.omeletItem, new Object[] { "toolSkillet", "listAllegg", "cropBellpepper", "cropOnion" }));
     
/* 350 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hotwingsItem, new Object[] { "toolSkillet", "cropChilipepper", "listAllchickencooked", "foodButter" }));
/* 351 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chilipoppersItem, new Object[] { "toolBakeware", "cropChilipepper", "foodFlour", "foodCheese" }));
/* 352 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.extremechiliItem, new Object[] { "foodChili", "cropChilipepper" }));
/* 353 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chilichocolateItem, new Object[] { "toolMixingbowl", "foodChocolatebar", "cropChilipepper" }));
     
/* 355 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonaideItem, 1), new Object[] { "toolJuicer", "cropLemon" }));
/* 356 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonbarItem, 1), new Object[] { "toolBakeware", "cropLemon", "foodDough", "listAllsugar" }));
/* 357 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), new Object[] { "toolSkillet", "cropLemon", "foodFlour", "listAllfishraw", "foodMayo" }));
/* 358 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonsmoothieItem, 1), new Object[] { "toolJuicer", "cropLemon", Items.snowball }));
/* 359 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonmeringueItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllsugar", "foodDough", "listAllheavycream" }));
/* 360 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.candiedlemonItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllsugar" }));
/* 361 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.lemonchickenItem, 1), new Object[] { "toolBakeware", "cropLemon", "listAllchickenraw", "foodButter" }));
     
/* 363 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberrysmoothieItem, new Object[] { "toolJuicer", "cropBlueberry", Items.snowball }));
/* 364 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberrypieItem, new Object[] { "toolBakeware", "cropBlueberry", "foodDough", "listAllsugar" }));
/* 365 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberrymuffinItem, new Object[] { "toolBakeware", "cropBlueberry", "foodFlour", "listAllegg" }));
/* 366 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberryjuiceItem, new Object[] { "toolJuicer", "cropBlueberry" }));
/* 367 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pancakesItem, new Object[] { "toolSkillet", "foodFlour", "listAllegg", "listAllmilk" }));
/* 368 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberrypancakesItem, new Object[] { "cropBlueberry", "foodPancakes" }));
     
/* 370 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherryjuiceItem, 1), new Object[] { "toolJuicer", "cropCherry" }));
/* 371 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherrypieItem, 1), new Object[] { "toolBakeware", "cropCherry", "foodDough", "listAllsugar" }));
/* 372 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.chocolatecherryItem, 1), new Object[] { "toolSaucepan", "cropCherry", "foodChocolatebar" }));
/* 373 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherrysmoothieItem, 1), new Object[] { "toolJuicer", "cropCherry", Items.snowball }));
/* 374 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cheesecakeItem, 1), new Object[] { "toolBakeware", "foodFlour", "listAllheavycream", "listAllsugar", "listAllegg" }));
/* 375 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cherrycheesecakeItem, 1), new Object[] { "cropCherry", "foodCheesecake" }));
     
/* 377 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stuffedeggplantItem, new Object[] { "toolBakeware", "cropEggplant", "cropOnion", "cropBellpepper", "foodButter", "listAllegg" }));
/* 378 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stuffedeggplantItem, new Object[] { "toolBakeware", "cropEggplant", "cropGarlic" }));
/* 379 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.eggplantparmItem, new Object[] { "toolBakeware", "cropEggplant", "cropTomato", "foodPasta", "foodCheese" }));
     
/* 381 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberryicedteaItem, new Object[] { "cropTea", Items.snowball, "cropRaspberry" }));
/* 382 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chaiteaItem, new Object[] { "cropTea", "foodGroundcinnamon", "foodBlackpepper" }));
     
/* 384 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.espressoItem, new Object[] { "cropCoffee", "cropCoffee", "cropCoffee", "listAllsugar" }));
/* 385 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coffeeconlecheItem, new Object[] { "foodEspresso", "listAllmilk", "foodGroundcinnamon" }));
/* 386 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mochaicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropCoffee", "foodCocoapowder" }));
     
/* 388 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "foodSalt" }));
/* 389 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "dustSalt" }));
/* 390 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pickledbeetsItem, new Object[] { "toolPot", "cropBeet", "foodVinegar", "itemSalt" }));
     
/* 392 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beetsaladItem, new Object[] { "toolMixingbowl", "cropBeet", "cropLettuce", "foodVinegar", "foodCheese" }));
/* 393 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beetsoupItem, new Object[] { "toolPot", "cropBeet", "cropOnion", "foodBlackpepper", "listAllmilk" }));
/* 394 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bakedbeetsItem, new Object[] { "toolBakeware", "cropBeet", "foodButter", "foodBlackpepper" }));
     
/* 396 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.broccolimacItem, new Object[] { "toolPot", "cropBroccoli", "foodPasta", "foodCheese" }));
/* 397 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.broccolindipItem, new Object[] { "toolMixingbowl", "cropBroccoli", "cropOnion", "listAllheavycream" }));
/* 398 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.creamedbroccolisoupItem, new Object[] { "toolPot", "cropBroccoli", Items.carrot, "foodFlour", "foodBlackpepper", "foodStock" }));
     
/* 400 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sweetpotatopieItem, new Object[] { "toolBakeware", "cropSweetpotato", "foodDough", "foodGroundcinnamon", "foodMarshmellows" }));
/* 401 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.candiedsweetpotatoesItem, new Object[] { "toolSaucepan", "cropSweetpotato", "listAllsugar", "foodGroundcinnamon" }));
/* 402 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mashedsweetpotatoesItem, new Object[] { "toolSaucepan", "cropSweetpotato", "foodButter" }));
     
/* 404 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "foodSalt" }));
/* 405 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "dustSalt" }));
/* 406 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.steamedpeasItem, new Object[] { "toolPot", "cropPeas", "listAllwater", "itemSalt" }));
     
/* 408 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.splitpeasoupItem, new Object[] { "toolPot", "cropPeas", "listAllporkcooked", "foodBlackpepper", "foodStock" }));
     
/* 410 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pineappleupsidedowncakeItem, new Object[] { "toolBakeware", "cropPineapple", "foodDough", "cropCherry", "cropWalnut" }));
/* 411 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pineapplehamItem, new Object[] { "toolBakeware", "cropPineapple", "listAllporkraw", "cropCherry", "listAllsugar" }));
/* 412 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pineappleyogurtItem, new Object[] { "cropPineapple", "foodPlainyogurt" }));
     
/* 414 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.turnipsoupItem, new Object[] { "toolPot", "cropTurnip", Blocks.pumpkin, "foodButter", "foodStock" }));
/* 415 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropTurnip", Items.carrot, "cropOnion", "cropSpiceleaf" }));
/* 416 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", Blocks.pumpkin, Items.carrot, "cropOnion", "cropSpiceleaf" }));
/* 417 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", Items.potato, Items.carrot, "cropOnion", "cropSpiceleaf" }));
/* 418 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropSweetpotato", Items.carrot, "cropOnion", "cropSpiceleaf" }));
/* 419 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropRadish", Items.carrot, "cropOnion", "cropSpiceleaf" }));
/* 420 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, new Object[] { "toolBakeware", "cropParsnip", Items.carrot, "cropOnion", "cropSpiceleaf" }));
/* 421 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "foodSalt", "foodBlackpepper" }));
/* 422 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "dustSalt", "foodBlackpepper" }));
/* 423 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bakedturnipsItem, new Object[] { "toolBakeware", "cropTurnip", "foodButter", "itemSalt", "foodBlackpepper" }));
     
/* 425 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gingerbreadItem, new Object[] { "toolBakeware", "cropGinger", "foodFlour", "foodButter", "listAllegg", "foodGroundcinnamon" }));
/* 426 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gingersnapsItem, new Object[] { "toolBakeware", "cropGinger", "foodFlour", "listAllsugar" }));
/* 427 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.candiedgingerItem, new Object[] { "toolSaucepan", "cropGinger", "listAllsugar" }));
     
/* 429 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mustardItem, new Object[] { "toolJuicer", "cropMustard" }));
/* 430 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.softpretzelandmustardItem, new Object[] { "foodSoftpretzel", "foodMustard" }));
/* 431 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "foodBlackpepper" }));
/* 432 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "cropGarlic" }));
/* 433 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "foodSalt" }));
/* 434 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "dustSalt" }));
/* 435 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicymustardporkItem, new Object[] { "toolSaucepan", "foodMustard", "listAllporkraw", "itemSalt" }));
     
/* 437 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropLettuce", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" }));
/* 438 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropBroccoli", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" }));
/* 439 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicygreensItem, new Object[] { "toolSaucepan", "foodMustard", "cropPeas", "foodBlackpepper", "cropGarlic", "foodOliveoil", "cropOnion" }));
     
/* 441 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.garlicbreadItem, new Object[] { "cropGarlic", "foodToast", "foodButter" }));
/* 442 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.garlicmashedpotatoesItem, new Object[] { "foodMashedpotatoes", "cropGarlic" }));
/* 443 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.garlicchickenItem, new Object[] { "toolBakeware", "cropGarlic", "cropGarlic", "cropGarlic", "foodOliveoil", "listAllchickenraw" }));
     
/* 445 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.summerradishsaladItem, new Object[] { "toolMixingbowl", "cropRadish", "cropOnion", "cropCucumber", "foodVinegar" }));
/* 446 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.summersquashwithradishItem, new Object[] { "toolMixingbowl", "cropRadish", "cropZucchini", Blocks.pumpkin, "cropSpiceleaf", "foodOliveoil" }));
     
/* 448 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.celeryandpeanutbutterItem, new Object[] { "cropCelery", "listAllnutbutter" }));
/* 449 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" }));
/* 450 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" }));
/* 451 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickencelerycasseroleItem, new Object[] { "toolBakeware", "cropCelery", "listAllchickenraw", "cropGarlic", Items.carrot, "listAllmushroom" }));
/* 452 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peasandceleryItem, new Object[] { "toolMixingbowl", "cropCelery", "cropPeas", "cropLemon", "foodBlackpepper" }));
/* 453 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.celerysoupItem, new Object[] { "toolPot", "cropCelery", "cropOnion", Items.carrot, "foodStock" }));
     
/* 455 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zucchinibreadItem, new Object[] { "toolBakeware", "cropZucchini", "foodDough", "foodGroundcinnamon", "cropWalnut" }));
/* 456 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zucchinifriesItem, new Object[] { "toolBakeware", "cropZucchini", "foodToast", "foodCheese", "listAllegg" }));
/* 457 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zestyzucchiniItem, new Object[] { "toolBakeware", "cropZucchini", "foodPasta", "cropChilipepper", "cropGarlic", "foodCheese" }));
/* 458 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zucchinibakeItem, new Object[] { "toolBakeware", "cropZucchini", "cropTomato", "foodToast", "cropCorn", "foodCheese" }));
     
/* 460 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.asparagusquicheItem, new Object[] { "toolSkillet", "cropAsparagus", "listAllegg", "cropOnion", "foodCheese" }));
/* 461 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.asparagussoupItem, new Object[] { "toolPot", "cropAsparagus", "cropOnion", "foodButter", "foodStock" }));
     
/* 463 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.walnutraisinbreadItem, new Object[] { "toolBakeware", "cropWalnut", "foodRaisins", "foodDough", "foodGroundcinnamon" }));
/* 464 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.candiedwalnutsItem, new Object[] { "toolSaucepan", "cropWalnut", "foodVanilla", "foodGroundcinnamon", "listAllsugar" }));
/* 465 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.brownieItem, new Object[] { "toolBakeware", "cropWalnut", "foodFlour", "listAllegg", "foodButter", "listAllsugar", "foodCocoapowder", "foodVanilla" }));
     
/* 467 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.papayajuiceItem, new Object[] { "toolJuicer", "cropPapaya" }));
/* 468 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.papayasmoothieItem, new Object[] { "toolJuicer", "cropPapaya", Items.snowball }));
/* 469 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.papayayogurtItem, new Object[] { "cropPapaya", "foodPlainyogurt" }));
     
/* 471 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.starfruitjuiceItem, new Object[] { "toolJuicer", "cropStarfruit" }));
/* 472 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.starfruitsmoothieItem, new Object[] { "toolJuicer", "cropStarfruit", Items.snowball }));
/* 473 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.starfruityogurtItem, new Object[] { "cropStarfruit", "foodPlainyogurt" }));
     
/* 475 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.guacamoleItem, new Object[] { "toolCuttingboard", "cropAvocado", "cropChilipepper", "cropTomato", "cropOnion", "cropSpiceleaf" }));
/* 476 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.creamofavocadosoupItem, new Object[] { "toolPot", "cropAvocado", "listAllheavycream", "cropLime", "cropSpiceleaf", "foodStock" }));
/* 477 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.avocadoburritoItem, new Object[] { "toolCuttingboard", "cropAvocado", "foodTortilla", "foodCheese", "listAllchickencooked" }));
/* 478 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.avocadoburritoItem, new Object[] { "toolCuttingboard", "cropAvocado", "foodTortilla", "foodCheese", "listAllporkcooked" }));
     
/* 480 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.poachedpearItem, new Object[] { "toolSaucepan", "cropPear", "foodVanilla", "listAllsugar" }));
/* 481 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fruitcrumbleItem, new Object[] { "toolBakeware", "listAllfruit", "foodGroundcinnamon", "foodFlour", "foodButter" }));
/* 482 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pearyogurtItem, new Object[] { "cropPear", "foodPlainyogurt" }));
/* 483 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.plumyogurtItem, new Object[] { "cropPlum", "foodPlainyogurt" }));
     
/* 485 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bananasplitItem, new Object[] { "toolMixingbowl", "cropBanana", "foodCocoapowder", "cropCherry", "listAllicecream", "cropStrawberry" }));
/* 486 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "foodSalt" }));
/* 487 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "dustSalt" }));
/* 488 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.banananutbreadItem, new Object[] { "toolBakeware", "cropBanana", "foodFlour", "cropWalnut", "listAllmilk", "itemSalt" }));
     
/* 490 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bananasmoothieItem, new Object[] { "toolJuicer", "cropBanana", Items.snowball }));
/* 491 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bananayogurtItem, new Object[] { "cropBanana", "foodPlainyogurt" }));
     
/* 493 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coconutmilkItem, new Object[] { "toolJuicer", "cropCoconut" }));
/* 494 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickencurryItem, new Object[] { "toolPot", "cropCoconut", "foodPlainyogurt", "listAllchickenraw", "listAllspice", "cropChilipepper", "cropRice", "foodGroundcinnamon", "cropGarlic" }));
/* 495 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coconutshrimpItem, new Object[] { "toolSkillet", "cropCoconut", "listAllegg", "foodFlour", "foodShrimpraw", "foodOliveoil" }));
/* 496 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coconutshrimpItem, new Object[] { "toolSkillet", "cropCoconut", "listAllegg", "foodFlour", "foodRawshrimp", "foodOliveoil" }));
/* 497 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coconutyogurtItem, new Object[] { "cropCoconut", "foodPlainyogurt" }));
     
/* 499 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.orangejuiceItem, new Object[] { "toolJuicer", "cropOrange" }));
/* 500 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.orangechickenItem, new Object[] { "toolSaucepan", "cropOrange", "listAllchickenraw", "listAllsugar", "cropRice", "cropBroccoli" }));
/* 501 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.orangesmoothieItem, new Object[] { "toolJuicer", "cropOrange", Items.snowball }));
/* 502 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.orangeyogurtItem, new Object[] { "cropOrange", "foodPlainyogurt" }));
     
/* 504 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peachjuiceItem, new Object[] { "toolJuicer", "cropPeach" }));
/* 505 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peachcobblerItem, new Object[] { "toolBakeware", "cropPeach", "listAllsugar", "foodDough" }));
/* 506 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peachsmoothieItem, new Object[] { "toolJuicer", "cropPeach", Items.snowball }));
/* 507 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peachyogurtItem, new Object[] { "cropPeach", "foodPlainyogurt" }));
     
/* 509 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.limejuiceItem, new Object[] { "toolJuicer", "cropLime" }));
/* 510 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.keylimepieItem, new Object[] { "toolBakeware", "cropLime", "listAllheavycream", "listAllsugar", "foodDough" }));
/* 511 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.limesmoothieItem, new Object[] { "toolJuicer", "cropLime", Items.snowball }));
/* 512 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.limeyogurtItem, new Object[] { "cropLime", "foodPlainyogurt" }));
     
/* 514 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mangojuiceItem, new Object[] { "toolJuicer", "cropMango" }));
/* 515 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mangosmoothieItem, new Object[] { "toolJuicer", "cropMango", Items.snowball }));
/* 516 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mangoyogurtItem, new Object[] { "cropMango", "foodPlainyogurt" }));
     
/* 518 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pomegranatejuiceItem, new Object[] { "toolJuicer", "cropPomegranate" }));
/* 519 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pomegranatesmoothieItem, new Object[] { "toolJuicer", "cropPomegranate", Items.snowball }));
/* 520 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pomegranateyogurtItem, new Object[] { "cropPomegranate", "foodPlainyogurt" }));
     
/* 522 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vanillayogurtItem, new Object[] { "foodVanilla", "foodPlainyogurt" }));
     
/* 524 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cinnamonrollItem, new Object[] { "toolBakeware", "foodGroundcinnamon", "listAllsugar", "foodDough" }));
/* 525 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.frenchtoastItem, new Object[] { "toolSkillet", "foodGroundcinnamon", "foodToast", "listAllsugar", "listAllegg" }));
     
/* 527 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.marshmellowsItem, new Object[] { "toolPot", "listAllsugar", "listAllwater", "listAllegg" }));
/* 528 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.donutItem, new Object[] { "toolPot", "foodDough", "foodOliveoil" }));
/* 529 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatedonutItem, new Object[] { "foodDonut", "foodChocolatebar" }));
/* 530 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.powdereddonutItem, new Object[] { "foodDonut", "listAllsugar" }));
/* 531 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.jellydonutItem, new Object[] { "foodDonut", "foodGrapejelly" }));
/* 532 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.frosteddonutItem, new Object[] { "foodDonut", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 11) }));
     
/* 534 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cactussoupItem, new Object[] { "toolPot", Blocks.cactus, "foodStock" }));
/* 535 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.wafflesItem, new Object[] { "toolSkillet", "foodFlour", "listAllegg", "listAllmilk", "foodButter" }));
/* 536 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.seedsoupItem, new Object[] { "toolPot", "listAllseed", "foodStock" }));
/* 537 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "foodSalt" }));
/* 538 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "dustSalt" }));
/* 539 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.softpretzelItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "itemSalt" }));
     
/* 541 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.jellybeansItem, new Object[] { "toolSaucepan", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11) }));
/* 542 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.biscuitItem, new Object[] { "toolBakeware", "foodDough", "foodButter" }));
     
/* 544 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.creamcookieItem, new Object[] { "toolBakeware", "foodDough", "listAllheavycream", "listAllsugar", "foodCocoapowder" }));
/* 545 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.jaffaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "foodFlour", "foodChocolatebar", "cropOrange" }));
/* 546 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friedchickenItem, new Object[] { "toolPot", "listAllchickenraw", "foodFlour", "cropSpiceleaf", "foodBlackpepper", "foodOliveoil" }));
/* 547 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatesprinklecakeItem, new Object[] { "toolBakeware", "foodCocoapowder", "listAllsugar", "foodDough", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 11) }));
/* 548 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.redvelvetcakeItem, new Object[] { "toolBakeware", "listAllmilk", "foodFlour", "listAllheavycream", "listAllsugar", "listAllegg", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1) }));
/* 549 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllbeefcooked", "cropLettuce", "cropTomato", "foodMayo" }));
/* 550 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllchickencooked", "cropLettuce", "cropTomato", "foodMayo" }));
/* 551 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.footlongItem, new Object[] { "toolCuttingboard", Items.bread, "listAllporkcooked", "cropLettuce", "cropTomato", "foodMayo" }));
     
/* 553 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberryyogurtItem, new Object[] { "cropBlueberry", "foodPlainyogurt" }));
/* 554 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lemonyogurtItem, new Object[] { "cropLemon", "foodPlainyogurt" }));
/* 555 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cherryyogurtItem, new Object[] { "cropCherry", "foodPlainyogurt" }));
/* 556 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberryyogurtItem, new Object[] { "cropStrawberry", "foodPlainyogurt" }));
/* 557 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapeyogurtItem, new Object[] { "cropGrape", "foodPlainyogurt" }));
/* 558 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolateyogurtItem, new Object[] { "foodCocoapowder", "foodPlainyogurt" }));
     
/* 560 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blackberryjuiceItem, new Object[] { "toolJuicer", "cropBlackberry" }));
/* 561 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blackberrycobblerItem, new Object[] { "cropBlackberry", "toolBakeware", "listAllsugar", "foodDough" }));
/* 562 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blackberrysmoothieItem, new Object[] { "toolJuicer", "cropBlackberry", Items.snowball }));
/* 563 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blackberryyogurtItem, new Object[] { "cropBlackberry", "foodPlainyogurt" }));
/* 564 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatemilkItem, new Object[] { "listAllmilk", "foodCocoapowder" }));
/* 565 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pumpkinyogurtItem, new Object[] { Blocks.pumpkin, "foodPlainyogurt" }));
     
/* 567 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberryjuiceItem, new Object[] { "toolJuicer", "cropRaspberry" }));
/* 568 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberrypieItem, new Object[] { "cropRaspberry", "toolBakeware", "listAllsugar", "foodDough" }));
/* 569 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberrysmoothieItem, new Object[] { "toolJuicer", "cropRaspberry", Items.snowball }));
/* 570 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberryyogurtItem, new Object[] { "cropRaspberry", "foodPlainyogurt" }));
/* 571 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cinnamonsugardonutItem, new Object[] { "foodDonut", "listAllsugar", "foodGroundcinnamon" }));
/* 572 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.melonyogurtItem, new Object[] { Items.melon, "foodPlainyogurt" }));
     
/* 574 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.kiwijuiceItem, new Object[] { "toolJuicer", "cropKiwi" }));
/* 575 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.kiwismoothieItem, new Object[] { "toolJuicer", "cropKiwi", Items.snowball }));
/* 576 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.kiwiyogurtItem, new Object[] { "cropKiwi", "foodPlainyogurt" }));
/* 577 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 4, 0), new Object[] { "listAllmilk", Items.leather }));
/* 578 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.appleyogurtItem, new Object[] { "cropApple", "foodPlainyogurt" }));
     
/* 580 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "foodSalt" }));
/* 581 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "dustSalt" }));
/* 582 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, new Object[] { "cropSunflower", "itemSalt" }));
     
/* 584 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "foodSalt", "foodOliveoil" }));
/* 585 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "dustSalt", "foodOliveoil" }));
/* 586 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, new Object[] { "toolBakeware", "cropSunflower", "foodFlour", "listAllegg", "itemSalt", "foodOliveoil" }));
     
/* 588 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sunflowerbroccolisaladItem, new Object[] { "toolCuttingboard", "cropSunflower", "cropBroccoli", "foodMayo", "listAllsugar", "listAllporkcooked" }));
     
/* 590 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cranberryjuiceItem, new Object[] { "toolJuicer", "cropCranberry", "listAllsugar" }));
/* 591 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cranberrysauceItem, new Object[] { "toolPot", "cropCranberry", "listAllsugar" }));
/* 592 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cranberrybarItem, new Object[] { "toolBakeware", "cropCranberry", "listAllsugar", "foodDough" }));
     
/* 594 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peppermintItem, new Object[] { "toolSaucepan", "cropSpiceleaf", "listAllsugar" }));
     
/* 596 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cactusfruitjuiceItem, new Object[] { "toolJuicer", "cropCactusfruit" }));
     
/* 598 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blackpepperItem, new Object[] { "toolMortarandpestle", "cropPeppercorn" }));
/* 599 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.groundcinnamonItem, new Object[] { "toolMortarandpestle", "cropCinnamon" }));
/* 600 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.groundnutmegItem, new Object[] { "toolMortarandpestle", "cropNutmeg" }));
/* 601 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropOlive" }));
/* 602 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropSunflower" }));
/* 603 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.oliveoilItem, new Object[] { "toolJuicer", "cropWalnut" }));
     
/* 605 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.baklavaItem, new Object[] { "toolBakeware", "foodDough", "cropWalnut", "cropCinnamon", "foodButter", "listAllsugar" }));
/* 606 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gummybearsItem, new Object[] { "toolSaucepan", "listAllsugar", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2) }));
/* 607 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.baconmushroomburgerItem, new Object[] { "foodBaconcheeseburger", "listAllmushroom" }));
/* 608 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.baconmushroomburgerItem, new Object[] { "foodBaconcheeseburger", "cropWhitemushroom" }));
/* 609 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fruitpunchItem, new Object[] { "toolJuicer", "listAllfruit", "listAllsugar" }));
/* 610 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.meatystewItem, new Object[] { "toolPot", "listAllmeatraw", "foodFlour", "foodStock" }));
/* 611 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mixedsaladItem, new Object[] { "toolCuttingboard", "listAllveggie", "listAllveggie", "foodSaladdressing" }));
/* 612 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pinacoladaItem, new Object[] { "toolJuicer", "cropCoconut", "cropPineapple" }));
/* 613 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "foodSalt", "foodVinegar" }));
/* 614 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "dustSalt", "foodVinegar" }));
/* 615 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodOliveoil", "itemSalt", "foodVinegar" }));
     
/* 617 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.saladdressingItem, new Object[] { "toolJuicer", "foodMayo", "cropSpiceleaf", "cropSpiceleaf" }));
/* 618 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.shepardspieItem, new Object[] { "toolBakeware", "listAllmuttonraw", Items.potato, Items.carrot, "foodDough", "cropPeas" }));
/* 619 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.eggnogItem, new Object[] { "toolJuicer", "listAllegg", "foodGroundnutmeg", "cropCinnamon", "listAllheavycream" }));
/* 620 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.custardItem, new Object[] { "toolSaucepan", "listAllegg", "foodGroundnutmeg", "cropCinnamon", "listAllheavycream" }));
/* 621 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, new Object[] { "toolCuttingboard", "listAllfishraw", "cropSeaweed", "cropRice" }));
/* 622 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gardensoupItem, new Object[] { "toolPot", "foodStock", "listAllveggie", "listAllveggie" }));
     
/* 624 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.applejellyItem, new Object[] { "toolSaucepan", "cropApple", "listAllsugar" }));
/* 625 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blackberryjellyItem, new Object[] { "toolSaucepan", "cropBlackberry", "listAllsugar" }));
/* 626 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberryjellyItem, new Object[] { "toolSaucepan", "cropBlueberry", "listAllsugar" }));
/* 627 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cherryjellyItem, new Object[] { "toolSaucepan", "cropCherry", "listAllsugar" }));
/* 628 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cranberryjellyItem, new Object[] { "toolSaucepan", "cropCranberry", "listAllsugar" }));
/* 629 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.kiwijellyItem, new Object[] { "toolSaucepan", "cropKiwi", "listAllsugar" }));
/* 630 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lemonjellyItem, new Object[] { "toolSaucepan", "cropLemon", "listAllsugar" }));
/* 631 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.limejellyItem, new Object[] { "toolSaucepan", "cropLime", "listAllsugar" }));
/* 632 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mangojellyItem, new Object[] { "toolSaucepan", "cropMango", "listAllsugar" }));
/* 633 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.orangejellyItem, new Object[] { "toolSaucepan", "cropOrange", "listAllsugar" }));
/* 634 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.papayajellyItem, new Object[] { "toolSaucepan", "cropPapaya", "listAllsugar" }));
/* 635 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peachjellyItem, new Object[] { "toolSaucepan", "cropPeach", "listAllsugar" }));
/* 636 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pomegranatejellyItem, new Object[] { "toolSaucepan", "cropPomegranate", "listAllsugar" }));
/* 637 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberryjellyItem, new Object[] { "toolSaucepan", "cropRaspberry", "listAllsugar" }));
/* 638 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.starfruitjellyItem, new Object[] { "toolSaucepan", "cropStarfruit", "listAllsugar" }));
/* 639 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberryjellyItem, new Object[] { "toolSaucepan", "cropStrawberry", "listAllsugar" }));
/* 640 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.watermelonjellyItem, new Object[] { "toolSaucepan", Items.melon, Items.melon, "listAllsugar" }));
     
/* 642 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.applejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodApplejelly", Items.bread }));
/* 643 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blackberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodBlackberryjelly", Items.bread }));
/* 644 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.blueberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodBlueberryjelly", Items.bread }));
/* 645 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cherryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodCherryjelly", Items.bread }));
/* 646 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cranberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodCranberryjelly", Items.bread }));
/* 647 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.kiwijellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodKiwijelly", Items.bread }));
/* 648 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lemonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodLemonjelly", Items.bread }));
/* 649 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.limejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodLimejelly", Items.bread }));
/* 650 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mangojellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodMangojelly", Items.bread }));
/* 651 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.orangejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodOrangejelly", Items.bread }));
/* 652 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.papayajellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPapayajelly", Items.bread }));
/* 653 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peachjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPeachjelly", Items.bread }));
/* 654 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pomegranatejellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPomegranatejelly", Items.bread }));
/* 655 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodRaspberryjelly", Items.bread }));
/* 656 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.starfruitjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodStarfruitjelly", Items.bread }));
/* 657 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodStrawberryjelly", Items.bread }));
/* 658 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.watermelonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodWatermelonjelly", Items.bread }));
     
/* 660 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cherrysodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodCherryjuice" }));
/* 661 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.colasodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropSpiceleaf" }));
/* 662 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gingersodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropGinger" }));
/* 663 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodGrapejuice" }));
/* 664 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lemonlimesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropLemon", "foodLimejuice" }));
/* 665 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.orangesodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodOrangejuice" }));
/* 666 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.rootbeersodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "cropEdibleroot" }));
/* 667 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberrysodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodStrawberryjuice" }));
     
/* 669 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.caramelicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodCaramel" }));
/* 670 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mintchocolatechipicemcreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropSpiceleaf", "foodChocolatebar" }));
/* 671 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberryicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropStrawberry" }));
/* 672 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vanillaicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "foodVanilla" }));
     
/* 674 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.ediblerootItem, new Object[] { "toolCuttingboard", "cropSpiceleaf" }));
     
/* 676 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gingerchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropGinger", "cropScallion", "foodHoneydrop" }));
/* 677 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gingerchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropGinger", "cropScallion", "dropHoney" }));
     
/* 679 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.oldworldveggiesoupItem, new Object[] { "toolPot", "foodStock", "cropOnion", "cropPeas", "cropBarley" }));
/* 680 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spicebunItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "foodGroundnutmeg", "foodGroundcinnamon", "foodRaisins" }));
/* 681 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gingeredrhubarbtartItem, new Object[] { "toolBakeware", "foodDough", "cropRhubarb", "cropGinger", "listAllsugar", "listAllegg" }));
/* 682 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lambbarleysoupItem, new Object[] { "toolPot", "foodStock", "listAllmuttonraw", "cropOnion", Items.carrot, "cropBarley" }));
/* 683 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.honeylemonlambItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropLemon", "foodMustard", "foodHoneydrop" }));
/* 684 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.honeylemonlambItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropLemon", "foodMustard", "dropHoney" }));
/* 685 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pumpkinoatsconesItem, new Object[] { "toolBakeware", "foodFlour", "cropOats", Blocks.pumpkin, "foodButter" }));
/* 686 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "foodSalt" }));
/* 687 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "dustSalt" }));
/* 688 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beefjerkyItem, new Object[] { "listAllbeefraw", "itemSalt" }));
     
/* 690 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.plumjuiceItem, new Object[] { "toolJuicer", "cropPlum" }));
/* 691 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pearjuiceItem, new Object[] { "toolJuicer", "cropPear" }));
     
/* 693 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.ovenroastedcauliflowerItem, new Object[] { "toolBakeware", "cropCauliflower", "foodOliveoil", "cropGarlic", "cropLemon" }));
/* 694 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.leekbaconsoupItem, new Object[] { "toolPot", "cropLeek", "listAllporkcooked", Items.potato, "listAllheavycream" }));
/* 695 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.herbbutterparsnipsItem, new Object[] { "toolSaucepan", "cropParsnip", "foodButter", "cropSpiceleaf" }));
/* 696 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.scallionbakedpotatoItem, new Object[] { Items.baked_potato, "cropScallion", "listAllheavycream" }));
     
/* 698 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bamboosteamedriceItem, new Object[] { "toolPot", "cropRice", "cropBambooshoot" }));
/* 699 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sweetpotatosouffleItem, new Object[] { "toolBakeware", "cropSweetpotato", "cropPecan", "foodDough", "foodButter" }));
/* 700 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cashewchickenItem, new Object[] { "toolSaucepan", "listAllchickenraw", "cropCashew", "cropRice", "listAllpepper" }));
/* 701 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.apricotjuiceItem, new Object[] { "toolJuicer", "cropApricot" }));
/* 702 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.apricotyogurtItem, new Object[] { "cropApricot", "foodPlainyogurt" }));
/* 703 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.apricotglazedporkItem, new Object[] { "listAllporkcooked", "foodApricotjelly" }));
/* 704 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.apricotjellyItem, new Object[] { "toolSaucepan", "cropApricot", "listAllsugar" }));
/* 705 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.apricotjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodApricotjelly", Items.bread }));
/* 706 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.apricotsmoothieItem, new Object[] { "toolJuicer", "cropApricot", Items.snowball }));
/* 707 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.figbarItem, new Object[] { "toolBakeware", "cropFig", "listAllsugar", "foodDough" }));
/* 708 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.figjellyItem, new Object[] { "toolSaucepan", "cropFig", "listAllsugar" }));
/* 709 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.figjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodFigjelly", Items.bread }));
/* 710 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.figsmoothieItem, new Object[] { "toolJuicer", "cropFig", Items.snowball }));
/* 711 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.figyogurtItem, new Object[] { "cropFig", "foodPlainyogurt" }));
/* 712 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.figjuiceItem, new Object[] { "toolJuicer", "cropFig" }));
/* 713 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapefruitjuiceItem, new Object[] { "toolJuicer", "cropGrapefruit" }));
/* 714 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapefruitjellyItem, new Object[] { "toolSaucepan", "cropGrapefruit", "listAllsugar" }));
/* 715 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapefruitjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGrapefruitjelly", Items.bread }));
/* 716 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapefruitsmoothieItem, new Object[] { "toolJuicer", "cropGrapefruit", Items.snowball }));
/* 717 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapefruityogurtItem, new Object[] { "cropGrapefruit", "foodPlainyogurt" }));
/* 718 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapefruitsodaItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", "foodGrapefruitjuice" }));
/* 719 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.citrussaladItem, new Object[] { "toolCuttingboard", "listAllcitrus", "cropLettuce" }));
/* 720 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pecanpieItem, new Object[] { "toolBakeware", "cropPecan", "foodDough", "listAllsugar", "foodButter" }));
/* 721 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pralinesItem, new Object[] { "toolSaucepan", "cropPecan", "listAllsugar" }));
/* 722 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.persimmonjuiceItem, new Object[] { "toolJuicer", "cropPersimmon" }));
/* 723 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.persimmonyogurtItem, new Object[] { "cropPersimmon", "foodPlainyogurt" }));
/* 724 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.persimmonsmoothieItem, new Object[] { "toolJuicer", "cropPersimmon", Items.snowball }));
/* 725 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.persimmonjellyItem, new Object[] { "toolSaucepan", "cropPersimmon", "listAllsugar" }));
/* 726 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.persimmonjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPersimmonjelly", Items.bread }));
/* 727 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pistachiobakedsalmonItem, new Object[] { "toolBakeware", "cropPistachio", "foodSalmonraw" }));
/* 728 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.baconwrappeddatesItem, new Object[] { "toolBakeware", "cropDate", "listAllporkcooked" }));
/* 729 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.datenutbreadItem, new Object[] { "toolBakeware", "cropDate", "foodDough", "listAllnut" }));
/* 730 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.maplesyruppancakesItem, new Object[] { "foodPancakes", "cropMaplesyrup" }));
/* 731 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.maplesyrupwafflesItem, new Object[] { "foodWaffles", "cropMaplesyrup" }));
/* 732 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.maplesausageItem, new Object[] { "listAllbeefraw", "cropSpiceleaf", "cropMaplesyrup" }));
/* 733 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mapleoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "cropMaplesyrup" }));
/* 734 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peachesandcreamoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "cropPeach", "listAllheavycream" }));
/* 735 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cinnamonappleoatmealItem, new Object[] { "toolMixingbowl", "cropOats", "foodGroundcinnamon", "cropApple" }));
/* 736 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.maplecandiedbaconItem, new Object[] { "toolBakeware", "listAllporkcooked", "cropMaplesyrup" }));
/* 737 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.toastsandwichItem, new Object[] { "foodToast", "foodToast" }));
/* 738 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potatoandcheesepirogiItem, new Object[] { "toolSkillet", "foodDough", "cropPotato", "foodCheese" }));
/* 739 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.zeppoleItem, new Object[] { "toolPot", "foodOliveoil", "foodDough", "foodGroundcinnamon" }));
/* 740 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sausageinbreadItem, new Object[] { "foodMaplesausage", Items.bread, "foodKetchup", "cropOnion" }));
/* 741 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatecaramelfudgeItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodCaramel" }));
/* 742 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lavendershortbreadItem, new Object[] { "toolBakeware", "dyePurple", "foodDough" }));
/* 743 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beefwellingtonItem, new Object[] { "listAllbeefraw", "foodDough", "listAllmushroom", "cropSpinach" }));
/* 744 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.epicbaconItem, new Object[] { "listAllporkcooked", "dyeRed", "dyeOrange", "dyeYellow", "dyeGreen", "dyeBlue", "dyePurple", "dyeMagenta" }));
/* 745 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.manjuuItem, new Object[] { "toolMixingbowl", "listAllsugar", "cropRice", "cropBean" }));
     
/* 747 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chickengumboItem, new Object[] { "toolPot", "cropOkra", "listAllchickenraw", "cropCelery", "cropOnion", "foodStock", "listAllspice", "cropBellpepper" }));
/* 748 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.generaltsochickenItem, new Object[] { "toolSkillet", "listAllchickenraw", "cropBroccoli", "listAllsugar", "foodFlour", "cropChilipepper", "cropRice" }));
/* 749 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.californiarollItem, new Object[] { "toolCuttingboard", "listAllfishraw", "cropAvocado", "cropCucumber", "cropSeaweed", "cropRice" }));
/* 750 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.futomakiItem, new Object[] { "toolCuttingboard", "foodBoiledegg", "cropCucumber", "cropWintersquash", "cropRadish", "cropSeaweed", "cropGinger", "cropRice" }));
/* 751 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beansontoastItem, new Object[] { "toolCuttingboard", "foodToast", "foodButter", "foodBakedbeans" }));
/* 752 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vegemiteItem, new Object[] { "toolPot", "listAllsugar", "cropBarley", "listAllwater", "cropSpiceleaf" }));
/* 753 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.honeycombchocolatebarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "materialHoneycomb" }));
/* 754 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cherrycoconutchocolatebarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "cropCherry", "foodToastedcoconut" }));
/* 755 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fairybreadItem, new Object[] { "toolBakeware", Items.bread, "foodButter", "dyeRed", "dyeGreen", "dyeYellow" }));
/* 756 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lamingtonItem, new Object[] { "toolBakeware", "foodDough", "foodChocolatebar", "foodToastedcoconut" }));
/* 757 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.timtamItem, new Object[] { "toolBakeware", "listAllsugar", "foodFlour", "listAllmilk", "foodChocolatebar" }));
/* 758 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.meatpieItem, new Object[] { "toolBakeware", "listAllbeefraw", "foodDough", "cropOnion", "cropGarlic", "foodBlackpepper", "foodStock" }));
/* 759 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chikorollItem, new Object[] { "toolPot", "foodOliveoil", "foodDough", "listAllchickencooked", "cropCarrot", "cropCabbage", "cropLeek", "cropOnion" }));
/* 760 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "foodSalt", "foodButter" }));
/* 761 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "oreSalt", "foodButter" }));
/* 762 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "dustSalt", "foodButter" }));
/* 763 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.damperItem, new Object[] { "toolBakeware", "foodFlour", "listAllmilk", "itemSalt", "foodButter" }));
/* 764 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.beetburgerItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropBeet", "foodFriedegg", "listAllporkcooked", "cropPineapple", "foodToast" }));
/* 765 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pavlovaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropLemon", "listAllheavycream", "cropStrawberry" }));
/* 766 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pavlovaItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropLemon", "listAllheavycream", "cropStrawberry" }));
/* 767 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "foodSalt", "cropSpiceleaf", "cropCucumber" }));
/* 768 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "oreSalt", "cropSpiceleaf", "cropCucumber" }));
/* 769 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "dustSalt", "cropSpiceleaf", "cropCucumber" }));
/* 770 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gherkinItem, new Object[] { "toolPot", "foodVinegar", "itemSalt", "cropSpiceleaf", "cropCucumber" }));
/* 771 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mcpamItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodPickles", "cropOnion", "foodToast", "foodSaladdressing" }));
/* 772 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mcpamItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropLettuce", "foodGherkin", "cropOnion", "foodToast", "foodSaladdressing" }));
     
/* 774 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.ceasarsaladItem, new Object[] { "toolMixingbowl", "cropLettuce", "foodToast", "foodCheese", "cropGarlic", "foodBlackpepper" }));
/* 775 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chaoscookieItem, new Object[] { "toolBakeware", "foodFlour", "foodChocolatebar", new ItemStack(Items.dye, 1, 5) }));
/* 776 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatebaconItem, new Object[] { "toolSaucepan", "listAllporkcooked", "foodChocolatebar" }));
/* 777 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lambkebabItem, new Object[] { "toolCuttingboard", "listAllmuttoncooked", "cropOnion", "cropBellpepper", "stickWood" }));
/* 778 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.nutellaItem, new Object[] { "toolSaucepan", "foodChocolatebar", "foodGroundnutmeg" }));
/* 779 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.snickersbarItem, new Object[] { "toolSaucepan", "foodChocolatebar", "cropPeanut", "foodOliveoil" }));
/* 780 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.spinachpieItem, new Object[] { "toolBakeware", "foodDough", "cropSpinach", "foodCheese", "foodToast" }));
/* 781 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.steamedspinachItem, new Object[] { "toolPot", "cropSpinach", "listAllwater" }));
/* 782 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vegemiteontoastItem, new Object[] { "toolCuttingboard", "foodVegemite", "foodToast" }));
     
/* 784 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.holidaycakeItem, new Object[] { "toolBakeware", "listAllegg", "listAllsugar", "cropCherry", "listAllheavycream", "cropSpiceleaf" }));
     
 
/* 787 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.appleciderItem, new Object[] { "toolPot", "cropApple", "listAllsugar" }));
/* 788 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bangersandmashItem, new Object[] { "toolSkillet", "foodPorksausage", "foodMashedpotatoes" }));
/* 789 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.batteredsausageItem, new Object[] { "toolPot", "foodPorksausage", "foodBatter" }));
/* 790 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.batterItem, new Object[] { "toolMixingbowl", "foodFlour", "listAllegg" }));
/* 791 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "foodSalt" }));
/* 792 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "dustSalt" }));
/* 793 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chorizoItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropGarlic", "itemSalt" }));
     
/* 795 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coleslawItem, new Object[] { "toolMixingbowl", "cropCabbage", "cropCarrot", "foodMayo", "foodBlackpepper" }));
/* 796 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.energydrinkItem, new Object[] { "toolPot", "foodBubblywater", "listAllsugar", Items.redstone }));
/* 797 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friedonionsItem, new Object[] { "toolPot", "cropOnion", "foodOliveoil" }));
/* 798 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.meatfeastpizzaItem, new Object[] { "toolPot", "foodPizza", "foodPepperoni", "foodPorksausage", "listAllbeefcooked", Items.cooked_chicken }));
/* 799 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mincepieItem, new Object[] { "toolBakeware", "listAllbeefcooked", "listAllfruit", "listAllnut", "foodDough", "foodButter" }));
/* 800 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.onionhamburgerItem, new Object[] { "toolCuttingboard", "foodHamburger", "foodFriedonions" }));
/* 801 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "foodSalt" }));
/* 802 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "dustSalt" }));
/* 803 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pepperoniItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "cropBellpepper", "itemSalt" }));
/* 804 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "foodSalt", "foodVinegar" }));
/* 805 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "dustSalt", "foodVinegar" }));
/* 806 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pickledonionsItem, new Object[] { "toolPot", "cropOnion", "itemSalt", "foodVinegar" }));
/* 807 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "foodSalt" }));
/* 808 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "dustSalt" }));
/* 809 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.porksausageItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "listAllspice", "itemSalt" }));
/* 810 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.raspberrytrifleItem, new Object[] { "toolBakeware", "cropRaspberry", "listAllheavycream", "foodVanilla", "foodDough" }));
     
/* 812 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.pumpkincheesecakeItem, 1), new Object[] { Blocks.pumpkin, "foodCheesecake" }));
/* 813 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pumpkinmuffinItem, new Object[] { "toolBakeware", Blocks.pumpkin, "foodFlour", "listAllegg" }));
/* 814 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.suaderoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "foodOliveoil" }));
/* 815 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.randomtacoItem, new Object[] { "toolCuttingboard", "listAllbeefcooked", "cropOnion", "foodCheese", "cropAvocado", "listAllspice", "foodLimejuice", "foodTortilla" }));
     
/* 817 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.strawberrymilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropStrawberry", Items.snowball }));
/* 818 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolatemilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "foodCocoapowder", Items.snowball }));
/* 819 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bananamilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropBanana", Items.snowball }));
/* 820 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cornflakesItem, new Object[] { "toolMixingbowl", "listAllmilk", "cropCorn" }));
/* 821 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coleslawburgerItem, new Object[] { "toolCuttingboard", "foodHamburger", "foodColeslaw" }));
/* 822 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastchickenItem, new Object[] { "toolBakeware", "listAllchickenraw", "foodSalt", "foodBlackpepper" }));
/* 823 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.roastpotatoesItem, new Object[] { "toolBakeware", "cropPotato", "foodSalt", "foodBlackpepper" }));
/* 824 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sundayroastItem, new Object[] { "toolBakeware", "foodRoastchicken", "foodRoastpotatoes", "listAllgreenveggie" }));
/* 825 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.bbqpulledporkItem, new Object[] { "toolCuttingboard", "listAllporkcooked", "foodToast", "cropTomato", "cropSpiceleaf" }));
/* 826 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.lambwithmintsauceItem, new Object[] { "toolBakeware", "listAllmuttonraw", "cropSpiceleaf", "foodVinegar", "listAllsugar" }));
/* 827 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.steakandchipsItem, new Object[] { "toolSkillet", "listAllbeefraw", "foodFries" }));
     
/* 829 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cherryicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropCherry" }));
/* 830 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pistachioicecreamItem, new Object[] { "toolMixingbowl", "listAllicecream", "cropPistachio" }));
/* 831 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.neapolitanicecreamItem, 3), new Object[] { "foodChocolateicecream", "foodStrawberryicecream", "foodVanillaicecream" }));
/* 832 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.spumoniicecreamItem, 3), new Object[] { "foodCherryicecream", "foodPistachioicecream", "foodVanillaicecream" }));
     
/* 834 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 2), new Object[] { "foodPlainyogurt", "listAllmilk" }));
     
/* 836 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.almondbutterItem, new Object[] { "toolJuicer", "cropAlmond" }));
/* 837 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cashewbutterItem, new Object[] { "toolJuicer", "cropCashew" }));
/* 838 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chestnutbutterItem, new Object[] { "toolJuicer", "cropChestnut" }));
/* 839 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cornishpastyItem, new Object[] { "toolBakeware", "listAllbeefraw", "cropPotato", "foodDough", "cropRutabaga", "foodBlackpepper" }));
/* 840 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cottagepieItem, new Object[] { "toolBakeware", "listAllbeefraw", "cropPotato", "cropCarrot", "foodDough", "cropPeas" }));
/* 841 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.croissantItem, new Object[] { "toolBakeware", "foodDough", "foodButter", "listAllegg" }));
/* 842 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.currypowderItem, new Object[] { "toolMortarandpestle", "cropCurryleaf" }));
/* 843 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.dimsumItem, new Object[] { "toolPot", "cropRice", "foodDough", "cropWaterchestnut", "listAllmushroom", "listAllmeatraw" }));
/* 844 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.friedpecanokraItem, new Object[] { "toolSkillet", "cropOkra", "cropPecan", "foodOliveoil", "foodBlackpepper" }));
/* 845 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gooseberryjellyItem, new Object[] { "toolSaucepan", "cropGooseberry", "listAllsugar" }));
/* 846 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gooseberryjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodGooseberryjelly", Items.bread }));
/* 847 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gooseberrymilkshakeItem, new Object[] { "toolJuicer", "listAllmilk", "cropGooseberry", Items.snowball }));
/* 848 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gooseberrypieItem, new Object[] { "toolBakeware", "cropGooseberry", "listAllsugar", "foodDough" }));
/* 849 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gooseberrysmoothieItem, new Object[] { "toolJuicer", "cropGooseberry", Items.snowball }));
/* 850 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pineappleyogurtItem, new Object[] { "cropGooseberry", "foodPlainyogurt" }));
/* 851 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hamsweetpicklesandwichItem, new Object[] { "toolCuttingboard", "foodSweetpickle", Items.bread, "listAllporkcooked", "foodMayo" }));
/* 852 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hushpuppiesItem, new Object[] { "toolPot", "foodCornmeal", "listAllegg", "cropOnion", "foodOliveoil" }));
/* 853 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.kimchiItem, new Object[] { "toolPot", "foodSalt", "cropCabbage", "cropGarlic", "cropGinger", "cropRadish", "cropScallion", "listAllspice", "cropSesame" }));
/* 854 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mochiItem, new Object[] { "toolMortarandpPestle", "cropRice", "listAllsugar", "listAllwater" }));
/* 855 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.museliItem, new Object[] { "toolMixingbowl", "listAllgrain", "foodRaisins", "cropPecan", "listAllsugar", "listAllmilk" }));
/* 856 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.naanItem, new Object[] { "toolSkillet", "foodDough", "cropOnion", "foodOliveoil" }));
/* 857 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.okrachipsItem, new Object[] { "toolBakeware", "cropOkra", "foodSalt", "cropSpiceleaf" }));
/* 858 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.okracreoleItem, new Object[] { "toolSkillet", "cropOkra", "cropGarlic", "cropTomato", "cropBellpepper", "cropOnion", "listAllspice" }));
/* 859 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pistachiobutterItem, new Object[] { "toolJuicer", "cropPistachio" }));
/* 860 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.ploughmanslunchItem, new Object[] { "toolCuttingboard", Items.bread, "cropApple", "foodCheese", "foodSweetpickle", "cropOnion", "listAllporkcooked", "foodBoiledegg" }));
/* 861 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.porklomeinItem, new Object[] { "toolPot", "listAllporkraw", "foodPasta", "cropOnion", "cropCarrot", "cropCabbage", "cropGarlic", "foodSoysauce" }));
/* 862 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.salmonpattiesItem, new Object[] { "toolSkillet", "foodSalmonraw", "foodToast", "listAllegg", "foodOliveoil" }));
/* 863 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sausageItem, new Object[] { "toolCuttingboard", "listAllmeatraw", "foodSalt", "listAllspice" }));
/* 864 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sausagerollItem, new Object[] { "toolCuttingboard", "foodSausage", "foodDough", "listAllegg" }));
/* 865 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sesameballItem, new Object[] { "toolPot", "cropSesame", "foodOliveoil", "cropBean", "listAllsugar", "foodFlour" }));
/* 866 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sesamesnapsItem, new Object[] { "toolSkillet", "cropSesame", "listAllsugar" }));
/* 867 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.shrimpokrahushpuppiesItem, new Object[] { "toolPot", "foodCornmeal", "listAllegg", "cropOnion", "foodOliveoil", "foodShrimpraw", "cropOkra" }));
/* 868 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.soysauceItem, new Object[] { "toolJuicer", "cropSoybean", "listAllwater", "foodSalt" }));
/* 869 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sweetpickleItem, new Object[] { "toolPot", "foodVinegar", "foodSalt", "cropSpiceleaf", "cropCucumber", "listAllsugar" }));
/* 870 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.veggiestripsItem, new Object[] { "toolBakeware", "listAllveggie", "listAllveggie", "listAllveggie", "foodSalt", "listAllspice" }));
/* 871 */     CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.vindalooItem, new Object[] { "toolSaucepan", "listAllmeatraw", "foodCurrypowder", "foodButter", "foodBlackpepper", "cropOnion" }));

CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.applesmoothieItem, new Object[] { "toolJuicer", "cropApple", Items.snowball }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cheeseontoastItem, new Object[] { "toolBakeware", "foodToast", "foodCheese" }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.chocolaterollItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodFlour", "listAllheavycream"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coconutcreamItem, new Object[] { "toolPot", "cropCoconut"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.coconutsmoothieItem, new Object[] { "toolJuicer", "cropCoconut", Items.snowball }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.crackerItem, new Object[] { "toolBakeware", "foodFlour", "foodOliveoil", "foodSalt", "listAllwater" }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cranberrysmoothieItem, new Object[] { "toolJuicer", "cropCranberry", Items.snowball }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cranberryyogurtItem, new Object[] { "cropCranberry", "foodPlainyogurt" }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.deluxechickencurryItem, new Object[] { "toolCuttingboard", "foodChickencurry", "cropRice", "foodNaan", "foodMangochutney"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.garammasalaItem, 4), new Object[] { "toolMortarandpestle", "foodBlackpepper", "foodGroundcinnamon", "cropSpiceleaf", "foodGroundnutmeg"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.grapesmoothieItem, new Object[] { "toolJuicer", "cropGrape", Items.snowball }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.gravyItem, new Object[] { "foodStock", "foodFlour"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.honeysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", ItemRegistry.honeyItem, Items.bread }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.jamrollItem, new Object[] { "toolBakeware", "foodChocolatebar", "foodFlour", "foodRaspberryjam"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.mangochutneyItem, new Object[] { "toolPot", "cropMango", "cropSpiceleaf", "cropMustard", "foodOliveoil"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.marzipanItem, new Object[] { "toolMortarandpestle", ItemRegistry.honeyItem, "cropAlmond"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.paneerItem, new Object[] { "toolPot", "listAllmilk", "foodVinegar", "foodLemonjuice"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.paneertikkamasalaItem, new Object[] { "toolSaucepan", "foodPaneer", "foodGarammasala", "foodCurrypowder", "foodCoconutcream", "cropOnion", "cropBellpepper", "cropTomato", "cropGinger", "cropGarlic"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.peaandhamsoupItem, new Object[] { "toolPot", "cropPeas", "listAllporkraw", "cropOnion", "cropCarrot", "cropCelery", "foodBlackpepper"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pearjellyItem, new Object[] { "toolSaucepan", "cropPear", "listAllsugar" }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pearjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPearjelly", Items.bread }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.pearsmoothieItem, new Object[] { "toolJuicer", "cropPear", Items.snowball }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.plumjellyItem, new Object[] { "toolSaucepan", "cropPlum", "listAllsugar" }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.plumjellysandwichItem, new Object[] { "toolCuttingboard", "listAllnutbutter", "foodPlumjelly", Items.bread }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.plumsmoothieItem, new Object[] { "toolJuicer", "cropPlum", Items.snowball }));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.potatoandleeksoupItem, new Object[] { "toolPot", "cropPotato", "cropLeek", "foodStock", "listAllheavycream", "cropSpiceleaf", "foodBlackpepper"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.toadintheholeItem, new Object[] { "toolBakeware", "foodYorkshirepudding", "foodSausage"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.tunapotatoItem, new Object[] { "toolCuttingboard", "foodButteredpotato", "cropCorn", "listAllfishcooked"}));
CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.yorkshirepuddingItem, new Object[] { "toolBakeware", "foodFlour", "foodSalt", "foodStock", "listAllegg", "listAllmilk"}));

	}
}
