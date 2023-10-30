package net.AL.mobsoplenty.entity.client;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.AL.mobsoplenty.entity.animations.ModAnimationDefinitions;
import net.AL.mobsoplenty.entity.custom.VoidsentEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Voidsentmodel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "voider"), "main");
	private final ModelPart voidsent;
	private final ModelPart head;

	public Voidsentmodel(ModelPart root) {
		this.voidsent = root.getChild("Voider");
		this.head = voidsent.getChild("Body").getChild("torso").getChild("neck").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Voider = partdefinition.addOrReplaceChild("Voider", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition Body = Voider.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -7.5F, 0.0F));

		PartDefinition torso = Body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -12.25F, -19.25F, 28.0F, 19.25F, 38.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.75F, 0.0F));

		PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -5.25F, -17.5F));

		PartDefinition body_r1 = neck.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(51, 114).addBox(-10.5F, -6.6454F, -4.6408F, 21.0F, 14.0F, 4.375F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(135, 34).addBox(-7.0F, -5.25F, -8.75F, 14.0F, 10.5F, 8.75F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.25F, -1.75F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(66, 58).addBox(-7.3F, -1.3F, -7.3F, 14.6F, 4.1F, 9.35F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.25F, -1.75F));

		PartDefinition Horns = head.addOrReplaceChild("Horns", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0321F, -3.5F, -3.3693F, 5.25F, 5.25F, 5.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.175F, -0.525F, -3.5F, 0.0F, 0.1833F, 0.0F));

		PartDefinition cube_r1 = Horns.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 0).addBox(-20.125F, -24.5F, -24.675F, 2.625F, 2.8F, 2.45F, new CubeDeformation(0.0F))
		.texOffs(17, 7).addBox(-19.25F, -25.025F, -25.2F, 5.25F, 4.2F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2845F, 26.2044F, 22.8807F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Horns2 = head.addOrReplaceChild("Horns2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.175F, -4.025F, -2.625F, 0.0F, 0.2094F, 0.0F));

		PartDefinition cube_r2 = Horns2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 11).addBox(7.0F, -31.5F, -26.25F, 5.25F, 5.25F, 5.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.7505F, 31.5F, 16.5698F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r3 = Horns2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 19).addBox(14.0F, -25.025F, -23.45F, 5.25F, 4.2F, 3.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.8172F, 29.7044F, 16.5698F, 0.1582F, -0.4084F, -0.3819F));

		PartDefinition cube_r4 = Horns2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 22).addBox(14.35F, -26.6F, -24.325F, 2.625F, 2.8F, 2.45F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0672F, 29.7044F, 20.0698F, 0.1795F, -0.392F, -0.3654F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 19.25F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 59).addBox(-12.25F, -8.8955F, -1.749F, 24.5F, 17.5F, 15.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 14.0F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(111, 105).addBox(-10.5F, -7.662F, -0.2508F, 21.0F, 14.0F, 8.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(136, 129).addBox(-8.75F, -5.1361F, -0.5225F, 17.5F, 8.75F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 8.75F, -0.0873F, 0.0F, 0.0F));

		PartDefinition FRLeg = Body.addOrReplaceChild("FRLeg", CubeListBuilder.create(), PartPose.offset(-14.0F, -5.25F, -10.5F));

		PartDefinition cube_r8 = FRLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(106, 59).addBox(-7.0F, -5.25F, -7.0F, 10.5F, 19.25F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition FRHand = FRLeg.addOrReplaceChild("FRHand", CubeListBuilder.create().texOffs(91, 129).addBox(-5.25F, -3.5F, -5.25F, 10.5F, 14.0F, 10.5F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 12.25F, 0.0F));

		PartDefinition BRLeg = Body.addOrReplaceChild("BRLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.5F, -1.75F, 8.75F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r9 = BRLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(96, 0).addBox(-7.0F, -5.25F, -7.0F, 10.5F, 19.25F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition BRHand = BRLeg.addOrReplaceChild("BRHand", CubeListBuilder.create().texOffs(146, 82).addBox(-5.25F, -1.75F, -5.25F, 10.5F, 10.5F, 10.5F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 10.5F, 0.0F));

		PartDefinition FLLeg = Body.addOrReplaceChild("FLLeg", CubeListBuilder.create(), PartPose.offset(14.0F, -5.25F, -10.5F));

		PartDefinition cube_r10 = FLLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 94).addBox(-3.5F, -5.25F, -7.0F, 10.5F, 19.25F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition FLHand = FLLeg.addOrReplaceChild("FLHand", CubeListBuilder.create().texOffs(0, 128).addBox(-5.25F, -3.5F, -5.25F, 10.5F, 14.0F, 10.5F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 12.25F, 0.0F));

		PartDefinition BLLeg = Body.addOrReplaceChild("BLLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(10.5F, -1.75F, 8.75F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r11 = BLLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(69, 80).addBox(-3.5F, -5.25F, -7.0F, 10.5F, 19.25F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition BLHand = BLLeg.addOrReplaceChild("BLHand", CubeListBuilder.create().texOffs(45, 133).addBox(-5.25F, -1.75F, -5.25F, 10.5F, 10.5F, 10.5F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 10.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public ModelPart root() {
		return voidsent;
	}
	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.VOIDER_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((VoidsentEntity)entity).idleAnimationState, ModAnimationDefinitions.VOIDER_IDLE, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks){
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		voidsent.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}