package net.mcreator.vtrontech.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.vtrontech.world.inventory.UserRegisterMenu;
import net.mcreator.vtrontech.network.UserRegisterButtonMessage;
import net.mcreator.vtrontech.VtrontechMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class UserRegisterScreen extends AbstractContainerScreen<UserRegisterMenu> {
	private final static HashMap<String, Object> guistate = UserRegisterMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Username;
	Button button_register;

	public UserRegisterScreen(UserRegisterMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 361;
		this.imageHeight = 239;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		Username.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/vtronpad.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + -1, 0, 0, 361, 239, 361, 239);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Username.isFocused())
			return Username.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Username.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.vtrontech.user_register.label_please_enter_an_username"), 117, 52, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.vtrontech.user_register.label_welcome_to_vtron"), 135, 43, -13369345);
		this.font.draw(poseStack, Component.translatable("gui.vtrontech.user_register.label_in_order_to_access"), 135, 61, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		Username = new EditBox(this.font, this.leftPos + 99, this.topPos + 70, 162, 20, Component.translatable("gui.vtrontech.user_register.Username"));
		Username.setMaxLength(32767);
		guistate.put("text:Username", Username);
		this.addWidget(this.Username);
		button_register = new Button(this.leftPos + 144, this.topPos + 88, 67, 20, Component.translatable("gui.vtrontech.user_register.button_register"), e -> {
			if (true) {
				VtrontechMod.PACKET_HANDLER.sendToServer(new UserRegisterButtonMessage(0, x, y, z));
				UserRegisterButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_register", button_register);
		this.addRenderableWidget(button_register);
	}
}
