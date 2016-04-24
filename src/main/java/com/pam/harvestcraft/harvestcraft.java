package com.pam.harvestcraft;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.item.FishRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import com.pam.harvestcraft.item.ItemRenderRegister;
import com.pam.harvestcraft.item.PamCropSeedDropRegistry;
import com.pam.harvestcraft.item.PamFoodOreDictionaryRegistry;
import com.pam.harvestcraft.item.PamFoodRecipes;
import com.pam.harvestcraft.item.PamOtherOreDictionaryRegistry;
import com.pam.harvestcraft.item.PamOtherRecipes;
import com.pam.harvestcraft.item.PamSquidDrops;
import com.pam.harvestcraft.proxy.CommonProxy;
import com.pam.harvestcraft.worldgen.BushWorldWorldGen;
import com.pam.harvestcraft.worldgen.FruitTreeWorldGen;
import com.pam.harvestcraft.worldgen.LogFruitTreeWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class harvestcraft {

	@Instance(Reference.MODID)
	public static harvestcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs modTab = new CreativeTabs(Reference.MODID)
	{
		public Item getTabIconItem()
		{
			return Items.wheat;
		}
	};

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.instance.load(event);
    	this.proxy.preInit(event);
        Config.instance.configureGardenDrops();

        PamFoodRecipes.getRecipes();
        PamOtherRecipes.getRecipes();
        PamFoodOreDictionaryRegistry.getRegistry();
        PamOtherOreDictionaryRegistry.getRegistry();
        PamCropSeedDropRegistry.getSeedDrops();
        FishRegistry.registerItems();
        if (ItemRegistry.squiddropCalamari)
        {
        MinecraftForge.EVENT_BUS.register(new PamSquidDrops());
        }

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        this.proxy.init(event);
        GameRegistry.registerWorldGenerator(new BushWorldWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new FruitTreeWorldGen(), 0);
        GameRegistry.registerWorldGenerator(new LogFruitTreeWorldGen(), 0);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        this.proxy.postInit(event);
    }
}