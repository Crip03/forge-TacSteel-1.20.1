package net.crip03.tacsteel.item;

import net.crip03.tacsteel.TacSteel;
import net.crip03.tacsteel.item.custom.ArmorPlateArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TacSteel.MOD_ID);

    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate",
            () -> new ArmorPlateArmorItem(ModArmorMaterials.PLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HOLSTER = ITEMS.register("holster",
            () -> new ArmorPlateArmorItem(ModArmorMaterials.PLATE, ArmorItem.Type.LEGGINGS, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
