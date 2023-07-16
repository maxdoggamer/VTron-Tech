
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.vtrontech.potion.ToxicMobEffect;
import net.mcreator.vtrontech.VtrontechMod;

public class VtrontechModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, VtrontechMod.MODID);
	public static final RegistryObject<MobEffect> TOXIC = REGISTRY.register("toxic", () -> new ToxicMobEffect());
}
