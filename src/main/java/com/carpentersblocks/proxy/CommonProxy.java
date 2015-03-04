package com.carpentersblocks.proxy;

import com.carpentersblocks.CarpentersBlocks;
import com.carpentersblocks.util.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * {@link com.carpentersblocks.proxy.CommonProxy} - A proxy that can be used on the server, or in the client - The client, however, also uses {@link com.carpentersblocks.proxy.ClientProxy}
 */
public class CommonProxy {

    /**
     * Handles pre-initialization
     *
     * @param event The {@link net.minecraftforge.fml.common.event.FMLPreInitializationEvent}
     * @param configuration The {@link net.minecraftforge.common.config.Configuration}
     */
    public void handlePreInitialization(FMLPreInitializationEvent event, Configuration configuration) {
        CarpentersBlocks.LOGGER.info("Welcome to Carpenter's Blocks " + CarpentersBlocks.MOD_VERSION + "!");

        BlockRegistry.preInit(event, configuration);
    }

    public void handleInitialization(FMLInitializationEvent event) {
        BlockRegistry.init(event);
    }

    /**
     * Registers inventory models for a specific block
     *
     * @param block The item being referenced
     * @param name The internal name
     * @since 0.0.1
     */
    public void registerInventoryModel(Block block, String name) {
    }

}
