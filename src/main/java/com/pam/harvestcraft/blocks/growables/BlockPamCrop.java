package com.pam.harvestcraft.blocks.growables;

import net.minecraft.block.*;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.FMLLog;

import java.util.List;
import java.util.Random;

public class BlockPamCrop extends BlockCrops implements IGrowable, IPlantable, PamGrowable {

    public static final int MATURE_AGE = 3;

    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, MATURE_AGE);

    private static final AxisAlignedBB[] CROPS_AABB = new AxisAlignedBB[]{new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};

    public final String registerName;
    public String BASE_STAGE_ID = null;

    private Item seed;
    private Item food;

    public void setSeed(Item seed) {
        this.seed = seed;
    }

    public void setFood(Item food) {
        this.food = food;
    }

    public BlockPamCrop(String registerName) {
        super();

        this.registerName = registerName;

        this.setDefaultState(blockState.getBaseState().withProperty(getAge(), 0));
    }

    public String getStageId(int stage) {
        if (BASE_STAGE_ID == null) {
            BASE_STAGE_ID = registerName.replaceFirst("pam", "").replace("Crop", "") + "_stage";
        }

        return BASE_STAGE_ID + stage;
    }



    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        // CROPS_AABB is based on an age range from 0 to 7. Times two should fix that issue.
        return CROPS_AABB[state.getValue(getAge()) * 2];
    }

    public boolean isSuitableSoilBlock(Block soilBlock) {
        return soilBlock == Blocks.farmland;
    }

    @Override
    public PropertyInteger getAge() {
        return AGE;
    }

    @Override
    public int getMatureAge() {
        return MATURE_AGE;
    }

    public boolean isMature(IBlockState state) {
        return state.getValue(getAge()) >= MATURE_AGE;
    }

    @Override
    public Item getSeed() {
        if (seed == null) {
            FMLLog.bigWarning("No seed have been set up for %s.", getUnlocalizedName());
            return new Item();
        }

        return seed;
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(getSeed());
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return !isMature(state);
    }

    @Override
    public Item getCrop() {
        if (food == null) {
            FMLLog.bigWarning("No food has been set up for %s.", getUnlocalizedName());
            return new Item();
        }

        return food;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(getAge(), meta);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        this.checkAndDropBlock(worldIn, pos, state);

        if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {
            int currentGrowthLevel = getMetaFromState(state);

            if (currentGrowthLevel < getMatureAge()) {
                float f = getGrowthChance(this, worldIn, pos);

                if (rand.nextInt((int) (50.0F / f) + 1) == 0) {
                    worldIn.setBlockState(pos, this.getStateFromMeta(currentGrowthLevel + 1), 2);
                }
            }
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (!isMature(state)) {
            return getSeed();
        } else {
            return getCrop();
        }
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(getAge());
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        Block soilBlock = world.getBlockState(pos.down()).getBlock();

        return this.isSuitableSoilBlock(soilBlock);
    }

    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
        if (!worldIn.isRemote && !worldIn.restoringBlockSnapshots) {
            final List<ItemStack> items = getDrops(worldIn, pos, state, fortune);
            chance = ForgeEventFactory.fireBlockHarvesting(items, worldIn, pos, state, fortune, chance, false, harvesters.get());

            for (ItemStack item : items) {
                if (worldIn.rand.nextFloat() <= chance) {
                    spawnAsEntity(worldIn, pos, item);
                }
            }
        }
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Crop;
    }

    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, AGE);
    }

    protected int getRandomInt(World world) {
        return MathHelper.getRandomIntegerInRange(world.rand, 1, 3);
    }

    @Override
    public void grow(World worldIn, BlockPos pos, IBlockState state) {
        int newGrowth = getMetaFromState(state) + getRandomInt(worldIn);

        if (newGrowth > MATURE_AGE) {
            newGrowth = MATURE_AGE;
        }

        worldIn.setBlockState(pos, getStateFromMeta(newGrowth), 2);
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        grow(worldIn, pos, state);
    }

    @Override
    public int hashCode() {
        return registerName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof BlockPamCrop && registerName.equals(((BlockPamCrop) obj).registerName));
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {

        final List<ItemStack> ret = new java.util.ArrayList<>();

        final Random rand = world instanceof World ? ((World) world).rand : new Random();

        final int age = getMetaFromState(state);

        final int count = quantityDropped(state, fortune, rand);
        for (int i = 0; i < count; i++) {
            final Item item = this.getItemDropped(state, rand, fortune);
            if (item != null) {
                ret.add(new ItemStack(item, 1, this.damageDropped(state)));
            }
        }

        if (age >= getMatureAge()) {
            for (int i = 0; i < 3 + fortune; ++i) {
                if (rand.nextInt(2 * getMatureAge()) <= age) {
                    ret.add(new ItemStack(getSeed(), 1, 0));
                }
            }
        }

        return ret;
    }

    /**
     * Equivalent methods
     */
    @Override
    public boolean func_185514_i(IBlockState state) {
        return isSuitableSoilBlock(state.getBlock());
    }

    @Override
    public int func_185526_g() {
        return getMatureAge();
    }

    @Override
    public int func_185527_x(IBlockState state) {
        return getMetaFromState(state);
    }

    @Override
    public IBlockState func_185528_e(int p_185528_1_) {
        return getStateFromMeta(p_185528_1_);
    }

    @Override
    public boolean func_185525_y(IBlockState state) {
        return isMature(state);
    }

    @Override
    public int func_185529_b(World worldIn) {
        return getRandomInt(worldIn);
    }
}
