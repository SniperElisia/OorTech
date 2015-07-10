package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityWoodenCog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockWoodenCog extends BlockContainer{
	
	public BlockWoodenCog()
	{
		super(Material.wood);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setBlockName("WoodenCog");
		GameRegistry.registerTileEntity(TileEntityWoodenCog.class, Redoxiation.MODID + ".WoodenCog");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i)
	{
		return new TileEntityWoodenCog();
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return Redoxiation.MODID + ".WoodenCog";
	}
	
	@Override
	public int getRenderType()
	{
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	public boolean checkstate(int x, int y, int z, int st, World world){
		return ((world.getBlock(x, y, z)==RedoxiationBlocks.WoodenCog)&&(((TileEntityWoodenCog)world.getTileEntity(x, y, z)).state()!=st));
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		TileEntityWoodenCog tile = (TileEntityWoodenCog)world.getTileEntity(x, y, z);
		int print = tile.fill(x, y, z, 0, 1);
		tile.fill(x, y, z, 0, 0);
		System.out.println("[INFO/REDOXIATION]" + " : " + print);
	}
	
	public void breakBlock(World world, int x, int y, int z, Block block, int meta){

		if (checkstate(x+1, y, z, 1, world))
		{
			int print = ((TileEntityWoodenCog)world.getTileEntity(x+1, y, z)).fill(x+1, y, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x-1, y, z, 1, world))
		{
			int print = ((TileEntityWoodenCog)world.getTileEntity(x-1, y, z)).fill(x-1, y, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y+1, z, 1, world))
		{
			int print = ((TileEntityWoodenCog)world.getTileEntity(x, y+1, z)).fill(x, y+1, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y-1, z, 1, world))
		{
			int print = ((TileEntityWoodenCog)world.getTileEntity(x, y-1, z)).fill(x, y-1, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y, z+1, 1, world))
		{
			int print = ((TileEntityWoodenCog)world.getTileEntity(x, y, z+1)).fill(x, y, z+1, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y, z-1, 1, world))
		{
			int print = ((TileEntityWoodenCog)world.getTileEntity(x, y, z-1)).fill(x, y, z-1, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		
		
		if (checkstate(x+1, y, z, 0, world))
		{
			((TileEntityWoodenCog)world.getTileEntity(x+1, y, z)).fill(x+1, y, z, 0, 0);
		}
		if (checkstate(x-1, y, z, 0, world))
		{
			((TileEntityWoodenCog)world.getTileEntity(x-1, y, z)).fill(x-1, y, z, 0, 0);
		}
		if (checkstate(x, y+1, z, 0, world))
		{
			((TileEntityWoodenCog)world.getTileEntity(x, y+1, z)).fill(x, y+1, z, 0, 0);
		}
		if (checkstate(x, y-1, z, 0, world))
		{
			((TileEntityWoodenCog)world.getTileEntity(x, y-1, z)).fill(x, y-1, z, 0, 0);
		}
		if (checkstate(x, y, z+1, 0, world))
		{
			((TileEntityWoodenCog)world.getTileEntity(x, y, z+1)).fill(x, y, z+1, 0, 0);
		}
		if (checkstate(x, y, z-1, 0, world))
		{
			((TileEntityWoodenCog)world.getTileEntity(x, y, z-1)).fill(x, y, z-1, 0, 0);
		}
		
	}

}
