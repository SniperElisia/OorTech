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
		GameRegistry.addSmelting(RedoxiationBlocks.CopperOre, new ItemStack(RedoxiationGenericItems.IngotCopper,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.ChromiumOre, new ItemStack(RedoxiationGenericItems.IngotChromium,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.CobaltOre, new ItemStack(RedoxiationGenericItems.IngotCobalt,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.LeadOre, new ItemStack(RedoxiationGenericItems.IngotLead,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.NickelOre, new ItemStack(RedoxiationGenericItems.IngotNickel,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.PlatinumOre, new ItemStack(RedoxiationGenericItems.IngotPlatinum,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.SilverOre, new ItemStack(RedoxiationGenericItems.IngotSilver,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.TinOre, new ItemStack(RedoxiationGenericItems.IngotTin,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.ZincOre, new ItemStack(RedoxiationGenericItems.IngotZinc,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.Bauxite, new ItemStack(RedoxiationGenericItems.IngotAluminum,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.Rutile, new ItemStack(RedoxiationGenericItems.IngotTitanium,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.Scheelite, new ItemStack(RedoxiationGenericItems.IngotTungsten,1,0), 0.1f);
		
		//Dust Smelting
		
	}
}
