package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileFloodFillBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class FloodFillBlock extends BlockContainer{
	
	public FloodFillBlock() {
        super(Material.wood);
        setCreativeTab(Redoxiation.tabRedoxiation);
        setBlockName("FloodFillBlock");
        GameRegistry.registerTileEntity(TileFloodFillBlock.class, Redoxiation.MODID + ".FloodFillBlock");
    }
	
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		TileFloodFillBlock tile = (TileFloodFillBlock)world.getTileEntity(x, y, z);
		int print = tile.fill(x, y, z, 0, 1);
		tile.fill(x, y, z, 0, 0);
		System.out.println("[INFO/REDOXIATION]" + " : " + print);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileFloodFillBlock();
	}
}
