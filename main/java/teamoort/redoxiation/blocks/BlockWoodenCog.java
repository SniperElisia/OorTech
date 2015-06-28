package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityWoodenCog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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

}
