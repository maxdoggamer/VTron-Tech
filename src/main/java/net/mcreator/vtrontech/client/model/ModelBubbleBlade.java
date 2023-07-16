package net.mcreator.vtrontech.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBubbleBlade<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("vtrontech", "model_bubble_blade"), "main");
	public final ModelPart bb_main;

	public ModelBubbleBlade(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(204, 143).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, -24.0F, 8.0F, 16.0F, 27.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(204, 64)
						.addBox(-8.0F, 11.0F, -18.0F, 16.0F, 3.0F, 58.0F, new CubeDeformation(0.0F)).texOffs(204, 3).addBox(0.0F, 8.0F, -18.0F, 16.0F, 3.0F, 58.0F, new CubeDeformation(0.0F)).texOffs(156, 171)
						.addBox(-16.0F, 8.0F, -18.0F, 16.0F, 3.0F, 58.0F, new CubeDeformation(0.0F)).texOffs(114, 110).addBox(-24.0F, 5.0F, -18.0F, 16.0F, 3.0F, 58.0F, new CubeDeformation(0.0F)).texOffs(114, 0)
						.addBox(8.0F, 5.0F, -18.0F, 16.0F, 3.0F, 58.0F, new CubeDeformation(0.0F)).texOffs(106, 351).addBox(24.0F, -11.0F, -10.0F, 3.0F, 16.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(118, 284)
						.addBox(27.0F, -19.0F, -11.0F, 8.0F, 16.0F, 51.0F, new CubeDeformation(0.0F)).texOffs(0, 110).addBox(30.0F, -27.0F, -3.0F, 3.0F, 16.0F, 43.0F, new CubeDeformation(0.0F)).texOffs(366, 0)
						.addBox(27.0F, -35.0F, -1.0F, 3.0F, 16.0F, 41.0F, new CubeDeformation(0.0F)).texOffs(344, 179).addBox(-27.0F, -11.0F, -10.0F, 3.0F, 16.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(253, 354)
						.addBox(-30.0F, -35.0F, -1.0F, 3.0F, 16.0F, 41.0F, new CubeDeformation(0.0F)).texOffs(0, 272).addBox(-35.0F, -19.0F, -11.0F, 8.0F, 16.0F, 51.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-33.0F, -27.0F, -3.0F, 3.0F, 16.0F, 43.0F, new CubeDeformation(0.0F)).texOffs(49, 110).addBox(27.0F, -35.0F, 20.0F, 3.0F, 16.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(49, 0)
						.addBox(-30.0F, -35.0F, 20.0F, 3.0F, 16.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(301, 383).addBox(-30.0F, -19.0F, 0.0F, 3.0F, 16.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(368, 343)
						.addBox(27.0F, -19.0F, 0.0F, 3.0F, 16.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(0, 339).addBox(-27.0F, -11.0F, -10.0F, 3.0F, 16.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(302, 317)
						.addBox(24.0F, -11.0F, -10.0F, 3.0F, 16.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(103, 232).addBox(-27.0F, -36.0F, -9.0F, 27.0F, 3.0F, 49.0F, new CubeDeformation(0.0F)).texOffs(0, 220)
						.addBox(0.0F, -36.0F, -9.0F, 27.0F, 3.0F, 49.0F, new CubeDeformation(0.0F)).texOffs(246, 125).addBox(-5.0F, -39.0F, -9.0F, 26.0F, 3.0F, 49.0F, new CubeDeformation(0.0F)).texOffs(206, 235)
						.addBox(-22.0F, -39.0F, -9.0F, 26.0F, 3.0F, 49.0F, new CubeDeformation(0.0F)).texOffs(246, 177).addBox(-13.0F, -42.0F, -9.0F, 25.0F, 3.0F, 49.0F, new CubeDeformation(0.0F)).texOffs(403, 407)
						.addBox(22.0F, -34.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 405).addBox(-30.0F, -26.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 405)
						.addBox(-30.0F, -34.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 405).addBox(22.0F, -26.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(400, 209)
						.addBox(20.0F, -34.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(400, 193).addBox(20.0F, -26.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(400, 177)
						.addBox(-28.0F, -34.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(379, 399).addBox(-28.0F, -26.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(347, 399)
						.addBox(-28.0F, -18.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(212, 393).addBox(-28.0F, -10.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(106, 383)
						.addBox(-28.0F, -2.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 371).addBox(20.0F, -18.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 371)
						.addBox(20.0F, -10.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(112, 367).addBox(20.0F, -2.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(366, 25)
						.addBox(-24.0F, -30.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(366, 9).addBox(-24.0F, -22.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(88, 359)
						.addBox(-24.0F, -14.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(358, 338).addBox(-24.0F, -6.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 355)
						.addBox(16.0F, -30.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 355).addBox(16.0F, -22.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(112, 351)
						.addBox(16.0F, -14.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(345, 209).addBox(16.0F, -6.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(345, 193)
						.addBox(-20.0F, -26.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(345, 177).addBox(-20.0F, -18.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(88, 343)
						.addBox(-20.0F, -10.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 339).addBox(12.0F, -26.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 339)
						.addBox(12.0F, -18.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(249, 319).addBox(12.0F, -10.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(217, 319)
						.addBox(-16.0F, -22.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(185, 319).addBox(-16.0F, -14.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(318, 33)
						.addBox(8.0F, -22.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(318, 17).addBox(8.0F, -14.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(301, 317)
						.addBox(4.0F, -18.0F, -47.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(118, 316).addBox(-12.0F, -18.0F, -47.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(301, 13)
						.addBox(-42.0F, -19.0F, -11.0F, 7.0F, 16.0F, 51.0F, new CubeDeformation(0.0F)).texOffs(236, 287).addBox(35.0F, -19.0F, -11.0F, 7.0F, 16.0F, 51.0F, new CubeDeformation(0.0F)).texOffs(301, 287)
						.addBox(-33.0F, -27.0F, 40.0F, 66.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(162, 354).addBox(-30.0F, -35.0F, 40.0F, 60.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(358, 331)
						.addBox(-27.0F, -36.0F, 40.0F, 54.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 178).addBox(-22.0F, -39.0F, 40.0F, 43.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(67, 284)
						.addBox(-13.0F, -42.0F, 40.0F, 25.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(396, 163).addBox(-27.0F, -3.0F, 40.0F, 54.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(162, 384)
						.addBox(-24.0F, 5.0F, 40.0F, 48.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(204, 134).addBox(-16.0F, 8.0F, 40.0F, 32.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 38)
						.addBox(-8.0F, 11.0F, 40.0F, 16.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 29).addBox(-8.0F, 11.0F, 46.0F, 16.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 20)
						.addBox(-8.0F, 11.0F, 46.0F, 16.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(204, 125).addBox(-16.0F, 8.0F, 46.0F, 32.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 200)
						.addBox(-16.0F, 8.0F, 46.0F, 32.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(294, 0).addBox(-24.0F, 5.0F, 46.0F, 48.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(103, 220)
						.addBox(-24.0F, 5.0F, 46.0F, 48.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(358, 317).addBox(-27.0F, -3.0F, 46.0F, 54.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(347, 149)
						.addBox(-27.0F, -3.0F, 46.0F, 54.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(294, 80).addBox(-33.0F, -27.0F, 46.0F, 66.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 64)
						.addBox(-33.0F, -27.0F, 46.0F, 66.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(347, 119).addBox(-30.0F, -35.0F, 46.0F, 60.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(307, 245)
						.addBox(-30.0F, -35.0F, 46.0F, 60.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(307, 275).addBox(-27.0F, -36.0F, 46.0F, 54.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(294, 110)
						.addBox(-27.0F, -36.0F, 46.0F, 54.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 171).addBox(-22.0F, -39.0F, 46.0F, 43.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 169)
						.addBox(-22.0F, -39.0F, 46.0F, 43.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(67, 272).addBox(-13.0F, -42.0F, 46.0F, 25.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-16.0F, -32.0F, 52.0F, 32.0F, 32.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 197).addBox(-16.0F, -32.0F, 58.0F, 32.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 190)
						.addBox(-16.0F, -4.0F, 58.0F, 32.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 0).addBox(-8.0F, -18.0F, 58.0F, 16.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(114, 10).addBox(11.0F, -2.0F, 58.0F, 16.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 180).addBox(3.0F, 12.0F, 58.0F, 32.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 187)
						.addBox(3.0F, -16.0F, 58.0F, 32.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 110).addBox(-7.0F, 12.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(114, 110)
						.addBox(-7.0F, 4.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 126).addBox(-7.0F, -4.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(114, 126)
						.addBox(-7.0F, -12.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(138, 118).addBox(-7.0F, -20.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(138, 134)
						.addBox(-3.0F, -16.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(114, 142).addBox(-3.0F, -8.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(138, 150)
						.addBox(-3.0F, 0.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(204, 0).addBox(-3.0F, 8.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(204, 16)
						.addBox(1.0F, 4.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(204, 32).addBox(1.0F, -4.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(206, 102)
						.addBox(1.0F, -12.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 220).addBox(5.0F, -8.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(228, 8)
						.addBox(5.0F, 0.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(228, 24).addBox(9.0F, -4.0F, -47.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(35.0F, -16.0F, -96.0F, 7.0F, 10.0F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 110).addBox(-42.0F, -16.0F, -96.0F, 7.0F, 10.0F, 100.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(228, 40).addBox(-25.0F, -4.0F, -47.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(103, 229).addBox(-29.0F, 0.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(230, 94)
						.addBox(-29.0F, -8.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(206, 232).addBox(-33.0F, -12.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 236)
						.addBox(-33.0F, -4.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(103, 245).addBox(-33.0F, 4.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(246, 177)
						.addBox(-37.0F, 8.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(246, 193).addBox(-37.0F, 0.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(246, 209)
						.addBox(-37.0F, -8.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(206, 248).addBox(-37.0F, -16.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 252)
						.addBox(-41.0F, -20.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(252, 143).addBox(-41.0F, -12.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(206, 264)
						.addBox(-41.0F, -4.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 272).addBox(-41.0F, 4.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(129, 284)
						.addBox(-41.0F, 12.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(185, 287).addBox(-25.0F, -4.0F, -47.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(217, 287)
						.addBox(-29.0F, 0.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(249, 287).addBox(-29.0F, -8.0F, -39.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 288)
						.addBox(-33.0F, -12.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(67, 293).addBox(-33.0F, -4.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(99, 293)
						.addBox(-33.0F, 4.0F, -31.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(294, 9).addBox(-37.0F, 8.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(294, 25)
						.addBox(-37.0F, 0.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(294, 41).addBox(-37.0F, -8.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(131, 300)
						.addBox(-37.0F, -16.0F, -23.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(185, 303).addBox(-41.0F, -20.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(217, 303)
						.addBox(-41.0F, -12.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(249, 303).addBox(-41.0F, -4.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 304)
						.addBox(-41.0F, 4.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(307, 229).addBox(-41.0F, 12.0F, -16.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 528, 528);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
