package net.crip03.tacsteel.item.client;

import net.crip03.tacsteel.item.custom.PHP_BArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PHP_BRenderer extends GeoArmorRenderer<PHP_BArmorItem> {

    public PHP_BRenderer() {
        super(new PHP_BModel());
    }
}