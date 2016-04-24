package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.Reference;

import net.minecraft.util.ResourceLocation;

public class ResourceHelper
{
	public static ResourceLocation getResource(String name)
	{
		return new ResourceLocation(Reference.MODID, name);
	}

	public static String getResourcePath(String resource)
	{
		return (Reference.MODID + ":") + resource;
	}
}
