package com.teamoort.redoxiation;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TinIngot extends Item{
	
	public TinIngot(int id){
		super();
		this.setCreativeTab(Redoxiation.tabRedoxiation);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("Redoxiation:TinIngot");
	}

}
