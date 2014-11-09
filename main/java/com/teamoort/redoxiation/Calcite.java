package com.teamoort.redoxiation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Calcite extends Item{
	
	public Calcite(int id){
		super();
		this.setCreativeTab(Redoxiation.tabRedoxiation);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("Redoxiation:Calcite");
	}

}