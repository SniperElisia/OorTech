package teamoort.Redoxiation;

import teamoort.Redoxiation.blocks.RedoxiationBlocks;
import teamoort.Redoxiation.items.RedoxiationGenericItems;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RedoxiationRecipeManager {

	public static void recipeFurnace()
	{
		//Normal Smelting
		GameRegistry.addSmelting(RedoxiationBlocks.CopperOre, new ItemStack(RedoxiationGenericItems.CopperIngot,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.ChromiumOre, new ItemStack(RedoxiationGenericItems.ChromiumIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.CobaltOre, new ItemStack(RedoxiationGenericItems.CobaltIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.LeadOre, new ItemStack(RedoxiationGenericItems.LeadIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.NickelOre, new ItemStack(RedoxiationGenericItems.NickelIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.PlatinumOre, new ItemStack(RedoxiationGenericItems.PlatinumIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.SilverOre, new ItemStack(RedoxiationGenericItems.SilverIngot,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.TinOre, new ItemStack(RedoxiationGenericItems.TinIngot,1,0),0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.ZincOre, new ItemStack(RedoxiationGenericItems.ZincIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.Bauxite, new ItemStack(RedoxiationGenericItems.AluminumIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.Rutile, new ItemStack(RedoxiationGenericItems.TitaniumIngot,1,0), 0.1f);
		GameRegistry.addSmelting(RedoxiationBlocks.Scheelite, new ItemStack(RedoxiationGenericItems.TungstenIngot,1,0), 0.1f);
		
		//Dust Smelting
		GameRegistry.addSmelting(new ItemStack(RedoxiationGenericItems.CopperDust,1,0), new ItemStack(RedoxiationGenericItems.CopperIngot,1,0), 0.1f);
		GameRegistry.addSmelting(new ItemStack(RedoxiationGenericItems.ChromiumDust,1,0), new ItemStack(RedoxiationGenericItems.ChromiumIngot,1,0), 0.1f);
		GameRegistry.addSmelting(new ItemStack(RedoxiationGenericItems.CobaltDust,1,0), new ItemStack(RedoxiationGenericItems.CobaltIngot,1,0), 0.1f);
	}
	
	public static void recipeCrafting()
	{
		//Todo : Add Crafting Recipes. If you want add, just add. You can Delete this.
		Redoxiation.logger.info("Recipe & Smelting Complete. Starting World generator");
	}
}
