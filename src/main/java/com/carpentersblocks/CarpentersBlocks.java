package com.carpentersblocks;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * CarpentersBlocks - A utility class that defines the actual {@link net.minecraftforge.fml.common.Mod}
 */
@Mod(modid = CarpentersBlocks.MOD_ID, version = CarpentersBlocks.MOD_VERSION)
public class CarpentersBlocks {

    /**
     * The {@link java.lang.String} containing the ID of this {@link net.minecraftforge.fml.common.Mod}
     */
    public static final String MOD_ID = "CarpentersBlocks";

    /**
     * The {@link java.lang.String} containing the version of this {@link net.minecraftforge.fml.common.Mod}
     */
    public static final String MOD_VERSION = "4.0.0-dev";

    /**
     * The {@link org.apache.logging.log4j.Logger} for this {@link net.minecraftforge.fml.common.Mod}
     */
    public static final Logger LOGGER = LogManager.getLogger("CarpentersBlocks");
}
