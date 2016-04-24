package com.pam.harvestcraft.blocks;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.*;

/**
 * Created by Matt on 4/8/2016.
 */
public abstract class BlockBaseGarden extends BlockBush {
    public static Map<String, List<ItemStack>> drops = new HashMap<String, List<ItemStack>>();
    private final String type;

    public BlockBaseGarden(String type, Material grass) {
        super(grass);
        this.type = type;
    }

    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        List<ItemStack> newStack = new ArrayList<ItemStack>();
        List<ItemStack> ourDrops = drops.get(type);
        Collections.shuffle(ourDrops);

        // Optimize so we're not calling this every time through the for loop...
        int len = Math.min(BlockRegistry.gardendropAmount, ourDrops.size());

        for (int i = 0; i < len; i++) {
            ItemStack drop = ourDrops.get(i);

            // This should never happen, but check it anyway...
            if(drop == null) {
                System.err.println("Tried to get a null item for garden '" + type + "'.");
                continue;
            }

            // Add it to our drops...
            newStack.add(drop.copy());
        }
        return newStack;
    }

}
