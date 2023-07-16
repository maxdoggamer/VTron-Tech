package net.mcreator.vtrontech.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.vtrontech.VtrontechMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VtrontechModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		VtrontechMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.VtronCredits = original.VtronCredits;
			clone.VtronUsername = original.VtronUsername;
			clone.VtronPadAcquired = original.VtronPadAcquired;
			clone.ShieldGenerator = original.ShieldGenerator;
			clone.JetBoots = original.JetBoots;
			clone.AdaptiveSuit = original.AdaptiveSuit;
			clone.InfraredVisor = original.InfraredVisor;
			clone.Breather = original.Breather;
			clone.ThermalSkin = original.ThermalSkin;
			clone.VirtualStorageSystem = original.VirtualStorageSystem;
			clone.RadiationProofVest = original.RadiationProofVest;
			clone.AdaptiveSuitDetect = original.AdaptiveSuitDetect;
			clone.SuitEnergy = original.SuitEnergy;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("vtrontech", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double VtronCredits = 0;
		public String VtronUsername = "valor0";
		public boolean VtronPadAcquired = false;
		public boolean ShieldGenerator = false;
		public boolean JetBoots = false;
		public boolean AdaptiveSuit = false;
		public boolean InfraredVisor = false;
		public boolean Breather = false;
		public boolean ThermalSkin = false;
		public boolean VirtualStorageSystem = false;
		public boolean RadiationProofVest = false;
		public boolean AdaptiveSuitDetect = false;
		public double SuitEnergy = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				VtrontechMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("VtronCredits", VtronCredits);
			nbt.putString("VtronUsername", VtronUsername);
			nbt.putBoolean("VtronPadAcquired", VtronPadAcquired);
			nbt.putBoolean("ShieldGenerator", ShieldGenerator);
			nbt.putBoolean("JetBoots", JetBoots);
			nbt.putBoolean("AdaptiveSuit", AdaptiveSuit);
			nbt.putBoolean("InfraredVisor", InfraredVisor);
			nbt.putBoolean("Breather", Breather);
			nbt.putBoolean("ThermalSkin", ThermalSkin);
			nbt.putBoolean("VirtualStorageSystem", VirtualStorageSystem);
			nbt.putBoolean("RadiationProofVest", RadiationProofVest);
			nbt.putBoolean("AdaptiveSuitDetect", AdaptiveSuitDetect);
			nbt.putDouble("SuitEnergy", SuitEnergy);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			VtronCredits = nbt.getDouble("VtronCredits");
			VtronUsername = nbt.getString("VtronUsername");
			VtronPadAcquired = nbt.getBoolean("VtronPadAcquired");
			ShieldGenerator = nbt.getBoolean("ShieldGenerator");
			JetBoots = nbt.getBoolean("JetBoots");
			AdaptiveSuit = nbt.getBoolean("AdaptiveSuit");
			InfraredVisor = nbt.getBoolean("InfraredVisor");
			Breather = nbt.getBoolean("Breather");
			ThermalSkin = nbt.getBoolean("ThermalSkin");
			VirtualStorageSystem = nbt.getBoolean("VirtualStorageSystem");
			RadiationProofVest = nbt.getBoolean("RadiationProofVest");
			AdaptiveSuitDetect = nbt.getBoolean("AdaptiveSuitDetect");
			SuitEnergy = nbt.getDouble("SuitEnergy");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.VtronCredits = message.data.VtronCredits;
					variables.VtronUsername = message.data.VtronUsername;
					variables.VtronPadAcquired = message.data.VtronPadAcquired;
					variables.ShieldGenerator = message.data.ShieldGenerator;
					variables.JetBoots = message.data.JetBoots;
					variables.AdaptiveSuit = message.data.AdaptiveSuit;
					variables.InfraredVisor = message.data.InfraredVisor;
					variables.Breather = message.data.Breather;
					variables.ThermalSkin = message.data.ThermalSkin;
					variables.VirtualStorageSystem = message.data.VirtualStorageSystem;
					variables.RadiationProofVest = message.data.RadiationProofVest;
					variables.AdaptiveSuitDetect = message.data.AdaptiveSuitDetect;
					variables.SuitEnergy = message.data.SuitEnergy;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
