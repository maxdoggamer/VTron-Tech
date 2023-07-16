
package net.mcreator.vtrontech.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.vtrontech.init.VtrontechModFluids;
import net.mcreator.vtrontech.init.VtrontechModFluidTypes;
import net.mcreator.vtrontech.init.VtrontechModBlocks;

public abstract class ToxicGasFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> VtrontechModFluidTypes.TOXIC_GAS_TYPE.get(), () -> VtrontechModFluids.TOXIC_GAS.get(), () -> VtrontechModFluids.FLOWING_TOXIC_GAS.get())
			.explosionResistance(100f).tickRate(4).slopeFindDistance(1).block(() -> (LiquidBlock) VtrontechModBlocks.TOXIC_GAS.get());

	private ToxicGasFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ToxicGasFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ToxicGasFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
