package net.AL.mobsoplent.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.AL.mobsoplent.MobsOPlent;
import net.AL.mobsoplent.entity.custom.OstrichEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class OstrichRenderer extends MobRenderer<OstrichEntity, Ostrichmodel<OstrichEntity>> {
    public OstrichRenderer(EntityRendererProvider.Context pContext){
        super(pContext, new Ostrichmodel<>(pContext.bakeLayer(ModModelLayers.OSTRICH_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(OstrichEntity pEntity){
        return new ResourceLocation(MobsOPlent.MOD_ID, "textures/entity/ostrich.png");
    }

    @Override
    public void render(OstrichEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
