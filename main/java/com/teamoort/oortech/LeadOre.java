package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class LeadOre extends Block{
	
	public LeadOre(int id, Material mat)
	{
		super (mat);
		this.setCreativeTab(OorTech.tabOort);
		this.setHarvestLevel("pickaxe",1);
		this.setHardness(2.5F);
		this.setResistance(5.0F);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister icon)
    {
        this.blockIcon = icon.registerIcon("oortech:LeadOre");
    }
	
}
