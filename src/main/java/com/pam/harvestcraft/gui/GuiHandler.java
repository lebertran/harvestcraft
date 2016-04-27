package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentity.TileEntityMarket;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler	implements IGuiHandler
{
  public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
  {
	TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
	switch (ID) {
    case 0: 
    	return new ContainerMarket(player.inventory, (TileEntityMarket)tileEntity);

    }
    
	return null;
  }
  
  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
  {
	TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
	switch (ID) {
    case 0: 
    	return new GuiMarket(player.inventory, (TileEntityMarket)tileEntity);
    }
    
	return null;
  }
}
