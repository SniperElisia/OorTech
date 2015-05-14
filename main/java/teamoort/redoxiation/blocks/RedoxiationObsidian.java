package teamoort.redoxiation.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import teamoort.redoxiation.Redoxiation;

public class RedoxiationObsidian extends Block {
	
	public RedoxiationObsidian(String name, int harvestlevel, float hardness, float resistance) {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "." + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", harvestlevel);
		setHardness(hardness);
		setResistance(resistance);
		setStepSound(soundTypePiston);
	}
}
