package teamoort.Redoxiation.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import teamoort.Redoxiation.Redoxiation;

public class RedoxiationOre extends Block {
	
	public RedoxiationOre(String type, String name, int harvestlevel, float hardness, float resistance) {
		
		super(Material.rock);
		
		setBlockName(Redoxiation.MODID + "." + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", harvestlevel);
		setHardness(hardness);
		setResistance(resistance);
		if(type=="Obsidian") {
			setStepSound(soundTypePiston);
		} 
	}
}
