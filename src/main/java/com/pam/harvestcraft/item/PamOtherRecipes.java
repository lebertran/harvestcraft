package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.pam.harvestcraft.item.GeneralOreRegistry.*;
import static com.pam.harvestcraft.item.PamFoodOreDictionaryRegistry.foodJellyfishraw;
import static com.pam.harvestcraft.HarvestCraft.config;

public class PamOtherRecipes {

    @SuppressWarnings("unchecked")
    public static void getRecipes() {

        // Market recipes
        final Item marketRecipeItem;
        switch (config.marketblockrecipeItem) {
            case 1:
                marketRecipeItem = Items.diamond;
                break;
            case 2:
                marketRecipeItem = Items.gold_ingot;
                break;
            case 3:
                marketRecipeItem = Items.gold_nugget;
                break;
            case 4:
                marketRecipeItem = Items.iron_ingot;
                break;
            case 5:
                marketRecipeItem = Items.apple;
                break;
            case 0:
            default:
                marketRecipeItem = Items.emerald;
        }

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), "XOX", "OEO", "XOX", 'X', "plankWood", 'O', Blocks.wool, 'E', marketRecipeItem));

        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.potItem, true,
                "X@@", " @@", '@', ingotIron, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.skilletItem, true,
                "@  ", " @ ", "  X", '@', ingotIron, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.saucepanItem, true,
                "@ ", "X ", '@', ingotIron, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.bakewareItem, true,
                "@@@", "@ @", "@@@", '@', ingotBrick));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true,
                "@  ", " X ", "  O", '@', ingotIron, 'X', stickWood, 'O', plankWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.mortarandpestleItem, true,
                "X@X", " X ", '@', stickWood, 'X', stone));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.mixingbowlItem, true,
                "X@X", " X ", '@', stickWood, 'X', plankWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.juicerItem, true,
                "@ ", "X ", '@', stone, 'X', Blocks.stone_pressure_plate));

        //Copper Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.potItem, true,
                "X@@", " @@", '@', ingotCopper, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.skilletItem, true,
                "@  ", " @ ", "  X", '@', ingotCopper, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.saucepanItem, true,
                "@  ", "X  ", '@', ingotCopper, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true,
                "@  ", " X ", "  O", '@', ingotCopper, 'X', stickWood, 'O', plankWood));
        //Steel Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.potItem, true,
                "X@@", " @@", '@', ingotSteel, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.skilletItem, true,
                "@  ", " @ ", "  X", '@', ingotSteel, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.saucepanItem, true,
                "@  ", "X  ", '@', ingotSteel, 'X', stickWood));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true,
                "@  ", " X ", "  O", '@', ingotSteel, 'X', stickWood, 'O', plankWood));
        //Nether Brick Bakeware
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemRegistry.bakewareItem, true,
                "@@@", "@ @", "@@@", '@', ingotBrickNether));


        //Cotton Seed & Switch Recipes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(CropRegistry.getCrop(CropRegistry.COTTON), 2), cropCotton, cropCotton));

        //Woven Cloth Recipes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.string, 2), cropCotton, cropCotton, cropCotton));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 1), Items.string, Items.string));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 3), materialCloth, materialCloth, materialCloth));
        //Woven Cloth into Wool Recipe
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.wool, 1, 0), materialCloth, materialCloth));

        //Cotton Armor Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_helmet, 1), "XXX", "X X", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_chestplate, 1), "X X", "XXX", "XXX", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_leggings, 1), "XXX", "X X", "X X", 'X', ItemRegistry.wovencottonItem));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_boots, 1), "X X", "X X", 'X', ItemRegistry.wovencottonItem));

        GameRegistry.addRecipe(new ShapelessOreRecipe(CropRegistry.getSeed(CropRegistry.CANDLEBERRY), CropRegistry.getFood(CropRegistry.CANDLEBERRY)));

        // Random Recipes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.slime_ball, 1), foodJellyfishraw));

        //Pumpkin Lanterns
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.lit_pumpkin, 1), GeneralOreRegistry.cropPumpkin, blockTorch));

        //Logs
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 1), "L", 'L', new ItemStack(FruitRegistry.getFood(FruitRegistry.MAPLE)));
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 3), "L", 'L', new ItemStack(FruitRegistry.getFood(FruitRegistry.PAPERBARK)));
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks, 4, 3), "L", 'L', new ItemStack(FruitRegistry.getFood(FruitRegistry.CINNAMON)));
    }

}