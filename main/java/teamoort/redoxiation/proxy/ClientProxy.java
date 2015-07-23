package teamoort.redoxiation.proxy;

import teamoort.redoxiation.blocks.RedoxiationBlocks;
import teamoort.redoxiation.blocks.tileentity.TileEntityExampleCog;
import teamoort.redoxiation.blocks.tileentity.TileEntityIronCog;
import teamoort.redoxiation.blocks.tileentity.TileEntityWoodenCog;
import teamoort.redoxiation.blocks.tileentity.TileEntityStoneCog;
import teamoort.redoxiation.render.ItemRenderIronCog;
import teamoort.redoxiation.render.ItemRenderStoneCog;
import teamoort.redoxiation.render.ItemRenderExampleCog;
import teamoort.redoxiation.render.RenderIronCog;
import teamoort.redoxiation.render.RenderWoodenCog;
import teamoort.redoxiation.render.RenderStoneCog;
import teamoort.redoxiation.render.RenderExampleCog;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
	
	public void registerTileEntitySpecialRenderer() {
		TileEntitySpecialRenderer renderWoodenCog = new RenderWoodenCog();
		TileEntitySpecialRenderer renderStoneCog = new RenderStoneCog();
		TileEntitySpecialRenderer renderIronCog = new RenderIronCog();
        TileEntitySpecialRenderer renderExampleCog = new RenderExampleCog();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWoodenCog.class, renderWoodenCog);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStoneCog.class, renderStoneCog);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCog.class, renderIronCog);
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityExampleCog.class, renderExampleCog);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RedoxiationBlocks.StoneCog), new ItemRenderStoneCog(renderStoneCog, new TileEntityStoneCog()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RedoxiationBlocks.IronCog), new ItemRenderIronCog(renderIronCog, new TileEntityIronCog()));
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RedoxiationBlocks.ExampleCog), new ItemRenderExampleCog(renderExampleCog, new TileEntityExampleCog()));
	}
}
