package teamoort.redoxiation.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityExampleCog;

public class BlockExampleCog extends BlockContainer{
    public BlockExampleCog() {
        super(Material.wood);
        setCreativeTab(Redoxiation.tabRedoxiation);
        this.setBlockName("ExampleCog");
        GameRegistry.registerTileEntity(TileEntityExampleCog.class, Redoxiation.MODID + ".ExampleCog");
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityExampleCog();
    }
}
