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
    
    public static Block CopperOre, TinOre, LeadOre, SilverOre, NickelOre, PlatinumOre, ZincOre, CobaltOre, ChromiumOre, UraniumOre, PlutoniumOre, Limestone, SaltRock, Bauxite, Rutile, Scheelite, Cryolite, SulfurOre;
    
    //Items
    
    public static Item MortarAndPestle, Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite, CrushedIron, CrushedGold,  CrushedCopper, CrushedTin, CrushedLead, CrushedSilver, CrushedNickel, CrushedPlatinum, CrushedZinc,  CrushedChromium, IronDust, GoldDust, CopperDust, TinDust, LeadDust, SilverDust, NickelDust, PlatinumDust, ZincDust, CobaltDust, ChromiumDust, Salt, AluminaDust, TitanateDust, TungstateDust, PurifiedIron, PurifiedGold, PurifiedCopper, PurifiedTin, PurifiedLead, PurifiedSilver, PurifiedNickel, PurifiedPlatinum, PurifiedZinc, PurifiedCobalt, PurifiedChromium, PurifiedAlumina, PurifiedTitanate, PurifiedTungstate, RefinedIron, RefinedGold, RefinedCopper, RefinedTin, RefinedLead, RefinedSilver, RefinedNickel, RefinedPlatinum, RefinedZinc, RefinedCobalt, RefinedChromium, RefinedAlumina, RefinedTitanate, RefinedTungstate, CopperIngot, TinIngot, LeadIngot, SilverIngot, NickelIngot, PlatinumIngot, ZincIngot, CobaltIngot, ChromiumIngot, UraniumIngot, PlutoniumIngot, SteelIngot, AluminumIngot, TungstenIngot, TitaniumIngot, IronNugget, CopperNugget, TinNugget, LeadNugget, SilverNugget, PlatinumNugget, ZincNugget, NickelNugget, ChromiumNugget, AluminumNugget, TitaniumNugget, TungstenNugget, SteelNugget, SulfurChunk, SulfurDust, ItemCryolite;
    
    
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
    	UraniumOre = new UraniumOre();
    	PlutoniumOre = new PlutoniumOre();
    	Limestone = new Limestone();
    	SaltRock = new SaltRock();
    	Bauxite = new Bauxite();
    	Rutile = new Rutile();
    	Scheelite = new Scheelite();
    	Cryolite = new Cryolite();
    	SulfurOre = new SulfurOre();
    	
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
    	
    	
    	//Registry
    	
    	GameRegistry.registerBlock(CopperOre, "CopperOre");
    	GameRegistry.registerBlock(Limestone, "Limestone");
    	GameRegistry.registerBlock(TinOre, "TinOre");
    	GameRegistry.registerBlock(LeadOre, "LeadOre");
    	GameRegistry.registerBlock(SilverOre, "SilverOre");
    	GameRegistry.registerBlock(Bauxite, "Bauxite");
    	
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
    	OreDictionary.registerOre("oreLimestone", OorTech.Limestone);
    	OreDictionary.registerOre("oreBauxite", OorTech.Bauxite);
    	OreDictionary.registerOre("materialCalcite", OorTech.Calcite);
    	OreDictionary.registerOre("materialBauxite", OorTech.RawBauxite);
    	OreDictionary.registerOre("dustAlumina", OorTech.AluminaDust);
    	OreDictionary.registerOre("ingotCopper", OorTech.CopperIngot);
    	OreDictionary.registerOre("ingotTin", OorTech.TinIngot);
    	OreDictionary.registerOre("ingotLead", OorTech.LeadIngot);
    	OreDictionary.registerOre("ingotSilver", OorTech.SilverIngot);
    	OreDictionary.registerOre("ingotAluminum", OorTech.AluminumIngot);
    	OreDictionary.registerOre("ingotSteel", OorTech.SteelIngot);


    }
}
