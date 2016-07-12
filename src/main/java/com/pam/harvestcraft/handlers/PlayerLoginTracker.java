package com.pam.harvestcraft.handlers;

import com.pam.harvestcraft.config.ConfigSyncMessage;
import com.pam.harvestcraft.proxy.PacketHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class PlayerLoginTracker {

    private static final PlayerLoginTracker INSTANCE = new PlayerLoginTracker();

    public static void register() {
        MinecraftForge.EVENT_BUS.register(INSTANCE);
    }

    @SubscribeEvent
    public void onPlayerLoginEvent(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.player.worldObj.isRemote) {
            PacketHandler.network.sendTo(new ConfigSyncMessage(), (EntityPlayerMP) event.player);
        }
    }
}
