package com.pam.harvestcraft.addons;

import net.minecraftforge.fml.common.event.FMLInterModComms;

public class Waila {
    public static void init() {
        FMLInterModComms.sendMessage("Waila", "register", "com.pam.harvestcraft.addons.WailaHandler.callbackRegister");
    }
}
