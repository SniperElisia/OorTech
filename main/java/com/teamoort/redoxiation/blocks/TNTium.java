package com.teamoort.redoxiation.blocks;

import java.util.Random;

import com.teamoort.redoxiation.Redoxiation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class TNTium extends Block {

	String name = "TNTium";
	
	public TNTium() {
		super(Material.rock);
		setBlockName(Redoxiation.MODID + "_" + name);
		setBlockTextureName(Redoxiation.MODID + ":" + name);
		setCreativeTab(Redoxiation.tabRedoxiation);
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setResistance(15.0F);
		
	}


	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta)
	{
		Random random = new Random();
		if(random.nextInt(4)>=3)
		{
			world.createExplosion(null, x, y, z, 2, true);
		}
        
	}

    public Item getItemDropped(int meta, Random rand, int fortune)
    {
        return Items.gunpowder;
    }
    
    public int quantityDropped(Random rand)
    {
        return 1 + rand.nextInt(2);
    }

	
}