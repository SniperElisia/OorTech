package teamoort.redoxiation.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;
import teamoort.redoxiation.Redoxiation;

public class ItemSlagBucket extends ItemBucket {
    public ItemSlagBucket(Block block) {
        super(block);
        this.setCreativeTab(Redoxiation.tabRedoxiationitems);
    }
}
