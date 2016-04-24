package com.pam.harvestcraft.blocks;

import java.util.List;
import java.util.Random;

import com.pam.harvestcraft.harvestcraft;
import com.pam.harvestcraft.item.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockPamCrop extends Block  implements IGrowable, net.minecraftforge.common.IPlantable
{

	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 3);
	
	public BlockPamCrop() 
	{
		super(Material.plants);
		this.setCreativeTab(harvestcraft.modTab);
		this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
		this.setHardness(1.0F);
        this.setStepSound(soundTypeGrass);
        this.disableStats();
		this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, BlockPos pos)
	{
		Block soilBlock = world.getBlockState(pos.down()).getBlock();

		return this.isSuitableSoilBlock(soilBlock);
	}

	@Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		this.validatePosition(world, pos, state);
	}

	public void validatePosition(World world, BlockPos pos, IBlockState state)
	{
		if (!this.canPlaceBlockAt(world, pos))
		{

			world.setBlockToAir(pos);
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
	{
		return null;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean isFullCube()
	{
		return false;
	}

	public boolean isSuitableSoilBlock(Block soilBlock)
	{
		return soilBlock == Blocks.farmland;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	}


	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((Integer) state.getValue(AGE)).intValue();
	}

	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] { AGE });
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        super.updateTick(worldIn, pos, state, rand);

        if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
        {
            int i = ((Integer)state.getValue(AGE)).intValue();

            if (i < 3)
            {
                float f = getGrowthChance(this, worldIn, pos);

                if (rand.nextInt((int)(50.0F / f) + 1) == 0)
                {
                    worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i + 1)), 2);
                }
            }
        }
    }
	
	protected static float getGrowthChance(Block blockIn, World worldIn, BlockPos pos)
    {
        float f = 1.0F;
        BlockPos blockpos = pos.down();

        for (int i = -1; i <= 1; ++i)
        {
            for (int j = -1; j <= 1; ++j)
            {
                float f1 = 0.0F;
                IBlockState iblockstate = worldIn.getBlockState(blockpos.add(i, 0, j));

                if (iblockstate.getBlock().canSustainPlant(worldIn, blockpos.add(i, 0, j), net.minecraft.util.EnumFacing.UP, (net.minecraftforge.common.IPlantable)blockIn))
                {
                    f1 = 1.0F;

                    if (iblockstate.getBlock().isFertile(worldIn, blockpos.add(i, 0, j)))
                    {
                        f1 = 3.0F;
                    }
                }

                if (i != 0 || j != 0)
                {
                    f1 /= 4.0F;
                }

                f += f1;
            }
        }

        BlockPos blockpos1 = pos.north();
        BlockPos blockpos2 = pos.south();
        BlockPos blockpos3 = pos.west();
        BlockPos blockpos4 = pos.east();
        boolean flag = blockIn == worldIn.getBlockState(blockpos3).getBlock() || blockIn == worldIn.getBlockState(blockpos4).getBlock();
        boolean flag1 = blockIn == worldIn.getBlockState(blockpos1).getBlock() || blockIn == worldIn.getBlockState(blockpos2).getBlock();

        if (flag && flag1)
        {
            f /= 2.0F;
        }
        else
        {
            boolean flag2 = blockIn == worldIn.getBlockState(blockpos3.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.south()).getBlock() || blockIn == worldIn.getBlockState(blockpos3.south()).getBlock();

            if (flag2)
            {
                f /= 2.0F;
            }
        }

        return f;
    }
	
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
        return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && worldIn.getBlockState(pos.down()).getBlock().canSustainPlant(worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
    }

	public void grow(World worldIn, BlockPos pos, IBlockState state)
    {
        int i = ((Integer)state.getValue(AGE)).intValue() + MathHelper.getRandomIntegerInRange(worldIn.rand, 2, 5);

        if (i > 3)
        {
            i = 3;
        }

        worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i)), 2);
    }

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	{
		return ((Integer) state.getValue(AGE)).intValue() < 3;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		return true;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	{
		this.grow(worldIn, pos, state);
	}
	

	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if (((Integer) state.getValue(AGE)).intValue() == 3)
		{
			if (worldIn.isRemote)
			{
				return true;
			}
			
			ItemStack savedStack;
			
			Block currentBlock = worldIn.getBlockState(pos).getBlock();
			 
            if(currentBlock == BlockRegistry.pamblackberryCrop){
                savedStack = new ItemStack(ItemRegistry.blackberryItem);
            } else
            if(currentBlock == BlockRegistry.pamblueberryCrop){
                savedStack = new ItemStack(ItemRegistry.blueberryItem);
            } else
            if(currentBlock == BlockRegistry.pamcandleberryCrop){
                savedStack = new ItemStack(ItemRegistry.candleberryItem);
            } else
            if(currentBlock == BlockRegistry.pamraspberryCrop){
                savedStack = new ItemStack(ItemRegistry.raspberryItem);
            } else
            if(currentBlock == BlockRegistry.pamstrawberryCrop){
                savedStack = new ItemStack(ItemRegistry.strawberryItem);
            } else
            if(currentBlock == BlockRegistry.pamcactusfruitCrop){
                savedStack = new ItemStack(ItemRegistry.cactusfruitItem);
            } else
            if(currentBlock == BlockRegistry.pamasparagusCrop){
                savedStack = new ItemStack(ItemRegistry.asparagusItem);
            } else
            if(currentBlock == BlockRegistry.pambarleyCrop){
                savedStack = new ItemStack(ItemRegistry.barleyItem);
            } else
            if(currentBlock == BlockRegistry.pamoatsCrop){
                savedStack = new ItemStack(ItemRegistry.oatsItem);
            } else
            if(currentBlock == BlockRegistry.pamryeCrop){
                savedStack = new ItemStack(ItemRegistry.ryeItem);
            } else
            if(currentBlock == BlockRegistry.pamcornCrop){
                savedStack = new ItemStack(ItemRegistry.cornItem);
            } else
            if(currentBlock == BlockRegistry.pambambooshootCrop){
                savedStack = new ItemStack(ItemRegistry.bambooshootItem);
            } else
            if(currentBlock == BlockRegistry.pamcantaloupeCrop){
                savedStack = new ItemStack(ItemRegistry.cantaloupeItem);
            } else
            if(currentBlock == BlockRegistry.pamcucumberCrop){
                savedStack = new ItemStack(ItemRegistry.cucumberItem);
            } else
            if(currentBlock == BlockRegistry.pamwintersquashCrop){
                savedStack = new ItemStack(ItemRegistry.wintersquashItem);
            } else
            if(currentBlock == BlockRegistry.pamzucchiniCrop){
                savedStack = new ItemStack(ItemRegistry.zucchiniItem);
            } else
            if(currentBlock == BlockRegistry.pambeetCrop){
                savedStack = new ItemStack(ItemRegistry.beetItem);
            } else
            if(currentBlock == BlockRegistry.pamonionCrop){
                savedStack = new ItemStack(ItemRegistry.onionItem);
            } else
            if(currentBlock == BlockRegistry.pamparsnipCrop){
                savedStack = new ItemStack(ItemRegistry.parsnipItem);
            } else
            if(currentBlock == BlockRegistry.pampeanutCrop){
                savedStack = new ItemStack(ItemRegistry.peanutItem);
            } else
            if(currentBlock == BlockRegistry.pamradishCrop){
                savedStack = new ItemStack(ItemRegistry.radishItem);
            } else
            if(currentBlock == BlockRegistry.pamrutabagaCrop){
                savedStack = new ItemStack(ItemRegistry.rutabagaItem);
            } else
            if(currentBlock == BlockRegistry.pamsweetpotatoCrop){
                savedStack = new ItemStack(ItemRegistry.sweetpotatoItem);
            } else
            if(currentBlock == BlockRegistry.pamturnipCrop){
                savedStack = new ItemStack(ItemRegistry.turnipItem);
            } else
            if(currentBlock == BlockRegistry.pamrhubarbCrop){
                savedStack = new ItemStack(ItemRegistry.rhubarbItem);
            } else
            if(currentBlock == BlockRegistry.pamceleryCrop){
                savedStack = new ItemStack(ItemRegistry.celeryItem);
            } else
            if(currentBlock == BlockRegistry.pamgarlicCrop){
                savedStack = new ItemStack(ItemRegistry.garlicItem);
            } else
            if(currentBlock == BlockRegistry.pamgingerCrop){
                savedStack = new ItemStack(ItemRegistry.gingerItem);
            } else
            if(currentBlock == BlockRegistry.pamspiceleafCrop){
                savedStack = new ItemStack(ItemRegistry.spiceleafItem);
            } else
            if(currentBlock == BlockRegistry.pamtealeafCrop){
                savedStack = new ItemStack(ItemRegistry.tealeafItem);
            } else
            if(currentBlock == BlockRegistry.pamcoffeebeanCrop){
                savedStack = new ItemStack(ItemRegistry.coffeebeanItem);
            } else
            if(currentBlock == BlockRegistry.pammustardseedsCrop){
                savedStack = new ItemStack(ItemRegistry.mustardseedsItem);
            } else
            if(currentBlock == BlockRegistry.pambroccoliCrop){
                savedStack = new ItemStack(ItemRegistry.broccoliItem);
            } else
            if(currentBlock == BlockRegistry.pamcauliflowerCrop){
                savedStack = new ItemStack(ItemRegistry.cauliflowerItem);
            } else
            if(currentBlock == BlockRegistry.pamleekCrop){
                savedStack = new ItemStack(ItemRegistry.leekItem);
            } else
            if(currentBlock == BlockRegistry.pamlettuceCrop){
                savedStack = new ItemStack(ItemRegistry.lettuceItem);
            } else
            if(currentBlock == BlockRegistry.pamscallionCrop){
                savedStack = new ItemStack(ItemRegistry.scallionItem);
            } else
            if(currentBlock == BlockRegistry.pamartichokeCrop){
                savedStack = new ItemStack(ItemRegistry.artichokeItem);
            } else
            if(currentBlock == BlockRegistry.pambrusselsproutCrop){
                savedStack = new ItemStack(ItemRegistry.brusselsproutItem);
            } else
            
            if(currentBlock == BlockRegistry.pamcabbageCrop){
                savedStack = new ItemStack(ItemRegistry.cabbageItem);
            } else
            if(currentBlock == BlockRegistry.pamspinachCrop){
                savedStack = new ItemStack(ItemRegistry.spinachItem);
            } else
            if(currentBlock == BlockRegistry.pambeanCrop){
                savedStack = new ItemStack(ItemRegistry.beanItem);
            } else
            if(currentBlock == BlockRegistry.pamsoybeanCrop){
                savedStack = new ItemStack(ItemRegistry.soybeanItem);
            } else
            
            if(currentBlock == BlockRegistry.pambellpepperCrop){
                savedStack = new ItemStack(ItemRegistry.bellpepperItem);
            } else
            if(currentBlock == BlockRegistry.pamchilipepperCrop){
                savedStack = new ItemStack(ItemRegistry.chilipepperItem);
            } else
            if(currentBlock == BlockRegistry.pameggplantCrop){
                savedStack = new ItemStack(ItemRegistry.eggplantItem);
            } else
            if(currentBlock == BlockRegistry.pamokraCrop){
                savedStack = new ItemStack(ItemRegistry.okraItem);
            } else
            if(currentBlock == BlockRegistry.pampeasCrop){
                savedStack = new ItemStack(ItemRegistry.peasItem);
            } else
            
            if(currentBlock == BlockRegistry.pamtomatoCrop){
                savedStack = new ItemStack(ItemRegistry.tomatoItem);
            } else
            if(currentBlock == BlockRegistry.pamcottonCrop){
                savedStack = new ItemStack(ItemRegistry.cottonItem);
            } else
            if(currentBlock == BlockRegistry.pampineappleCrop){
                savedStack = new ItemStack(ItemRegistry.pineappleItem);
            } else
            if(currentBlock == BlockRegistry.pamgrapeCrop){
                savedStack = new ItemStack(ItemRegistry.grapeItem);
            } else
            if(currentBlock == BlockRegistry.pamkiwiCrop){
                savedStack = new ItemStack(ItemRegistry.kiwiItem);
            } else
            if(currentBlock == BlockRegistry.pamcranberryCrop){
                savedStack = new ItemStack(ItemRegistry.cranberryItem);
            } else
            if(currentBlock == BlockRegistry.pamriceCrop){
                savedStack = new ItemStack(ItemRegistry.riceItem);
            } else
            if(currentBlock == BlockRegistry.pamseaweedCrop){
                savedStack = new ItemStack(ItemRegistry.seaweedItem);
            } else
            if(currentBlock == BlockRegistry.pamcurryleafCrop){
                savedStack = new ItemStack(ItemRegistry.curryleafItem);
            } else
            if(currentBlock == BlockRegistry.pamsesameseedsCrop){
                savedStack = new ItemStack(ItemRegistry.sesameseedsItem);
            } else
            if(currentBlock == BlockRegistry.pamwaterchestnutCrop){
                savedStack = new ItemStack(ItemRegistry.waterchestnutItem);
            }
            else
                savedStack = new ItemStack(Items.wheat);
 
            
            worldIn.setBlockState(pos, state.withProperty(AGE, 0), 3);
            EntityItem entityItem = new EntityItem(worldIn, playerIn.posX, playerIn.posY - 1D, playerIn.posZ, savedStack);
			worldIn.spawnEntityInWorld(entityItem);
			entityItem.onCollideWithPlayer(playerIn);
			return true;
		}
		return false;
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		list.add(new ItemStack(itemIn, 1, 0));
		list.add(new ItemStack(itemIn, 1, 3));
	}

	@Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
		return net.minecraftforge.common.EnumPlantType.Crop;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }

	
}
