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

public class RedoxiationGenericItems extends Item {

	private final String ITEMNAME;
	private final String INFORMATION;

	public static Item Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite,
			CrushedOreIron, CrushedOreGold, CrushedOreCopper, CrushedOreTin,
			CrushedOreLead, CrushedOreSilver, CrushedOreNickel,
			CrushedOrePlatinum, CrushedOreZinc, CrushedOreChromium, DustOreIron,
			DustOreGold, DustOreCopper, DustOreTin, DustOreLead, DustOreSilver, DustOreNickel,
			DustOrePlatinum, DustOreZinc, DustOreCobalt, DustOreChromium, Salt,
			DustBauxite, DustRutile, DustScheelite,
			IngotCopper, IngotTin, IngotLead, IngotSilver, IngotNickel,
			IngotPlatinum, IngotZinc, IngotCobalt, IngotChromium, UraniumIngot,
			PlutoniumIngot, IngotSteel, IngotAluminum, IngotTungsten,
			IngotTitanium, IronNugget, CopperNugget, TinNugget, LeadNugget,
			SilverNugget, PlatinumNugget, ZincNugget, NickelNugget,
			ChromiumNugget, AluminumNugget, TitaniumNugget, TungstenNugget,
			SteelNugget, SulfurChunk, SulfurDust, ItemCryolite,
			CrashedNetherrack, CrashedObsidian, ItemHotAirBucket,
			ItemMoltenPigironBucket, ItemSlagBucket;
	
	public static boolean Calcite_enable, SaltChunk_enable, RawBauxite_enable,
			RawRutile_enable, RawScheelite_enable, CrushedOreIron_enable,
			CrushedOreGold_enable, CrushedOreCopper_enable,
			CrushedOreTin_enable, CrushedOreLead_enable,
			CrushedOreSilver_enable, CrushedOreNickel_enable,
			CrushedOrePlatinum_enable, CrushedOreZinc_enable,
			CrushedOreChromium_enable, DustOreIron_enable, DustOreGold_enable,
			DustOreCopper_enable, DustOreTin_enable, DustOreLead_enable,
			DustOreSilver_enable, DustOreNickel_enable, DustOrePlatinum_enable,
			DustOreZinc_enable, DustOreCobalt_enable, DustOreChromium_enable,
			Salt_enable, DustBauxite_enable, DustRutile_enable,
			DustScheelite_enable, IngotCopper_enable, IngotTin_enable,
			IngotLead_enable, IngotSilver_enable, IngotNickel_enable,
			IngotPlatinum_enable, IngotZinc_enable, IngotCobalt_enable,
			IngotChromium_enable, UraniumIngot_enable, PlutoniumIngot_enable,
			IngotSteel_enable, IngotAluminum_enable, IngotTungsten_enable,
			IngotTitanium_enable, IronNugget_enable, CopperNugget_enable,
			TinNugget_enable, LeadNugget_enable, SilverNugget_enable,
			PlatinumNugget_enable, ZincNugget_enable, NickelNugget_enable,
			ChromiumNugget_enable, AluminumNugget_enable,
			TitaniumNugget_enable, TungstenNugget_enable, SteelNugget_enable,
			SulfurChunk_enable, SulfurDust_enable, ItemCryolite_enable,
			CrashedNetherrack_enable, CrashedObsidian_enable,
			ItemHotAirBucket_enable, ItemMoltenPigironBucket_enable,
			ItemSlagBucket_enable;

	public RedoxiationGenericItems(String name, String info) {
		super();
		setCreativeTab(Redoxiation.tabRedoxiationitems);
		INFORMATION = info;
		ITEMNAME = name;
	}

	public RedoxiationGenericItems(String name) {
		super();
		setCreativeTab(Redoxiation.tabRedoxiationitems);
		ITEMNAME = name;
		INFORMATION = "null";
	}

