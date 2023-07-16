
package net.mcreator.vtrontech.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ToxicMobEffect extends MobEffect {
	public ToxicMobEffect() {
		super(MobEffectCategory.HARMFUL, -16751104);
	}

	@Override
	public String getDescriptionId() {
		return "effect.vtrontech.toxic";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
