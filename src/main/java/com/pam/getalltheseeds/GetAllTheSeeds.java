package com.pam.getalltheseeds;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GetAllTheSeeds.modid,
        name = "Pam's Get all the Seeds!",
        version = GetAllTheSeeds.version)
public class GetAllTheSeeds {
    public static final String modid = "getalltheseeds";
    public static final String version = "1.9a";

    static int pumpkinseedRarity;
    static int melonseedRarity;
    static int carrotRarity;
    static int potatoRarity;
    static int oaksaplingRarity;
    static int birchsaplingRarity;
    static int junglesaplingRarity;
    static int sprucesaplingRarity;
    static int acaciasaplingRarity;
    static int darkoaksaplingRarity;
    static int redmushroomRarity;
    static int brownmushroomRarity;
    static int reedRarity;
    static int cactusRarity;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try {
            cfg.load();
            pumpkinseedRarity = cfg.get("general", "pumpkinseedRarity", 1).getInt();
            melonseedRarity = cfg.get("general", "melonseedRarity", 1).getInt();
            carrotRarity = cfg.get("general", "carrotRarity", 1).getInt();
            potatoRarity = cfg.get("general", "potatoRarity", 1).getInt();
            oaksaplingRarity = cfg.get("general", "oaksaplingRarity", 1).getInt();
            birchsaplingRarity = cfg.get("general", "birchsaplingRarity", 1).getInt();
            junglesaplingRarity = cfg.get("general", "junglesaplingRarity", 1).getInt();
            sprucesaplingRarity = cfg.get("general", "sprucesaplingRarity", 1).getInt();
            acaciasaplingRarity = cfg.get("general", "acaciasaplingRarity", 1).getInt();
            darkoaksaplingRarity = cfg.get("general", "darkoaksaplingRarity", 1).getInt();
            redmushroomRarity = cfg.get("general", "redmushroomRarity", 1).getInt();
            brownmushroomRarity = cfg.get("general", "brownmushroomRarity", 1).getInt();
            reedRarity = cfg.get("general", "reedRarity", 1).getInt();
            cactusRarity = cfg.get("general", "cactusRarity", 1).getInt();
        } catch (Exception e) {
            FMLLog.severe("getalltheseeds", "Pam's GetAllTheSeeds has a problem loading it's configuration");
        } finally {
            cfg.save();
        }
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        MinecraftForge.addGrassSeed(new ItemStack(Items.pumpkin_seeds, 1, 0), pumpkinseedRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Items.melon_seeds, 1, 0), melonseedRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Items.carrot, 1, 0), carrotRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Items.potato, 1, 0), potatoRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.sapling, 1, 0), oaksaplingRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.sapling, 1, 2), birchsaplingRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.sapling, 1, 3), junglesaplingRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.sapling, 1, 1), sprucesaplingRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.sapling, 1, 4), acaciasaplingRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.sapling, 1, 5), darkoaksaplingRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.red_mushroom, 1, 0), redmushroomRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.brown_mushroom, 1, 0), brownmushroomRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Items.reeds, 1, 0), reedRarity);
        MinecraftForge.addGrassSeed(new ItemStack(Blocks.cactus, 1, 0), cactusRarity);

    }
}