	public static void registerItems() {
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
		if(DustOreIron_enable){
			DustOreIron = new RedoxiationGenericItems("DustOreIron", "Fe");
			GameRegistry.registerItem(DustOreIron, "DustOreIron");
			OreDictionary.registerOre("DustOreIronRedox", RedoxiationGenericItems.DustOreIron);
		}
		if(DustOreGold_enable){
			DustOreGold = new RedoxiationGenericItems("DustOreGold", "Au");
			GameRegistry.registerItem(DustOreGold, "DustOreGold");
			OreDictionary.registerOre("DustOreGoldRedox", RedoxiationGenericItems.DustOreGold);
		}
		if(DustOreCopper_enable){
			DustOreCopper = new RedoxiationGenericItems("DustOreCopper", "Cu");
			GameRegistry.registerItem(DustOreCopper, "DustOreCopper");
			OreDictionary.registerOre("DustOreCopperRedox", RedoxiationGenericItems.DustOreCopper);
		}
		if(DustOreTin_enable){
			DustOreTin = new RedoxiationGenericItems("DustOreTin", "Sn");
			GameRegistry.registerItem(DustOreTin, "DustOreTin");
			OreDictionary.registerOre("DustOreTinRedox", RedoxiationGenericItems.DustOreTin);
		}
		if(DustOreLead_enable){
			DustOreLead = new RedoxiationGenericItems("DustOreLead", "Pb");
			GameRegistry.registerItem(DustOreLead, "DustOreLead");
			OreDictionary.registerOre("DustOreLeadRedox", RedoxiationGenericItems.DustOreLead);
		}
		if(DustOreSilver_enable){
			DustOreSilver = new RedoxiationGenericItems("DustOreSilver", "Ag");
			GameRegistry.registerItem(DustOreSilver, "DustOreSilver");
			OreDictionary.registerOre("DustOreSilverRedox", RedoxiationGenericItems.DustOreSilver);
		}
		if(DustOrePlatinum_enable){
			DustOrePlatinum = new RedoxiationGenericItems("DustOrePlatinum", "Pt");
			GameRegistry.registerItem(DustOrePlatinum, "DustOrePlatinum");
			OreDictionary.registerOre("DustOrePlatinumRedox", RedoxiationGenericItems.DustOrePlatinum);
		}
    	if(DustOreZinc_enable){
			DustOreZinc = new RedoxiationGenericItems("DustOreZinc", "Zn");
			GameRegistry.registerItem(DustOreZinc, "DustOreZinc");
			OreDictionary.registerOre("DustOreZincRedox", RedoxiationGenericItems.DustOreZinc);
    	}
    	if(DustOreNickel_enable){
			DustOreNickel = new RedoxiationGenericItems("DustOreNickel", "Ni");
			GameRegistry.registerItem(DustOreNickel, "DustOreNickel");
			OreDictionary.registerOre("DustOreNickelRedox", RedoxiationGenericItems.DustOreNickel);
    	}
    	if(DustOreChromium_enable){
			DustOreChromium = new RedoxiationGenericItems("DustOreChromium", "Cr");
			GameRegistry.registerItem(DustOreChromium, "DustOreChromium");
			OreDictionary.registerOre("DustOreChromiumRedox", RedoxiationGenericItems.DustOreChromium);
    	}
    	if(Salt_enable){
			Salt = new RedoxiationGenericItems("Salt", "NaCl");
			GameRegistry.registerItem(Salt, "Salt");
			OreDictionary.registerOre("DustOreSaltRedox", RedoxiationGenericItems.Salt);
    	}
    	if(DustBauxite_enable){
			DustBauxite = new RedoxiationGenericItems("DustBauxite", "Al2O3");
			GameRegistry.registerItem(DustBauxite, "DustBauxite");
			OreDictionary.registerOre("DustOreAluminumRedox", RedoxiationGenericItems.DustBauxite);
    	}
    	if(DustRutile_enable){
			DustRutile = new RedoxiationGenericItems("DustRutile", "TiO2");
			GameRegistry.registerItem(DustRutile, "DustRutile");
			OreDictionary.registerOre("DustOreTitaniumRedox", RedoxiationGenericItems.DustRutile);
    	}
    	if(DustScheelite_enable){
			DustScheelite = new RedoxiationGenericItems("DustScheelite", "WO3");
			GameRegistry.registerItem(DustScheelite, "DustScheelite");
			OreDictionary.registerOre("DustOreTungstenRedox", RedoxiationGenericItems.DustScheelite);
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
			OreDictionary.registerOre("DustOreSulfurOort", RedoxiationGenericItems.SulfurDust);
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
            ItemHotAirBucket = new RedoxiationBucket(RedoxiationBlocks.HotAirBlock);
            ItemHotAirBucket.setUnlocalizedName(Redoxiation.MODID + "." + "HotAirBucket").setContainerItem(Items.bucket);
            GameRegistry.registerItem(ItemHotAirBucket, "HotAirBucket");
            FluidContainerRegistry.registerFluidContainer(RedoxiationBlocks.HotAir, new ItemStack(ItemHotAirBucket), new ItemStack(Items.bucket));
            BucketHandler.INSTANCE.buckets.put(RedoxiationBlocks.HotAirBlock, ItemHotAirBucket);
            MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
        }
        if(ItemMoltenPigironBucket_enable) {
            ItemMoltenPigironBucket = new RedoxiationBucket(RedoxiationBlocks.MoltenPigironBlock);
            ItemMoltenPigironBucket.setUnlocalizedName(Redoxiation.MODID + "." + "MoltenPigironBucket").setContainerItem(Items.bucket);
            GameRegistry.registerItem(ItemMoltenPigironBucket, "MoltenPigironBucket");
            FluidContainerRegistry.registerFluidContainer(RedoxiationBlocks.MoltenPigiron, new ItemStack(ItemMoltenPigironBucket), new ItemStack(Items.bucket));
            BucketHandler.INSTANCE.buckets.put(RedoxiationBlocks.MoltenPigironBlock, ItemMoltenPigironBucket);
            MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
        }
        if(ItemSlagBucket_enable) {
            ItemSlagBucket = new RedoxiationBucket(RedoxiationBlocks.SlagBlock);
            ItemSlagBucket.setUnlocalizedName(Redoxiation.MODID + "." + "SlagBucket").setContainerItem(Items.bucket);
            GameRegistry.registerItem(ItemSlagBucket, "SlagBucket");
            FluidContainerRegistry.registerFluidContainer(RedoxiationBlocks.Slag, new ItemStack(ItemSlagBucket), new ItemStack(Items.bucket));
            BucketHandler.INSTANCE.buckets.put(RedoxiationBlocks.SlagBlock, ItemSlagBucket);
            MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
		}
		Redoxiation.logger.info("Item Registry Complete. Starting Tileentity proxy.");
	}

	@Override
	public String getUnlocalizedName() {
		return "item." + Redoxiation.MODID + "." + ITEMNAME;
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {
		return "item." + Redoxiation.MODID + "." + ITEMNAME;
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon(Redoxiation.MODID + ":" + ITEMNAME);
	}

	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player,
			List list, boolean par4) {
		if (!(INFORMATION.equals("null"))) {
			list.add(INFORMATION);
		}
	}
}
