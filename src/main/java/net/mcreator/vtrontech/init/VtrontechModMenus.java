
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.vtrontech.world.inventory.VtronMenu;
import net.mcreator.vtrontech.world.inventory.UserRegisterMenu;
import net.mcreator.vtrontech.world.inventory.GadgetsMenu;
import net.mcreator.vtrontech.VtrontechMod;

public class VtrontechModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, VtrontechMod.MODID);
	public static final RegistryObject<MenuType<VtronMenu>> VTRON = REGISTRY.register("vtron", () -> IForgeMenuType.create(VtronMenu::new));
	public static final RegistryObject<MenuType<UserRegisterMenu>> USER_REGISTER = REGISTRY.register("user_register", () -> IForgeMenuType.create(UserRegisterMenu::new));
	public static final RegistryObject<MenuType<GadgetsMenu>> GADGETS = REGISTRY.register("gadgets", () -> IForgeMenuType.create(GadgetsMenu::new));
}
