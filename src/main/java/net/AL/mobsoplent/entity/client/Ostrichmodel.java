package net.AL.mobsoplent.entity.client;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
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
		this.head = Ostrich.getChild("body").getChild("torso").getChild("neck").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Ostrich = partdefinition.addOrReplaceChild("Ostrich", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = Ostrich.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition legLeft = body.addOrReplaceChild("legLeft", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0F, -3.0F));

		PartDefinition cube_r1 = legLeft.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 66).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition knee = legLeft.addOrReplaceChild("knee", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition cube_r2 = knee.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 23).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 12.9F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition feet = knee.addOrReplaceChild("feet", CubeListBuilder.create().texOffs(35, 58).addBox(-0.8F, -1.3F, -0.7F, 1.6F, 1.6F, 5.7F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.6F, -0.7F));

		PartDefinition cube_r3 = feet.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 9).addBox(-1.0F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.3F, 0.7F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r4 = feet.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 76).addBox(-0.3084F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.2F, 0.2F, 0.2618F, 0.6283F, 0.0F));

		PartDefinition cube_r5 = feet.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 53).addBox(-0.8084F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.2F, 0.2F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = feet.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 62).addBox(-0.9F, -1.5F, -2.7F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 0.2F, 0.7F, 0.2618F, -0.6981F, 0.0F));

		PartDefinition cube_r7 = feet.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 24).addBox(-1.0F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.3F, 0.3F, 0.0F, 0.6109F, 0.0F));

		PartDefinition legRight = body.addOrReplaceChild("legRight", CubeListBuilder.create(), PartPose.offset(-4.0F, 4.0F, -3.0F));

		PartDefinition legRight3 = legRight.addOrReplaceChild("legRight3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = legRight3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 61).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition knee2 = legRight3.addOrReplaceChild("knee2", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition cube_r9 = knee2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(47, 42).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 12.9F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition knee6 = legRight3.addOrReplaceChild("knee6", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition feet5 = knee6.addOrReplaceChild("feet5", CubeListBuilder.create().texOffs(50, 52).addBox(-0.8F, -1.3F, -0.7F, 1.6F, 1.6F, 5.7F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.6F, -0.7F));

		PartDefinition knee7 = legRight3.addOrReplaceChild("knee7", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition feet6 = knee7.addOrReplaceChild("feet6", CubeListBuilder.create(), PartPose.offset(0.0F, 9.6F, -0.7F));

		PartDefinition cube_r10 = feet6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(70, 59).addBox(-0.4F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.3F, 0.3F, 0.0F, -0.6109F, 0.0F));

		PartDefinition knee8 = legRight3.addOrReplaceChild("knee8", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition feet7 = knee8.addOrReplaceChild("feet7", CubeListBuilder.create(), PartPose.offset(0.0F, 9.6F, -0.7F));

		PartDefinition cube_r11 = feet7.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 72).addBox(-0.3F, -1.5F, -2.7F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.2F, 0.7F, 0.2618F, 0.6981F, 0.0F));

		PartDefinition knee9 = legRight3.addOrReplaceChild("knee9", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition feet8 = knee9.addOrReplaceChild("feet8", CubeListBuilder.create(), PartPose.offset(0.0F, 9.6F, -0.7F));

		PartDefinition cube_r12 = feet8.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(77, 0).addBox(-0.3916F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.2F, 0.2F, 0.2618F, 0.0F, 0.0F));

		PartDefinition knee10 = legRight3.addOrReplaceChild("knee10", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition feet9 = knee10.addOrReplaceChild("feet9", CubeListBuilder.create(), PartPose.offset(0.0F, 9.6F, -0.7F));

		PartDefinition cube_r13 = feet9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(71, 4).addBox(-0.8916F, -1.351F, -2.1438F, 1.2F, 1.0F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, 0.2F, 0.2F, 0.2618F, -0.6283F, 0.0F));

		PartDefinition knee11 = legRight3.addOrReplaceChild("knee11", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 4.3F));

		PartDefinition feet10 = knee11.addOrReplaceChild("feet10", CubeListBuilder.create(), PartPose.offset(0.0F, 9.6F, -0.7F));

		PartDefinition cube_r14 = feet10.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(67, 34).addBox(-0.4F, -1.6F, -1.1F, 1.4F, 1.6F, 2.7F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.3F, 0.7F, 0.0F, 0.6981F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -4.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(15, 23).addBox(-5.0F, -3.0F, 7.0F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 23).addBox(7.0F, -3.0F, -6.0F, 1.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-8.0F, -3.0F, -6.0F, 1.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = torso.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(19, 42).addBox(-4.0F, -3.0F, -1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -6.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(65, 0).addBox(-0.9F, -3.2997F, -1.0037F, 1.8F, 4.3F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.5F, -8.8F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(42, 23).addBox(-1.0F, -6.6377F, -0.5005F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -6.9F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -4.2654F, -1.1613F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.7F, -9.4F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -9.7F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 52).addBox(-3.0F, -2.0F, -1.6F, 1.0F, 2.0F, 2.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 0.3F, 0.2F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(54, 39).addBox(-3.0F, -2.0F, -1.6F, 1.0F, 2.0F, 2.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition beak = head.addOrReplaceChild("beak", CubeListBuilder.create().texOffs(61, 48).addBox(-3.0F, -0.2F, 1.1F, 6.0F, 1.2F, 2.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -6.0F));

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