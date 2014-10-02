package com.teamoort.oortech;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class Bauxite extends Block{

	public Bauxite(int id, Material mat){
		super (mat);
		this.setCreativeTab(OorTech.tabOort);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
	}
	
	public Item getItemDropped(int metadata, Random random,int fortune){
		return OorTech.RawBauxite;
	}
	
	public int quantityDropped(Random random)
    {
        return 4;
    }
	
	@Override
	public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon("oortech:Bauxite");
    }
	
}
