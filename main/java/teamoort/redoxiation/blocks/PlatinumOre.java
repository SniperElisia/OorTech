package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PlatinumOre extends Block {

	String name = "PlatinumOre";
	
	public PlatinumOre() {
		super(Material.rock);
		setBlockName("Redoxiation." + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", 2);
		setHardness(2.5F);
		setResistance(5.0F);
		
	}

}