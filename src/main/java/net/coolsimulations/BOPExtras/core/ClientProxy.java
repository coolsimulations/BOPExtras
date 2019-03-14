package net.coolsimulations.BOPExtras.core;

import net.coolsimulations.BOPExtras.api.block.BOPExtrasBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;

public class ClientProxy extends CommonProxy {
	
	public ClientProxy() {
		
	}
	
	@Override
    public void init()
    {
		BlockColors blockColors = Minecraft.getInstance().getBlockColors();
        ItemColors itemColors = Minecraft.getInstance().getItemColors();
        
      //Foliage Coloring
        blockColors.register((state, world, pos, tintIndex) ->
	        world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefault(),
	        BOPExtrasBlocks.ebony_leaves, BOPExtrasBlocks.eucalyptus_leaves, BOPExtrasBlocks.mangrove_leaves,
	        BOPExtrasBlocks.pine_leaves, BOPExtrasBlocks.sacred_oak_leaves);
        
        //Item Coloring
        itemColors.register((stack, tintIndex) -> {
            IBlockState iblockstate = ((ItemBlock)stack.getItem()).getBlock().getDefaultState();
            return blockColors.getColor(iblockstate, null, null, tintIndex); }, 
        	BOPExtrasBlocks.ebony_leaves, BOPExtrasBlocks.eucalyptus_leaves, BOPExtrasBlocks.mangrove_leaves,
        	BOPExtrasBlocks.pine_leaves, BOPExtrasBlocks.sacred_oak_leaves);
    }

}
