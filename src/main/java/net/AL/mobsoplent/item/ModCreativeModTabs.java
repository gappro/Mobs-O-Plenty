package net.AL.mobsoplent.item;

import net.AL.mobsoplent.MobsOPlent;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MobsOPlent.MOD_ID);

    public static final RegistryObject<CreativeModeTab> THEMODONE_TAB = CREATIVE_MODE_TABS.register("mobsoplent_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VOIDER_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.mobsoplent_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.VOIDER_SPAWN_EGG.get());
                                pOutput.accept(ModItems.VOIDER_SCALE.get());
                                pOutput.accept(ModItems.HARD_LEATHER.get());
                                pOutput.accept(ModItems.VOIDER_SADDLE.get());
                            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
