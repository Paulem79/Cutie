package net.paulem.cutie.platform.fabric;

//? fabric {

import net.paulem.cutie.ModCutie;
import net.fabricmc.api.ModInitializer;
import net.paulem.cutie.platform.fabric.items.ModItems;

public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		ModCutie.onInitialize();
		FabricEventSubscriber.registerEvents();

		ModItems.initialize();
	}
}
//?}
