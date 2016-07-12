package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.Crop;
import com.pam.harvestcraft.blocks.Fruit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class PresserRecipes {
    private static final Map<ItemStack, ItemStack[]> pressingList = new HashMap<>();

    static {
        registerItemRecipe(ItemRegistry.waxcombItem, ItemRegistry.beeswaxItem, null);
        registerItemRecipe(ItemRegistry.honeycombItem, ItemRegistry.honeyItem, ItemRegistry.beeswaxItem);
        registerItemRecipe(Items.APPLE, ItemRegistry.applejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Crop.BLACKBERRY.food(), ItemRegistry.blackberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Crop.BLUEBERRY.food(), ItemRegistry.blueberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Crop.CACTUSFRUIT.food(), ItemRegistry.cactusfruitjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.CHERRY.yield(), ItemRegistry.cherryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Crop.CRANBERRY.food(), ItemRegistry.cranberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Crop.GRAPE.food(), ItemRegistry.grapejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Crop.KIWI.food(), ItemRegistry.kiwijuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.LIME.yield(), ItemRegistry.limejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.MANGO.yield(), ItemRegistry.mangojuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.OLIVE.yield(), ItemRegistry.oliveoilItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(ItemRegistry.sunflowerseedsItem, ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Fruit.WALNUT.yield(), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Fruit.ORANGE.yield(), ItemRegistry.orangejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.PAPAYA.yield(), ItemRegistry.papayajuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.PEACH.yield(), ItemRegistry.peachjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.POMEGRANATE.yield(), ItemRegistry.pomegranatejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.STARFRUIT.yield(), ItemRegistry.starfruitjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Crop.STRAWBERRY.food(), ItemRegistry.strawberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Items.REEDS, Items.SUGAR, null);
        registerItemRecipe(Crop.BEET.food(), Items.SUGAR, ItemRegistry.veggiebaitItem);
        registerBlockRecipe(Blocks.LOG, Items.PAPER, null);
        registerBlockRecipe(Blocks.LOG2, Items.PAPER, null);
        registerItemRecipe(ItemRegistry.freshwaterItem, ItemRegistry.bubblywaterItem, null);
        registerItemRecipe(Crop.SOYBEAN.food(), ItemRegistry.silkentofuItem, null);
        registerItemRecipe(ItemRegistry.silkentofuItem, ItemRegistry.firmtofuItem, ItemRegistry.soymilkItem);
        registerItemRecipe(Fruit.PLUM.yield(), ItemRegistry.plumjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.PEAR.yield(), ItemRegistry.pearjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.APRICOT.yield(), ItemRegistry.apricotjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.FIG.yield(), ItemRegistry.figjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.GRAPEFRUIT.yield(), ItemRegistry.grapefruitjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.PERSIMMON.yield(), ItemRegistry.persimmonjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Fruit.ALMOND.yield(), ItemRegistry.freshmilkItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Crop.SESAME.seed(), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Crop.GRAPE.seed(), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Fruit.COCONUT.yield(), ItemRegistry.oliveoilItem, ItemRegistry.veggiebaitItem);
        registerItemRecipe(Crop.MUSTARD.seed(), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Fruit.AVOCADO.yield(), ItemRegistry.oliveoilItem, ItemRegistry.veggiebaitItem);
        registerItemRecipe(Crop.COTTON.seed(), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Items.PUMPKIN_SEEDS, ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Crop.TEALEAF.food(), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
    }

    private static void registerItemRecipe(Item input, Item leftItem, Item rightItem) {
        final ItemStack outputLeft = leftItem != null ? new ItemStack(leftItem) : null;
        final ItemStack outputRight = rightItem != null ? new ItemStack(rightItem) : null;

        makeItemStackRecipe(new ItemStack(input, 1, 32767), outputLeft, outputRight);
    }

    private static void registerBlockRecipe(Block input, Item leftItem, Item rightItem) {
        registerItemRecipe(Item.getItemFromBlock(input), leftItem, rightItem);
    }

    private static void makeItemStackRecipe(ItemStack input, ItemStack outputLeft, ItemStack outputRight) {
        final ItemStack[] outputs = new ItemStack[] {outputLeft, outputRight};
        pressingList.put(input, outputs);
    }

    public static ItemStack[] getPressingResult(ItemStack input) {
        for (Map.Entry<ItemStack, ItemStack[]> entry : pressingList.entrySet()) {
            if (isSameItem(input, entry.getKey())) return entry.getValue();
        }

        return null;
    }

    private static boolean isSameItem(ItemStack stack, ItemStack stack2) {
        return stack2.getItem() == stack.getItem() && (stack2.getItemDamage() == 32767 || stack2.getItemDamage() == stack.getItemDamage());
    }
}
