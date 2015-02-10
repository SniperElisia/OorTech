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
    public static Block TestBlock;
    
	public static void registerBlocks()
	{
//Blocks
    	
    	CopperOre = new CopperOre();
    	TinOre = new TinOre();
    	LeadOre = new LeadOre();
    	SilverOre = new SilverOre();
    	NickelOre = new NickelOre();
    	PlatinumOre = new PlatinumOre();
    	ZincOre = new ZincOre();
    	CobaltOre = new CobaltOre();
    	ChromiumOre = new ChromiumOre();
    	Pitchblend = new Pitchblend();
    	Limestone = new Limestone();
    	SaltRock = new SaltRock();
    	Bauxite = new Bauxite();
    	Rutile = new Rutile();
    	Scheelite = new Scheelite();
    	Cryolite = new Cryolite();
    	SulfurOre = new SulfurOre();
    	FerronickelOre = new FerronickelOre();
    	PseudoBronzeOre = new PseudoBronzeOre();
    	PseudoBrassOre = new PseudoBrassOre();
    	ArgentAurum = new ArgentAurum();
    	PseudoSolder = new PseudoSolder();
    	PseudoStellite = new PseudoStellite();
    	TNTium = new TNTium();
    	IronObsidian = new IronObsidian();
    	GoldObsidian = new GoldObsidian();
    	CopperObsidian = new CopperObsidian();
    	TinObsidian = new TinObsidian();
    	LeadObsidian = new LeadObsidian();
    	SilverObsidian = new SilverObsidian();
    	NickelObsidian = new NickelObsidian();
    	PlatinumObsidian = new PlatinumObsidian();
    	ZincObsidian = new ZincObsidian();
    	CobaltObsidian = new CobaltObsidian();
    	ChromiumObsidian = new ChromiumObsidian();
    	UraniumObsidian = new UraniumObsidian();
    	PlutoniumObsidian = new PlutoniumObsidian();
    	WoodenCog = new BlockWoodenCog();
    	StoneCog = new BlockStoneCog();
    	IronCog = new BlockIronCog();
    	TestBlock = new TestBlock();
    	
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
    	GameRegistry.registerBlock(TestBlock, "TestBlock");
    	
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
	}
}
