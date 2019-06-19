package me.theexistingone.ri.init;

import java.util.ArrayList;
import java.util.List;

import me.theexistingone.ri.object.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_PURE_QUARTZ = new BlockBase("ore_pure_quartz", Material.ROCK);
	
}
