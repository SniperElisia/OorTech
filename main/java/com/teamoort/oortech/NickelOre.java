package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NickelOre extends Block {

	String name = "NickelOre";
	
	public NickelOre() {
		super(Material.rock);
		setBlockName(OorTech.MODID + "_" + name);
		setBlockTextureName(OorTech.MODID + ":" + name);
		setCreativeTab(OorTech.tabOort);
		setHarvestLevel("pickaxe", 1);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}