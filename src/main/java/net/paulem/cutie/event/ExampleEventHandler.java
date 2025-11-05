package net.paulem.cutie.event;

import net.paulem.cutie.ModCutie;
import net.minecraft.server.level.ServerPlayer;

import java.util.Objects;

public class ExampleEventHandler {

	public static void onPlayerHurt(ServerPlayer player) {
		// MinecraftServer.pvp is private... only here to test ATs/AWs
		if (Objects.requireNonNull(player.getServer()).pvp) {
			ModCutie.LOGGER.info("{} took damage. PVP is allowed.", player.getDisplayName());
		} else {
			ModCutie.LOGGER.info("{} took damage. PVP is disallowed.", player.getDisplayName());
		}
	}
}
