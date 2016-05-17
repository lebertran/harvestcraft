package com.pam.harvestcraft.blocks.growables;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.List;

public interface PamCropGrowable {
    int getMatureAge();
    boolean isMature(IBlockState state);
    List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune);
}
