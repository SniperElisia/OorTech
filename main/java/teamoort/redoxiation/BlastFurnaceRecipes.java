package teamoort.redoxiation;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BlastFurnaceRecipes {
public static final BlastFurnaceRecipes smeltingBase = new BlastFurnaceRecipes();
/** The list of smelting results. */
private Map smeltingList = new HashMap();
private Map experienceList = new HashMap();
private static final String __OBFID = "CL_00000085";

        /**
         * Used to call methods addSmelting and getSmeltingResult.
         */
        public static BlastFurnaceRecipes smelting()
        {
            return smeltingBase;
        }

        public BlastFurnaceRecipes()
        {
            this.BlockRecipes(Blocks.iron_ore, new ItemStack(Items.iron_ingot), 0.7F);
            this.BlockRecipes(Blocks.gold_ore, new ItemStack(Items.gold_ingot), 1.0F);
            this.BlockRecipes(Blocks.diamond_ore, new ItemStack(Items.diamond), 1.0F);
            this.BlockRecipes(Blocks.sand, new ItemStack(Blocks.glass), 0.1F);
            this.ItemRecipes(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.35F);
            this.ItemRecipes(Items.beef, new ItemStack(Items.cooked_beef), 0.35F);
            this.ItemRecipes(Items.chicken, new ItemStack(Items.cooked_chicken), 0.35F);
            this.BlockRecipes(Blocks.cobblestone, new ItemStack(Blocks.stone), 0.1F);
            this.ItemRecipes(Items.clay_ball, new ItemStack(Items.brick), 0.3F);
            this.BlockRecipes(Blocks.clay, new ItemStack(Blocks.hardened_clay), 0.35F);
            this.BlockRecipes(Blocks.cactus, new ItemStack(Items.dye, 1, 2), 0.2F);
            this.BlockRecipes(Blocks.log, new ItemStack(Items.coal, 1, 1), 0.15F);
            this.BlockRecipes(Blocks.log2, new ItemStack(Items.coal, 1, 1), 0.15F);
            this.BlockRecipes(Blocks.emerald_ore, new ItemStack(Items.emerald), 1.0F);
            this.ItemRecipes(Items.potato, new ItemStack(Items.baked_potato), 0.35F);
            this.BlockRecipes(Blocks.netherrack, new ItemStack(Items.netherbrick), 0.1F);
            this.BlockRecipes(Blocks.coal_ore, new ItemStack(Items.coal), 0.1F);
            this.BlockRecipes(Blocks.redstone_ore, new ItemStack(Items.redstone), 0.7F);
            this.BlockRecipes(Blocks.lapis_ore, new ItemStack(Items.dye, 1, 4), 0.2F);
            this.BlockRecipes(Blocks.quartz_ore, new ItemStack(Items.quartz), 0.2F);
        }

        public void BlockRecipes(Block block, ItemStack itemstack, float experience) {
            this.ItemRecipes(Item.getItemFromBlock(block), itemstack, experience);
        }

        public void ItemRecipes(Item item, ItemStack itemstack, float experience) {
            this.addRecipes(new ItemStack(item, 1, 32767), itemstack, experience);
        }

        public void addRecipes(ItemStack item, ItemStack itemstack, float experience)
        {
            this.smeltingList.put(item, itemstack);
            this.experienceList.put(itemstack, Float.valueOf(experience));
        }

        /**
         * Returns the smelting result of an item.
         */
        public ItemStack getSmeltingResult(ItemStack itemstack)
        {
            Iterator iterator = this.smeltingList.entrySet().iterator();
            Map.Entry entry;

            do
            {
                if (!iterator.hasNext())
                {
                    return null;
                }

                entry = (Map.Entry)iterator.next();
            }
            while (!this.func_151397_a(itemstack, (ItemStack)entry.getKey()));

            return (ItemStack)entry.getValue();
        }

        private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
        {
            return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
        }

        public Map getSmeltingList() {
            return this.smeltingList;
        }

        public float func_151398_b(ItemStack p_151398_1_)
        {
            float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
            if (ret != -1) return ret;

            Iterator iterator = this.experienceList.entrySet().iterator();
            Map.Entry entry;

            do
            {
                if (!iterator.hasNext())
                {
                    return 0.0F;
                }

                entry = (Map.Entry)iterator.next();
            }
            while (!this.func_151397_a(p_151398_1_, (ItemStack)entry.getKey()));

            return ((Float)entry.getValue()).floatValue();
        }
}
