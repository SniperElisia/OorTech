package teamoort.redoxiation.blocks.tileentity;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.RedoxiationBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityWoodenCog extends TileEntity{
	private int volume = 0;
	private float rotation = 0;
	private float angvel = 0;
	private int state;
	private int chunknumber = 0;
	
	@Override
	public void updateEntity() {
		Redoxiation.logger.info(chunknumber + " " + angvel);
        if (chunknumber != 0)
        {
            angvel = 0.05f/((float)chunknumber);
        }
        else {
            angvel = 0;
        }
		rotation += 0.3141592653589793238462643383279f*angvel;
		if(rotation >= 6.283185307179586476925286766559f) {
			rotation = rotation - 6.283185307179586476925286766559f;
		}
	}

	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int argV) {
		volume = argV;
	}
	
	public float getRotation() {
		return rotation;
	}
	
	public void setRotation(float argR) {
		rotation = argR;
	}

	//rotation save to NBT
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		rotation = compound.getFloat("rotation");
		angvel = compound.getFloat("angvel");
        chunknumber = compound.getInteger("chunknumber");
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super. writeToNBT(compound);
		compound.setFloat("rotation", rotation);
		compound.setFloat("angvel", angvel);
        compound.setInteger("chunknumber", chunknumber);
	}

	//Server<->Client
	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);
		
		return new S35PacketUpdateTileEntity(this.xCoord,this.yCoord,this.zCoord,this.blockMetadata,tag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		NBTTagCompound tag = pkt.func_148857_g();
		this.readFromNBT(tag);
	}
	
	//FloodFill
	public boolean checkstate(int x, int y, int z, int st){
		return ((worldObj.getBlock(x, y, z)==RedoxiationBlocks.WoodenCog)&&(((TileEntityWoodenCog)worldObj.getTileEntity(x, y, z)).state!=st));
	}
	
	public int state(){
		return state;
	}
	
	public int fill(int x, int y, int z, int checknum, int st){
		checknum++;
		TileEntity tile = worldObj.getTileEntity(x, y, z);
		((TileEntityWoodenCog)tile).state=st;
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
		((TileEntityWoodenCog)tile).setchunknumber(checknum);
		return checknum;
	}
	
	public int setfill(int x, int y, int z, int checknum, int st){
		((TileEntityWoodenCog)(worldObj.getTileEntity(x, y, z))).setstate(st);
		((TileEntityWoodenCog)(worldObj.getTileEntity(x, y, z))).setchunknumber(checknum);
		if (checkstate(x+1, y, z, st))
		{
			setfill(x+1, y, z, checknum, st);
		}
		if (checkstate(x-1, y, z, st))
		{
			setfill(x-1, y, z, checknum, st);
		}
		if (checkstate(x, y+1, z, st))
		{
			setfill(x, y+1, z, checknum, st);
		}
		if (checkstate(x, y-1, z, st))
		{
			setfill(x, y-1, z, checknum, st);
		}
		if (checkstate(x, y, z+1, st))
		{
			setfill(x, y, z+1, checknum, st);
		}
		if (checkstate(x, y, z-1, st))
		{
			setfill(x, y, z-1, checknum, st);
		}
		return checknum;
	}

	public int chunknumber() {
		return chunknumber;
	}

	public void setchunknumber(int chunknumber) {
		this.chunknumber = chunknumber;
	}
	
	public void setstate(int state) {
		this.state = state;
	}
}