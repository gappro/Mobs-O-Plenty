package net.AL.mobsoplent.entity.client;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.AL.mobsoplent.entity.animations.ModAnimationDefinitions;
import net.AL.mobsoplent.entity.custom.OstrichEntity;
import net.AL.mobsoplent.entity.custom.VoidsentEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Ostrichmodel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ostrich"), "main");
	private final ModelPart Ostrich;
	private final ModelPart head;

	public Ostrichmodel(ModelPart root) {
		this.Ostrich = root.getChild("Ostrich");
		this.head = Ostrich.getChild("body").getChild("torso").getChild("neck").getChild("neck2").getChild("neck3").getChild("neck4").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Ostrich = partdefinition.addOrReplaceChild("Ostrich", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = Ostrich.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition legLeft = body.addOrReplaceChild("legLeft", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0F, -3.0F));

		PartDefinition cube_r1 = legLeft.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(17, 52).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Lknee = legLeft.addOrReplaceChild("Lknee", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 6.3F));

		PartDefinition cube_r2 = Lknee.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 42).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 12.9F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Lfeet = Lknee.addOrReplaceChild("Lfeet", CubeListBuilder.create(), PartPose.offset(0.0F, 12.6F, -0.7F));

		PartDefinition L3foot = Lfeet.addOrReplaceChild("L3foot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition cube_r3 = L3foot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 38).addBox(-1.0F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.3F, 0.7F, 0.0F, -0.6981F, 0.0F));

		PartDefinition L3finger = L3foot.addOrReplaceChild("L3finger", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = L3finger.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 6).addBox(-0.9F, -1.5F, -2.7F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.2F, 0.7F, 0.2618F, -0.6981F, 0.0F));

		PartDefinition L2foot = Lfeet.addOrReplaceChild("L2foot", CubeListBuilder.create().texOffs(0, 52).addBox(-0.8F, -1.3F, -0.7F, 1.6F, 1.6F, 5.7F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition L2finger = L2foot.addOrReplaceChild("L2finger", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = L2finger.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 58).addBox(-0.8084F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2F, 0.2F, 0.2618F, 0.0F, 0.0F));

		PartDefinition L1foot = Lfeet.addOrReplaceChild("L1foot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition cube_r6 = L1foot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 44).addBox(-1.0F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3F, 0.3F, 0.0F, 0.6109F, 0.0F));

		PartDefinition L1finger = L1foot.addOrReplaceChild("L1finger", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = L1finger.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 58).addBox(-0.3084F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.2F, 0.2F, 0.2618F, 0.6283F, 0.0F));

		PartDefinition legRight = body.addOrReplaceChild("legRight", CubeListBuilder.create(), PartPose.offset(-4.0F, 4.0F, -3.0F));

		PartDefinition cube_r8 = legRight.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Rknee = legRight.addOrReplaceChild("Rknee", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 6.3F));

		PartDefinition cube_r9 = Rknee.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 42).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 12.9F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rfeet = Rknee.addOrReplaceChild("Rfeet", CubeListBuilder.create(), PartPose.offset(0.0F, 12.6F, -0.7F));

		PartDefinition R3foot = Rfeet.addOrReplaceChild("R3foot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition cube_r10 = R3foot.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 0).addBox(-0.4F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.3F, 0.7F, 0.0F, 0.6981F, 0.0F));

		PartDefinition R3finger = R3foot.addOrReplaceChild("R3finger", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = R3finger.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 14).addBox(-0.3F, -1.5F, -2.7F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.2F, 0.7F, 0.2618F, 0.6981F, 0.0F));

		PartDefinition R2foot = Rfeet.addOrReplaceChild("R2foot", CubeListBuilder.create().texOffs(43, 0).addBox(-0.8F, -1.3F, -0.7F, 1.6F, 1.6F, 5.7F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition R2finger = R2foot.addOrReplaceChild("R2finger", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3F, 4.0F));

		PartDefinition cube_r12 = R2finger.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(59, 58).addBox(-0.3916F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -0.1F, -3.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition R1foot = Rfeet.addOrReplaceChild("R1foot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition cube_r13 = R1foot.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(53, 55).addBox(-0.4F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, 0.3F, 0.0F, -0.6109F, 0.0F));

		PartDefinition R1finger = R1foot.addOrReplaceChild("R1finger", CubeListBuilder.create(), PartPose.offset(1.0F, 0.3F, 0.3F));

		PartDefinition cube_r14 = R1finger.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 50).addBox(-0.8916F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.1F, -0.1F, 0.2618F, -0.6283F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -4.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(15, 23).addBox(-5.0F, -3.0F, 7.0F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = torso.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r16 = torso.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(27, 23).addBox(0.0F, 0.0F, -6.0F, 1.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r17 = torso.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(42, 23).addBox(-4.0F, -3.0F, -1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -6.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -7.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(26, 52).addBox(-1.0F, -6.6377F, -0.5005F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 0.1F, 0.6981F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7F, -3.4F));

		PartDefinition cube_r19 = neck3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -4.2654F, -1.1613F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offset(0.0F, -9.8F, 1.6F));

		PartDefinition cube_r20 = neck4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 31).addBox(-0.9F, -3.2997F, -1.0037F, 1.8F, 4.3F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(19, 42).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, -0.9F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(60, 19).addBox(-3.0F, -2.0F, -1.6F, 1.0F, 2.0F, 2.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 0.3F, 0.2F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 61).addBox(-3.0F, -2.0F, -1.6F, 1.0F, 2.0F, 2.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition beak = head.addOrReplaceChild("beak", CubeListBuilder.create().texOffs(43, 9).addBox(-3.0F, -0.2F, 1.1F, 6.0F, 1.2F, 2.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -6.0F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 8.0F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 42).addBox(-4.0F, 0.0F, 1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public ModelPart root() {
		return Ostrich;
	}
	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.OSTRICH_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((OstrichEntity)entity).idleAnimationState, ModAnimationDefinitions.OSTRICH_IDLE, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks){
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Ostrich.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}