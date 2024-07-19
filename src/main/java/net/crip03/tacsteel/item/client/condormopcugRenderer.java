package net.crip03.tacsteel.item.client;

import net.crip03.tacsteel.item.custom.CondorMOPCUGArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class condormopcugRenderer extends GeoArmorRenderer<CondorMOPCUGArmorItem> {

    public condormopcugRenderer() {
        super(new condormopcugModel());
    }
}
