package net.coolsimulations.BOPExtras.core;

import static net.coolsimulations.BOPExtras.api.block.BOPExtrasBlocks.*;

import biomesoplenty.common.block.BlockLeavesBOP;
import biomesoplenty.common.block.BlockPlantBOP;
import biomesoplenty.common.util.inventory.ItemGroupBOP;
import biomesoplenty.core.BiomesOPlenty;
import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.BlockButtonWood;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.ForgeRegistries;

public class ExtrasBlocks {
	
	
	public static void init() {
		
	ebony_sapling = registerBlock(new BlockPlantBOP(Block.Properties.create(Material.VINE).doesNotBlockMovement().sound(SoundType.PLANT)), "ebony_sapling");
    ebony_leaves = registerBlock(new BlockLeavesBOP(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).needsRandomTick().sound(SoundType.PLANT)), "ebony_leaves");
    ebony_log = registerBlock(new BlockLog(MaterialColor.STONE, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "ebony_log");
    ebony_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "ebony_wood");
    stripped_ebony_log = registerBlock(new BlockLog(MaterialColor.STONE, Block.Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_ebony_log");
    stripped_ebony_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_ebony_wood");
    ebony_planks = registerBlock(new Block(Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "ebony_planks");
    ebony_slab = registerBlock(new BlockSlab(Block.Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "ebony_slab");
    ebony_stairs = registerBlock(new BlockStairs(ebony_planks.getDefaultState(), Block.Properties.from(ebony_planks)), "ebony_stairs");
    ebony_fence = registerBlock(new BlockFence(Block.Properties.create(Material.WOOD, ebony_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "ebony_fence");
    ebony_fence_gate = registerBlock(new BlockFenceGate(Block.Properties.create(Material.WOOD, ebony_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "ebony_fence_gate");
    ebony_door = registerBlock(new BlockDoor(Block.Properties.create(Material.WOOD, ebony_planks.blockMapColor).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "ebony_door");
    ebony_trapdoor = registerBlock(new BlockTrapDoor(Block.Properties.create(Material.WOOD, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "ebony_trapdoor");
    ebony_pressure_plate = registerBlock(new BlockPressurePlate(BlockPressurePlate.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, ebony_planks.blockMapColor).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "ebony_pressure_plate");
    ebony_button = registerBlock(new BlockButtonWood(Block.Properties.create(Material.CIRCUITS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "ebony_button");
    
    eucalyptus_sapling = registerBlock(new BlockPlantBOP(Block.Properties.create(Material.VINE).doesNotBlockMovement().sound(SoundType.PLANT)), "eucalyptus_sapling");
    eucalyptus_leaves = registerBlock(new BlockLeavesBOP(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).needsRandomTick().sound(SoundType.PLANT)), "eucalyptus_leaves");
    eucalyptus_log = registerBlock(new BlockLog(MaterialColor.GREEN, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "eucalyptus_log");
    eucalyptus_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "eucalyptus_wood");
    stripped_eucalyptus_log = registerBlock(new BlockLog(MaterialColor.GREEN, Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_eucalyptus_log");
    stripped_eucalyptus_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_eucalyptus_wood");
    eucalyptus_planks = registerBlock(new Block(Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "eucalyptus_planks");
    eucalyptus_slab = registerBlock(new BlockSlab(Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "eucalyptus_slab");
    eucalyptus_stairs = registerBlock(new BlockStairs(eucalyptus_planks.getDefaultState(), Block.Properties.from(eucalyptus_planks)), "eucalyptus_stairs");
    eucalyptus_fence = registerBlock(new BlockFence(Block.Properties.create(Material.WOOD, eucalyptus_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "eucalyptus_fence");
    eucalyptus_fence_gate = registerBlock(new BlockFenceGate(Block.Properties.create(Material.WOOD, eucalyptus_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "eucalyptus_fence_gate");
    eucalyptus_door = registerBlock(new BlockDoor(Block.Properties.create(Material.WOOD, eucalyptus_planks.blockMapColor).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "eucalyptus_door");
    eucalyptus_trapdoor = registerBlock(new BlockTrapDoor(Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "eucalyptus_trapdoor");
    eucalyptus_pressure_plate = registerBlock(new BlockPressurePlate(BlockPressurePlate.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, eucalyptus_planks.blockMapColor).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "eucalyptus_pressure_plate");
    eucalyptus_button = registerBlock(new BlockButtonWood(Block.Properties.create(Material.CIRCUITS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "eucalyptus_button");
    
    mangrove_sapling = registerBlock(new BlockPlantBOP(Block.Properties.create(Material.VINE).doesNotBlockMovement().sound(SoundType.PLANT)), "mangrove_sapling");
    mangrove_leaves = registerBlock(new BlockLeavesBOP(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).needsRandomTick().sound(SoundType.PLANT)), "mangrove_leaves");
    mangrove_log = registerBlock(new BlockLog(MaterialColor.ADOBE, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "mangrove_log");
    mangrove_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "mangrove_wood");
    stripped_mangrove_log = registerBlock(new BlockLog(MaterialColor.ADOBE, Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_mangrove_log");
    stripped_mangrove_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_mangrove_wood");
    mangrove_planks = registerBlock(new Block(Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_planks");
    mangrove_slab = registerBlock(new BlockSlab(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_slab");
    mangrove_stairs = registerBlock(new BlockStairs(mangrove_planks.getDefaultState(), Block.Properties.from(mangrove_planks)), "mangrove_stairs");
    mangrove_fence = registerBlock(new BlockFence(Block.Properties.create(Material.WOOD, mangrove_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_fence");
    mangrove_fence_gate = registerBlock(new BlockFenceGate(Block.Properties.create(Material.WOOD, mangrove_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "mangrove_fence_gate");
    mangrove_door = registerBlock(new BlockDoor(Block.Properties.create(Material.WOOD, mangrove_planks.blockMapColor).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "mangrove_door");
    mangrove_trapdoor = registerBlock(new BlockTrapDoor(Block.Properties.create(Material.WOOD, MaterialColor.ADOBE).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "mangrove_trapdoor");
    mangrove_pressure_plate = registerBlock(new BlockPressurePlate(BlockPressurePlate.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, mangrove_planks.blockMapColor).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "mangrove_pressure_plate");
    mangrove_button = registerBlock(new BlockButtonWood(Block.Properties.create(Material.CIRCUITS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "mangrove_button");
    
    pine_sapling = registerBlock(new BlockPlantBOP(Block.Properties.create(Material.VINE).doesNotBlockMovement().sound(SoundType.PLANT)), "pine_sapling");
    pine_leaves = registerBlock(new BlockLeavesBOP(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).needsRandomTick().sound(SoundType.PLANT)), "pine_leaves");
    pine_log = registerBlock(new BlockLog(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "pine_log");
    pine_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "pine_wood");
    stripped_pine_log = registerBlock(new BlockLog(MaterialColor.BROWN, Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_pine_log");
    stripped_pine_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_pine_wood");
    pine_planks = registerBlock(new Block(Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "pine_planks");
    pine_slab = registerBlock(new BlockSlab(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "pine_slab");
    pine_stairs = registerBlock(new BlockStairs(pine_planks.getDefaultState(), Block.Properties.from(pine_planks)), "pine_stairs");
    pine_fence = registerBlock(new BlockFence(Block.Properties.create(Material.WOOD, pine_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "pine_fence");
    pine_fence_gate = registerBlock(new BlockFenceGate(Block.Properties.create(Material.WOOD, pine_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "pine_fence_gate");
    pine_door = registerBlock(new BlockDoor(Block.Properties.create(Material.WOOD, pine_planks.blockMapColor).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "pine_door");
    pine_trapdoor = registerBlock(new BlockTrapDoor(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "pine_trapdoor");
    pine_pressure_plate = registerBlock(new BlockPressurePlate(BlockPressurePlate.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, pine_planks.blockMapColor).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "pine_pressure_plate");
    pine_button = registerBlock(new BlockButtonWood(Block.Properties.create(Material.CIRCUITS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "pine_button");
    
    sacred_oak_sapling = registerBlock(new BlockPlantBOP(Block.Properties.create(Material.VINE).doesNotBlockMovement().sound(SoundType.PLANT)), "sacred_oak_sapling");
    sacred_oak_leaves = registerBlock(new BlockLeavesBOP(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).needsRandomTick().sound(SoundType.PLANT)), "sacred_oak_leaves");
    sacred_oak_log = registerBlock(new BlockLog(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "sacred_oak_log");
    sacred_oak_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "sacred_oak_wood");
    stripped_sacred_oak_log = registerBlock(new BlockLog(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_sacred_oak_log");
    stripped_sacred_oak_wood = registerBlock(new BlockRotatedPillar(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "stripped_sacred_oak_wood");
    sacred_oak_planks = registerBlock(new Block(Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "sacred_oak_planks");
    sacred_oak_slab = registerBlock(new BlockSlab(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "sacred_oak_slab");
    sacred_oak_stairs = registerBlock(new BlockStairs(sacred_oak_planks.getDefaultState(), Block.Properties.from(sacred_oak_planks)), "sacred_oak_stairs");
    sacred_oak_fence = registerBlock(new BlockFence(Block.Properties.create(Material.WOOD, sacred_oak_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "sacred_oak_fence");
    sacred_oak_fence_gate = registerBlock(new BlockFenceGate(Block.Properties.create(Material.WOOD, sacred_oak_planks.blockMapColor).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "sacred_oak_fence_gate");
    sacred_oak_door = registerBlock(new BlockDoor(Block.Properties.create(Material.WOOD, sacred_oak_planks.blockMapColor).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "sacred_oak_door");
    sacred_oak_trapdoor = registerBlock(new BlockTrapDoor(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "sacred_oak_trapdoor");
    sacred_oak_pressure_plate = registerBlock(new BlockPressurePlate(BlockPressurePlate.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, sacred_oak_planks.blockMapColor).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "sacred_oak_pressure_plate");
    sacred_oak_button = registerBlock(new BlockButtonWood(Block.Properties.create(Material.CIRCUITS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "sacred_oak_button");
	}
	
	public static Block registerBlock(Block block, String name)
    {
        ItemBlock itemBlock = new ItemBlock(block, new Item.Properties().group(ItemGroupBOP.instance));
        block.setRegistryName(BiomesOPlenty.MOD_ID, name);
        itemBlock.setRegistryName(BiomesOPlenty.MOD_ID, name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

}
