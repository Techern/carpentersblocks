package com.carpentersblocks.util.registry;

import com.carpentersblocks.CarpentersBlocks;
import com.carpentersblocks.block.BlockCarpentersBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * BlockRegistry; A class used for {@link net.minecraft.block.Block}s
 */
public class BlockRegistry {

    /**
     * The {@link com.carpentersblocks.block.BlockCarpentersBlock} instance
     */
    public static Block blockCarpentersBlock;

    /**
     * The number of {@link com.carpentersblocks.block.BlockCarpentersBlock}s that are given when crafted
     */
    public static int recipeQuantityBlock = 5;

    /**
     * Run pre-initialization routines.
     */
    public static void preInit(FMLPreInitializationEvent event, Configuration config) {
        //TODO load config

        //registerBlocks(); Inventory rendering is broken, moving to init
    }

    /**
     * Sets recipes and assigns block render IDs.
     */
    public static void init(FMLInitializationEvent event) {
        if (event.getSide().equals(Side.CLIENT)) {
            //TODO Set render IDs here
        }

        registerBlocks();
        registerRecipes();

    }

    /**
     * Registers the {@link net.minecraft.block.Block}s
     */
    public static void registerBlocks() {

        blockCarpentersBlock = new BlockCarpentersBlock(Material.wood)
                .setUnlocalizedName("carpentersBlock")
                .setHardness(0.2F)
                .setStepSound(Block.soundTypeWood)
                .setCreativeTab(CarpentersBlocks.CREATIVE_TAB);
        GameRegistry.registerBlock(blockCarpentersBlock, "carpenters_block");
        Blocks.fire.setFireInfo(blockCarpentersBlock, 5, 20);

        CarpentersBlocks.PROXY.registerInventoryModel(blockCarpentersBlock, "carpenters_block");

    }

    /**
     * Registers each {@link net.minecraft.item.crafting.IRecipe}
     */
    public static void registerRecipes() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blockCarpentersBlock, recipeQuantityBlock), "XXX", "XYX", "XXX", 'X', "stickWood", 'Y', "plankWood"));
    }

}
