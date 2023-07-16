package net.mcreator.vtrontech.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.vtrontech.network.VtrontechModVariables;

public class VtronCreditsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format((entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VtrontechModVariables.PlayerVariables())).VtronCredits);
	}
}
