package com.carpentersblocks.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * ICarpentersHammer; An interface that you can implement for your own {@link net.minecraft.item.Item}s
 */
public interface ICarpentersHammer {

    /**
     * Called when this {@link com.carpentersblocks.api.ICarpentersHammer} is used
     *
     * @param world The {@link net.minecraft.world.World} that this {@link com.carpentersblocks.api.ICarpentersHammer} was used in
     * @param entityPlayer The {@link net.minecraft.entity.player.EntityPlayer} that used this {@link com.carpentersblocks.api.ICarpentersHammer}
     */
    public void onHammerUse(World world, EntityPlayer entityPlayer);

    /**
     * Checks to see if the specified {@link net.minecraft.entity.player.EntityPlayer} can use this {@link com.carpentersblocks.api.ICarpentersHammer}
     *
     * @param world The {@link net.minecraft.world.World} that this {@link com.carpentersblocks.api.ICarpentersHammer} was used in
     * @param entityPlayer The {@link net.minecraft.entity.player.EntityPlayer} that used this {@link com.carpentersblocks.api.ICarpentersHammer}
     * @return {@code true} if allowed, otherwise {@code false}
     */
    public boolean canUseHammer(World world, EntityPlayer entityPlayer);

}
