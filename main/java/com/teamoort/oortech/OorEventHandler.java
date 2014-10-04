package com.teamoort.oortech;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OorEventHandler implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{

		switch(world.provider.dimensionId)
		{
		
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			
			
		}
		
	}

	private void generateNether(World world, Random random, int x, int z) 
	{
		
		
		
	}

	private void generateSurface(World world, Random random, int x, int z)
	{
	
		this.addOreSpawn(OorTech.CopperOre, 0, Blocks.stone, world, random, x, z, 16, 16, 3 + random.nextInt(4), 12, 30, 70);
		this.addOreSpawn(OorTech.TinOre, 0, Blocks.stone, world, random, x, z, 16, 16, 3 + random.nextInt(4), 12, 10, 60);
		this.addOreSpawn(OorTech.LeadOre, 0, Blocks.stone, world, random, x, z, 16, 16, 3 + random.nextInt(4), 12, 10, 60);
		this.addOreSpawn(OorTech.SilverOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(3), 12, 7, 50);
		this.addOreSpawn(OorTech.PlatinumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 1 + random.nextInt(1), 5, 5, 37);
		this.addOreSpawn(OorTech.NickelOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(2), 10, 12, 46);
		this.addOreSpawn(OorTech.CobaltOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(4), 10, 5, 52);
		this.addOreSpawn(OorTech.ChromiumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(4), 10, 5, 52);
		this.addOreSpawn(OorTech.ZincOre, 0, Blocks.stone, world, random, x, z, 16, 16, 2 + random.nextInt(4), 10, 15, 60);
		this.addOreSpawn(OorTech.UraniumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 1, 5, 3, 40);
		this.addOreSpawn(OorTech.PlutoniumOre, 0, Blocks.stone, world, random, x, z, 16, 16, 1, 5, 3, 40);
		this.addOreSpawn(OorTech.Limestone, 0, Blocks.stone, world, random, x, z, 16, 16, 16 + random.nextInt(10), 16, 30, 125);
		this.addOreSpawn(OorTech.SaltRock, 0, Blocks.stone, world, random, x, z, 16, 16, 1 + random.nextInt(2), 12, 30, 125);
		this.addOreSpawn(OorTech.SaltRock, 0, Blocks.dirt, world, random, x, z, 16, 16, 1 + random.nextInt(2), 12, 30, 125);
		this.addOreSpawn(OorTech.SaltRock, 0, Blocks.water, world, random, x, z, 16, 16, 1 + random.nextInt(2), 12, 30, 125);
		this.addOreSpawn(OorTech.Bauxite, 0, Blocks.stone, world, random, x, z, 16, 16, 15 + random.nextInt(10), 16, 30, 100);
		this.addOreSpawn(OorTech.Rutile, 0, Blocks.stone, world, random, x, z, 16, 16, 13 + random.nextInt(9), 16, 20, 90);
		this.addOreSpawn(OorTech.Scheelite, 0, Blocks.stone, world, random, x, z, 16, 16, 10 + random.nextInt(8), 16, 10, 80);
		this.addOreSpawn(OorTech.Cryolite, 0, Blocks.stone, world, random, x, z, 16, 16, 10 + random.nextInt(5), 16, 30, 70);
		this.addOreSpawn(OorTech.SulfurOre, 0, Blocks.lava, world, random, x, z, 16, 16, 1 + random.nextInt(5), 16, 3, 125);
		
	}


	private void generateEnd(World world, Random random, int i, int j) 
	{

		

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
