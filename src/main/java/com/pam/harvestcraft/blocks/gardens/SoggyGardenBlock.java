package com.pam.harvestcraft.blocks.gardens;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.FMLLog;

public class SoggyGardenBlock extends BlockBaseGarden {
    private final String name = "soggygarden";

    public SoggyGardenBlock() {
        super("soggyGarden");
        BlockRegistry.registerBlock(name, this);
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        final Block soilBlock = worldIn.getBlockState(pos.down()).getBlock();
        if ((soilBlock == Blocks.grass || soilBlock == Blocks.dirt) && super.canPlaceBlockAt(worldIn, pos)) {
            FMLLog.info("Soil block is %s and current block is %s.",
                    soilBlock.getUnlocalizedName(), worldIn.getBlockState(pos).getBlock());
        }
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