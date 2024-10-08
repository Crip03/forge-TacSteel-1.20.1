package net.crip03.tacsteel.item.client;

import net.crip03.tacsteel.TacSteel;
import net.crip03.tacsteel.item.custom.PHP_BArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PHP_BModel extends GeoModel<PHP_BArmorItem> {
    @Override
    public ResourceLocation getModelResource(PHP_BArmorItem php_bArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "geo/php_b.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PHP_BArmorItem php_bArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "textures/armor/php_b.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PHP_BArmorItem php_bArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "animations/php_b.animation.json");
    }
}
