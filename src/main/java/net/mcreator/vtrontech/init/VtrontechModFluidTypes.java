
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.vtrontech.fluid.types.ToxicGasFluidType;
import net.mcreator.vtrontech.VtrontechMod;

public class VtrontechModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, VtrontechMod.MODID);
	public static final RegistryObject<FluidType> TOXIC_GAS_TYPE = REGISTRY.register("toxic_gas", () -> new ToxicGasFluidType());
}
