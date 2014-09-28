package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
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
    public static final String VERSION = "0.0.1";
    
    @Metadata
    public ModMetadata meta;
    
    public static Block CopperOre;
    
    int CopperOreID = 1000;
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	CopperOre = new CopperOre(CopperOreID, Material.rock).setHardness(1.5f).setBlockName("CopperOre");
    	
    	GameRegistry.registerBlock(CopperOre, "CopperOre");
    }
}
