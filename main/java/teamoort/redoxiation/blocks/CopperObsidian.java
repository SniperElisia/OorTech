package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CopperObsidian extends Block {

	String name = "CopperObsidian";
	
	public CopperObsidian() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "." + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", 3);
		setHardness(50.0F);
		setResistance(2000.0F);
		setStepSound(soundTypePiston);
		
	}

}