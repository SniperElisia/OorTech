package teamoort.redoxiation;


import teamoort.redoxiation.blocks.RedoxiationBlocks;
import teamoort.redoxiation.items.RedoxiationGenericItems;
import teamoort.redoxiation.proxy.CommonProxy;
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
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Redoxiation.MODID, version = Redoxiation.VERSION)
public class Redoxiation
{
	@Instance(Redoxiation.MODID)
	public static Redoxiation instance;
	
	@SidedProxy(clientSide = "teamoort.redoxiation.proxy.ClientProxy", serverSide = "teamoort.redoxiation.proxy.CommonProxy")
	public static CommonProxy proxy;
	
    public static final String MODID = "redoxiation";
    public static final String VERSION = "Alpha 0.0.0.003";
    
    public static final CreativeTabs tabRedoxiation = new CreativeTabs("Redoxiation")
    {
        private static final String __OBFID = "CL_00000080";
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(RedoxiationBlocks.CopperOre);
        }
    };
    
    public static final CreativeTabs tabRedoxiationitems = new CreativeTabs("RedoxiationItems")
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
    	proxy.registerTileEntitySpecialRenderer();
    	RedoxiationRecipeManager.recipeFurance();
    	RedoxiationRecipeManager.recipeCrafting();
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    }
}
