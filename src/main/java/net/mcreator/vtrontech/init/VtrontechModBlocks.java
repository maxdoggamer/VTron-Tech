
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.vtrontech.block.ToxicGasBlock;
import net.mcreator.vtrontech.VtrontechMod;

public class VtrontechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VtrontechMod.MODID);
	public static final RegistryObject<Block> TOXIC_GAS = REGISTRY.register("toxic_gas", () -> new ToxicGasBlock());
}
