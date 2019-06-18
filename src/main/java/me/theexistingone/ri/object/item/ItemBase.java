package me.theexistingone.ri.object.item;

import me.theexistingone.ri.RealityItself;
import me.theexistingone.ri.init.ItemInit;
import me.theexistingone.ri.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		RealityItself.proxy.registerItemRenderer(this, 0, "inventory")
	}

}
