package com.pam.simplerecipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = simplerecipes.modid, name = "Pam's Simple Recipes", version = simplerecipes.version)
public class simplerecipes
{
  public static final String modid = "simplerecipes";
  public static final String version = "1.8.9a";
  
  public static int saplingstickamount;
  public static int flintamount;
  public static int rottenfleshamount;
  public static int glassamount;
  public static int pumpkinorangedyeamount;
  public static int flowerorangedyeamount;
  public static int bonestickamount;
  public static int metadataofcactustoplank;
  public static int wheatseedsamount;
  
  public static boolean easysaddlerecipe;
  
  
  @SuppressWarnings("rawtypes")
	@EventHandler
	  public void onPreInit(FMLPreInitializationEvent event)
	  {
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try {
			cfg.load();
			saplingstickamount = cfg.get(Configuration.CATEGORY_GENERAL,"saplingstickamount", 1).getInt();
			flintamount = cfg.get(Configuration.CATEGORY_GENERAL,"flintamount", 1).getInt();
			rottenfleshamount = cfg.get(Configuration.CATEGORY_GENERAL,"rottenfleshamount", 1).getInt();
			glassamount = cfg.get(Configuration.CATEGORY_GENERAL,"glassamount", 4).getInt();
			pumpkinorangedyeamount = cfg.get(Configuration.CATEGORY_GENERAL,"pumpkinorangedyeamount", 8).getInt();
			flowerorangedyeamount = cfg.get(Configuration.CATEGORY_GENERAL,"flowerorangedyeamount", 4).getInt();
			bonestickamount = cfg.get(Configuration.CATEGORY_GENERAL,"bonestickamount", 4).getInt();
			metadataofcactustoplank = cfg.get(Configuration.CATEGORY_GENERAL,"metadataofcactustoplank", 0).getInt();
			wheatseedsamount = cfg.get(Configuration.CATEGORY_GENERAL,"wheatseedsamount", 2).getInt();
			easysaddlerecipe = cfg.get(Configuration.CATEGORY_GENERAL, "easysaddlerecipe", false).getBoolean(false);
		} catch (Exception e) {
			FMLLog.severe(modid, "Pam's Simple Recipes has a problem loading it's configuration");
		} finally {
			cfg.save();
		}
	  }
  
  @Mod.EventHandler
  public void load(FMLInitializationEvent event)
  {
	 
	//Saplings to Stick
    GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, saplingstickamount, 0), new Object[] { new ItemStack(Blocks.sapling, 1, OreDictionary.WILDCARD_VALUE) });
    //Gravel to Flint
    GameRegistry.addRecipe(new ItemStack(Items.flint, flintamount), new Object[] { "XX ", "XX ", Character.valueOf('X'), Blocks.gravel });
    //Smelt Rotten Flesh for Leather
    GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather, rottenfleshamount), 0.1F);
    //Smelt Sandstone for Glass
    GameRegistry.addSmelting(Blocks.sandstone, new ItemStack(Blocks.glass, glassamount), 0.1F);
    //Pumpkin or Flowers to Orange Dye
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, pumpkinorangedyeamount, 14), new Object[] { new ItemStack(Blocks.pumpkin, 1, 0), new ItemStack(Blocks.pumpkin, 1, 0) });
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, flowerorangedyeamount, 14), new Object[] { new ItemStack(Blocks.red_flower, 1, 0), new ItemStack(Blocks.yellow_flower, 1, 0) });
    //Bones to Sticks
    GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, bonestickamount, 0), new Object[] { new ItemStack(Items.bone, 1, 0), new ItemStack(Items.bone, 1, 0) });
    //Sandstone to Cobblestone
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 1, 0), new Object[] { new ItemStack(Blocks.sandstone, 1, -1) });
    //Cactus to Planks
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, metadataofcactustoplank), new Object[] { new ItemStack(Blocks.cactus, 1, 0) });
    //Wheat to Seeds
    GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat_seeds, wheatseedsamount, 0), new Object[] { new ItemStack(Items.wheat, 1, 0), new ItemStack(Items.wheat, 1, 0) });
    //Name Tag
    GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag, 1, 0), new Object[] { new ItemStack(Items.feather, 1, 0), new ItemStack(Items.paper, 1, 0), new ItemStack(Items.dye, 1, 0), new ItemStack(Items.string, 1, 0) });
    //Saddle
    if (easysaddlerecipe)
    {
        GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[] { "XXX", "XXX", "Z Z", Character.valueOf('X'), Items.leather, Character.valueOf('Z'), Items.string });
    }
    GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[] { "XXX", "XOX", "Z Z", Character.valueOf('X'), Items.leather, Character.valueOf('O'), Items.diamond, Character.valueOf('Z'), Items.gold_ingot });
    //Horse Armor
    GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_horse_armor, 1, 0), new Object[] { new ItemStack(Blocks.iron_block, 1, 0), new ItemStack(Items.leather, 1, 0), new ItemStack(Items.leather, 1, 0), new ItemStack(Items.leather, 1, 0) });
    GameRegistry.addShapelessRecipe(new ItemStack(Items.golden_horse_armor, 1, 0), new Object[] { new ItemStack(Blocks.gold_block, 1, 0), new ItemStack(Items.leather, 1, 0), new ItemStack(Items.leather, 1, 0), new ItemStack(Items.leather, 1, 0) });
    GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_horse_armor, 1, 0), new Object[] { new ItemStack(Blocks.diamond_block, 1, 0), new ItemStack(Items.leather, 1, 0), new ItemStack(Items.leather, 1, 0), new ItemStack(Items.leather, 1, 0) });
  }
}

