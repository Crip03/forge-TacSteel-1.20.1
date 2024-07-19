package net.crip03.tacsteel.item;

import net.crip03.tacsteel.TacSteel;
import net.crip03.tacsteel.item.custom.ArmorPlateArmorItem;
import net.crip03.tacsteel.item.custom.CondorMOPCUGArmorItem;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import oshi.hardware.PowerSource;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TacSteel.MOD_ID);

    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate",
            () -> new ArmorPlateArmorItem(ModArmorMaterials.PLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HOLSTER = ITEMS.register("holster",
            () -> new ArmorPlateArmorItem(ModArmorMaterials.PLATE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CONDOR_MOPC_UG = ITEMS.register("condor_mopc_ug",
            () -> new CondorMOPCUGArmorItem(ModArmorMaterials.CONDOR1, ArmorItem.Type.CHESTPLATE, new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
