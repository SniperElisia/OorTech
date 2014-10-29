package com.teamoort.redoxiation;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class RedoxiationGenericItems extends Item{

	public RedoxiationGenericItems(String name)
	{
		
		setUnlocalizedName(Redoxiation.MODID + "_" + name);
		setTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		
	}
	
}
