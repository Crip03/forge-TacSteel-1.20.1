package net.crip03.tacsteel.item;

import net.crip03.tacsteel.TacSteel;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TacSteel.MOD_ID);

    public static final RegistryObject<Item> ARMOR_PLATE = ITEMS.register("armor_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOLSTER = ITEMS.register("holster",
            () -> new Item(new Item.Properties().defaultDurability(5000).stacksTo(1).));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
