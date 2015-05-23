package teamoort.Redoxiation.blocks.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import teamoort.Redoxiation.Redoxiation;

public class GuiBlastFurnace extends GuiScreen {
    int x, y, z;
    EntityPlayer player;
    World world;
    private int xSize, ySize;

    private ResourceLocation backgroundimage = new ResourceLocation(Redoxiation.MODID + ":" + "textures/gui/GuiBlastFurnace.png");

    public GuiBlastFurnace(EntityPlayer player, World world, int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.player = player;
        this.world = world;
        xSize = 176;
        ySize = 166;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float renderPartialTicks) {
        this.mc.getTextureManager().bindTexture(backgroundimage);
        int x = (this.width - xSize) / 2;
        int y = (this.height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize,  ySize);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
