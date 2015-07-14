package teamoort.redoxiation;

import teamoort.redoxiation.achievement.RedoxiationAchievements;
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
    	RedoxiationAchievements.isachivenable = config.getBoolean("Achievement Enable", config.CATEGORY_GENERAL, true, "Achivevement Option");
    	// Enable / Disable
    	
		// Blocks Start
    	
    	// Ores Start
    	RedoxiationBlocks.CopperOre_cfg = config.get(CATEGORY_BLOCKS, "CopperOre", true).getBoolean();
    	RedoxiationBlocks.TinOre_cfg = config.get(CATEGORY_BLOCKS, "TinOre", true).getBoolean();
    	RedoxiationBlocks.LeadOre_cfg = config.get(CATEGORY_BLOCKS, "LeadOre", true).getBoolean();
    	RedoxiationBlocks.SilverOre_cfg = config.get(CATEGORY_BLOCKS, "SilverOre", true).getBoolean();
    	RedoxiationBlocks.NickelOre_cfg = config.get(CATEGORY_BLOCKS, "NickelOre", true).getBoolean();
    	RedoxiationBlocks.PlatinumOre_cfg = config.get(CATEGORY_BLOCKS, "PlatinumOre", true).getBoolean();
    	RedoxiationBlocks.ZincOre_cfg = config.get(CATEGORY_BLOCKS, "ZincOre", true).getBoolean();
    	RedoxiationBlocks.CobaltOre_cfg = config.get(CATEGORY_BLOCKS, "CoblatOre", true).getBoolean();
    	RedoxiationBlocks.ChromiumOre_cfg = config.get(CATEGORY_BLOCKS, "ChromiumOre", true).getBoolean();
    	RedoxiationBlocks.Pitchblend_cfg = config.get(CATEGORY_BLOCKS, "Pitchblend", true).getBoolean();
		// Ores End
    	
		// Blocks End
    	
    	// Items Start
    	items.AluminaDust_enable = config.get(CATEGORY_ITEMS, "AluminaDust", true).getBoolean();
    	items.IngotAluminum_enable = config.get(CATEGORY_ITEMS, "IngotAluminum", true).getBoolean();
    	items.AluminumNugget_enable = config.get(CATEGORY_ITEMS, "AluminumNugget", true).getBoolean();
    	items.Calcite_enable = config.get(CATEGORY_ITEMS, "Calcite", true).getBoolean();
    	items.DustChromium_enable = config.get(CATEGORY_ITEMS, "DustChromium", true).getBoolean();
    	items.IngotChromium_enable = config.get(CATEGORY_ITEMS, "ChroumiumIngot", true).getBoolean();
    	items.ChromiumNugget_enable = config.get(CATEGORY_ITEMS, "ChromiumNugget", true).getBoolean();
    	items.CobaltDust_enable = config.get(CATEGORY_ITEMS, "CoblatDust", true).getBoolean();
    	items.IngotCobalt_enable = config.get(CATEGORY_ITEMS, "CobaltIngot", true).getBoolean();
    	items.DustCopper_enable = config.get(CATEGORY_ITEMS, "DustCopper", true).getBoolean();
    	items.IngotCopper_enable = config.get(CATEGORY_ITEMS, "CopperIngot", true).getBoolean();
    	items.CopperNugget_enable = config.get(CATEGORY_ITEMS, "CopperNugget", true).getBoolean();
    	items.CrashedNetherrack_enable = config.get(CATEGORY_ITEMS, "CrashedNetherrack", true).getBoolean();
    	items.CrashedObsidian_enable = config.get(CATEGORY_ITEMS, "CrashedObsidian", true).getBoolean();
    	items.CrushedOreChromium_enable = config.get(CATEGORY_ITEMS, "CrushedOreChromium", true).getBoolean();
    	items.CrushedOreCopper_enable = config.get(CATEGORY_ITEMS, "CrushedOreCopper", true).getBoolean();
    	items.CrushedOreGold_enable = config.get(CATEGORY_ITEMS, "CrushedOreGold", true).getBoolean();
    	items.CrushedOreIron_enable = config.get(CATEGORY_ITEMS, "CrushedOreIron", true).getBoolean();
    	items.CrushedOreLead_enable = config.get(CATEGORY_ITEMS, "CrushedOreLead", true).getBoolean();
    	items.CrushedOreNickel_enable = config.get(CATEGORY_ITEMS, "CrushedOreNickel", true).getBoolean();
    	items.CrushedOrePlatinum_enable = config.get(CATEGORY_ITEMS, "CrushedOrePlatinum", true).getBoolean();
    	items.CrushedOreSilver_enable = config.get(CATEGORY_ITEMS, "CrushedOreSilver", true).getBoolean();
    	items.CrushedOreTin_enable = config.get(CATEGORY_ITEMS, "CrushedOreTin", true).getBoolean();
    	items.CrushedOreZinc_enable = config.get(CATEGORY_ITEMS, "CrushedOreZinc", true).getBoolean();
    	items.DustGold_enable = config.get(CATEGORY_ITEMS, "DustGold", true).getBoolean();
    	items.DustIron_enable = config.get(CATEGORY_ITEMS, "DustIron", true).getBoolean();
    	items.IronNugget_enable = config.get(CATEGORY_ITEMS, "IronNugget", true).getBoolean();
    	items.ItemCryolite_enable = config.get(CATEGORY_ITEMS, "ItemCryolite", true).getBoolean();
    	items.DustLead_enable = config.get(CATEGORY_ITEMS, "DustLead", true).getBoolean();
    	items.IngotLead_enable = config.get(CATEGORY_ITEMS, "LeadIngot", true).getBoolean();
    	items.LeadNugget_enable = config.get(CATEGORY_ITEMS, "LeadNugget", true).getBoolean();
    	items.DustNickel_enable = config.get(CATEGORY_ITEMS, "DustNickel", true).getBoolean();
    	items.IngotNickel_enable = config.get(CATEGORY_ITEMS, "NickelIngot", true).getBoolean();
    	items.NickelNugget_enable = config.get(CATEGORY_ITEMS, "NickelNugget", true).getBoolean();
    	items.DustPlatinum_enable = config.get(CATEGORY_ITEMS, "DustPlatinum", true).getBoolean();
    	items.IngotPlatinum_enable = config.get(CATEGORY_ITEMS, "PlatinumIngot", true).getBoolean();
    	items.PlatinumNugget_enable = config.get(CATEGORY_ITEMS, "PlatinumNugget", true).getBoolean();
    	items.PlutoniumIngot_enable = config.get(CATEGORY_ITEMS, "PlotoniumIngot", true).getBoolean();
    	items.PurifiedAlumina_enable = config.get(CATEGORY_ITEMS, "PurifiedAlumina", true).getBoolean();
    	items.PurifiedChromium_enable = config.get(CATEGORY_ITEMS, "PurifiedChromium", true).getBoolean();
    	items.PurifiedCobalt_enable = config.get(CATEGORY_ITEMS, "PurifiedCobalt", true).getBoolean();
    	items.PurifiedCopper_enable = config.get(CATEGORY_ITEMS, "PurifiedCopper", true).getBoolean();
    	items.PurifiedGold_enable = config.get(CATEGORY_ITEMS, "PurifiedGold", true).getBoolean();
    	items.PurifiedIron_enable = config.get(CATEGORY_ITEMS, "PurifiedIron", true).getBoolean();
    	items.PurifiedLead_enable = config.get(CATEGORY_ITEMS, "PurifiedLead", true).getBoolean();
    	items.PurifiedNickel_enable = config.get(CATEGORY_ITEMS, "PurifiedNickel", true).getBoolean();
    	items.PurifiedPlatinum_enable = config.get(CATEGORY_ITEMS, "PurifiedPlatinum", true).getBoolean();
    	items.PurifiedSilver_enable = config.get(CATEGORY_ITEMS, "PurifiedSilver", true).getBoolean();
    	items.PurifiedTin_enable = config.get(CATEGORY_ITEMS, "PurifiedTin", true).getBoolean();
    	items.PurifiedTitanate_enable = config.get(CATEGORY_ITEMS, "PurifiedTitanate", true).getBoolean();
    	items.PurifiedTungstate_enable = config.get(CATEGORY_ITEMS, "PurifiedTungstate", true).getBoolean();
    	items.PurifiedZinc_enable = config.get(CATEGORY_ITEMS, "PurifiedZinc", true).getBoolean();
    	items.RawBauxite_enable = config.get(CATEGORY_ITEMS, "RawBauxite", true).getBoolean();
    	items.RawRutile_enable = config.get(CATEGORY_ITEMS, "RawRutile", true).getBoolean();
    	items.RawScheelite_enable = config.get(CATEGORY_ITEMS, "RawScheelite", true).getBoolean();
    	items.RefinedAlumina_enable = config.get(CATEGORY_ITEMS, "RefinedAlumina", true).getBoolean();
    	items.RefinedChromium_enable = config.get(CATEGORY_ITEMS, "RefinedChromium", true).getBoolean();
    	items.RefinedCobalt_enable = config.get(CATEGORY_ITEMS, "RefinedCobalt", true).getBoolean();
    	items.RefinedCopper_enable = config.get(CATEGORY_ITEMS, "RefinedCopper", true).getBoolean();
    	items.RefinedGold_enable = config.get(CATEGORY_ITEMS, "RefinedGold", true).getBoolean();
    	items.RefinedIron_enable = config.get(CATEGORY_ITEMS, "RefinedIron", true).getBoolean();
    	items.RefinedLead_enable = config.get(CATEGORY_ITEMS, "RefinedLead", true).getBoolean();
    	items.RefinedNickel_enable = config.get(CATEGORY_ITEMS, "RefinedNickel", true).getBoolean();
    	items.RefinedPlatinum_enable = config.get(CATEGORY_ITEMS, "RefinedPlatinum", true).getBoolean();
    	items.RefinedSilver_enable = config.get(CATEGORY_ITEMS, "RefinedSilver", true).getBoolean();
    	items.RefinedTin_enable = config.get(CATEGORY_ITEMS, "RefinedTin", true).getBoolean();
    	items.RefinedTitanate_enable = config.get(CATEGORY_ITEMS, "RefinedTitanate", true).getBoolean();
    	items.RefinedTungstate_enable = config.get(CATEGORY_ITEMS, "RefinedTungstate", true).getBoolean();
    	items.RefinedZinc_enable = config.get(CATEGORY_ITEMS, "RefinedZinc", true).getBoolean();
    	items.Salt_enable = config.get(CATEGORY_ITEMS, "Salt", true).getBoolean();
    	items.SaltChunk_enable = config.get(CATEGORY_ITEMS, "SaltChunk", true).getBoolean();
    	items.DustSilver_enable = config.get(CATEGORY_ITEMS, "DustSilver", true).getBoolean();
    	items.IngotSilver_enable = config.get(CATEGORY_ITEMS, "SilverIngot", true).getBoolean();
    	items.SilverNugget_enable = config.get(CATEGORY_ITEMS, "SiilverNugget", true).getBoolean();
    	items.IngotSteel_enable = config.get(CATEGORY_ITEMS, "SteelIngot", true).getBoolean();
    	items.SteelNugget_enable = config.get(CATEGORY_ITEMS, "SteelNugget", true).getBoolean();
    	items.SulfurChunk_enable = config.get(CATEGORY_ITEMS, "SulfurChunk", true).getBoolean();
    	items.SulfurDust_enable = config.get(CATEGORY_ITEMS, "SulfurDust", true).getBoolean();
    	items.DustTin_enable = config.get(CATEGORY_ITEMS, "DustTin", true).getBoolean();
    	items.IngotTin_enable = config.get(CATEGORY_ITEMS, "TinIngot", true).getBoolean();
    	items.TinNugget_enable = config.get(CATEGORY_ITEMS, "TinNugget", true).getBoolean();
    	items.TitanateDust_enable = config.get(CATEGORY_ITEMS, "TitanateDust", true).getBoolean();
    	items.IngotTitanium_enable = config.get(CATEGORY_ITEMS, "TitaniumIngot", true).getBoolean();
    	items.TitaniumNugget_enable = config.get(CATEGORY_ITEMS, "TitaniumNugget", true).getBoolean();
    	items.TungstateDust_enable = config.get(CATEGORY_ITEMS, "TungstateDust", true).getBoolean();
    	items.IngotTungsten_enable = config.get(CATEGORY_ITEMS, "TungstenIngot", true).getBoolean();
    	items.TungstenNugget_enable = config.get(CATEGORY_ITEMS, "TungstenNugget", true).getBoolean();
    	items.UraniumIngot_enable = config.get(CATEGORY_ITEMS, "UraniumIngot", true).getBoolean();
    	items.DustZinc_enable = config.get(CATEGORY_ITEMS, "DustZinc", true).getBoolean();
    	items.IngotZinc_enable = config.get(CATEGORY_ITEMS, "ZincIngot", true).getBoolean();
    	items.ZincNugget_enable = config.get(CATEGORY_ITEMS, "ZincNugget", true).getBoolean();
        items.ItemHotAirBucket_enable = config.get(CATEGORY_ITEMS, "HotAirBucket", true).getBoolean();
        items.ItemMoltenPigironBucket_enable = config.get(CATEGORY_ITEMS, "MoltenPigironBucket", true).getBoolean();
        items.ItemSlagBucket_enable = config.get(CATEGORY_ITEMS, "SlagBucket", true).getBoolean();
  
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
