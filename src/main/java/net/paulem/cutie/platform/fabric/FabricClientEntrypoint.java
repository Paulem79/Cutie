package net.paulem.cutie.platform.fabric;

//? fabric {

import net.paulem.cutie.ModCutie;
import net.fabricmc.api.ClientModInitializer;

public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ModCutie.onInitializeClient();
	}

}
//?}
