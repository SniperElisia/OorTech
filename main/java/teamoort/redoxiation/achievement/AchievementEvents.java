package teamoort.redoxiation.achievement;

import teamoort.redoxiation.items.RedoxiationGenericItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.toposort.TopologicalSort;

public class AchievementEvents {
	@SubscribeEvent
	public void entitySlain (LivingDeathEvent event)
	{
		if(event.source != null && event.source.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer murderer = (EntityPlayer) event.source.getEntity();
			
			if(murderer.getHeldItem().getItem() != null)
			{
				RedoxiationAchievements.triggerAchievement(murderer, "START:DASH");
			}
		}
	}
}
