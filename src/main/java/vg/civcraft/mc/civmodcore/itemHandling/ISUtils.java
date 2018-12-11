package vg.civcraft.mc.civmodcore.itemHandling;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ISUtils {

	static void addLore(ItemStack is, String... lore) {
		ItemMeta im = is.getItemMeta();
		List<String> loreList = im.getLore();
		if (loreList == null) {
			loreList = new LinkedList<>();
		}
		Collections.addAll(loreList, lore);
		im.setLore(loreList);
		is.setItemMeta(im);

	}

	public static void setLore(ItemStack is, String... lore) {
		ItemMeta im = is.getItemMeta();
		List<String> loreList = new LinkedList<>();
		Collections.addAll(loreList, lore);
		im.setLore(loreList);
		is.setItemMeta(im);
	}

	public static void setName(ItemStack is, String name) {
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(name);
		is.setItemMeta(im);
	}

	public static String getName(ItemStack is) {
		return is.getItemMeta().getDisplayName();
	}

	public static void setDurability(ItemStack is, int durability) {
		ItemMeta meta = is.getItemMeta();
		if (meta != null) {
			((Damageable) meta).setDamage(durability);
			is.setItemMeta(meta);
		}
	}

	static int getDurability(ItemStack is) {
		ItemMeta meta = is.getItemMeta();
		if (meta != null) {
			return ((Damageable) meta).getDamage();
		} else {
			return 0;
		}
	}

}
