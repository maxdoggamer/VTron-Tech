package net.mcreator.vtrontech.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.vtrontech.world.inventory.GadgetsMenu;
import net.mcreator.vtrontech.procedures.ShowSlotsProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GadgetsScreen extends AbstractContainerScreen<GadgetsMenu> {
	private final static HashMap<String, Object> guistate = GadgetsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GadgetsScreen(GadgetsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 226;
		this.imageHeight = 241;
	}

	private static final ResourceLocation texture = new ResourceLocation("vtrontech:textures/screens/gadgets.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (ShowSlotsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/shieldgenerator.png"));
			this.blit(ms, this.leftPos + 31, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/adaptivesuit.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 8, 0, 0, 16, 16, 16, 16);

		if (ShowSlotsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/jetboots.png"));
			this.blit(ms, this.leftPos + 31, this.topPos + 53, 0, 0, 16, 16, 16, 16);
		}
		if (ShowSlotsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/infraredvisor.png"));
			this.blit(ms, this.leftPos + 31, this.topPos + 71, 0, 0, 16, 16, 16, 16);
		}
		if (ShowSlotsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/breather.png"));
			this.blit(ms, this.leftPos + 121, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (ShowSlotsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/thermalskin.png"));
			this.blit(ms, this.leftPos + 121, this.topPos + 53, 0, 0, 16, 16, 16, 16);
		}
		if (ShowSlotsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/virtualstoragesystem.png"));
			this.blit(ms, this.leftPos + 121, this.topPos + 71, 0, 0, 16, 16, 16, 16);
		}
		if (ShowSlotsProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/radiationproofvest.png"));
			this.blit(ms, this.leftPos + 77, this.topPos + 90, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		if (ShowSlotsProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.vtrontech.gadgets.label_no_suit_detected"), 121, 8, -65536);
		if (ShowSlotsProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.vtrontech.gadgets.label_gadgets_inactive"), 121, 17, -65536);
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
	}
}
