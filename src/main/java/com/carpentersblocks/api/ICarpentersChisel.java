package com.carpentersblocks.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * ICarpentersChisel; An interface that you can implement for your own {@link net.minecraft.item.Item}s
 */
public interface ICarpentersChisel {

    /**
     * Called when this {@link com.carpentersblocks.api.ICarpentersChisel} is used
     *
     * @param world The {@link net.minecraft.world.World} that this {@link com.carpentersblocks.api.ICarpentersChisel} was used in
     * @param entityPlayer The {@link net.minecraft.entity.player.EntityPlayer} that used this {@link com.carpentersblocks.api.ICarpentersChisel}
     */
    public void onChiselUse(World world, EntityPlayer entityPlayer);

    /**
     * Checks to see if the specified {@link net.minecraft.entity.player.EntityPlayer} can use this {@link com.carpentersblocks.api.ICarpentersChisel}
     *
     * @param world The {@link net.minecraft.world.World} that this {@link com.carpentersblocks.api.ICarpentersChisel} was used in
     * @param entityPlayer The {@link net.minecraft.entity.player.EntityPlayer} that used this {@link com.carpentersblocks.api.ICarpentersChisel}
     * @return {@code true} if allowed, otherwise {@code false}
     */
    public boolean canUseChisel(World world, EntityPlayer entityPlayer);

}
