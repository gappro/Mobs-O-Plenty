package net.AL.mobsoplent.item;

import net.AL.mobsoplent.MobsOPlent;
import net.AL.mobsoplent.entity.ModEntities;
import net.AL.mobsoplenty.item.custom.MountSaddleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SaddleItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MobsOPlent.MOD_ID);


    public static final RegistryObject<Item> VOIDER_SPAWN_EGG = ITEMS.register("voider_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.VOIDSENT, 0x6200a3, 0x000000, new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> VOIDER_SCALE = ITEMS.register("voidsent_scale",
            () -> new Item(
                    new Item.Properties().stacksTo(64)
            ));

    public static final RegistryObject<Item> HARD_LEATHER = ITEMS.register("hard_leather",
            () -> new Item(
                    new Item.Properties().stacksTo(16)
            ));

    public static final RegistryObject<Item> VOIDER_SADDLE = ITEMS.register("voidsent_saddle",
            () -> new MountSaddleItem(
                    new Item.Properties().stacksTo(2)
            ));



    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
