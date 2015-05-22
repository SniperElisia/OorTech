package teamoort.Redoxiation.proxy;

import teamoort.Redoxiation.blocks.RedoxiationBlocks;
import teamoort.Redoxiation.blocks.tileentity.TileEntityIronCog;
import teamoort.Redoxiation.blocks.tileentity.TileEntityWoodenCog;
import teamoort.Redoxiation.blocks.tileentity.TileEntityStoneCog;
import teamoort.Redoxiation.render.ItemRenderIronCog;
import teamoort.Redoxiation.render.ItemRenderWoodenCog;
import teamoort.Redoxiation.render.ItemRenderStoneCog;
import teamoort.Redoxiation.render.RenderIronCog;
import teamoort.Redoxiation.render.RenderWoodenCog;
import teamoort.Redoxiation.render.RenderStoneCog;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
	
	public void registerTileEntitySpecialRenderer() {
		TileEntitySpecialRenderer renderWoodenCog = new RenderWoodenCog();
		TileEntitySpecialRenderer renderStoneCog = new RenderStoneCog();
		TileEntitySpecialRenderer renderIronCog = new RenderIronCog();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWoodenCog.class, renderWoodenCog);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStoneCog.class, renderStoneCog);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCog.class, renderIronCog);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RedoxiationBlocks.WoodenCog), new ItemRenderWoodenCog(renderWoodenCog, new TileEntityWoodenCog()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RedoxiationBlocks.StoneCog), new ItemRenderStoneCog(renderStoneCog, new TileEntityStoneCog()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RedoxiationBlocks.IronCog), new ItemRenderIronCog(renderIronCog, new TileEntityIronCog()));
	}
}
