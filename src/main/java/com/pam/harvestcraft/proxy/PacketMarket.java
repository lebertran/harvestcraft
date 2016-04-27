package com.pam.harvestcraft.proxy;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

public class PacketMarket extends AbstractPacket {
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
    }

    public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
    }

    public void handleClientSide(EntityPlayer player) {
    }

    public void handleServerSide(EntityPlayer player) {
    }
}

