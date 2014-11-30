package com.teamoort.redoxiation;

import com.teamoort.redoxiation.blocks.ArgentAurum;
import com.teamoort.redoxiation.blocks.Bauxite;
import com.teamoort.redoxiation.blocks.BlockHotAir;
import com.teamoort.redoxiation.blocks.BlockMoltenPigiron;
import com.teamoort.redoxiation.blocks.ChromiumObsidian;
import com.teamoort.redoxiation.blocks.ChromiumOre;
import com.teamoort.redoxiation.blocks.CobaltObsidian;
import com.teamoort.redoxiation.blocks.CobaltOre;
import com.teamoort.redoxiation.blocks.CopperObsidian;
import com.teamoort.redoxiation.blocks.CopperOre;
import com.teamoort.redoxiation.blocks.Cryolite;
import com.teamoort.redoxiation.blocks.FerronickelOre;
import com.teamoort.redoxiation.blocks.GoldObsidian;
import com.teamoort.redoxiation.blocks.IronObsidian;
import com.teamoort.redoxiation.blocks.LeadObsidian;
import com.teamoort.redoxiation.blocks.LeadOre;
import com.teamoort.redoxiation.blocks.Limestone;
import com.teamoort.redoxiation.blocks.NickelObsidian;
import com.teamoort.redoxiation.blocks.NickelOre;
import com.teamoort.redoxiation.blocks.Pitchblend;
import com.teamoort.redoxiation.blocks.PlatinumObsidian;
import com.teamoort.redoxiation.blocks.PlatinumOre;
import com.teamoort.redoxiation.blocks.PlutoniumObsidian;
import com.teamoort.redoxiation.blocks.PlutoniumOre;
import com.teamoort.redoxiation.blocks.PseudoBrassOre;
import com.teamoort.redoxiation.blocks.PseudoBronzeOre;
import com.teamoort.redoxiation.blocks.PseudoSolder;
import com.teamoort.redoxiation.blocks.PseudoStellite;
import com.teamoort.redoxiation.blocks.Rutile;
import com.teamoort.redoxiation.blocks.SaltRock;
import com.teamoort.redoxiation.blocks.Scheelite;
import com.teamoort.redoxiation.blocks.SilverObsidian;
import com.teamoort.redoxiation.blocks.SilverOre;
import com.teamoort.redoxiation.blocks.SulfurOre;
import com.teamoort.redoxiation.blocks.TNTium;
import com.teamoort.redoxiation.blocks.TinObsidian;
import com.teamoort.redoxiation.blocks.TinOre;
import com.teamoort.redoxiation.blocks.UraniumObsidian;
import com.teamoort.redoxiation.blocks.ZincObsidian;
import com.teamoort.redoxiation.blocks.ZincOre;
import com.teamoort.redoxiation.items.RedoxiationGenericItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.BlockFluidClassic;
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

@Mod(modid = Redoxiation.MODID, version = Redoxiation.VERSION)
public class Redoxiation
{
    public static final String MODID = "Redoxiation";
    public static final String VERSION = "Alpha 0.0.0.002";
    
