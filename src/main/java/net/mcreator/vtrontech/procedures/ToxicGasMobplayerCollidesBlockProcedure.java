package net.mcreator.vtrontech.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.vtrontech.network.VtrontechModVariables;
import net.mcreator.vtrontech.init.VtrontechModMobEffects;

public class ToxicGasMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VtrontechModVariables.PlayerVariables())).Breather == false) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(VtrontechModMobEffects.TOXIC.get(), 60, 1, false, false));
		}
	}
}
