package teamoort.redoxiation.blocks.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityExampleCog extends TileEntity {
    public float rotation = 0;
    public float scale = 0;

    @Override
    public void updateEntity(){
        /* Increments 0.5  This can be changed */
        if (worldObj.isRemote) rotation += 0.5;
        /* Whatever you want your scale to be */
        if (worldObj.isRemote) scale = (float)0.5;
    }
}
