package com.pam.harvestcraft.market.messages;

import com.pam.harvestcraft.market.TileEntityMarket;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageMarketClosed implements IMessage, IMessageHandler<MessageMarketClosed, IMessage> {
    private int x;
    private int y;
    private int z;

    @SuppressWarnings("unused")
    public MessageMarketClosed() {
    }

    @SuppressWarnings("unused")
    public MessageMarketClosed(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void fromBytes(ByteBuf buf) {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
    }


    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.x);
        buf.writeInt(this.y);
        buf.writeInt(this.z);
    }


    public IMessage onMessage(MessageMarketClosed message, MessageContext ctx) {
        EntityPlayerMP player = ctx.getServerHandler().playerEntity;

        TileEntity tile_entity = player.worldObj.getTileEntity(new BlockPos(message.x, message.y, message.z));
        if ((tile_entity instanceof TileEntityMarket)) {
            TileEntityMarket tileEntityMarket = (TileEntityMarket) tile_entity;

            if (tileEntityMarket.getStackInSlot(0) != null) {
                player.entityDropItem(tileEntityMarket.getStackInSlot(0), 1.0F);
                tileEntityMarket.setInventorySlotContents(0, null);
            }
        }


        final IBlockState state = player.worldObj.getBlockState(new BlockPos(message.x, message.y, message.z));
        player.worldObj.notifyBlockUpdate(new BlockPos(message.x, message.y, message.z), state, state, 3);
        return null;
    }
}
