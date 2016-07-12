package com.pam.harvestcraft.item.items;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.Reference;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.FMLLog;

import java.util.List;

public class ItemPamPotionFood extends ItemFood {

    public final float saturation;


    public ItemPamPotionFood(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setCreativeTab(HarvestCraft.modTab);
        setAlwaysEdible();

        this.saturation = saturation;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    public ItemPamPotionFood addDefaultSpeedPotionEffect() {
        final Potion potion = Potion.getPotionFromResourceLocation("speed");
        if (potion == null) {
            FMLLog.bigWarning("Could not set potion effect.");
            return this;
        }
        setPotionEffect(new PotionEffect(potion, 60, 0), 1);

        return this;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);

        tooltip.add(Reference.getSaturationText(saturation));
        tooltip.add(Reference.BRIGHT_BLUE + I18n.format("item.desc.potionspeed"));
    }
}
