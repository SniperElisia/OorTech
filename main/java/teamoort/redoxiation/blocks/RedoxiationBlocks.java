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
    	//Normal Ore
    	CopperOre = new RedoxiationOre("CopperOre", 1, 2.5F, 5.0F);
    	TinOre = new RedoxiationOre("TinOre", 1, 2.5F, 5.0F);
    	LeadOre = new RedoxiationOre("LeadOre", 1, 2.5F, 5.0F);
    	SilverOre = new RedoxiationOre("SilverOre", 2, 2.5F, 5.0F);
    	NickelOre = new RedoxiationOre("NickelOre", 1, 2.5F, 5.0F);
    	PlatinumOre = new RedoxiationOre("PlatinumOre", 2, 2.5F, 5.0F);
    	ZincOre = new RedoxiationOre("ZincOre", 1, 2.5F, 5.0F);
    	CobaltOre = new RedoxiationOre("CoblatOre", 1, 2.5F, 5.0F);
    	ChromiumOre = new RedoxiationOre("ChromiumOre", 1, 2.5F, 5.0F);
		
    	Pitchblend = new RedoxiationOre("Pitchblend", 2, 2.5F, 5.0F);
    	Limestone = new Limestone();
    	SaltRock = new SaltRock();
    	Bauxite = new Bauxite();
    	Rutile = new Rutile();
    	Scheelite = new Scheelite();
    	Cryolite = new Cryolite();
    	SulfurOre = new SulfurOre();
		
    	FerronickelOre = new RedoxiationOre("FerronickelOre", 2, 3.0F, 15.0F);
    	PseudoBronzeOre = new RedoxiationOre("PseudoBronzeOre", 2, 3.0F, 15.0F);
    	PseudoBrassOre = new RedoxiationOre("PseudoBrassOre", 2, 3.0F, 15.0F);
		
    	ArgentAurum = new RedoxiationOre("ArgentAurum", 2, 3.0F, 15.0F);
    	PseudoSolder = new RedoxiationOre("PseudoSolder", 2, 3.0F, 15.0F);
    	PseudoStellite = new RedoxiationOre("PseudoStellite", 2, 3.0F, 15.0F);
    	TNTium = new TNTium();
		
		//Obsidian Ore
    	IronObsidian = new RedoxiationOre("IronObsidian", 3, 50.0F, 2000.0F);
    	GoldObsidian = new RedoxiationOre("GoldObsidian", 3, 50.0F, 2000.0F);
    	CopperObsidian = new RedoxiationOre("CopperObsidian", 3, 50.0F, 2000.0F);
    	TinObsidian = new RedoxiationOre("TinObsidian", 3, 50.0F, 2000.0F);
    	LeadObsidian = new RedoxiationOre("LeadObsidian", 3, 50.0F, 2000.0F);
    	SilverObsidian = new RedoxiationOre("SilverObsidian", 3, 50.0F, 2000.0F);
    	NickelObsidian = new RedoxiationOre("NickelObsidian", 3, 50.0F, 2000.0F);
    	PlatinumObsidian = new RedoxiationOre("PlatinumObsidian", 3, 50.0F, 2000.0F);
    	ZincObsidian = new RedoxiationOre("ZincObsidian", 3, 50.0F, 2000.0F);
    	CobaltObsidian = new RedoxiationOre("CobaltObsidian", 3, 50.0F, 2000.0F);
    	ChromiumObsidian = new RedoxiationOre("ChromiumObsidian", 3, 50.0F, 2000.0F);
    	UraniumObsidian = new RedoxiationOre("UraniumObsidian", 3, 50.0F, 2000.0F);
    	PlutoniumObsidian = new RedoxiationOre("PlutoniumObsidian", 3, 50.0F, 2000.0F);
		
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
