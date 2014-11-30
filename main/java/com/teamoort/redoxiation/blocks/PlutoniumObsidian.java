package com.teamoort.redoxiation.blocks;

import com.teamoort.redoxiation.Redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlutoniumObsidian extends Block {

	String name = "PlutoniumObsidian";
	
	public PlutoniumObsidian() {
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