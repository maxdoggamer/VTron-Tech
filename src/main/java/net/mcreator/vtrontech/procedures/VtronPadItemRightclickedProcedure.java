package net.mcreator.vtrontech.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.vtrontech.network.VtrontechModVariables;

public class VtronPadItemRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VtrontechModVariables.PlayerVariables())).VtronPadAcquired == true) {
			{
				boolean _setval = false;
				entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.VtronPadAcquired = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = true;
				entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.VtronPadAcquired = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
