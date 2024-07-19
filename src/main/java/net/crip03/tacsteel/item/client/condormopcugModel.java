package net.crip03.tacsteel.item.client;

import net.crip03.tacsteel.TacSteel;
import net.crip03.tacsteel.item.custom.CondorMOPCUGArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class condormopcugModel extends GeoModel<CondorMOPCUGArmorItem> {
    @Override
    public ResourceLocation getModelResource(CondorMOPCUGArmorItem condorMOPCUGArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "geo/condor_mopc_ug.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CondorMOPCUGArmorItem condorMOPCUGArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "textures/armor/condor_mopc_ug.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CondorMOPCUGArmorItem condorMOPCUGArmorItem) {
        return new ResourceLocation(TacSteel.MOD_ID, "animations/condor_mopc_ug.animation.json");
    }
}
