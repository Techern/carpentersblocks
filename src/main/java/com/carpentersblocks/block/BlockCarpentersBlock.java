package com.carpentersblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

/**
 * {@link com.carpentersblocks.block.BlockCarpentersBlock}; A block that serves as the foundation of the entire mod
 */
public class BlockCarpentersBlock extends Block { //TODO Change to extend BlockCoverable

    /**
     * Creates a new {@link com.carpentersblocks.block.BlockCarpentersBlock}
     *
     * @param materialIn The {@link net.minecraft.block.material.Material} being used
     */
    public BlockCarpentersBlock(Material materialIn) {
        super(materialIn);
    }

    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
}
