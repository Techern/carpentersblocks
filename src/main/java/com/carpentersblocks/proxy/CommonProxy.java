package com.carpentersblocks.proxy;

import com.carpentersblocks.CarpentersBlocks;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * {@link com.carpentersblocks.proxy.CommonProxy} - A proxy that can be used on the server, or in the client - The client, however, also uses {@link com.carpentersblocks.proxy.ClientProxy}
 */
public class CommonProxy {

    /**
     * Handles pre-initialization
     *
     * @param event The {@link net.minecraftforge.fml.common.event.FMLPreInitializationEvent}
     */
    public void handlePreInitialization(FMLPreInitializationEvent event) {
        CarpentersBlocks.LOGGER.info("Welcome to Carpenter's Blocks " + CarpentersBlocks.MOD_VERSION + "!");
    }

}
