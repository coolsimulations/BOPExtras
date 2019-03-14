package net.coolsimulations.BOPExtras.core;

import static net.coolsimulations.BOPExtras.api.item.BOPExtrasItems.*;

import biomesoplenty.common.util.inventory.ItemGroupBOP;
import biomesoplenty.core.BiomesOPlenty;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class ExtrasItems {
	
	
	public static void init() {
		
		ebony_boat = registerItem(new Item(new Item.Properties().group(ItemGroupBOP.instance)), "ebony_boat");
		eucalyptus_boat = registerItem(new Item(new Item.Properties().group(ItemGroupBOP.instance)), "eucalyptus_boat");
		mangrove_boat = registerItem(new Item(new Item.Properties().group(ItemGroupBOP.instance)), "mangrove_boat");
		pine_boat = registerItem(new Item(new Item.Properties().group(ItemGroupBOP.instance)), "pine_boat");
		sacred_oak_boat = registerItem(new Item(new Item.Properties().group(ItemGroupBOP.instance)), "sacred_oak_boat");
	}
	
	public static Item registerItem(Item item, String name)
    {
    	item.setRegistryName(BiomesOPlenty.MOD_ID, name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

}
