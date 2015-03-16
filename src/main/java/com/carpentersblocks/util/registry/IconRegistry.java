package com.carpentersblocks.util.registry;

import java.util.ArrayList;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import com.carpentersblocks.CarpentersBlocks;
import com.carpentersblocks.CarpentersBlocksCachedResources;
import com.carpentersblocks.util.handler.DesignHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class IconRegistry {

    public static TextureAtlasSprite icon_uncovered_full;
    public static TextureAtlasSprite icon_uncovered_quartered;
    public static TextureAtlasSprite icon_uncovered_solid;
    public static TextureAtlasSprite icon_uncovered_oblique_pos;
    public static TextureAtlasSprite icon_uncovered_oblique_neg;
    public static TextureAtlasSprite icon_overlay_fast_grass_side;
    public static TextureAtlasSprite icon_overlay_hay_side;
    public static TextureAtlasSprite icon_overlay_snow_side;
    public static TextureAtlasSprite icon_overlay_mycelium_side;
    public static TextureAtlasSprite icon_lever;
    public static TextureAtlasSprite icon_torch;
    public static TextureAtlasSprite icon_torch_head_lit;
    public static TextureAtlasSprite icon_torch_head_smoldering;
    public static TextureAtlasSprite icon_torch_head_unlit;
    public static TextureAtlasSprite icon_lantern_glass;
    public static TextureAtlasSprite icon_door_screen_tall;
    public static TextureAtlasSprite icon_door_glass_tall_top;
    public static TextureAtlasSprite icon_door_glass_tall_bottom;
    public static TextureAtlasSprite icon_door_glass_top;
    public static TextureAtlasSprite icon_door_french_glass_top;
    public static TextureAtlasSprite icon_door_french_glass_bottom;
    public static TextureAtlasSprite icon_hatch_french_glass;
    public static TextureAtlasSprite icon_hatch_glass;
    public static TextureAtlasSprite icon_hatch_screen;
    public static TextureAtlasSprite icon_daylight_sensor_glass_top;
    public static TextureAtlasSprite icon_safe_light;
    public static TextureAtlasSprite icon_flower_pot;
    public static TextureAtlasSprite icon_flower_pot_glass;
    public static TextureAtlasSprite icon_tile_blank;
    public static TextureAtlasSprite icon_bed_pillow;
    public static TextureAtlasSprite icon_garage_glass_top;
    public static TextureAtlasSprite icon_garage_glass;

    public static ArrayList<TextureAtlasSprite>   icon_design_chisel     = new ArrayList<TextureAtlasSprite>();
    public static ArrayList<TextureAtlasSprite[]> icon_design_bed        = new ArrayList<TextureAtlasSprite[]>();
    public static ArrayList<TextureAtlasSprite>   icon_design_flower_pot = new ArrayList<TextureAtlasSprite>();
    public static ArrayList<TextureAtlasSprite>   icon_design_tile       = new ArrayList<TextureAtlasSprite>();

    @SubscribeEvent
    /**
     * This will load all icons that are used universally for all blocks.
     */
    public void iconRegistration(TextureStitchEvent.Pre event)
    {
        /** 0 = terrain.png, 1 = items.png */
        //if (event.map.getTextureType() == 0) { TODO Check later. -CB

            CarpentersBlocksCachedResources.INSTANCE.rebuildCache();

            icon_uncovered_solid         = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "general/solid"));
            icon_uncovered_full          = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "general/full_frame"));
            icon_uncovered_quartered     = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "general/quartered_frame"));
            icon_overlay_fast_grass_side = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "overlay/overlay_fast_grass_side"));
            icon_overlay_hay_side        = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "overlay/overlay_hay_side"));
            icon_overlay_snow_side       = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "overlay/overlay_snow_side"));
            icon_overlay_mycelium_side   = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "overlay/overlay_mycelium_side"));
            icon_tile_blank              = event.map.registerSprite(new ResourceLocation(CarpentersBlocks.MODID, "tile/blank"));

            icon_design_chisel.clear();
            icon_design_bed.clear();
            icon_design_flower_pot.clear();
            icon_design_tile.clear();

            DesignHandler.registerIcons(event.map);

        //}
    }

}
