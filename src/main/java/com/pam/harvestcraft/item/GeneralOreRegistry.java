package com.pam.harvestcraft.item;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GeneralOreRegistry {
    // Forge
    public static final String stickWood = "stickWood";
    public static final String ingotIron = "ingotIron";
    public static final String plankWood = "plankWood";
    public static final String ingotBrick = "ingotBrick";
    public static final String stone = "stone";
    public static final String ingotBrickNether = "ingotBrickNether";

    // Dye
    public static final ItemStack dyeRed = new ItemStack(Items.dye, 1, 1);
    public static final ItemStack dyeGreen = new ItemStack(Items.dye, 1, 2);
    public static final ItemStack dyeBrown = new ItemStack(Items.dye, 1,3);
    public static final ItemStack dyePurple = new ItemStack(Items.dye, 1, 5);
    public static final ItemStack dyeBlue = new ItemStack(Items.dye, 1, 6); // Cyan
    public static final ItemStack dyeYellow = new ItemStack(Items.dye, 1, 11);
    public static final ItemStack dyeMagenta = new ItemStack(Items.dye, 1, 13);
    public static final ItemStack dyeOrange = new ItemStack(Items.dye, 1, 14);

    // Non-forge
    public static final String ingotCopper = "ingotCopper";
    public static final String ingotSteel = "ingotSteel";
    public static final String cropCotton = "cropCotton";
    public static final String materialCloth = "materialCloth";
    public static final String cropPumpkin = "cropPumpkin";
    public static final String blockTorch = "blockTorch";
}

