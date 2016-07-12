package com.pam.harvestcraft.proxy;

import com.pam.harvestcraft.Reference;
import com.pam.harvestcraft.config.ConfigSyncMessage;
import com.pam.harvestcraft.tileentities.MessageMarketBrowse;
import com.pam.harvestcraft.tileentities.MessageMarketBuy;
import com.pam.harvestcraft.tileentities.MessageMarketClosed;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;


public class PacketHandler  {
    public static final SimpleNetworkWrapper network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);

    public static void init() {
        network.registerMessage(MessageMarketBrowse.class, MessageMarketBrowse.class, 0, Side.SERVER);
        network.registerMessage(MessageMarketBuy.class, MessageMarketBuy.class, 1, Side.SERVER);
        network.registerMessage(MessageMarketClosed.class, MessageMarketClosed.class, 2, Side.SERVER);
        network.registerMessage(ConfigSyncMessage.class, ConfigSyncMessage.class, 3, Side.SERVER);
    }
}
