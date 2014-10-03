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
    
    public static Block CopperOre, TinOre, LeadOre, SilverOre, Limestone, SaltRock, Bauxite, Rutile, Scheelite;
    
    //Items
    
    public static Item Calcite, SaltChunk, RawBauxite, RawRutile, RawScheelite, AluminaDust, CopperIngot, TinIngot, LeadIngot, SilverIngot, AluminumIngot, SteelIngot;

    //IDs
    
    int CopperOreID = 1000;				//Ore 1000-1009
    int TinOreID = 1001;
    int LeadOreID = 1002;
    int SilverOreID = 1003;
    int PlatinumOreID = 1004;
    int ZincOreID = 1005;
    int CobaltOreID = 1006;
    int ChromiumOreID = 1007;
    int UraniumOreID = 1008;
    int PlutoniumOreID = 1009;
    
    int LimestoneID = 1020;				//Mineral Rock 1020-1024
    int SaltRockID = 1021;
    int BauxiteID = 1022;
    int RutileID = 1023;
    int ScheeliteID = 1024;
    
    int SulfurOreID = 1030;				//Other Materials (Ore) 1030-

    int MortarPestle = 4000;			//Tools 4000-
    
    int CalciteID = 10000;				//Raw Mineral 10000-10004
    int SaltChunkID = 10001;
    int RawBauxiteID = 10002;
    int RawRutileID = 10003;
    int RawScheeliteID = 10004;
    
    int CrushedIronID = 10010;			//Crushed Ore 10010-10019
    int CrushedGoldID = 10011;
    int CrushedCopperID = 10012;
    int CrushedTinID = 10013;
    int CrushedLeadID = 10014;
    int CrushedSilverID = 10015;
    int CrushedPlatinumID = 10016;
    int CrushedZincID = 10017;
    int CrushedCobaltID = 10018;
    int CrushedChromiumID = 10019;
    
    int IronDustID = 10020;				//Dust 10020-10029
    int GoldDustID = 10021;
    int CopperDustID = 10022;
    int TinDustID = 10023;
    int LeadDustID = 10024;
    int SilverDustID = 10025;
    int PlatinumDustID = 10026;
    int ZincDustID = 10027;
    int CobaltDustID = 10028;
    int ChromiumDustID = 10029;
    
    int SaltID = 10030;					//Mineral Dust 10030-10033			
    int AluminaDustID = 10031;
    int TitanateDustID = 10032;
    int TungstateDustID = 10033;
    
    int PurifiedIronID = 10020;    				//Purified Dust 10040-10049
    int PurifiedGoldID = 10021;
    int PurifiedCopperID = 10022;
    int PurifiedTinID = 10023;
    int PurifiedLeadID = 10024;
    int PurifiedSilverID = 10025;
    int PurifiedPlatinumID = 10026;
    int PurifiedZincID = 10027;
    int PurifiedCobaltID = 10028;
    int PurifiedChromiumID = 10029;
    
    int PurifiedAluminaID = 10050;		//Purified Mineral Dust 10050-10052
    int PurifiedTitanateID = 10051;
    int PurifiedTungstateID = 10052;
    
    int RefinedIronID = 10060;    		//Refined Dust 10060-10069
    int RefinedGoldID = 10061;
    int RefinedCopperID = 10062;
    int RefinedTinID = 10063;
    int RefinedLeadID = 10064;
    int RefinedSilverID = 10065;
    int RefinedPlatinumID = 10066;
    int RefinedZincID = 10067;
    int RefinedCobaltID = 10068;
    int RefinedChromiumID = 10069;
    
    int RefinedAluminaID = 10070;		//Refined Mineral Dust 10070-10072
    int RefinedTitanateID = 10071;
    int RefinedTungstateID = 10072;
    
    int CopperIngotID = 10080;			//Ingot 10080-10093
    int TinIngotID = 10081;
    int LeadIngotID = 10082;
    int SilverIngotID = 10083;
    int PlatinumIngotID = 10084;
    int ZincIngotID = 10085;
    int CobaltIngotID = 10086;
    int ChromiumIngotID = 10087;
    int UraniumIngotID = 10088;
    int PlutoniumIngotID = 10089;
    int SteelIngotID = 10090;
    int AluminumIngotID = 10091;
    int TungstenIngotID = 10092;
    int TitaniumIngotID = 10093;
    
    int SulfurChunkID = 10100;			//Other Materials (Raw) 10100-
    int SulfurDustID = 10101;
    
    
    OorEventHandler handler = new OorEventHandler();
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	
    	//Blocks
    	
    	CopperOre = new CopperOre(CopperOreID, Material.rock).setBlockName("CopperOre");
    	TinOre = new TinOre(TinOreID, Material.rock).setBlockName("TinOre");
    	Limestone = new Limestone(LimestoneID, Material.rock).setBlockName("Limestone");
    	LeadOre = new LeadOre(LeadOreID, Material.rock).setBlockName("LeadOre");
    	SilverOre = new SilverOre(SilverOreID, Material.rock).setBlockName("SilverOre");
    	Bauxite = new Bauxite(BauxiteID, Material.rock).setBlockName("Bauxite");
    	
    	//Items
    	
    	Calcite = new Calcite(CalciteID).setUnlocalizedName("Calcite");
    	RawBauxite = new RawBauxite(RawBauxiteID).setUnlocalizedName("RawBauxite");
    	AluminaDust = new AluminaDust(AluminaDustID).setUnlocalizedName("AluminaDust");
    	CopperIngot = new CopperIngot(CopperIngotID).setUnlocalizedName("CopperIngot");
    	TinIngot = new TinIngot(TinIngotID).setUnlocalizedName("TinIngot");
    	LeadIngot = new LeadIngot(LeadIngotID).setUnlocalizedName("LeadIngot");
    	SilverIngot = new SilverIngot(SilverIngotID).setUnlocalizedName("SilverIngot");
    	AluminumIngot = new AluminumIngot(AluminumIngotID).setUnlocalizedName("AluminumIngot");
    	SteelIngot = new SteelIngot(SteelIngotID).setUnlocalizedName("SteelIngot");
    	
    	//Registry
    	
    	GameRegistry.registerBlock(CopperOre, "CopperOre");
    	GameRegistry.registerBlock(Limestone, "Limestone");
    	GameRegistry.registerBlock(TinOre, "TinOre");
    	GameRegistry.registerBlock(LeadOre, "LeadOre");
    	GameRegistry.registerBlock(SilverOre, "SilverOre");
    	GameRegistry.registerBlock(Bauxite, "Bauxite");
    	
    	GameRegistry.registerItem(Calcite, "Calcite");
    	GameRegistry.registerItem(RawBauxite, "RawBauxite");
    	GameRegistry.registerItem(AluminaDust, "AluminaDust");
    	GameRegistry.registerItem(CopperIngot, "CopperIngot");
    	GameRegistry.registerItem(TinIngot, "TinIngot");
    	GameRegistry.registerItem(LeadIngot, "LeadIngot");
    	GameRegistry.registerItem(SilverIngot, "SilverIngot");
    	GameRegistry.registerItem(AluminumIngot, "AluminumIngot");
    	GameRegistry.registerItem(SteelIngot, "SteelIngot");
    	
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
