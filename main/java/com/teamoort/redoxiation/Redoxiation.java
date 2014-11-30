package com.teamoort.redoxiation;

import com.teamoort.redoxiation.blocks.ArgentAurum;
import com.teamoort.redoxiation.blocks.Bauxite;
import com.teamoort.redoxiation.blocks.BlockHotAir;
import com.teamoort.redoxiation.blocks.BlockMoltenPigiron;
import com.teamoort.redoxiation.blocks.ChromiumObsidian;
import com.teamoort.redoxiation.blocks.ChromiumOre;
import com.teamoort.redoxiation.blocks.CobaltObsidian;
import com.teamoort.redoxiation.blocks.CobaltOre;
import com.teamoort.redoxiation.blocks.CopperObsidian;
import com.teamoort.redoxiation.blocks.CopperOre;
import com.teamoort.redoxiation.blocks.Cryolite;
import com.teamoort.redoxiation.blocks.FerronickelOre;
import com.teamoort.redoxiation.blocks.GoldObsidian;
import com.teamoort.redoxiation.blocks.IronObsidian;
import com.teamoort.redoxiation.blocks.LeadObsidian;
import com.teamoort.redoxiation.blocks.LeadOre;
import com.teamoort.redoxiation.blocks.Limestone;
import com.teamoort.redoxiation.blocks.NickelObsidian;
import com.teamoort.redoxiation.blocks.NickelOre;
import com.teamoort.redoxiation.blocks.Pitchblend;
import com.teamoort.redoxiation.blocks.PlatinumObsidian;
import com.teamoort.redoxiation.blocks.PlatinumOre;
import com.teamoort.redoxiation.blocks.PlutoniumObsidian;
import com.teamoort.redoxiation.blocks.PlutoniumOre;
import com.teamoort.redoxiation.blocks.PseudoBrassOre;
import com.teamoort.redoxiation.blocks.PseudoBronzeOre;
import com.teamoort.redoxiation.blocks.PseudoSolder;
import com.teamoort.redoxiation.blocks.PseudoStellite;
import com.teamoort.redoxiation.blocks.RedoxiationBlocks;
import com.teamoort.redoxiation.blocks.Rutile;
import com.teamoort.redoxiation.blocks.SaltRock;
import com.teamoort.redoxiation.blocks.Scheelite;
import com.teamoort.redoxiation.blocks.SilverObsidian;
import com.teamoort.redoxiation.blocks.SilverOre;
import com.teamoort.redoxiation.blocks.SulfurOre;
import com.teamoort.redoxiation.blocks.TNTium;
import com.teamoort.redoxiation.blocks.TinObsidian;
import com.teamoort.redoxiation.blocks.TinOre;
import com.teamoort.redoxiation.blocks.UraniumObsidian;
import com.teamoort.redoxiation.blocks.ZincObsidian;
import com.teamoort.redoxiation.blocks.ZincOre;
import com.teamoort.redoxiation.items.RedoxiationGenericItems;

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

@Mod(modid = Redoxiation.MODID, version = Redoxiation.VERSION)
public class Redoxiation
{
    public static final String MODID = "Redoxiation";
    public static final String VERSION = "Alpha 0.0.0.002";
    
    public static final CreativeTabs tabRedoxiation = new CreativeTabs("Redoxiation")
    {
        private static final String __OBFID = "CL_00000080";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(RedoxiationBlocks.CopperOre);
        }
    };
    
    public static final CreativeTabs tabRedoxiationitems = new CreativeTabs("Redoxiation Items")
    {
    	private static final String __OBFID = "CL_00000081";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
        	return RedoxiationGenericItems.Calcite;
        }
    };
    
    @Metadata
    public ModMetadata meta;
    
    RedoxiationEventHandler handler = new RedoxiationEventHandler();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	RedoxiationGenericItems.registerItems();
    	RedoxiationBlocks.registerBlocks();
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    }
}
