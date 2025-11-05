package net.paulem.cutie.platform.neoforge.items;

//? neoforge {
/*import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.paulem.cutie.ModCutie;
import net.minecraft.world.item.Item;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModCutie.MOD_ID);

	public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerItem(
			"example_item",
			Item::new, // The factory that the properties will be passed into.
			new Item.Properties() // The properties to use.
	);

	public static void initialize() {
		ModCutie.LOGGER.info("Registered Mod Items for {}", ModCutie.MOD_ID);
	}
}
*///?}
