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
    	RedoxiationBlocks.Rutile_cfg = config.get(CATEGORY_BLOCKS, "Rutile", true).getBoolean();
    	RedoxiationBlocks.Scheelite_cfg = config.get(CATEGORY_BLOCKS, "Scheelite", true).getBoolean();
    	RedoxiationBlocks.Bauxite_cfg = config.get(CATEGORY_BLOCKS, "Bauxite", true).getBoolean();
    	RedoxiationBlocks.SulfurOre_cfg = config.get(CATEGORY_BLOCKS, "SulfurOre", true).getBoolean();
    	RedoxiationBlocks.Limestone_cfg = config.get(CATEGORY_BLOCKS, "Limestone", true).getBoolean();
    	RedoxiationBlocks.Cryolite_cfg = config.get(CATEGORY_BLOCKS, "Cryolite", true).getBoolean();
		// Ores End
    	
		// Blocks End
    	
    	// Items Start
		//Gold
		items.CrushedOreGold_enable = config.get(CATEGORY_ITEMS, "CrushedOreGold", true).getBoolean();
		items.DustOreGold_enable = config.get(CATEGORY_ITEMS, "DustOreGold", true).getBoolean();

		//Iron
		items.NuggetIron_enable = config.get(CATEGORY_ITEMS, "NuggetIron", true).getBoolean();
		items.CrushedOreIron_enable = config.get(CATEGORY_ITEMS, "CrushedOreIron", true).getBoolean();
		items.DustOreIron_enable = config.get(CATEGORY_ITEMS, "DustOreIron", true).getBoolean();
		
		//Aluminum
		items.NuggetAluminum_enable = config.get(CATEGORY_ITEMS, "NuggetAluminum", true).getBoolean();
		items.DustBauxite_enable = config.get(CATEGORY_ITEMS, "DustBauxite", true).getBoolean();
		items.IngotAluminum_enable = config.get(CATEGORY_ITEMS, "IngotAluminum", true).getBoolean();
		items.RawBauxite_enable = config.get(CATEGORY_ITEMS, "RawBauxite", true).getBoolean();
		
		//Chromium
		items.NuggetChromium_enable = config.get(CATEGORY_ITEMS, "NuggetChromium", true).getBoolean();
		items.CrushedOreChromium_enable = config.get(CATEGORY_ITEMS, "CrushedOreChromium", true).getBoolean();
		items.DustOreChromium_enable = config.get(CATEGORY_ITEMS, "DustOreChromium", true).getBoolean();
		items.IngotChromium_enable = config.get(CATEGORY_ITEMS, "ChroumiumIngot", true).getBoolean();
		
		//Cobalt
		items.DustOreCobalt_enable = config.get(CATEGORY_ITEMS, "DustOreCoblat", true).getBoolean();
		items.IngotCobalt_enable = config.get(CATEGORY_ITEMS, "CobaltIngot", true).getBoolean();
		
		//Copper
		items.NuggetCopper_enable = config.get(CATEGORY_ITEMS, "NuggetCopper", true).getBoolean();
		items.CrushedOreCopper_enable = config.get(CATEGORY_ITEMS, "CrushedOreCopper", true).getBoolean();
		items.DustOreCopper_enable = config.get(CATEGORY_ITEMS, "DustOreCopper", true).getBoolean();
		items.IngotCopper_enable = config.get(CATEGORY_ITEMS, "CopperIngot", true).getBoolean();
		
		//Lead
		items.NuggetLead_enable = config.get(CATEGORY_ITEMS, "NuggetLead", true).getBoolean();
		items.CrushedOreLead_enable = config.get(CATEGORY_ITEMS, "CrushedOreLead", true).getBoolean();
		items.DustOreLead_enable = config.get(CATEGORY_ITEMS, "DustOreLead", true).getBoolean();
		items.IngotLead_enable = config.get(CATEGORY_ITEMS, "LeadIngot", true).getBoolean();
		
		//Nickel
		items.NuggetNickel_enable = config.get(CATEGORY_ITEMS, "NuggetNickel", true).getBoolean();
		items.CrushedOreNickel_enable = config.get(CATEGORY_ITEMS, "CrushedOreNickel", true).getBoolean();
		items.DustOreNickel_enable = config.get(CATEGORY_ITEMS, "DustOreNickel", true).getBoolean();
		items.IngotNickel_enable = config.get(CATEGORY_ITEMS, "NickelIngot", true).getBoolean();
		
		//Platinum
		items.NuggetPlatinum_enable = config.get(CATEGORY_ITEMS, "NuggetPlatinum", true).getBoolean();
		items.CrushedOrePlatinum_enable = config.get(CATEGORY_ITEMS, "CrushedOrePlatinum", true).getBoolean();
		items.DustOrePlatinum_enable = config.get(CATEGORY_ITEMS, "DustOrePlatinum", true).getBoolean();
		items.IngotPlatinum_enable = config.get(CATEGORY_ITEMS, "PlatinumIngot", true).getBoolean();

		//Salt
		items.SaltChunk_enable = config.get(CATEGORY_ITEMS, "SaltChunk", true).getBoolean();
		items.DustSalt_enable = config.get(CATEGORY_ITEMS, "DustSalt", true).getBoolean();
		
		//Sulfur
		items.SulfurChunk_enable = config.get(CATEGORY_ITEMS, "SulfurChunk", true).getBoolean();
		items.DustSulfur_enable = config.get(CATEGORY_ITEMS, "DustSulfur", true).getBoolean();
		
		//Silver
		items.NuggetSilver_enable = config.get(CATEGORY_ITEMS, "NuggetSilver", true).getBoolean();
		items.DustOreSilver_enable = config.get(CATEGORY_ITEMS, "DustOreSilver", true).getBoolean();
		items.CrushedOreSilver_enable = config.get(CATEGORY_ITEMS, "CrushedOreSilver", true).getBoolean();
		items.IngotSilver_enable = config.get(CATEGORY_ITEMS, "SilverIngot", true).getBoolean();
		
		//Steel
		items.NuggetSteel_enable = config.get(CATEGORY_ITEMS, "NuggetSteel", true).getBoolean();
		items.IngotSteel_enable = config .get(CATEGORY_ITEMS, "SteelIngot", true).getBoolean();
		
		//Tin
		items.NuggetTin_enable = config.get(CATEGORY_ITEMS, "NuggetTin", true) .getBoolean();
		items.CrushedOreTin_enable = config.get(CATEGORY_ITEMS, "CrushedOreTin", true).getBoolean();
		items.DustOreTin_enable = config.get(CATEGORY_ITEMS, "DustOreTin", true) .getBoolean();
		items.IngotTin_enable = config.get(CATEGORY_ITEMS, "TinIngot", true) .getBoolean();
		
		//Titanate
		items.NuggetTitanium_enable = config.get(CATEGORY_ITEMS, "NuggetTitanium", true).getBoolean();
		items.DustRutile_enable = config.get(CATEGORY_ITEMS, "DustRutile", true).getBoolean();
		items.IngotTitanium_enable = config.get(CATEGORY_ITEMS, "TitaniumIngot", true).getBoolean();
		items.RawRutile_enable = config.get(CATEGORY_ITEMS, "RawRutile", true).getBoolean();
		
		//Tungstate
		items.NuggetTungsten_enable = config.get(CATEGORY_ITEMS, "NuggetTungsten", true).getBoolean();
		items.DustScheelite_enable = config.get(CATEGORY_ITEMS, "DustScheelite", true).getBoolean();
		items.IngotTungsten_enable = config.get(CATEGORY_ITEMS, "TungstenIngot", true).getBoolean();
		items.RawScheelite_enable = config.get(CATEGORY_ITEMS, "RawScheelite", true).getBoolean();
		
		//Zinc
		items.NuggetZinc_enable = config.get(CATEGORY_ITEMS, "NuggetZinc", true).getBoolean();
		items.CrushedOreZinc_enable = config.get(CATEGORY_ITEMS, "CrushedOreZinc", true).getBoolean();
		items.DustOreZinc_enable = config.get(CATEGORY_ITEMS, "DustOreZinc", true).getBoolean();
		items.IngotZinc_enable = config.get(CATEGORY_ITEMS, "ZincIngot", true).getBoolean();
		
		
		//Bucket
		items.ItemHotAirBucket_enable = config.get(CATEGORY_ITEMS, "HotAirBucket", true).getBoolean();
		items.ItemMoltenPigironBucket_enable = config.get(CATEGORY_ITEMS, "MoltenPigironBucket", true).getBoolean();
		items.ItemSlagBucket_enable = config.get(CATEGORY_ITEMS, "SlagBucket", true).getBoolean();
		
		//ETC
		//Item
		items.Calcite_enable = config.get(CATEGORY_ITEMS, "Calcite", true).getBoolean();
		items.ItemCryolite_enable = config.get(CATEGORY_ITEMS, "ItemCryolite", true).getBoolean();
		
		//OOO Ingot
		items.PlutoniumIngot_enable = config.get(CATEGORY_ITEMS, "PlotoniumIngot", true).getBoolean();
		items.UraniumIngot_enable = config.get(CATEGORY_ITEMS, "UraniumIngot", true).getBoolean();
		
		//Crashed OOO
		items.CrashedNetherrack_enable = config.get(CATEGORY_ITEMS, "CrashedNetherrack", true).getBoolean();
		items.CrashedObsidian_enable = config.get(CATEGORY_ITEMS, "CrashedObsidian", true).getBoolean();

  
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
