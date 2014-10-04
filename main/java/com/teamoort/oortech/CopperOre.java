package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends Block {

	String name = "CopperOre";
	
	public CopperOre() {
		super(Material.rock);
		setBlockName(OorTech.MODID + "_" + name);
		setBlockTextureName(OorTech.MODID + ":" + name);
		setCreativeTab(OorTech.tabOort);
		setHarvestLevel("pickaxe", 1);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}