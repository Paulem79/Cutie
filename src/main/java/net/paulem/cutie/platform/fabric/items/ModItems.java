package net.paulem.cutie.platform.fabric.items;

//? fabric {
import net.paulem.cutie.ModCutie;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
	public static final Item EXAMPLE_ITEM = register("example_item", Item::new, new Item.Properties());

	public static<T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
		// Create the item key.
		ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ModCutie.MOD_ID, name));

		// Create the item instance.
		T item = itemFactory.apply(settings.setId(itemKey));

		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}

	public static void initialize() {
		ModCutie.LOGGER.info("Registered Mod Items for {}", ModCutie.MOD_ID);
	}
}
//?}
