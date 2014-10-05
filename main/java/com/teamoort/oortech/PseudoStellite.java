package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PseudoStellite extends Block {

	String name = "PseudoStellite";
	
	public PseudoStellite() {
		super(Material.rock);
		setBlockName(OorTech.MODID + "_" + name);
		setBlockTextureName(OorTech.MODID + ":" + name);
		setCreativeTab(OorTech.tabOort);
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(15.0F);
		
	}

}