package com.pam.harvestcraft.blocks;

import com.pam.harvestcraft.Reference;

public class ResourceHelper {
    public static String getResourcePath(String resource) {
        return (Reference.MODID + ":") + resource;
    }
}
