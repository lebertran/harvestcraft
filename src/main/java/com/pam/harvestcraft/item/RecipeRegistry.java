package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.blocks.Crop;
import com.pam.harvestcraft.blocks.Fruit;
import com.pam.harvestcraft.blocks.FruitLog;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.pam.harvestcraft.HarvestCraft.config;
import static com.pam.harvestcraft.item.GeneralOreRegistry.*;

public class RecipeRegistry {

    public static void registerRecipes() {
        registerFoodRecipes();
        registerOtherRecipes();
        registerBeeRecipes();
        registerPresserRecipe();
        registerMarketRecipe();
        registerSmelting();
    }

    private static void registerSmelting() {
        addSmelting(ItemRegistry.doughItem, Items.BREAD);
        addSmelting(Items.BREAD, ItemRegistry.toastItem);
        addSmelting(Items.PUMPKIN_SEEDS, ItemRegistry.roastedpumpkinseedsItem);
        addSmelting(Blocks.BROWN_MUSHROOM, ItemRegistry.grilledmushroomItem);
        addSmelting(Blocks.RED_MUSHROOM, ItemRegistry.grilledmushroomItem);
        addSmelting(ItemRegistry.calamarirawItem, ItemRegistry.calamaricookedItem);
        addSmelting(Crop.ASPARAGUS.food(), ItemRegistry.grilledasparagusItem);
        addSmelting(Crop.RICE.food(), ItemRegistry.ricecakeItem);
        addSmelting(Crop.TEALEAF.food(), ItemRegistry.teaItem);
        addSmelting(Crop.CORN.food(), ItemRegistry.popcornItem);
        addSmelting(Crop.SWEETPOTATO.food(), ItemRegistry.bakedsweetpotatoItem);
        addSmelting(Crop.COFFEE.food(), ItemRegistry.coffeeItem);
        addSmelting(Crop.EGGPLANT.food(), ItemRegistry.grilledeggplantItem);
        addSmelting(Crop.GRAPE.food(), ItemRegistry.raisinsItem);
        addSmelting(Crop.WHITEMUSHROOM.food(), ItemRegistry.grilledmushroomItem);
        addSmelting(Fruit.COCONUT.yield(), ItemRegistry.toastedcoconutItem);
        addSmelting(Fruit.VANILLABEAN.yield(), ItemRegistry.vanillaItem);
        addSmelting(Fruit.CHESTNUT.yield(), ItemRegistry.roastedchestnutItem);
        addSmelting(Crop.SESAME.food(), ItemRegistry.toastedsesameseedsItem);
        addSmelting(ItemRegistry.anchovyrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.bassrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.carprawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.catfishrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.charrrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.eelrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.grouperrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.herringrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.mudfishrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.perchrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.snapperrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.tilapiarawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.troutrawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.tunarawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.walleyerawItem, Items.COOKED_FISH);
        addSmelting(ItemRegistry.clamrawItem, ItemRegistry.clamcookedItem);
        addSmelting(ItemRegistry.crabrawItem, ItemRegistry.crabcookedItem);
        addSmelting(ItemRegistry.crayfishrawItem, ItemRegistry.crayfishcookedItem);
        addSmelting(ItemRegistry.frograwItem, ItemRegistry.frogcookedItem);
        addSmelting(ItemRegistry.octopusrawItem, ItemRegistry.octopuscookedItem);
        addSmelting(ItemRegistry.scalloprawItem, ItemRegistry.scallopcookedItem);
        addSmelting(ItemRegistry.shrimprawItem, ItemRegistry.shrimpcookedItem);
        addSmelting(ItemRegistry.snailrawItem, ItemRegistry.snailcookedItem);
        addSmelting(ItemRegistry.turtlerawItem, ItemRegistry.turtlecookedItem);
    }

    private static void registerPresserRecipe() {
        addShapedOreRecipe(BlockRegistry.presser, "#O#", "# #", "#O#", '#', ingotIron, 'O', Blocks.PISTON);
        addShapedOreRecipe(BlockRegistry.presser, "#O#", "# #", "#O#", '#', ingotCopper, 'O', Blocks.PISTON);
        addShapedOreRecipe(BlockRegistry.presser, "#O#", "# #", "#O#", '#', ingotSteel, 'O', Blocks.PISTON);
    }

    private static void registerBeeRecipes() {
        addShapelessOreRecipe(ItemRegistry.royaljellyItem, new ItemStack(ItemRegistry.queenbeeItem, 1, OreDictionary.WILDCARD_VALUE));

        addShapelessOreRecipe(ItemRegistry.queenbeeItem, ItemRegistry.grubItem, ItemRegistry.royaljellyItem);
        addShapedOreRecipe(BlockRegistry.apiary, "#O#", "#O#", "#O#",'#', plankWood, 'O', Items.ITEM_FRAME);
        addShapelessOreRecipe(ItemRegistry.fruitbaitItem, Items.STRING, listAllfruit, listAllfruit, listAllfruit);
        addShapelessOreRecipe(ItemRegistry.grainbaitItem, Items.STRING, listAllgrain, listAllgrain, listAllgrain);
        addShapelessOreRecipe(ItemRegistry.veggiebaitItem, Items.STRING, listAllveggie, listAllveggie, listAllveggie);
    }

