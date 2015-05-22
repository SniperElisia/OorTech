package teamoort.Redoxiation.render;

import org.lwjgl.opengl.GL11;

import teamoort.Redoxiation.Redoxiation;
import teamoort.Redoxiation.blocks.tileentity.TileEntityIronCog;
import teamoort.Redoxiation.model.ModelCogs;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderIronCog extends TileEntitySpecialRenderer {
	
	public static final ResourceLocation texture = new ResourceLocation(Redoxiation.MODID, "textures/blocks/IronCog.png");
	
	private ModelCogs model;
	
	public RenderIronCog ()
	{
		this.model = new ModelCogs();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f)
	{
		TileEntityIronCog te = (TileEntityIronCog)tileentity;
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float) y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F,te.getRotation());
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

}
