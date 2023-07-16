package net.mcreator.vtrontech.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.vtrontech.network.VtrontechModVariables;
import net.mcreator.vtrontech.init.VtrontechModItems;

import java.util.function.Supplier;
import java.util.Map;

public class BreatherDetectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == VtrontechModItems.BREATHER.get()) {
			{
				boolean _setval = true;
				entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Breather = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Breather = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
