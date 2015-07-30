package teamoort.redoxiation.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBucket;
import teamoort.redoxiation.Redoxiation;

public class RedoxiationBucket extends ItemBucket {

	public RedoxiationBucket(Block block) {
		super(block);
		this.setCreativeTab(Redoxiation.tabRedoxiationitems);
	}
}
