package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class TinOre extends Block {

	String name = "TinOre";
	
	public TinOre() {
		super(Material.rock);
		setBlockName("Redoxiation." + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", 1);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}