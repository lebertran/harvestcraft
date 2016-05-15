package com.pam.harvestcraft.addons;

import com.pam.harvestcraft.blocks.growables.BlockPamCrop;
import com.pam.harvestcraft.blocks.growables.BlockPamFruit;
import com.pam.harvestcraft.blocks.growables.BlockPamLogFruit;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import mcp.mobius.waila.cbcore.LangUtil;
import net.minecraft.block.BlockBeetroot;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class WailaVanillaHandler implements IWailaDataProvider {
    @Override
    public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) {
        return null;
    }

    @Override
    public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        if (accessor.getBlock() instanceof BlockBeetroot) {
            final String newtip = fixBeetroot(accessor);
            currenttip.clear();
            currenttip.add(newtip);
        }

        return currenttip;
    }

    /**
     * Waila ignores that vanilla beetroot only has stages 0-3. Let's fix that.
     */
    private String fixBeetroot(IWailaDataAccessor accessor) {
        final boolean mature = accessor.getMetadata() >= ((BlockBeetroot) accessor.getBlock()).func_185526_g();

        if (mature) {
            return String.format("%s : %s", LangUtil.translateG("hud.msg.growth"), LangUtil.translateG("hud.msg.mature"));
        } else {
            float matureAge = ((BlockBeetroot) accessor.getBlock()).func_185526_g();

            final float growthValue = (accessor.getMetadata() / matureAge) * 100.0F;
            return String.format("%s : %.0f %%", LangUtil.translateG("hud.msg.growth"), growthValue);
        }
    }

    @Override
    public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        return null;
    }

    @Override
    public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        return currenttip;
    }

    @Override
    public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity te, NBTTagCompound tag, World world, BlockPos pos) {
        if (te != null) {
            te.deserializeNBT(tag);
        }

        return tag;
    }

    @SuppressWarnings("unused")
    public static void callbackRegister(IWailaRegistrar registrar) {
        registrar.registerBodyProvider(new WailaPamHandler(), BlockBeetroot.class);
    }
}
