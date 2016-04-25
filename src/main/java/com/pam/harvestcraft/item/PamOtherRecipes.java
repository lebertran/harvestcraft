package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class PamOtherRecipes {

    @SuppressWarnings("unchecked")
    public static void getRecipes() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, new Object[]{
                "X@@", " @@", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, new Object[]{
                "@  ", " @ ", "  X", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, new Object[]{
                "@ ", "X ", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.bakewareItem, true, new Object[]{
                "@@@", "@ @", "@@@", Character.valueOf('@'), "ingotBrick"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, new Object[]{
                "@  ", " X ", "  O", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood", Character.valueOf('O'), "plankWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.mortarandpestleItem, true, new Object[]{
                "X@X", " X ", Character.valueOf('@'), "stickWood", Character.valueOf('X'), "stone"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.mixingbowlItem, true, new Object[]{
                "X@X", " X ", Character.valueOf('@'), "stickWood", Character.valueOf('X'), "plankWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.juicerItem, true, new Object[]{
                "@ ", "X ", Character.valueOf('@'), "stone", Character.valueOf('X'), Blocks.stone_pressure_plate}));

        //Copper Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, new Object[]{
                "X@@", " @@", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, new Object[]{
                "@  ", " @ ", "  X", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, new Object[]{
                "@  ", "X  ", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, new Object[]{
                "@  ", " X ", "  O", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood", Character.valueOf('O'), "plankWood"}));
        //Steel Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, new Object[]{
                "X@@", " @@", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, new Object[]{
                "@  ", " @ ", "  X", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, new Object[]{
                "@  ", "X  ", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood"}));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, new Object[]{
                "@  ", " X ", "  O", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood", Character.valueOf('O'), "plankWood"}));
        //Nether Brick Bakeware
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.bakewareItem, true, new Object[]{
                "@@@", "@ @", "@@@", Character.valueOf('@'), "ingotBrickNether"}));


        //Cotton Seed & Switch Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cottonseedItem, ItemRegistry.cottonItem));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cottonItem, 2), "cropCotton", "cropCotton"));

        //Woven Cloth Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Items.string, 2), "cropCotton", "cropCotton", "cropCotton"));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 1), Items.string, Items.string));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 3), "materialCloth", "materialCloth", "materialCloth"));
        //Woven Cloth into Wool Recipe
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Blocks.wool, 1, 0), "materialCloth", "materialCloth"));

        //Cotton Armor Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_helmet, 1), "XXX", "X X", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_chestplate, 1), "X X", "XXX", "XXX", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_leggings, 1), "XXX", "X X", "X X", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_boots, 1), "X X", "X X", 'X', ItemRegistry.wovencottonItem));

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.candleberryseedItem, ItemRegistry.candleberryItem));


        //Pumpkin Lanterns
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Blocks.lit_pumpkin, 1), "cropPumpkin", "blockTorch"));

        //Logs
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 1), "L", 'L', new ItemStack(BlockRegistry.pamMaple));
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 3), "L", 'L', new ItemStack(BlockRegistry.pamPaperbark));
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 3), "L", 'L', new ItemStack(BlockRegistry.pamCinnamon));
    }

}