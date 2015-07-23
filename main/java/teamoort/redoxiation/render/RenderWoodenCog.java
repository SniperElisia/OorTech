package teamoort.redoxiation.render;

import org.lwjgl.opengl.GL11;

import teamoort.redoxiation.Redoxiation;
import teamoort.redoxiation.blocks.tileentity.TileEntityWoodenCog;
import teamoort.redoxiation.model.ModelCogs;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderWoodenCog extends TileEntitySpecialRenderer {

	private ResourceLocation texture;
	private ResourceLocation objModelLocation;
	private IModelCustom model;

	public RenderWoodenCog() {
		texture = new ResourceLocation(Redoxiation.MODID, "models/WoodenCog.png");
        objModelLocation = new ResourceLocation(Redoxiation.MODID, "models/CogModel1.obj");
        model = AdvancedModelLoader.loadModel(objModelLocation);
	}
	
	@Override
    public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
		TileEntityWoodenCog te2 = (TileEntityWoodenCog) te;
		float rotation = te2.getRotation() + (timeSinceLastTick / 2F);
		float scale = te2.getScale();
		
		bindTexture(texture);

		GL11.glPushMatrix();
		GL11.glTranslated(posX + 0.5, posY + 0.5, posZ + 0.5);
		GL11.glScalef(scale, scale, scale);
		GL11.glPushMatrix();
		GL11.glRotatef(rotation, 0F, 1F, 0.5F);
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

}
