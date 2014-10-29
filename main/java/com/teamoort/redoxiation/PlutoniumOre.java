package com.teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlutoniumOre extends Block {

	String name = "PlutoniumOre";
	
	public PlutoniumOre() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabOort);
		setHarvestLevel("pickaxe", 3);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}