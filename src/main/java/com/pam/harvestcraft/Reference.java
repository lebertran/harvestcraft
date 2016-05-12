package com.pam.harvestcraft;

/**
 * Strings starting with "PROP:" are replaced by Gradle.
 */
public class Reference {
    public static final String MODID = "PROP:ID";
    public static final String NAME = "PROP:NAME";
    public static final String VERSION = "PROP:VERSION";
    public static final String CLIENT_PROXY_CLASS = "com.pam.harvestcraft.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.pam.harvestcraft.proxy.ServerProxy";

    public static final String LOG_PREFIX = "[" + NAME + "] ";
}