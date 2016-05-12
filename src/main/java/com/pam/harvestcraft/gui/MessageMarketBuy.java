package com.pam.harvestcraft.gui;

import com.pam.harvestcraft.tileentity.TileEntityMarket;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageMarketBuy implements IMessage, IMessageHandler<MessageMarketBuy, IMessage> {
    private int itemNum;
    private int x;
    private int y;
    private int z;
    private boolean shouldClear;

    public MessageMarketBuy() {
    }

    public MessageMarketBuy(int itemNum, int x, int y, int z, boolean shouldClear) {
        this.itemNum = itemNum;
        this.x = x;
        this.y = y;
        this.z = z;
        this.shouldClear = shouldClear;
    }


    public void fromBytes(ByteBuf buf) {
        this.itemNum = buf.readInt();
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.shouldClear = buf.readBoolean();
    }


    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.itemNum);
        buf.writeInt(this.x);
        buf.writeInt(this.y);
        buf.writeInt(this.z);
        buf.writeBoolean(this.shouldClear);
    }


    public IMessage onMessage(MessageMarketBuy message, MessageContext ctx) {
        EntityPlayerMP player = ctx.getServerHandler().playerEntity;

        net.minecraft.tileentity.TileEntity tile_entity = player.worldObj.getTileEntity(new BlockPos(message.x, message.y, message.z));
        if ((tile_entity instanceof TileEntityMarket)) {
            TileEntityMarket tileEntityMarket = (TileEntityMarket) tile_entity;
            MarketData data = MarketItems.getData(message.itemNum);
            int price = data.getPrice();

            if (message.shouldClear) {
                tileEntityMarket.clearInventory();
            } else {
                tileEntityMarket.takeEmeraldFromSlot(price);
            }

            EntityItem var14 = new EntityItem(player.worldObj, player.posX, player.posY + 1.0D, player.posZ, data.getItem().copy());
            player.worldObj.spawnEntityInWorld(var14);
        }
        return null;
    }
}