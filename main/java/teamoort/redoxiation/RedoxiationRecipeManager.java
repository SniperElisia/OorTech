package teamoort.redoxiation;

import teamoort.redoxiation.blocks.RedoxiationBlocks;
import teamoort.redoxiation.items.RedoxiationGenericItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RedoxiationRecipeManager {
	
	public static void recipeCrafting()
	{
		Redoxiation.logger.info("Recipe & Smelting Complete. Starting World generator");
	}

	public static void recipeFurnace()
	{
		//Normal Smelting
		GameRegistry.addSmelting(RedoxiationBlocks.oreCopper, new ItemStack(RedoxiationGenericItems.ingotCopper,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.oreChromium, new ItemStack(RedoxiationGenericItems.ingotChromium,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.oreCobalt, new ItemStack(RedoxiationGenericItems.ingotCobalt,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.oreLead, new ItemStack(RedoxiationGenericItems.ingotLead,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.oreNickel, new ItemStack(RedoxiationGenericItems.ingotNickel,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.orePlatinum, new ItemStack(RedoxiationGenericItems.ingotPlatinum,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.oreSilver, new ItemStack(RedoxiationGenericItems.ingotSilver,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.oreTin, new ItemStack(RedoxiationGenericItems.ingotTin,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.oreZinc, new ItemStack(RedoxiationGenericItems.ingotZinc,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.Scheelite, new ItemStack(RedoxiationGenericItems.ingotTungsten,1,0), 0.1f);
		
		//Dust Smelting
		
	}
}
