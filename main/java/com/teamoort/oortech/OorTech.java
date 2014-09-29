package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = OorTech.MODID, version = OorTech.VERSION)
public class OorTech
{
    public static final String MODID = "OorTech";
    public static final String VERSION = "Alpha 0.0.0.001";
    
    @Metadata
    public ModMetadata meta;
    
    public static Block CopperOre,Limestone,TinOre;
    
    int CopperOreID = 1000;
    int LimestoneID = 1001;
    int TinOreID = 1002;
    
    public static Item Calcite;
    
    int CalciteID = 10000;
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	CopperOre = new CopperOre(CopperOreID, Material.rock).setHardness(2.5F).setResistance(5.0F).setBlockName("CopperOre");
    	TinOre = new TinOre(TinOreID, Material.rock).setHardness(2.5F).setResistance(5.0F).setBlockName("TinOre");
    	Limestone = new Limestone(LimestoneID, Material.rock).setHardness(2.0F).setResistance(10.0F).setBlockName("Limestone");
    	Calcite = new Calcite(CalciteID).setUnlocalizedName("Calcite");
    	
    	GameRegistry.registerBlock(CopperOre, "CopperOre");
    	GameRegistry.registerBlock(Limestone, "Limestone");
    	GameRegistry.registerBlock(TinOre, "TinOre");
    	GameRegistry.registerItem(Calcite, "Calcite");
    	
    	OreDictionary.registerOre("oreCopper", OorTech.CopperOre);
    	OreDictionary.registerOre("oreTin", OorTech.TinOre);
    }
}
