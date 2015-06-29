package teamoort.redoxiation.blocks.tileentity;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.RedoxiationBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileFloodFillBlock extends TileEntity{
	
	int state;
	int chunknumber;
	
	public boolean checkstate(int x, int y, int z, int st){
		return ((worldObj.getBlock(x, y, z)==RedoxiationBlocks.FloodFillBlock)&&(((TileFloodFillBlock)worldObj.getTileEntity(x, y, z)).state!=st));
	}
	
	public int fill(int x, int y, int z, int checknum, int st){
		checknum++;
		TileEntity tile = worldObj.getTileEntity(x, y, z);
		((TileFloodFillBlock)worldObj.getTileEntity(x, y, z)).state=st;
		if (checkstate(x+1, y, z, st))
		{
			checknum = fill(x+1, y, z, checknum, st);
		}
		if (checkstate(x-1, y, z, st))
		{
			checknum = fill(x-1, y, z, checknum, st);
		}
		if (checkstate(x, y+1, z, st))
		{
			checknum = fill(x, y+1, z, checknum, st);
		}
		if (checkstate(x, y-1, z, st))
		{
			checknum = fill(x, y-1, z, checknum, st);
		}
		if (checkstate(x, y, z+1, st))
		{
			checknum = fill(x, y, z+1, checknum, st);
		}
		if (checkstate(x, y, z-1, st))
		{
			checknum = fill(x, y, z-1, checknum, st);
		}
		return checknum;
	}
	
	public void reset (int x, int y, int z) {
		if (checkstate(x+1, y, z, 1))
		{
			int print = fill(x+1, y, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x-1, y, z, 1))
		{
			int print = fill(x-1, y, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y+1, z, 1))
		{
			int print = fill(x, y+1, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y-1, z, 1))
		{
			int print = fill(x, y-1, z, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y, z+1, 1))
		{
			int print = fill(x, y, z+1, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		if (checkstate(x, y, z-1, 1))
		{
			int print = fill(x, y, z-1, 0, 1);
			System.out.println("[INFO/REDOXIATION]" + " : " + print);
		}
		
		
		if (checkstate(x+1, y, z, 0))
		{
			fill(x+1, y, z, 0, 0);
		}
		if (checkstate(x-1, y, z, 0))
		{
			fill(x-1, y, z, 0, 0);
		}
		if (checkstate(x, y+1, z, 0))
		{
			fill(x, y+1, z, 0, 0);
		}
		if (checkstate(x, y-1, z, 0))
		{
			fill(x, y-1, z, 0, 0);
		}
		if (checkstate(x, y, z+1, 0))
		{
			fill(x, y, z+1, 0, 0);
		}
		if (checkstate(x, y, z-1, 0))
		{
			fill(x, y, z-1, 0, 0);
		}
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
