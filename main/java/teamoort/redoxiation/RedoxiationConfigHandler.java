package teamoort.redoxiation;

import teamoort.redoxiation.blocks.RedoxiationBlocks;
import teamoort.redoxiation.items.RedoxiationGenericItems;
import net.minecraftforge.common.config.Configuration;

public class RedoxiationConfigHandler {
	private static Configuration config = Redoxiation.config;
	public static final String CATEGORY_OREGEN = "oregen";
	public static final String CATEGORY_BLOCKS = "blocks";
	public static final String CATEGORY_ITEMS = "items";
	public static final String CATEGORY_TOOLS = "tools";
	public static String comment = "";
	public static void InitConfig(){
		RedoxiationEventHandler oregen = new RedoxiationEventHandler();
		RedoxiationGenericItems items = null;
		config.load();
    	Redoxiation.dummybool = config.get(config.CATEGORY_GENERAL, "Dummy", true).getBoolean();
    	Redoxiation.oredif = config.getInt("OreDifficulty", config.CATEGORY_GENERAL, 1, 0, 2, "1 to 2");
    	// Enable / Disable
    	
		// Blocks Start
    	
    	// Ores Start
    	RedoxiationBlocks.CopperOre_cfg = config.get(CATEGORY_BLOCKS, "CopperOre", true).getBoolean();
    	RedoxiationBlocks.TinOre_cfg = config.get(CATEGORY_BLOCKS, "TinOre", true).getBoolean();
    	RedoxiationBlocks.LeadOre_cfg = config.get(CATEGORY_BLOCKS, "LeadOre", true).getBoolean();
    	RedoxiationBlocks.SilverOre_cfg = config.get("SilverOre", CATEGORY_BLOCKS, true).getBoolean();
    	RedoxiationBlocks.NickelOre_cfg = config.get("NickelOre", CATEGORY_BLOCKS, true).getBoolean();
    	RedoxiationBlocks.PlatinumOre_cfg = config.get("PlatinumOre", CATEGORY_BLOCKS, true).getBoolean();
    	RedoxiationBlocks.ZincOre_cfg = config.get("ZincOre", CATEGORY_BLOCKS, true).getBoolean();
    	RedoxiationBlocks.CobaltOre_cfg = config.get("CoblatOre", CATEGORY_BLOCKS, true).getBoolean();
    	RedoxiationBlocks.ChromiumOre_cfg = config.get("ChromiumOre", CATEGORY_BLOCKS, true).getBoolean();
    	RedoxiationBlocks.Pitchblend_cfg = config.get("Pitchblend", CATEGORY_BLOCKS, true).getBoolean();
		// Ores End
    	
		// Blocks End
    	
    	// Items Start
    	items.AluminaDust_enable = config.get("AluminaDust", CATEGORY_ITEMS, true).getBoolean();
    	items.AluminumIngot_enable = config.get("AluminumIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.AluminumNugget_enable = config.get("AluminumNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.Calcite_enable = config.get("Calcite", CATEGORY_ITEMS, true).getBoolean();
    	items.ChromiumDust_enable = config.get("ChromiumDust", CATEGORY_ITEMS, true).getBoolean();
    	items.ChromiumIngot_enable = config.get("ChroumiumIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.ChromiumNugget_enable = config.get("ChromiumNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.CobaltDust_enable = config.get("CoblatDust", CATEGORY_ITEMS, true).getBoolean();
    	items.CobaltIngot_enable = config.get("CobaltIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.CopperDust_enable = config.get("CopperDust", CATEGORY_ITEMS, true).getBoolean();
    	items.CopperIngot_enable = config.get("CopperIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.CopperNugget_enable = config.get("CopperNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.CrashedNetherrack_enable = config.get("CrashedNetherrack", CATEGORY_ITEMS, true).getBoolean();
    	items.CrashedObsidian_enable = config.get("CrashedObsidian", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedChromium_enable = config.get("CrushedChromium", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedCopper_enable = config.get("CrushedCopper", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedGold_enable = config.get("CrushedGold", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedIron_enable = config.get("CrushedIron", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedLead_enable = config.get("CrushedLead", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedNickel_enable = config.get("CrushedNickel", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedPlatinum_enable = config.get("CrushedPlatinum", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedSilver_enable = config.get("CrushedSilver", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedTin_enable = config.get("CrushedTin", CATEGORY_ITEMS, true).getBoolean();
    	items.CrushedZinc_enable = config.get("CrushedZinc", CATEGORY_ITEMS, true).getBoolean();
    	items.GoldDust_enable = config.get("GoldDust", CATEGORY_ITEMS, true).getBoolean();
    	items.IronDust_enable = config.get("IronDust", CATEGORY_ITEMS, true).getBoolean();
    	items.IronNugget_enable = config.get("IronNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.ItemCryolite_enable = config.get("ItemCryolite", CATEGORY_ITEMS, true).getBoolean();
    	items.LeadDust_enable = config.get("LeadDust", CATEGORY_ITEMS, true).getBoolean();
    	items.LeadIngot_enable = config.get("LeadIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.LeadNugget_enable = config.get("LeadNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.NickelDust_enable = config.get("NickelDust", CATEGORY_ITEMS, true).getBoolean();
    	items.NickelIngot_enable = config.get("NickelIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.NickelNugget_enable = config.get("NickelNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.PlatinumDust_enable = config.get("PlatinumDust", CATEGORY_ITEMS, true).getBoolean();
    	items.PlatinumIngot_enable = config.get("PlatinumIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.PlatinumNugget_enable = config.get("PlatinumNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.PlutoniumIngot_enable = config.get("PlotoniumIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedAlumina_enable = config.get("PurifiedAlumina", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedChromium_enable = config.get("PurifiedChromium", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedCobalt_enable = config.get("PurifiedCobalt", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedCopper_enable = config.get("PurifiedCopper", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedGold_enable = config.get("PurifiedGold", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedIron_enable = config.get("PurifiedIron", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedLead_enable = config.get("PurifiedLead", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedNickel_enable = config.get("PurifiedNickel", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedPlatinum_enable = config.get("PurifiedPlatinum", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedSilver_enable = config.get("PurifiedSilver", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedTin_enable = config.get("PurifiedTin", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedTitanate_enable = config.get("PurifiedTitanate", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedTungstate_enable = config.get("PurifiedTungstate", CATEGORY_ITEMS, true).getBoolean();
    	items.PurifiedZinc_enable = config.get("PurifiedZinc", CATEGORY_ITEMS, true).getBoolean();
    	items.RawBauxite_enable = config.get("RawBauxite", CATEGORY_ITEMS, true).getBoolean();
    	items.RawRutile_enable = config.get("RawRutile", CATEGORY_ITEMS, true).getBoolean();
    	items.RawScheelite_enable = config.get("RawScheelite", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedAlumina_enable = config.get("RefinedAlumina", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedChromium_enable = config.get("RefinedChromium", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedCobalt_enable = config.get("RefinedCobalt", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedCopper_enable = config.get("RefinedCopper", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedGold_enable = config.get("RefinedGold", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedIron_enable = config.get("RefinedIron", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedLead_enable = config.get("RefinedLead", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedNickel_enable = config.get("RefinedNickel", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedPlatinum_enable = config.get("RefinedPlatinum", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedSilver_enable = config.get("RefinedSilver", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedTin_enable = config.get("RefinedTin", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedTitanate_enable = config.get("RefinedTitanate", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedTungstate_enable = config.get("RefinedTungstate", CATEGORY_ITEMS, true).getBoolean();
    	items.RefinedZinc_enable = config.get("RefinedZinc", CATEGORY_ITEMS, true).getBoolean();
    	items.Salt_enable = config.get("Salt", CATEGORY_ITEMS, true).getBoolean();
    	items.SaltChunk_enable = config.get("SaltChunk", CATEGORY_ITEMS, true).getBoolean();
    	items.SilverDust_enable = config.get("SilverDust", CATEGORY_ITEMS, true).getBoolean();
    	items.SilverIngot_enable = config.get("SilverIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.SilverNugget_enable = config.get("SiilverNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.SteelIngot_enable = config.get("SteelIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.SteelNugget_enable = config.get("SteelNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.SulfurChunk_enable = config.get("SulfurChunk", CATEGORY_ITEMS, true).getBoolean();
    	items.SulfurDust_enable = config.get("SulfurDust", CATEGORY_ITEMS, true).getBoolean();
    	items.TinDust_enable = config.get("TinDust", CATEGORY_ITEMS, true).getBoolean();
    	items.TinIngot_enable = config.get("TinIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.TinNugget_enable = config.get("TinNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.TitanateDust_enable = config.get("TitanateDust", CATEGORY_ITEMS, true).getBoolean();
    	items.TitaniumIngot_enable = config.get("TitaniumIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.TitaniumNugget_enable = config.get("TitaniumNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.TungstateDust_enable = config.get("TungstateDust", CATEGORY_ITEMS, true).getBoolean();
    	items.TungstenIngot_enable = config.get("TungstenIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.TungstenNugget_enable = config.get("TungstenNugget", CATEGORY_ITEMS, true).getBoolean();
    	items.UraniumIngot_enable = config.get("UraniumIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.ZincDust_enable = config.get("ZincDust", CATEGORY_ITEMS, true).getBoolean();
    	items.ZincIngot_enable = config.get("ZincIngot", CATEGORY_ITEMS, true).getBoolean();
    	items.ZincNugget_enable = config.get("ZincNugget", CATEGORY_ITEMS, true).getBoolean();
  
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
    	Redoxiation.logger.info("Config Loading Complete. Starting Item Registry");
	}
}
