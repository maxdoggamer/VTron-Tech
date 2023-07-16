
package net.mcreator.vtrontech.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.vtrontech.init.VtrontechModTabs;

import java.util.List;

public class BreatherItem extends Item {
	public BreatherItem() {
		super(new Item.Properties().tab(VtrontechModTabs.TAB_VTRON_GADGETS).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Provides oxigen when underwater/gas areas"));
	}
}
