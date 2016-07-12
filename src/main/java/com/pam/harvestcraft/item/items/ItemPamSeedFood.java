package com.pam.harvestcraft.item.items;

import com.pam.harvestcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.List;

public class ItemPamSeedFood extends ItemSeedFood {

    public final float saturation;

    private boolean isEdible;

    public ItemPamSeedFood(int healAmount, float saturation, Block crops) {
        super(healAmount, saturation, crops, Blocks.FARMLAND);

        this.saturation = saturation;
    }

    public void setEdible(final boolean edible) {
        this.isEdible = edible;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(final ItemStack itemStackIn, final World worldIn, final EntityPlayer playerIn, final EnumHand hand) {
        if (this.isEdible) {
            return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
        }

        return new ActionResult(EnumActionResult.FAIL, itemStackIn);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);

        tooltip.add(Reference.getSaturationText(saturation));
    }
}
