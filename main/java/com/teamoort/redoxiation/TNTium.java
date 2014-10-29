package com.teamoort.redoxiation;

import java.util.Random;

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
		
		
        if (!world.isRemote)
        {
        
            	EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), null);
            	entitytntprimed.fuse = world.rand.nextInt(entitytntprimed.fuse / 4) + entitytntprimed.fuse / 8;
            	world.spawnEntityInWorld(entitytntprimed);
                        

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