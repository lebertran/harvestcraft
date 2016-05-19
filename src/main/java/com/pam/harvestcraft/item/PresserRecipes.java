package com.pam.harvestcraft.item;

import com.pam.harvestcraft.blocks.CropRegistry;
import com.pam.harvestcraft.blocks.FruitRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;

import java.util.HashMap;
import java.util.Map;

public class PresserRecipes {
    private static final Map<ItemStack, ItemStack[]> pressingList = new HashMap<>();

    static {
        registerItemRecipe(ItemRegistry.waxcombItem, ItemRegistry.beeswaxItem, null);
        registerItemRecipe(ItemRegistry.honeycombItem, ItemRegistry.honeyItem, ItemRegistry.beeswaxItem);
        registerItemRecipe(Items.apple, ItemRegistry.applejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.BLACKBERRY), ItemRegistry.blackberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.BLUEBERRY), ItemRegistry.blueberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.CACTUSFRUIT), ItemRegistry.cactusfruitjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.CHERRY), ItemRegistry.cherryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.CRANBERRY), ItemRegistry.cranberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.GRAPE), ItemRegistry.grapejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.KIWI), ItemRegistry.kiwijuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.LIME), ItemRegistry.limejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.MANGO), ItemRegistry.mangojuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.OLIVE), ItemRegistry.oliveoilItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(ItemRegistry.sunflowerseedsItem, ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.WALNUT), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.ORANGE), ItemRegistry.orangejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.PAPAYA), ItemRegistry.papayajuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.PEACH), ItemRegistry.peachjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.POMEGRANATE), ItemRegistry.pomegranatejuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.STARFRUIT), ItemRegistry.starfruitjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.STRAWBERRY), ItemRegistry.strawberryjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(Items.reeds, Items.sugar, null);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.BEET), Items.sugar, ItemRegistry.veggiebaitItem);
        registerBlockRecipe(Blocks.log, Items.paper, null);
        registerItemRecipe(ItemRegistry.freshwaterItem, ItemRegistry.bubblywaterItem, null);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.SOYBEAN), ItemRegistry.silkentofuItem, null);
        registerItemRecipe(ItemRegistry.silkentofuItem, ItemRegistry.firmtofuItem, ItemRegistry.soymilkItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.PLUM), ItemRegistry.plumjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.PEAR), ItemRegistry.pearjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.APRICOT), ItemRegistry.apricotjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.FIG), ItemRegistry.figjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.GRAPEFRUIT), ItemRegistry.grapefruitjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.PERSIMMON), ItemRegistry.persimmonjuiceItem, ItemRegistry.fruitbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.ALMOND), ItemRegistry.freshmilkItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(CropRegistry.getSeed(CropRegistry.SESAME), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(CropRegistry.getSeed(CropRegistry.GRAPE), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.COCONUT), ItemRegistry.oliveoilItem, ItemRegistry.veggiebaitItem);
        registerItemRecipe(CropRegistry.getSeed(CropRegistry.MUSTARD), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(FruitRegistry.getFood(FruitRegistry.AVOCADO), ItemRegistry.oliveoilItem, ItemRegistry.veggiebaitItem);
        registerItemRecipe(CropRegistry.getSeed(CropRegistry.COTTON), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(Items.pumpkin_seeds, ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
        registerItemRecipe(CropRegistry.getFood(CropRegistry.TEALEAF), ItemRegistry.oliveoilItem, ItemRegistry.grainbaitItem);
    }

    public static void registerItemRecipe(Item input, Item item, Item item2) {
        makeItemStackRecipe(new ItemStack(input, 1, 32767), new ItemStack(item), new ItemStack(item2));
    }

    public static void registerBlockRecipe(Block input, Item item, Item item2) {
        registerItemRecipe(Item.getItemFromBlock(input), item, item2);
    }

    public static void makeItemStackRecipe(ItemStack input, ItemStack itemStack, ItemStack itemStack2) {
        final ItemStack[] itemStacks = new ItemStack[] {itemStack, itemStack2};
        pressingList.put(input, itemStacks);
    }

    public static ItemStack[] getPressingResult(ItemStack stack) {
        for (Map.Entry<ItemStack, ItemStack[]> entry : pressingList.entrySet()) {
            if (isSameItem(stack, entry.getKey())) return entry.getValue();
        }

        FMLLog.bigWarning("No pressing result for result item %s.", stack.getItem().getUnlocalizedName());

        return null;
    }

    private static boolean isSameItem(ItemStack stack, ItemStack stack2) {
        return stack2.getItem() == stack.getItem() && (stack2.getItemDamage() == 32767 || stack2.getItemDamage() == stack.getItemDamage());
    }
}
