/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension.Structure.Locks;

import Reika.ChromatiCraft.Base.DimensionStructureGenerator;
import Reika.ChromatiCraft.Base.LockLevel;
import Reika.ChromatiCraft.Block.Dimension.BlockLockKey.LockChannel;
import Reika.DragonAPI.Instantiable.Worldgen.ChunkSplicedGenerationCache;

public class LocksRoomWhite extends LockLevel {

	public LocksRoomWhite(DimensionStructureGenerator g) {
		super(g, LockChannel.WHITE);
	}

	@Override
	public void generate(ChunkSplicedGenerationCache world, int x, int y, int z) {

	}

}
