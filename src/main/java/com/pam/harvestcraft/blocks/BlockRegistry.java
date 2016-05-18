package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.blocks.apiary.ApiaryBlock;
import com.pam.harvestcraft.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

public final class BlockRegistry {

    // Market blocks
    public static final String marketItemName = "market";
    public static Block pamMarket;
    public static ItemBlock marketItemBlock;

    // Bee features
    public static BeehiveBlock beehive;
    public static ItemBlock beehiveItemBlock;

    public static ApiaryBlock apiary;
    public static ItemBlock apiaryItemBlock;

    // Garden blocks
    public static final HashMap<String, BlockBaseGarden> gardens = new HashMap<>();
    public static final String aridGarden = "aridGarden";
    public static final String frostGarden = "frostGarden";
    public static final String tropicalGarden = "tropicalGarden";
    public static final String windyGarden = "windyGarden";
    public static final String shadedGarden = "shadedGarden";
    public static final String soggyGarden = "soggyGarden";

    private static boolean initialized = false;

    public static void initBlockRegistry() {
        registerMarket();
        registerBeeFeatures();
        registerGardens();
        initialized = true;
    }

    public static BlockBaseGarden getGarden(String gardenName) {
        if (!initialized) {
            FMLLog.bigWarning("BlockRegistry has not been initialized yet.");
            return null;
        }

        if (!gardens.containsKey(gardenName)) {
            FMLLog.bigWarning("Garden %s is not registered.", gardenName);
            return null;
        }

        return gardens.get(gardenName);
    }

    private static void registerBeeFeatures() {
        beehive = new BeehiveBlock();
        beehiveItemBlock = new ItemBlock(beehive);
        ItemRegistry.items.put(BeehiveBlock.registryName, beehiveItemBlock);
        registerBlock(BeehiveBlock.registryName, beehiveItemBlock, beehive);

        apiary = new ApiaryBlock();
        apiaryItemBlock = new ItemBlock(apiary);
        ItemRegistry.items.put(ApiaryBlock.registryName, apiaryItemBlock);
        registerBlock(ApiaryBlock.registryName, apiaryItemBlock, apiary);
    }

    private static void registerMarket() {
        pamMarket = new BlockPamMarket().setHardness(1.0F).setResistance(1.0F);
        marketItemBlock = new ItemBlock(pamMarket);
        ItemRegistry.items.put(marketItemName, marketItemBlock);

        registerBlock(marketItemName, marketItemBlock, pamMarket);
    }

    private static void registerGardens() {
        addGarden(aridGarden, BlockBaseGarden.Region.DESERT);
        addGarden(frostGarden, BlockBaseGarden.Region.PLAINS);
        addGarden(shadedGarden, BlockBaseGarden.Region.PLAINS);
        addGarden(soggyGarden, BlockBaseGarden.Region.PLAINS);
        addGarden(tropicalGarden, BlockBaseGarden.Region.PLAINS);
        addGarden(windyGarden, BlockBaseGarden.Region.PLAINS);
    }


    private static void addGarden(String gardenName, BlockBaseGarden.Region region) {
        final BlockBaseGarden garden = new BlockBaseGarden(gardenName, region);

        gardens.put(gardenName, garden);
    }

    public static void registerBlock(String registerName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(registerName);
        block.setUnlocalizedName(registerName);

        GameRegistry.register(block);

        itemBlock.setRegistryName(registerName);
        itemBlock.setUnlocalizedName(registerName);
        GameRegistry.register(itemBlock);
    }

    public static void registerBlock(String registerName, Block block) {
        final ItemBlock itemBlock = new ItemBlock(block);
        registerBlock(registerName, itemBlock, block);
    }
}
