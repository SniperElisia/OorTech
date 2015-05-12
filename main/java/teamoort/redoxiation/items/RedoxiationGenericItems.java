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
		if(Calcite_enable){
			Calcite = new RedoxiationGenericItems("Calcite", "CaCO3");
			GameRegistry.registerItem(Calcite, "Calcite");
			OreDictionary.registerOre("materialCalcite", RedoxiationGenericItems.Calcite);
    	}
		if(SaltChunk_enable){
			SaltChunk = new RedoxiationGenericItems("SaltChunk", "NaCl");
			GameRegistry.registerItem(SaltChunk, "SaltChunk");
			OreDictionary.registerOre("lumpSalt", RedoxiationGenericItems.SaltChunk);
		}
		if(RawBauxite_enable){
			RawBauxite = new RedoxiationGenericItems("RawBauxite", "Al(OH)3");
			GameRegistry.registerItem(RawBauxite, "RawBauxite");
			OreDictionary.registerOre("lumpBauxite", RedoxiationGenericItems.RawBauxite);
		}
		if(RawRutile_enable){
			RawRutile = new RedoxiationGenericItems("RawRutile", "Ti");
			GameRegistry.registerItem(RawRutile, "RawRutile");
			OreDictionary.registerOre("lumpRutile", RedoxiationGenericItems.RawRutile);
		}
		if(RawScheelite_enable){
			RawScheelite = new RedoxiationGenericItems("RawScheelite", "CaWO4");
			GameRegistry.registerItem(RawScheelite, "RawScheelite");
			OreDictionary.registerOre("lumpScheelite", RedoxiationGenericItems.RawScheelite);
		}
		if(CrushedIron_enable){
			CrushedIron = new RedoxiationGenericItems("CrushedIron", "Fe");
			GameRegistry.registerItem(CrushedIron, "CrushedIron");
			OreDictionary.registerOre("crushedIron", RedoxiationGenericItems.CrushedIron);
    	}
		if(CrushedGold_enable){
			CrushedGold = new RedoxiationGenericItems("CrushedGold", "Au");
			GameRegistry.registerItem(CrushedGold, "CrushedGold");
			OreDictionary.registerOre("crushedGold", RedoxiationGenericItems.CrushedGold);
    	}
		if(CrushedCopper_enable){
			CrushedCopper = new RedoxiationGenericItems("CrushedCopper", "Cu");
			GameRegistry.registerItem(CrushedCopper, "CrushedCopper");
			OreDictionary.registerOre("crushedCopper", RedoxiationGenericItems.CrushedCopper);
    	}
		if(CrushedTin_enable){
			CrushedTin = new RedoxiationGenericItems("CrushedTin", "Sn");
			GameRegistry.registerItem(CrushedTin, "CrushedTin");
			OreDictionary.registerOre("crushedTin", RedoxiationGenericItems.CrushedTin);
    	}
		if(CrushedLead_enable){
			CrushedLead = new RedoxiationGenericItems("CrushedLead", "Pb");
			GameRegistry.registerItem(CrushedLead, "CrushedLead");
			OreDictionary.registerOre("crushedLead", RedoxiationGenericItems.CrushedLead);
    	}
		if(CrushedSilver_enable){
			CrushedSilver = new RedoxiationGenericItems("CrushedSilver", "Ag");
			GameRegistry.registerItem(CrushedSilver, "CrushedSilver");
			OreDictionary.registerOre("crushedSilver", RedoxiationGenericItems.CrushedSilver);
		}
		if(CrushedPlatinum_enable){
			CrushedPlatinum = new RedoxiationGenericItems("CrushedPlatinum", "Pt");
			GameRegistry.registerItem(CrushedPlatinum, "CrushedPlatinum");
			OreDictionary.registerOre("crushedPlatinum", RedoxiationGenericItems.CrushedPlatinum);
		}
		if(CrushedZinc_enable){
			CrushedZinc = new RedoxiationGenericItems("CrushedZinc", "Zn");
			GameRegistry.registerItem(CrushedZinc, "CrushedZinc");
			OreDictionary.registerOre("crushedZinc", RedoxiationGenericItems.CrushedZinc);
		}
		if(CrushedNickel_enable){
			CrushedNickel = new RedoxiationGenericItems("CrushedNickel", "Ni");
			GameRegistry.registerItem(CrushedNickel, "CrushedNickel");
			OreDictionary.registerOre("crushedNickel", RedoxiationGenericItems.CrushedNickel);
		}
		if(CrushedChromium_enable){
			CrushedChromium = new RedoxiationGenericItems("CrushedChromium", "Cr");
			GameRegistry.registerItem(CrushedChromium, "CrushedChromium");
			OreDictionary.registerOre("crushedChromium", RedoxiationGenericItems.CrushedChromium);
		}
		if(IronDust_enable){
			IronDust = new RedoxiationGenericItems("IronDust", "Fe");
			GameRegistry.registerItem(IronDust, "IronDust");
			OreDictionary.registerOre("dustIronRedox", RedoxiationGenericItems.IronDust);
		}
		if(GoldDust_enable){
			GoldDust = new RedoxiationGenericItems("GoldDust", "Au");
			GameRegistry.registerItem(GoldDust, "GoldDust");
			OreDictionary.registerOre("dustGoldRedox", RedoxiationGenericItems.GoldDust);
		}
		if(CopperDust_enable){
			CopperDust = new RedoxiationGenericItems("CopperDust", "Cu");
			GameRegistry.registerItem(CopperDust, "CopperDust");
			OreDictionary.registerOre("dustCopperRedox", RedoxiationGenericItems.CopperDust);
		}
		if(TinDust_enable){
			TinDust = new RedoxiationGenericItems("TinDust", "Sn");
			GameRegistry.registerItem(TinDust, "TinDust");
			OreDictionary.registerOre("dustTinRedox", RedoxiationGenericItems.TinDust);
		}
		if(LeadDust_enable){
			LeadDust = new RedoxiationGenericItems("LeadDust", "Pb");
			GameRegistry.registerItem(LeadDust, "LeadDust");
			OreDictionary.registerOre("dustLeadRedox", RedoxiationGenericItems.LeadDust);
		}
		if(SilverDust_enable){
			SilverDust = new RedoxiationGenericItems("SilverDust", "Ag");
			GameRegistry.registerItem(SilverDust, "SilverDust");
			OreDictionary.registerOre("dustSilverRedox", RedoxiationGenericItems.SilverDust);
		}
		if(PlatinumDust_enable){
			PlatinumDust = new RedoxiationGenericItems("PlatinumDust", "Pt");
			GameRegistry.registerItem(PlatinumDust, "PlatinumDust");
			OreDictionary.registerOre("dustPlatinumRedox", RedoxiationGenericItems.PlatinumDust);
		}
    	if(ZincDust_enable){
			ZincDust = new RedoxiationGenericItems("ZincDust", "Zn");
			GameRegistry.registerItem(ZincDust, "ZincDust");
			OreDictionary.registerOre("dustZincRedox", RedoxiationGenericItems.ZincDust);
    	}
    	if(NickelDust_enable){
			NickelDust = new RedoxiationGenericItems("NickelDust", "Ni");
			GameRegistry.registerItem(NickelDust, "NickelDust");
			OreDictionary.registerOre("dustNickelRedox", RedoxiationGenericItems.NickelDust);
    	}
    	if(ChromiumDust_enable){
			ChromiumDust = new RedoxiationGenericItems("ChromiumDust", "Cr");
			GameRegistry.registerItem(ChromiumDust, "ChromiumDust");
			OreDictionary.registerOre("dustChromiumRedox", RedoxiationGenericItems.ChromiumDust);
    	}
    	if(Salt_enable){
			Salt = new RedoxiationGenericItems("Salt", "NaCl");
			GameRegistry.registerItem(Salt, "Salt");
			OreDictionary.registerOre("dustSaltRedox", RedoxiationGenericItems.Salt);
    	}
    	if(AluminaDust_enable){
			AluminaDust = new RedoxiationGenericItems("AluminaDust", "Al2O3");
			GameRegistry.registerItem(AluminaDust, "AluminaDust");
			OreDictionary.registerOre("dustAluminumRedox", RedoxiationGenericItems.AluminaDust);
    	}
    	if(TitanateDust_enable){
			TitanateDust = new RedoxiationGenericItems("TitanateDust", "TiO2");
			GameRegistry.registerItem(TitanateDust, "TitanateDust");
			OreDictionary.registerOre("dustTitaniumRedox", RedoxiationGenericItems.TitanateDust);
    	}
    	if(TungstateDust_enable){
			TungstateDust = new RedoxiationGenericItems("TungstateDust", "WO3");
			GameRegistry.registerItem(TungstateDust, "TungstateDust");
			OreDictionary.registerOre("dustTungstenRedox", RedoxiationGenericItems.TungstateDust);
    	}
    	if(PurifiedIron_enable){
			PurifiedIron = new RedoxiationGenericItems("PurifiedIron", "Fe");
			GameRegistry.registerItem(PurifiedIron, "PurifiedIron");
			OreDictionary.registerOre("dustPurifiedIron", RedoxiationGenericItems.PurifiedIron);
    	}
    	if(PurifiedGold_enable){
			PurifiedGold = new RedoxiationGenericItems("PurifiedGold", "Au");
			GameRegistry.registerItem(PurifiedGold, "PurifiedGold");
			OreDictionary.registerOre("dustPurifiedGold", RedoxiationGenericItems.PurifiedGold);
    	}
    	if(PurifiedCopper_enable){
			PurifiedCopper = new RedoxiationGenericItems("PurifiedCopper", "Cu");
			GameRegistry.registerItem(PurifiedCopper, "PurifiedCopper");
			OreDictionary.registerOre("dustPurifiedCopper", RedoxiationGenericItems.PurifiedCopper);
    	}
    	if(PurifiedTin_enable){
			PurifiedTin = new RedoxiationGenericItems("PurifiedTin", "Sn");
			GameRegistry.registerItem(PurifiedTin, "PurifiedTin");
			OreDictionary.registerOre("dustPurifiedTin", RedoxiationGenericItems.PurifiedTin);
    	}
    	if(PurifiedLead_enable){
			PurifiedLead = new RedoxiationGenericItems("PurifiedLead", "Pb");
			GameRegistry.registerItem(PurifiedLead, "PurifiedLead");
			OreDictionary.registerOre("dustPurifiedLead", RedoxiationGenericItems.PurifiedLead);
    	}
    	if(PurifiedSilver_enable){
			PurifiedSilver = new RedoxiationGenericItems("PurifiedSilver", "Ag");
			GameRegistry.registerItem(PurifiedSilver, "PurifiedSilver");
			OreDictionary.registerOre("dustPurifiedSilver", RedoxiationGenericItems.PurifiedSilver);
    	}
    	if(PurifiedPlatinum_enable){
			PurifiedPlatinum = new RedoxiationGenericItems("PurifiedPlatinum", "Pt");
			GameRegistry.registerItem(PurifiedPlatinum, "PurifiedPlatinum"); 
			OreDictionary.registerOre("dustPurifiedPlatinum", RedoxiationGenericItems.PurifiedPlatinum);
    	}
    	if(PurifiedZinc_enable){
			PurifiedZinc = new RedoxiationGenericItems("PurifiedZinc", "Zn");
			GameRegistry.registerItem(PurifiedZinc, "PurifiedZinc");
			OreDictionary.registerOre("dustPurifiedZinc", RedoxiationGenericItems.PurifiedZinc);
    	}
    	if(PurifiedNickel_enable){
			PurifiedNickel = new RedoxiationGenericItems("PurifiedNickel", "Ni");
			GameRegistry.registerItem(PurifiedNickel, "PurifiedNickel");
			OreDictionary.registerOre("dustPurifiedNickel", RedoxiationGenericItems.PurifiedNickel);
    	}
    	if(PurifiedChromium_enable){
			PurifiedChromium = new RedoxiationGenericItems("PurifiedChromium", "Cr");
			GameRegistry.registerItem(PurifiedChromium, "PurifiedChromium");
			OreDictionary.registerOre("dustPurifiedChromium", RedoxiationGenericItems.PurifiedChromium);
    	}
    	if(PurifiedAlumina_enable){
			PurifiedAlumina = new RedoxiationGenericItems("PurifiedAlumina", "Al2O3");
			GameRegistry.registerItem(PurifiedAlumina, "PurifiedAlumina");
			OreDictionary.registerOre("dustPurifiedAlumina", RedoxiationGenericItems.PurifiedAlumina);
    	}
    	if(PurifiedTitanate_enable){
			PurifiedTitanate = new RedoxiationGenericItems("PurifiedTitanate", "TiO2");
			GameRegistry.registerItem(PurifiedTitanate, "PurifiedTitanate");
			OreDictionary.registerOre("dustPurifiedTitanate", RedoxiationGenericItems.PurifiedTitanate);
		}
    	if(PurifiedTungstate_enable){
			PurifiedTungstate = new RedoxiationGenericItems("PurifiedTungstate", "WO3");
			GameRegistry.registerItem(PurifiedTungstate, "PurifiedTungstate");
			OreDictionary.registerOre("dustPurifiedTungstate", RedoxiationGenericItems.PurifiedTungstate);
    	}
    	if(RefinedIron_enable){
			RefinedIron = new RedoxiationGenericItems("RefinedIron", "Fe");
			GameRegistry.registerItem(RefinedIron, "RefinedIron");
			OreDictionary.registerOre("dustRefinedIron", RedoxiationGenericItems.RefinedIron);
    	}
    	if(RefinedGold_enable){
			RefinedGold = new RedoxiationGenericItems("RefinedGold", "Au");
			GameRegistry.registerItem(RefinedGold, "RefinedGold");
			OreDictionary.registerOre("dustRefinedGold", RedoxiationGenericItems.RefinedGold);
    	}
    	if(RefinedCopper_enable){
			RefinedCopper = new RedoxiationGenericItems("RefinedCopper", "Cu");
			GameRegistry.registerItem(RefinedCopper, "RefinedCopper");
			OreDictionary.registerOre("dustRefinedCopper", RedoxiationGenericItems.RefinedCopper);
    	}
    	if(RefinedTin_enable){
			RefinedTin = new RedoxiationGenericItems("RefinedTin", "Sn");
			GameRegistry.registerItem(RefinedTin, "RefinedTin");
			OreDictionary.registerOre("dustRefinedTin", RedoxiationGenericItems.RefinedTin);
    	}
    	if(RefinedLead_enable){
			RefinedLead = new RedoxiationGenericItems("RefinedLead", "Fb");
			GameRegistry.registerItem(RefinedLead, "RefinedLead");
			OreDictionary.registerOre("dustRefinedLead", RedoxiationGenericItems.RefinedLead);
    	}
    	if(RefinedSilver_enable){
			RefinedSilver = new RedoxiationGenericItems("RefinedSilver", "Ag");
			GameRegistry.registerItem(RefinedSilver, "RefinedSilver");
			OreDictionary.registerOre("dustRefinedSilver", RedoxiationGenericItems.RefinedSilver);
    	}
    	if(RefinedPlatinum_enable){
			RefinedPlatinum = new RedoxiationGenericItems("RefinedPlatinum", "Pt");
			GameRegistry.registerItem(RefinedPlatinum, "RefinedPlatinum");
			OreDictionary.registerOre("dustRefinedPlatinum", RedoxiationGenericItems.RefinedPlatinum);
    	}
    	if(RefinedZinc_enable){
			RefinedZinc = new RedoxiationGenericItems("RefinedZinc", "Zn");
			GameRegistry.registerItem(RefinedZinc, "RefinedZinc");
			OreDictionary.registerOre("dustRefinedZinc", RedoxiationGenericItems.RefinedZinc);
    	}
    	if(RefinedNickel_enable){
			RefinedNickel = new RedoxiationGenericItems("RefinedNickel", "Ni");
			GameRegistry.registerItem(RefinedNickel, "RefinedNickel");
			OreDictionary.registerOre("dustRefinedNickel", RedoxiationGenericItems.RefinedNickel);
    	}
    	if(RefinedChromium_enable){
			RefinedChromium = new RedoxiationGenericItems("RefinedChromium", "Cr");
			GameRegistry.registerItem(RefinedChromium, "RefinedChromium");
			OreDictionary.registerOre("dustRefinedChromium", RedoxiationGenericItems.RefinedChromium);
    	}
    	if(RefinedAlumina_enable){
			RefinedAlumina = new RedoxiationGenericItems("RefinedAlumina", "Al2O3");
			GameRegistry.registerItem(RefinedAlumina, "RefinedAlumina");
			OreDictionary.registerOre("dustRefinedAlumina", RedoxiationGenericItems.RefinedAlumina);
    	}
    	if(RefinedTitanate_enable){
			RefinedTitanate = new RedoxiationGenericItems("RefinedTitanate", "TiO2");
			GameRegistry.registerItem(RefinedTitanate, "RefinedTitanate");
			OreDictionary.registerOre("dustRefinedTitanate", RedoxiationGenericItems.RefinedTitanate);
    	}
    	if(RefinedTungstate_enable){
			RefinedTungstate = new RedoxiationGenericItems("RefinedTungstate", "WO3");
			GameRegistry.registerItem(RefinedTungstate, "RefinedTungstate");
			OreDictionary.registerOre("dustRefinedTungstate", RedoxiationGenericItems.RefinedTungstate);
    	}
    	if(CopperIngot_enable){
			CopperIngot = new RedoxiationGenericItems("CopperIngot", "Cu");
			GameRegistry.registerItem(CopperIngot, "CopperIngot");
			OreDictionary.registerOre("ingotCopper", RedoxiationGenericItems.CopperIngot);
    	}
    	if(TinIngot_enable){
			TinIngot = new RedoxiationGenericItems("TinIngot", "Sn");
			GameRegistry.registerItem(TinIngot, "TinIngot");
			OreDictionary.registerOre("ingotTin", RedoxiationGenericItems.TinIngot);
    	}
    	if(LeadIngot_enable){
			LeadIngot = new RedoxiationGenericItems("LeadIngot", "Pb");
			GameRegistry.registerItem(LeadIngot, "LeadIngot");
			OreDictionary.registerOre("ingotLead", RedoxiationGenericItems.LeadIngot);
		}
    	if(SilverIngot_enable){
			SilverIngot = new RedoxiationGenericItems("SilverIngot", "Ag");
			GameRegistry.registerItem(SilverIngot, "SilverIngot");
			OreDictionary.registerOre("ingotSilver", RedoxiationGenericItems.SilverIngot);
    	}
    	if(PlatinumIngot_enable){
			PlatinumIngot = new RedoxiationGenericItems("PlatinumIngot", "Pt");	
			GameRegistry.registerItem(PlatinumIngot, "PlatinumIngot");
			OreDictionary.registerOre("ingotPlatinum", RedoxiationGenericItems.PlatinumIngot);
    	}
    	if(ZincIngot_enable){
			ZincIngot = new RedoxiationGenericItems("ZincIngot", "Zn");
			GameRegistry.registerItem(ZincIngot, "ZincIngot");
			OreDictionary.registerOre("ingotZinc", RedoxiationGenericItems.ZincIngot);
    	}
    	if(NickelIngot_enable){
			NickelIngot = new RedoxiationGenericItems("NickelIngot", "Ni");
			GameRegistry.registerItem(NickelIngot, "NickelIngot");
			OreDictionary.registerOre("ingotNickel", RedoxiationGenericItems.NickelIngot);
    	}
    	if(ChromiumIngot_enable){
			ChromiumIngot = new RedoxiationGenericItems("ChromiumIngot", "Cr");
			GameRegistry.registerItem(ChromiumIngot, "ChromiumIngot");
			OreDictionary.registerOre("ingotChromium", RedoxiationGenericItems.ChromiumIngot);
    	}
    	if(AluminumIngot_enable){
			AluminumIngot = new RedoxiationGenericItems("AluminumIngot", "Al2O3");
			GameRegistry.registerItem(AluminumIngot, "AluminumIngot");
			OreDictionary.registerOre("ingotAluminumOort", RedoxiationGenericItems.AluminumIngot);
    	}
    	if(TitaniumIngot_enable){
			TitaniumIngot = new RedoxiationGenericItems("TitaniumIngot", "TiO2");
			GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
			OreDictionary.registerOre("ingotTitaniumOort", RedoxiationGenericItems.TitaniumIngot);
    	}
    	if(TungstenIngot_enable){
			TungstenIngot = new RedoxiationGenericItems("TungstenIngot", "WO3");
			GameRegistry.registerItem(TungstenIngot, "TungstenIngot");
			OreDictionary.registerOre("ingotTungstenOort", RedoxiationGenericItems.TungstenIngot);
		}
    	if(CobaltIngot_enable){
			CobaltIngot = new RedoxiationGenericItems("CobaltIngot","Co");
			GameRegistry.registerItem(CobaltIngot, "CobaltIngot");
			OreDictionary.registerOre("ingotCobalt", RedoxiationGenericItems.CobaltIngot);
    	}
    	if(SteelIngot_enable){
			SteelIngot = new RedoxiationGenericItems("SteelIngot");
			GameRegistry.registerItem(SteelIngot, "SteelIngot");
			OreDictionary.registerOre("ingotSteelOort", RedoxiationGenericItems.SteelIngot);
    	}
    	if(IronNugget_enable){
			IronNugget = new RedoxiationGenericItems("IronNugget", "Fe");
			GameRegistry.registerItem(IronNugget, "IronNugget");
			OreDictionary.registerOre("nuggetIron", RedoxiationGenericItems.IronNugget);
    	}
    	if(CopperNugget_enable){
			CopperNugget = new RedoxiationGenericItems("CopperNugget", "Cu");
			GameRegistry.registerItem(CopperNugget, "CopperNugget");
			OreDictionary.registerOre("nuggetCopper", RedoxiationGenericItems.CopperNugget);
    	}
    	if(TinNugget_enable){
			TinNugget = new RedoxiationGenericItems("TinNugget", "Sn");
			GameRegistry.registerItem(TinNugget, "TinNugget");
			OreDictionary.registerOre("nuggetTin", RedoxiationGenericItems.TinNugget);
    	}
    	if(LeadNugget_enable){
			LeadNugget = new RedoxiationGenericItems("LeadNugget", "Pb");
			GameRegistry.registerItem(LeadNugget, "LeadNugget");
			OreDictionary.registerOre("nuggetLead", RedoxiationGenericItems.LeadNugget);
    	}
    	if(SilverNugget_enable){
			SilverNugget = new RedoxiationGenericItems("SilverNugget", "Ag");
			GameRegistry.registerItem(SilverNugget, "SilverNugget");
			OreDictionary.registerOre("nuggetSilver", RedoxiationGenericItems.SilverNugget);
    	}
    	if(PlatinumNugget_enable){
			PlatinumNugget = new RedoxiationGenericItems("PlatinumNugget", "Pt");
			GameRegistry.registerItem(PlatinumNugget, "PlatinumNugget");
			OreDictionary.registerOre("nuggetPlatinum", RedoxiationGenericItems.PlatinumNugget);
    	}
    	if(ZincNugget_enable){
			ZincNugget = new RedoxiationGenericItems("ZincNugget", "Zn");
			GameRegistry.registerItem(ZincNugget, "ZincNugget");
			OreDictionary.registerOre("nuggetZinc", RedoxiationGenericItems.ZincNugget);
    	}
    	if(NickelNugget_enable){
			NickelNugget = new RedoxiationGenericItems("NickelNugget", "Ni");
			GameRegistry.registerItem(NickelNugget, "NickelNugget");
			OreDictionary.registerOre("nuggetNickel", RedoxiationGenericItems.NickelNugget);
    	}
    	if(ChromiumNugget_enable){
			ChromiumNugget = new RedoxiationGenericItems("ChromiumNugget", "Cr");
			GameRegistry.registerItem(ChromiumNugget, "ChromiumNugget");
			OreDictionary.registerOre("nuggetChromium", RedoxiationGenericItems.ChromiumNugget);
    	}
    	if(AluminumNugget_enable){
			AluminumNugget = new RedoxiationGenericItems("AluminumNugget", "Al2O3");
			GameRegistry.registerItem(AluminumNugget, "AluminumNugget");
			OreDictionary.registerOre("nuggetAluminum", RedoxiationGenericItems.AluminumNugget);
    	}
    	if(TitaniumNugget_enable){
			TitaniumNugget = new RedoxiationGenericItems("TitaniumNugget", "TiO2");
			GameRegistry.registerItem(TitaniumNugget, "TitaniumNugget");
			OreDictionary.registerOre("nuggetTitanium", RedoxiationGenericItems.TitaniumNugget);
		}
    	if(TungstenNugget_enable){
			TungstenNugget = new RedoxiationGenericItems("TungstenNugget", "WO3");
			GameRegistry.registerItem(TungstenNugget, "TungstenNugget");
			OreDictionary.registerOre("nuggetTungsten", RedoxiationGenericItems.TungstenNugget);
    	}
    	if(SteelNugget_enable){
			SteelNugget = new RedoxiationGenericItems("SteelNugget");
			GameRegistry.registerItem(SteelNugget, "SteelNugget");
			OreDictionary.registerOre("nuggetSteel", RedoxiationGenericItems.SteelNugget);
    	}
    	if(SulfurChunk_enable){
			SulfurChunk = new RedoxiationGenericItems("SulfurChunk");
			GameRegistry.registerItem(SulfurChunk, "SulfurChunk");
			OreDictionary.registerOre("lumpSulfur", RedoxiationGenericItems.SulfurChunk);
    	}
    	if(SulfurDust_enable){
			SulfurDust = new RedoxiationGenericItems("SulfurDust");
			GameRegistry.registerItem(SulfurDust, "SulfurDust");
			OreDictionary.registerOre("dustSulfurOort", RedoxiationGenericItems.SulfurDust);
		}
    	if(ItemCryolite_enable){
			ItemCryolite = new RedoxiationGenericItems("ItemCryolite");
			GameRegistry.registerItem(ItemCryolite, "ItemCryolite");
			OreDictionary.registerOre("materialCryolite", RedoxiationGenericItems.ItemCryolite);
    	}
    	if(CrashedNetherrack_enable){
			CrashedNetherrack = new RedoxiationGenericItems("CrashedNetherrack");
    	}
    	if(CrashedObsidian_enable){
			CrashedObsidian = new RedoxiationGenericItems("CrashedObsidian");
    	}
    	Redoxiation.logger.info("Item Registry Complete. Starting block Registry.");
    }
    
	@Override
	public String getUnlocalizedName()
	{
		return Redoxiation.MODID + "." + itemname;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		return "item.Redoxiation." + itemname;
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