    private static void registerFoodRecipes() {

        for (final Fruit fruit : Fruit.values()) {
            GameRegistry.addShapelessRecipe(new ItemStack(fruit.sapling()),
                    new ItemStack(fruit.yield()),
                    new ItemStack(fruit.yield()),
                    new ItemStack(fruit.yield()),
                    new ItemStack(Blocks.SAPLING, 1, OreDictionary.WILDCARD_VALUE));
        }

        for (final FruitLog fruit : FruitLog.values()) {
            GameRegistry.addShapelessRecipe(new ItemStack(fruit.sapling()),
                    new ItemStack(fruit.yield()),
                    new ItemStack(fruit.yield()),
                    new ItemStack(fruit.yield()),
                    new ItemStack(Blocks.SAPLING, 1, OreDictionary.WILDCARD_VALUE));
        }

        if (config.enablecroptoseedRecipe) {
            for (final Crop crop : Crop.values()) {
                if (!config.enablecropspecialplanting ||
                        !crop.equals(Crop.CRANBERRY) && !crop.equals(Crop.RICE) && !crop.equals(Crop.SEAWEED) ) {
                    addShapelessOreRecipe(crop.seed(), crop.food());
                }
            }
        }

        if (config.enablesaltfromwaterbucketrecipe) addShapelessOreRecipe(ItemRegistry.saltItem, toolPot, listAllwater);

        addShapelessOreRecipe(new ItemStack(ItemRegistry.sunflowerseedsItem, 2, 0), new ItemStack(Blocks.DOUBLE_PLANT, 1, 0), new ItemStack(Blocks.DOUBLE_PLANT, 1, 0));
        addShapelessOreRecipe(ItemRegistry.freshwaterItem, listAllwater);
        addShapelessOreRecipe(ItemRegistry.bubblywaterItem, toolPot, ItemRegistry.freshwaterItem);
        addShapelessOreRecipe(Items.SUGAR, toolPot, foodHoneydrop);
        addShapelessOreRecipe(Items.SUGAR, toolPot, dropHoney);
        addShapelessOreRecipe(Items.FISH, listAllfishraw);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.freshwaterItem, config.freshwaterfrombucket), Items.WATER_BUCKET);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.freshmilkItem, config.freshmilkfrombucket), Items.MILK_BUCKET);
        addShapedOreRecipe(Items.CAKE, "AAA", "BEB", "CCC", 'A', listAllmilk, 'B', listAllsugar, 'C', flourEqualswheat, 'E', listAllegg);
        addShapelessOreRecipe(Items.MUSHROOM_STEW, Items.BOWL, listAllmushroom, listAllmushroom);
        addShapelessOreRecipe(ItemRegistry.silkentofuItem, toolSaucepan, cropSoybean);
        addShapelessOreRecipe(ItemRegistry.firmtofuItem, toolSkillet, foodSilkentofu);
        addShapelessOreRecipe(ItemRegistry.soymilkItem, toolPot, cropSoybean);
        addShapelessOreRecipe(ItemRegistry.flourItem, toolMortarandpestle, Items.WHEAT);
        addShapelessOreRecipe(ItemRegistry.flourItem, toolMortarandpestle, cropRice);
        addShapelessOreRecipe(ItemRegistry.flourItem, toolMortarandpestle, Items.POTATO);
        addShapelessOreRecipe(ItemRegistry.flourItem, toolMortarandpestle, cropRye);
        addShapelessOreRecipe(ItemRegistry.flourItem, toolMortarandpestle, cropOats);
        addShapelessOreRecipe(ItemRegistry.flourItem, toolMortarandpestle, cropBarley);
        addShapelessOreRecipe(ItemRegistry.doughItem, toolMixingbowl, listAllwater, foodFlour, foodSalt);
        addShapelessOreRecipe(ItemRegistry.doughItem, toolMixingbowl, listAllwater, foodFlour, dustSalt);
        addShapelessOreRecipe(ItemRegistry.doughItem, toolMixingbowl, listAllwater, foodFlour, itemSalt);
        addShapelessOreRecipe(ItemRegistry.pastaItem, toolMixingbowl, foodDough, foodButter);
        addShapelessOreRecipe(ItemRegistry.heavycreamItem, toolMixingbowl, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.butterItem, toolSaucepan, listAllheavycream, foodSalt);
        addShapelessOreRecipe(ItemRegistry.butterItem, toolSaucepan, listAllheavycream, dustSalt);
        addShapelessOreRecipe(ItemRegistry.butterItem, toolSaucepan, listAllheavycream, itemSalt);
        addShapelessOreRecipe(ItemRegistry.cheeseItem, toolPot, listAllmilk, foodSalt);
        addShapelessOreRecipe(ItemRegistry.cheeseItem, toolPot, listAllmilk, dustSalt);
        addShapelessOreRecipe(ItemRegistry.cheeseItem, toolPot, listAllmilk, itemSalt);
        addShapelessOreRecipe(ItemRegistry.icecreamItem, toolMixingbowl, listAllmilk, foodSalt, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.icecreamItem, toolMixingbowl, listAllmilk, dustSalt, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.icecreamItem, toolMixingbowl, listAllmilk, itemSalt, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.grilledcheeseItem, toolSkillet, foodToast, foodButter, foodCheese);
        addShapelessOreRecipe(ItemRegistry.applesauceItem, toolPot, cropApple);
        addShapelessOreRecipe(ItemRegistry.applejuiceItem, toolJuicer, cropApple);
        addShapelessOreRecipe(ItemRegistry.applepieItem, toolBakeware, cropApple, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.caramelappleItem, cropApple, foodCaramel, stickWood);
        addShapelessOreRecipe(ItemRegistry.pumpkinbreadItem, toolBakeware, Blocks.PUMPKIN, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.pumpkinsoupItem, toolPot, Blocks.PUMPKIN, listAllheavycream, foodStock);
        addShapelessOreRecipe(ItemRegistry.melonjuiceItem, toolJuicer, Items.MELON);
        addShapelessOreRecipe(ItemRegistry.melonsmoothieItem, toolJuicer, Items.MELON, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.carrotjuiceItem, toolJuicer, Items.CARROT);
        addShapelessOreRecipe(ItemRegistry.carrotcakeItem, toolBakeware, Items.CARROT, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.carrotsoupItem, toolPot, Items.CARROT, listAllheavycream, foodStock);
        addShapelessOreRecipe(ItemRegistry.glazedcarrotsItem, toolSaucepan, Items.CARROT, foodButter, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.butteredpotatoItem, Items.BAKED_POTATO, foodButter);
        addShapelessOreRecipe(ItemRegistry.loadedbakedpotatoItem, foodButteredpotato, listAllporkcooked, foodCheese);
        addShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, toolMixingbowl, foodButteredpotato, foodSalt);
        addShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, toolMixingbowl, foodButteredpotato, dustSalt);
        addShapelessOreRecipe(ItemRegistry.mashedpotatoesItem, toolMixingbowl, foodButteredpotato, itemSalt);
        addShapelessOreRecipe(ItemRegistry.potatosaladItem, toolCuttingboard, Items.BAKED_POTATO, foodMayo);
        addShapelessOreRecipe(ItemRegistry.potatosoupItem, toolPot, Items.POTATO, foodSalt, foodStock);
        addShapelessOreRecipe(ItemRegistry.potatosoupItem, toolPot, Items.POTATO, dustSalt, foodStock);
        addShapelessOreRecipe(ItemRegistry.potatosoupItem, toolPot, Items.POTATO, itemSalt, foodStock);
        addShapelessOreRecipe(ItemRegistry.friesItem, toolBakeware, Items.POTATO, foodSalt);
        addShapelessOreRecipe(ItemRegistry.friesItem, toolBakeware, Items.POTATO, dustSalt);
        addShapelessOreRecipe(ItemRegistry.friesItem, toolBakeware, Items.POTATO, itemSalt);
        addShapelessOreRecipe(ItemRegistry.stuffedmushroomItem, toolBakeware, listAllmushroom, foodCheese, foodToast);
        addShapelessOreRecipe(ItemRegistry.grilledmushroomItem, toolSkillet, listAllmushroom);
        addShapelessOreRecipe(ItemRegistry.chickensandwichItem, toolSkillet, listAllchickenraw, Items.BREAD, foodMayo);
        addShapelessOreRecipe(ItemRegistry.chickennoodlesoupItem, toolPot, listAllchickenraw, Items.CARROT, foodPasta, foodStock);
        addShapelessOreRecipe(ItemRegistry.chickenpotpieItem, toolBakeware, listAllchickenraw, Items.POTATO, Items.CARROT, foodDough);
        addShapelessOreRecipe(ItemRegistry.breadedporkchopItem, toolSkillet, listAllporkraw, foodFlour);
        addShapelessOreRecipe(ItemRegistry.hotdogItem, toolPot, listAllporkraw, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.bakedhamItem, toolBakeware, listAllporkraw, cropApple, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.hamburgerItem, toolSkillet, listAllbeefraw, foodToast);
        addShapelessOreRecipe(ItemRegistry.cheeseburgerItem, foodHamburger, foodCheese);
        addShapelessOreRecipe(ItemRegistry.baconcheeseburgerItem, foodCheeseburger, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.potroastItem, toolPot, listAllbeefraw, Items.POTATO, Items.CARROT, foodStock);
        addShapelessOreRecipe(ItemRegistry.fishsandwichItem, toolSkillet, listAllfishraw, foodMayo, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.fishsticksItem, toolBakeware, listAllfishraw, foodFlour);
        addShapelessOreRecipe(ItemRegistry.fishandchipsItem, foodFishsticks, foodFries);
        addShapelessOreRecipe(ItemRegistry.mayoItem, toolJuicer, listAllegg);
        addShapelessOreRecipe(ItemRegistry.friedeggItem, toolSkillet, listAllegg);
        addShapelessOreRecipe(ItemRegistry.scrambledeggItem, toolSaucepan, listAllegg);
        addShapelessOreRecipe(ItemRegistry.boiledeggItem, toolPot, listAllegg);
        addShapelessOreRecipe(ItemRegistry.eggsaladItem, toolCuttingboard, foodBoiledegg, foodMayo);
        addShapelessOreRecipe(ItemRegistry.caramelItem, toolSaucepan, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.taffyItem, toolSaucepan, listAllsugar, listAllwater, foodSalt);
        addShapelessOreRecipe(ItemRegistry.taffyItem, toolSaucepan, listAllsugar, listAllwater, dustSalt);
        addShapelessOreRecipe(ItemRegistry.taffyItem, toolSaucepan, listAllsugar, listAllwater, itemSalt);
        addShapelessOreRecipe(ItemRegistry.spidereyesoupItem, toolPot, Items.SPIDER_EYE, foodStock);
        addShapelessOreRecipe(ItemRegistry.zombiejerkyItem, Items.ROTTEN_FLESH, foodSalt, foodSalt);
        addShapelessOreRecipe(ItemRegistry.zombiejerkyItem, Items.ROTTEN_FLESH, dustSalt, dustSalt);
        addShapelessOreRecipe(ItemRegistry.zombiejerkyItem, Items.ROTTEN_FLESH, itemSalt, itemSalt);
        addShapelessOreRecipe(ItemRegistry.zombiejerkyItem, Items.ROTTEN_FLESH, itemSalt, dustSalt);
        addShapelessOreRecipe(ItemRegistry.zombiejerkyItem, Items.ROTTEN_FLESH, itemSalt, foodSalt);
        addShapelessOreRecipe(ItemRegistry.zombiejerkyItem, Items.ROTTEN_FLESH, foodSalt, dustSalt);
        addShapelessOreRecipe(ItemRegistry.cocoapowderItem, toolMortarandpestle, dyeBrown);
        addShapelessOreRecipe(ItemRegistry.chocolatebarItem, toolSaucepan, foodCocoapowder, foodButter, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.hotchocolateItem, toolJuicer, foodCocoapowder, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.chocolateicecreamItem, toolMixingbowl, listAllicecream, foodCocoapowder);
        addShapelessOreRecipe(ItemRegistry.vegetablesoupItem, toolPot, Items.POTATO, Items.CARROT, listAllmushroom, foodStock);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3), toolPot, Items.BONE);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3), toolPot, listAllmeatraw);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3), toolPot, listAllveggie);
        addShapelessOreRecipe(ItemRegistry.fruitsaladItem, toolCuttingboard, listAllfruit, listAllfruit);
        addShapelessOreRecipe(ItemRegistry.spagettiItem, toolSaucepan, cropTomato, foodPasta, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.spagettiandmeatballsItem, toolMixingbowl, foodSpagetti, listAllbeefcooked);
        addShapelessOreRecipe(ItemRegistry.tomatosoupItem, toolPot, cropTomato, foodStock);
        addShapelessOreRecipe(ItemRegistry.ketchupItem, toolJuicer, cropTomato);
        addShapelessOreRecipe(ItemRegistry.chickenparmasanItem, toolBakeware, listAllchickencooked, cropTomato, foodCheese);
        addShapelessOreRecipe(ItemRegistry.pizzaItem, toolBakeware, foodDough, cropTomato, foodCheese, listAllporkraw);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, Items.CARROT);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropOnion);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropRadish);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropCucumber);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropBellpepper);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropZucchini);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropAsparagus);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropBroccoli);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropPeas);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropTomato);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropSunflower);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropWalnut);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropCauliflower);
        addShapelessOreRecipe(ItemRegistry.springsaladItem, toolCuttingboard, cropLettuce, cropRhubarb);
        addShapelessOreRecipe(ItemRegistry.porklettucewrapItem, toolCuttingboard, cropLettuce, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, toolCuttingboard, cropLettuce, listAllfishcooked);
        addShapelessOreRecipe(ItemRegistry.bltItem, toolCuttingboard, cropLettuce, cropTomato, listAllporkcooked, foodToast);
        addShapelessOreRecipe(ItemRegistry.leafychickensandwichItem, foodChickensandwich, cropLettuce);
        addShapelessOreRecipe(ItemRegistry.leafyfishsandwichItem, foodFishsandwich, cropLettuce);
        addShapelessOreRecipe(ItemRegistry.deluxecheeseburgerItem, foodCheeseburger, cropLettuce, cropTomato);
        addShapelessOreRecipe(ItemRegistry.delightedmealItem, foodDeluxecheeseburger, foodFries, listAllsmoothie);
        addShapelessOreRecipe(ItemRegistry.delightedmealItem, foodDeluxecheeseburger, foodZucchinifries, listAllsmoothie);
        addShapelessOreRecipe(ItemRegistry.onionsoupItem, toolPot, cropOnion, foodStock, foodGrilledcheese);
        addShapelessOreRecipe(ItemRegistry.potatocakesItem, toolSkillet, cropOnion, Items.POTATO, foodButter);
        addShapelessOreRecipe(ItemRegistry.hashItem, toolSkillet, cropOnion, listAllbeefcooked, Items.POTATO, foodKetchup);
        addShapelessOreRecipe(ItemRegistry.braisedonionsItem, toolSaucepan, cropOnion, foodButter, foodStock);
        addShapelessOreRecipe(ItemRegistry.heartybreakfastItem, listAllporkcooked, foodFriedegg, foodToast, foodPotatocakes, listAlljuice);
        addShapelessOreRecipe(ItemRegistry.heartybreakfastItem, listAllporkcooked, foodFriedegg, foodToast, foodPotatocakes, foodChocolatemilk);
        addShapelessOreRecipe(ItemRegistry.cornonthecobItem, cropCorn, foodButter);
        addShapelessOreRecipe(ItemRegistry.cornmealItem, toolMortarandpestle, cropCorn);
        addShapelessOreRecipe(ItemRegistry.cornbreadItem, toolSkillet, foodCornmeal, listAllegg, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.tortillaItem, toolSkillet, foodCornmeal, listAllwater);
        addShapelessOreRecipe(ItemRegistry.nachoesItem, toolCuttingboard, foodTortilla, foodCheese);
        addShapelessOreRecipe(ItemRegistry.tacoItem, toolCuttingboard, listAllbeefcooked, cropLettuce, foodCheese, foodTortilla);
        addShapelessOreRecipe(ItemRegistry.fishtacoItem, toolCuttingboard, listAllfishcooked, cropLettuce, foodCheese, foodTortilla);
        addShapelessOreRecipe(ItemRegistry.creamedcornItem, toolSaucepan, cropCorn, cropOnion, foodHeavycream);
        addShapelessOreRecipe(ItemRegistry.strawberrysmoothieItem, toolJuicer, cropStrawberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.strawberrypieItem, toolBakeware, cropStrawberry, foodDough, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.strawberrysaladItem, cropStrawberry, foodFruitsalad);
        addShapelessOreRecipe(ItemRegistry.strawberryjuiceItem, toolJuicer, cropStrawberry);
        addShapelessOreRecipe(ItemRegistry.chocolatestrawberryItem, toolSaucepan, cropStrawberry, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.peanutbutterItem, toolJuicer, cropPeanut);
        addShapelessOreRecipe(ItemRegistry.trailmixItem, listAllseed, listAllseed, listAllseed, listAllseed, listAllseed, listAllseed, foodRaisins, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.trailmixItem, foodSaltedsunflowerseeds, foodRaisins, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.trailmixItem, listAllnut, listAllnut, foodRaisins, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.trailmixItem, foodRoastedpumpkinseeds, foodRaisins, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.pbandjItem, toolCuttingboard, listAllnutbutter, foodGrapejelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.peanutbuttercookiesItem, toolBakeware, listAllnutbutter, foodFlour, listAllegg, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.grapejuiceItem, toolJuicer, cropGrape);
        addShapelessOreRecipe(ItemRegistry.vinegarItem, toolPot, foodGrapejuice);
        addShapelessOreRecipe(ItemRegistry.grapejellyItem, toolSaucepan, cropGrape, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.grapesaladItem, cropGrape, foodFruitsalad);
        addShapelessOreRecipe(ItemRegistry.raisincookiesItem, toolBakeware, foodFlour, listAllegg, listAllsugar, foodRaisins);
        addShapelessOreRecipe(ItemRegistry.picklesItem, toolPot, cropCucumber, foodSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.picklesItem, toolPot, cropCucumber, dustSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.picklesItem, toolPot, cropCucumber, itemSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.cucumbersaladItem, toolCuttingboard, cropCucumber, foodSpringsalad);
        addShapelessOreRecipe(ItemRegistry.cucumbersoupItem, toolPot, cropCucumber, foodStock, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.vegetarianlettucewrapItem, toolCuttingboard, cropCucumber, cropLettuce, cropTomato);
        addShapelessOreRecipe(ItemRegistry.marinatedcucumbersItem, toolPot, cropCucumber, cropOnion, listAllsugar, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.ricesoupItem, toolPot, cropRice, foodStock);
        addShapelessOreRecipe(ItemRegistry.friedriceItem, toolSkillet, cropRice, Items.CARROT, listAllegg, cropOnion);
        addShapelessOreRecipe(ItemRegistry.mushroomrisottoItem, toolBakeware, cropRice, listAllmushroom, cropOnion, foodCheese);
        addShapelessOreRecipe(ItemRegistry.curryItem, toolSaucepan, cropRice, foodSalt, cropChilipepper, foodCoconutmilk, listAllspice);
        addShapelessOreRecipe(ItemRegistry.curryItem, toolSaucepan, cropRice, dustSalt, cropChilipepper, foodCoconutmilk, listAllspice);
        addShapelessOreRecipe(ItemRegistry.curryItem, toolSaucepan, cropRice, itemSalt, cropChilipepper, foodCoconutmilk, listAllspice);
        addShapelessOreRecipe(ItemRegistry.rainbowcurryItem, toolSkillet, cropRice, dyeRed, dyeYellow, dyeOrange, dyeGreen, dyePurple, dyeBlue);
        addShapelessOreRecipe(ItemRegistry.refriedbeansItem, toolSkillet, cropBean, cropOnion, foodButter);
        addShapelessOreRecipe(ItemRegistry.bakedbeansItem, toolPot, cropBean, listAllporkcooked, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.beansandriceItem, toolPot, cropBean, cropRice, cropOnion, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.beansandriceItem, toolPot, cropBean, cropRice, cropBellpepper, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.beansandriceItem, toolPot, cropBean, cropRice, cropChilipepper, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.chiliItem, toolPot, cropBean, cropOnion, listAllbeefcooked);
        addShapelessOreRecipe(ItemRegistry.chiliItem, toolPot, cropBean, cropBellpepper, listAllbeefcooked);
        addShapelessOreRecipe(ItemRegistry.chiliItem, toolPot, cropBean, cropChilipepper, listAllbeefcooked);
        addShapelessOreRecipe(ItemRegistry.beanburritoItem, toolSkillet, cropBean, foodTortilla, cropRice, foodCheese);
        addShapelessOreRecipe(ItemRegistry.stuffedpepperItem, toolBakeware, cropBellpepper, cropTomato, cropRice);
        addShapelessOreRecipe(ItemRegistry.veggiestirfryItem, toolSkillet, cropBellpepper, Items.CARROT, cropRice, cropOnion, cropBean);
        addShapelessOreRecipe(ItemRegistry.veggiestirfryItem, toolSkillet, cropBellpepper, Items.CARROT, cropRice, cropOnion, cropChilipepper);
        addShapelessOreRecipe(ItemRegistry.veggiestirfryItem, toolSkillet, cropBellpepper, Items.CARROT, cropRice, cropOnion, listAllmushroom);
        addShapelessOreRecipe(ItemRegistry.grilledskewersItem, toolCuttingboard, cropBellpepper, cropOnion, Items.CARROT, stickWood);
        addShapelessOreRecipe(ItemRegistry.supremepizzaItem, toolCuttingboard, foodPizza, cropBellpepper, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.omeletItem, toolSkillet, listAllegg, cropBellpepper, cropOnion);
        addShapelessOreRecipe(ItemRegistry.hotwingsItem, toolSkillet, cropChilipepper, listAllchickencooked, foodButter);
        addShapelessOreRecipe(ItemRegistry.chilipoppersItem, toolBakeware, cropChilipepper, foodFlour, foodCheese);
        addShapelessOreRecipe(ItemRegistry.extremechiliItem, foodChili, cropChilipepper);
        addShapelessOreRecipe(ItemRegistry.chilichocolateItem, toolMixingbowl, foodChocolatebar, cropChilipepper);
        addShapelessOreRecipe(ItemRegistry.lemonaideItem, toolJuicer, cropLemon);
        addShapelessOreRecipe(ItemRegistry.lemonbarItem, toolBakeware, cropLemon, foodDough, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.fishdinnerItem, toolSkillet, cropLemon, foodFlour, listAllfishraw, foodMayo);
        addShapelessOreRecipe(ItemRegistry.lemonsmoothieItem, toolJuicer, cropLemon, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.lemonmeringueItem, toolBakeware, cropLemon, listAllsugar, foodDough, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.candiedlemonItem, toolBakeware, cropLemon, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.lemonchickenItem, toolBakeware, cropLemon, listAllchickenraw, foodButter);
        addShapelessOreRecipe(ItemRegistry.blueberrysmoothieItem, toolJuicer, cropBlueberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.blueberrypieItem, toolBakeware, cropBlueberry, foodDough, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.blueberrymuffinItem, toolBakeware, cropBlueberry, foodFlour, listAllegg);
        addShapelessOreRecipe(ItemRegistry.blueberryjuiceItem, toolJuicer, cropBlueberry);
        addShapelessOreRecipe(ItemRegistry.pancakesItem, toolSkillet, foodFlour, listAllegg, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.blueberrypancakesItem, cropBlueberry, foodPancakes);
        addShapelessOreRecipe(ItemRegistry.cherryjuiceItem, toolJuicer, cropCherry);
        addShapelessOreRecipe(ItemRegistry.cherrypieItem, toolBakeware, cropCherry, foodDough, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.chocolatecherryItem, toolSaucepan, cropCherry, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.cherrysmoothieItem, toolJuicer, cropCherry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.cheesecakeItem, toolBakeware, foodFlour, listAllheavycream, listAllsugar, listAllegg);
        addShapelessOreRecipe(ItemRegistry.cherrycheesecakeItem, cropCherry, foodCheesecake);
        addShapelessOreRecipe(ItemRegistry.stuffedeggplantItem, toolBakeware, cropEggplant, cropOnion, cropBellpepper, foodButter, listAllegg);
        addShapelessOreRecipe(ItemRegistry.stuffedeggplantItem, toolBakeware, cropEggplant, cropGarlic);
        addShapelessOreRecipe(ItemRegistry.eggplantparmItem, toolBakeware, cropEggplant, cropTomato, foodPasta, foodCheese);
        addShapelessOreRecipe(ItemRegistry.raspberryicedteaItem, cropTea, Items.SNOWBALL, cropRaspberry);
        addShapelessOreRecipe(ItemRegistry.chaiteaItem, cropTea, foodGroundcinnamon, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.espressoItem, cropCoffee, cropCoffee, cropCoffee, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.coffeeconlecheItem, foodEspresso, listAllmilk, foodGroundcinnamon);
        addShapelessOreRecipe(ItemRegistry.mochaicecreamItem, toolMixingbowl, listAllicecream, cropCoffee, foodCocoapowder);
        addShapelessOreRecipe(ItemRegistry.pickledbeetsItem, toolPot, cropBeet, foodVinegar, foodSalt);
        addShapelessOreRecipe(ItemRegistry.pickledbeetsItem, toolPot, cropBeet, foodVinegar, dustSalt);
        addShapelessOreRecipe(ItemRegistry.pickledbeetsItem, toolPot, cropBeet, foodVinegar, itemSalt);
        addShapelessOreRecipe(ItemRegistry.beetsaladItem, toolMixingbowl, cropBeet, cropLettuce, foodVinegar, foodCheese);
        addShapelessOreRecipe(ItemRegistry.beetsoupItem, toolPot, cropBeet, cropOnion, foodBlackpepper, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.bakedbeetsItem, toolBakeware, cropBeet, foodButter, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.broccolimacItem, toolPot, cropBroccoli, foodPasta, foodCheese);
        addShapelessOreRecipe(ItemRegistry.broccolindipItem, toolMixingbowl, cropBroccoli, cropOnion, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.creamedbroccolisoupItem, toolPot, cropBroccoli, Items.CARROT, foodFlour, foodBlackpepper, foodStock);
        addShapelessOreRecipe(ItemRegistry.sweetpotatopieItem, toolBakeware, cropSweetpotato, foodDough, foodGroundcinnamon, foodMarshmellows);
        addShapelessOreRecipe(ItemRegistry.candiedsweetpotatoesItem, toolSaucepan, cropSweetpotato, listAllsugar, foodGroundcinnamon);
        addShapelessOreRecipe(ItemRegistry.mashedsweetpotatoesItem, toolSaucepan, cropSweetpotato, foodButter);
        addShapelessOreRecipe(ItemRegistry.steamedpeasItem, toolPot, cropPeas, listAllwater, foodSalt);
        addShapelessOreRecipe(ItemRegistry.steamedpeasItem, toolPot, cropPeas, listAllwater, dustSalt);
        addShapelessOreRecipe(ItemRegistry.steamedpeasItem, toolPot, cropPeas, listAllwater, itemSalt);
        addShapelessOreRecipe(ItemRegistry.splitpeasoupItem, toolPot, cropPeas, listAllporkcooked, foodBlackpepper, foodStock);
        addShapelessOreRecipe(ItemRegistry.pineappleupsidedowncakeItem, toolBakeware, cropPineapple, foodDough, cropCherry, cropWalnut);
        addShapelessOreRecipe(ItemRegistry.pineapplehamItem, toolBakeware, cropPineapple, listAllporkraw, cropCherry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.pineappleyogurtItem, cropPineapple, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.turnipsoupItem, toolPot, cropTurnip, Blocks.PUMPKIN, foodButter, foodStock);
        addShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, toolBakeware, cropTurnip, Items.CARROT, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, toolBakeware, Blocks.PUMPKIN, Items.CARROT, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, toolBakeware, Items.POTATO, Items.CARROT, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, toolBakeware, cropSweetpotato, Items.CARROT, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, toolBakeware, cropRadish, Items.CARROT, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.roastedrootveggiemedleyItem, toolBakeware, cropParsnip, Items.CARROT, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.bakedturnipsItem, toolBakeware, cropTurnip, foodButter, foodSalt, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.bakedturnipsItem, toolBakeware, cropTurnip, foodButter, dustSalt, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.bakedturnipsItem, toolBakeware, cropTurnip, foodButter, itemSalt, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.gingerbreadItem, toolBakeware, cropGinger, foodFlour, foodButter, listAllegg, foodGroundcinnamon);
        addShapelessOreRecipe(ItemRegistry.gingersnapsItem, toolBakeware, cropGinger, foodFlour, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.candiedgingerItem, toolSaucepan, cropGinger, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.mustardItem, toolJuicer, cropMustard);
        addShapelessOreRecipe(ItemRegistry.softpretzelandmustardItem, foodSoftpretzel, foodMustard);
        addShapelessOreRecipe(ItemRegistry.spicymustardporkItem, toolSaucepan, foodMustard, listAllporkraw, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.spicymustardporkItem, toolSaucepan, foodMustard, listAllporkraw, cropGarlic);
        addShapelessOreRecipe(ItemRegistry.spicymustardporkItem, toolSaucepan, foodMustard, listAllporkraw, foodSalt);
        addShapelessOreRecipe(ItemRegistry.spicymustardporkItem, toolSaucepan, foodMustard, listAllporkraw, dustSalt);
        addShapelessOreRecipe(ItemRegistry.spicymustardporkItem, toolSaucepan, foodMustard, listAllporkraw, itemSalt);
        addShapelessOreRecipe(ItemRegistry.spicygreensItem, toolSaucepan, foodMustard, cropLettuce, foodBlackpepper, cropGarlic, foodOliveoil, cropOnion);
        addShapelessOreRecipe(ItemRegistry.spicygreensItem, toolSaucepan, foodMustard, cropBroccoli, foodBlackpepper, cropGarlic, foodOliveoil, cropOnion);
        addShapelessOreRecipe(ItemRegistry.spicygreensItem, toolSaucepan, foodMustard, cropPeas, foodBlackpepper, cropGarlic, foodOliveoil, cropOnion);
        addShapelessOreRecipe(ItemRegistry.garlicbreadItem, cropGarlic, foodToast, foodButter);
        addShapelessOreRecipe(ItemRegistry.garlicmashedpotatoesItem, foodMashedpotatoes, cropGarlic);
        addShapelessOreRecipe(ItemRegistry.garlicchickenItem, toolBakeware, cropGarlic, cropGarlic, cropGarlic, foodOliveoil, listAllchickenraw);
        addShapelessOreRecipe(ItemRegistry.summerradishsaladItem, toolMixingbowl, cropRadish, cropOnion, cropCucumber, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.summersquashwithradishItem, toolMixingbowl, cropRadish, cropZucchini, Blocks.PUMPKIN, cropSpiceleaf, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.celeryandpeanutbutterItem, cropCelery, listAllnutbutter);
        addShapelessOreRecipe(ItemRegistry.chickencelerycasseroleItem, toolBakeware, cropCelery, listAllchickenraw, cropGarlic, Items.CARROT, listAllmushroom);
        addShapelessOreRecipe(ItemRegistry.peasandceleryItem, toolMixingbowl, cropCelery, cropPeas, cropLemon, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.celerysoupItem, toolPot, cropCelery, cropOnion, Items.CARROT, foodStock);
        addShapelessOreRecipe(ItemRegistry.zucchinibreadItem, toolBakeware, cropZucchini, foodDough, foodGroundcinnamon, cropWalnut);
        addShapelessOreRecipe(ItemRegistry.zucchinifriesItem, toolBakeware, cropZucchini, foodToast, foodCheese, listAllegg);
        addShapelessOreRecipe(ItemRegistry.zestyzucchiniItem, toolBakeware, cropZucchini, foodPasta, cropChilipepper, cropGarlic, foodCheese);
        addShapelessOreRecipe(ItemRegistry.zucchinibakeItem, toolBakeware, cropZucchini, cropTomato, foodToast, cropCorn, foodCheese);
        addShapelessOreRecipe(ItemRegistry.asparagusquicheItem, toolSkillet, cropAsparagus, listAllegg, cropOnion, foodCheese);
        addShapelessOreRecipe(ItemRegistry.asparagussoupItem, toolPot, cropAsparagus, cropOnion, foodButter, foodStock);
        addShapelessOreRecipe(ItemRegistry.walnutraisinbreadItem, toolBakeware, cropWalnut, foodRaisins, foodDough, foodGroundcinnamon);
        addShapelessOreRecipe(ItemRegistry.candiedwalnutsItem, toolSaucepan, cropWalnut, foodVanilla, foodGroundcinnamon, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.brownieItem, toolBakeware, cropWalnut, foodFlour, listAllegg, foodButter, listAllsugar, foodCocoapowder, foodVanilla);
        addShapelessOreRecipe(ItemRegistry.papayajuiceItem, toolJuicer, cropPapaya);
        addShapelessOreRecipe(ItemRegistry.papayasmoothieItem, toolJuicer, cropPapaya, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.papayayogurtItem, cropPapaya, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.starfruitjuiceItem, toolJuicer, cropStarfruit);
        addShapelessOreRecipe(ItemRegistry.starfruitsmoothieItem, toolJuicer, cropStarfruit, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.starfruityogurtItem, cropStarfruit, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.guacamoleItem, toolCuttingboard, cropAvocado, cropChilipepper, cropTomato, cropOnion, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.creamofavocadosoupItem, toolPot, cropAvocado, listAllheavycream, cropLime, cropSpiceleaf, foodStock);
        addShapelessOreRecipe(ItemRegistry.avocadoburritoItem, toolCuttingboard, cropAvocado, foodTortilla, foodCheese, listAllchickencooked);
        addShapelessOreRecipe(ItemRegistry.avocadoburritoItem, toolCuttingboard, cropAvocado, foodTortilla, foodCheese, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.poachedpearItem, toolSaucepan, cropPear, foodVanilla, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.fruitcrumbleItem, toolBakeware, listAllfruit, foodGroundcinnamon, foodFlour, foodButter);
        addShapelessOreRecipe(ItemRegistry.pearyogurtItem, cropPear, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.plumyogurtItem, cropPlum, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.bananasplitItem, toolMixingbowl, cropBanana, foodCocoapowder, cropCherry, listAllicecream, cropStrawberry);
        addShapelessOreRecipe(ItemRegistry.banananutbreadItem, toolBakeware, cropBanana, foodFlour, cropWalnut, listAllmilk, foodSalt);
        addShapelessOreRecipe(ItemRegistry.banananutbreadItem, toolBakeware, cropBanana, foodFlour, cropWalnut, listAllmilk, dustSalt);
        addShapelessOreRecipe(ItemRegistry.banananutbreadItem, toolBakeware, cropBanana, foodFlour, cropWalnut, listAllmilk, itemSalt);
        addShapelessOreRecipe(ItemRegistry.bananasmoothieItem, toolJuicer, cropBanana, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.bananayogurtItem, cropBanana, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.coconutmilkItem, toolJuicer, cropCoconut);
        addShapelessOreRecipe(ItemRegistry.chickencurryItem, toolPot, cropCoconut, foodPlainyogurt, listAllchickenraw, listAllspice, cropChilipepper, cropRice, foodGroundcinnamon, cropGarlic);
        addShapelessOreRecipe(ItemRegistry.coconutshrimpItem, toolSkillet, cropCoconut, listAllegg, foodFlour, foodShrimpraw, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.coconutyogurtItem, cropCoconut, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.orangejuiceItem, toolJuicer, cropOrange);
        addShapelessOreRecipe(ItemRegistry.orangechickenItem, toolSaucepan, cropOrange, listAllchickenraw, listAllsugar, cropRice, cropBroccoli);
        addShapelessOreRecipe(ItemRegistry.orangesmoothieItem, toolJuicer, cropOrange, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.orangeyogurtItem, cropOrange, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.peachjuiceItem, toolJuicer, cropPeach);
        addShapelessOreRecipe(ItemRegistry.peachcobblerItem, toolBakeware, cropPeach, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.peachsmoothieItem, toolJuicer, cropPeach, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.peachyogurtItem, cropPeach, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.limejuiceItem, toolJuicer, cropLime);
        addShapelessOreRecipe(ItemRegistry.keylimepieItem, toolBakeware, cropLime, listAllheavycream, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.limesmoothieItem, toolJuicer, cropLime, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.limeyogurtItem, cropLime, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.mangojuiceItem, toolJuicer, cropMango);
        addShapelessOreRecipe(ItemRegistry.mangosmoothieItem, toolJuicer, cropMango, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.mangoyogurtItem, cropMango, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.pomegranatejuiceItem, toolJuicer, cropPomegranate);
        addShapelessOreRecipe(ItemRegistry.pomegranatesmoothieItem, toolJuicer, cropPomegranate, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.pomegranateyogurtItem, cropPomegranate, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.vanillayogurtItem, foodVanilla, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.cinnamonrollItem, toolBakeware, foodGroundcinnamon, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.frenchtoastItem, toolSkillet, foodGroundcinnamon, foodToast, listAllsugar, listAllegg);
        addShapelessOreRecipe(ItemRegistry.marshmellowsItem, toolPot, listAllsugar, listAllwater, listAllegg);
        addShapelessOreRecipe(ItemRegistry.donutItem, toolPot, foodDough, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.chocolatedonutItem, foodDonut, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.powdereddonutItem, foodDonut, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.jellydonutItem, foodDonut, foodGrapejelly);
        addShapelessOreRecipe(ItemRegistry.frosteddonutItem, foodDonut, listAllsugar, dyeRed, dyeGreen, dyeYellow);
        addShapelessOreRecipe(ItemRegistry.cactussoupItem, toolPot, Blocks.CACTUS, foodStock);
        addShapelessOreRecipe(ItemRegistry.wafflesItem, toolSkillet, foodFlour, listAllegg, listAllmilk, foodButter);
        addShapelessOreRecipe(ItemRegistry.seedsoupItem, toolPot, listAllseed, foodStock);
        addShapelessOreRecipe(ItemRegistry.softpretzelItem, toolBakeware, foodDough, foodButter, foodSalt);
        addShapelessOreRecipe(ItemRegistry.softpretzelItem, toolBakeware, foodDough, foodButter, dustSalt);
        addShapelessOreRecipe(ItemRegistry.softpretzelItem, toolBakeware, foodDough, foodButter, itemSalt);
        addShapelessOreRecipe(ItemRegistry.jellybeansItem, toolSaucepan, listAllsugar, dyeRed, dyeYellow);
        addShapelessOreRecipe(ItemRegistry.biscuitItem, toolBakeware, foodDough, foodButter);
        addShapelessOreRecipe(ItemRegistry.creamcookieItem, toolBakeware, foodDough, listAllheavycream, listAllsugar, foodCocoapowder);
        addShapelessOreRecipe(ItemRegistry.jaffaItem, toolBakeware, listAllegg, listAllsugar, foodFlour, foodChocolatebar, cropOrange);
        addShapelessOreRecipe(ItemRegistry.friedchickenItem, toolPot, listAllchickenraw, foodFlour, cropSpiceleaf, foodBlackpepper, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.chocolatesprinklecakeItem, toolBakeware, foodCocoapowder, listAllsugar, foodDough, dyeRed, dyeGreen, dyeYellow);
        addShapelessOreRecipe(ItemRegistry.redvelvetcakeItem, toolBakeware, listAllmilk, foodFlour, listAllheavycream, listAllsugar, listAllegg, dyeRed, dyeRed);
        addShapelessOreRecipe(ItemRegistry.footlongItem, toolCuttingboard, Items.BREAD, listAllbeefcooked, cropLettuce, cropTomato, foodMayo);
        addShapelessOreRecipe(ItemRegistry.footlongItem, toolCuttingboard, Items.BREAD, listAllchickencooked, cropLettuce, cropTomato, foodMayo);
        addShapelessOreRecipe(ItemRegistry.footlongItem, toolCuttingboard, Items.BREAD, listAllporkcooked, cropLettuce, cropTomato, foodMayo);
        addShapelessOreRecipe(ItemRegistry.blueberryyogurtItem, cropBlueberry, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.lemonyogurtItem, cropLemon, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.cherryyogurtItem, cropCherry, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.strawberryyogurtItem, cropStrawberry, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.grapeyogurtItem, cropGrape, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.chocolateyogurtItem, foodCocoapowder, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.blackberryjuiceItem, toolJuicer, cropBlackberry);
        addShapelessOreRecipe(ItemRegistry.blackberrycobblerItem, cropBlackberry, toolBakeware, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.blackberrysmoothieItem, toolJuicer, cropBlackberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.blackberryyogurtItem, cropBlackberry, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.chocolatemilkItem, listAllmilk, foodCocoapowder);
        addShapelessOreRecipe(ItemRegistry.pumpkinyogurtItem, Blocks.PUMPKIN, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.raspberryjuiceItem, toolJuicer, cropRaspberry);
        addShapelessOreRecipe(ItemRegistry.raspberrypieItem, cropRaspberry, toolBakeware, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.raspberrysmoothieItem, toolJuicer, cropRaspberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.raspberryyogurtItem, cropRaspberry, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.cinnamonsugardonutItem, foodDonut, listAllsugar, foodGroundcinnamon);
        addShapelessOreRecipe(ItemRegistry.melonyogurtItem, Items.MELON, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.kiwijuiceItem, toolJuicer, cropKiwi);
        addShapelessOreRecipe(ItemRegistry.kiwismoothieItem, toolJuicer, cropKiwi, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.kiwiyogurtItem, cropKiwi, foodPlainyogurt);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 4), listAllmilk, Items.LEATHER);
        addShapelessOreRecipe(ItemRegistry.appleyogurtItem, cropApple, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, cropSunflower, foodSalt);
        addShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, cropSunflower, dustSalt);
        addShapelessOreRecipe(ItemRegistry.saltedsunflowerseedsItem, cropSunflower, itemSalt);
        addShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, toolBakeware, cropSunflower, foodFlour, listAllegg, foodSalt, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, toolBakeware, cropSunflower, foodFlour, listAllegg, dustSalt, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.sunflowerwheatrollsItem, toolBakeware, cropSunflower, foodFlour, listAllegg, itemSalt, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.sunflowerbroccolisaladItem, toolCuttingboard, cropSunflower, cropBroccoli, foodMayo, listAllsugar, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.cranberryjuiceItem, toolJuicer, cropCranberry);
        addShapelessOreRecipe(ItemRegistry.cranberrysauceItem, toolPot, cropCranberry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.cranberrybarItem, toolBakeware, cropCranberry, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.peppermintItem, toolSaucepan, cropSpiceleaf, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.cactusfruitjuiceItem, toolJuicer, cropCactusfruit);
        addShapelessOreRecipe(ItemRegistry.blackpepperItem, toolMortarandpestle, cropPeppercorn);
        addShapelessOreRecipe(ItemRegistry.groundcinnamonItem, toolMortarandpestle, cropCinnamon);
        addShapelessOreRecipe(ItemRegistry.groundnutmegItem, toolMortarandpestle, cropNutmeg);
        addShapelessOreRecipe(ItemRegistry.oliveoilItem, toolJuicer, cropOlive);
        addShapelessOreRecipe(ItemRegistry.oliveoilItem, toolJuicer, cropSunflower);
        addShapelessOreRecipe(ItemRegistry.oliveoilItem, toolJuicer, cropWalnut);
        addShapelessOreRecipe(ItemRegistry.baklavaItem, toolBakeware, foodDough, cropWalnut, cropCinnamon, foodButter, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.gummybearsItem, toolSaucepan, listAllsugar, dyeRed, dyeGreen);
        addShapelessOreRecipe(ItemRegistry.baconmushroomburgerItem, foodBaconcheeseburger, listAllmushroom);
        addShapelessOreRecipe(ItemRegistry.baconmushroomburgerItem, foodBaconcheeseburger, cropWhitemushroom);
        addShapelessOreRecipe(ItemRegistry.fruitpunchItem, toolJuicer, listAllfruit, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.meatystewItem, toolPot, listAllmeatraw, foodFlour, foodStock);
        addShapelessOreRecipe(ItemRegistry.mixedsaladItem, toolCuttingboard, listAllveggie, listAllveggie, foodSaladdressing);
        addShapelessOreRecipe(ItemRegistry.pinacoladaItem, toolJuicer, cropCoconut, cropPineapple);
        addShapelessOreRecipe(ItemRegistry.saladdressingItem, toolJuicer, foodOliveoil, foodSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.saladdressingItem, toolJuicer, foodOliveoil, dustSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.saladdressingItem, toolJuicer, foodOliveoil, itemSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.saladdressingItem, toolJuicer, foodMayo, cropSpiceleaf, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.shepardspieItem, toolBakeware, listAllmuttonraw, Items.POTATO, Items.CARROT, foodDough, cropPeas);
        addShapelessOreRecipe(ItemRegistry.eggnogItem, toolJuicer, listAllegg, foodGroundnutmeg, cropCinnamon, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.custardItem, toolSaucepan, listAllegg, foodGroundnutmeg, cropCinnamon, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.sushiItem, toolCuttingboard, listAllfishraw, cropSeaweed, cropRice);
        addShapelessOreRecipe(ItemRegistry.gardensoupItem, toolPot, foodStock, listAllveggie, listAllveggie);

        addShapelessOreRecipe(ItemRegistry.applejellyItem, toolSaucepan, cropApple, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.blackberryjellyItem, toolSaucepan, cropBlackberry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.blueberryjellyItem, toolSaucepan, cropBlueberry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.cherryjellyItem, toolSaucepan, cropCherry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.cranberryjellyItem, toolSaucepan, cropCranberry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.kiwijellyItem, toolSaucepan, cropKiwi, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.lemonjellyItem, toolSaucepan, cropLemon, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.limejellyItem, toolSaucepan, cropLime, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.mangojellyItem, toolSaucepan, cropMango, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.orangejellyItem, toolSaucepan, cropOrange, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.papayajellyItem, toolSaucepan, cropPapaya, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.peachjellyItem, toolSaucepan, cropPeach, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.pomegranatejellyItem, toolSaucepan, cropPomegranate, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.raspberryjellyItem, toolSaucepan, cropRaspberry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.starfruitjellyItem, toolSaucepan, cropStarfruit, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.strawberryjellyItem, toolSaucepan, cropStrawberry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.watermelonjellyItem, toolSaucepan, Items.MELON, Items.MELON, listAllsugar);

        addShapelessOreRecipe(ItemRegistry.applejellysandwichItem, toolCuttingboard, listAllnutbutter, foodApplejelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.blackberryjellysandwichItem, toolCuttingboard, listAllnutbutter, foodBlackberryjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.blueberryjellysandwichItem, toolCuttingboard, listAllnutbutter, foodBlueberryjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.cherryjellysandwichItem, toolCuttingboard, listAllnutbutter, foodCherryjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.cranberryjellysandwichItem, toolCuttingboard, listAllnutbutter, foodCranberryjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.kiwijellysandwichItem, toolCuttingboard, listAllnutbutter, foodKiwijelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.lemonjellysandwichItem, toolCuttingboard, listAllnutbutter, foodLemonjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.limejellysandwichItem, toolCuttingboard, listAllnutbutter, foodLimejelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.mangojellysandwichItem, toolCuttingboard, listAllnutbutter, foodMangojelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.orangejellysandwichItem, toolCuttingboard, listAllnutbutter, foodOrangejelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.papayajellysandwichItem, toolCuttingboard, listAllnutbutter, foodPapayajelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.peachjellysandwichItem, toolCuttingboard, listAllnutbutter, foodPeachjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.pomegranatejellysandwichItem, toolCuttingboard, listAllnutbutter, foodPomegranatejelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.raspberryjellysandwichItem, toolCuttingboard, listAllnutbutter, foodRaspberryjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.starfruitjellysandwichItem, toolCuttingboard, listAllnutbutter, foodStarfruitjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.strawberryjellysandwichItem, toolCuttingboard, listAllnutbutter, foodStrawberryjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.watermelonjellysandwichItem, toolCuttingboard, listAllnutbutter, foodWatermelonjelly, Items.BREAD);

        addShapelessOreRecipe(ItemRegistry.cherrysodaItem, toolPot, foodBubblywater, listAllsugar, foodCherryjuice);
        addShapelessOreRecipe(ItemRegistry.colasodaItem, toolPot, foodBubblywater, listAllsugar, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.gingersodaItem, toolPot, foodBubblywater, listAllsugar, cropGinger);
        addShapelessOreRecipe(ItemRegistry.grapesodaItem, toolPot, foodBubblywater, listAllsugar, foodGrapejuice);
        addShapelessOreRecipe(ItemRegistry.lemonlimesodaItem, toolPot, foodBubblywater, listAllsugar, cropLemon, foodLimejuice);
        addShapelessOreRecipe(ItemRegistry.orangesodaItem, toolPot, foodBubblywater, listAllsugar, foodOrangejuice);
        addShapelessOreRecipe(ItemRegistry.rootbeersodaItem, toolPot, foodBubblywater, listAllsugar, cropEdibleroot);
        addShapelessOreRecipe(ItemRegistry.strawberrysodaItem, toolPot, foodBubblywater, listAllsugar, foodStrawberryjuice);
        addShapelessOreRecipe(ItemRegistry.caramelicecreamItem, toolMixingbowl, listAllicecream, foodCaramel);
        addShapelessOreRecipe(ItemRegistry.mintchocolatechipicemcreamItem, toolMixingbowl, listAllicecream, cropSpiceleaf, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.strawberryicecreamItem, toolMixingbowl, listAllicecream, cropStrawberry);
        addShapelessOreRecipe(ItemRegistry.vanillaicecreamItem, toolMixingbowl, listAllicecream, foodVanilla);
        addShapelessOreRecipe(ItemRegistry.ediblerootItem, toolCuttingboard, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.gingerchickenItem, toolSaucepan, listAllchickenraw, cropGinger, cropScallion, foodHoneydrop);
        addShapelessOreRecipe(ItemRegistry.gingerchickenItem, toolSaucepan, listAllchickenraw, cropGinger, cropScallion, dropHoney);
        addShapelessOreRecipe(ItemRegistry.oldworldveggiesoupItem, toolPot, foodStock, cropOnion, cropPeas, cropBarley);
        addShapelessOreRecipe(ItemRegistry.spicebunItem, toolBakeware, foodFlour, listAllmilk, foodGroundnutmeg, foodGroundcinnamon, foodRaisins);
        addShapelessOreRecipe(ItemRegistry.gingeredrhubarbtartItem, toolBakeware, foodDough, cropRhubarb, cropGinger, listAllsugar, listAllegg);
        addShapelessOreRecipe(ItemRegistry.lambbarleysoupItem, toolPot, foodStock, listAllmuttonraw, cropOnion, Items.CARROT, cropBarley);
        addShapelessOreRecipe(ItemRegistry.honeylemonlambItem, toolBakeware, listAllmuttonraw, cropLemon, foodMustard, foodHoneydrop);
        addShapelessOreRecipe(ItemRegistry.honeylemonlambItem, toolBakeware, listAllmuttonraw, cropLemon, foodMustard, dropHoney);
        addShapelessOreRecipe(ItemRegistry.pumpkinoatsconesItem, toolBakeware, foodFlour, cropOats, Blocks.PUMPKIN, foodButter);
        addShapelessOreRecipe(ItemRegistry.beefjerkyItem, listAllbeefraw, foodSalt);
        addShapelessOreRecipe(ItemRegistry.beefjerkyItem, listAllbeefraw, dustSalt);
        addShapelessOreRecipe(ItemRegistry.beefjerkyItem, listAllbeefraw, itemSalt);
        addShapelessOreRecipe(ItemRegistry.plumjuiceItem, toolJuicer, cropPlum);
        addShapelessOreRecipe(ItemRegistry.pearjuiceItem, toolJuicer, cropPear);
        addShapelessOreRecipe(ItemRegistry.ovenroastedcauliflowerItem, toolBakeware, cropCauliflower, foodOliveoil, cropGarlic, cropLemon);
        addShapelessOreRecipe(ItemRegistry.leekbaconsoupItem, toolPot, cropLeek, listAllporkcooked, Items.POTATO, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.herbbutterparsnipsItem, toolSaucepan, cropParsnip, foodButter, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.scallionbakedpotatoItem, Items.BAKED_POTATO, cropScallion, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.bamboosteamedriceItem, toolPot, cropRice, cropBambooshoot);
        addShapelessOreRecipe(ItemRegistry.sweetpotatosouffleItem, toolBakeware, cropSweetpotato, cropPecan, foodDough, foodButter);
        addShapelessOreRecipe(ItemRegistry.cashewchickenItem, toolSaucepan, listAllchickenraw, cropCashew, cropRice, listAllpepper);
        addShapelessOreRecipe(ItemRegistry.apricotjuiceItem, toolJuicer, cropApricot);
        addShapelessOreRecipe(ItemRegistry.apricotyogurtItem, cropApricot, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.apricotglazedporkItem, listAllporkcooked, foodApricotjelly);
        addShapelessOreRecipe(ItemRegistry.apricotjellyItem, toolSaucepan, cropApricot, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.apricotjellysandwichItem, toolCuttingboard, listAllnutbutter, foodApricotjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.apricotsmoothieItem, toolJuicer, cropApricot, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.figbarItem, toolBakeware, cropFig, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.figjellyItem, toolSaucepan, cropFig, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.figjellysandwichItem, toolCuttingboard, listAllnutbutter, foodFigjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.figsmoothieItem, toolJuicer, cropFig, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.figyogurtItem, cropFig, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.figjuiceItem, toolJuicer, cropFig);
        addShapelessOreRecipe(ItemRegistry.grapefruitjuiceItem, toolJuicer, cropGrapefruit);
        addShapelessOreRecipe(ItemRegistry.grapefruitjellyItem, toolSaucepan, cropGrapefruit, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.grapefruitjellysandwichItem, toolCuttingboard, listAllnutbutter, foodGrapefruitjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.grapefruitsmoothieItem, toolJuicer, cropGrapefruit, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.grapefruityogurtItem, cropGrapefruit, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.grapefruitsodaItem, toolPot, foodBubblywater, listAllsugar, foodGrapefruitjuice);
        addShapelessOreRecipe(ItemRegistry.citrussaladItem, toolCuttingboard, listAllcitrus, cropLettuce);
        addShapelessOreRecipe(ItemRegistry.pecanpieItem, toolBakeware, cropPecan, foodDough, listAllsugar, foodButter);
        addShapelessOreRecipe(ItemRegistry.pralinesItem, toolSaucepan, cropPecan, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.persimmonjuiceItem, toolJuicer, cropPersimmon);
        addShapelessOreRecipe(ItemRegistry.persimmonyogurtItem, cropPersimmon, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.persimmonsmoothieItem, toolJuicer, cropPersimmon, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.persimmonjellyItem, toolSaucepan, cropPersimmon, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.persimmonjellysandwichItem, toolCuttingboard, listAllnutbutter, foodPersimmonjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.pistachiobakedsalmonItem, toolBakeware, cropPistachio, foodSalmonraw);
        addShapelessOreRecipe(ItemRegistry.baconwrappeddatesItem, toolBakeware, cropDate, listAllporkcooked);
        addShapelessOreRecipe(ItemRegistry.datenutbreadItem, toolBakeware, cropDate, foodDough, listAllnut);
        addShapelessOreRecipe(ItemRegistry.maplesyruppancakesItem, foodPancakes, cropMaplesyrup);
        addShapelessOreRecipe(ItemRegistry.maplesyrupwafflesItem, foodWaffles, cropMaplesyrup);
        addShapelessOreRecipe(ItemRegistry.maplesausageItem, listAllbeefraw, cropSpiceleaf, cropMaplesyrup);
        addShapelessOreRecipe(ItemRegistry.mapleoatmealItem, toolMixingbowl, cropOats, cropMaplesyrup);
        addShapelessOreRecipe(ItemRegistry.peachesandcreamoatmealItem, toolMixingbowl, cropOats, cropPeach, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.cinnamonappleoatmealItem, toolMixingbowl, cropOats, foodGroundcinnamon, cropApple);
        addShapelessOreRecipe(ItemRegistry.maplecandiedbaconItem, toolBakeware, listAllporkcooked, cropMaplesyrup);
        addShapelessOreRecipe(ItemRegistry.toastsandwichItem, foodToast, foodToast);
        addShapelessOreRecipe(ItemRegistry.potatoandcheesepirogiItem, toolSkillet, foodDough, cropPotato, foodCheese);
        addShapelessOreRecipe(ItemRegistry.zeppoleItem, toolPot, foodOliveoil, foodDough, foodGroundcinnamon);
        addShapelessOreRecipe(ItemRegistry.sausageinbreadItem, foodMaplesausage, Items.BREAD, foodKetchup, cropOnion);
        addShapelessOreRecipe(ItemRegistry.chocolatecaramelfudgeItem, toolBakeware, foodChocolatebar, foodCaramel);
        addShapelessOreRecipe(ItemRegistry.lavendershortbreadItem, toolBakeware, dyePurple, foodDough);
        addShapelessOreRecipe(ItemRegistry.beefwellingtonItem, listAllbeefraw, foodDough, listAllmushroom, cropSpinach);
        addShapelessOreRecipe(ItemRegistry.epicbaconItem, listAllporkcooked, dyeRed, dyeOrange, dyeYellow, dyeGreen, dyeBlue, dyePurple, dyeMagenta);
        addShapelessOreRecipe(ItemRegistry.manjuuItem, toolMixingbowl, listAllsugar, cropRice, cropBean);
        addShapelessOreRecipe(ItemRegistry.chickengumboItem, toolPot, cropOkra, listAllchickenraw, cropCelery, cropOnion, foodStock, listAllspice, cropBellpepper);
        addShapelessOreRecipe(ItemRegistry.generaltsochickenItem, toolSkillet, listAllchickenraw, cropBroccoli, listAllsugar, foodFlour, cropChilipepper, cropRice);
        addShapelessOreRecipe(ItemRegistry.californiarollItem, toolCuttingboard, listAllfishraw, cropAvocado, cropCucumber, cropSeaweed, cropRice);
        addShapelessOreRecipe(ItemRegistry.futomakiItem, toolCuttingboard, foodBoiledegg, cropCucumber, cropWintersquash, cropRadish, cropSeaweed, cropGinger, cropRice);
        addShapelessOreRecipe(ItemRegistry.beansontoastItem, toolCuttingboard, foodToast, foodButter, foodBakedbeans);
        addShapelessOreRecipe(ItemRegistry.vegemiteItem, toolPot, listAllsugar, cropBarley, listAllwater, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.honeycombchocolatebarItem, toolSaucepan, foodChocolatebar, foodHoneydrop);
        addShapelessOreRecipe(ItemRegistry.cherrycoconutchocolatebarItem, toolSaucepan, foodChocolatebar, cropCherry, foodToastedcoconut);
        addShapelessOreRecipe(ItemRegistry.fairybreadItem, toolBakeware, Items.BREAD, foodButter, dyeRed, dyeGreen, dyeYellow);
        addShapelessOreRecipe(ItemRegistry.lamingtonItem, toolBakeware, foodDough, foodChocolatebar, foodToastedcoconut);
        addShapelessOreRecipe(ItemRegistry.timtamItem, toolBakeware, listAllsugar, foodFlour, listAllmilk, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.meatpieItem, toolBakeware, listAllbeefraw, foodDough, cropOnion, cropGarlic, foodBlackpepper, foodStock);
        addShapelessOreRecipe(ItemRegistry.chikorollItem, toolPot, foodOliveoil, foodDough, listAllchickencooked, cropCarrot, cropCabbage, cropLeek, cropOnion);
        addShapelessOreRecipe(ItemRegistry.damperItem, toolBakeware, foodFlour, listAllmilk, foodSalt, foodButter);
        addShapelessOreRecipe(ItemRegistry.damperItem, toolBakeware, foodFlour, listAllmilk, oreSalt, foodButter);
        addShapelessOreRecipe(ItemRegistry.damperItem, toolBakeware, foodFlour, listAllmilk, dustSalt, foodButter);
        addShapelessOreRecipe(ItemRegistry.damperItem, toolBakeware, foodFlour, listAllmilk, itemSalt, foodButter);
        addShapelessOreRecipe(ItemRegistry.beetburgerItem, toolCuttingboard, listAllbeefcooked, cropBeet, foodFriedegg, listAllporkcooked, cropPineapple, foodToast);
        addShapelessOreRecipe(ItemRegistry.pavlovaItem, toolBakeware, listAllegg, listAllsugar, cropLemon, listAllheavycream, cropStrawberry);
        addShapelessOreRecipe(ItemRegistry.gherkinItem, toolPot, foodVinegar, foodSalt, cropSpiceleaf, cropCucumber);
        addShapelessOreRecipe(ItemRegistry.gherkinItem, toolPot, foodVinegar, oreSalt, cropSpiceleaf, cropCucumber);
        addShapelessOreRecipe(ItemRegistry.gherkinItem, toolPot, foodVinegar, dustSalt, cropSpiceleaf, cropCucumber);
        addShapelessOreRecipe(ItemRegistry.gherkinItem, toolPot, foodVinegar, itemSalt, cropSpiceleaf, cropCucumber);
        addShapelessOreRecipe(ItemRegistry.mcpamItem, toolCuttingboard, listAllbeefcooked, cropLettuce, foodPickles, cropOnion, foodToast, foodSaladdressing);
        addShapelessOreRecipe(ItemRegistry.mcpamItem, toolCuttingboard, listAllbeefcooked, cropLettuce, foodGherkin, cropOnion, foodToast, foodSaladdressing);
        addShapelessOreRecipe(ItemRegistry.ceasarsaladItem, toolMixingbowl, cropLettuce, foodToast, foodCheese, cropGarlic, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.chaoscookieItem, toolBakeware, foodFlour, foodChocolatebar, dyePurple);
        addShapelessOreRecipe(ItemRegistry.chocolatebaconItem, toolSaucepan, listAllporkcooked, foodChocolatebar);
        addShapelessOreRecipe(ItemRegistry.lambkebabItem, toolCuttingboard, listAllmuttoncooked, cropOnion, cropBellpepper, stickWood);
        addShapelessOreRecipe(ItemRegistry.nutellaItem, toolSaucepan, foodChocolatebar, foodGroundnutmeg);
        addShapelessOreRecipe(ItemRegistry.snickersbarItem, toolSaucepan, foodChocolatebar, cropPeanut, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.spinachpieItem, toolBakeware, foodDough, cropSpinach, foodCheese, foodToast);
        addShapelessOreRecipe(ItemRegistry.steamedspinachItem, toolPot, cropSpinach, listAllwater);
        addShapelessOreRecipe(ItemRegistry.vegemiteontoastItem, toolCuttingboard, foodVegemite, foodToast);
        addShapelessOreRecipe(ItemRegistry.holidaycakeItem, toolBakeware, listAllegg, listAllsugar, cropCherry, listAllheavycream, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.appleciderItem, toolPot, cropApple, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.bangersandmashItem, toolSkillet, foodPorksausage, foodMashedpotatoes);
        addShapelessOreRecipe(ItemRegistry.batteredsausageItem, toolPot, foodPorksausage, foodBatter);
        addShapelessOreRecipe(ItemRegistry.batterItem, toolMixingbowl, foodFlour, listAllegg);
        addShapelessOreRecipe(ItemRegistry.chorizoItem, toolCuttingboard, listAllporkcooked, listAllspice, cropGarlic, foodSalt);
        addShapelessOreRecipe(ItemRegistry.chorizoItem, toolCuttingboard, listAllporkcooked, listAllspice, cropGarlic, dustSalt);
        addShapelessOreRecipe(ItemRegistry.chorizoItem, toolCuttingboard, listAllporkcooked, listAllspice, cropGarlic, itemSalt);
        addShapelessOreRecipe(ItemRegistry.coleslawItem, toolMixingbowl, cropCabbage, cropCarrot, foodMayo, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.energydrinkItem, toolPot, foodBubblywater, listAllsugar, Items.REDSTONE);
        addShapelessOreRecipe(ItemRegistry.friedonionsItem, toolPot, cropOnion, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.meatfeastpizzaItem, toolPot, foodPizza, foodPepperoni, foodPorksausage, listAllbeefcooked, Items.COOKED_CHICKEN);
        addShapelessOreRecipe(ItemRegistry.mincepieItem, toolBakeware, listAllbeefcooked, listAllfruit, listAllnut, foodDough, foodButter);
        addShapelessOreRecipe(ItemRegistry.onionhamburgerItem, toolCuttingboard, foodHamburger, foodFriedonions);
        addShapelessOreRecipe(ItemRegistry.pepperoniItem, toolCuttingboard, listAllporkcooked, listAllspice, cropBellpepper, foodSalt);
        addShapelessOreRecipe(ItemRegistry.pepperoniItem, toolCuttingboard, listAllporkcooked, listAllspice, cropBellpepper, dustSalt);
        addShapelessOreRecipe(ItemRegistry.pepperoniItem, toolCuttingboard, listAllporkcooked, listAllspice, cropBellpepper, itemSalt);
        addShapelessOreRecipe(ItemRegistry.pickledonionsItem, toolPot, cropOnion, foodSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.pickledonionsItem, toolPot, cropOnion, dustSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.pickledonionsItem, toolPot, cropOnion, itemSalt, foodVinegar);
        addShapelessOreRecipe(ItemRegistry.porksausageItem, toolCuttingboard, listAllporkcooked, listAllspice, foodSalt);
        addShapelessOreRecipe(ItemRegistry.porksausageItem, toolCuttingboard, listAllporkcooked, listAllspice, dustSalt);
        addShapelessOreRecipe(ItemRegistry.porksausageItem, toolCuttingboard, listAllporkcooked, listAllspice, itemSalt);
        addShapelessOreRecipe(ItemRegistry.raspberrytrifleItem, toolBakeware, cropRaspberry, listAllheavycream, foodVanilla, foodDough);
        addShapelessOreRecipe(ItemRegistry.pumpkincheesecakeItem, Blocks.PUMPKIN, foodCheesecake);
        addShapelessOreRecipe(ItemRegistry.pumpkinmuffinItem, toolBakeware, Blocks.PUMPKIN, foodFlour, listAllegg);
        addShapelessOreRecipe(ItemRegistry.suaderoItem, toolCuttingboard, listAllbeefcooked, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.randomtacoItem, toolCuttingboard, listAllbeefcooked, cropOnion, foodCheese, cropAvocado, listAllspice, foodLimejuice, foodTortilla);
        addShapelessOreRecipe(ItemRegistry.strawberrymilkshakeItem, toolJuicer, listAllmilk, cropStrawberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.chocolatemilkshakeItem, toolJuicer, listAllmilk, foodCocoapowder, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.bananamilkshakeItem, toolJuicer, listAllmilk, cropBanana, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.cornflakesItem, toolMixingbowl, listAllmilk, cropCorn);
        addShapelessOreRecipe(ItemRegistry.coleslawburgerItem, toolCuttingboard, foodHamburger, foodColeslaw);
        addShapelessOreRecipe(ItemRegistry.roastchickenItem, toolBakeware, listAllchickenraw, foodSalt, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.roastpotatoesItem, toolBakeware, cropPotato, foodSalt, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.sundayroastItem, toolBakeware, foodRoastchicken, foodRoastpotatoes, listAllgreenveggie);
        addShapelessOreRecipe(ItemRegistry.bbqpulledporkItem, toolCuttingboard, listAllporkcooked, foodToast, cropTomato, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.lambwithmintsauceItem, toolBakeware, listAllmuttonraw, cropSpiceleaf, foodVinegar, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.steakandchipsItem, toolSkillet, listAllbeefraw, foodFries);
        addShapelessOreRecipe(ItemRegistry.cherryicecreamItem, toolMixingbowl, listAllicecream, cropCherry);
        addShapelessOreRecipe(ItemRegistry.pistachioicecreamItem, toolMixingbowl, listAllicecream, cropPistachio);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.neapolitanicecreamItem, 3), foodChocolateicecream, foodStrawberryicecream, foodVanillaicecream);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.spumoniicecreamItem, 3), foodCherryicecream, foodPistachioicecream, foodVanillaicecream);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.plainyogurtItem, 2), foodPlainyogurt, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.almondbutterItem, toolJuicer, cropAlmond);
        addShapelessOreRecipe(ItemRegistry.cashewbutterItem, toolJuicer, cropCashew);
        addShapelessOreRecipe(ItemRegistry.chestnutbutterItem, toolJuicer, cropChestnut);
        addShapelessOreRecipe(ItemRegistry.cornishpastyItem, toolBakeware, listAllbeefraw, cropPotato, foodDough, cropRutabaga, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.cottagepieItem, toolBakeware, listAllbeefraw, cropPotato, cropCarrot, foodDough, cropPeas);
        addShapelessOreRecipe(ItemRegistry.croissantItem, toolBakeware, foodDough, foodButter, listAllegg);
        addShapelessOreRecipe(ItemRegistry.currypowderItem, toolMortarandpestle, cropCurryleaf);
        addShapelessOreRecipe(ItemRegistry.dimsumItem, toolPot, cropRice, foodDough, cropWaterchestnut, listAllmushroom, listAllmeatraw);
        addShapelessOreRecipe(ItemRegistry.friedpecanokraItem, toolSkillet, cropOkra, cropPecan, foodOliveoil, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.gooseberryjellyItem, toolSaucepan, cropGooseberry, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.gooseberryjellysandwichItem, toolCuttingboard, listAllnutbutter, foodGooseberryjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.gooseberrymilkshakeItem, toolJuicer, listAllmilk, cropGooseberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.gooseberrypieItem, toolBakeware, cropGooseberry, listAllsugar, foodDough);
        addShapelessOreRecipe(ItemRegistry.gooseberrysmoothieItem, toolJuicer, cropGooseberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.gooseberryyogurtItem, cropGooseberry, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.hamsweetpicklesandwichItem, toolCuttingboard, foodSweetpickle, Items.BREAD, listAllporkcooked, foodMayo);
        addShapelessOreRecipe(ItemRegistry.hushpuppiesItem, toolPot, foodCornmeal, listAllegg, cropOnion, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.kimchiItem, toolPot, foodSalt, cropCabbage, cropGarlic, cropGinger, cropRadish, cropScallion, listAllspice, cropSesame);
        addShapelessOreRecipe(ItemRegistry.mochiItem, toolMortarandpestle, cropRice, listAllsugar, listAllwater);
        addShapelessOreRecipe(ItemRegistry.museliItem, toolMixingbowl, listAllgrain, foodRaisins, cropPecan, listAllsugar, listAllmilk);
        addShapelessOreRecipe(ItemRegistry.naanItem, toolSkillet, foodDough, cropOnion, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.okrachipsItem, toolBakeware, cropOkra, foodSalt, cropSpiceleaf);
        addShapelessOreRecipe(ItemRegistry.okracreoleItem, toolSkillet, cropOkra, cropGarlic, cropTomato, cropBellpepper, cropOnion, listAllspice);
        addShapelessOreRecipe(ItemRegistry.pistachiobutterItem, toolJuicer, cropPistachio);
        addShapelessOreRecipe(ItemRegistry.ploughmanslunchItem, toolCuttingboard, Items.BREAD, cropApple, foodCheese, foodSweetpickle, cropOnion, listAllporkcooked, foodBoiledegg);
        addShapelessOreRecipe(ItemRegistry.porklomeinItem, toolPot, listAllporkraw, foodPasta, cropOnion, cropCarrot, cropCabbage, cropGarlic, foodSoysauce);
        addShapelessOreRecipe(ItemRegistry.salmonpattiesItem, toolSkillet, foodSalmonraw, foodToast, listAllegg, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.sausageItem, toolCuttingboard, listAllmeatraw, foodSalt, listAllspice);
        addShapelessOreRecipe(ItemRegistry.sausagerollItem, toolCuttingboard, foodSausage, foodDough, listAllegg);
        addShapelessOreRecipe(ItemRegistry.sesameballItem, toolPot, cropSesame, foodOliveoil, cropBean, listAllsugar, foodFlour);
        addShapelessOreRecipe(ItemRegistry.sesamesnapsItem, toolSkillet, cropSesame, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.shrimpokrahushpuppiesItem, toolPot, foodCornmeal, listAllegg, cropOnion, foodOliveoil, foodShrimpraw, cropOkra);
        addShapelessOreRecipe(ItemRegistry.soysauceItem, toolJuicer, cropSoybean, listAllwater, foodSalt);
        addShapelessOreRecipe(ItemRegistry.sweetpickleItem, toolPot, foodVinegar, foodSalt, cropSpiceleaf, cropCucumber, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.veggiestripsItem, toolBakeware, listAllveggie, listAllveggie, listAllveggie, foodSalt, listAllspice);
        addShapelessOreRecipe(ItemRegistry.vindalooItem, toolSaucepan, listAllmeatraw, foodCurrypowder, foodButter, foodBlackpepper, cropOnion);
        addShapelessOreRecipe(ItemRegistry.applesmoothieItem, toolJuicer, cropApple, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.cheeseontoastItem, toolBakeware, foodToast, foodCheese);
        addShapelessOreRecipe(ItemRegistry.chocolaterollItem, toolBakeware, foodChocolatebar, foodFlour, listAllheavycream);
        addShapelessOreRecipe(ItemRegistry.coconutcreamItem, toolPot, cropCoconut);
        addShapelessOreRecipe(ItemRegistry.coconutsmoothieItem, toolJuicer, cropCoconut, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.crackerItem, toolBakeware, foodFlour, foodOliveoil, foodSalt, listAllwater);
        addShapelessOreRecipe(ItemRegistry.cranberrysmoothieItem, toolJuicer, cropCranberry, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.cranberryyogurtItem, cropCranberry, foodPlainyogurt);
        addShapelessOreRecipe(ItemRegistry.deluxechickencurryItem, toolCuttingboard, foodChickencurry, cropRice, foodNaan, foodMangochutney);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.garammasalaItem, 4), toolMortarandpestle, foodBlackpepper, foodGroundcinnamon, cropSpiceleaf, foodGroundnutmeg);
        addShapelessOreRecipe(ItemRegistry.grapesmoothieItem, toolJuicer, cropGrape, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.gravyItem, foodStock, foodFlour);
        addShapelessOreRecipe(ItemRegistry.honeysandwichItem, toolCuttingboard, listAllnutbutter, ItemRegistry.honeyItem, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.jamrollItem, toolBakeware, foodChocolatebar, foodFlour, foodRaspberryjelly);
        addShapelessOreRecipe(ItemRegistry.mangochutneyItem, toolPot, cropMango, cropSpiceleaf, cropMustard, foodOliveoil);
        addShapelessOreRecipe(ItemRegistry.marzipanItem, toolMortarandpestle, ItemRegistry.honeyItem, cropAlmond);
        addShapelessOreRecipe(ItemRegistry.paneerItem, toolPot, listAllmilk, foodVinegar, foodLemonaide);
        addShapelessOreRecipe(ItemRegistry.paneertikkamasalaItem, toolSaucepan, foodPaneer, foodGarammasala, foodCurrypowder, foodCoconutcream, cropOnion, cropBellpepper, cropTomato, cropGinger);
        addShapelessOreRecipe(ItemRegistry.peaandhamsoupItem, toolPot, cropPeas, listAllporkraw, cropOnion, cropCarrot, cropCelery, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.pearjellyItem, toolSaucepan, cropPear, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.pearjellysandwichItem, toolCuttingboard, listAllnutbutter, foodPearjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.pearsmoothieItem, toolJuicer, cropPear, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.plumjellyItem, toolSaucepan, cropPlum, listAllsugar);
        addShapelessOreRecipe(ItemRegistry.plumjellysandwichItem, toolCuttingboard, listAllnutbutter, foodPlumjelly, Items.BREAD);
        addShapelessOreRecipe(ItemRegistry.plumsmoothieItem, toolJuicer, cropPlum, Items.SNOWBALL);
        addShapelessOreRecipe(ItemRegistry.potatoandleeksoupItem, toolPot, cropPotato, cropLeek, foodStock, listAllheavycream, cropSpiceleaf, foodBlackpepper);
        addShapelessOreRecipe(ItemRegistry.toadintheholeItem, toolBakeware, foodYorkshirepudding, foodSausage);
        addShapelessOreRecipe(ItemRegistry.tunapotatoItem, toolCuttingboard, foodButteredpotato, cropCorn, listAllfishcooked);
        addShapelessOreRecipe(ItemRegistry.yorkshirepuddingItem, toolBakeware, foodFlour, foodSalt, foodStock, listAllegg, listAllmilk);
    }

    private static void registerMarketRecipe() {
        final Item marketRecipeItem;
        switch (config.marketblockrecipeItem) {
            case 1:
                marketRecipeItem = Items.DIAMOND;
                break;
            case 2:
                marketRecipeItem = Items.GOLD_INGOT;
                break;
            case 3:
                marketRecipeItem = Items.GOLD_NUGGET;
                break;
            case 4:
                marketRecipeItem = Items.IRON_INGOT;
                break;
            case 5:
                marketRecipeItem = Items.APPLE;
                break;
            case 0:
            default:
                marketRecipeItem = Items.EMERALD;
        }

        addShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), "XOX", "OEO", "XOX", 'X', "plankWood", 'O', Blocks.WOOL, 'E', marketRecipeItem);
    }

    private static void registerOtherRecipes() {
        // Tools
        addShapedOreRecipe(ItemRegistry.potItem, true, "X@@", " @@", '@', ingotIron, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.skilletItem, true, "@  ", " @ ", "  X", '@', ingotIron, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.saucepanItem, true, "@ ", "X ", '@', ingotIron, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.bakewareItem, true, "@@@", "@ @", "@@@", '@', ingotBrick);
        addShapedOreRecipe(ItemRegistry.cuttingboardItem, true, "@  ", " X ", "  O", '@', ingotIron, 'X', stickWood, 'O', plankWood);
        addShapedOreRecipe(ItemRegistry.mortarandpestleItem, true, "X@X", " X ", '@', stickWood, 'X', stone);
        addShapedOreRecipe(ItemRegistry.mixingbowlItem, true, "X@X", " X ", '@', stickWood, 'X', plankWood);
        addShapedOreRecipe(ItemRegistry.juicerItem, true, "@ ", "X ", '@', stone, 'X', Blocks.STONE_PRESSURE_PLATE);
        //Copper Tools
        addShapedOreRecipe(ItemRegistry.potItem, true, "X@@", " @@", '@', ingotCopper, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.skilletItem, true, "@  ", " @ ", "  X", '@', ingotCopper, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.saucepanItem, true, "@  ", "X  ", '@', ingotCopper, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.cuttingboardItem, true, "@  ", " X ", "  O", '@', ingotCopper, 'X', stickWood, 'O', plankWood);
        //Steel Tools
        addShapedOreRecipe(ItemRegistry.potItem, true, "X@@", " @@", '@', ingotSteel, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.skilletItem, true, "@  ", " @ ", "  X", '@', ingotSteel, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.saucepanItem, true, "@  ", "X  ", '@', ingotSteel, 'X', stickWood);
        addShapedOreRecipe(ItemRegistry.cuttingboardItem, true, "@  ", " X ", "  O", '@', ingotSteel, 'X', stickWood, 'O', plankWood);
        //Nether Brick Bakeware
        addShapedOreRecipe(ItemRegistry.bakewareItem, true, "@@@", "@ @", "@@@", '@', ingotBrickNether);

        //Cotton Seed & Switch Recipes
        addShapelessOreRecipe(new ItemStack(Crop.COTTON.cropBlock(), 2), cropCotton, cropCotton);

        //Woven Cloth Recipes
        addShapelessOreRecipe(new ItemStack(Items.STRING, 2), cropCotton, cropCotton, cropCotton);
        addShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 1), Items.STRING, Items.STRING  );
        addShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 3), materialCloth, materialCloth, materialCloth);
        //Woven Cloth into Wool Recipe
        addShapelessOreRecipe(new ItemStack(Blocks.WOOL, 1, 0), materialCloth, materialCloth);

        //Cotton Armor Recipes
        addShapedOreRecipe(new ItemStack(Items.LEATHER_HELMET, 1), "XXX", "X X", 'X', ItemRegistry.wovencottonItem);
        addShapedOreRecipe(new ItemStack(Items.LEATHER_CHESTPLATE, 1), "X X", "XXX", "XXX", 'X', ItemRegistry.wovencottonItem);
        addShapedOreRecipe(new ItemStack(Items.LEATHER_LEGGINGS, 1), "XXX", "X X", "X X", 'X', ItemRegistry.wovencottonItem);
        addShapedOreRecipe(new ItemStack(Items.LEATHER_BOOTS, 1), "X X", "X X", 'X', ItemRegistry.wovencottonItem);

        addShapelessOreRecipe(Crop.CANDLEBERRY.seed(), Crop.CANDLEBERRY.food());

        // Random Recipes
        addShapelessOreRecipe(new ItemStack(Items.SLIME_BALL, 1), foodJellyfishraw);

        //Pumpkin Lanterns
        addShapelessOreRecipe(new ItemStack(Blocks.LIT_PUMPKIN, 1), GeneralOreRegistry.cropPumpkin, blockTorch);

        //Logs
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 1), new ItemStack(FruitLog.MAPLE.block()));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 3), new ItemStack(FruitLog.PAPERBARK.block()));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 4, 3), new ItemStack(FruitLog.CINNAMON.block()));
    }

    private static void addShapelessOreRecipe(Block result, Object... recipe) {
        addShapelessOreRecipe(new ItemStack(result), recipe);
    }
    private static void addShapelessOreRecipe(Item result, Object... recipe) {
        addShapelessOreRecipe(new ItemStack(result), recipe);
    }

    private static void addShapelessOreRecipe(ItemStack result, Object... recipe) {
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(result, recipe));
    }

    private static void addShapedOreRecipe(Block result, Object... recipe) {
        addShapedOreRecipe(new ItemStack(result), recipe);
    }
    private static void addShapedOreRecipe(Item result, Object... recipe) {
        addShapedOreRecipe(new ItemStack(result), recipe);
    }

    private static void addShapedOreRecipe(ItemStack result, Object... recipe) {
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(result, recipe));
    }
    
    private static void addSmelting(Item input, Item output) {
        GameRegistry.addSmelting(input, new ItemStack(output), 0.1F);
    }

    private static void addSmelting(Block input, Item output) {
        GameRegistry.addSmelting(input, new ItemStack(output), 0.1F);
    }
}
