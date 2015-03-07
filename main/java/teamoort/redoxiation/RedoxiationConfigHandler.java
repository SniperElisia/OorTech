package teamoort.redoxiation;

import teamoort.redoxiation.items.RedoxiationGenericItems;
import net.minecraftforge.common.config.Configuration;

public class RedoxiationConfigHandler {
	private static Configuration config = Redoxiation.config;
	public static final String CATEGORY_OREGEN = "oregen";
	public static final String CATEGORY_ITEMS = "items";
	public static void InitConfig(){
		RedoxiationEventHandler oregen = new RedoxiationEventHandler();
		RedoxiationGenericItems items = null;
		config.load();
    	Redoxiation.dummybool = config.getBoolean("Dummy", config.CATEGORY_GENERAL, true, "Dummy");
    	Redoxiation.oredif = config.getInt("OreDifficulty", config.CATEGORY_GENERAL, 1, 0, 2, "1 to 2");
    	// Enable / Disable
    	// Blocks Start
    	// Ores Start
    	// Ores End
    	// Blocks End
    	// Items Start
    	items.AluminaDust_enable = config.getBoolean("AluminaDust", CATEGORY_ITEMS, true, "AluminaDust Configuration");
    	items.AluminumIngot_enable = config.getBoolean("AluminumIngot", CATEGORY_ITEMS, true, "AluminumIngot Configuration");
    	items.AluminumNugget_enable = config.getBoolean("AluminumNugget", CATEGORY_ITEMS, true, "AluminumNugget Configuration");
    	items.Calcite_enable = config.getBoolean("Calcite", CATEGORY_ITEMS, true, "Calcite Configuration");
    	items.ChromiumDust_enable = config.getBoolean("ChromiumDust", CATEGORY_ITEMS, true, "ChromiumDust Configuration");
    	items.ChromiumIngot_enable = config.getBoolean("ChroumiumIngot", CATEGORY_ITEMS, true, "ChromiumIngot Configuration");
    	items.ChromiumNugget_enable = config.getBoolean("ChromiumNugget", CATEGORY_ITEMS, true, "ChromiumNugget Configuration");
    	items.CobaltDust_enable = config.getBoolean("CoblatDust", CATEGORY_ITEMS, true, "CoblatDust Configuration");
    	items.CobaltIngot_enable = config.getBoolean("CobaltIngot", CATEGORY_ITEMS, true, "CoblatIngot Configuration");
    	items.CopperDust_enable = config.getBoolean("CopperDust", CATEGORY_ITEMS, true, "CopperDust Configuration");
    	items.CopperIngot_enable = config.getBoolean("CopperIngot", CATEGORY_ITEMS, true, "CopperIngot Configuration");
    	items.CopperNugget_enable = config.getBoolean("CopperNugget", CATEGORY_ITEMS, true, "CopperNugget Configuration");
    	items.CrashedNetherrack_enable = config.getBoolean("CrashedNetherrack", CATEGORY_ITEMS, true, "CrashedNetherrack Configuration");
    	items.CrashedObsidian_enable = config.getBoolean("CrashedObsidian", CATEGORY_ITEMS, true, "CrashedObsidian Configuration");
    	items.CrushedChromium_enable = config.getBoolean("CrushedChromium", CATEGORY_ITEMS, true, "CrushedChromium Configuration");
    	items.CrushedCopper_enable = config.getBoolean("CrushedCopper", CATEGORY_ITEMS, true, "CrushedCopper Configuration");
    	items.CrushedGold_enable = config.getBoolean("CrushedGold", CATEGORY_ITEMS, true, "CrushedGold Configuration");
    	items.CrushedIron_enable = config.getBoolean("CrushedIron", CATEGORY_ITEMS, true, "CrushedIron Configuration");
    	items.CrushedLead_enable = config.getBoolean("CrushedLead", CATEGORY_ITEMS, true, "CrushedLead Configuration");
    	items.CrushedNickel_enable = config.getBoolean("CrushedNickel", CATEGORY_ITEMS, true, "CrushedLead Configuration");
    	items.CrushedPlatinum_enable = config.getBoolean("CrushedPlatinum", CATEGORY_ITEMS, true, "CrushedPlatinum Configuration");
    	items.CrushedSilver_enable = config.getBoolean("CrushedSilver", CATEGORY_ITEMS, true, "CrushedSilver Configuration");
    	items.CrushedTin_enable = config.getBoolean("CrushedTin", CATEGORY_ITEMS, true, "CrushedTin Configuration");
    	items.CrushedZinc_enable = config.getBoolean("CrushedZinc", CATEGORY_ITEMS, true, "CrushedZinc Configuration");
    	items.GoldDust_enable = config.getBoolean("GoldDust", CATEGORY_ITEMS, true, "GoldDust Configuration");
    	items.IronDust_enable = config.getBoolean("IronDust", CATEGORY_ITEMS, true, "IronDust Configuration");
    	items.IronNugget_enable = config.getBoolean("IronNugget", CATEGORY_ITEMS, true, "IronNugget Configuration");
    	items.ItemCryolite_enable = config.getBoolean("ItemCryolite", CATEGORY_ITEMS, true, "ItemCryolite Configuration");
    	items.LeadDust_enable = config.getBoolean("LeadDust", CATEGORY_ITEMS, true, "LeadDust Configuration");
    	items.LeadIngot_enable = config.getBoolean("LeadIngot", CATEGORY_ITEMS, true, "LeadIngot Configuration");
    	items.LeadNugget_enable = config.getBoolean("LeadNugget", CATEGORY_ITEMS, true, "LeadNugget Configuration");
    	items.NickelDust_enable = config.getBoolean("NickelDust", CATEGORY_ITEMS, true, "NickelDust Configuration");
    	items.NickelIngot_enable = config.getBoolean("NickelIngot", CATEGORY_ITEMS, true, "NickelIngot Configuration");
    	items.NickelNugget_enable = config.getBoolean("NickelNugget", CATEGORY_ITEMS, true, "NickelNugget Configuration");
    	items.PlatinumDust_enable = config.getBoolean("PlatinumDust", CATEGORY_ITEMS, true, "PlatinumDust Configuration");
    	items.PlatinumIngot_enable = config.getBoolean("PlatinumIngot", CATEGORY_ITEMS, true, "PlatinumIngot Configuration");
    	items.PlatinumNugget_enable = config.getBoolean("PlatinumNugget", CATEGORY_ITEMS, true, "PlatinumNugget Configuration");
    	items.PlutoniumIngot_enable = config.getBoolean("PlotoniumIngot", CATEGORY_ITEMS, true ,"PlotoniumIngot Configuration");
    	items.PurifiedAlumina_enable = config.getBoolean("PurifiedAlumina", CATEGORY_ITEMS, true, "PurifiedAlumina Configuration");
    	items.PurifiedChromium_enable = config.getBoolean("PurifiedChromium", CATEGORY_ITEMS, true, "PurifiedChromium Configuration");
    	items.PurifiedCobalt_enable = config.getBoolean("PurifiedCobalt", CATEGORY_ITEMS, true, "PurifiedCoblat Configuration");
    	items.PurifiedCopper_enable = config.getBoolean("PurifiedCopper", CATEGORY_ITEMS, true, "PurifiedCopper Configuration");
    	items.PurifiedGold_enable = config.getBoolean("PurifiedGold", CATEGORY_ITEMS, true, "PurifiedGold Configuration");
    	items.PurifiedIron_enable = config.getBoolean("PurifiedIron", CATEGORY_ITEMS, true, "PurifiedIron Configuration");
    	items.PurifiedLead_enable = config.getBoolean("PurifiedLead", CATEGORY_ITEMS, true, "PurifiedLead Configuration");
    	items.PurifiedNickel_enable = config.getBoolean("PurifiedNickel", CATEGORY_ITEMS, true, "PurifiedNickel Configuration");
    	items.PurifiedPlatinum_enable = config.getBoolean("PurifiedPlatinum", CATEGORY_ITEMS, true, "PurifiedPlatinum Configuration");
    	items.PurifiedSilver_enable = config.getBoolean("PurifiedSilver", CATEGORY_ITEMS, true, "PurifiedSilver Configuration");
    	items.PurifiedTin_enable = config.getBoolean("PurifiedTin", CATEGORY_ITEMS, true, "PurifiedTin Configuration");
    	items.PurifiedTitanate_enable = config.getBoolean("PurifiedTitanate", CATEGORY_ITEMS, true, "PurifiedTitanate Configuration");
    	items.PurifiedTungstate_enable = config.getBoolean("PurifiedTungstate", CATEGORY_ITEMS, true, "PurifiedTungstate Configuration");
    	items.PurifiedZinc_enable = config.getBoolean("PurifiedZinc", CATEGORY_ITEMS, true, "PurifiedZinc Configuration");
    	items.RawBauxite_enable = config.getBoolean("RawBauxite", CATEGORY_ITEMS, true, "RawBauxite Configuration");
    	items.RawRutile_enable = config.getBoolean("RawRutile", CATEGORY_ITEMS, true, "RawRutile Configuration");
    	items.RawScheelite_enable = config.getBoolean("RawScheelite", CATEGORY_ITEMS, true, "RawScheelite Configuration");
    	items.RefinedAlumina_enable = config.getBoolean("RefinedAlumina", CATEGORY_ITEMS, true, "RefinedAlumina Configuration");
    	items.RefinedChromium_enable = config.getBoolean("RefinedChromium", CATEGORY_ITEMS, true, "RefinedChromium Configuration");
    	items.RefinedCobalt_enable = config.getBoolean("RefinedCobalt", CATEGORY_ITEMS, true, "RefinedCobalt Configuration");
    	items.RefinedCopper_enable = config.getBoolean("RefinedCopper", CATEGORY_ITEMS, true, "RefinedCopper Configuration");
    	items.RefinedGold_enable = config.getBoolean("RefinedGold", CATEGORY_ITEMS, true, "RefinedGold Configuration");
    	items.RefinedIron_enable = config.getBoolean("RefinedIron", CATEGORY_ITEMS, true, "RefinedIron Configuration");
    	items.RefinedLead_enable = config.getBoolean("RefinedLead", CATEGORY_ITEMS, true, "RefinedLead Configuration");
    	items.RefinedNickel_enable = config.getBoolean("RefinedNickel", CATEGORY_ITEMS, true, "RefinedNickel Configuration");
    	items.RefinedPlatinum_enable = config.getBoolean("RefinedPlatinum", CATEGORY_ITEMS, true, "RefinedPlatinum Configuration");
    	items.RefinedSilver_enable = config.getBoolean("RefinedSilver", CATEGORY_ITEMS, true, "RefinedSilver Configuration");
    	items.RefinedTin_enable = config.getBoolean("RefinedTin", CATEGORY_ITEMS, true, "RefinedTin Configuration");
    	items.RefinedTitanate_enable = config.getBoolean("RefinedTitanate", CATEGORY_ITEMS, true, "RefinedTitanate Configuration");
    	items.RefinedTungstate_enable = config.getBoolean("RefinedTungstate", CATEGORY_ITEMS, true, "RefinedTungstate Configuration");
    	items.RefinedZinc_enable = config.getBoolean("RefinedZinc", CATEGORY_ITEMS, true, "RefinedZinc Configuration");
    	items.Salt_enable = config.getBoolean("Salt", CATEGORY_ITEMS, true, "Salt Configuration");
    	items.SaltChunk_enable = config.getBoolean("SaltChunk", CATEGORY_ITEMS, true, "SaltChunk Configuration");
    	items.SilverDust_enable = config.getBoolean("SilverDust", CATEGORY_ITEMS, true, "SilverDust Configuration");
    	items.SilverIngot_enable = config.getBoolean("SilverIngot", CATEGORY_ITEMS, true, "SilverIngot Configuration");
    	items.SilverNugget_enable = config.getBoolean("SiilverNugget", CATEGORY_ITEMS, true, "SilverNugget Configuration");
    	items.SteelIngot_enable = config.getBoolean("SteelIngot", CATEGORY_ITEMS, true, "SteelIngot Configuration");
    	items.SteelNugget_enable = config.getBoolean("SteelNugget", CATEGORY_ITEMS, true, "SteelNugget Configuration");
    	items.SulfurChunk_enable = config.getBoolean("SulfurChunk", CATEGORY_ITEMS, true, "SulfurChunk Configuration");
    	items.SulfurDust_enable = config.getBoolean("SulfurDust", CATEGORY_ITEMS, true, "SulfurDust Configuration");
    	items.TinDust_enable = config.getBoolean("TinDust", CATEGORY_ITEMS, true, "TinDust Configuration");
    	items.TinIngot_enable = config.getBoolean("TinIngot", CATEGORY_ITEMS, true, "TinIngot Configuration");
    	items.TinNugget_enable = config.getBoolean("TinNugget", CATEGORY_ITEMS, true, "TinNugget Configuration");
    	items.TitanateDust_enable = config.getBoolean("TitanateDust", CATEGORY_ITEMS, true, "TitanateDust Configuration");
    	items.TitaniumIngot_enable = config.getBoolean("TitaniumIngot", CATEGORY_ITEMS, true, "TitaniumIngot Configuration");
    	items.TitaniumNugget_enable = config.getBoolean("TitaniumNugget", CATEGORY_ITEMS, true, "TitaniumNugget Configuration");
    	items.TungstateDust_enable = config.getBoolean("TungstateDust", CATEGORY_ITEMS, true, "TungstateDust Configuration");
    	items.TungstenIngot_enable = config.getBoolean("TungstenIngot", CATEGORY_ITEMS, true, "TungstenIngot Configuration");
    	items.TungstenNugget_enable = config.getBoolean("TungstenNugget", CATEGORY_ITEMS, true, "TungstenNugget Configuration");
    	items.UraniumIngot_enable = config.getBoolean("UraniumIngot", CATEGORY_ITEMS, true, "UraniumIngot Configuration");
    	items.ZincDust_enable = config.getBoolean("ZincDust", CATEGORY_ITEMS, true, "ZincDust Configuration");
    	items.ZincIngot_enable = config.getBoolean("ZincIngot", CATEGORY_ITEMS, true, "ZincIngot Configuration");
    	items.ZincNugget_enable = config.getBoolean("ZincNugget", CATEGORY_ITEMS, true, "ZincNugget Configuration");
    	
    			
    	//oregen
    	//Nether gen control Start
    	oregen.FerronickelOregen = config.getBoolean("FerronickelOregen", CATEGORY_OREGEN, true, "Ferronickel Oregen Configuration [Default : true]");
    	oregen.PseudoBronzeOregen = config.getBoolean("PseudoBronzeOregen", CATEGORY_OREGEN, true, "PseudoBronze Oregen Configuration [Default : true]");
    	oregen.PseudoBrassOregen = config.getBoolean("PseudoBrassOregen", CATEGORY_OREGEN, true, "PseudoBrass Oregen Configuration [Default : true]");
    	oregen.ArgentAurumOregen = config.getBoolean("ArgentAurumOregen", CATEGORY_OREGEN, true, "ArgentAurum Oregen Configuration [Default : true");
    	oregen.PseudoSolderOregen = config.getBoolean("PseudoSolderOregen", CATEGORY_OREGEN, true, "PseudoSolder Oregen Configuration [Default : true]");
    	oregen.PseudoStelliteOregen = config.getBoolean("PseudoStelliteOregen", CATEGORY_OREGEN, true, "PseudoStellite Oregen Configuration [Default : true]");
    	oregen.TNTiumOregen = config.getBoolean("TNTiumOregen", CATEGORY_OREGEN, true, "TNTium Oregen Configuration [Default : true]");
    	//End
    	//Overworld gen control Start
    	
    	config.save();
	}
}
