package net.paulem.cutie.platform.neoforge.items;

//? neoforge {
/*import net.neoforged.neoforge.registries.DeferredRegister;
import net.paulem.cutie.ModCutie;
import net.paulem.cutie.items.ModCommonItems;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModCutie.MOD_ID);

	public static void initialize() {
		ModCutie.LOGGER.info("Registered Mod Items for {}", ModCutie.MOD_ID);

		for (ModCommonItems.ItemRegister<?> itemRegister : ModCommonItems.ITEMS) {
			ITEMS.registerItem(itemRegister.name(), itemRegister.itemFactory(), itemRegister.settings());
		}
	}
}
*///?}
