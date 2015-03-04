package com.carpentersblocks.proxy;

import com.carpentersblocks.CarpentersBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * {@link com.carpentersblocks.proxy.ClientProxy} - A proxy that can be used on the server, or in the client - The client, however, also uses {@link com.carpentersblocks.proxy.ClientProxy}
 */
public class ClientProxy extends CommonProxy {

    /**
     * Handles pre-initialization
     *
     * @param event The {@link net.minecraftforge.fml.common.event.FMLPreInitializationEvent}
     * @param configuration The {@link net.minecraftforge.common.config.Configuration}
     */
    @Override
    public void handlePreInitialization(FMLPreInitializationEvent event, Configuration configuration) {
        super.handlePreInitialization(event, configuration);
        CarpentersBlocks.LOGGER.info("Welcome, client!");
    }

    /**
     * Registers inventory models for a specific block
     *
     * @param block The item being referenced
     * @param name The internal name
     */
    @Override
    public void registerInventoryModel(Block block, String name) {
        Item item = GameRegistry.findItem("carpentersblocks", name);

        ModelBakery.addVariantName(
                item,
                "carpentersblocks:" + name);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item,
                0, new ModelResourceLocation("carpentersblocks:" + name, "inventory"));
    }

}
