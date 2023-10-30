package net.AL.mobsoplenty.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.AL.mobsoplenty.MobsOPlenty;
import net.AL.mobsoplenty.entity.custom.VoidsentEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class VoidsentRenderer extends MobRenderer<VoidsentEntity, Voidsentmodel<VoidsentEntity>> {
    public VoidsentRenderer(EntityRendererProvider.Context pContext){
        super(pContext, new Voidsentmodel<>(pContext.bakeLayer(ModModelLayers.VOIDSENT_LAYER)), 2.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(VoidsentEntity pEntity){
        return new ResourceLocation(MobsOPlenty.MOD_ID, "textures/entity/voider.png");
    }

    @Override
    public void render(VoidsentEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
