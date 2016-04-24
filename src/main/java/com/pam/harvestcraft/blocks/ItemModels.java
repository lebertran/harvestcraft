package com.pam.harvestcraft.blocks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemModels 
{
	private static HashMap<Item, ItemModelList> models = new HashMap<Item, ItemModelList>();

	public static void preInit()
	{
		defineItemModels();
		prepareModels();
	}

	public static void init()
	{
		registerModels();
	}
	
	private static void defineItemModels()
	{
		registerItemModels(getItem(BlockRegistry.AridGardenBlock), new ItemModelList("gardens/")
				.add(0, "aridgarden"));
		registerItemModels(getItem(BlockRegistry.FrostGardenBlock), new ItemModelList("gardens/")
				.add(0, "frostgarden"));
		registerItemModels(getItem(BlockRegistry.ShadedGardenBlock), new ItemModelList("gardens/")
				.add(0, "shadedgarden"));
		registerItemModels(getItem(BlockRegistry.SoggyGardenBlock), new ItemModelList("gardens/")
				.add(0, "soggygarden"));
		registerItemModels(getItem(BlockRegistry.TropicalGardenBlock), new ItemModelList("gardens/")
				.add(0, "tropicalgarden"));
		registerItemModels(getItem(BlockRegistry.WindyGardenBlock), new ItemModelList("gardens/")
				.add(0, "windygarden"));
		registerItemModels(getItem(BlockRegistry.pamblackberryCrop), new ItemModelList("crops/")
				.add(0, "blackberry_stage0")
				.add(1, "blackberry_stage1")
				.add(2, "blackberry_stage2")
				.add(3, "blackberry_stage3"));
		registerItemModels(getItem(BlockRegistry.pamblueberryCrop), new ItemModelList("crops/")
				.add(0, "blueberry_stage0")
				.add(1, "blueberry_stage1")
				.add(2, "blueberry_stage2")
				.add(3, "blueberry_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcandleberryCrop), new ItemModelList("crops/")
				.add(0, "candleberry_stage0")
				.add(1, "candleberry_stage1")
				.add(2, "candleberry_stage2")
				.add(3, "candleberry_stage3"));
		registerItemModels(getItem(BlockRegistry.pamraspberryCrop), new ItemModelList("crops/")
				.add(0, "raspberry_stage0")
				.add(1, "raspberry_stage1")
				.add(2, "raspberry_stage2")
				.add(3, "raspberry_stage3"));
		registerItemModels(getItem(BlockRegistry.pamstrawberryCrop), new ItemModelList("crops/")
				.add(0, "strawberry_stage0")
				.add(1, "strawberry_stage1")
				.add(2, "strawberry_stage2")
				.add(3, "strawberry_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcactusfruitCrop), new ItemModelList("crops/")
				.add(0, "cactusfruit_stage0")
				.add(1, "cactusfruit_stage1")
				.add(2, "cactusfruit_stage2")
				.add(3, "cactusfruit_stage3"));
		registerItemModels(getItem(BlockRegistry.pamasparagusCrop), new ItemModelList("crops/")
				.add(0, "asparagus_stage0")
				.add(1, "asparagus_stage1")
				.add(2, "asparagus_stage2")
				.add(3, "asparagus_stage3"));
		registerItemModels(getItem(BlockRegistry.pambarleyCrop), new ItemModelList("crops/")
				.add(0, "barley_stage0")
				.add(1, "barley_stage1")
				.add(2, "barley_stage2")
				.add(3, "barley_stage3"));
		registerItemModels(getItem(BlockRegistry.pamoatsCrop), new ItemModelList("crops/")
				.add(0, "oats_stage0")
				.add(1, "oats_stage1")
				.add(2, "oats_stage2")
				.add(3, "oats_stage3"));
		registerItemModels(getItem(BlockRegistry.pamryeCrop), new ItemModelList("crops/")
				.add(0, "rye_stage0")
				.add(1, "rye_stage1")
				.add(2, "rye_stage2")
				.add(3, "rye_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcornCrop), new ItemModelList("crops/")
				.add(0, "corn_stage0")
				.add(1, "corn_stage1")
				.add(2, "corn_stage2")
				.add(3, "corn_stage3"));
		registerItemModels(getItem(BlockRegistry.pambambooshootCrop), new ItemModelList("crops/")
				.add(0, "bambooshoot_stage0")
				.add(1, "bambooshoot_stage1")
				.add(2, "bambooshoot_stage2")
				.add(3, "bambooshoot_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcantaloupeCrop), new ItemModelList("crops/")
				.add(0, "cantaloupe_stage0")
				.add(1, "cantaloupe_stage1")
				.add(2, "cantaloupe_stage2")
				.add(3, "cantaloupe_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcucumberCrop), new ItemModelList("crops/")
				.add(0, "cucumber_stage0")
				.add(1, "cucumber_stage1")
				.add(2, "cucumber_stage2")
				.add(3, "cucumber_stage3"));
		registerItemModels(getItem(BlockRegistry.pamwintersquashCrop), new ItemModelList("crops/")
				.add(0, "wintersquash_stage0")
				.add(1, "wintersquash_stage1")
				.add(2, "wintersquash_stage2")
				.add(3, "wintersquash_stage3"));
		registerItemModels(getItem(BlockRegistry.pamzucchiniCrop), new ItemModelList("crops/")
				.add(0, "zucchini_stage0")
				.add(1, "zucchini_stage1")
				.add(2, "zucchini_stage2")
				.add(3, "zucchini_stage3"));
		registerItemModels(getItem(BlockRegistry.pambeetCrop), new ItemModelList("crops/")
				.add(0, "beet_stage0")
				.add(1, "beet_stage1")
				.add(2, "beet_stage2")
				.add(3, "beet_stage3"));
		registerItemModels(getItem(BlockRegistry.pamonionCrop), new ItemModelList("crops/")
				.add(0, "onion_stage0")
				.add(1, "onion_stage1")
				.add(2, "onion_stage2")
				.add(3, "onion_stage3"));
		registerItemModels(getItem(BlockRegistry.pamparsnipCrop), new ItemModelList("crops/")
				.add(0, "parsnip_stage0")
				.add(1, "parsnip_stage1")
				.add(2, "parsnip_stage2")
				.add(3, "parsnip_stage3"));
		registerItemModels(getItem(BlockRegistry.pampeanutCrop), new ItemModelList("crops/")
				.add(0, "peanut_stage0")
				.add(1, "peanut_stage1")
				.add(2, "peanut_stage2")
				.add(3, "peanut_stage3"));
		registerItemModels(getItem(BlockRegistry.pamradishCrop), new ItemModelList("crops/")
				.add(0, "radish_stage0")
				.add(1, "radish_stage1")
				.add(2, "radish_stage2")
				.add(3, "radish_stage3"));
		registerItemModels(getItem(BlockRegistry.pamrutabagaCrop), new ItemModelList("crops/")
				.add(0, "rutabaga_stage0")
				.add(1, "rutabaga_stage1")
				.add(2, "rutabaga_stage2")
				.add(3, "rutabaga_stage3"));
		registerItemModels(getItem(BlockRegistry.pamsweetpotatoCrop), new ItemModelList("crops/")
				.add(0, "sweetpotato_stage0")
				.add(1, "sweetpotato_stage1")
				.add(2, "sweetpotato_stage2")
				.add(3, "sweetpotato_stage3"));
		registerItemModels(getItem(BlockRegistry.pamturnipCrop), new ItemModelList("crops/")
				.add(0, "turnip_stage0")
				.add(1, "turnip_stage1")
				.add(2, "turnip_stage2")
				.add(3, "turnip_stage3"));
		registerItemModels(getItem(BlockRegistry.pamrhubarbCrop), new ItemModelList("crops/")
				.add(0, "rhubarb_stage0")
				.add(1, "rhubarb_stage1")
				.add(2, "rhubarb_stage2")
				.add(3, "rhubarb_stage3"));
		registerItemModels(getItem(BlockRegistry.pamceleryCrop), new ItemModelList("crops/")
				.add(0, "celery_stage0")
				.add(1, "celery_stage1")
				.add(2, "celery_stage2")
				.add(3, "celery_stage3"));
		registerItemModels(getItem(BlockRegistry.pamgarlicCrop), new ItemModelList("crops/")
				.add(0, "garlic_stage0")
				.add(1, "garlic_stage1")
				.add(2, "garlic_stage2")
				.add(3, "garlic_stage3"));
		registerItemModels(getItem(BlockRegistry.pamgingerCrop), new ItemModelList("crops/")
				.add(0, "ginger_stage0")
				.add(1, "ginger_stage1")
				.add(2, "ginger_stage2")
				.add(3, "ginger_stage3"));
		registerItemModels(getItem(BlockRegistry.pamspiceleafCrop), new ItemModelList("crops/")
				.add(0, "spiceleaf_stage0")
				.add(1, "spiceleaf_stage1")
				.add(2, "spiceleaf_stage2")
				.add(3, "spiceleaf_stage3"));
		registerItemModels(getItem(BlockRegistry.pamtealeafCrop), new ItemModelList("crops/")
				.add(0, "tealeaf_stage0")
				.add(1, "tealeaf_stage1")
				.add(2, "tealeaf_stage2")
				.add(3, "tealeaf_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcoffeebeanCrop), new ItemModelList("crops/")
				.add(0, "coffeebean_stage0")
				.add(1, "coffeebean_stage1")
				.add(2, "coffeebean_stage2")
				.add(3, "coffeebean_stage3"));
		registerItemModels(getItem(BlockRegistry.pammustardseedsCrop), new ItemModelList("crops/")
				.add(0, "mustardseeds_stage0")
				.add(1, "mustardseeds_stage1")
				.add(2, "mustardseeds_stage2")
				.add(3, "mustardseeds_stage3"));
		registerItemModels(getItem(BlockRegistry.pambroccoliCrop), new ItemModelList("crops/")
				.add(0, "broccoli_stage0")
				.add(1, "broccoli_stage1")
				.add(2, "broccoli_stage2")
				.add(3, "broccoli_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcauliflowerCrop), new ItemModelList("crops/")
				.add(0, "cauliflower_stage0")
				.add(1, "cauliflower_stage1")
				.add(2, "cauliflower_stage2")
				.add(3, "cauliflower_stage3"));
		registerItemModels(getItem(BlockRegistry.pamleekCrop), new ItemModelList("crops/")
				.add(0, "leek_stage0")
				.add(1, "leek_stage1")
				.add(2, "leek_stage2")
				.add(3, "leek_stage3"));
		registerItemModels(getItem(BlockRegistry.pamlettuceCrop), new ItemModelList("crops/")
				.add(0, "lettuce_stage0")
				.add(1, "lettuce_stage1")
				.add(2, "lettuce_stage2")
				.add(3, "lettuce_stage3"));
		registerItemModels(getItem(BlockRegistry.pamscallionCrop), new ItemModelList("crops/")
				.add(0, "scallion_stage0")
				.add(1, "scallion_stage1")
				.add(2, "scallion_stage2")
				.add(3, "scallion_stage3"));
		registerItemModels(getItem(BlockRegistry.pamartichokeCrop), new ItemModelList("crops/")
				.add(0, "artichoke_stage0")
				.add(1, "artichoke_stage1")
				.add(2, "artichoke_stage2")
				.add(3, "artichoke_stage3"));
		registerItemModels(getItem(BlockRegistry.pambrusselsproutCrop), new ItemModelList("crops/")
				.add(0, "brusselsprout_stage0")
				.add(1, "brusselsprout_stage1")
				.add(2, "brusselsprout_stage2")
				.add(3, "brusselsprout_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcabbageCrop), new ItemModelList("crops/")
				.add(0, "cabbage_stage0")
				.add(1, "cabbage_stage1")
				.add(2, "cabbage_stage2")
				.add(3, "cabbage_stage3"));
		registerItemModels(getItem(BlockRegistry.pamspinachCrop), new ItemModelList("crops/")
				.add(0, "spinach_stage0")
				.add(1, "spinach_stage1")
				.add(2, "spinach_stage2")
				.add(3, "spinach_stage3"));
		registerItemModels(getItem(BlockRegistry.pamwhitemushroomCrop), new ItemModelList("crops/")
				.add(0, "whitemushroom_stage0")
				.add(1, "whitemushroom_stage1")
				.add(2, "whitemushroom_stage2")
				.add(3, "whitemushroom_stage3"));
		registerItemModels(getItem(BlockRegistry.pambeanCrop), new ItemModelList("crops/")
				.add(0, "bean_stage0")
				.add(1, "bean_stage1")
				.add(2, "bean_stage2")
				.add(3, "bean_stage3"));
		registerItemModels(getItem(BlockRegistry.pamsoybeanCrop), new ItemModelList("crops/")
				.add(0, "soybean_stage0")
				.add(1, "soybean_stage1")
				.add(2, "soybean_stage2")
				.add(3, "soybean_stage3"));
		registerItemModels(getItem(BlockRegistry.pambellpepperCrop), new ItemModelList("crops/")
				.add(0, "bellpepper_stage0")
				.add(1, "bellpepper_stage1")
				.add(2, "bellpepper_stage2")
				.add(3, "bellpepper_stage3"));
		registerItemModels(getItem(BlockRegistry.pamchilipepperCrop), new ItemModelList("crops/")
				.add(0, "chilipepper_stage0")
				.add(1, "chilipepper_stage1")
				.add(2, "chilipepper_stage2")
				.add(3, "chilipepper_stage3"));
		registerItemModels(getItem(BlockRegistry.pameggplantCrop), new ItemModelList("crops/")
				.add(0, "eggplant_stage0")
				.add(1, "eggplant_stage1")
				.add(2, "eggplant_stage2")
				.add(3, "eggplant_stage3"));
		registerItemModels(getItem(BlockRegistry.pamokraCrop), new ItemModelList("crops/")
				.add(0, "okra_stage0")
				.add(1, "okra_stage1")
				.add(2, "okra_stage2")
				.add(3, "okra_stage3"));
		registerItemModels(getItem(BlockRegistry.pampeasCrop), new ItemModelList("crops/")
				.add(0, "peas_stage0")
				.add(1, "peas_stage1")
				.add(2, "peas_stage2")
				.add(3, "peas_stage3"));
		registerItemModels(getItem(BlockRegistry.pamtomatoCrop), new ItemModelList("crops/")
				.add(0, "tomato_stage0")
				.add(1, "tomato_stage1")
				.add(2, "tomato_stage2")
				.add(3, "tomato_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcottonCrop), new ItemModelList("crops/")
				.add(0, "cotton_stage0")
				.add(1, "cotton_stage1")
				.add(2, "cotton_stage2")
				.add(3, "cotton_stage3"));
		registerItemModels(getItem(BlockRegistry.pampineappleCrop), new ItemModelList("crops/")
				.add(0, "pineapple_stage0")
				.add(1, "pineapple_stage1")
				.add(2, "pineapple_stage2")
				.add(3, "pineapple_stage3"));
		registerItemModels(getItem(BlockRegistry.pamgrapeCrop), new ItemModelList("crops/")
				.add(0, "grape_stage0")
				.add(1, "grape_stage1")
				.add(2, "grape_stage2")
				.add(3, "grape_stage3"));
		registerItemModels(getItem(BlockRegistry.pamkiwiCrop), new ItemModelList("crops/")
				.add(0, "kiwi_stage0")
				.add(1, "kiwi_stage1")
				.add(2, "kiwi_stage2")
				.add(3, "kiwi_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcranberryCrop), new ItemModelList("crops/")
				.add(0, "cranberry_stage0")
				.add(1, "cranberry_stage1")
				.add(2, "cranberry_stage2")
				.add(3, "cranberry_stage3"));
		registerItemModels(getItem(BlockRegistry.pamriceCrop), new ItemModelList("crops/")
				.add(0, "rice_stage0")
				.add(1, "rice_stage1")
				.add(2, "rice_stage2")
				.add(3, "rice_stage3"));
		registerItemModels(getItem(BlockRegistry.pamseaweedCrop), new ItemModelList("crops/")
				.add(0, "seaweed_stage0")
				.add(1, "seaweed_stage1")
				.add(2, "seaweed_stage2")
				.add(3, "seaweed_stage3"));
		registerItemModels(getItem(BlockRegistry.pamcurryleafCrop), new ItemModelList("crops/")
				.add(0, "curryleaf_stage0")
				.add(1, "curryleaf_stage1")
				.add(2, "curryleaf_stage2")
				.add(3, "curryleaf_stage3"));
		registerItemModels(getItem(BlockRegistry.pamsesameseedsCrop), new ItemModelList("crops/")
				.add(0, "sesameseeds_stage0")
				.add(1, "sesameseeds_stage1")
				.add(2, "sesameseeds_stage2")
				.add(3, "sesameseeds_stage3"));
		registerItemModels(getItem(BlockRegistry.pamwaterchestnutCrop), new ItemModelList("crops/")
				.add(0, "waterchestnut_stage0")
				.add(1, "waterchestnut_stage1")
				.add(2, "waterchestnut_stage2")
				.add(3, "waterchestnut_stage3"));
		
		
		registerItemModels(getItem(BlockRegistry.pamApple), new ItemModelList("fruits/")
				.add(0, "apple_stage0")
				.add(1, "apple_stage1")
				.add(2, "apple_stage2"));
		registerItemModels(getItem(BlockRegistry.pamappleSapling), new ItemModelList("saplings/")
				.add(0, "apple_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCinnamon), new ItemModelList("fruits/")
				.add(0, "cinnamon_stage0")
				.add(1, "cinnamon_stage1")
				.add(2, "cinnamon_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcinnamonSapling), new ItemModelList("saplings/")
				.add(0, "cinnamon_sapling"));
		registerItemModels(getItem(BlockRegistry.pamMaple), new ItemModelList("fruits/")
				.add(0, "maple_stage0")
				.add(1, "maple_stage1")
				.add(2, "maple_stage2"));
		registerItemModels(getItem(BlockRegistry.pammapleSapling), new ItemModelList("saplings/")
				.add(0, "maple_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPaperbark), new ItemModelList("fruits/")
				.add(0, "paperbark_stage0")
				.add(1, "paperbark_stage1")
				.add(2, "paperbark_stage2"));
		registerItemModels(getItem(BlockRegistry.pampaperbarkSapling), new ItemModelList("saplings/")
				.add(0, "paperbark_sapling"));
		
		registerItemModels(getItem(BlockRegistry.pamAlmond), new ItemModelList("fruits/")
				.add(0, "almond_stage0")
				.add(1, "almond_stage1")
				.add(2, "almond_stage2"));
		registerItemModels(getItem(BlockRegistry.pamalmondSapling), new ItemModelList("saplings/")
				.add(0, "almond_sapling"));
		registerItemModels(getItem(BlockRegistry.pamApricot), new ItemModelList("fruits/")
				.add(0, "apricot_stage0")
				.add(1, "apricot_stage1")
				.add(2, "apricot_stage2"));
		registerItemModels(getItem(BlockRegistry.pamapricotSapling), new ItemModelList("saplings/")
				.add(0, "apricot_sapling"));
		registerItemModels(getItem(BlockRegistry.pamAvocado), new ItemModelList("fruits/")
				.add(0, "avocado_stage0")
				.add(1, "avocado_stage1")
				.add(2, "avocado_stage2"));
		registerItemModels(getItem(BlockRegistry.pamavocadoSapling), new ItemModelList("saplings/")
				.add(0, "avocado_sapling"));
		registerItemModels(getItem(BlockRegistry.pamBanana), new ItemModelList("fruits/")
				.add(0, "banana_stage0")
				.add(1, "banana_stage1")
				.add(2, "banana_stage2"));
		registerItemModels(getItem(BlockRegistry.pambananaSapling), new ItemModelList("saplings/")
				.add(0, "banana_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCashew), new ItemModelList("fruits/")
				.add(0, "cashew_stage0")
				.add(1, "cashew_stage1")
				.add(2, "cashew_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcashewSapling), new ItemModelList("saplings/")
				.add(0, "cashew_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCherry), new ItemModelList("fruits/")
				.add(0, "cherry_stage0")
				.add(1, "cherry_stage1")
				.add(2, "cherry_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcherrySapling), new ItemModelList("saplings/")
				.add(0, "cherry_sapling"));
		registerItemModels(getItem(BlockRegistry.pamChestnut), new ItemModelList("fruits/")
				.add(0, "chestnut_stage0")
				.add(1, "chestnut_stage1")
				.add(2, "chestnut_stage2"));
		registerItemModels(getItem(BlockRegistry.pamchestnutSapling), new ItemModelList("saplings/")
				.add(0, "chestnut_sapling"));
		registerItemModels(getItem(BlockRegistry.pamCoconut), new ItemModelList("fruits/")
				.add(0, "coconut_stage0")
				.add(1, "coconut_stage1")
				.add(2, "coconut_stage2"));
		registerItemModels(getItem(BlockRegistry.pamcoconutSapling), new ItemModelList("saplings/")
				.add(0, "coconut_sapling"));
		registerItemModels(getItem(BlockRegistry.pamDate), new ItemModelList("fruits/")
				.add(0, "date_stage0")
				.add(1, "date_stage1")
				.add(2, "date_stage2"));
		registerItemModels(getItem(BlockRegistry.pamdateSapling), new ItemModelList("saplings/")
				.add(0, "date_sapling"));
		registerItemModels(getItem(BlockRegistry.pamDragonfruit), new ItemModelList("fruits/")
				.add(0, "dragonfruit_stage0")
				.add(1, "dragonfruit_stage1")
				.add(2, "dragonfruit_stage2"));
		registerItemModels(getItem(BlockRegistry.pamdragonfruitSapling), new ItemModelList("saplings/")
				.add(0, "dragonfruit_sapling"));
		registerItemModels(getItem(BlockRegistry.pamDurian), new ItemModelList("fruits/")
				.add(0, "durian_stage0")
				.add(1, "durian_stage1")
				.add(2, "durian_stage2"));
		registerItemModels(getItem(BlockRegistry.pamdurianSapling), new ItemModelList("saplings/")
				.add(0, "durian_sapling"));
		registerItemModels(getItem(BlockRegistry.pamFig), new ItemModelList("fruits/")
				.add(0, "fig_stage0")
				.add(1, "fig_stage1")
				.add(2, "fig_stage2"));
		registerItemModels(getItem(BlockRegistry.pamfigSapling), new ItemModelList("saplings/")
				.add(0, "fig_sapling"));
		registerItemModels(getItem(BlockRegistry.pamGooseberry), new ItemModelList("fruits/")
				.add(0, "gooseberry_stage0")
				.add(1, "gooseberry_stage1")
				.add(2, "gooseberry_stage2"));
		registerItemModels(getItem(BlockRegistry.pamgooseberrySapling), new ItemModelList("saplings/")
				.add(0, "gooseberry_sapling"));
		registerItemModels(getItem(BlockRegistry.pamGrapefruit), new ItemModelList("fruits/")
				.add(0, "grapefruit_stage0")
				.add(1, "grapefruit_stage1")
				.add(2, "grapefruit_stage2"));
		registerItemModels(getItem(BlockRegistry.pamgrapefruitSapling), new ItemModelList("saplings/")
				.add(0, "grapefruit_sapling"));
		registerItemModels(getItem(BlockRegistry.pamLemon), new ItemModelList("fruits/")
				.add(0, "lemon_stage0")
				.add(1, "lemon_stage1")
				.add(2, "lemon_stage2"));
		registerItemModels(getItem(BlockRegistry.pamlemonSapling), new ItemModelList("saplings/")
				.add(0, "lemon_sapling"));
		registerItemModels(getItem(BlockRegistry.pamLime), new ItemModelList("fruits/")
				.add(0, "lime_stage0")
				.add(1, "lime_stage1")
				.add(2, "lime_stage2"));
		registerItemModels(getItem(BlockRegistry.pamlimeSapling), new ItemModelList("saplings/")
				.add(0, "lime_sapling"));
		registerItemModels(getItem(BlockRegistry.pamMango), new ItemModelList("fruits/")
				.add(0, "mango_stage0")
				.add(1, "mango_stage1")
				.add(2, "mango_stage2"));
		registerItemModels(getItem(BlockRegistry.pammangoSapling), new ItemModelList("saplings/")
				.add(0, "mango_sapling"));
		registerItemModels(getItem(BlockRegistry.pamNutmeg), new ItemModelList("fruits/")
				.add(0, "nutmeg_stage0")
				.add(1, "nutmeg_stage1")
				.add(2, "nutmeg_stage2"));
		registerItemModels(getItem(BlockRegistry.pamnutmegSapling), new ItemModelList("saplings/")
				.add(0, "nutmeg_sapling"));
		registerItemModels(getItem(BlockRegistry.pamOlive), new ItemModelList("fruits/")
				.add(0, "olive_stage0")
				.add(1, "olive_stage1")
				.add(2, "olive_stage2"));
		registerItemModels(getItem(BlockRegistry.pamoliveSapling), new ItemModelList("saplings/")
				.add(0, "olive_sapling"));
		registerItemModels(getItem(BlockRegistry.pamOrange), new ItemModelList("fruits/")
				.add(0, "orange_stage0")
				.add(1, "orange_stage1")
				.add(2, "orange_stage2"));
		registerItemModels(getItem(BlockRegistry.pamorangeSapling), new ItemModelList("saplings/")
				.add(0, "orange_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPapaya), new ItemModelList("fruits/")
				.add(0, "papaya_stage0")
				.add(1, "papaya_stage1")
				.add(2, "papaya_stage2"));
		registerItemModels(getItem(BlockRegistry.pampapayaSapling), new ItemModelList("saplings/")
				.add(0, "papaya_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPeach), new ItemModelList("fruits/")
				.add(0, "peach_stage0")
				.add(1, "peach_stage1")
				.add(2, "peach_stage2"));
		registerItemModels(getItem(BlockRegistry.pampeachSapling), new ItemModelList("saplings/")
				.add(0, "peach_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPear), new ItemModelList("fruits/")
				.add(0, "pear_stage0")
				.add(1, "pear_stage1")
				.add(2, "pear_stage2"));
		registerItemModels(getItem(BlockRegistry.pampearSapling), new ItemModelList("saplings/")
				.add(0, "pear_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPecan), new ItemModelList("fruits/")
				.add(0, "pecan_stage0")
				.add(1, "pecan_stage1")
				.add(2, "pecan_stage2"));
		registerItemModels(getItem(BlockRegistry.pampecanSapling), new ItemModelList("saplings/")
				.add(0, "pecan_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPeppercorn), new ItemModelList("fruits/")
				.add(0, "peppercorn_stage0")
				.add(1, "peppercorn_stage1")
				.add(2, "peppercorn_stage2"));
		registerItemModels(getItem(BlockRegistry.pampeppercornSapling), new ItemModelList("saplings/")
				.add(0, "peppercorn_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPersimmon), new ItemModelList("fruits/")
				.add(0, "persimmon_stage0")
				.add(1, "persimmon_stage1")
				.add(2, "persimmon_stage2"));
		registerItemModels(getItem(BlockRegistry.pampersimmonSapling), new ItemModelList("saplings/")
				.add(0, "persimmon_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPistachio), new ItemModelList("fruits/")
				.add(0, "pistachio_stage0")
				.add(1, "pistachio_stage1")
				.add(2, "pistachio_stage2"));
		registerItemModels(getItem(BlockRegistry.pampistachioSapling), new ItemModelList("saplings/")
				.add(0, "pistachio_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPlum), new ItemModelList("fruits/")
				.add(0, "plum_stage0")
				.add(1, "plum_stage1")
				.add(2, "plum_stage2"));
		registerItemModels(getItem(BlockRegistry.pamplumSapling), new ItemModelList("saplings/")
				.add(0, "plum_sapling"));
		registerItemModels(getItem(BlockRegistry.pamPomegranate), new ItemModelList("fruits/")
				.add(0, "pomegranate_stage0")
				.add(1, "pomegranate_stage1")
				.add(2, "pomegranate_stage2"));
		registerItemModels(getItem(BlockRegistry.pampomegranateSapling), new ItemModelList("saplings/")
				.add(0, "pomegranate_sapling"));
		registerItemModels(getItem(BlockRegistry.pamStarfruit), new ItemModelList("fruits/")
				.add(0, "starfruit_stage0")
				.add(1, "starfruit_stage1")
				.add(2, "starfruit_stage2"));
		registerItemModels(getItem(BlockRegistry.pamstarfruitSapling), new ItemModelList("saplings/")
				.add(0, "starfruit_sapling"));
		registerItemModels(getItem(BlockRegistry.pamVanillabean), new ItemModelList("fruits/")
				.add(0, "vanillabean_stage0")
				.add(1, "vanillabean_stage1")
				.add(2, "vanillabean_stage2"));
		registerItemModels(getItem(BlockRegistry.pamvanillabeanSapling), new ItemModelList("saplings/")
				.add(0, "vanillabean_sapling"));
		registerItemModels(getItem(BlockRegistry.pamWalnut), new ItemModelList("fruits/")
				.add(0, "walnut_stage0")
				.add(1, "walnut_stage1")
				.add(2, "walnut_stage2"));
		registerItemModels(getItem(BlockRegistry.pamwalnutSapling), new ItemModelList("saplings/")
				.add(0, "walnut_sapling"));
	}
	
	private static void registerItemModels(Item item, ItemModelList list)
	{
		models.put(item, list);
	}

	private static void prepareModels()
	{
		for (Map.Entry<Item, ItemModelList> entry : models.entrySet())
		{
			Item item = entry.getKey();

			Collection<String> registrations = entry.getValue().getRegistrations().values();

			for (String registration : registrations)
			{
				ModelBakery.registerItemVariants(item, new ResourceLocation(registration));
			}
		}
	}

	private static void registerModels()
	{
		for (HashMap.Entry<Item, ItemModelList> entry : models.entrySet())
		{
			Item item = entry.getKey();

			HashMap<Integer, String> registrations = entry.getValue().getRegistrations();

			for (Map.Entry<Integer, String> registration : registrations.entrySet())
			{
				int meta = registration.getKey();
				String path = registration.getValue();

				ModelResourceLocation resource = new ModelResourceLocation(path, "inventory");

				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, resource);
			}
		}
	}

	/**
	 * Shorthand utility method for Item.getItemFromBlock(block).
	 */
	private static Item getItem(Block block)
	{
		return Item.getItemFromBlock(block);
	}
}
