package teamoort.redoxiation.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.gui.GUIs;
import teamoort.redoxiation.blocks.tileentity.TileBlastFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlastFurnaceBlock extends BlockContainer {
	
	private boolean multiblock = false;
	
	public void setmultiblock(boolean bool) {
		multiblock = bool;
	}

    public BlastFurnaceBlock() {
        super(Material.wood);
        setCreativeTab(Redoxiation.tabRedoxiation);
        setBlockName("BlastFurnaceBlock");
        GameRegistry.registerTileEntity(TileBlastFurnaceBlock.class, Redoxiation.MODID + ".BlastFurnaceBlock");
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile != null && tile instanceof TileBlastFurnaceBlock) {
            TileBlastFurnaceBlock multiBlock = (TileBlastFurnaceBlock) tile;
            if (multiBlock.hasMaster()) {
                int mX = multiBlock.getMasterX();
                int mY = multiBlock.getMasterY();
                int mZ = multiBlock.getMasterZ();
                if (multiBlock.isMaster()) {
                    if (!multiBlock.checkMultiBlockForm()) {
                        multiBlock.resetStructure();
                    }
                }
                else {
                    if (!multiBlock.checkForMaster()) {
                        multiBlock.reset();
                        world.markBlockForUpdate(x, y, z);
                    }
                    else {
                    	TileBlastFurnaceBlock mastertile = (TileBlastFurnaceBlock) world.getTileEntity(mX, mY, mZ);
                    	if (mastertile.isMaster()) {
                    		if (!mastertile.checkMultiBlockForm()) {
                    			mastertile.resetStructure();
                    		}
                    	}
                    }
                }
            }
        }
        super.onNeighborBlockChange(world, x, y, z, block);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileBlastFurnaceBlock();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
    	TileEntity tile = world.getTileEntity(x, y, z);
    	boolean hasmaster = ((TileBlastFurnaceBlock)tile).hasMaster();
        if(hasmaster) {
            if (world.isRemote) {
            	player.openGui(Redoxiation.instance, GUIs.BlastFurnaceBlock.ordinal(), world, x, y, z);
                return true;
            }
            return true;
        }
        return false;
    }
}