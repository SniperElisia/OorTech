package teamoort.redoxiation.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityTestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TestBlock extends BlockContainer {
    public TestBlock() {
        super(Material.wood);
        setCreativeTab(Redoxiation.tabRedoxiation);
        setBlockName("TestBlock");
        GameRegistry.registerTileEntity(TileEntityTestBlock.class, Redoxiation.MODID + ".Testblock");
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile != null && tile instanceof TileEntityTestBlock) {
            TileEntityTestBlock multiBlock = (TileEntityTestBlock) tile;
            if (multiBlock.hasMaster()) {
                if (multiBlock.isMaster()) {
                    if (!multiBlock.checkMultiBlockForm())
                        multiBlock.resetStructure();
                } else {
                    if (!multiBlock.checkForMaster()) {
                        multiBlock.reset();
                        world.markBlockForUpdate(x, y, z);
                    }
                }
            }
        }
        super.onNeighborBlockChange(world, x, y, z, block);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityTestBlock();
    }
}