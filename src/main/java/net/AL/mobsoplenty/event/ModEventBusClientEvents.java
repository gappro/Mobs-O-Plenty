package net.AL.mobsoplenty.event;

import net.AL.mobsoplenty.MobsOPlenty;
import net.AL.mobsoplenty.entity.client.ModModelLayers;
import net.AL.mobsoplenty.entity.client.Voidsentmodel;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = MobsOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.VOIDSENT_LAYER, Voidsentmodel::createBodyLayer);
    }
}
