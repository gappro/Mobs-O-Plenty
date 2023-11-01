package net.AL.mobsoplent.entity;

import net.AL.mobsoplent.MobsOPlent;
import net.AL.mobsoplent.entity.custom.OstrichEntity;
import net.AL.mobsoplent.entity.custom.VoidsentEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MobsOPlent.MOD_ID);

    public static final RegistryObject<EntityType<VoidsentEntity>> VOIDSENT =
            ENTITY_TYPES.register("voidsent", () -> EntityType.Builder.of(VoidsentEntity::new, MobCategory.CREATURE)
                    .sized(3.4f, 2.3f).build("voidsent"));

    public static final RegistryObject<EntityType<OstrichEntity>> OSTRICH =
            ENTITY_TYPES.register("ostrich", () -> EntityType.Builder.of(OstrichEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1.8f).build("ostrich"));
    public static void  register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
