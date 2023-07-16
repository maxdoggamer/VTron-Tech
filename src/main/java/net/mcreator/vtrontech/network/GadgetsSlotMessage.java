
package net.mcreator.vtrontech.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.vtrontech.world.inventory.GadgetsMenu;
import net.mcreator.vtrontech.procedures.VirtualStorageDetectProcedure;
import net.mcreator.vtrontech.procedures.ThermalSkinDetectProcedure;
import net.mcreator.vtrontech.procedures.ShieldgeneratorDetectProcedure;
import net.mcreator.vtrontech.procedures.RadiationProofVestDetectProcedure;
import net.mcreator.vtrontech.procedures.JetBootsDetectProcedure;
import net.mcreator.vtrontech.procedures.InfraredVisorDetectProcedure;
import net.mcreator.vtrontech.procedures.BreatherDetectProcedure;
import net.mcreator.vtrontech.VtrontechMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GadgetsSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public GadgetsSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public GadgetsSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(GadgetsSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(GadgetsSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = GadgetsMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 1 && changeType == 0) {

			ShieldgeneratorDetectProcedure.execute(entity);
		}
		if (slotID == 2 && changeType == 0) {

			JetBootsDetectProcedure.execute(entity);
		}
		if (slotID == 3 && changeType == 0) {

			InfraredVisorDetectProcedure.execute(entity);
		}
		if (slotID == 4 && changeType == 0) {

			BreatherDetectProcedure.execute(entity);
		}
		if (slotID == 5 && changeType == 0) {

			ThermalSkinDetectProcedure.execute(entity);
		}
		if (slotID == 6 && changeType == 0) {

			VirtualStorageDetectProcedure.execute(entity);
		}
		if (slotID == 7 && changeType == 0) {

			RadiationProofVestDetectProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		VtrontechMod.addNetworkMessage(GadgetsSlotMessage.class, GadgetsSlotMessage::buffer, GadgetsSlotMessage::new, GadgetsSlotMessage::handler);
	}
}
