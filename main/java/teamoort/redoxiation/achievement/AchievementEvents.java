package teamoort.redoxiation.achievement;

import teamoort.redoxiation.blocks.RedoxiationBlocks;
import teamoort.redoxiation.blocks.RedoxiationOre;
import teamoort.redoxiation.items.RedoxiationGenericItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class AchievementEvents {
	@SubscribeEvent
	public void entitySlain(LivingDeathEvent event) {
		/*if(event.source != null && event.source.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer murderer = (EntityPlayer) event.source.getEntity();
			
			if(murderer.getHeldItem().getItem() != null)
			{
				RedoxiationAchievements.triggerAchievement(murderer, "redoxiation.start");
			}
		}*/
	}
	
	@SubscribeEvent
	public void onBlockHarvest(HarvestDropsEvent event) {
		if (event.harvester instanceof EntityPlayer) {
			EntityPlayer miner = event.harvester;

			if (event.block == RedoxiationBlocks.oreCopper) {
				RedoxiationAchievements.triggerAchievement(miner, "redoxiation.start");
			}
		}
	}
}
