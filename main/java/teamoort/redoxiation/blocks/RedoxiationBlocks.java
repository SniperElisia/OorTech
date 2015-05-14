package teamoort.redoxiation.blocks;

import teamoort.redoxiation.Redoxiation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RedoxiationBlocks{
	
	public static Block CopperOre, TinOre, LeadOre, SilverOre, NickelOre, PlatinumOre, ZincOre, CobaltOre, ChromiumOre, Pitchblend, Limestone, SaltRock, Bauxite, Rutile, Scheelite, Cryolite, SulfurOre, FerronickelOre, PseudoBronzeOre, PseudoBrassOre, ArgentAurum, PseudoSolder, PseudoStellite, TNTium, IronObsidian, GoldObsidian, CopperObsidian, TinObsidian, LeadObsidian, SilverObsidian, NickelObsidian, PlatinumObsidian, ZincObsidian, CobaltObsidian, ChromiumObsidian, UraniumObsidian, PlutoniumObsidian,WoodenCog, StoneCog, IronCog;
	public static Fluid HotAir, MoltenPigiron;
	public static BlockFluidClassic HotAirBlock, MoltenPigironBlock;
	public static Block BlastFurnaceBlock;
    
	public static void registerBlocks()
	{
	//Blocks
    	//Normal Ore					Type, Name, Harvest level, Hardness, Resistance
    	CopperOre = new RedoxiationOre("Normal", "CopperOre", 1, 2.5F, 5.0F);
    	TinOre = new RedoxiationOre("Normal", "TinOre", 1, 2.5F, 5.0F);
    	LeadOre = new RedoxiationOre("Normal", "LeadOre", 1, 2.5F, 5.0F);
    	SilverOre = new RedoxiationOre("Normal", "SilverOre", 2, 2.5F, 5.0F);
    	NickelOre = new RedoxiationOre("Normal", "NickelOre", 1, 2.5F, 5.0F);
    	PlatinumOre = new RedoxiationOre("Normal", "PlatinumOre", 2, 2.5F, 5.0F);
    	ZincOre = new RedoxiationOre("Normal", "ZincOre", 1, 2.5F, 5.0F);
    	CobaltOre = new RedoxiationOre("Normal", "CobaltOre", 1, 2.5F, 5.0F);
    	ChromiumOre = new RedoxiationOre("Normal", "ChromiumOre", 1, 2.5F, 5.0F);
		
    	Pitchblend = new RedoxiationOre("Normal", "Pitchblend", 2, 2.5F, 5.0F);
    	Limestone = new Limestone();
    	SaltRock = new SaltRock();
    	Bauxite = new Bauxite();
    	Rutile = new Rutile();
    	Scheelite = new Scheelite();
    	Cryolite = new Cryolite();
    	SulfurOre = new SulfurOre();
		
		//Nether Ore
    	FerronickelOre = new RedoxiationOre("Nether", "FerronickelOre", 2, 3.0F, 15.0F);
    	PseudoBronzeOre = new RedoxiationOre("Nether", "PseudoBronzeOre", 2, 3.0F, 15.0F);
    	PseudoBrassOre = new RedoxiationOre("Nether", "PseudoBrassOre", 2, 3.0F, 15.0F);
		
    	ArgentAurum = new RedoxiationOre("Nether", "ArgentAurum", 2, 3.0F, 15.0F);
    	PseudoSolder = new RedoxiationOre("Nether", "PseudoSolder", 2, 3.0F, 15.0F);
    	PseudoStellite = new RedoxiationOre("Nether", "PseudoStellite", 2, 3.0F, 15.0F);
    	TNTium = new TNTium();
		
		//Obsidian Ore
    	IronObsidian = new RedoxiationOre("Obsidian", "IronObsidian", 3, 50.0F, 2000.0F);
    	GoldObsidian = new RedoxiationOre("Obsidian", "GoldObsidian", 3, 50.0F, 2000.0F);
    	CopperObsidian = new RedoxiationOre("Obsidian", "CopperObsidian", 3, 50.0F, 2000.0F);
    	TinObsidian = new RedoxiationOre("Obsidian", "TinObsidian", 3, 50.0F, 2000.0F);
    	LeadObsidian = new RedoxiationOre("Obsidian", "LeadObsidian", 3, 50.0F, 2000.0F);
    	SilverObsidian = new RedoxiationOre("Obsidian", "SilverObsidian", 3, 50.0F, 2000.0F);
    	NickelObsidian = new RedoxiationOre("Obsidian", "NickelObsidian", 3, 50.0F, 2000.0F);
    	PlatinumObsidian = new RedoxiationOre("Obsidian", "PlatinumObsidian", 3, 50.0F, 2000.0F);
    	ZincObsidian = new RedoxiationOre("Obsidian", "ZincObsidian", 3, 50.0F, 2000.0F);
    	CobaltObsidian = new RedoxiationOre("Obsidian", "CobaltObsidian", 3, 50.0F, 2000.0F);
    	ChromiumObsidian = new RedoxiationOre("Obsidian", "ChromiumObsidian", 3, 50.0F, 2000.0F);
    	UraniumObsidian = new RedoxiationOre("Obsidian", "UraniumObsidian", 3, 50.0F, 2000.0F);
    	PlutoniumObsidian = new RedoxiationOre("Obsidian", "PlutoniumObsidian", 3, 50.0F, 2000.0F);
		
		//Cog
    	WoodenCog = new BlockWoodenCog();
    	StoneCog = new BlockStoneCog();
    	IronCog = new BlockIronCog();
		
		//Machine
    	BlastFurnaceBlock = new BlastFurnaceBlock();

    	//Registry
    	
    	GameRegistry.registerBlock(CopperOre, "CopperOre");
    	GameRegistry.registerBlock(TinOre, "TinOre");
    	GameRegistry.registerBlock(LeadOre, "LeadOre");
    	GameRegistry.registerBlock(SilverOre, "SilverOre");
    	GameRegistry.registerBlock(NickelOre, "NickelOre");
    	GameRegistry.registerBlock(PlatinumOre, "PlatinumOre");
    	GameRegistry.registerBlock(ZincOre, "ZincOre");
    	GameRegistry.registerBlock(CobaltOre, "CobaltOre");
    	GameRegistry.registerBlock(ChromiumOre, "ChromiumOre");
    	GameRegistry.registerBlock(Pitchblend, "Pitchblend"); 
    	GameRegistry.registerBlock(Limestone, "Limestone");
    	GameRegistry.registerBlock(SaltRock, "SaltRock");
    	GameRegistry.registerBlock(Bauxite, "Bauxite");
    	GameRegistry.registerBlock(Rutile, "Rutile");
    	GameRegistry.registerBlock(Scheelite, "Scheelite");
    	GameRegistry.registerBlock(Cryolite, "Cryolite");
    	GameRegistry.registerBlock(SulfurOre, "SulfurOre");
    	GameRegistry.registerBlock(FerronickelOre, "FerronickelOre");
    	GameRegistry.registerBlock(PseudoBronzeOre, "PseudoBronzeOre");
    	GameRegistry.registerBlock(PseudoBrassOre, "PseudoBrassOre");
    	GameRegistry.registerBlock(ArgentAurum, "ArgentAurum");
    	GameRegistry.registerBlock(PseudoSolder, "PseudoSolder");
    	GameRegistry.registerBlock(PseudoStellite, "PseudoStellite");
    	GameRegistry.registerBlock(TNTium, "TNTium");
    	GameRegistry.registerBlock(IronObsidian, "IronObsidian");
    	GameRegistry.registerBlock(GoldObsidian, "GoldObsidian");
    	GameRegistry.registerBlock(CopperObsidian, "CopperObsidian");
    	GameRegistry.registerBlock(TinObsidian, "TinObsidian");
    	GameRegistry.registerBlock(LeadObsidian, "LeadObsidian");
    	GameRegistry.registerBlock(SilverObsidian, "SilverObsidian");
    	GameRegistry.registerBlock(NickelObsidian, "NickelObsidian");
    	GameRegistry.registerBlock(PlatinumObsidian, "PlatinumObsidian");
    	GameRegistry.registerBlock(ZincObsidian, "ZincObsidian");
    	GameRegistry.registerBlock(CobaltObsidian, "CobaltObsidian");
    	GameRegistry.registerBlock(ChromiumObsidian, "ChromiumObsidian");
    	GameRegistry.registerBlock(UraniumObsidian, "UraniumObsidian");
    	GameRegistry.registerBlock(PlutoniumObsidian, "PlutoniumObsidian");
    	GameRegistry.registerBlock(WoodenCog, "WoodenCog");
    	GameRegistry.registerBlock(StoneCog, "StoneCog");
    	GameRegistry.registerBlock(IronCog, "IronCog");
    	GameRegistry.registerBlock(BlastFurnaceBlock,"BlastFurnaceBlock");

    	OreDictionary.registerOre("oreCopper", CopperOre);
    	OreDictionary.registerOre("oreTin", TinOre);
    	OreDictionary.registerOre("oreLead", LeadOre);
		OreDictionary.registerOre("oreSilver", SilverOre);
    	OreDictionary.registerOre("oreNickel", NickelOre);
		OreDictionary.registerOre("orePlatinum", PlatinumOre);
    	OreDictionary.registerOre("oreZinc", ZincOre);
    	OreDictionary.registerOre("oreCobalt", CobaltOre);
		OreDictionary.registerOre("oreChromium", ChromiumOre);
		OreDictionary.registerOre("orePitchblend", Pitchblend);    	
		OreDictionary.registerOre("blockLimestone", Limestone);
    	OreDictionary.registerOre("blockSaltRock", SaltRock);
    	OreDictionary.registerOre("blockBauxite", Bauxite);
    	OreDictionary.registerOre("blockRutile", Rutile);
    	OreDictionary.registerOre("blockScheelite", Scheelite);
    	OreDictionary.registerOre("blockCryolite", Cryolite);
    	OreDictionary.registerOre("oreSulfur", SulfurOre);
    	OreDictionary.registerOre("blockFerronickel", FerronickelOre);
    	OreDictionary.registerOre("blockPseudoBronze", PseudoBronzeOre);
    	OreDictionary.registerOre("blockPseudoBrass", PseudoBrassOre);
    	OreDictionary.registerOre("blockArgentAurum", ArgentAurum);
    	OreDictionary.registerOre("blockPseudoSolder", PseudoSolder);
    	OreDictionary.registerOre("blockPseudoStellite", PseudoStellite);
    	OreDictionary.registerOre("blockTNTium", TNTium);
    	OreDictionary.registerOre("oreIronObsidian", IronObsidian);
    	OreDictionary.registerOre("oreGoldObsidian", GoldObsidian);
    	OreDictionary.registerOre("oreCopperObsidian", CopperObsidian);
    	OreDictionary.registerOre("oreTinObsidian", TinObsidian);
    	OreDictionary.registerOre("oreLeadObsidian", LeadObsidian);
    	OreDictionary.registerOre("oreSilverObsidian", SilverObsidian);
    	OreDictionary.registerOre("oreNickelObsidian", NickelObsidian);
    	OreDictionary.registerOre("orePlatinumObsidian", PlatinumObsidian);
    	OreDictionary.registerOre("oreZincObsidian", ZincObsidian);
    	OreDictionary.registerOre("oreCobaltObsidian", CobaltObsidian);
    	OreDictionary.registerOre("oreChromiumObsidian", ChromiumObsidian);
    	OreDictionary.registerOre("oreUraniumObsidian", UraniumObsidian);
    	OreDictionary.registerOre("orePlutoniumObsidian", PlutoniumObsidian);

    	
        //Fluids
        HotAir = new Fluid("HotAir").setLuminosity(0).setDensity(-10).setTemperature(1473).setViscosity(2000).setGaseous(true);
        MoltenPigiron = new Fluid("MoltenPigiron").setLuminosity(15).setDensity(7874).setTemperature(1900).setViscosity(2000).setGaseous(false);
        
        //Fluid Registry
        FluidRegistry.registerFluid(HotAir);
        FluidRegistry.registerFluid(MoltenPigiron);
        
        //Block Fluids
        HotAirBlock = (BlockFluidClassic) new BlockHotAir(HotAir, Material.lava).setBlockName("HotAir");
        MoltenPigironBlock = (BlockFluidClassic) new BlockMoltenPigiron(MoltenPigiron, Material.lava).setBlockName("MoltenPigiron");
        
        //Block Fluids Registry
        GameRegistry.registerBlock(HotAirBlock, "FluidHotAir");
        GameRegistry.registerBlock(MoltenPigironBlock, "FluidMoltenPigiron");
        HotAir.setUnlocalizedName(HotAirBlock.getUnlocalizedName());
        MoltenPigiron.setUnlocalizedName(MoltenPigironBlock.getUnlocalizedName());
        
        Redoxiation.logger.info("Block Registry Complete. Starting Tileentity proxy.");
	}
}
