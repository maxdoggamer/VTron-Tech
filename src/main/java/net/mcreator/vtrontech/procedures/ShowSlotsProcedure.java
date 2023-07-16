package net.mcreator.vtrontech.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.vtrontech.init.VtrontechModItems;

import java.util.function.Supplier;
import java.util.Map;

public class ShowSlotsProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == VtrontechModItems.ADAPTIVE_SUIT
				.get()) {
			return true;
		}
		return false;
	}
}
