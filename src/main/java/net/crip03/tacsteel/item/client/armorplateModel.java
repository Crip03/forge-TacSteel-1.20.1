package net.crip03.tacsteel.item.client;

import net.crip03.tacsteel.TacSteel;
import net.crip03.tacsteel.item.custom.ArmorPlateArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class armorplateModel extends GeoModel<ArmorPlateArmorItem> {
    @Override
    public ResourceLocation getModelResource(ArmorPlateArmorItem animatable) {
        return new ResourceLocation(TacSteel.MOD_ID, "geo/armor_plate.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ArmorPlateArmorItem armorPlateArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "textures/armor/armor_plate.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ArmorPlateArmorItem armorPlateArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "animations/armor_plate.animation.json");
    }
}