
package net.mcreator.vtrontech.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.vtrontech.entity.model.SunbatherModel;
import net.mcreator.vtrontech.entity.SunbatherEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SunbatherRenderer extends GeoEntityRenderer<SunbatherEntity> {
	public SunbatherRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SunbatherModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(SunbatherEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(SunbatherEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
