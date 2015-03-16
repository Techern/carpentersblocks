package com.carpentersblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import com.carpentersblocks.proxy.CommonProxy;
import com.carpentersblocks.util.CarpentersBlocksTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.FMLEventChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(
        modid = CarpentersBlocks.MODID,
        name = "Carpenter's Blocks",
        version = CarpentersBlocks.VERSION,
        dependencies = "required-after:Forge@[11.14.1.1334,)"
        )
public class CarpentersBlocks {

    public static final String MODID = "CarpentersBlocks";
    public static final String VERSION = "4.0.0-dev";
    public static FMLEventChannel channel;
    public static CreativeTabs creativeTab = new CarpentersBlocksTab(MODID);

    @Mod.Instance(MODID)
    public static CarpentersBlocks instance;

    @SidedProxy(clientSide = "com.carpentersblocks.proxy.ClientProxy", serverSide = "com.carpentersblocks.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        channel = NetworkRegistry.INSTANCE.newEventDrivenChannel(MODID);
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        proxy.preInit(event, config);

        if (config.hasChanged()) {
            config.save();
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

}
