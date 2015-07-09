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
                if (multiBlock.isMaster()) {
                    if (!multiBlock.checkMultiBlockForm())
                        multiBlock.resetStructure();
                } else {
                    if (!multiBlock.checkForMaster()) {
                        TileBlastFurnaceBlock master = (TileBlastFurnaceBlock) world.getTileEntity(multiBlock.getMasterX(), multiBlock.getMasterY(), multiBlock.getMasterZ());
                        master.resetStructure();
                    }
                }
            }
        }
        super.onNeighborBlockChange(world, x, y, z, block);
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta){
        TileEntity tile = world.getTileEntity(x, y, z);
        if ((tile != null) && (tile instanceof TileBlastFurnaceBlock)) {
            TileBlastFurnaceBlock multiBlock = (TileBlastFurnaceBlock) tile;
            if (multiBlock.isMaster()) {
                multiBlock.resetStructure();
            }
        }
        super.breakBlock(world, x, y, z, block, meta);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileBlastFurnaceBlock();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            if (world.getTileEntity(x, y, z) instanceof TileBlastFurnaceBlock) {
                TileBlastFurnaceBlock tile = (TileBlastFurnaceBlock)world.getTileEntity(x, y, z);
                if (tile.hasmastercheck) {
                    player.openGui(Redoxiation.instance, GUIs.BlastFurnaceBlock.ordinal(), world, x, y, z);
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}