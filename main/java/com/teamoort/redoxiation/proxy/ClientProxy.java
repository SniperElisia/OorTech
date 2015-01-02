package com.teamoort.redoxiation.proxy;

import com.teamoort.redoxiation.blocks.RedoxiationBlocks;
import com.teamoort.redoxiation.blocks.tileentity.TileEntityWoodenCog;
import com.teamoort.redoxiation.render.ItemRenderWoodenCog;
import com.teamoort.redoxiation.render.RenderWoodenCog;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
	
	public void registerTileEntitySpecialRenderer()
	{
		TileEntitySpecialRenderer render = new RenderWoodenCog();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWoodenCog.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RedoxiationBlocks.WoodenCog), new ItemRenderWoodenCog(render, new TileEntityWoodenCog()));
	}

}
