package teamoort.redoxiation.blocks.tileentity;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.RedoxiationBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileFloodFillBlock extends TileEntity{
	
	int ischeckpoint, state;
	int chunknumber;
	
	public boolean checkstate(int x, int y, int z){
		return ((worldObj.getBlock(x, y, z)==RedoxiationBlocks.FloodFillBlock)&&(((TileFloodFillBlock)worldObj.getTileEntity(x, y, z)).state==0));
	}
	
	public int fill(int x, int y, int z, int checknum){
		checknum++;
		TileEntity tile = worldObj.getTileEntity(x, y, z);
		((TileFloodFillBlock)worldObj.getTileEntity(x, y, z)).state=1;
		if (checkstate(x+1, y, z))
		{
			checknum = fill(x+1, y, z, checknum);
		}
		else if (checkstate(x-1, y, z))
		{
			checknum = fill(x-1, y, z, checknum);
		}
		else if (checkstate(x, y+1, z))
		{
			checknum = fill(x, y+1, z, checknum);
		}
		else if (checkstate(x, y-1, z))
		{
			checknum = fill(x, y-1, z, checknum);
		}
		else if (checkstate(x, y, z+1))
		{
			checknum = fill(x, y, z+1, checknum);
		}
		else if (checkstate(x, y, z-1))
		{
			checknum = fill(x, y, z-1, checknum);
		}
		return checknum;
	}
	
	@Override
	public void updateEntity() {
		super.updateEntity();
	}
	
	@Override
    public void writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);
        data.setInteger("chunknumber", chunknumber);
    }

    @Override
    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        chunknumber = data.getInteger("chunknumber");
    }
}
