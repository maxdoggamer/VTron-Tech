package net.mcreator.vtrontech.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.vtrontech.world.inventory.VtronMenu;
import net.mcreator.vtrontech.procedures.VtronUsernameProcedure;
import net.mcreator.vtrontech.procedures.VtronCreditsProcedure;
import net.mcreator.vtrontech.procedures.PlayerModelRendererProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class VtronScreen extends AbstractContainerScreen<VtronMenu> {
	private final static HashMap<String, Object> guistate = VtronMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public VtronScreen(VtronMenu container, Inventory inventory, Component text) {
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
		if (PlayerModelRendererProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 290, this.topPos + 55, 30, 0f, 0, livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/vtronpad.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + -1, 0, 0, 361, 239, 361, 239);

		RenderSystem.setShaderTexture(0, new ResourceLocation("vtrontech:textures/screens/vtronlogo.png"));
		this.blit(ms, this.leftPos + 306, this.topPos + 7, 0, 0, 30, 30, 30, 30);

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
		this.font.draw(poseStack, Component.translatable("gui.vtrontech.vtron.label_balance"), 9, 7, -39373);
		this.font.draw(poseStack,

				VtronUsernameProcedure.execute(entity), 198, 16, -16776961);
		this.font.draw(poseStack,

				VtronCreditsProcedure.execute(entity), 54, 7, -39424);
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
