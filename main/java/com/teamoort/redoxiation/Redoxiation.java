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
            return Item.getItemFromBlock(Redoxiation.CopperOre);
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
    
    //Blocks
    
    public static Block CopperOre, TinOre, LeadOre, SilverOre, NickelOre, PlatinumOre, ZincOre, CobaltOre, ChromiumOre, Pitchblend, PlutoniumOre, Limestone, SaltRock, Bauxite, Rutile, Scheelite, Cryolite, SulfurOre, FerronickelOre, PseudoBronzeOre, PseudoBrassOre, ArgentAurum, PseudoSolder, PseudoStellite, TNTium, IronObsidian, GoldObsidian, CopperObsidian, TinObsidian, LeadObsidian, SilverObsidian, NickelObsidian, PlatinumObsidian, ZincObsidian, CobaltObsidian, ChromiumObsidian, UraniumObsidian, PlutoniumObsidian;
    
    //fluids

    public static Fluid HotAir, MoltenPigiron;
    public static BlockFluidClassic HotAirBlock, MoltenPigironBlock;
    
    RedoxiationEventHandler handler = new RedoxiationEventHandler();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	RedoxiationGenericItems.registerItems();
    	
    	//Blocks
    	
    	CopperOre = new CopperOre();
    	TinOre = new TinOre();
    	LeadOre = new LeadOre();
    	SilverOre = new SilverOre();
    	NickelOre = new NickelOre();
    	PlatinumOre = new PlatinumOre();
    	ZincOre = new ZincOre();
    	CobaltOre = new CobaltOre();
    	ChromiumOre = new ChromiumOre();
    	Pitchblend = new Pitchblend();
    	PlutoniumOre = new PlutoniumOre();
    	Limestone = new Limestone();
    	SaltRock = new SaltRock();
    	Bauxite = new Bauxite();
    	Rutile = new Rutile();
    	Scheelite = new Scheelite();
    	Cryolite = new Cryolite();
    	SulfurOre = new SulfurOre();
    	FerronickelOre = new FerronickelOre();
    	PseudoBronzeOre = new PseudoBronzeOre();
    	PseudoBrassOre = new PseudoBrassOre();
    	ArgentAurum = new ArgentAurum();
    	PseudoSolder = new PseudoSolder();
    	PseudoStellite = new PseudoStellite();
    	TNTium = new TNTium();
    	IronObsidian = new IronObsidian();
    	GoldObsidian = new GoldObsidian();
    	CopperObsidian = new CopperObsidian();
    	TinObsidian = new TinObsidian();
    	LeadObsidian = new LeadObsidian();
    	SilverObsidian = new SilverObsidian();
    	NickelObsidian = new NickelObsidian();
    	PlatinumObsidian = new PlatinumObsidian();
    	ZincObsidian = new ZincObsidian();
    	CobaltObsidian = new CobaltObsidian();
    	ChromiumObsidian = new ChromiumObsidian();
    	UraniumObsidian = new UraniumObsidian();
    	PlutoniumObsidian = new PlutoniumObsidian();
    	
    	//Registry
    	
    	GameRegistry.registerBlock(CopperOre, "CopperOre");
    	GameRegistry.registerBlock(TinOre, "TinOre");
    	GameRegistry.registerBlock(LeadOre, "LeadOre");
    	GameRegistry.registerBlock(SilverOre, "SilverOre");
    	GameRegistry.registerBlock(NickelOre, "NickelOre");
    	GameRegistry.registerBlock(PlatinumOre, "PlatinumOre");
    	GameRegistry.registerBlock(ZincOre, "ZincOre");
    	GameRegistry.registerBlock(CobaltOre, "CobaltOre");
    	GameRegistry.registerBlock(ChromiumOre, "ChromiumOre");
    	GameRegistry.registerBlock(Pitchblend, "Pitchblend"); 
    	GameRegistry.registerBlock(PlutoniumOre, "PlutoniumOre");   	
    	GameRegistry.registerBlock(Limestone, "Limestone");
    	GameRegistry.registerBlock(SaltRock, "SaltRock");
    	GameRegistry.registerBlock(Bauxite, "Bauxite");
    	GameRegistry.registerBlock(Rutile, "Rutile");
    	GameRegistry.registerBlock(Scheelite, "Scheelite");
    	GameRegistry.registerBlock(Cryolite, "Cryolite");
    	GameRegistry.registerBlock(SulfurOre, "SulfurOre");
    	GameRegistry.registerBlock(FerronickelOre, "FerronickelOre");
    	GameRegistry.registerBlock(PseudoBronzeOre, "PseudoBronzeOre");
    	GameRegistry.registerBlock(PseudoBrassOre, "PseudoBrassOre");
    	GameRegistry.registerBlock(ArgentAurum, "ArgentAurum");
    	GameRegistry.registerBlock(PseudoSolder, "PseudoSolder");
    	GameRegistry.registerBlock(PseudoStellite, "PseudoStellite");
    	GameRegistry.registerBlock(TNTium, "TNTium");
    	GameRegistry.registerBlock(IronObsidian, "IronObsidian");
    	GameRegistry.registerBlock(GoldObsidian, "GoldObsidian");
    	GameRegistry.registerBlock(CopperObsidian, "CopperObsidian");
    	GameRegistry.registerBlock(TinObsidian, "TinObsidian");
    	GameRegistry.registerBlock(LeadObsidian, "LeadObsidian");
    	GameRegistry.registerBlock(SilverObsidian, "SilverObsidian");
    	GameRegistry.registerBlock(NickelObsidian, "NickelObsidian");
    	GameRegistry.registerBlock(PlatinumObsidian, "PlatinumObsidian");
    	GameRegistry.registerBlock(ZincObsidian, "ZincObsidian");
    	GameRegistry.registerBlock(CobaltObsidian, "CobaltObsidian");
    	GameRegistry.registerBlock(ChromiumObsidian, "ChromiumObsidian");
    	GameRegistry.registerBlock(UraniumObsidian, "UraniumObsidian");
    	GameRegistry.registerBlock(PlutoniumObsidian, "PlutoniumObsidian");
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    	OreDictionary.registerOre("oreCopper", Redoxiation.CopperOre);
    	OreDictionary.registerOre("oreTin", Redoxiation.TinOre);
    	OreDictionary.registerOre("oreLead", Redoxiation.LeadOre);
   		OreDictionary.registerOre("oreSilver", Redoxiation.SilverOre);
    	OreDictionary.registerOre("oreNickel", Redoxiation.NickelOre);
  		OreDictionary.registerOre("orePlatinum", Redoxiation.PlatinumOre);
    	OreDictionary.registerOre("oreZinc", Redoxiation.ZincOre);
    	OreDictionary.registerOre("oreCobalt", Redoxiation.CobaltOre);
 		OreDictionary.registerOre("oreChromium", Redoxiation.ChromiumOre);
   		OreDictionary.registerOre("orePitchblend", Redoxiation.Pitchblend); 
    	OreDictionary.registerOre("orePlutonium", Redoxiation.PlutoniumOre);   	
   		OreDictionary.registerOre("blockLimestone", Redoxiation.Limestone);
    	OreDictionary.registerOre("blockSaltRock", Redoxiation.SaltRock);
    	OreDictionary.registerOre("blockBauxite", Redoxiation.Bauxite);
    	OreDictionary.registerOre("blockRutile", Redoxiation.Rutile);
    	OreDictionary.registerOre("blockScheelite", Redoxiation.Scheelite);
    	OreDictionary.registerOre("blockCryolite", Redoxiation.Cryolite);
    	OreDictionary.registerOre("oreSulfur", Redoxiation.SulfurOre);
    	OreDictionary.registerOre("blockFerronickel", Redoxiation.FerronickelOre);
    	OreDictionary.registerOre("blockPseudoBronze", Redoxiation.PseudoBronzeOre);
    	OreDictionary.registerOre("blockPseudoBrass", Redoxiation.PseudoBrassOre);
    	OreDictionary.registerOre("blockArgentAurum", Redoxiation.ArgentAurum);
    	OreDictionary.registerOre("blockPseudoSolder", Redoxiation.PseudoSolder);
    	OreDictionary.registerOre("blockPseudoStellite", Redoxiation.PseudoStellite);
    	OreDictionary.registerOre("blockTNTium", Redoxiation.TNTium);
    	OreDictionary.registerOre("oreIronObsidian", Redoxiation.IronObsidian);
    	OreDictionary.registerOre("oreGoldObsidian", Redoxiation.GoldObsidian);
    	OreDictionary.registerOre("oreCopperObsidian", Redoxiation.CopperObsidian);
    	OreDictionary.registerOre("oreTinObsidian", Redoxiation.TinObsidian);
    	OreDictionary.registerOre("oreLeadObsidian", Redoxiation.LeadObsidian);
    	OreDictionary.registerOre("oreSilverObsidian", Redoxiation.SilverObsidian);
    	OreDictionary.registerOre("oreNickelObsidian", Redoxiation.NickelObsidian);
    	OreDictionary.registerOre("orePlatinumObsidian", Redoxiation.PlatinumObsidian);
    	OreDictionary.registerOre("oreZincObsidian", Redoxiation.ZincObsidian);
    	OreDictionary.registerOre("oreCobaltObsidian", Redoxiation.CobaltObsidian);
    	OreDictionary.registerOre("oreChromiumObsidian", Redoxiation.ChromiumObsidian);
    	OreDictionary.registerOre("oreUraniumObsidian", Redoxiation.UraniumObsidian);
    	OreDictionary.registerOre("orePlutoniumObsidian", Redoxiation.PlutoniumObsidian);

    	
        //Fluids

        HotAir = new Fluid("HotAir").setLuminosity(0).setDensity(-10).setTemperature(1473).setViscosity(2000).setGaseous(true);
        MoltenPigiron = new Fluid("MoltenPigiron").setLuminosity(15).setDensity(7874).setTemperature(1900).setViscosity(2000).setGaseous(false);
        
        //Fluid Registry
        
        FluidRegistry.registerFluid(HotAir);
        FluidRegistry.registerFluid(MoltenPigiron);
        
        //Block Fluids
        
        HotAirBlock = (BlockFluidClassic) new BlockHotAir(HotAir, Material.lava).setBlockName("HotAir");
        MoltenPigironBlock = (BlockFluidClassic) new BlockMoltenPigiron(MoltenPigiron, Material.lava).setBlockName("MoltenPigiron");
        
        //Block Fluids Registry
        
        GameRegistry.registerBlock(HotAirBlock, "FluidHotAir");
        GameRegistry.registerBlock(MoltenPigironBlock, "FluidMoltenPigiron");
        HotAir.setUnlocalizedName(HotAirBlock.getUnlocalizedName());
        MoltenPigiron.setUnlocalizedName(MoltenPigironBlock.getUnlocalizedName());
    }
}
