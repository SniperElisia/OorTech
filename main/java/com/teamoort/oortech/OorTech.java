package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = OorTech.MODID, version = OorTech.VERSION)
public class OorTech
{
    public static final String MODID = "OorTech";
    public static final String VERSION = "Alpha 0.0.0.001";
    
    public static final CreativeTabs tabOort = new CreativeTabs("OorTech")
    {
        private static final String __OBFID = "CL_00000080";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
        	return OorTech.Calcite;
        }
    };
    
    @Metadata
    public ModMetadata meta;
    
    //Blocks
    
    public static Block CopperOre, TinOre, LeadOre, SilverOre, NickelOre, PlatinumOre, ZincOre, CobaltOre, ChromiumOre, Pitchblende, PlutoniumOre, Limestone, SaltRock, Bauxite, Rutile, Scheelite, Cryolite, SulfurOre, FerronickelOre, PseudoBronzeOre, PseudoBrassOre, ArgentAurum, PseudoSolder, PseudoStellite, TNTium, IronObsidian, GoldObsidian, CopperObsidian, TinObsidian, LeadObsidian, SilverObsidian, NickelObsidian, PlatinumObsidian, ZincObsidian, CobaltObsidian, ChromiumObsidian, UraniumObsidian, PlutoniumObsidian;
    
    //Items
    
    public static Item MortarAndPestle, Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite, CrushedIron, CrushedGold,  CrushedCopper, CrushedTin, CrushedLead, CrushedSilver, CrushedNickel, CrushedPlatinum, CrushedZinc,  CrushedChromium, IronDust, GoldDust, CopperDust, TinDust, LeadDust, SilverDust, NickelDust, PlatinumDust, ZincDust, CobaltDust, ChromiumDust, Salt, AluminaDust, TitanateDust, TungstateDust, PurifiedIron, PurifiedGold, PurifiedCopper, PurifiedTin, PurifiedLead, PurifiedSilver, PurifiedNickel, PurifiedPlatinum, PurifiedZinc, PurifiedCobalt, PurifiedChromium, PurifiedAlumina, PurifiedTitanate, PurifiedTungstate, RefinedIron, RefinedGold, RefinedCopper, RefinedTin, RefinedLead, RefinedSilver, RefinedNickel, RefinedPlatinum, RefinedZinc, RefinedCobalt, RefinedChromium, RefinedAlumina, RefinedTitanate, RefinedTungstate, CopperIngot, TinIngot, LeadIngot, SilverIngot, NickelIngot, PlatinumIngot, ZincIngot, CobaltIngot, ChromiumIngot, UraniumIngot, PlutoniumIngot, SteelIngot, AluminumIngot, TungstenIngot, TitaniumIngot, IronNugget, CopperNugget, TinNugget, LeadNugget, SilverNugget, PlatinumNugget, ZincNugget, NickelNugget, ChromiumNugget, AluminumNugget, TitaniumNugget, TungstenNugget, SteelNugget, SulfurChunk, SulfurDust, ItemCryolite, CrashedNetherrack, CrashedObsidian;
    
    
    OorEventHandler handler = new OorEventHandler();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
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
    	Pitchblende = new UraniumOre();
    	PlutoniumOre = new PlutoniumOre();
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
    	
    	//Items
    	
    	MortarAndPestle = new OorGenericItems("MortarAndPestle");
    	Calcite = new OorGenericItems("Calcite");
    	SaltChunk = new OorGenericItems("SaltChunk");
    	RawBauxite = new OorGenericItems("RawBauxite");
    	RawRutile = new OorGenericItems("RawRutile");
    	RawScheelite = new OorGenericItems("RawScheelite");
    	CrushedIron = new OorGenericItems("CrushedIron");
    	CrushedGold = new OorGenericItems("CrushedGold");
    	CrushedCopper = new OorGenericItems("CrushedCopper");
    	CrushedTin = new OorGenericItems("CrushedTin");
    	CrushedLead = new OorGenericItems("CrushedLead");
    	CrushedSilver = new OorGenericItems("CrushedSilver");
    	CrushedPlatinum = new OorGenericItems("CrushedPlatinum");
    	CrushedZinc = new OorGenericItems("CrushedZinc");
    	CrushedNickel = new OorGenericItems("CrushedNickel");
    	CrushedChromium = new OorGenericItems("CrushedChromium");
    	IronDust = new OorGenericItems("IronDust");
    	GoldDust = new OorGenericItems("GoldDust");
    	CopperDust = new OorGenericItems("CopperDust");
    	TinDust = new OorGenericItems("TinDust");
    	LeadDust = new OorGenericItems("LeadDust");
    	SilverDust = new OorGenericItems("SilverDust");
    	PlatinumDust = new OorGenericItems("PlatinumDust");
    	ZincDust = new OorGenericItems("ZincDust");
    	NickelDust = new OorGenericItems("NickelDust");
    	ChromiumDust = new OorGenericItems("ChromiumDust");
    	Salt = new OorGenericItems("Salt");
    	AluminaDust = new OorGenericItems("AluminaDust");
    	TitanateDust = new OorGenericItems("TitanateDust");
    	TungstateDust = new OorGenericItems("TungstateDust");
    	PurifiedIron = new OorGenericItems("PurifiedIron");
    	PurifiedGold = new OorGenericItems("PurifiedGold");
    	PurifiedCopper = new OorGenericItems("PurifiedCopper");
    	PurifiedTin = new OorGenericItems("PurifiedTin");
    	PurifiedLead = new OorGenericItems("PurifiedLead");
    	PurifiedSilver = new OorGenericItems("PurifiedSilver");
    	PurifiedPlatinum = new OorGenericItems("PurifiedPlatinum");
    	PurifiedZinc = new OorGenericItems("PurifiedZinc");
    	PurifiedNickel = new OorGenericItems("PurifiedNickel");
    	PurifiedChromium = new OorGenericItems("PurifiedChromium");
    	PurifiedAlumina = new OorGenericItems("PurifiedAlumina");
    	PurifiedTitanate = new OorGenericItems("PurifiedTitanate");
    	PurifiedTungstate = new OorGenericItems("PurifiedTungstate");
    	RefinedIron = new OorGenericItems("RefinedIron");
    	RefinedGold = new OorGenericItems("RefinedGold");
    	RefinedCopper = new OorGenericItems("RefinedCopper");
    	RefinedTin = new OorGenericItems("RefinedTin");
    	RefinedLead = new OorGenericItems("RefinedLead");
    	RefinedSilver = new OorGenericItems("RefinedSilver");
    	RefinedPlatinum = new OorGenericItems("RefinedPlatinum");
    	RefinedZinc = new OorGenericItems("RefinedZinc");
    	RefinedNickel = new OorGenericItems("RefinedNickel");
    	RefinedChromium = new OorGenericItems("RefinedChromium");
    	RefinedAlumina = new OorGenericItems("RefinedAlumina");
    	RefinedTitanate = new OorGenericItems("RefinedTitanate");
    	RefinedTungstate = new OorGenericItems("RefinedTungstate");
    	CopperIngot = new OorGenericItems("CopperIngot");
    	TinIngot = new OorGenericItems("TinIngot");
    	LeadIngot = new OorGenericItems("LeadIngot");
    	SilverIngot = new OorGenericItems("SilverIngot");
    	PlatinumIngot = new OorGenericItems("PlatinumIngot");
    	ZincIngot = new OorGenericItems("ZincIngot");
    	NickelIngot = new OorGenericItems("NickelIngot");
    	ChromiumIngot = new OorGenericItems("ChromiumIngot");
    	AluminumIngot = new OorGenericItems("AluminumIngot");
    	TitaniumIngot = new OorGenericItems("TitaniumIngot");
    	TungstenIngot = new OorGenericItems("TungstenIngot");
    	SteelIngot = new OorGenericItems("SteelIngot");
    	IronNugget = new OorGenericItems("IronNugget");
    	CopperNugget = new OorGenericItems("CopperNugget");
    	TinNugget = new OorGenericItems("TinNugget");
    	LeadNugget = new OorGenericItems("LeadNugget");
    	SilverNugget = new OorGenericItems("SilverNugget");
    	PlatinumNugget = new OorGenericItems("PlatinumNugget");
    	ZincNugget = new OorGenericItems("ZincNugget");
    	NickelNugget = new OorGenericItems("NickelNugget");
    	ChromiumNugget = new OorGenericItems("ChromiumNugget");
    	AluminumNugget = new OorGenericItems("AluminumNugget");
    	TitaniumNugget = new OorGenericItems("TitaniumNugget");
    	TungstenNugget = new OorGenericItems("TungstenNugget");
    	SteelNugget = new OorGenericItems("SteelNugget");
    	SulfurChunk = new OorGenericItems("SulfurChunk");
    	SulfurDust = new OorGenericItems("SulfurDust");
    	ItemCryolite = new OorGenericItems("ItemCryolite");
    	CrashedNetherrack = new OorGenericItems("CrashedNetherrack");
    	CrashedObsidian = new OorGenericItems("CrashedObsidian");
    	
    	
    	
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
    	GameRegistry.registerBlock(Pitchblende, "Pitchblende"); 
    	GameRegistry.registerBlock(PlutoniumOre, "PlutoniumOre");   	
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
    	
    	GameRegistry.registerItem(MortarAndPestle, "MortarAndPestle");
    	GameRegistry.registerItem(Calcite, "Calcite");
    	GameRegistry.registerItem(SaltChunk, "SaltChunk");
    	GameRegistry.registerItem(RawBauxite, "RawBauxite");
    	GameRegistry.registerItem(RawRutile, "RawRutile");
    	GameRegistry.registerItem(RawScheelite, "RawScheelite");
    	GameRegistry.registerItem(CrushedIron, "CrushedIron");
    	GameRegistry.registerItem(CrushedGold, "CrushedGold");
    	GameRegistry.registerItem(CrushedCopper, "CrushedCopper");
    	GameRegistry.registerItem(CrushedTin, "CrushedTin");
    	GameRegistry.registerItem(CrushedLead, "CrushedLead");
    	GameRegistry.registerItem(CrushedSilver, "CrushedSilver");
    	GameRegistry.registerItem(CrushedPlatinum, "CrushedPlatinum");
    	GameRegistry.registerItem(CrushedZinc, "CrushedZinc");
    	GameRegistry.registerItem(CrushedNickel, "CrushedNickel");
    	GameRegistry.registerItem(CrushedChromium, "CrushedChromium");
    	GameRegistry.registerItem(IronDust, "IronDust");
    	GameRegistry.registerItem(GoldDust, "GoldDust");
    	GameRegistry.registerItem(CopperDust, "CopperDust");
    	GameRegistry.registerItem(TinDust, "TinDust");
    	GameRegistry.registerItem(LeadDust, "LeadDust");
    	GameRegistry.registerItem(SilverDust, "SilverDust");
    	GameRegistry.registerItem(PlatinumDust, "PlatinumDust");
    	GameRegistry.registerItem(ZincDust, "ZincDust");
    	GameRegistry.registerItem(NickelDust, "NickelDust");
    	GameRegistry.registerItem(ChromiumDust, "ChromiumDust");
    	GameRegistry.registerItem(Salt, "Salt");
    	GameRegistry.registerItem(AluminaDust, "AluminaDust");
    	GameRegistry.registerItem(TitanateDust, "TitanateDust");
    	GameRegistry.registerItem(TungstateDust, "TungstateDust");
    	GameRegistry.registerItem(PurifiedIron, "PurifiedIron");
    	GameRegistry.registerItem(PurifiedGold, "PurifiedGold");
    	GameRegistry.registerItem(PurifiedCopper, "PurifiedCopper");
    	GameRegistry.registerItem(PurifiedTin, "PurifiedTin");
    	GameRegistry.registerItem(PurifiedLead, "PurifiedLead");
    	GameRegistry.registerItem(PurifiedSilver, "PurifiedSilver");
    	GameRegistry.registerItem(PurifiedPlatinum, "PurifiedPlatinum");
    	GameRegistry.registerItem(PurifiedZinc, "PurifiedZinc");
    	GameRegistry.registerItem(PurifiedNickel, "PurifiedNickel");
    	GameRegistry.registerItem(PurifiedChromium, "PurifiedChromium");
    	GameRegistry.registerItem(PurifiedAlumina, "PurifiedAlumina");
    	GameRegistry.registerItem(PurifiedTitanate, "PurifiedTitanate");
    	GameRegistry.registerItem(PurifiedTungstate, "PurifiedTungstate");
    	GameRegistry.registerItem(RefinedIron, "RefinedIron");
    	GameRegistry.registerItem(RefinedGold, "RefinedGold");
    	GameRegistry.registerItem(RefinedCopper, "RefinedCopper");
    	GameRegistry.registerItem(RefinedTin, "RefinedTin");
    	GameRegistry.registerItem(RefinedLead, "RefinedLead");
    	GameRegistry.registerItem(RefinedSilver, "RefinedSilver");
    	GameRegistry.registerItem(RefinedPlatinum, "RefinedPlatinum");
    	GameRegistry.registerItem(RefinedZinc, "RefinedZinc");
    	GameRegistry.registerItem(RefinedNickel, "RefinedNickel");
    	GameRegistry.registerItem(RefinedChromium, "RefinedChromium");
    	GameRegistry.registerItem(RefinedAlumina, "RefinedAlumina");
    	GameRegistry.registerItem(RefinedTitanate, "RefinedTitanate");
    	GameRegistry.registerItem(RefinedTungstate, "RefinedTungstate");
    	GameRegistry.registerItem(CopperIngot, "CopperIngot");
    	GameRegistry.registerItem(TinIngot, "TinIngot");
    	GameRegistry.registerItem(LeadIngot, "LeadIngot");
    	GameRegistry.registerItem(SilverIngot, "SilverIngot");
    	GameRegistry.registerItem(PlatinumIngot, "PlatinumIngot");
    	GameRegistry.registerItem(ZincIngot, "ZincIngot");
    	GameRegistry.registerItem(NickelIngot, "NickelIngot");
    	GameRegistry.registerItem(ChromiumIngot, "ChromiumIngot");
    	GameRegistry.registerItem(AluminumIngot, "AluminumIngot");
    	GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
    	GameRegistry.registerItem(TungstenIngot, "TungstenIngot");
    	GameRegistry.registerItem(SteelIngot, "SteelIngot");
    	GameRegistry.registerItem(IronNugget, "IronNugget");
    	GameRegistry.registerItem(CopperNugget, "CopperNugget");
    	GameRegistry.registerItem(TinNugget, "TinNugget");
    	GameRegistry.registerItem(LeadNugget, "LeadNugget");
    	GameRegistry.registerItem(SilverNugget, "SilverNugget");
    	GameRegistry.registerItem(PlatinumNugget, "PlatinumNugget");
    	GameRegistry.registerItem(ZincNugget, "ZincNugget");
    	GameRegistry.registerItem(NickelNugget, "NickelNugget");
    	GameRegistry.registerItem(ChromiumNugget, "ChromiumNugget");
    	GameRegistry.registerItem(AluminumNugget, "AluminumNugget");
    	GameRegistry.registerItem(TitaniumNugget, "TitaniumNugget");
    	GameRegistry.registerItem(TungstenNugget, "TungstenNugget");
    	GameRegistry.registerItem(SteelNugget, "SteelNugget");
    	GameRegistry.registerItem(SulfurChunk, "SulfurChunk");
    	GameRegistry.registerItem(SulfurDust, "SulfurDust");
    	GameRegistry.registerItem(ItemCryolite, "ItemCryolite");
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    	OreDictionary.registerOre("oreCopper", OorTech.CopperOre);
    	OreDictionary.registerOre("oreTin", OorTech.TinOre);
    	OreDictionary.registerOre("oreLead", OorTech.LeadOre);
   		OreDictionary.registerOre("oreSilver", OorTech.SilverOre);
    	OreDictionary.registerOre("oreNickel", OorTech.NickelOre);
  		OreDictionary.registerOre("orePlatinum", OorTech.PlatinumOre);
    	OreDictionary.registerOre("oreZinc", OorTech.ZincOre);
    	OreDictionary.registerOre("oreCobalt", OorTech.CobaltOre);
 		OreDictionary.registerOre("oreChromium", OorTech.ChromiumOre);
   		OreDictionary.registerOre("orePitchblende", OorTech.Pitchblende); 
    	OreDictionary.registerOre("orePlutonium", OorTech.PlutoniumOre);   	
   		OreDictionary.registerOre("blockLimestone", OorTech.Limestone);
    	OreDictionary.registerOre("blockSaltRock", OorTech.SaltRock);
    	OreDictionary.registerOre("blockBauxite", OorTech.Bauxite);
    	OreDictionary.registerOre("blockRutile", OorTech.Rutile);
    	OreDictionary.registerOre("blockScheelite", OorTech.Scheelite);
    	OreDictionary.registerOre("blockCryolite", OorTech.Cryolite);
    	OreDictionary.registerOre("oreSulfur", OorTech.SulfurOre);
    	OreDictionary.registerOre("blockFerronickel", OorTech.FerronickelOre);
    	OreDictionary.registerOre("blockPseudoBronze", OorTech.PseudoBronzeOre);
    	OreDictionary.registerOre("blockPseudoBrass", OorTech.PseudoBrassOre);
    	OreDictionary.registerOre("blockArgentAurum", OorTech.ArgentAurum);
    	OreDictionary.registerOre("blockPseudoSolder", OorTech.PseudoSolder);
    	OreDictionary.registerOre("blockPseudoStellite", OorTech.PseudoStellite);
    	OreDictionary.registerOre("blockTNTium", OorTech.TNTium);
    	OreDictionary.registerOre("oreIronObsidian", OorTech.IronObsidian);
    	OreDictionary.registerOre("oreGoldObsidian", OorTech.GoldObsidian);
    	OreDictionary.registerOre("oreCopperObsidian", OorTech.CopperObsidian);
    	OreDictionary.registerOre("oreTinObsidian", OorTech.TinObsidian);
    	OreDictionary.registerOre("oreLeadObsidian", OorTech.LeadObsidian);
    	OreDictionary.registerOre("oreSilverObsidian", OorTech.SilverObsidian);
    	OreDictionary.registerOre("oreNickelObsidian", OorTech.NickelObsidian);
    	OreDictionary.registerOre("orePlatinumObsidian", OorTech.PlatinumObsidian);
    	OreDictionary.registerOre("oreZincObsidian", OorTech.ZincObsidian);
    	OreDictionary.registerOre("oreCobaltObsidian", OorTech.CobaltObsidian);
    	OreDictionary.registerOre("oreChromiumObsidian", OorTech.ChromiumObsidian);
    	OreDictionary.registerOre("oreUraniumObsidian", OorTech.UraniumObsidian);
    	OreDictionary.registerOre("orePlutoniumObsidian", OorTech.PlutoniumObsidian);

    	OreDictionary.registerOre("materialMortarAndPestle", OorTech.MortarAndPestle);
    	OreDictionary.registerOre("materialCalcite", OorTech.Calcite);
    	OreDictionary.registerOre("lumpSalt", OorTech.SaltChunk);
    	OreDictionary.registerOre("lumpBauxite", OorTech.RawBauxite);
    	OreDictionary.registerOre("lumpRutile", OorTech.RawRutile);
    	OreDictionary.registerOre("lumpScheelite", OorTech.RawScheelite);
    	OreDictionary.registerOre("crushedIron", OorTech.CrushedIron);
    	OreDictionary.registerOre("crushedGold", OorTech.CrushedGold);
    	OreDictionary.registerOre("crushedCopper", OorTech.CrushedCopper);
    	OreDictionary.registerOre("crushedTin", OorTech.CrushedTin);
    	OreDictionary.registerOre("crushedLead", OorTech.CrushedLead);
    	OreDictionary.registerOre("crushedSilver", OorTech.CrushedSilver);
    	OreDictionary.registerOre("crushedPlatinum", OorTech.CrushedPlatinum);
    	OreDictionary.registerOre("crushedZinc", OorTech.CrushedZinc);
    	OreDictionary.registerOre("crushedNickel", OorTech.CrushedNickel);
    	OreDictionary.registerOre("crushedChromium", OorTech.CrushedChromium);
    	OreDictionary.registerOre("dustIronOor", OorTech.IronDust);
    	OreDictionary.registerOre("dustGoldOor", OorTech.GoldDust);
    	OreDictionary.registerOre("dustCopperOor", OorTech.CopperDust);
    	OreDictionary.registerOre("dustTinOor", OorTech.TinDust);
    	OreDictionary.registerOre("dustLeadOor", OorTech.LeadDust);
    	OreDictionary.registerOre("dustSilverOor", OorTech.SilverDust);
    	OreDictionary.registerOre("dustPlatinumOor", OorTech.PlatinumDust);
    	OreDictionary.registerOre("dustZincOor", OorTech.ZincDust);
    	OreDictionary.registerOre("dustNickelOor", OorTech.NickelDust);
    	OreDictionary.registerOre("dustChromiumOor", OorTech.ChromiumDust);
    	OreDictionary.registerOre("dustSalt", OorTech.Salt);
    	OreDictionary.registerOre("dustAluminumOor", OorTech.AluminaDust);
    	OreDictionary.registerOre("dustTitaniumOor", OorTech.TitanateDust);
    	OreDictionary.registerOre("dustTungstenOor", OorTech.TungstateDust);
    	OreDictionary.registerOre("dustPurifiedIron", OorTech.PurifiedIron);
    	OreDictionary.registerOre("dustPurifiedGold", OorTech.PurifiedGold);
    	OreDictionary.registerOre("dustPurifiedCopper", OorTech.PurifiedCopper);
    	OreDictionary.registerOre("dustPurifiedTin", OorTech.PurifiedTin);
    	OreDictionary.registerOre("dustPurifiedLead", OorTech.PurifiedLead);
    	OreDictionary.registerOre("dustPurifiedSilver", OorTech.PurifiedSilver);
    	OreDictionary.registerOre("dustPurifiedPlatinum", OorTech.PurifiedPlatinum);
    	OreDictionary.registerOre("dustPurifiedZinc", OorTech.PurifiedZinc);
    	OreDictionary.registerOre("dustPurifiedNickel", OorTech.PurifiedNickel);
    	OreDictionary.registerOre("dustPurifiedChromium", OorTech.PurifiedChromium);
    	OreDictionary.registerOre("dustPurifiedAlumina", OorTech.PurifiedAlumina);
    	OreDictionary.registerOre("dustPurifiedTitanate", OorTech.PurifiedTitanate);
    	OreDictionary.registerOre("dustPurifiedTungstate", OorTech.PurifiedTungstate);
    	OreDictionary.registerOre("dustRefinedIron", OorTech.RefinedIron);
    	OreDictionary.registerOre("dustRefinedGold", OorTech.RefinedGold);
    	OreDictionary.registerOre("dustRefinedCopper", OorTech.RefinedCopper);
    	OreDictionary.registerOre("dustRefinedTin", OorTech.RefinedTin);
    	OreDictionary.registerOre("dustRefinedLead", OorTech.RefinedLead);
    	OreDictionary.registerOre("dustRefinedSilver", OorTech.RefinedSilver);
    	OreDictionary.registerOre("dustRefinedPlatinum", OorTech.RefinedPlatinum);
    	OreDictionary.registerOre("dustRefinedZinc", OorTech.RefinedZinc);
    	OreDictionary.registerOre("dustRefinedNickel", OorTech.RefinedNickel);
    	OreDictionary.registerOre("dustRefinedChromium", OorTech.RefinedChromium);
    	OreDictionary.registerOre("dustRefinedAlumina", OorTech.RefinedAlumina);
    	OreDictionary.registerOre("dustRefinedTitanate", OorTech.RefinedTitanate);
    	OreDictionary.registerOre("dustRefinedTungstate", OorTech.RefinedTungstate);
    	OreDictionary.registerOre("ingotCopper", OorTech.CopperIngot);
    	OreDictionary.registerOre("ingotTin", OorTech.TinIngot);
    	OreDictionary.registerOre("ingotLead", OorTech.LeadIngot);
    	OreDictionary.registerOre("ingotSilver", OorTech.SilverIngot);
    	OreDictionary.registerOre("ingotPlatinum", OorTech.PlatinumIngot);
    	OreDictionary.registerOre("ingotZinc", OorTech.ZincIngot);
    	OreDictionary.registerOre("ingotNickel", OorTech.NickelIngot);
    	OreDictionary.registerOre("ingotChromium", OorTech.ChromiumIngot);
    	OreDictionary.registerOre("ingotAluminumOor", OorTech.AluminumIngot);
    	OreDictionary.registerOre("ingotTitaniumOor", OorTech.TitaniumIngot);
    	OreDictionary.registerOre("ingotTungstenOor", OorTech.TungstenIngot);
    	OreDictionary.registerOre("ingotSteelOor", OorTech.SteelIngot);
    	OreDictionary.registerOre("nuggetIron", OorTech.IronNugget);
    	OreDictionary.registerOre("nuggetCopper", OorTech.CopperNugget);
    	OreDictionary.registerOre("nuggetTin", OorTech.TinNugget);
    	OreDictionary.registerOre("nuggetLead", OorTech.LeadNugget);
    	OreDictionary.registerOre("nuggetSilver", OorTech.SilverNugget);
    	OreDictionary.registerOre("nuggetPlatinum", OorTech.PlatinumNugget);
    	OreDictionary.registerOre("nuggetZinc", OorTech.ZincNugget);
    	OreDictionary.registerOre("nuggetNickel", OorTech.NickelNugget);
    	OreDictionary.registerOre("nuggetChromium", OorTech.ChromiumNugget);
    	OreDictionary.registerOre("nuggetAluminum", OorTech.AluminumNugget);
    	OreDictionary.registerOre("nuggetTitanium", OorTech.TitaniumNugget);
    	OreDictionary.registerOre("nuggetTungsten", OorTech.TungstenNugget);
    	OreDictionary.registerOre("nuggetSteel", OorTech.SteelNugget);
    	OreDictionary.registerOre("lumpSulfur", OorTech.SulfurChunk);
    	OreDictionary.registerOre("dustSulfurOor", OorTech.SulfurDust);
    	OreDictionary.registerOre("materialCryolite", OorTech.ItemCryolite);


    }
}
