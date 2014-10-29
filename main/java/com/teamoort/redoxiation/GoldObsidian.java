package com.teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GoldObsidian extends Block {

	String name = "GoldObsidian";
	
	public GoldObsidian() {
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