package net.crip03.tacsteel.item;

import net.crip03.tacsteel.TacSteel;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TacSteel.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TACSTEEL_TAB = CREATIVE_MODE_TABS.register("tacsteel_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARMOR_PLATE.get()))
                    .title(Component.translatable("creativetab.tacsteel_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ARMOR_PLATE.get());
                        output.accept(ModItems.HOLSTER.get());
                        output.accept(ModItems.CONDOR_MOPC_UG.get());
                        output.accept(ModItems.PHP_B.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
