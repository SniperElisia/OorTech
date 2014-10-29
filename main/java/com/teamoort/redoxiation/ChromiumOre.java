package com.teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ChromiumOre extends Block {

	String name = "ChromiumOre";
	
	public ChromiumOre() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", 1);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}