package teamoort.redoxiation.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityExampleCog;

public class RenderExampleCog extends TileEntitySpecialRenderer {
    ResourceLocation texture;
    ResourceLocation objModelLocation;
    IModelCustom model;
    public RenderExampleCog() {
        texture = new ResourceLocation(Redoxiation.MODID, "textures/models/ExampleCogTexture.png");
        objModelLocation = new ResourceLocation(Redoxiation.MODID, "textures/models/ExampleCogModel.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double posX, double posY, double posZ, float timeSinceLastTick) {
        TileEntityExampleCog te = (TileEntityExampleCog) tileentity;
        float rotation = te.rotation + (timeSinceLastTick / 2F);
        float scale = te.scale;
        bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glTranslated(posX + 0.5, posY, posZ + 0.5);
        GL11.glScalef(scale, scale, scale);
        GL11.glPushMatrix();
        GL11.glRotatef(rotation, 0F, 1F, 0F);
        model.renderAll();
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
