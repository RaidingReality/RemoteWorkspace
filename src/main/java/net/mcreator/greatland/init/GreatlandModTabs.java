
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.greatland.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GreatlandModTabs {
	public static CreativeModeTab TAB_GREATLAND;

	public static void load() {
		TAB_GREATLAND = new CreativeModeTab("tabgreatland") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.SPRUCE_LOG);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
