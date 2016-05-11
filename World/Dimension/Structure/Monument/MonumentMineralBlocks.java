/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension.Structure.Monument;

import java.util.HashMap;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.ChromatiCraft.World.Dimension.Structure.MonumentGenerator;
import Reika.DragonAPI.Instantiable.Worldgen.ChunkSplicedGenerationCache;
import Reika.DragonAPI.Libraries.Java.ReikaRandomHelper;


public class MonumentMineralBlocks {

	private final HashMap<Block, Integer> blockChance = new HashMap();
	private final MonumentGenerator parent;

	public MonumentMineralBlocks(MonumentGenerator gen) {
		parent = gen;
		blockChance.put(Blocks.quartz_block, 80);
		blockChance.put(Blocks.diamond_block, 75);
		blockChance.put(Blocks.redstone_block, 40);
		blockChance.put(Blocks.lapis_block, 50);
		blockChance.put(Blocks.glowstone, 35);
		blockChance.put(Blocks.emerald_block, 67);
		blockChance.put(Blocks.gold_block, 25);
		blockChance.put(ChromaBlocks.CHROMA.getBlockInstance(), 50);
	}

	public void generate(ChunkSplicedGenerationCache world, Random r, int i, int j, int k) {

		this.setBlock(world, i + 23, j + 0, k + 16, Blocks.diamond_block);
		this.setBlock(world, i + 23, j + 0, k + 26, Blocks.diamond_block);
		this.setBlock(world, i + 22, j + 0, k + 16, Blocks.diamond_block);
		this.setBlock(world, i + 22, j + 0, k + 26, Blocks.diamond_block);
		this.setBlock(world, i + 21, j + 0, k + 16, Blocks.diamond_block);
		this.setBlock(world, i + 21, j + 0, k + 26, Blocks.diamond_block);
		this.setBlock(world, i + 20, j + 0, k + 26, Blocks.diamond_block);
		this.setBlock(world, i + 20, j + 0, k + 16, Blocks.diamond_block);
		this.setBlock(world, i + 19, j + 0, k + 16, Blocks.diamond_block);
		this.setBlock(world, i + 19, j + 0, k + 26, Blocks.diamond_block);
		this.setBlock(world, i + 18, j + 0, k + 16, Blocks.diamond_block);
		this.setBlock(world, i + 18, j + 0, k + 26, Blocks.diamond_block);
		this.setBlock(world, i + 17, j + 0, k + 17, Blocks.diamond_block);
		this.setBlock(world, i + 17, j + 0, k + 25, Blocks.diamond_block);
		this.setBlock(world, i + 16, j + 0, k + 18, Blocks.diamond_block);
		this.setBlock(world, i + 16, j + 0, k + 19, Blocks.diamond_block);
		this.setBlock(world, i + 16, j + 0, k + 20, Blocks.diamond_block);
		this.setBlock(world, i + 16, j + 0, k + 21, Blocks.diamond_block);
		this.setBlock(world, i + 16, j + 0, k + 22, Blocks.diamond_block);
		this.setBlock(world, i + 16, j + 0, k + 23, Blocks.diamond_block);
		this.setBlock(world, i + 16, j + 0, k + 24, Blocks.diamond_block);
		this.setBlock(world, i + 26, j + 0, k + 18, Blocks.diamond_block);
		this.setBlock(world, i + 26, j + 0, k + 19, Blocks.diamond_block);
		this.setBlock(world, i + 26, j + 0, k + 20, Blocks.diamond_block);
		this.setBlock(world, i + 26, j + 0, k + 21, Blocks.diamond_block);
		this.setBlock(world, i + 26, j + 0, k + 22, Blocks.diamond_block);
		this.setBlock(world, i + 26, j + 0, k + 23, Blocks.diamond_block);
		this.setBlock(world, i + 26, j + 0, k + 24, Blocks.diamond_block);
		this.setBlock(world, i + 25, j + 0, k + 17, Blocks.diamond_block);
		this.setBlock(world, i + 25, j + 0, k + 25, Blocks.diamond_block);
		this.setBlock(world, i + 24, j + 0, k + 16, Blocks.diamond_block);
		this.setBlock(world, i + 24, j + 0, k + 26, Blocks.diamond_block);

		this.setBlock(world, i + 22, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 16, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 17, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 18, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 19, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 20, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 21, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 22, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 23, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 24, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 25, Blocks.gold_block);
		this.setBlock(world, i + 34, j + 0, k + 26, Blocks.gold_block);
		this.setBlock(world, i + 33, j + 0, k + 15, Blocks.gold_block);
		this.setBlock(world, i + 33, j + 0, k + 27, Blocks.gold_block);
		this.setBlock(world, i + 32, j + 0, k + 14, Blocks.gold_block);
		this.setBlock(world, i + 32, j + 0, k + 28, Blocks.gold_block);
		this.setBlock(world, i + 31, j + 0, k + 13, Blocks.gold_block);
		this.setBlock(world, i + 31, j + 0, k + 29, Blocks.gold_block);
		this.setBlock(world, i + 30, j + 0, k + 12, Blocks.gold_block);
		this.setBlock(world, i + 30, j + 0, k + 30, Blocks.gold_block);
		this.setBlock(world, i + 29, j + 0, k + 31, Blocks.gold_block);
		this.setBlock(world, i + 29, j + 0, k + 11, Blocks.gold_block);
		this.setBlock(world, i + 28, j + 0, k + 32, Blocks.gold_block);
		this.setBlock(world, i + 28, j + 0, k + 10, Blocks.gold_block);
		this.setBlock(world, i + 27, j + 0, k + 33, Blocks.gold_block);
		this.setBlock(world, i + 27, j + 0, k + 9, Blocks.gold_block);
		this.setBlock(world, i + 26, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 26, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 25, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 25, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 24, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 24, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 23, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 23, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 22, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 21, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 21, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 20, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 20, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 19, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 19, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 18, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 18, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 17, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 17, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 16, j + 0, k + 34, Blocks.gold_block);
		this.setBlock(world, i + 16, j + 0, k + 8, Blocks.gold_block);
		this.setBlock(world, i + 15, j + 0, k + 33, Blocks.gold_block);
		this.setBlock(world, i + 15, j + 0, k + 9, Blocks.gold_block);
		this.setBlock(world, i + 13, j + 0, k + 31, Blocks.gold_block);
		this.setBlock(world, i + 13, j + 0, k + 11, Blocks.gold_block);
		this.setBlock(world, i + 11, j + 0, k + 29, Blocks.gold_block);
		this.setBlock(world, i + 9, j + 0, k + 15, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 16, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 17, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 18, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 19, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 20, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 21, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 22, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 23, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 24, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 25, Blocks.gold_block);
		this.setBlock(world, i + 8, j + 0, k + 26, Blocks.gold_block);
		this.setBlock(world, i + 9, j + 0, k + 27, Blocks.gold_block);
		this.setBlock(world, i + 10, j + 0, k + 14, Blocks.gold_block);
		this.setBlock(world, i + 10, j + 0, k + 28, Blocks.gold_block);
		this.setBlock(world, i + 11, j + 0, k + 13, Blocks.gold_block);
		this.setBlock(world, i + 12, j + 0, k + 12, Blocks.gold_block);
		this.setBlock(world, i + 12, j + 0, k + 30, Blocks.gold_block);
		this.setBlock(world, i + 14, j + 0, k + 10, Blocks.gold_block);
		this.setBlock(world, i + 14, j + 0, k + 32, Blocks.gold_block);

		this.setBlock(world, i + 11, j + 12, k + 5, Blocks.quartz_block);
		this.setBlock(world, i + 6, j + 12, k + 12, Blocks.quartz_block);
		this.setBlock(world, i + 5, j + 12, k + 11, Blocks.quartz_block);
		this.setBlock(world, i + 5, j + 12, k + 31, Blocks.quartz_block);
		this.setBlock(world, i + 3, j + 12, k + 18, Blocks.quartz_block);
		this.setBlock(world, i + 39, j + 12, k + 18, Blocks.quartz_block);
		this.setBlock(world, i + 39, j + 12, k + 24, Blocks.quartz_block);
		this.setBlock(world, i + 37, j + 12, k + 11, Blocks.quartz_block);
		this.setBlock(world, i + 36, j + 12, k + 12, Blocks.quartz_block);
		this.setBlock(world, i + 36, j + 12, k + 30, Blocks.quartz_block);
		this.setBlock(world, i + 31, j + 12, k + 5, Blocks.quartz_block);
		this.setBlock(world, i + 31, j + 12, k + 37, Blocks.quartz_block);
		this.setBlock(world, i + 30, j + 12, k + 6, Blocks.quartz_block);
		this.setBlock(world, i + 30, j + 12, k + 36, Blocks.quartz_block);
		this.setBlock(world, i + 24, j + 12, k + 3, Blocks.quartz_block);
		this.setBlock(world, i + 18, j + 12, k + 39, Blocks.quartz_block);
		this.setBlock(world, i + 18, j + 12, k + 3, Blocks.quartz_block);
		this.setBlock(world, i + 12, j + 12, k + 36, Blocks.quartz_block);
		this.setBlock(world, i + 12, j + 12, k + 6, Blocks.quartz_block);
		this.setBlock(world, i + 24, j + 12, k + 39, Blocks.quartz_block);
		this.setBlock(world, i + 37, j + 12, k + 31, Blocks.quartz_block);
		this.setBlock(world, i + 3, j + 12, k + 24, Blocks.quartz_block);
		this.setBlock(world, i + 6, j + 12, k + 30, Blocks.quartz_block);
		this.setBlock(world, i + 11, j + 12, k + 37, Blocks.quartz_block);

		this.setBlock(world, i + 30, j + 0, k + 17, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 18, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 19, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 20, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 21, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 22, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 23, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 24, Blocks.emerald_block);
		this.setBlock(world, i + 30, j + 0, k + 25, Blocks.emerald_block);
		this.setBlock(world, i + 29, j + 0, k + 16, Blocks.emerald_block);
		this.setBlock(world, i + 29, j + 0, k + 26, Blocks.emerald_block);
		this.setBlock(world, i + 28, j + 0, k + 15, Blocks.emerald_block);
		this.setBlock(world, i + 28, j + 0, k + 27, Blocks.emerald_block);
		this.setBlock(world, i + 27, j + 0, k + 28, Blocks.emerald_block);
		this.setBlock(world, i + 27, j + 0, k + 14, Blocks.emerald_block);
		this.setBlock(world, i + 26, j + 0, k + 29, Blocks.emerald_block);
		this.setBlock(world, i + 26, j + 0, k + 13, Blocks.emerald_block);
		this.setBlock(world, i + 25, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 25, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 24, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 24, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 23, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 23, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 22, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 22, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 21, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 21, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 20, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 20, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 19, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 19, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 18, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 18, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 17, j + 0, k + 30, Blocks.emerald_block);
		this.setBlock(world, i + 17, j + 0, k + 12, Blocks.emerald_block);
		this.setBlock(world, i + 16, j + 0, k + 13, Blocks.emerald_block);
		this.setBlock(world, i + 15, j + 0, k + 14, Blocks.emerald_block);
		this.setBlock(world, i + 14, j + 0, k + 15, Blocks.emerald_block);
		this.setBlock(world, i + 13, j + 0, k + 16, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 17, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 18, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 19, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 20, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 21, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 22, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 23, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 24, Blocks.emerald_block);
		this.setBlock(world, i + 12, j + 0, k + 25, Blocks.emerald_block);
		this.setBlock(world, i + 13, j + 0, k + 26, Blocks.emerald_block);
		this.setBlock(world, i + 14, j + 0, k + 27, Blocks.emerald_block);
		this.setBlock(world, i + 15, j + 0, k + 28, Blocks.emerald_block);
		this.setBlock(world, i + 16, j + 0, k + 29, Blocks.emerald_block);

		this.setBlock(world, i + 40, j + 6, k + 34, Blocks.lapis_block);
		this.setBlock(world, i + 40, j + 7, k + 8, Blocks.lapis_block);
		this.setBlock(world, i + 40, j + 5, k + 8, Blocks.lapis_block);
		this.setBlock(world, i + 2, j + 5, k + 8, Blocks.lapis_block);
		this.setBlock(world, i + 2, j + 5, k + 34, Blocks.lapis_block);
		this.setBlock(world, i + 2, j + 6, k + 8, Blocks.lapis_block);
		this.setBlock(world, i + 2, j + 6, k + 34, Blocks.lapis_block);
		this.setBlock(world, i + 2, j + 7, k + 8, Blocks.lapis_block);
		this.setBlock(world, i + 2, j + 7, k + 34, Blocks.lapis_block);
		this.setBlock(world, i + 8, j + 5, k + 2, Blocks.lapis_block);
		this.setBlock(world, i + 8, j + 5, k + 40, Blocks.lapis_block);
		this.setBlock(world, i + 8, j + 6, k + 2, Blocks.lapis_block);
		this.setBlock(world, i + 8, j + 6, k + 40, Blocks.lapis_block);
		this.setBlock(world, i + 8, j + 7, k + 2, Blocks.lapis_block);
		this.setBlock(world, i + 8, j + 7, k + 40, Blocks.lapis_block);
		this.setBlock(world, i + 34, j + 5, k + 2, Blocks.lapis_block);
		this.setBlock(world, i + 34, j + 5, k + 40, Blocks.lapis_block);
		this.setBlock(world, i + 34, j + 6, k + 2, Blocks.lapis_block);
		this.setBlock(world, i + 34, j + 6, k + 40, Blocks.lapis_block);
		this.setBlock(world, i + 34, j + 7, k + 2, Blocks.lapis_block);
		this.setBlock(world, i + 34, j + 7, k + 40, Blocks.lapis_block);
		this.setBlock(world, i + 40, j + 5, k + 34, Blocks.lapis_block);
		this.setBlock(world, i + 40, j + 6, k + 8, Blocks.lapis_block);
		this.setBlock(world, i + 40, j + 7, k + 34, Blocks.lapis_block);

		this.setBlock(world, i + 39, j + 6, k + 9, Blocks.glowstone);
		this.setBlock(world, i + 39, j + 6, k + 33, Blocks.glowstone);
		this.setBlock(world, i + 38, j + 6, k + 8, Blocks.glowstone);
		this.setBlock(world, i + 38, j + 6, k + 34, Blocks.glowstone);
		this.setBlock(world, i + 34, j + 6, k + 4, Blocks.glowstone);
		this.setBlock(world, i + 34, j + 6, k + 38, Blocks.glowstone);
		this.setBlock(world, i + 33, j + 6, k + 3, Blocks.glowstone);
		this.setBlock(world, i + 33, j + 6, k + 39, Blocks.glowstone);
		this.setBlock(world, i + 32, j + 6, k + 2, Blocks.glowstone);
		this.setBlock(world, i + 32, j + 6, k + 40, Blocks.glowstone);
		this.setBlock(world, i + 25, j + 5, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 25, j + 5, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 25, j + 6, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 25, j + 6, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 25, j + 7, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 25, j + 7, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 24, j + 5, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 24, j + 5, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 24, j + 7, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 24, j + 7, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 23, j + 5, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 23, j + 5, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 23, j + 6, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 23, j + 6, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 23, j + 7, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 23, j + 7, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 19, j + 5, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 19, j + 5, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 19, j + 6, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 19, j + 6, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 19, j + 7, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 19, j + 7, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 18, j + 7, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 18, j + 7, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 18, j + 5, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 18, j + 5, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 17, j + 5, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 17, j + 5, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 17, j + 6, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 17, j + 6, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 17, j + 7, k + 0, Blocks.glowstone);
		this.setBlock(world, i + 17, j + 7, k + 42, Blocks.glowstone);
		this.setBlock(world, i + 10, j + 6, k + 2, Blocks.glowstone);
		this.setBlock(world, i + 10, j + 6, k + 40, Blocks.glowstone);
		this.setBlock(world, i + 9, j + 6, k + 3, Blocks.glowstone);
		this.setBlock(world, i + 9, j + 6, k + 39, Blocks.glowstone);
		this.setBlock(world, i + 8, j + 6, k + 4, Blocks.glowstone);
		this.setBlock(world, i + 4, j + 6, k + 8, Blocks.glowstone);
		this.setBlock(world, i + 4, j + 6, k + 34, Blocks.glowstone);
		this.setBlock(world, i + 3, j + 6, k + 9, Blocks.glowstone);
		this.setBlock(world, i + 3, j + 6, k + 33, Blocks.glowstone);
		this.setBlock(world, i + 2, j + 6, k + 10, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 5, k + 17, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 5, k + 18, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 5, k + 19, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 5, k + 23, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 5, k + 24, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 5, k + 25, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 6, k + 17, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 6, k + 19, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 6, k + 23, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 6, k + 25, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 7, k + 17, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 7, k + 18, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 7, k + 19, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 7, k + 23, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 7, k + 24, Blocks.glowstone);
		this.setBlock(world, i + 0, j + 7, k + 25, Blocks.glowstone);
		this.setBlock(world, i + 2, j + 6, k + 32, Blocks.glowstone);
		this.setBlock(world, i + 8, j + 6, k + 38, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 5, k + 17, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 5, k + 18, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 5, k + 19, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 5, k + 23, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 5, k + 24, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 5, k + 25, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 6, k + 17, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 6, k + 19, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 6, k + 23, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 6, k + 25, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 7, k + 17, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 7, k + 18, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 7, k + 19, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 7, k + 23, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 7, k + 24, Blocks.glowstone);
		this.setBlock(world, i + 42, j + 7, k + 25, Blocks.glowstone);
		this.setBlock(world, i + 40, j + 6, k + 10, Blocks.glowstone);
		this.setBlock(world, i + 40, j + 6, k + 32, Blocks.glowstone);

		this.setBlock(world, i + 4, j + 0, k + 17, Blocks.redstone_block);
		this.setBlock(world, i + 4, j + 0, k + 18, Blocks.redstone_block);
		this.setBlock(world, i + 4, j + 0, k + 19, Blocks.redstone_block);
		this.setBlock(world, i + 4, j + 0, k + 23, Blocks.redstone_block);
		this.setBlock(world, i + 4, j + 0, k + 24, Blocks.redstone_block);
		this.setBlock(world, i + 4, j + 0, k + 25, Blocks.redstone_block);
		this.setBlock(world, i + 38, j + 0, k + 17, Blocks.redstone_block);
		this.setBlock(world, i + 38, j + 0, k + 18, Blocks.redstone_block);
		this.setBlock(world, i + 38, j + 0, k + 19, Blocks.redstone_block);
		this.setBlock(world, i + 38, j + 0, k + 23, Blocks.redstone_block);
		this.setBlock(world, i + 38, j + 0, k + 24, Blocks.redstone_block);
		this.setBlock(world, i + 38, j + 0, k + 25, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 17, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 18, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 19, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 20, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 21, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 22, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 23, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 24, Blocks.redstone_block);
		this.setBlock(world, i + 36, j + 0, k + 25, Blocks.redstone_block);
		this.setBlock(world, i + 34, j + 0, k + 13, Blocks.redstone_block);
		this.setBlock(world, i + 34, j + 0, k + 29, Blocks.redstone_block);
		this.setBlock(world, i + 29, j + 0, k + 34, Blocks.redstone_block);
		this.setBlock(world, i + 29, j + 0, k + 8, Blocks.redstone_block);
		this.setBlock(world, i + 28, j + 0, k + 35, Blocks.redstone_block);
		this.setBlock(world, i + 28, j + 0, k + 7, Blocks.redstone_block);
		this.setBlock(world, i + 25, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 25, j + 0, k + 38, Blocks.redstone_block);
		this.setBlock(world, i + 25, j + 0, k + 4, Blocks.redstone_block);
		this.setBlock(world, i + 25, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 24, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 24, j + 0, k + 38, Blocks.redstone_block);
		this.setBlock(world, i + 24, j + 0, k + 4, Blocks.redstone_block);
		this.setBlock(world, i + 24, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 23, j + 0, k + 4, Blocks.redstone_block);
		this.setBlock(world, i + 22, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 22, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 21, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 21, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 20, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 20, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 19, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 19, j + 0, k + 4, Blocks.redstone_block);
		this.setBlock(world, i + 18, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 18, j + 0, k + 4, Blocks.redstone_block);
		this.setBlock(world, i + 17, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 17, j + 0, k + 4, Blocks.redstone_block);
		this.setBlock(world, i + 14, j + 0, k + 35, Blocks.redstone_block);
		this.setBlock(world, i + 14, j + 0, k + 7, Blocks.redstone_block);
		this.setBlock(world, i + 13, j + 0, k + 34, Blocks.redstone_block);
		this.setBlock(world, i + 13, j + 0, k + 8, Blocks.redstone_block);
		this.setBlock(world, i + 8, j + 0, k + 29, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 17, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 18, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 19, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 20, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 21, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 22, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 23, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 24, Blocks.redstone_block);
		this.setBlock(world, i + 6, j + 0, k + 25, Blocks.redstone_block);
		this.setBlock(world, i + 7, j + 0, k + 14, Blocks.redstone_block);
		this.setBlock(world, i + 7, j + 0, k + 28, Blocks.redstone_block);
		this.setBlock(world, i + 8, j + 0, k + 13, Blocks.redstone_block);
		this.setBlock(world, i + 17, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 17, j + 0, k + 38, Blocks.redstone_block);
		this.setBlock(world, i + 18, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 18, j + 0, k + 38, Blocks.redstone_block);
		this.setBlock(world, i + 19, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 19, j + 0, k + 38, Blocks.redstone_block);
		this.setBlock(world, i + 23, j + 0, k + 6, Blocks.redstone_block);
		this.setBlock(world, i + 23, j + 0, k + 36, Blocks.redstone_block);
		this.setBlock(world, i + 23, j + 0, k + 38, Blocks.redstone_block);
		this.setBlock(world, i + 35, j + 0, k + 14, Blocks.redstone_block);
		this.setBlock(world, i + 35, j + 0, k + 28, Blocks.redstone_block);

		Block ch = ChromaBlocks.CHROMA.getBlockInstance();
		parent.registerMineralBlock(i + 21, j + 3, k + 21, ch);
		this.setBlock(world, i + 20, j + 1, k + 19, ch);
		this.setBlock(world, i + 22, j + 1, k + 19, ch);
		this.setBlock(world, i + 20, j + 1, k + 23, ch);
		this.setBlock(world, i + 22, j + 1, k + 23, ch);

		this.setBlock(world, i + 19, j + 1, k + 20, ch);
		this.setBlock(world, i + 19, j + 1, k + 22, ch);
		this.setBlock(world, i + 23, j + 1, k + 20, ch);
		this.setBlock(world, i + 23, j + 1, k + 22, ch);
	}

	private void setBlock(ChunkSplicedGenerationCache world, int x, int y, int z, Block b) {
		if (ReikaRandomHelper.doWithChance(blockChance.get(b))) {
			world.setBlock(x, y, z, b);
		}
		parent.registerMineralBlock(x, y, z, b);
	}

}
