package com.teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LeadObsidian extends Block {

	String name = "LeadObsidian";
	
	public LeadObsidian() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", 3);
		setHardness(50.0F);
		setResistance(2000.0F);
		setStepSound(soundTypePiston);
		
	}

}