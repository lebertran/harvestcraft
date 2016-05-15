package com.pam.harvestcraft.blocks.gardens;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class TropicalGardenBlock extends BlockBaseGarden {
    private final String name = "tropicalgarden";

    public TropicalGardenBlock() {
        super("tropicalGarden");
        BlockRegistry.registerBlock(name, this);
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        final Block soilBlock = worldIn.getBlockState(pos.down()).getBlock();
        return (soilBlock == Blocks.grass || soilBlock == Blocks.dirt) && super.canPlaceBlockAt(worldIn, pos);
    }

    public String getName() {
        return name;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Plains;
    }
}