package net.mcreator.vtrontech.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.vtrontech.network.VtrontechModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UnderwaterBreatherProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			if ((entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VtrontechModVariables.PlayerVariables())).SuitEnergy >= 1) {
				if ((entity.getCapability(VtrontechModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new VtrontechModVariables.PlayerVariables())).Breather) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 1, false, false));
				}
			}
		}
	}
}
