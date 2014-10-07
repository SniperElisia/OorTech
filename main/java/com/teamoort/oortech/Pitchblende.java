package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Pitchblende extends Block {

	String name = "Pitchblende";
	
	public Pitchblende() {
		super(Material.rock);
		setBlockName(OorTech.MODID + "_" + name);
		setBlockTextureName(OorTech.MODID + ":" + name);
		setCreativeTab(OorTech.tabOort);
		setHarvestLevel("pickaxe", 2);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}
