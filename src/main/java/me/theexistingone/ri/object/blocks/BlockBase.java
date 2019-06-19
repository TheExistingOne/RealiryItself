package me.theexistingone.ri.object.blocks;

import me.theexistingone.ri.RealityItself;
import me.theexistingone.ri.init.BlockInit;
import me.theexistingone.ri.init.ItemInit;
import me.theexistingone.ri.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material mat) {
		super(mat);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		RealityItself.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");		
	}

}
