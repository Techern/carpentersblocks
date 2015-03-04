package com.carpentersblocks;

import com.carpentersblocks.proxy.CommonProxy;
import com.carpentersblocks.util.CarpentersBlocksCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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

    /**
     * The {@link com.carpentersblocks.proxy.CommonProxy} used by this {@link net.minecraftforge.fml.common.Mod}
     */
    @SidedProxy(serverSide = "com.carpentersblocks.proxy.CommonProxy", clientSide = "com.carpentersblocks.proxy.ClientProxy")
    public static CommonProxy PROXY;

    public static final CreativeTabs CREATIVE_TAB = new CarpentersBlocksCreativeTab(MOD_ID);

    /**
     * Handles the {@link net.minecraftforge.fml.common.event.FMLPreInitializationEvent}
     *
     * @param event The {@link net.minecraftforge.fml.common.event.FMLPreInitializationEvent}
     */
    @Mod.EventHandler
    public void handlePreInitialization(FMLPreInitializationEvent event) {
        Configuration configuration = new Configuration(event.getSuggestedConfigurationFile());
        configuration.load();

        PROXY.handlePreInitialization(event, configuration);

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }


    @Mod.EventHandler
    public void handleInitialization(FMLInitializationEvent event) {
        PROXY.handleInitialization(event);
    }
}
