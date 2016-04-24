package com.pam.harvestcraft.worldgen;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class LogFruitTreeGen extends WorldGenAbstractTree
{
	private static final IBlockState field_181653_a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
    private static final IBlockState field_181654_b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
    private final int minTreeHeight;
    private final boolean vinesGrow;
    private final IBlockState metaWood;
    private final IBlockState metaLeaves;
    private final IBlockState fruitType;
 
	public LogFruitTreeGen(boolean p_i46446_1_, int p_i46446_2_, IBlockState p_i46446_3_, IBlockState p_i46446_4_, boolean p_i46446_5_, IBlockState fruittype)
	{
		super(p_i46446_1_);
        this.minTreeHeight = p_i46446_2_;
        this.metaWood = p_i46446_3_;
        this.metaLeaves = p_i46446_4_;
        this.vinesGrow = p_i46446_5_;
        this.fruitType = fruittype;
	}

	public boolean generate(World worldIn, Random rand, BlockPos position)
    {
		int i = rand.nextInt(3) + this.minTreeHeight;
        boolean flag = true;

        if (position.getY() >= 1 && position.getY() + i + 1 <= 256)
        {
            for (int j = position.getY(); j <= position.getY() + 1 + i; ++j)
            {
                int k = 1;

                if (j == position.getY())
                {
                    k = 0;
                }

                if (j >= position.getY() + 1 + i - 2)
                {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for (int l = position.getX() - k; l <= position.getX() + k && flag; ++l)
                {
                    for (int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1)
                    {
                        if (j >= 0 && j < 256)
                        {
                            if (!this.isReplaceable(worldIn,blockpos$mutableblockpos.set(l, j, i1)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = position.down();
                Block block1 = worldIn.getBlockState(down).getBlock();
                boolean isSoil = block1.canSustainPlant(worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.sapling);

                if (isSoil && position.getY() < 256 - i - 1)
                {
                    block1.onPlantGrow(worldIn, down, position);
                    int k2 = 3;
                    int l2 = 0;

                    for (int i3 = position.getY() - k2 + i; i3 <= position.getY() + i; ++i3)
                    {
                        int i4 = i3 - (position.getY() + i);
                        int j1 = l2 + 1 - i4 / 2;

                        for (int k1 = position.getX() - j1; k1 <= position.getX() + j1; ++k1)
                        {
                            int l1 = k1 - position.getX();

                            for (int i2 = position.getZ() - j1; i2 <= position.getZ() + j1; ++i2)
                            {
                                int j2 = i2 - position.getZ();

                                if (Math.abs(l1) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i4 != 0)
                                {
                                    BlockPos blockpos = new BlockPos(k1, i3, i2);
                                    BlockPos blockpos2 = new BlockPos(k1, i3 - 1, i2);
                                    BlockPos blockpos3 = new BlockPos(k1, i3 - 2, i2);
                                    Block block = worldIn.getBlockState(blockpos).getBlock();

                                    if (block.isAir(worldIn, blockpos) || block.isLeaves(worldIn, blockpos) || block.getMaterial() == Material.vine)
                                    {
                                        this.setBlockAndNotifyAdequately(worldIn, blockpos, this.metaLeaves);

                                    }
                                }
                            }
                        }
                    }

                    for (int j3 = 0; j3 < i; ++j3)
                    {
                        BlockPos upN = position.up(j3);
                        Block block2 = worldIn.getBlockState(upN).getBlock();

                        if (block2.isAir(worldIn, upN))
                        {
                        		this.setBlockAndNotifyAdequately(worldIn, position.up(j3), this.fruitType);
                        }
                        if (block2.isLeaves(worldIn, upN))
                        {
                        	this.setBlockAndNotifyAdequately(worldIn, position.up(j3), this.metaWood);
                        }

                    }
                    

                    


                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

   
}