    public static final CreativeTabs tabRedoxiation = new CreativeTabs("Redoxiation")
    {
        private static final String __OBFID = "CL_00000080";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
        	return Redoxiation.Calcite;
        }
    };
    
    @Metadata
    public ModMetadata meta;
    
    //Blocks
    
    public static Block CopperOre, TinOre, LeadOre, SilverOre, NickelOre, PlatinumOre, ZincOre, CobaltOre, ChromiumOre, Pitchblend, PlutoniumOre, Limestone, SaltRock, Bauxite, Rutile, Scheelite, Cryolite, SulfurOre, FerronickelOre, PseudoBronzeOre, PseudoBrassOre, ArgentAurum, PseudoSolder, PseudoStellite, TNTium, IronObsidian, GoldObsidian, CopperObsidian, TinObsidian, LeadObsidian, SilverObsidian, NickelObsidian, PlatinumObsidian, ZincObsidian, CobaltObsidian, ChromiumObsidian, UraniumObsidian, PlutoniumObsidian;
    
    //Items
    
    public static Item MortarAndPestle, Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite, CrushedIron, CrushedGold,  CrushedCopper, CrushedTin, CrushedLead, CrushedSilver, CrushedNickel, CrushedPlatinum, CrushedZinc,  CrushedChromium, IronDust, GoldDust, CopperDust, TinDust, LeadDust, SilverDust, NickelDust, PlatinumDust, ZincDust, CobaltDust, ChromiumDust, Salt, AluminaDust, TitanateDust, TungstateDust, PurifiedIron, PurifiedGold, PurifiedCopper, PurifiedTin, PurifiedLead, PurifiedSilver, PurifiedNickel, PurifiedPlatinum, PurifiedZinc, PurifiedCobalt, PurifiedChromium, PurifiedAlumina, PurifiedTitanate, PurifiedTungstate, RefinedIron, RefinedGold, RefinedCopper, RefinedTin, RefinedLead, RefinedSilver, RefinedNickel, RefinedPlatinum, RefinedZinc, RefinedCobalt, RefinedChromium, RefinedAlumina, RefinedTitanate, RefinedTungstate, CopperIngot, TinIngot, LeadIngot, SilverIngot, NickelIngot, PlatinumIngot, ZincIngot, CobaltIngot, ChromiumIngot, UraniumIngot, PlutoniumIngot, SteelIngot, AluminumIngot, TungstenIngot, TitaniumIngot, IronNugget, CopperNugget, TinNugget, LeadNugget, SilverNugget, PlatinumNugget, ZincNugget, NickelNugget, ChromiumNugget, AluminumNugget, TitaniumNugget, TungstenNugget, SteelNugget, SulfurChunk, SulfurDust, ItemCryolite, CrashedNetherrack, CrashedObsidian;
    
    //fluids

    public static Fluid HotAir, MoltenPigiron;
    public static BlockFluidClassic HotAirBlock, MoltenPigironBlock;
    
    RedoxiationEventHandler handler = new RedoxiationEventHandler();
    
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
    	Pitchblend = new Pitchblend();
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
    	
    	MortarAndPestle = new RedoxiationGenericItems("MortarAndPestle");
    	Calcite = new RedoxiationGenericItems("Calcite");
    	SaltChunk = new RedoxiationGenericItems("SaltChunk");
    	RawBauxite = new RedoxiationGenericItems("RawBauxite");
    	RawRutile = new RedoxiationGenericItems("RawRutile");
    	RawScheelite = new RedoxiationGenericItems("RawScheelite");
    	CrushedIron = new RedoxiationGenericItems("CrushedIron");
    	CrushedGold = new RedoxiationGenericItems("CrushedGold");
    	CrushedCopper = new RedoxiationGenericItems("CrushedCopper");
    	CrushedTin = new RedoxiationGenericItems("CrushedTin");
    	CrushedLead = new RedoxiationGenericItems("CrushedLead");
    	CrushedSilver = new RedoxiationGenericItems("CrushedSilver");
    	CrushedPlatinum = new RedoxiationGenericItems("CrushedPlatinum");
    	CrushedZinc = new RedoxiationGenericItems("CrushedZinc");
    	CrushedNickel = new RedoxiationGenericItems("CrushedNickel");
    	CrushedChromium = new RedoxiationGenericItems("CrushedChromium");
    	IronDust = new RedoxiationGenericItems("IronDust");
    	GoldDust = new RedoxiationGenericItems("GoldDust");
    	CopperDust = new RedoxiationGenericItems("CopperDust");
    	TinDust = new RedoxiationGenericItems("TinDust");
    	LeadDust = new RedoxiationGenericItems("LeadDust");
    	SilverDust = new RedoxiationGenericItems("SilverDust");
    	PlatinumDust = new RedoxiationGenericItems("PlatinumDust");
    	ZincDust = new RedoxiationGenericItems("ZincDust");
    	NickelDust = new RedoxiationGenericItems("NickelDust");
    	ChromiumDust = new RedoxiationGenericItems("ChromiumDust");
    	Salt = new RedoxiationGenericItems("Salt");
    	AluminaDust = new RedoxiationGenericItems("AluminaDust");
    	TitanateDust = new RedoxiationGenericItems("TitanateDust");
    	TungstateDust = new RedoxiationGenericItems("TungstateDust");
    	PurifiedIron = new RedoxiationGenericItems("PurifiedIron");
    	PurifiedGold = new RedoxiationGenericItems("PurifiedGold");
    	PurifiedCopper = new RedoxiationGenericItems("PurifiedCopper");
    	PurifiedTin = new RedoxiationGenericItems("PurifiedTin");
    	PurifiedLead = new RedoxiationGenericItems("PurifiedLead");
    	PurifiedSilver = new RedoxiationGenericItems("PurifiedSilver");
    	PurifiedPlatinum = new RedoxiationGenericItems("PurifiedPlatinum");
    	PurifiedZinc = new RedoxiationGenericItems("PurifiedZinc");
    	PurifiedNickel = new RedoxiationGenericItems("PurifiedNickel");
    	PurifiedChromium = new RedoxiationGenericItems("PurifiedChromium");
    	PurifiedAlumina = new RedoxiationGenericItems("PurifiedAlumina");
    	PurifiedTitanate = new RedoxiationGenericItems("PurifiedTitanate");
    	PurifiedTungstate = new RedoxiationGenericItems("PurifiedTungstate");
    	RefinedIron = new RedoxiationGenericItems("RefinedIron");
    	RefinedGold = new RedoxiationGenericItems("RefinedGold");
    	RefinedCopper = new RedoxiationGenericItems("RefinedCopper");
    	RefinedTin = new RedoxiationGenericItems("RefinedTin");
    	RefinedLead = new RedoxiationGenericItems("RefinedLead");
    	RefinedSilver = new RedoxiationGenericItems("RefinedSilver");
    	RefinedPlatinum = new RedoxiationGenericItems("RefinedPlatinum");
    	RefinedZinc = new RedoxiationGenericItems("RefinedZinc");
    	RefinedNickel = new RedoxiationGenericItems("RefinedNickel");
    	RefinedChromium = new RedoxiationGenericItems("RefinedChromium");
    	RefinedAlumina = new RedoxiationGenericItems("RefinedAlumina");
    	RefinedTitanate = new RedoxiationGenericItems("RefinedTitanate");
    	RefinedTungstate = new RedoxiationGenericItems("RefinedTungstate");
    	CopperIngot = new RedoxiationGenericItems("CopperIngot");
    	TinIngot = new RedoxiationGenericItems("TinIngot");
    	LeadIngot = new RedoxiationGenericItems("LeadIngot");
    	SilverIngot = new RedoxiationGenericItems("SilverIngot");
    	PlatinumIngot = new RedoxiationGenericItems("PlatinumIngot");
    	ZincIngot = new RedoxiationGenericItems("ZincIngot");
    	NickelIngot = new RedoxiationGenericItems("NickelIngot");
    	ChromiumIngot = new RedoxiationGenericItems("ChromiumIngot");
    	AluminumIngot = new RedoxiationGenericItems("AluminumIngot");
    	TitaniumIngot = new RedoxiationGenericItems("TitaniumIngot");
    	TungstenIngot = new RedoxiationGenericItems("TungstenIngot");
    	SteelIngot = new RedoxiationGenericItems("SteelIngot");
    	IronNugget = new RedoxiationGenericItems("IronNugget");
    	CopperNugget = new RedoxiationGenericItems("CopperNugget");
    	TinNugget = new RedoxiationGenericItems("TinNugget");
    	LeadNugget = new RedoxiationGenericItems("LeadNugget");
    	SilverNugget = new RedoxiationGenericItems("SilverNugget");
    	PlatinumNugget = new RedoxiationGenericItems("PlatinumNugget");
    	ZincNugget = new RedoxiationGenericItems("ZincNugget");
    	NickelNugget = new RedoxiationGenericItems("NickelNugget");
    	ChromiumNugget = new RedoxiationGenericItems("ChromiumNugget");
    	AluminumNugget = new RedoxiationGenericItems("AluminumNugget");
    	TitaniumNugget = new RedoxiationGenericItems("TitaniumNugget");
    	TungstenNugget = new RedoxiationGenericItems("TungstenNugget");
    	SteelNugget = new RedoxiationGenericItems("SteelNugget");
    	SulfurChunk = new RedoxiationGenericItems("SulfurChunk");
    	SulfurDust = new RedoxiationGenericItems("SulfurDust");
    	ItemCryolite = new RedoxiationGenericItems("ItemCryolite");
    	CrashedNetherrack = new RedoxiationGenericItems("CrashedNetherrack");
    	CrashedObsidian = new RedoxiationGenericItems("CrashedObsidian");
    	
    	
    	
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
    	
    	OreDictionary.registerOre("oreCopper", Redoxiation.CopperOre);
    	OreDictionary.registerOre("oreTin", Redoxiation.TinOre);
    	OreDictionary.registerOre("oreLead", Redoxiation.LeadOre);
   		OreDictionary.registerOre("oreSilver", Redoxiation.SilverOre);
    	OreDictionary.registerOre("oreNickel", Redoxiation.NickelOre);
  		OreDictionary.registerOre("orePlatinum", Redoxiation.PlatinumOre);
    	OreDictionary.registerOre("oreZinc", Redoxiation.ZincOre);
    	OreDictionary.registerOre("oreCobalt", Redoxiation.CobaltOre);
 		OreDictionary.registerOre("oreChromium", Redoxiation.ChromiumOre);
   		OreDictionary.registerOre("orePitchblend", Redoxiation.Pitchblend); 
    	OreDictionary.registerOre("orePlutonium", Redoxiation.PlutoniumOre);   	
   		OreDictionary.registerOre("blockLimestone", Redoxiation.Limestone);
    	OreDictionary.registerOre("blockSaltRock", Redoxiation.SaltRock);
    	OreDictionary.registerOre("blockBauxite", Redoxiation.Bauxite);
    	OreDictionary.registerOre("blockRutile", Redoxiation.Rutile);
    	OreDictionary.registerOre("blockScheelite", Redoxiation.Scheelite);
    	OreDictionary.registerOre("blockCryolite", Redoxiation.Cryolite);
    	OreDictionary.registerOre("oreSulfur", Redoxiation.SulfurOre);
    	OreDictionary.registerOre("blockFerronickel", Redoxiation.FerronickelOre);
    	OreDictionary.registerOre("blockPseudoBronze", Redoxiation.PseudoBronzeOre);
    	OreDictionary.registerOre("blockPseudoBrass", Redoxiation.PseudoBrassOre);
    	OreDictionary.registerOre("blockArgentAurum", Redoxiation.ArgentAurum);
    	OreDictionary.registerOre("blockPseudoSolder", Redoxiation.PseudoSolder);
    	OreDictionary.registerOre("blockPseudoStellite", Redoxiation.PseudoStellite);
    	OreDictionary.registerOre("blockTNTium", Redoxiation.TNTium);
    	OreDictionary.registerOre("oreIronObsidian", Redoxiation.IronObsidian);
    	OreDictionary.registerOre("oreGoldObsidian", Redoxiation.GoldObsidian);
    	OreDictionary.registerOre("oreCopperObsidian", Redoxiation.CopperObsidian);
    	OreDictionary.registerOre("oreTinObsidian", Redoxiation.TinObsidian);
    	OreDictionary.registerOre("oreLeadObsidian", Redoxiation.LeadObsidian);
    	OreDictionary.registerOre("oreSilverObsidian", Redoxiation.SilverObsidian);
    	OreDictionary.registerOre("oreNickelObsidian", Redoxiation.NickelObsidian);
    	OreDictionary.registerOre("orePlatinumObsidian", Redoxiation.PlatinumObsidian);
    	OreDictionary.registerOre("oreZincObsidian", Redoxiation.ZincObsidian);
    	OreDictionary.registerOre("oreCobaltObsidian", Redoxiation.CobaltObsidian);
    	OreDictionary.registerOre("oreChromiumObsidian", Redoxiation.ChromiumObsidian);
    	OreDictionary.registerOre("oreUraniumObsidian", Redoxiation.UraniumObsidian);
    	OreDictionary.registerOre("orePlutoniumObsidian", Redoxiation.PlutoniumObsidian);

    	OreDictionary.registerOre("materialMortarAndPestle", Redoxiation.MortarAndPestle);
    	OreDictionary.registerOre("materialCalcite", Redoxiation.Calcite);
    	OreDictionary.registerOre("lumpSalt", Redoxiation.SaltChunk);
    	OreDictionary.registerOre("lumpBauxite", Redoxiation.RawBauxite);
    	OreDictionary.registerOre("lumpRutile", Redoxiation.RawRutile);
    	OreDictionary.registerOre("lumpScheelite", Redoxiation.RawScheelite);
    	OreDictionary.registerOre("crushedIron", Redoxiation.CrushedIron);
    	OreDictionary.registerOre("crushedGold", Redoxiation.CrushedGold);
    	OreDictionary.registerOre("crushedCopper", Redoxiation.CrushedCopper);
    	OreDictionary.registerOre("crushedTin", Redoxiation.CrushedTin);
    	OreDictionary.registerOre("crushedLead", Redoxiation.CrushedLead);
    	OreDictionary.registerOre("crushedSilver", Redoxiation.CrushedSilver);
    	OreDictionary.registerOre("crushedPlatinum", Redoxiation.CrushedPlatinum);
    	OreDictionary.registerOre("crushedZinc", Redoxiation.CrushedZinc);
    	OreDictionary.registerOre("crushedNickel", Redoxiation.CrushedNickel);
    	OreDictionary.registerOre("crushedChromium", Redoxiation.CrushedChromium);
    	OreDictionary.registerOre("dustIronOort", Redoxiation.IronDust);
    	OreDictionary.registerOre("dustGoldOort", Redoxiation.GoldDust);
    	OreDictionary.registerOre("dustCopperOort", Redoxiation.CopperDust);
    	OreDictionary.registerOre("dustTinOort", Redoxiation.TinDust);
    	OreDictionary.registerOre("dustLeadOort", Redoxiation.LeadDust);
    	OreDictionary.registerOre("dustSilverOort", Redoxiation.SilverDust);
    	OreDictionary.registerOre("dustPlatinumOort", Redoxiation.PlatinumDust);
    	OreDictionary.registerOre("dustZincOort", Redoxiation.ZincDust);
    	OreDictionary.registerOre("dustNickelOort", Redoxiation.NickelDust);
    	OreDictionary.registerOre("dustChromiumOort", Redoxiation.ChromiumDust);
    	OreDictionary.registerOre("dustSalt", Redoxiation.Salt);
    	OreDictionary.registerOre("dustAluminumOort", Redoxiation.AluminaDust);
    	OreDictionary.registerOre("dustTitaniumOort", Redoxiation.TitanateDust);
    	OreDictionary.registerOre("dustTungstenOort", Redoxiation.TungstateDust);
    	OreDictionary.registerOre("dustPurifiedIron", Redoxiation.PurifiedIron);
    	OreDictionary.registerOre("dustPurifiedGold", Redoxiation.PurifiedGold);
    	OreDictionary.registerOre("dustPurifiedCopper", Redoxiation.PurifiedCopper);
    	OreDictionary.registerOre("dustPurifiedTin", Redoxiation.PurifiedTin);
    	OreDictionary.registerOre("dustPurifiedLead", Redoxiation.PurifiedLead);
    	OreDictionary.registerOre("dustPurifiedSilver", Redoxiation.PurifiedSilver);
    	OreDictionary.registerOre("dustPurifiedPlatinum", Redoxiation.PurifiedPlatinum);
    	OreDictionary.registerOre("dustPurifiedZinc", Redoxiation.PurifiedZinc);
    	OreDictionary.registerOre("dustPurifiedNickel", Redoxiation.PurifiedNickel);
    	OreDictionary.registerOre("dustPurifiedChromium", Redoxiation.PurifiedChromium);
    	OreDictionary.registerOre("dustPurifiedAlumina", Redoxiation.PurifiedAlumina);
    	OreDictionary.registerOre("dustPurifiedTitanate", Redoxiation.PurifiedTitanate);
    	OreDictionary.registerOre("dustPurifiedTungstate", Redoxiation.PurifiedTungstate);
    	OreDictionary.registerOre("dustRefinedIron", Redoxiation.RefinedIron);
    	OreDictionary.registerOre("dustRefinedGold", Redoxiation.RefinedGold);
    	OreDictionary.registerOre("dustRefinedCopper", Redoxiation.RefinedCopper);
    	OreDictionary.registerOre("dustRefinedTin", Redoxiation.RefinedTin);
    	OreDictionary.registerOre("dustRefinedLead", Redoxiation.RefinedLead);
    	OreDictionary.registerOre("dustRefinedSilver", Redoxiation.RefinedSilver);
    	OreDictionary.registerOre("dustRefinedPlatinum", Redoxiation.RefinedPlatinum);
    	OreDictionary.registerOre("dustRefinedZinc", Redoxiation.RefinedZinc);
    	OreDictionary.registerOre("dustRefinedNickel", Redoxiation.RefinedNickel);
    	OreDictionary.registerOre("dustRefinedChromium", Redoxiation.RefinedChromium);
    	OreDictionary.registerOre("dustRefinedAlumina", Redoxiation.RefinedAlumina);
    	OreDictionary.registerOre("dustRefinedTitanate", Redoxiation.RefinedTitanate);
    	OreDictionary.registerOre("dustRefinedTungstate", Redoxiation.RefinedTungstate);
    	OreDictionary.registerOre("ingotCopper", Redoxiation.CopperIngot);
    	OreDictionary.registerOre("ingotTin", Redoxiation.TinIngot);
    	OreDictionary.registerOre("ingotLead", Redoxiation.LeadIngot);
    	OreDictionary.registerOre("ingotSilver", Redoxiation.SilverIngot);
    	OreDictionary.registerOre("ingotPlatinum", Redoxiation.PlatinumIngot);
    	OreDictionary.registerOre("ingotZinc", Redoxiation.ZincIngot);
    	OreDictionary.registerOre("ingotNickel", Redoxiation.NickelIngot);
    	OreDictionary.registerOre("ingotChromium", Redoxiation.ChromiumIngot);
    	OreDictionary.registerOre("ingotAluminumOort", Redoxiation.AluminumIngot);
    	OreDictionary.registerOre("ingotTitaniumOort", Redoxiation.TitaniumIngot);
    	OreDictionary.registerOre("ingotTungstenOort", Redoxiation.TungstenIngot);
    	OreDictionary.registerOre("ingotSteelOort", Redoxiation.SteelIngot);
    	OreDictionary.registerOre("nuggetIron", Redoxiation.IronNugget);
    	OreDictionary.registerOre("nuggetCopper", Redoxiation.CopperNugget);
    	OreDictionary.registerOre("nuggetTin", Redoxiation.TinNugget);
    	OreDictionary.registerOre("nuggetLead", Redoxiation.LeadNugget);
    	OreDictionary.registerOre("nuggetSilver", Redoxiation.SilverNugget);
    	OreDictionary.registerOre("nuggetPlatinum", Redoxiation.PlatinumNugget);
    	OreDictionary.registerOre("nuggetZinc", Redoxiation.ZincNugget);
    	OreDictionary.registerOre("nuggetNickel", Redoxiation.NickelNugget);
    	OreDictionary.registerOre("nuggetChromium", Redoxiation.ChromiumNugget);
    	OreDictionary.registerOre("nuggetAluminum", Redoxiation.AluminumNugget);
    	OreDictionary.registerOre("nuggetTitanium", Redoxiation.TitaniumNugget);
    	OreDictionary.registerOre("nuggetTungsten", Redoxiation.TungstenNugget);
    	OreDictionary.registerOre("nuggetSteel", Redoxiation.SteelNugget);
    	OreDictionary.registerOre("lumpSulfur", Redoxiation.SulfurChunk);
    	OreDictionary.registerOre("dustSulfurOort", Redoxiation.SulfurDust);
    	OreDictionary.registerOre("materialCryolite", Redoxiation.ItemCryolite);

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
