package net.paulem.cutie.items;

import net.minecraft.world.item.Item;

import java.util.Set;
import java.util.function.Function;

public class ModCommonItems {
	public static Set<ItemRegister<?>> ITEMS = Set.of(
			new ItemRegister<>("example_item", Item::new, new Item.Properties())
	);

	public record ItemRegister<T extends Item>(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
	}
}
