package com.carpentersblocks.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameData;

/**
 * CarpentersBlocksCreativeTab; An extension of {@link net.minecraft.creativetab.CreativeTabs}
 */
public class CarpentersBlocksCreativeTab extends CreativeTabs {

    /**
     * Creates a new {@link com.carpentersblocks.util.CarpentersBlocksCreativeTab}
     * @param label The {@link java.lang.String} containing the label of this {@link com.carpentersblocks.util.CarpentersBlocksCreativeTab}
     */
    public CarpentersBlocksCreativeTab(String label) {
        super(label);
    }

    /**
     * Gets the {@link net.minecraft.item.Item} used as the tab icon
     *
     * @return The {@link net.minecraft.item.Item}
     */
    @Override
    public Item getTabIconItem() {
        return GameData.getItemRegistry().getRaw("minecraft:obsidian");
    }
}
