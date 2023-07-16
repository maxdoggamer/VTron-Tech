
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.vtrontech.client.gui.VtronScreen;
import net.mcreator.vtrontech.client.gui.UserRegisterScreen;
import net.mcreator.vtrontech.client.gui.GadgetsScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VtrontechModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(VtrontechModMenus.VTRON.get(), VtronScreen::new);
			MenuScreens.register(VtrontechModMenus.USER_REGISTER.get(), UserRegisterScreen::new);
			MenuScreens.register(VtrontechModMenus.GADGETS.get(), GadgetsScreen::new);
		});
	}
}
