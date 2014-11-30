package com.teamoort.redoxiation.blocks;

import com.teamoort.redoxiation.Redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ArgentAurum extends Block {

	String name = "ArgentAurum";
	
	public ArgentAurum() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(15.0F);
		
	}

}