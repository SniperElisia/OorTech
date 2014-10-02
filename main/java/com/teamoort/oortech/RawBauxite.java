package com.teamoort.oortech;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RawBauxite extends Item{
	
	public RawBauxite(int id){
		super();
		this.setCreativeTab(OorTech.tabOort);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("oortech:RawBauxite");
	}

}
