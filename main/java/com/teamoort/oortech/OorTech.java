package com.teamoort.oortech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.BlockFluidClassic;
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
    
    public static Block CopperOre,Limestone,TinOre;
    public static Item Calcite;

    int CopperOreID = 1000;
    int LimestoneID = 1001;
    int TinOreID = 1002;
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
    	OreDictionary.registerOre("Limestone", OorTech.Limestone);
    	OreDictionary.registerOre("Calcite", OorTech.Calcite);

    }
}
