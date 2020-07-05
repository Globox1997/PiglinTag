package net.piglintag;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class PiglinTagMain implements ModInitializer {

	public static final Tag<Item> PIGLIN_NOT_ATTACK = TagRegistry
			.item(new Identifier("piglintag", "piglin_not_attack_items"));

	@Override
	public void onInitialize() {
		System.out.println("Hello Fabric world!");
	}
}