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
public class ModelWaveCruiser<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("vtrontech", "model_wave_cruiser"), "main");
	public final ModelPart bb_main;

	public ModelWaveCruiser(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(144, 1696).addBox(16.0F, -23.0F, -66.0F, 2.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(144, 1696).addBox(-2.0F, -23.0F, -66.0F, 2.0F, 15.0F, 16.0F, new CubeDeformation(0.0F))
						.texOffs(458, 1696).addBox(100.0F, -11.0F, 44.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 1768).addBox(100.0F, -11.0F, 56.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(394, 1720)
						.addBox(98.0F, -11.0F, 48.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 1768).addBox(100.0F, 2.0F, 116.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 1768)
						.addBox(100.0F, 2.0F, 128.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(394, 1736).addBox(98.0F, 2.0F, 120.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(338, 1696)
						.addBox(101.0F, -72.0F, 123.0F, 2.0F, 75.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(346, 1696).addBox(101.0F, -72.0F, 51.0F, 2.0F, 61.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(394, 1752)
						.addBox(95.0F, -72.0F, 117.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(426, 1696).addBox(95.0F, -72.0F, 51.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 1696)
						.addBox(63.0F, -72.0F, 51.0F, 32.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 1712).addBox(63.0F, -72.0F, 117.0F, 32.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 1696)
						.addBox(62.0F, -72.0F, 117.0F, 8.0F, 64.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 1696).addBox(62.0F, -72.0F, 51.0F, 8.0F, 64.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(394, 1696)
						.addBox(0.0F, -104.0F, -58.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 1648).addBox(-16.0F, -88.0F, -66.0F, 32.0F, 16.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(144, 1696)
						.addBox(0.0F, -17.0F, -66.0F, 16.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(640, 1584).addBox(-23.0F, -56.0F, -18.0F, 64.0F, 48.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 1584)
						.addBox(-23.0F, -56.0F, -130.0F, 42.0F, 48.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(448, 1376).addBox(41.0F, -56.0F, -130.0F, 16.0F, 48.0F, 128.0F, new CubeDeformation(0.0F)).texOffs(0, 1376)
						.addBox(-39.0F, -72.0F, -130.0F, 96.0F, 16.0F, 128.0F, new CubeDeformation(0.0F)).texOffs(736, 1376).addBox(-39.0F, -56.0F, -130.0F, 16.0F, 48.0F, 128.0F, new CubeDeformation(0.0F)).texOffs(354, 1696)
						.addBox(0.0F, -40.0F, -66.0F, 16.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(128, 1648).addBox(-7.0F, -11.0F, 190.0F, 32.0F, 16.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(640, 1648)
						.addBox(-7.0F, 5.0F, -162.0F, 32.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(160, 1584).addBox(-23.0F, -11.0F, -162.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 1552)
						.addBox(-55.0F, -11.0F, 142.0F, 128.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(64, 1728).addBox(-7.0F, 1.0F, -162.0F, 32.0F, 32.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(256, 1648)
						.addBox(-7.0F, 21.0F, 158.0F, 32.0F, 16.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(160, 1616).addBox(-23.0F, 5.0F, 158.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(576, 1552)
						.addBox(-39.0F, -11.0F, 158.0F, 96.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(384, 1648).addBox(-7.0F, 37.0F, 142.0F, 32.0F, 16.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(320, 1584)
						.addBox(-23.0F, 21.0F, 142.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(800, 1552).addBox(-39.0F, 5.0F, 142.0F, 96.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-55.0F, -8.0F, -114.0F, 128.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(320, 1616).addBox(-23.0F, -11.0F, 174.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(512, 1648)
						.addBox(-7.0F, 5.0F, 174.0F, 32.0F, 16.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(1024, 1552).addBox(-39.0F, -11.0F, -146.0F, 96.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(480, 1584)
						.addBox(-23.0F, 5.0F, -146.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(736, 1648).addBox(-7.0F, 21.0F, -146.0F, 32.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(288, 1552)
						.addBox(-55.0F, -11.0F, -130.0F, 128.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(1248, 1552).addBox(-39.0F, 5.0F, -130.0F, 96.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(480, 1616)
						.addBox(-23.0F, 21.0F, -130.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 288).addBox(25.0F, 37.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(544, 288)
						.addBox(73.0F, -11.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(0, 560).addBox(-71.0F, -11.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(544, 560)
						.addBox(-55.0F, 5.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(0, 832).addBox(57.0F, 5.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(544, 832)
						.addBox(41.0F, 21.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(0, 1104).addBox(-39.0F, 21.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(544, 1104)
						.addBox(-23.0F, 37.0F, -114.0F, 16.0F, 16.0F, 256.0F, new CubeDeformation(0.0F)).texOffs(832, 1648).addBox(-7.0F, 37.0F, -130.0F, 32.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(768, 0)
						.addBox(-7.0F, 53.0F, -114.0F, 32.0F, 16.0F, 272.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -58.0F, 3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(288, 1696).addBox(-24.0F, -9.0F, -35.0F, 23.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.0F, -58.0F, -3.1416F, 0.7854F, -1.5708F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(426, 1712).addBox(3.0F, -19.0F, 218.0F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 10.0F, 337.0F, -3.1416F, 0.0F, 1.5708F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(354, 1730).addBox(7.0F, 3.0F, 206.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(208, 1696).addBox(-7.0F, -11.0F, 206.0F, 4.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(928, 1648)
						.addBox(-7.0F, 17.0F, 206.0F, 32.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(248, 1696).addBox(21.0F, -11.0F, 206.0F, 4.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(928, 1668)
						.addBox(-7.0F, -11.0F, 206.0F, 32.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 10.0F, 326.0F, 3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(426, 1736).addBox(7.0F, -5.0F, 218.0F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 10.0F, 337.0F, 3.1416F, 0.0F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 1792, 1792);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
