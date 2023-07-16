
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vtrontech.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class VtrontechModTabs {
	public static CreativeModeTab TAB_VTRON_ENTITIES;
	public static CreativeModeTab TAB_VTRON_GADGETS;

	public static void load() {
		TAB_VTRON_ENTITIES = new CreativeModeTab("tabvtron_entities") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.WARDEN_SPAWN_EGG);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_VTRON_GADGETS = new CreativeModeTab("tabvtron_gadgets") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(VtrontechModItems.ADAPTIVE_SUIT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
