package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityIronCog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockIronCog extends BlockContainer{
	
	@SideOnly(Side.CLIENT)
	public BlockIronCog()
	{
		super(Material.ground);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setBlockName("IronCog");
		GameRegistry.registerTileEntity(TileEntityIronCog.class, Redoxiation.MODID + ".IronCog");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i)
	{
		return new TileEntityIronCog();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		TileEntityIronCog tile = (TileEntityIronCog) world.getTileEntity(x, y, z);
		tile.setRotation(tile.getRotation() + 0.06544984694978735913463840381832f);
		return true;
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return Redoxiation.MODID + ".IronCog";
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

}
