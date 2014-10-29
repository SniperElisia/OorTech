package com.teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PseudoBronzeOre extends Block {

	String name = "PseudoBronzeOre";
	
	public PseudoBronzeOre() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabOort);
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(15.0F);
		
	}

}