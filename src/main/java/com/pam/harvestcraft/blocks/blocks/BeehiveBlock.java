package com.pam.harvestcraft.blocks.blocks;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BeehiveBlock extends Block {

    public static final String registryName = "beehive";

    public BeehiveBlock() {
        super(Material.WOOD);
        setCreativeTab(HarvestCraft.modTab);
        setSoundType(SoundType.WOOD);

        setHardness(1.0f);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemRegistry.queenbeeItem;
    }
}
