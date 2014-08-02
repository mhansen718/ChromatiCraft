/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Registry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraft.world.IBlockAccess;
import Reika.ChromatiCraft.ChromatiCraft;
import Reika.ChromatiCraft.Base.TileEntity.TileEntityChromaticBase;
import Reika.ChromatiCraft.TileEntity.TileEntityAuraLiquifier;
import Reika.ChromatiCraft.TileEntity.TileEntityAuraVaporizer;
import Reika.ChromatiCraft.TileEntity.TileEntityAutoEnchanter;
import Reika.ChromatiCraft.TileEntity.TileEntityCastingTable;
import Reika.ChromatiCraft.TileEntity.TileEntityCollector;
import Reika.ChromatiCraft.TileEntity.TileEntityRift;
import Reika.ChromatiCraft.TileEntity.TileEntitySpawnerReprogrammer;
import Reika.ChromatiCraft.TileEntity.Plants.TileEntityChromaFlower;
import Reika.DragonAPI.Exception.RegistrationException;
import Reika.DragonAPI.Libraries.Java.ReikaJavaLibrary;

public enum ChromaTiles {

	CHROMAFLOWER("chroma.flower", ChromaBlocks.TILEPLANT, TileEntityChromaFlower.class, 0, "ChromaFlowerRenderer"),
	ENCHANTER("chroma.enchanter", ChromaBlocks.TILEENTITY, TileEntityAutoEnchanter.class, 0),
	LIQUIFIER("chroma.liquifier", ChromaBlocks.TILEENTITY, TileEntityAuraLiquifier.class, 1),
	VAPORIZER("chroma.vaporizer", ChromaBlocks.TILEENTITY, TileEntityAuraVaporizer.class, 2),
	REPROGRAMMER("chroma.reprogrammer", ChromaBlocks.TILEMODELLED, TileEntitySpawnerReprogrammer.class, 0, "RenderSpawnerProgrammer"),
	COLLECTOR("chroma.collector", ChromaBlocks.TILEENTITY, TileEntityCollector.class, 4),
	TABLE("chroma.table", ChromaBlocks.TILEENTITY, TileEntityCastingTable.class, 5),
	RIFT("chroma.rift", ChromaBlocks.RIFT, TileEntityRift.class, 0, "RenderRift");

	private final Class tile;
	private final String name;
	private final String renderer;
	private final int metadata;
	private final ChromaBlocks block;
	private TileEntity renderInstance;

	public static final ChromaTiles[] TEList = values();

	private static final HashMap<List<Integer>, ChromaTiles> chromaMappings = new HashMap();

	private ChromaTiles(String n, ChromaBlocks b, Class <? extends TileEntityChromaticBase> c, int meta) {
		this(n, b, c, meta, null);
	}

	private ChromaTiles(String n, ChromaBlocks b, Class <? extends TileEntityChromaticBase> c, int meta, String r) {
		tile = c;
		name = n;
		block = b;
		metadata = meta;
		renderer = r;
	}

	public int getBlockID() {
		return this.getBlockVariable().blockID;
	}

	public Block getBlockVariable() {
		return block.getBlockVariable();
	}

	public int getBlockMetadata() {
		return metadata%16;
	}

	public String getName() {
		return StatCollector.translateToLocal(name);
	}

	public String getDefaultName() {
		return name;
	}

	public boolean renderInPass1() {
		switch(this) {
		case RIFT:
			return true;
		default:
			return false;
		}
	}

	public boolean hasRender() {
		return renderer != null;
	}

	public String getRenderer() {
		if (!this.hasRender())
			throw new RuntimeException("Tile "+name+" has no render to call!");
		return "Reika.ChromatiCraft.Render."+renderer;
	}

	public TileEntity createTEInstanceForRender() {
		if (renderInstance == null) {
			try {
				renderInstance = (TileEntity)tile.newInstance();
			}
			catch (InstantiationException e) {
				e.printStackTrace();
				throw new RegistrationException(ChromatiCraft.instance, "Could not create TE instance to render "+this);
			}
			catch (IllegalAccessException e) {
				e.printStackTrace();
				throw new RegistrationException(ChromatiCraft.instance, "Could not create TE instance to render "+this);
			}
		}
		return renderInstance;
	}

	public Class<? extends TileEntity> getTEClass() {
		return tile;
	}

	public static ChromaTiles getTile(IBlockAccess iba, int x, int y, int z) {
		int id = iba.getBlockId(x, y, z);
		int meta = iba.getBlockMetadata(x, y, z);
		return getMachineFromIDandMetadata(id, meta);
	}

	public static ChromaTiles getMachineFromIDandMetadata(int id, int meta) {
		return chromaMappings.get(Arrays.asList(id, meta));
	}

	public static TileEntity createTEFromIDAndMetadata(int id, int meta) {
		ChromaTiles index = getMachineFromIDandMetadata(id, meta);
		if (index == null) {
			ReikaJavaLibrary.pConsole(chromaMappings);
			ChromatiCraft.logger.logError("ID "+id+" and metadata "+meta+" are not a valid tile identification pair!");
			return null;
		}
		Class TEClass = index.tile;
		try {
			return (TileEntity)TEClass.newInstance();
		}
		catch (InstantiationException e) {
			e.printStackTrace();
			throw new RegistrationException(ChromatiCraft.instance, "ID "+id+" and Metadata "+meta+" failed to instantiate its TileEntity of "+TEClass);
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new RegistrationException(ChromatiCraft.instance, "ID "+id+" and Metadata "+meta+" failed illegally accessed its TileEntity of "+TEClass);
		}
	}

	public static void loadMappings() {
		for (int i = 0; i < ChromaTiles.TEList.length; i++) {
			ChromaTiles r = ChromaTiles.TEList[i];
			int id = r.getBlockID();
			int meta = r.getBlockMetadata();
			List<Integer> li = Arrays.asList(id, meta);
			chromaMappings.put(li, r);
		}
	}

	public boolean hasSneakActions() {
		return false;
	}

	public ItemStack getCraftedProduct() {
		if (this == RIFT)
			return ChromaItems.RIFT.getStackOf();
		return ChromaItems.PLACER.getStackOfMetadata(this.ordinal());
	}

	public boolean isAvailableInCreativeInventory() {
		if (this == RIFT)
			return false;
		return true;
	}

}
