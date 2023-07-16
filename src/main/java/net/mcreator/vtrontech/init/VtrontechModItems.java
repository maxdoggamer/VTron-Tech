
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.vtrontech.item.VtronPadItemItem;
import net.mcreator.vtrontech.item.VirtualStorageSystemItem;
import net.mcreator.vtrontech.item.ThermalSkinItem;
import net.mcreator.vtrontech.item.ShieldGeneratorItem;
import net.mcreator.vtrontech.item.RadiationProofVestItem;
import net.mcreator.vtrontech.item.JetbootsItem;
import net.mcreator.vtrontech.item.InfraredGlassesItem;
import net.mcreator.vtrontech.item.BreatherItem;
import net.mcreator.vtrontech.item.AdaptiveSuitItem;
import net.mcreator.vtrontech.VtrontechMod;

public class VtrontechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VtrontechMod.MODID);
	public static final RegistryObject<Item> VTRON_PAD_ITEM = REGISTRY.register("vtron_pad_item", () -> new VtronPadItemItem());
	public static final RegistryObject<Item> ADAPTIVE_SUIT = REGISTRY.register("adaptive_suit", () -> new AdaptiveSuitItem());
	public static final RegistryObject<Item> SHIELD_GENERATOR = REGISTRY.register("shield_generator", () -> new ShieldGeneratorItem());
	public static final RegistryObject<Item> JETBOOTS = REGISTRY.register("jetboots", () -> new JetbootsItem());
	public static final RegistryObject<Item> INFRARED_GLASSES = REGISTRY.register("infrared_glasses", () -> new InfraredGlassesItem());
	public static final RegistryObject<Item> BREATHER = REGISTRY.register("breather", () -> new BreatherItem());
	public static final RegistryObject<Item> THERMAL_SKIN = REGISTRY.register("thermal_skin", () -> new ThermalSkinItem());
	public static final RegistryObject<Item> RADIATION_PROOF_VEST = REGISTRY.register("radiation_proof_vest", () -> new RadiationProofVestItem());
	public static final RegistryObject<Item> VIRTUAL_STORAGE_SYSTEM = REGISTRY.register("virtual_storage_system", () -> new VirtualStorageSystemItem());
	public static final RegistryObject<Item> SUNBATHER_SPAWN_EGG = REGISTRY.register("sunbather_spawn_egg",
			() -> new ForgeSpawnEggItem(VtrontechModEntities.SUNBATHER, -16711681, -52480, new Item.Properties().tab(VtrontechModTabs.TAB_VTRON_ENTITIES)));
}
