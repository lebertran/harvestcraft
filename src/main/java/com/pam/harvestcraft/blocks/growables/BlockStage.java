package com.pam.harvestcraft.blocks.growables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class BlockStage extends Block {

    public BlockStage(Material material) {
        super(material);
    }

    public abstract String getStageId(int stage);
}
