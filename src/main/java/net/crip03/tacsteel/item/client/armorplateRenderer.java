package net.crip03.tacsteel.item.client;

import net.crip03.tacsteel.item.custom.ArmorPlateArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class armorplateRenderer extends GeoArmorRenderer<ArmorPlateArmorItem> {
    public armorplateRenderer() {
        super(new armorplateModel());
    }
}
