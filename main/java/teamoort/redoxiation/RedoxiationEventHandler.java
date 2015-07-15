package teamoort.redoxiation;

import java.util.Random;
import teamoort.redoxiation.blocks.RedoxiationBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class RedoxiationEventHandler implements IWorldGenerator
{

	public static boolean FerronickelOregen, PseudoBronzeOregen, PseudoBrassOregen, ArgentAurumOregen, PseudoSolderOregen, PseudoStelliteOregen, TNTiumOregen;
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
		IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{

		switch(world.provider.dimensionId)
		{
		
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
			
		}
		
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		
		if(FerronickelOregen){
		(new WorldGenMinable(RedoxiationBlocks.FerronickelOre, 0, 15, Blocks.netherrack)).generate(world, random, x + random.nextInt(16), 10 + random.nextInt(128), z + random.nextInt(16));
		addOreSpawn(RedoxiationBlocks.FerronickelOre, 0, Blocks.netherrack, world, random, x, z, 16, 16, 1 + random.nextInt(7), 60, 1, 255);
		}
		
		if(PseudoBronzeOregen){
		(new WorldGenMinable(RedoxiationBlocks.PseudoBronzeOre, 0, 15, Blocks.netherrack)).generate(world, random, x + random.nextInt(16), 10 + random.nextInt(128), z + random.nextInt(16));
		addOreSpawn(RedoxiationBlocks.PseudoBronzeOre, 0, Blocks.netherrack, world, random, x, z, 16, 16, 1 + random.nextInt(7), 60, 1, 255);
		}
		
		if(PseudoBrassOregen){
		(new WorldGenMinable(RedoxiationBlocks.PseudoBrassOre, 0, 15, Blocks.netherrack)).generate(world, random, x + random.nextInt(16), 10 + random.nextInt(128), z + random.nextInt(16));
		addOreSpawn(RedoxiationBlocks.PseudoBrassOre, 0, Blocks.netherrack, world, random, x, z, 16, 16, 1 + random.nextInt(7), 60, 1, 255);
		}
		
		if(ArgentAurumOregen){
		(new WorldGenMinable(RedoxiationBlocks.ArgentAurum, 0, 15, Blocks.netherrack)).generate(world, random, x + random.nextInt(16), 10 + random.nextInt(128), z + random.nextInt(16));
		addOreSpawn(RedoxiationBlocks.ArgentAurum, 0, Blocks.netherrack, world, random, x, z, 16, 16, 1 + random.nextInt(7),60, 1, 255);
		}
		
		if(PseudoSolderOregen){
		(new WorldGenMinable(RedoxiationBlocks.PseudoSolder, 0, 15, Blocks.netherrack)).generate(world, random, x + random.nextInt(16), 10 + random.nextInt(128), z + random.nextInt(16));
		addOreSpawn(RedoxiationBlocks.PseudoSolder, 0, Blocks.netherrack, world, random, x, z, 16, 16, 1 + random.nextInt(7), 60, 1, 255);
		}
		
		if(PseudoStelliteOregen){
		(new WorldGenMinable(RedoxiationBlocks.PseudoStellite, 0, 15, Blocks.netherrack)).generate(world, random, x + random.nextInt(16), 10 + random.nextInt(128), z + random.nextInt(16));
		addOreSpawn(RedoxiationBlocks.PseudoStellite, 0, Blocks.netherrack, world, random, x, z, 16, 16, 1 + random.nextInt(7), 60, 1, 255);
		}
		
		if(TNTiumOregen){
		(new WorldGenMinable(RedoxiationBlocks.TNTium, 0, 15, Blocks.netherrack)).generate(world, random, x + random.nextInt(16), 10 + random.nextInt(128), z + random.nextInt(16));
		addOreSpawn(RedoxiationBlocks.TNTium, 0, Blocks.netherrack, world, random, x, z, 16, 16, 1, 30, 1, 255);
		}
	}

	private void generateSurface(World world, Random random, int x, int z)
	{
	
		addOreSpawn(RedoxiationBlocks.CopperOre, 0, Blocks.stone, world, random, x, z, 16, 16, 3 + random.nextInt(4), 12, 30, 70);
		addOreSpawn(RedoxiationBlocks.TinOre, 0, Blocks.stone, world, random, x, z, 16, 16, 3 + random.nextInt(4), 12, 10, 60);
		addOreSpawn(RedoxiationBlocks.LeadOre, 0, Blocks.stone, world, random, x, z, 16, 16, 3 + random.nextInt(4), 12, 10, 60);
		addOreSpawn(RedoxiationBlocks.SilverOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(3), 12, 7, 50);
		addOreSpawn(RedoxiationBlocks.PlatinumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 1 + random.nextInt(1), 5, 5, 37);
		addOreSpawn(RedoxiationBlocks.NickelOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(2), 10, 12, 46);
		addOreSpawn(RedoxiationBlocks.CobaltOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(4), 10, 5, 52);
		addOreSpawn(RedoxiationBlocks.ChromiumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(4), 10, 5, 52);
		addOreSpawn(RedoxiationBlocks.ZincOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(4), 10, 15, 60);
		addOreSpawn(RedoxiationBlocks.Pitchblend, 0, Blocks.stone, world, random, x, z, 16, 16, 1 + random.nextInt(2), 5, 3, 40);
		addOreSpawn(RedoxiationBlocks.Limestone, 0, Blocks.stone, world, random, x, z, 16, 16, 16 + random.nextInt(10), 16, 30, 125);
		addOreSpawn(RedoxiationBlocks.SaltRock, 0, Blocks.stone, world, random, x, z, 16, 16, 1 + random.nextInt(2), 12, 30, 125);
		addOreSpawn(RedoxiationBlocks.SaltRock, 0, Blocks.dirt, world, random, x, z, 16, 16, 1 + random.nextInt(2), 12, 30, 125);
		addOreSpawn(RedoxiationBlocks.SaltRock, 0, Blocks.water, world, random, x, z, 16, 16, 1 + random.nextInt(2), 12, 30, 125);
		addOreSpawn(RedoxiationBlocks.Bauxite, 0, Blocks.stone, world, random, x, z, 16, 16, 15 + random.nextInt(10), 16, 30, 100);
		addOreSpawn(RedoxiationBlocks.Rutile, 0, Blocks.stone, world, random, x, z, 16, 16, 13 + random.nextInt(9), 16, 20, 90);
		addOreSpawn(RedoxiationBlocks.Scheelite, 0, Blocks.stone, world, random, x, z, 16, 16, 10 + random.nextInt(8), 16, 10, 80);
		addOreSpawn(RedoxiationBlocks.Cryolite, 0, Blocks.stone, world, random, x, z, 16, 16, 10 + random.nextInt(5), 16, 30, 70);
		addOreSpawn(RedoxiationBlocks.SulfurOre, 0, Blocks.lava, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 3, 125);
	}


	private void generateEnd(World world, Random random, int x, int z) 
	{
		int Xcoord = x + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(128);
		int Zcoord = z + random.nextInt(16);
		
		(new WorldGenMinable(RedoxiationBlocks.IronObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.GoldObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.CopperObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.TinObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.LeadObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.SilverObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.PlatinumObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.NickelObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.ZincObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.CobaltObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.ChromiumObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.UraniumObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
		(new WorldGenMinable(RedoxiationBlocks.PlutoniumObsidian, 0, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);

		addOreSpawn(RedoxiationBlocks.IronObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 20, 100);
		addOreSpawn(RedoxiationBlocks.GoldObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.CopperObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.TinObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.LeadObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.SilverObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.PlatinumObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(3), 5, 1, 100);
		addOreSpawn(RedoxiationBlocks.NickelObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.ZincObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.CobaltObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.ChromiumObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 1, 100);
		addOreSpawn(RedoxiationBlocks.UraniumObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(2), 3, 1, 100);
		addOreSpawn(RedoxiationBlocks.PlutoniumObsidian, 0, Blocks.end_stone, world, random, x, z, 16, 16, 1 + random.nextInt(2), 3, 1, 100);
		
	}
	
	
	private void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
	 
		int diffBtwnMinMaxY = maxY - minY;
		
		for(int x = 0; x < chancesToSpawn; x++)
		{
			
		int posX = blockXPos + random.nextInt(maxX);
		int posY = minY + random.nextInt(diffBtwnMinMaxY);
		int posZ = blockZPos + random.nextInt(maxZ);
		
		(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		
		}
		
	}
	
}
