package com.teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ArgentAurum extends Block {

	String name = "ArgentAurum";
	
	public ArgentAurum() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabOort);
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(15.0F);
		
	}

}