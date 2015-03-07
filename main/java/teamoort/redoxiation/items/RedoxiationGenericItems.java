package teamoort.redoxiation.items;


import java.util.List;

import teamoort.redoxiation.Redoxiation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RedoxiationGenericItems extends Item{

	private final String itemname;
	private final String information;
	
	public static Item Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite, CrushedIron, CrushedGold,  CrushedCopper, CrushedTin, CrushedLead, CrushedSilver, CrushedNickel, CrushedPlatinum, CrushedZinc,  CrushedChromium, IronDust, GoldDust, CopperDust, TinDust, LeadDust, SilverDust, NickelDust, PlatinumDust, ZincDust, CobaltDust, ChromiumDust, Salt, AluminaDust, TitanateDust, TungstateDust, PurifiedIron, PurifiedGold, PurifiedCopper, PurifiedTin, PurifiedLead, PurifiedSilver, PurifiedNickel, PurifiedPlatinum, PurifiedZinc, PurifiedCobalt, PurifiedChromium, PurifiedAlumina, PurifiedTitanate, PurifiedTungstate, RefinedIron, RefinedGold, RefinedCopper, RefinedTin, RefinedLead, RefinedSilver, RefinedNickel, RefinedPlatinum, RefinedZinc, RefinedCobalt, RefinedChromium, RefinedAlumina, RefinedTitanate, RefinedTungstate, CopperIngot, TinIngot, LeadIngot, SilverIngot, NickelIngot, PlatinumIngot, ZincIngot, CobaltIngot, ChromiumIngot, UraniumIngot, PlutoniumIngot, SteelIngot, AluminumIngot, TungstenIngot, TitaniumIngot, IronNugget, CopperNugget, TinNugget, LeadNugget, SilverNugget, PlatinumNugget, ZincNugget, NickelNugget, ChromiumNugget, AluminumNugget, TitaniumNugget, TungstenNugget, SteelNugget, SulfurChunk, SulfurDust, ItemCryolite, CrashedNetherrack, CrashedObsidian;
	public static boolean Calcite_enable, SaltChunk_enable, RawBauxite_enable, RawRutile_enable, RawScheelite_enable, CrushedIron_enable, CrushedGold_enable,  CrushedCopper_enable, CrushedTin_enable, CrushedLead_enable, CrushedSilver_enable, CrushedNickel_enable, CrushedPlatinum_enable, CrushedZinc_enable,  CrushedChromium_enable, IronDust_enable, GoldDust_enable, CopperDust_enable, TinDust_enable, LeadDust_enable, SilverDust_enable, NickelDust_enable, PlatinumDust_enable, ZincDust_enable, CobaltDust_enable, ChromiumDust_enable,
	Salt_enable, AluminaDust_enable, TitanateDust_enable, TungstateDust_enable, PurifiedIron_enable, PurifiedGold_enable, PurifiedCopper_enable, PurifiedTin_enable, PurifiedLead_enable, PurifiedSilver_enable, PurifiedNickel_enable, PurifiedPlatinum_enable, PurifiedZinc_enable, PurifiedCobalt_enable, PurifiedChromium_enable, PurifiedAlumina_enable, PurifiedTitanate_enable, PurifiedTungstate_enable, RefinedIron_enable, RefinedGold_enable, RefinedCopper_enable, RefinedTin_enable, RefinedLead_enable, RefinedSilver_enable, RefinedNickel_enable, RefinedPlatinum_enable, RefinedZinc_enable, RefinedCobalt_enable, RefinedChromium_enable, RefinedAlumina_enable, RefinedTitanate_enable, RefinedTungstate_enable, CopperIngot_enable, TinIngot_enable, LeadIngot_enable, SilverIngot_enable, NickelIngot_enable, PlatinumIngot_enable, ZincIngot_enable, CobaltIngot_enable, ChromiumIngot_enable, UraniumIngot_enable, PlutoniumIngot_enable, SteelIngot_enable, AluminumIngot_enable, TungstenIngot_enable, TitaniumIngot_enable, IronNugget_enable, CopperNugget_enable, TinNugget_enable, LeadNugget_enable, SilverNugget_enable, PlatinumNugget_enable, ZincNugget_enable, NickelNugget_enable, ChromiumNugget_enable, AluminumNugget_enable, TitaniumNugget_enable, TungstenNugget_enable, SteelNugget_enable, SulfurChunk_enable, SulfurDust_enable, ItemCryolite_enable, CrashedNetherrack_enable, CrashedObsidian_enable;
	
	public RedoxiationGenericItems(String name, String info)
	{
		super();
		setCreativeTab(Redoxiation.tabRedoxiationitems);
		information = info;
		itemname = name;
	}
	
	public RedoxiationGenericItems(String name)
	{
		super();
		setCreativeTab(Redoxiation.tabRedoxiationitems);
		itemname = name;
		information = "null";
	}
	
	public static void registerItems()
	{
		if(Calcite_enable)
    	Calcite = new RedoxiationGenericItems("Calcite", "CaCO3");
		if(SaltChunk_enable)
    	SaltChunk = new RedoxiationGenericItems("SaltChunk", "NaCl");
		if(RawBauxite_enable)
    	RawBauxite = new RedoxiationGenericItems("RawBauxite", "Al(OH)3");
		if(RawRutile_enable)
    	RawRutile = new RedoxiationGenericItems("RawRutile", "Ti");
		if(RawScheelite_enable)
    	RawScheelite = new RedoxiationGenericItems("RawScheelite", "CaWO4");
		if(CrushedIron_enable)
    	CrushedIron = new RedoxiationGenericItems("CrushedIron", "Fe");
		if(CrushedGold_enable)
    	CrushedGold = new RedoxiationGenericItems("CrushedGold", "Au");
		if(CrushedCopper_enable)
    	CrushedCopper = new RedoxiationGenericItems("CrushedCopper", "Cu");
		if(CrushedTin_enable)
    	CrushedTin = new RedoxiationGenericItems("CrushedTin", "Sn");
		if(CrushedLead_enable)
    	CrushedLead = new RedoxiationGenericItems("CrushedLead", "Pb");
		if(CrushedSilver_enable)
    	CrushedSilver = new RedoxiationGenericItems("CrushedSilver", "Ag");
		if(CrushedPlatinum_enable)
    	CrushedPlatinum = new RedoxiationGenericItems("CrushedPlatinum", "Pt");
		if(CrushedZinc_enable)
    	CrushedZinc = new RedoxiationGenericItems("CrushedZinc", "Zn");
		if(CrushedNickel_enable)
    	CrushedNickel = new RedoxiationGenericItems("CrushedNickel", "Ni");
		if(CrushedChromium_enable)
    	CrushedChromium = new RedoxiationGenericItems("CrushedChromium", "Cr");
		if(IronDust_enable)
    	IronDust = new RedoxiationGenericItems("IronDust", "Fe");
		if(GoldDust_enable)
    	GoldDust = new RedoxiationGenericItems("GoldDust", "Au");
		if(CopperDust_enable)
    	CopperDust = new RedoxiationGenericItems("CopperDust", "Cu");
		if(TinDust_enable)
    	TinDust = new RedoxiationGenericItems("TinDust", "Sn");
		if(LeadDust_enable)
    	LeadDust = new RedoxiationGenericItems("LeadDust", "Pb");
		if(SilverDust_enable)
    	SilverDust = new RedoxiationGenericItems("SilverDust", "Ag");
		if(PlatinumDust_enable)
    	PlatinumDust = new RedoxiationGenericItems("PlatinumDust", "Pt");
    	if(ZincDust_enable)
		ZincDust = new RedoxiationGenericItems("ZincDust", "Zn");
    	if(NickelDust_enable)
    	NickelDust = new RedoxiationGenericItems("NickelDust", "Ni");
    	if(ChromiumDust_enable)
    	ChromiumDust = new RedoxiationGenericItems("ChromiumDust", "Cr");
    	if(Salt_enable)
    	Salt = new RedoxiationGenericItems("Salt", "NaCl");
    	if(AluminaDust_enable)
    	AluminaDust = new RedoxiationGenericItems("AluminaDust", "Al2O3");
    	if(TitanateDust_enable)
    	TitanateDust = new RedoxiationGenericItems("TitanateDust", "TiO2");
    	if(TungstateDust_enable)
    	TungstateDust = new RedoxiationGenericItems("TungstateDust", "WO3");
    	if(PurifiedIron_enable)
    	PurifiedIron = new RedoxiationGenericItems("PurifiedIron", "Fe");
    	if(PurifiedGold_enable)
    	PurifiedGold = new RedoxiationGenericItems("PurifiedGold", "Au");
    	if(PurifiedCopper_enable)
    	PurifiedCopper = new RedoxiationGenericItems("PurifiedCopper", "Cu");
    	if(PurifiedTin_enable)
    	PurifiedTin = new RedoxiationGenericItems("PurifiedTin", "Sn");
    	if(PurifiedLead_enable)
    	PurifiedLead = new RedoxiationGenericItems("PurifiedLead", "Pb");
    	if(PurifiedSilver_enable)
    	PurifiedSilver = new RedoxiationGenericItems("PurifiedSilver", "Ag");
    	if(PurifiedPlatinum_enable)
    	PurifiedPlatinum = new RedoxiationGenericItems("PurifiedPlatinum", "Pt");
    	if(PurifiedZinc_enable)
    	PurifiedZinc = new RedoxiationGenericItems("PurifiedZinc", "Zn");
    	if(PurifiedNickel_enable)
    	PurifiedNickel = new RedoxiationGenericItems("PurifiedNickel", "Ni");
    	if(PurifiedChromium_enable)
    	PurifiedChromium = new RedoxiationGenericItems("PurifiedChromium", "Cr");
    	if(PurifiedAlumina_enable)
    	PurifiedAlumina = new RedoxiationGenericItems("PurifiedAlumina", "Al2O3");
    	if(PurifiedTitanate_enable)
    	PurifiedTitanate = new RedoxiationGenericItems("PurifiedTitanate", "TiO2");
    	if(PurifiedTungstate_enable)
    	PurifiedTungstate = new RedoxiationGenericItems("PurifiedTungstate", "WO3");
    	if(RefinedIron_enable)
    	RefinedIron = new RedoxiationGenericItems("RefinedIron", "Fe");
    	if(RefinedGold_enable)
    	RefinedGold = new RedoxiationGenericItems("RefinedGold", "Au");
    	RefinedCopper = new RedoxiationGenericItems("RefinedCopper", "Cu");
    	RefinedTin = new RedoxiationGenericItems("RefinedTin", "Sn");
    	RefinedLead = new RedoxiationGenericItems("RefinedLead", "Fb");
    	RefinedSilver = new RedoxiationGenericItems("RefinedSilver", "Ag");
    	RefinedPlatinum = new RedoxiationGenericItems("RefinedPlatinum", "Pt");
    	RefinedZinc = new RedoxiationGenericItems("RefinedZinc", "Zn");
    	RefinedNickel = new RedoxiationGenericItems("RefinedNickel", "Ni");
    	RefinedChromium = new RedoxiationGenericItems("RefinedChromium", "Cr");
    	RefinedAlumina = new RedoxiationGenericItems("RefinedAlumina", "Al2O3");
    	RefinedTitanate = new RedoxiationGenericItems("RefinedTitanate", "TiO2");
    	RefinedTungstate = new RedoxiationGenericItems("RefinedTungstate", "WO3");
    	CopperIngot = new RedoxiationGenericItems("CopperIngot", "Cu");
    	TinIngot = new RedoxiationGenericItems("TinIngot", "Sn");
    	LeadIngot = new RedoxiationGenericItems("LeadIngot", "Pb");
    	SilverIngot = new RedoxiationGenericItems("SilverIngot", "Ag");
    	PlatinumIngot = new RedoxiationGenericItems("PlatinumIngot", "Pt");
    	ZincIngot = new RedoxiationGenericItems("ZincIngot", "Zn");
    	NickelIngot = new RedoxiationGenericItems("NickelIngot", "Ni");
    	ChromiumIngot = new RedoxiationGenericItems("ChromiumIngot", "Cr");
    	AluminumIngot = new RedoxiationGenericItems("AluminumIngot", "Al2O3");
    	TitaniumIngot = new RedoxiationGenericItems("TitaniumIngot", "TiO2");
    	TungstenIngot = new RedoxiationGenericItems("TungstenIngot", "WO3");
    	CobaltIngot = new RedoxiationGenericItems("CobaltIngot","Co");
    	SteelIngot = new RedoxiationGenericItems("SteelIngot");
    	IronNugget = new RedoxiationGenericItems("IronNugget", "Fe");
    	CopperNugget = new RedoxiationGenericItems("CopperNugget", "Cu");
    	TinNugget = new RedoxiationGenericItems("TinNugget", "Sn");
    	LeadNugget = new RedoxiationGenericItems("LeadNugget", "Pb");
    	SilverNugget = new RedoxiationGenericItems("SilverNugget", "Ag");
    	PlatinumNugget = new RedoxiationGenericItems("PlatinumNugget", "Pt");
    	ZincNugget = new RedoxiationGenericItems("ZincNugget", "Zn");
    	NickelNugget = new RedoxiationGenericItems("NickelNugget", "Ni");
    	ChromiumNugget = new RedoxiationGenericItems("ChromiumNugget", "Cr");
    	AluminumNugget = new RedoxiationGenericItems("AluminumNugget", "Al2O3");
    	TitaniumNugget = new RedoxiationGenericItems("TitaniumNugget", "TiO2");
    	TungstenNugget = new RedoxiationGenericItems("TungstenNugget", "WO3");
    	SteelNugget = new RedoxiationGenericItems("SteelNugget");
    	SulfurChunk = new RedoxiationGenericItems("SulfurChunk");
    	SulfurDust = new RedoxiationGenericItems("SulfurDust");
    	ItemCryolite = new RedoxiationGenericItems("ItemCryolite");
    	CrashedNetherrack = new RedoxiationGenericItems("CrashedNetherrack");
    	CrashedObsidian = new RedoxiationGenericItems("CrashedObsidian");
    	
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
    	GameRegistry.registerItem(CobaltIngot, "CobaltIngot");
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
    	
    	OreDictionary.registerOre("materialCalcite", RedoxiationGenericItems.Calcite);
    	OreDictionary.registerOre("lumpSalt", RedoxiationGenericItems.SaltChunk);
    	OreDictionary.registerOre("lumpBauxite", RedoxiationGenericItems.RawBauxite);
    	OreDictionary.registerOre("lumpRutile", RedoxiationGenericItems.RawRutile);
    	OreDictionary.registerOre("lumpScheelite", RedoxiationGenericItems.RawScheelite);
    	OreDictionary.registerOre("crushedIron", RedoxiationGenericItems.CrushedIron);
    	OreDictionary.registerOre("crushedGold", RedoxiationGenericItems.CrushedGold);
    	OreDictionary.registerOre("crushedCopper", RedoxiationGenericItems.CrushedCopper);
    	OreDictionary.registerOre("crushedTin", RedoxiationGenericItems.CrushedTin);
    	OreDictionary.registerOre("crushedLead", RedoxiationGenericItems.CrushedLead);
    	OreDictionary.registerOre("crushedSilver", RedoxiationGenericItems.CrushedSilver);
    	OreDictionary.registerOre("crushedPlatinum", RedoxiationGenericItems.CrushedPlatinum);
    	OreDictionary.registerOre("crushedZinc", RedoxiationGenericItems.CrushedZinc);
    	OreDictionary.registerOre("crushedNickel", RedoxiationGenericItems.CrushedNickel);
    	OreDictionary.registerOre("crushedChromium", RedoxiationGenericItems.CrushedChromium);
    	OreDictionary.registerOre("dustIronRedox", RedoxiationGenericItems.IronDust);
    	OreDictionary.registerOre("dustGoldRedox", RedoxiationGenericItems.GoldDust);
    	OreDictionary.registerOre("dustCopperRedox", RedoxiationGenericItems.CopperDust);
    	OreDictionary.registerOre("dustTinRedox", RedoxiationGenericItems.TinDust);
    	OreDictionary.registerOre("dustLeadRedox", RedoxiationGenericItems.LeadDust);
    	OreDictionary.registerOre("dustSilverRedox", RedoxiationGenericItems.SilverDust);
    	OreDictionary.registerOre("dustPlatinumRedox", RedoxiationGenericItems.PlatinumDust);
    	OreDictionary.registerOre("dustZincRedox", RedoxiationGenericItems.ZincDust);
    	OreDictionary.registerOre("dustNickelRedox", RedoxiationGenericItems.NickelDust);
    	OreDictionary.registerOre("dustChromiumRedox", RedoxiationGenericItems.ChromiumDust);
    	OreDictionary.registerOre("dustSaltRedox", RedoxiationGenericItems.Salt);
    	OreDictionary.registerOre("dustAluminumRedox", RedoxiationGenericItems.AluminaDust);
    	OreDictionary.registerOre("dustTitaniumRedox", RedoxiationGenericItems.TitanateDust);
    	OreDictionary.registerOre("dustTungstenRedox", RedoxiationGenericItems.TungstateDust);
    	OreDictionary.registerOre("dustPurifiedIron", RedoxiationGenericItems.PurifiedIron);
    	OreDictionary.registerOre("dustPurifiedGold", RedoxiationGenericItems.PurifiedGold);
    	OreDictionary.registerOre("dustPurifiedCopper", RedoxiationGenericItems.PurifiedCopper);
    	OreDictionary.registerOre("dustPurifiedTin", RedoxiationGenericItems.PurifiedTin);
    	OreDictionary.registerOre("dustPurifiedLead", RedoxiationGenericItems.PurifiedLead);
    	OreDictionary.registerOre("dustPurifiedSilver", RedoxiationGenericItems.PurifiedSilver);
    	OreDictionary.registerOre("dustPurifiedPlatinum", RedoxiationGenericItems.PurifiedPlatinum);
    	OreDictionary.registerOre("dustPurifiedZinc", RedoxiationGenericItems.PurifiedZinc);
    	OreDictionary.registerOre("dustPurifiedNickel", RedoxiationGenericItems.PurifiedNickel);
    	OreDictionary.registerOre("dustPurifiedChromium", RedoxiationGenericItems.PurifiedChromium);
    	OreDictionary.registerOre("dustPurifiedAlumina", RedoxiationGenericItems.PurifiedAlumina);
    	OreDictionary.registerOre("dustPurifiedTitanate", RedoxiationGenericItems.PurifiedTitanate);
    	OreDictionary.registerOre("dustPurifiedTungstate", RedoxiationGenericItems.PurifiedTungstate);
    	OreDictionary.registerOre("dustRefinedIron", RedoxiationGenericItems.RefinedIron);
    	OreDictionary.registerOre("dustRefinedGold", RedoxiationGenericItems.RefinedGold);
    	OreDictionary.registerOre("dustRefinedCopper", RedoxiationGenericItems.RefinedCopper);
    	OreDictionary.registerOre("dustRefinedTin", RedoxiationGenericItems.RefinedTin);
    	OreDictionary.registerOre("dustRefinedLead", RedoxiationGenericItems.RefinedLead);
    	OreDictionary.registerOre("dustRefinedSilver", RedoxiationGenericItems.RefinedSilver);
    	OreDictionary.registerOre("dustRefinedPlatinum", RedoxiationGenericItems.RefinedPlatinum);
    	OreDictionary.registerOre("dustRefinedZinc", RedoxiationGenericItems.RefinedZinc);
    	OreDictionary.registerOre("dustRefinedNickel", RedoxiationGenericItems.RefinedNickel);
    	OreDictionary.registerOre("dustRefinedChromium", RedoxiationGenericItems.RefinedChromium);
    	OreDictionary.registerOre("dustRefinedAlumina", RedoxiationGenericItems.RefinedAlumina);
    	OreDictionary.registerOre("dustRefinedTitanate", RedoxiationGenericItems.RefinedTitanate);
    	OreDictionary.registerOre("dustRefinedTungstate", RedoxiationGenericItems.RefinedTungstate);
    	OreDictionary.registerOre("ingotCopper", RedoxiationGenericItems.CopperIngot);
    	OreDictionary.registerOre("ingotTin", RedoxiationGenericItems.TinIngot);
    	OreDictionary.registerOre("ingotLead", RedoxiationGenericItems.LeadIngot);
    	OreDictionary.registerOre("ingotSilver", RedoxiationGenericItems.SilverIngot);
    	OreDictionary.registerOre("ingotPlatinum", RedoxiationGenericItems.PlatinumIngot);
    	OreDictionary.registerOre("ingotZinc", RedoxiationGenericItems.ZincIngot);
    	OreDictionary.registerOre("ingotNickel", RedoxiationGenericItems.NickelIngot);
    	OreDictionary.registerOre("ingotChromium", RedoxiationGenericItems.ChromiumIngot);
    	OreDictionary.registerOre("ingotAluminumOort", RedoxiationGenericItems.AluminumIngot);
    	OreDictionary.registerOre("ingotTitaniumOort", RedoxiationGenericItems.TitaniumIngot);
    	OreDictionary.registerOre("ingotTungstenOort", RedoxiationGenericItems.TungstenIngot);
    	OreDictionary.registerOre("ingotCobalt", RedoxiationGenericItems.CobaltIngot);
    	OreDictionary.registerOre("ingotSteelOort", RedoxiationGenericItems.SteelIngot);
    	OreDictionary.registerOre("nuggetIron", RedoxiationGenericItems.IronNugget);
    	OreDictionary.registerOre("nuggetCopper", RedoxiationGenericItems.CopperNugget);
    	OreDictionary.registerOre("nuggetTin", RedoxiationGenericItems.TinNugget);
    	OreDictionary.registerOre("nuggetLead", RedoxiationGenericItems.LeadNugget);
    	OreDictionary.registerOre("nuggetSilver", RedoxiationGenericItems.SilverNugget);
    	OreDictionary.registerOre("nuggetPlatinum", RedoxiationGenericItems.PlatinumNugget);
    	OreDictionary.registerOre("nuggetZinc", RedoxiationGenericItems.ZincNugget);
    	OreDictionary.registerOre("nuggetNickel", RedoxiationGenericItems.NickelNugget);
    	OreDictionary.registerOre("nuggetChromium", RedoxiationGenericItems.ChromiumNugget);
    	OreDictionary.registerOre("nuggetAluminum", RedoxiationGenericItems.AluminumNugget);
    	OreDictionary.registerOre("nuggetTitanium", RedoxiationGenericItems.TitaniumNugget);
    	OreDictionary.registerOre("nuggetTungsten", RedoxiationGenericItems.TungstenNugget);
    	OreDictionary.registerOre("nuggetSteel", RedoxiationGenericItems.SteelNugget);
    	OreDictionary.registerOre("lumpSulfur", RedoxiationGenericItems.SulfurChunk);
    	OreDictionary.registerOre("dustSulfurOort", RedoxiationGenericItems.SulfurDust);
    	OreDictionary.registerOre("materialCryolite", RedoxiationGenericItems.ItemCryolite);

	}
	
	@Override
	public String getUnlocalizedName()
	{
		return "item." + Redoxiation.MODID + "_" + itemname;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		return "item." + Redoxiation.MODID + "_" + itemname;
	}
	
	@Override
	public void registerIcons(IIconRegister reg)
	{
		this.itemIcon = reg.registerIcon(Redoxiation.MODID + ":" + itemname);
	}
	
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4)
	{
		if (!(information=="null"))
		{
			list.add(information);
		}
	}
}
