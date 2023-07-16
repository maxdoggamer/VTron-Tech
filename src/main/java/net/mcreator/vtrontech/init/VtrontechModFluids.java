
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.vtrontech.fluid.ToxicGasFluid;
import net.mcreator.vtrontech.VtrontechMod;

public class VtrontechModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, VtrontechMod.MODID);
	public static final RegistryObject<FlowingFluid> TOXIC_GAS = REGISTRY.register("toxic_gas", () -> new ToxicGasFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_TOXIC_GAS = REGISTRY.register("flowing_toxic_gas", () -> new ToxicGasFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(TOXIC_GAS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TOXIC_GAS.get(), RenderType.translucent());
		}
	}
}
