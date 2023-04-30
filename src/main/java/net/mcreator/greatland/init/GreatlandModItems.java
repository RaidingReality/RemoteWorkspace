
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.greatland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.greatland.GreatlandMod;

public class GreatlandModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GreatlandMod.MODID);
	public static final RegistryObject<Item> WOODLING_SPAWN_EGG = REGISTRY.register("woodling_spawn_egg", () -> new ForgeSpawnEggItem(GreatlandModEntities.WOODLING, -10338785, -10927828, new Item.Properties().tab(GreatlandModTabs.TAB_GREATLAND)));
}
