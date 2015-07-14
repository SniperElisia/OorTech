package teamoort.redoxiation.items;

import java.util.List;

import net.minecraft.item.ItemMap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import teamoort.redoxiation.Redoxiation;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import teamoort.redoxiation.blocks.BlockHotAir;
import teamoort.redoxiation.blocks.RedoxiationBlocks;

public class RedoxiationGenericItems extends Item{

	private final String itemname;
	private final String information;
	
	public static Item Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite, CrushedOreIron, CrushedOreGold,  CrushedOreCopper, CrushedOreTin, CrushedOreLead, CrushedOreSilver, CrushedOreNickel, CrushedOrePlatinum, CrushedOreZinc,  CrushedOreChromium, DustIron, DustGold, DustCopper, DustTin, DustLead, DustSilver, DustNickel, DustPlatinum, DustZinc, CobaltDust, DustChromium, Salt, AluminaDust, TitanateDust, TungstateDust, PurifiedIron, PurifiedGold, PurifiedCopper, PurifiedTin, PurifiedLead, PurifiedSilver, PurifiedNickel, PurifiedPlatinum, PurifiedZinc, PurifiedCobalt, PurifiedChromium, PurifiedAlumina, PurifiedTitanate, PurifiedTungstate, RefinedIron, RefinedGold, RefinedCopper, RefinedTin, RefinedLead, RefinedSilver, RefinedNickel, RefinedPlatinum, RefinedZinc, RefinedCobalt, RefinedChromium, RefinedAlumina, RefinedTitanate, RefinedTungstate, IngotCopper, IngotTin, IngotLead, IngotSilver, IngotNickel, IngotPlatinum, IngotZinc, IngotCobalt, IngotChromium, UraniumIngot, PlutoniumIngot, IngotSteel, IngotAluminum, IngotTungsten, IngotTitanium, IronNugget, CopperNugget, TinNugget, LeadNugget, SilverNugget, PlatinumNugget, ZincNugget, NickelNugget, ChromiumNugget, AluminumNugget, TitaniumNugget, TungstenNugget, SteelNugget, SulfurChunk, SulfurDust, ItemCryolite, CrashedNetherrack, CrashedObsidian, ItemHotAirBucket, ItemMoltenPigironBucket, ItemSlagBucket;
	public static boolean Calcite_enable, SaltChunk_enable, RawBauxite_enable, RawRutile_enable, RawScheelite_enable, CrushedOreIron_enable, CrushedOreGold_enable,  CrushedOreCopper_enable, CrushedOreTin_enable, CrushedOreLead_enable, CrushedOreSilver_enable, CrushedOreNickel_enable, CrushedOrePlatinum_enable, CrushedOreZinc_enable,  CrushedOreChromium_enable, DustIron_enable, DustGold_enable, DustCopper_enable, DustTin_enable, DustLead_enable, DustSilver_enable, DustNickel_enable, DustPlatinum_enable, DustZinc_enable, CobaltDust_enable, DustChromium_enable,
	Salt_enable, AluminaDust_enable, TitanateDust_enable, TungstateDust_enable, PurifiedIron_enable, PurifiedGold_enable, PurifiedCopper_enable, PurifiedTin_enable, PurifiedLead_enable, PurifiedSilver_enable, PurifiedNickel_enable, PurifiedPlatinum_enable, PurifiedZinc_enable, PurifiedCobalt_enable, PurifiedChromium_enable, PurifiedAlumina_enable, PurifiedTitanate_enable, PurifiedTungstate_enable, RefinedIron_enable, RefinedGold_enable, RefinedCopper_enable, RefinedTin_enable, RefinedLead_enable, RefinedSilver_enable, RefinedNickel_enable, RefinedPlatinum_enable, RefinedZinc_enable, RefinedCobalt_enable, RefinedChromium_enable, RefinedAlumina_enable, RefinedTitanate_enable, RefinedTungstate_enable, IngotCopper_enable, IngotTin_enable, IngotLead_enable, IngotSilver_enable, IngotNickel_enable, IngotPlatinum_enable, IngotZinc_enable, IngotCobalt_enable, IngotChromium_enable, UraniumIngot_enable, PlutoniumIngot_enable, IngotSteel_enable, IngotAluminum_enable, IngotTungsten_enable, IngotTitanium_enable, IronNugget_enable, CopperNugget_enable, TinNugget_enable, LeadNugget_enable, SilverNugget_enable, PlatinumNugget_enable, ZincNugget_enable, NickelNugget_enable, ChromiumNugget_enable, AluminumNugget_enable, TitaniumNugget_enable, TungstenNugget_enable, SteelNugget_enable, SulfurChunk_enable, SulfurDust_enable, ItemCryolite_enable, CrashedNetherrack_enable, CrashedObsidian_enable, ItemHotAirBucket_enable, ItemMoltenPigironBucket_enable, ItemSlagBucket_enable;
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
		if(CrushedOreIron_enable){
			CrushedOreIron = new RedoxiationGenericItems("CrushedOreIron", "Fe");
			GameRegistry.registerItem(CrushedOreIron, "CrushedOreIron");
			OreDictionary.registerOre("crushedIron", RedoxiationGenericItems.CrushedOreIron);
    	}
		if(CrushedOreGold_enable){
			CrushedOreGold = new RedoxiationGenericItems("CrushedOreGold", "Au");
			GameRegistry.registerItem(CrushedOreGold, "CrushedOreGold");
			OreDictionary.registerOre("crushedGold", RedoxiationGenericItems.CrushedOreGold);
    	}
		if(CrushedOreCopper_enable){
			CrushedOreCopper = new RedoxiationGenericItems("CrushedOreCopper", "Cu");
			GameRegistry.registerItem(CrushedOreCopper, "CrushedOreCopper");
			OreDictionary.registerOre("crushedCopper", RedoxiationGenericItems.CrushedOreCopper);
    	}
		if(CrushedOreTin_enable){
			CrushedOreTin = new RedoxiationGenericItems("CrushedOreTin", "Sn");
			GameRegistry.registerItem(CrushedOreTin, "CrushedOreTin");
			OreDictionary.registerOre("crushedTin", RedoxiationGenericItems.CrushedOreTin);
    	}
		if(CrushedOreLead_enable){
			CrushedOreLead = new RedoxiationGenericItems("CrushedOreLead", "Pb");
			GameRegistry.registerItem(CrushedOreLead, "CrushedOreLead");
			OreDictionary.registerOre("crushedLead", RedoxiationGenericItems.CrushedOreLead);
    	}
		if(CrushedOreSilver_enable){
			CrushedOreSilver = new RedoxiationGenericItems("CrushedOreSilver", "Ag");
			GameRegistry.registerItem(CrushedOreSilver, "CrushedOreSilver");
			OreDictionary.registerOre("crushedSilver", RedoxiationGenericItems.CrushedOreSilver);
		}
		if(CrushedOrePlatinum_enable){
			CrushedOrePlatinum = new RedoxiationGenericItems("CrushedOrePlatinum", "Pt");
			GameRegistry.registerItem(CrushedOrePlatinum, "CrushedOrePlatinum");
			OreDictionary.registerOre("crushedPlatinum", RedoxiationGenericItems.CrushedOrePlatinum);
		}
		if(CrushedOreZinc_enable){
			CrushedOreZinc = new RedoxiationGenericItems("CrushedOreZinc", "Zn");
			GameRegistry.registerItem(CrushedOreZinc, "CrushedOreZinc");
			OreDictionary.registerOre("crushedZinc", RedoxiationGenericItems.CrushedOreZinc);
		}
		if(CrushedOreNickel_enable){
			CrushedOreNickel = new RedoxiationGenericItems("CrushedOreNickel", "Ni");
			GameRegistry.registerItem(CrushedOreNickel, "CrushedOreNickel");
			OreDictionary.registerOre("crushedNickel", RedoxiationGenericItems.CrushedOreNickel);
		}
		if(CrushedOreChromium_enable){
			CrushedOreChromium = new RedoxiationGenericItems("CrushedOreChromium", "Cr");
			GameRegistry.registerItem(CrushedOreChromium, "CrushedOreChromium");
			OreDictionary.registerOre("crushedChromium", RedoxiationGenericItems.CrushedOreChromium);
		}
		if(DustIron_enable){
			DustIron = new RedoxiationGenericItems("DustIron", "Fe");
			GameRegistry.registerItem(DustIron, "DustIron");
			OreDictionary.registerOre("dustIronRedox", RedoxiationGenericItems.DustIron);
		}
		if(DustGold_enable){
			DustGold = new RedoxiationGenericItems("DustGold", "Au");
			GameRegistry.registerItem(DustGold, "DustGold");
			OreDictionary.registerOre("dustGoldRedox", RedoxiationGenericItems.DustGold);
		}
		if(DustCopper_enable){
			DustCopper = new RedoxiationGenericItems("DustCopper", "Cu");
			GameRegistry.registerItem(DustCopper, "DustCopper");
			OreDictionary.registerOre("dustCopperRedox", RedoxiationGenericItems.DustCopper);
		}
		if(DustTin_enable){
			DustTin = new RedoxiationGenericItems("DustTin", "Sn");
			GameRegistry.registerItem(DustTin, "DustTin");
			OreDictionary.registerOre("dustTinRedox", RedoxiationGenericItems.DustTin);
		}
		if(DustLead_enable){
			DustLead = new RedoxiationGenericItems("DustLead", "Pb");
			GameRegistry.registerItem(DustLead, "DustLead");
			OreDictionary.registerOre("dustLeadRedox", RedoxiationGenericItems.DustLead);
		}
		if(DustSilver_enable){
			DustSilver = new RedoxiationGenericItems("DustSilver", "Ag");
			GameRegistry.registerItem(DustSilver, "DustSilver");
			OreDictionary.registerOre("dustSilverRedox", RedoxiationGenericItems.DustSilver);
		}
		if(DustPlatinum_enable){
			DustPlatinum = new RedoxiationGenericItems("DustPlatinum", "Pt");
			GameRegistry.registerItem(DustPlatinum, "DustPlatinum");
			OreDictionary.registerOre("dustPlatinumRedox", RedoxiationGenericItems.DustPlatinum);
		}
    	if(DustZinc_enable){
			DustZinc = new RedoxiationGenericItems("DustZinc", "Zn");
			GameRegistry.registerItem(DustZinc, "DustZinc");
			OreDictionary.registerOre("dustZincRedox", RedoxiationGenericItems.DustZinc);
    	}
    	if(DustNickel_enable){
			DustNickel = new RedoxiationGenericItems("DustNickel", "Ni");
			GameRegistry.registerItem(DustNickel, "DustNickel");
			OreDictionary.registerOre("dustNickelRedox", RedoxiationGenericItems.DustNickel);
    	}
    	if(DustChromium_enable){
			DustChromium = new RedoxiationGenericItems("DustChromium", "Cr");
			GameRegistry.registerItem(DustChromium, "DustChromium");
			OreDictionary.registerOre("dustChromiumRedox", RedoxiationGenericItems.DustChromium);
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
    	if(IngotCopper_enable){
			IngotCopper = new RedoxiationGenericItems("IngotCopper", "Cu");
			GameRegistry.registerItem(IngotCopper, "IngotCopper");
			OreDictionary.registerOre("ingotCopper", RedoxiationGenericItems.IngotCopper);
    	}
    	if(IngotTin_enable){
			IngotTin = new RedoxiationGenericItems("IngotTin", "Sn");
			GameRegistry.registerItem(IngotTin, "IngotTin");
			OreDictionary.registerOre("ingotTin", RedoxiationGenericItems.IngotTin);
    	}
    	if(IngotLead_enable){
			IngotLead = new RedoxiationGenericItems("IngotLead", "Pb");
			GameRegistry.registerItem(IngotLead, "IngotLead");
			OreDictionary.registerOre("ingotLead", RedoxiationGenericItems.IngotLead);
		}
    	if(IngotSilver_enable){
			IngotSilver = new RedoxiationGenericItems("IngotSilver", "Ag");
			GameRegistry.registerItem(IngotSilver, "IngotSilver");
			OreDictionary.registerOre("ingotSilver", RedoxiationGenericItems.IngotSilver);
    	}
    	if(IngotPlatinum_enable){
			IngotPlatinum = new RedoxiationGenericItems("IngotPlatinum", "Pt");	
			GameRegistry.registerItem(IngotPlatinum, "IngotPlatinum");
			OreDictionary.registerOre("ingotPlatinum", RedoxiationGenericItems.IngotPlatinum);
    	}
    	if(IngotZinc_enable){
			IngotZinc = new RedoxiationGenericItems("IngotZinc", "Zn");
			GameRegistry.registerItem(IngotZinc, "IngotZinc");
			OreDictionary.registerOre("ingotZinc", RedoxiationGenericItems.IngotZinc);
    	}
    	if(IngotNickel_enable){
			IngotNickel = new RedoxiationGenericItems("IngotNickel", "Ni");
			GameRegistry.registerItem(IngotNickel, "IngotNickel");
			OreDictionary.registerOre("ingotNickel", RedoxiationGenericItems.IngotNickel);
    	}
    	if(IngotChromium_enable){
			IngotChromium = new RedoxiationGenericItems("IngotChromium", "Cr");
			GameRegistry.registerItem(IngotChromium, "IngotChromium");
			OreDictionary.registerOre("ingotChromium", RedoxiationGenericItems.IngotChromium);
    	}
    	if(IngotAluminum_enable){
			IngotAluminum = new RedoxiationGenericItems("IngotAluminum", "Al2O3");
			GameRegistry.registerItem(IngotAluminum, "IngotAluminum");
			OreDictionary.registerOre("ingotAluminumOort", RedoxiationGenericItems.IngotAluminum);
    	}
    	if(IngotTitanium_enable){
			IngotTitanium = new RedoxiationGenericItems("IngotTitanium", "TiO2");
			GameRegistry.registerItem(IngotTitanium, "IngotTitanium");
			OreDictionary.registerOre("ingotTitaniumOort", RedoxiationGenericItems.IngotTitanium);
    	}
    	if(IngotTungsten_enable){
			IngotTungsten = new RedoxiationGenericItems("IngotTungsten", "WO3");
			GameRegistry.registerItem(IngotTungsten, "IngotTungsten");
			OreDictionary.registerOre("ingotTungstenOort", RedoxiationGenericItems.IngotTungsten);
		}
    	if(IngotCobalt_enable){
			IngotCobalt = new RedoxiationGenericItems("IngotCobalt","Co");
			GameRegistry.registerItem(IngotCobalt, "IngotCobalt");
			OreDictionary.registerOre("ingotCobalt", RedoxiationGenericItems.IngotCobalt);
    	}
    	if(IngotSteel_enable){
			IngotSteel = new RedoxiationGenericItems("IngotSteel");
			GameRegistry.registerItem(IngotSteel, "IngotSteel");
			OreDictionary.registerOre("ingotSteelOort", RedoxiationGenericItems.IngotSteel);
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
        if(ItemHotAirBucket_enable) {
            ItemHotAirBucket = new ItemHotAirBucket(RedoxiationBlocks.HotAirBlock);
            ItemHotAirBucket.setUnlocalizedName("HotAirBucket").setContainerItem(Items.bucket);
            GameRegistry.registerItem(ItemHotAirBucket, "HotAirBucket");
            FluidContainerRegistry.registerFluidContainer(RedoxiationBlocks.HotAir, new ItemStack(ItemHotAirBucket), new ItemStack(Items.bucket));
            BucketHandler.INSTANCE.buckets.put(RedoxiationBlocks.HotAirBlock, ItemHotAirBucket);
            MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
        }
        if(ItemMoltenPigironBucket_enable) {
            ItemMoltenPigironBucket = new ItemMoltenPigironBucket(RedoxiationBlocks.MoltenPigironBlock);
            ItemMoltenPigironBucket.setUnlocalizedName("MoltenPigironBucket").setContainerItem(Items.bucket);
            GameRegistry.registerItem(ItemMoltenPigironBucket, "MoltenPigironBucket");
            FluidContainerRegistry.registerFluidContainer(RedoxiationBlocks.MoltenPigiron, new ItemStack(ItemMoltenPigironBucket), new ItemStack(Items.bucket));
            BucketHandler.INSTANCE.buckets.put(RedoxiationBlocks.MoltenPigironBlock, ItemMoltenPigironBucket);
            MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
        }
        if(ItemSlagBucket_enable) {
            ItemSlagBucket = new ItemSlagBucket(RedoxiationBlocks.SlagBlock);
            ItemSlagBucket.setUnlocalizedName("SlagBucket").setContainerItem(Items.bucket);
            GameRegistry.registerItem(ItemSlagBucket, "SlagBucket");
            FluidContainerRegistry.registerFluidContainer(RedoxiationBlocks.Slag, new ItemStack(ItemSlagBucket), new ItemStack(Items.bucket));
            BucketHandler.INSTANCE.buckets.put(RedoxiationBlocks.SlagBlock, ItemSlagBucket);
            MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
        }
        Redoxiation.logger.info("Item Registry Complete. Starting Tileentity proxy.");
    }
    
	@Override
	public String getUnlocalizedName()
	{
		return "item." + Redoxiation.MODID + "." + itemname;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		return "item." + Redoxiation.MODID + "." + itemname;
	}
	
	@Override
	public void registerIcons(IIconRegister reg)
	{
		this.itemIcon = reg.registerIcon(Redoxiation.MODID + ":" + itemname);
	}
	
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4)
	{
		if (!(information.equals("null")))
		{
			list.add(information);
		}
	}
}
