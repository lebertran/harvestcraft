package com.pam.harvestcraft.blocks.gardens;

import com.pam.harvestcraft.blocks.BlockRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class ShadedGardenBlock extends BlockBaseGarden {
    private final String name = "shadedgarden";

    public ShadedGardenBlock() {
        super("shadedGarden", Material.grass);
        BlockRegistry.registerBlock(name, this);
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos).getBlock() == Blocks.grass;
    }

    public String getName() {
        return name;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Plains;
    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}