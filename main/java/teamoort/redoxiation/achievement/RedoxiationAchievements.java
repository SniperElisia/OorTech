package teamoort.redoxiation.achievement;

import java.util.HashMap;

import teamoort.redoxiation.items.RedoxiationGenericItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class RedoxiationAchievements {
	public static boolean isachivenable;
	private static AchievementPage achievementsPage;
    private static HashMap<String, Achievement> achievementsList = new HashMap<String, Achievement>();
    
    public static void addAchivement (String name, Achievement achievement)
    {
    	if (!isachivenable)
    	{
    		return;
    	}
    	
    	achievementsList.put(name, achievement.registerStat());
    }
    
    public static Achievement getAchievement (String name)
    {
        return achievementsList.get(name);
    }
    
    public static void triggerAchievement (EntityPlayer player, String name)
    {
    	if(!isachivenable)
    	{
    		return;
    	}
    	
    	Achievement ach = getAchievement(name);
    	
    	if(ach != null)
    	{
    		player.triggerAchievement(ach);
    	}
    }
    
    public static void addDefaultAchievements()
    {
    	if(!isachivenable)
    	{
    		return;
    	}
    	addAchivement("START:DASH", new Achievement("STARTDASH", "STARTDASH", 2, 0, RedoxiationGenericItems.IngotCopper ,null));
    	
    }
    
    public static void registerAchievementPane()
    {
    	if(!isachivenable)
    	{
    		return;
    	}
    	
    	Achievement[] achievements = new Achievement[achievementsList.size()];
    	
    	achievements = achievementsList.values().toArray(achievements);
    	achievementsPage = new AchievementPage("Redoxiation", achievements);
    	AchievementPage.registerAchievementPage(achievementsPage);
    }
    
    
}
