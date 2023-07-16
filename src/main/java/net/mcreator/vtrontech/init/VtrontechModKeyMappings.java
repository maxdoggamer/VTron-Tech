
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.vtrontech.network.VpadOpenMessage;
import net.mcreator.vtrontech.VtrontechMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class VtrontechModKeyMappings {
	public static final KeyMapping VPAD_OPEN = new KeyMapping("key.vtrontech.vpad_open", GLFW.GLFW_KEY_V, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				VtrontechMod.PACKET_HANDLER.sendToServer(new VpadOpenMessage(0, 0));
				VpadOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(VPAD_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				VPAD_OPEN.consumeClick();
			}
		}
	}
}
