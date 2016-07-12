package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.blocks.growables.BlockPamSapling;
import com.pam.harvestcraft.blocks.growables.BlockStage;
import net.minecraft.item.Item;

public interface IFruit {
    BlockPamSapling sapling();
    Item yield();
    BlockStage block();
    SaplingType type();
}
