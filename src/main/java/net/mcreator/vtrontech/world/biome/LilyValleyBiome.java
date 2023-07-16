
package net.mcreator.vtrontech.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

public class LilyValleyBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-1f, 0.1f), Climate.Parameter.span(-0.5f, 0.4f), Climate.Parameter.span(0.2993f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-1f, 1f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-1f, 0.1f), Climate.Parameter.span(-0.5f, 0.4f), Climate.Parameter.span(0.2993f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.point(1.0f), Climate.Parameter.span(-1f, 1f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-16776961).waterFogColor(329011).skyColor(7972607).foliageColorOverride(-3355444).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).temperature(-1f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
