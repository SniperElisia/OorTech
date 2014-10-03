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
    
    public static Block CopperOre, Limestone, TinOre, LeadOre, SilverOre, Bauxite;
    
    //Items
    
    public static Item Calcite, RawBauxite, AluminaDust, CopperIngot, TinIngot, LeadIngot, SilverIngot, AluminumIngot, SteelIngot;

    //IDs
    
    int CopperOreID = 1000;
    int LimestoneID = 1001;
    int TinOreID = 1002;
    int LeadOreID = 1003;
    int SilverOreID = 1004;
    int BauxiteID = 1005;
    int CalciteID = 10000;
    int RawBauxiteID = 10001;
    int AluminaDustID = 10002;
    int CopperIngotID = 10003;
    int TinIngotID = 10004;
    int LeadIngotID = 10005;
    int SilverIngotID = 10006;
    int AluminumIngotID = 10007;
    int SteelIngotID = 10008;
    
    
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
