package teamoort.redoxiation;

import org.apache.logging.log4j.core.Logger;

import cpw.mods.fml.common.network.NetworkRegistry;
import teamoort.redoxiation.achievement.AchievementEvents;
import teamoort.redoxiation.achievement.RedoxiationAchievements;
import teamoort.redoxiation.blocks.RedoxiationBlocks;
import teamoort.redoxiation.blocks.gui.GuiHandler;
import teamoort.redoxiation.items.RedoxiationGenericItems;
import teamoort.redoxiation.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
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
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Redoxiation.MODID, version = Redoxiation.VERSION, name = Redoxiation.NAME)
public class Redoxiation {
	@Instance(Redoxiation.MODID)
	public static Redoxiation instance;

	@SidedProxy(clientSide = "teamoort.redoxiation.proxy.ClientProxy", serverSide = "teamoort.redoxiation.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static final String MODID = "redoxiation";
	public static final String VERSION = "Alpha 0.04";
	public static final String NAME = "Redoxiation";

	public static boolean dummybool;
	public static int oredif;
	public static Configuration config;

	public static final CreativeTabs tabRedoxiation = new CreativeTabs("Redoxiation") {
		private static final String __OBFID = "CL_00000080";

		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(RedoxiationBlocks.CopperOre);
		}
	};

	public static final CreativeTabs tabRedoxiationitems = new CreativeTabs("RedoxiationItems") {
		private static final String __OBFID = "CL_00000081";

		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return RedoxiationGenericItems.Calcite;
		}
	};

	@Metadata
	public ModMetadata meta;

	RedoxiationEventHandler handler = new RedoxiationEventHandler();

	public static org.apache.logging.log4j.Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		logger.info("Hello World!");
		
		// Simple Config
		config = new Configuration(event.getSuggestedConfigurationFile());
		RedoxiationConfigHandler.InitConfig();
		
		// Config end
		RedoxiationBlocks.registerBlocks();
		RedoxiationGenericItems.registerItems();
		proxy.registerTileEntitySpecialRenderer();
		
		if (dummybool) {
			RedoxiationRecipeManager.recipeFurnace();
			RedoxiationRecipeManager.recipeCrafting();
		}
		if (RedoxiationAchievements.isachivenable) {
			RedoxiationAchievements.addDefaultAchievements();
		}
		
		GameRegistry.registerWorldGenerator(handler, 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(Redoxiation.instance, GuiHandlerRegistry.getInstance());
		GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandler(), GuiHandler.getGuiID());

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		if (RedoxiationAchievements.isachivenable) {
			RedoxiationAchievements.registerAchievementPane();
			MinecraftForge.EVENT_BUS.register(new AchievementEvents());
			logger.info("ACHIVLOADED");
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
	}
}
