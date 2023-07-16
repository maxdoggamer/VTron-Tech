package net.mcreator.vtrontech.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.vtrontech.network.VtrontechModVariables;

public class VtronUsernameProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VtrontechModVariables.PlayerVariables())).VtronUsername;
	}
}
