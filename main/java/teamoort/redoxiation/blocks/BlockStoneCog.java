package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityStoneCog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockStoneCog extends BlockContainer {

	public BlockStoneCog() {
		super(Material.rock);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setBlockName("StoneCog");
		GameRegistry.registerTileEntity(TileEntityStoneCog.class, Redoxiation.MODID + ".StoneCog");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityStoneCog();
	}

	@Override
	public String getUnlocalizedName() {
		return "tile." + Redoxiation.MODID + ".StoneCog";
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
}
