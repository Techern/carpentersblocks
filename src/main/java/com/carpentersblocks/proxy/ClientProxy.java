package com.carpentersblocks.proxy;

import com.carpentersblocks.CarpentersBlocks;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * {@link com.carpentersblocks.proxy.ClientProxy} - A proxy that can be used on the server, or in the client - The client, however, also uses {@link com.carpentersblocks.proxy.ClientProxy}
 */
public class ClientProxy extends CommonProxy {

    /**
     * Handles pre-initialization
     *
     * @param event The {@link net.minecraftforge.fml.common.event.FMLPreInitializationEvent}
     */
    @Override
    public void handlePreInitialization(FMLPreInitializationEvent event) {
        super.handlePreInitialization(event);
        CarpentersBlocks.LOGGER.info("Welcome, client!");
    }

}
