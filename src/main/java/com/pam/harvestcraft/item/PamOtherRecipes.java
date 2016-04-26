package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.pam.harvestcraft.item.GeneralOreRegistry.*;


public class PamOtherRecipes {

    @SuppressWarnings("unchecked")
    public static void getRecipes() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, 
                "X@@", " @@", '@', ingotIron, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, 
                "@  ", " @ ", "  X", '@', ingotIron, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, 
                "@ ", "X ", '@', ingotIron, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.bakewareItem, true, 
                "@@@", "@ @", "@@@", '@', ingotBrick));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, 
                "@  ", " X ", "  O", '@', ingotIron, 'X', stickWood, 'O', plankWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.mortarandpestleItem, true, 
                "X@X", " X ", '@', stickWood, 'X', stone));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.mixingbowlItem, true, 
                "X@X", " X ", '@', stickWood, 'X', plankWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.juicerItem, true, 
                "@ ", "X ", '@', stone, 'X', Blocks.stone_pressure_plate));

        //Copper Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, 
                "X@@", " @@", '@', ingotCopper, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, 
                "@  ", " @ ", "  X", '@', ingotCopper, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, 
                "@  ", "X  ", '@', ingotCopper, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, 
                "@  ", " X ", "  O", '@', ingotCopper, 'X', stickWood, 'O', plankWood));
        //Steel Tools
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, 
                "X@@", " @@", '@', ingotSteel, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, 
                "@  ", " @ ", "  X", '@', ingotSteel, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, 
                "@  ", "X  ", '@', ingotSteel, 'X', stickWood));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, 
                "@  ", " X ", "  O", '@', ingotSteel, 'X', stickWood, 'O', plankWood));
        //Nether Brick Bakeware
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.bakewareItem, true, 
                "@@@", "@ @", "@@@", '@', ingotBrickNether));


        //Cotton Seed & Switch Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cottonseedItem, ItemRegistry.cottonItem));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cottonItem, 2), cropCotton, cropCotton));

        //Woven Cloth Recipes
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Items.string, 2), cropCotton, cropCotton, cropCotton));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 1), Items.string, Items.string));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 3), materialCloth, materialCloth, materialCloth));
        //Woven Cloth into Wool Recipe
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Blocks.wool, 1, 0), materialCloth, materialCloth));

        //Cotton Armor Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_helmet, 1), "XXX", "X X", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_chestplate, 1), "X X", "XXX", "XXX", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_leggings, 1), "XXX", "X X", "X X", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_boots, 1), "X X", "X X", 'X', ItemRegistry.wovencottonItem));

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.candleberryseedItem, ItemRegistry.candleberryItem));


        //Pumpkin Lanterns
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Blocks.lit_pumpkin, 1), cropPumpkin, blockTorch));

        //Logs
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 1), "L", 'L', new ItemStack(BlockRegistry.pamMaple));
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 3), "L", 'L', new ItemStack(BlockRegistry.pamPaperbark));
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 3), "L", 'L', new ItemStack(BlockRegistry.pamCinnamon));
    }

}