
package net.mcreator.vtrontech.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.vtrontech.procedures.ToxicGasMobplayerCollidesBlockProcedure;
import net.mcreator.vtrontech.init.VtrontechModFluids;

public class ToxicGasBlock extends LiquidBlock {
	public ToxicGasBlock() {
		super(() -> VtrontechModFluids.TOXIC_GAS.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.NONE).strength(100f).noCollission().noLootTable());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 20;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		ToxicGasMobplayerCollidesBlockProcedure.execute(entity);
	}
}
