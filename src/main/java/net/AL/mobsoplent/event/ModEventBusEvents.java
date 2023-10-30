package net.AL.mobsoplent.event;

import net.AL.mobsoplent.MobsOPlent;
import net.AL.mobsoplent.entity.ModEntities;
import net.AL.mobsoplent.entity.custom.VoidsentEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MobsOPlent.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static  void  registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.VOIDSENT.get(), VoidsentEntity.createAttributes().build());
    }
}
