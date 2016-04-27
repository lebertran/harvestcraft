package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentity.TileEntityMarket;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageMarketBrowse implements IMessage, IMessageHandler<MessageMarketBrowse, IMessage> {
    private int itemNum;
    private int x;
    private int y;
    private int z;

    public MessageMarketBrowse() {
    }

    public MessageMarketBrowse(int itemNum, int x, int y, int z) {
        this.itemNum = itemNum;
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void fromBytes(ByteBuf buf) {
        this.itemNum = buf.readInt();
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
    }


    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.itemNum);
        buf.writeInt(this.x);
        buf.writeInt(this.y);
        buf.writeInt(this.z);
    }


    public IMessage onMessage(MessageMarketBrowse message, MessageContext ctx) {
        EntityPlayerMP player = ctx.getServerHandler().playerEntity;

        TileEntity tile_entity = player.worldObj.getTileEntity(new BlockPos(message.x, message.y, message.z));
        if ((tile_entity instanceof TileEntityMarket)) {
            TileEntityMarket tileEntityMarket = (TileEntityMarket) tile_entity;
            tileEntityMarket.setBrowsingInfo(message.itemNum);
        }

        final IBlockState state = player.worldObj.getBlockState(new BlockPos(message.x, message.y, message.z));
        player.worldObj.notifyBlockUpdate(new BlockPos(message.x, message.y, message.z), state, state, 3);
        return null;
    }

}
