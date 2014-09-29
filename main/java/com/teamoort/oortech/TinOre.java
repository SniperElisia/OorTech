package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class TinOre extends Block{

	public TinOre(int id, Material mat){
		super (mat);
		this.setCreativeTab(OorTech.tabOort);
		this.setHarvestLevel("pickaxe",1);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon("oortech:TinOre");
    }
	
}

