package teamoort.redoxiation.blocks;

import cpw.mods.fml.client.registry.ClientRegistry;
import teamoort.redoxiation.Redoxiation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RedoxiationBlocks {

	public static Block oreCopper, oreTin, oreLead, oreSilver, oreNickel,
			orePlatinum, oreZinc, oreCobalt, oreChromium, Pitchblend,
			Limestone, SaltRock, Bauxite, Rutile, Scheelite, Cryolite,
			SulfurOre, oreFerroNickel, orePseudoBronze, orePseudoBrassOre,
			argentAurum, pseudoSolder, pseudoStellite, TNTium, obsidianIron,
			obsidianGold, obsidianCopper, obsidianTin, obsidianLead,
			obsidianSilver, obsidianNickel, obsidianPlatinum, obsidianZinc,
			obsidianCobalt, obsidianChromium, obsidianUranium,
			obsidianPlutonium, WoodenCog, StoneCog, IronCog;
	
	public static Fluid HotAir, MoltenPigiron, Slag;
	public static BlockFluidClassic HotAirBlock, MoltenPigironBlock, SlagBlock;
	public static Block BlastFurnaceBlock, FloodFillBlock;
	
	public static boolean oreCopper_cfg, oreTin_cfg, oreLead_cfg,
			oreSilver_cfg, oreNickel_cfg, orePlatinum_cfg, oreZinc_cfg,
			oreCobalt_cfg, oreChromium_cfg, Pitchblend_cfg, Rutile_cfg,
			Scheelite_cfg, Bauxite_cfg, Limestone_cfg, Cryolite_cfg, SulfurOre_cfg;

	public static void registerBlocks() {
		// Blocks
		// Normal Ore Name, Harvest level, Hardness, Resistance
		oreCopper = new RedoxiationOre("oreCopper", 1, 2.5F, 5.0F);
		oreTin = new RedoxiationOre("oreTin", 1, 2.5F, 5.0F);
		oreLead = new RedoxiationOre("oreLead", 1, 2.5F, 5.0F);
		oreSilver = new RedoxiationOre("oreSilver", 2, 2.5F, 5.0F);
		oreNickel = new RedoxiationOre("oreNickel", 1, 2.5F, 5.0F);
		orePlatinum = new RedoxiationOre("orePlatinum", 2, 2.5F, 5.0F);
		oreZinc = new RedoxiationOre("oreZinc", 1, 2.5F, 5.0F);
		oreCobalt = new RedoxiationOre("oreCobalt", 1, 2.5F, 5.0F);
		oreChromium = new RedoxiationOre("oreChromium", 1, 2.5F, 5.0F);

		Pitchblend = new RedoxiationOre("Pitchblend", 2, 2.5F, 5.0F);
		Limestone = new Limestone();
		SaltRock = new SaltRock();
		Bauxite = new Bauxite();
		Rutile = new Rutile();
		Scheelite = new Scheelite();
		Cryolite = new Cryolite();
		SulfurOre = new SulfurOre();

		// Nether Ore
		oreFerroNickel = new RedoxiationOre("oreFerroNickel", 2, 3.0F, 15.0F);
		orePseudoBronze = new RedoxiationOre("orePseudoBronze", 2, 3.0F, 15.0F);
		orePseudoBrassOre = new RedoxiationOre("orePseudoBrassOre", 2, 3.0F, 15.0F);

		argentAurum = new RedoxiationOre("argentAurum", 2, 3.0F, 15.0F);
		pseudoSolder = new RedoxiationOre("pseudoSolder", 2, 3.0F, 15.0F);
		pseudoStellite = new RedoxiationOre("pseudoStellite", 2, 3.0F, 15.0F);
		TNTium = new TNTium();

		// Obsidian Ore
		obsidianIron = new RedoxiationOre("obsidianIron", 3, 50.0F, 2000.0F);
		obsidianGold = new RedoxiationOre("obsidianGold", 3, 50.0F, 2000.0F);
		obsidianCopper = new RedoxiationOre("obsidianCopper", 3, 50.0F, 2000.0F);
		obsidianTin = new RedoxiationOre("obsidianTin", 3, 50.0F, 2000.0F);
		obsidianLead = new RedoxiationOre("obsidianLead", 3, 50.0F, 2000.0F);
		obsidianSilver = new RedoxiationOre("obsidianSilver", 3, 50.0F, 2000.0F);
		obsidianNickel = new RedoxiationOre("obsidianNickel", 3, 50.0F, 2000.0F);
		obsidianPlatinum = new RedoxiationOre("obsidianPlatinum", 3, 50.0F,
				2000.0F);
		obsidianZinc = new RedoxiationOre("obsidianZinc", 3, 50.0F, 2000.0F);
		obsidianCobalt = new RedoxiationOre("obsidianCobalt", 3, 50.0F, 2000.0F);
		obsidianChromium = new RedoxiationOre("obsidianChromium", 3, 50.0F,
				2000.0F);
		obsidianUranium = new RedoxiationOre("obsidianUranium", 3, 50.0F,
				2000.0F);
		obsidianPlutonium = new RedoxiationOre("obsidianPlutonium", 3, 50.0F,
				2000.0F);

		// Cog
		WoodenCog = new BlockWoodenCog();
		StoneCog = new BlockStoneCog();
		IronCog = new BlockIronCog();

		// Machine
		BlastFurnaceBlock = new BlastFurnaceBlock();
		FloodFillBlock = new FloodFillBlock();

		// Registry

		GameRegistry.registerBlock(oreCopper, "oreCopper");
		GameRegistry.registerBlock(oreTin, "oreTin");
		GameRegistry.registerBlock(oreLead, "oreLead");
		GameRegistry.registerBlock(oreSilver, "oreSilver");
		GameRegistry.registerBlock(oreNickel, "oreNickel");
		GameRegistry.registerBlock(orePlatinum, "orePlatinum");
		GameRegistry.registerBlock(oreZinc, "oreZinc");
		GameRegistry.registerBlock(oreCobalt, "oreCobalt");
		GameRegistry.registerBlock(oreChromium, "oreChromium");
		GameRegistry.registerBlock(Pitchblend, "Pitchblend");
		GameRegistry.registerBlock(Limestone, "Limestone");
		GameRegistry.registerBlock(SaltRock, "SaltRock");
		GameRegistry.registerBlock(Bauxite, "Bauxite");
		GameRegistry.registerBlock(Rutile, "Rutile");
		GameRegistry.registerBlock(Scheelite, "Scheelite");
		GameRegistry.registerBlock(Cryolite, "Cryolite");
		GameRegistry.registerBlock(SulfurOre, "SulfurOre");
		GameRegistry.registerBlock(oreFerroNickel, "oreFerroNickel");
		GameRegistry.registerBlock(orePseudoBronze, "orePseudoBronze");
		GameRegistry.registerBlock(orePseudoBrassOre, "orePseudoBrassOre");
		GameRegistry.registerBlock(argentAurum, "argentAurum");
		GameRegistry.registerBlock(pseudoSolder, "pseudoSolder");
		GameRegistry.registerBlock(pseudoStellite, "pseudoStellite");
		GameRegistry.registerBlock(TNTium, "TNTium");
		GameRegistry.registerBlock(obsidianIron, "obsidianIron");
		GameRegistry.registerBlock(obsidianGold, "obsidianGold");
		GameRegistry.registerBlock(obsidianCopper, "obsidianCopper");
		GameRegistry.registerBlock(obsidianTin, "obsidianTin");
		GameRegistry.registerBlock(obsidianLead, "obsidianLead");
		GameRegistry.registerBlock(obsidianSilver, "obsidianSilver");
		GameRegistry.registerBlock(obsidianNickel, "obsidianNickel");
		GameRegistry.registerBlock(obsidianPlatinum, "obsidianPlatinum");
		GameRegistry.registerBlock(obsidianZinc, "obsidianZinc");
		GameRegistry.registerBlock(obsidianCobalt, "obsidianCobalt");
		GameRegistry.registerBlock(obsidianChromium, "obsidianChromium");
		GameRegistry.registerBlock(obsidianUranium, "obsidianUranium");
		GameRegistry.registerBlock(obsidianPlutonium, "obsidianPlutonium");
		GameRegistry.registerBlock(WoodenCog, "WoodenCog");
		GameRegistry.registerBlock(StoneCog, "StoneCog");
		GameRegistry.registerBlock(IronCog, "IronCog");
		GameRegistry.registerBlock(BlastFurnaceBlock, "BlastFurnaceBlock");
		GameRegistry.registerBlock(FloodFillBlock, "FloodFillBlock");

		OreDictionary.registerOre("oreCopper", oreCopper);
		OreDictionary.registerOre("oreTin", oreTin);
		OreDictionary.registerOre("oreLead", oreLead);
		OreDictionary.registerOre("oreSilver", oreSilver);
		OreDictionary.registerOre("oreNickel", oreNickel);
		OreDictionary.registerOre("orePlatinum", orePlatinum);
		OreDictionary.registerOre("oreZinc", oreZinc);
		OreDictionary.registerOre("oreCobalt", oreCobalt);
		OreDictionary.registerOre("oreChromium", oreChromium);
		OreDictionary.registerOre("orePitchblend", Pitchblend);
		OreDictionary.registerOre("blockLimestone", Limestone);
		OreDictionary.registerOre("blockSaltRock", SaltRock);
		OreDictionary.registerOre("blockBauxite", Bauxite);
		OreDictionary.registerOre("blockRutile", Rutile);
		OreDictionary.registerOre("blockScheelite", Scheelite);
		OreDictionary.registerOre("blockCryolite", Cryolite);
		OreDictionary.registerOre("oreSulfur", SulfurOre);
		OreDictionary.registerOre("blockFerronickel", oreFerroNickel);
		OreDictionary.registerOre("blockPseudoBronze", orePseudoBronze);
		OreDictionary.registerOre("blockPseudoBrass", orePseudoBrassOre);
		OreDictionary.registerOre("blockargentAurum", argentAurum);
		OreDictionary.registerOre("blockpseudoSolder", pseudoSolder);
		OreDictionary.registerOre("blockpseudoStellite", pseudoStellite);
		OreDictionary.registerOre("blockTNTium", TNTium);
		OreDictionary.registerOre("oreobsidianIron", obsidianIron);
		OreDictionary.registerOre("oreobsidianGold", obsidianGold);
		OreDictionary.registerOre("oreobsidianCopper", obsidianCopper);
		OreDictionary.registerOre("oreobsidianTin", obsidianTin);
		OreDictionary.registerOre("oreobsidianLead", obsidianLead);
		OreDictionary.registerOre("oreobsidianSilver", obsidianSilver);
		OreDictionary.registerOre("oreobsidianNickel", obsidianNickel);
		OreDictionary.registerOre("oreobsidianPlatinum", obsidianPlatinum);
		OreDictionary.registerOre("oreobsidianZinc", obsidianZinc);
		OreDictionary.registerOre("oreobsidianCobalt", obsidianCobalt);
		OreDictionary.registerOre("oreobsidianChromium", obsidianChromium);
		OreDictionary.registerOre("oreobsidianUranium", obsidianUranium);
		OreDictionary.registerOre("oreobsidianPlutonium", obsidianPlutonium);

		// Fluids
		HotAir = new Fluid("HotAir").setLuminosity(0).setDensity(-10).setTemperature(1473).setViscosity(2000).setGaseous(true);
		MoltenPigiron = new Fluid("MoltenPigiron").setLuminosity(15).setDensity(7874).setTemperature(1900).setViscosity(2000).setGaseous(false);
		Slag = new Fluid("Slag").setLuminosity(15).setDensity(7874).setTemperature(1900).setViscosity(2000).setGaseous(false);

		// Fluid Registry

		// Block Fluids
		//Hot Air
		FluidRegistry.registerFluid(HotAir);
		HotAirBlock = (BlockFluidClassic) new BlockHotAir(HotAir, Material.lava).setBlockName("HotAir");
		GameRegistry.registerBlock(HotAirBlock, "FluidHotAir");
		HotAir.setUnlocalizedName(HotAirBlock.getUnlocalizedName());
		
		//MoltenPigIron
		FluidRegistry.registerFluid(MoltenPigiron);
		MoltenPigironBlock = (BlockFluidClassic) new BlockMoltenPigiron(MoltenPigiron, Material.lava).setBlockName("MoltenPigiron");
		GameRegistry.registerBlock(MoltenPigironBlock, "FluidMoltenPigiron");
		MoltenPigiron.setUnlocalizedName(MoltenPigironBlock.getUnlocalizedName());
		
		//Slag
		FluidRegistry.registerFluid(Slag);
		SlagBlock = (BlockFluidClassic) new BlockSlag(Slag, Material.lava).setBlockName("Slag");
		GameRegistry.registerBlock(SlagBlock, "FluidSlag");
		Slag.setUnlocalizedName(Slag.getUnlocalizedName());
		// Fluids End
		
		Redoxiation.logger.info("Block Registry Complete. Starting Item Registry");
	}
}
