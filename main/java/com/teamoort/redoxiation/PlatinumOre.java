package com.teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumOre extends Block {

	String name = "PlatinumOre";
	
	public PlatinumOre() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabOort);
		setHarvestLevel("pickaxe", 2);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}