package com.teamoort.redoxiation.items;


import java.util.List;

import com.teamoort.redoxiation.Redoxiation;

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
	
	public static Item MortarAndPestle, Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite, CrushedIron, CrushedGold,  CrushedCopper, CrushedTin, CrushedLead, CrushedSilver, CrushedNickel, CrushedPlatinum, CrushedZinc,  CrushedChromium, IronDust, GoldDust, CopperDust, TinDust, LeadDust, SilverDust, NickelDust, PlatinumDust, ZincDust, CobaltDust, ChromiumDust, Salt, AluminaDust, TitanateDust, TungstateDust, PurifiedIron, PurifiedGold, PurifiedCopper, PurifiedTin, PurifiedLead, PurifiedSilver, PurifiedNickel, PurifiedPlatinum, PurifiedZinc, PurifiedCobalt, PurifiedChromium, PurifiedAlumina, PurifiedTitanate, PurifiedTungstate, RefinedIron, RefinedGold, RefinedCopper, RefinedTin, RefinedLead, RefinedSilver, RefinedNickel, RefinedPlatinum, RefinedZinc, RefinedCobalt, RefinedChromium, RefinedAlumina, RefinedTitanate, RefinedTungstate, CopperIngot, TinIngot, LeadIngot, SilverIngot, NickelIngot, PlatinumIngot, ZincIngot, CobaltIngot, ChromiumIngot, UraniumIngot, PlutoniumIngot, SteelIngot, AluminumIngot, TungstenIngot, TitaniumIngot, IronNugget, CopperNugget, TinNugget, LeadNugget, SilverNugget, PlatinumNugget, ZincNugget, NickelNugget, ChromiumNugget, AluminumNugget, TitaniumNugget, TungstenNugget, SteelNugget, SulfurChunk, SulfurDust, ItemCryolite, CrashedNetherrack, CrashedObsidian;
	
	public RedoxiationGenericItems(String name, String info)
	{
		
		super();
		setCreativeTab(Redoxiation.tabRedoxiationitems);
		information = info;
		itemname = name;
	}
	
	public static void registerItems()
	{
		MortarAndPestle = new RedoxiationGenericItems("MortarAndPestle", "");
    	Calcite = new RedoxiationGenericItems("Calcite", "CaCO3");
    	SaltChunk = new RedoxiationGenericItems("SaltChunk", "");
    	RawBauxite = new RedoxiationGenericItems("RawBauxite", "");
    	RawRutile = new RedoxiationGenericItems("RawRutile", "");
    	RawScheelite = new RedoxiationGenericItems("RawScheelite", "");
    	CrushedIron = new RedoxiationGenericItems("CrushedIron", "");
    	CrushedGold = new RedoxiationGenericItems("CrushedGold", "");
    	CrushedCopper = new RedoxiationGenericItems("CrushedCopper", "");
    	CrushedTin = new RedoxiationGenericItems("CrushedTin", "");
    	CrushedLead = new RedoxiationGenericItems("CrushedLead", "");
    	CrushedSilver = new RedoxiationGenericItems("CrushedSilver", "");
    	CrushedPlatinum = new RedoxiationGenericItems("CrushedPlatinum", "");
    	CrushedZinc = new RedoxiationGenericItems("CrushedZinc", "");
    	CrushedNickel = new RedoxiationGenericItems("CrushedNickel", "");
    	CrushedChromium = new RedoxiationGenericItems("CrushedChromium", "");
    	IronDust = new RedoxiationGenericItems("IronDust", "");
    	GoldDust = new RedoxiationGenericItems("GoldDust", "");
    	CopperDust = new RedoxiationGenericItems("CopperDust", "");
    	TinDust = new RedoxiationGenericItems("TinDust", "");
    	LeadDust = new RedoxiationGenericItems("LeadDust", "");
    	SilverDust = new RedoxiationGenericItems("SilverDust", "");
    	PlatinumDust = new RedoxiationGenericItems("PlatinumDust", "");
    	ZincDust = new RedoxiationGenericItems("ZincDust", "");
    	NickelDust = new RedoxiationGenericItems("NickelDust", "");
    	ChromiumDust = new RedoxiationGenericItems("ChromiumDust", "");
    	Salt = new RedoxiationGenericItems("Salt", "");
    	AluminaDust = new RedoxiationGenericItems("AluminaDust", "");
    	TitanateDust = new RedoxiationGenericItems("TitanateDust", "");
    	TungstateDust = new RedoxiationGenericItems("TungstateDust", "");
    	PurifiedIron = new RedoxiationGenericItems("PurifiedIron", "");
    	PurifiedGold = new RedoxiationGenericItems("PurifiedGold", "");
    	PurifiedCopper = new RedoxiationGenericItems("PurifiedCopper", "");
    	PurifiedTin = new RedoxiationGenericItems("PurifiedTin", "");
    	PurifiedLead = new RedoxiationGenericItems("PurifiedLead", "");
    	PurifiedSilver = new RedoxiationGenericItems("PurifiedSilver", "");
    	PurifiedPlatinum = new RedoxiationGenericItems("PurifiedPlatinum", "");
    	PurifiedZinc = new RedoxiationGenericItems("PurifiedZinc", "");
    	PurifiedNickel = new RedoxiationGenericItems("PurifiedNickel", "");
    	PurifiedChromium = new RedoxiationGenericItems("PurifiedChromium", "");
    	PurifiedAlumina = new RedoxiationGenericItems("PurifiedAlumina", "");
    	PurifiedTitanate = new RedoxiationGenericItems("PurifiedTitanate", "");
    	PurifiedTungstate = new RedoxiationGenericItems("PurifiedTungstate", "");
    	RefinedIron = new RedoxiationGenericItems("RefinedIron", "");
    	RefinedGold = new RedoxiationGenericItems("RefinedGold", "");
    	RefinedCopper = new RedoxiationGenericItems("RefinedCopper", "");
    	RefinedTin = new RedoxiationGenericItems("RefinedTin", "");
    	RefinedLead = new RedoxiationGenericItems("RefinedLead", "");
    	RefinedSilver = new RedoxiationGenericItems("RefinedSilver", "");
    	RefinedPlatinum = new RedoxiationGenericItems("RefinedPlatinum", "");
    	RefinedZinc = new RedoxiationGenericItems("RefinedZinc", "");
    	RefinedNickel = new RedoxiationGenericItems("RefinedNickel", "");
    	RefinedChromium = new RedoxiationGenericItems("RefinedChromium", "");
    	RefinedAlumina = new RedoxiationGenericItems("RefinedAlumina", "");
    	RefinedTitanate = new RedoxiationGenericItems("RefinedTitanate", "");
    	RefinedTungstate = new RedoxiationGenericItems("RefinedTungstate", "");
    	CopperIngot = new RedoxiationGenericItems("CopperIngot", "");
    	TinIngot = new RedoxiationGenericItems("TinIngot", "");
    	LeadIngot = new RedoxiationGenericItems("LeadIngot", "");
    	SilverIngot = new RedoxiationGenericItems("SilverIngot", "");
    	PlatinumIngot = new RedoxiationGenericItems("PlatinumIngot", "");
    	ZincIngot = new RedoxiationGenericItems("ZincIngot", "");
    	NickelIngot = new RedoxiationGenericItems("NickelIngot", "");
    	ChromiumIngot = new RedoxiationGenericItems("ChromiumIngot", "");
    	AluminumIngot = new RedoxiationGenericItems("AluminumIngot", "");
    	TitaniumIngot = new RedoxiationGenericItems("TitaniumIngot", "");
    	TungstenIngot = new RedoxiationGenericItems("TungstenIngot", "");
    	SteelIngot = new RedoxiationGenericItems("SteelIngot", "");
    	IronNugget = new RedoxiationGenericItems("IronNugget", "");
    	CopperNugget = new RedoxiationGenericItems("CopperNugget", "");
    	TinNugget = new RedoxiationGenericItems("TinNugget", "");
    	LeadNugget = new RedoxiationGenericItems("LeadNugget", "");
    	SilverNugget = new RedoxiationGenericItems("SilverNugget", "");
    	PlatinumNugget = new RedoxiationGenericItems("PlatinumNugget", "");
    	ZincNugget = new RedoxiationGenericItems("ZincNugget", "");
    	NickelNugget = new RedoxiationGenericItems("NickelNugget", "");
    	ChromiumNugget = new RedoxiationGenericItems("ChromiumNugget", "");
    	AluminumNugget = new RedoxiationGenericItems("AluminumNugget", "");
    	TitaniumNugget = new RedoxiationGenericItems("TitaniumNugget", "");
    	TungstenNugget = new RedoxiationGenericItems("TungstenNugget", "");
    	SteelNugget = new RedoxiationGenericItems("SteelNugget", "");
    	SulfurChunk = new RedoxiationGenericItems("SulfurChunk", "");
    	SulfurDust = new RedoxiationGenericItems("SulfurDust", "");
    	ItemCryolite = new RedoxiationGenericItems("ItemCryolite", "");
    	CrashedNetherrack = new RedoxiationGenericItems("CrashedNetherrack", "");
    	CrashedObsidian = new RedoxiationGenericItems("CrashedObsidian", "");
    	
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
    	
    	OreDictionary.registerOre("materialMortarAndPestle", RedoxiationGenericItems.MortarAndPestle);
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
    	OreDictionary.registerOre("dustIronOort", RedoxiationGenericItems.IronDust);
    	OreDictionary.registerOre("dustGoldOort", RedoxiationGenericItems.GoldDust);
    	OreDictionary.registerOre("dustCopperOort", RedoxiationGenericItems.CopperDust);
    	OreDictionary.registerOre("dustTinOort", RedoxiationGenericItems.TinDust);
    	OreDictionary.registerOre("dustLeadOort", RedoxiationGenericItems.LeadDust);
    	OreDictionary.registerOre("dustSilverOort", RedoxiationGenericItems.SilverDust);
    	OreDictionary.registerOre("dustPlatinumOort", RedoxiationGenericItems.PlatinumDust);
    	OreDictionary.registerOre("dustZincOort", RedoxiationGenericItems.ZincDust);
    	OreDictionary.registerOre("dustNickelOort", RedoxiationGenericItems.NickelDust);
    	OreDictionary.registerOre("dustChromiumOort", RedoxiationGenericItems.ChromiumDust);
    	OreDictionary.registerOre("dustSalt", RedoxiationGenericItems.Salt);
    	OreDictionary.registerOre("dustAluminumOort", RedoxiationGenericItems.AluminaDust);
    	OreDictionary.registerOre("dustTitaniumOort", RedoxiationGenericItems.TitanateDust);
    	OreDictionary.registerOre("dustTungstenOort", RedoxiationGenericItems.TungstateDust);
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
		list.add(information);
	}
}
