package com.teamoort.oortech;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Limestone extends Block{

	public Limestone(int id, Material mat){
		super (mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public Item getItemDropped(int metadata, Random random,int fortune){
		return OorTech.Calcite;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon("oortech:Limestone");
    }
	
}
