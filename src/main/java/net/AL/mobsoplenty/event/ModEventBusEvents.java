package net.AL.mobsoplenty.event;

import net.AL.mobsoplenty.MobsOPlenty;
import net.AL.mobsoplenty.entity.ModEntities;
import net.AL.mobsoplenty.entity.custom.VoidsentEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MobsOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static  void  registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.VOIDSENT.get(), VoidsentEntity.createAttributes().build());
    }
}
