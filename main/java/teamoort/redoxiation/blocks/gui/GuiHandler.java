package teamoort.redoxiation.blocks.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import teamoort.redoxiation.blocks.container.ContainerBlastFurnace;
import teamoort.redoxiation.blocks.tileentity.TileBlastFurnaceBlock;

public class GuiHandler implements IGuiHandler {
    private static final int GUIID_MBE_31 = 31;
    public static int getGuiID() {return GUIID_MBE_31;}

    // Gets the server side element for the given gui id this should return a container
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileBlastFurnaceBlock) {
            TileBlastFurnaceBlock tileInventoryFurnace = (TileBlastFurnaceBlock) tileEntity;
            return new ContainerBlastFurnace(player.inventory, tileInventoryFurnace);
        }
        return null;
    }

    // Gets the client side element for the given gui id this should return a gui
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID != getGuiID()) {
            System.err.println("Invalid ID: expected " + getGuiID() + ", received " + ID);
        }

        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileBlastFurnaceBlock) {
            TileBlastFurnaceBlock tileInventoryFurnace = (TileBlastFurnaceBlock) tileEntity;
            return new GuiBlastFurnace(player.inventory, tileInventoryFurnace);
        }
        return null;
    }

}
