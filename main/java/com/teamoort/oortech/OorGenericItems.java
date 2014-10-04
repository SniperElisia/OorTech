package com.teamoort.oortech;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OorGenericItems extends Item{

	public OorGenericItems(String name)
	{
		
		setUnlocalizedName(OorTech.MODID + "_" + name);
		setTextureName(OorTech.MODID + ":" + name);
		setCreativeTab(OorTech.tabOort);
		
	}
	
}
