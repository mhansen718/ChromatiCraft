/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.TileEntity;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import Reika.ChromatiCraft.Base.TileEntity.TileEntityChromaticBase;
import Reika.ChromatiCraft.Registry.ChromaTiles;
import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.ChromatiCraft.Render.Particle.EntityBlurFX;
import Reika.DragonAPI.Libraries.ReikaInventoryHelper;
import Reika.DragonAPI.Libraries.IO.ReikaColorAPI;
import Reika.DragonAPI.Libraries.Registry.ReikaItemHelper;
import Reika.DragonAPI.Libraries.World.ReikaBlockHelper;
import Reika.DragonAPI.Libraries.World.ReikaWorldHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityMiner extends TileEntityChromaticBase {

	private boolean digging;

	private int range = 512;

	private int readX = 0;
	private int readY = 0;
	private int readZ = 0;

	private double particleX;
	private double particleY;
	private double particleVX;
	private double particleVY;

	private static int TICKSTEP = 2048;

	@Override
	public ChromaTiles getTile() {
		return ChromaTiles.MINER;
	}

	public int getReadX() {
		return readX;
	}

	public int getReadY() {
		return readY;
	}

	public int getReadZ() {
		return readZ;
	}

	public int getRange() {
		return range;
	}

	@Override
	public void updateEntity(World world, int x, int y, int z, int meta) {
		digging = true;
		if (!world.isRemote) {
			for (int i = 0; i < TICKSTEP && digging; i++) {
				int dx = x+readX;
				int dy = readY;
				int dz = z+readZ;
				ReikaWorldHelper.forceGenAndPopulate(world, dx, dy, dz, meta);
				Block id = world.getBlock(dx, dy, dz);
				int meta2 = world.getBlockMetadata(dx, dy, dz);
				//ReikaJavaLibrary.pConsole(readX+":"+dx+", "+dy+", "+readZ+":"+dz+" > "+ores.getSize(), Side.SERVER);
				if (ReikaBlockHelper.isOre(id, meta2)) {
					//ores.addBlockCoordinate(dx, dy, dz);
					this.dropBlock(world, x, y, z, dx, dy, dz, id, meta2);
				}
				this.updateReadPosition();
			}
		}
		if (world.isRemote)
			this.spawnParticles(world, x, y, z);
	}

	@SideOnly(Side.CLIENT)
	private void spawnParticles(World world, int x, int y, int z) {
		double px = x+particleX;
		double py = y+particleY;
		double pz = z;

		int color = CrystalElement.getBlendedColor(this.getTicksExisted(), 40);
		int red = ReikaColorAPI.getRedFromInteger(color);
		int green = ReikaColorAPI.getGreenFromInteger(color);
		int blue = ReikaColorAPI.getBlueFromInteger(color);

		EntityBlurFX fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		px = x+1-particleX;
		py = y+1-particleY;
		fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		pz = z+1;
		px = x+1-particleX;
		py = y+particleY;
		fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		px = x+particleX;
		py = y+1-particleY;
		fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		px = x;
		pz = z+particleX;
		py = y+particleY;
		fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		pz = z+1-particleX;
		py = y+1-particleY;
		fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		px = x+1;
		pz = z+1-particleX;
		py = y+particleY;
		fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		pz = z+particleX;
		py = y+1-particleY;
		fx = new EntityBlurFX(world, px, py, pz).setScale(0.5F).setLife(40).setColor(red, green, blue);
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);

		double d = 0.05;
		particleX += particleVX;
		particleY += particleVY;
		particleX = MathHelper.clamp_double(particleX, 0, 1);
		particleY = MathHelper.clamp_double(particleY, 0, 1);

		if (particleX == 1 && particleY == 0) {
			particleVX = 0;
			particleVY = d;
		}
		if (particleY == 1 && particleY == 1) {
			particleVX = -d;
			particleVY = 0;
		}
		if (particleX == 0 && particleY == 1) {
			particleVX = 0;
			particleVY = -d;
		}
		if (particleX == 0 && particleY == 0) {
			particleVX = d;
			particleVY = 0;
		}
	}

	private void dropBlock(World world, int x, int y, int z, int dx, int dy, int dz, Block id, int meta2) {
		ArrayList<ItemStack> li = id.getDrops(world, dx, dy, dz, meta2, 0);
		for (ItemStack is : li) {
			boolean flag = true;
			for (int i = 0; i < 6 && flag; i++) {
				TileEntity te = this.getAdjacentTileEntity(dirs[i]);
				if (te instanceof IInventory) {
					if (ReikaInventoryHelper.addToIInv(is, (IInventory)te))
						flag = false;
				}
			}
			if (flag)
				ReikaItemHelper.dropItem(world, x+0.5, y+1.5, z+0.5, is);
		}
		world.setBlock(dx, dy, dz, Blocks.stone);
	}

	private void updateReadPosition() {
		boolean flag1 = false;
		boolean flag2 = false;
		readX++;
		if (readX > range) {
			readX = -range;
			flag1 = true;
		}
		if (flag1) {
			readZ++;
			//ReikaJavaLibrary.pConsole(readY+" > "+readZ+":"+range+" > "+ores.getSize(), Side.SERVER);
			if (readZ > range) {
				readZ = -range;
				flag2 = true;
			}
			if (flag2) {
				readY++;
			}
		}
		if (readY >= worldObj.getActualHeight())
			digging = false;
	}

	public void triggerCalculation() {
		digging = true;
		readX = -range;
		readY = 1;
		readZ = -range;
	}

	@Override
	protected void animateWithTick(World world, int x, int y, int z) {

	}
	/*
	@Override
	protected void readSyncTag(NBTTagCompound NBT) {
		super.readSyncTag(NBT);

		readX = NBT.getInteger("rx");
		readY = NBT.getInteger("ry");
		readZ = NBT.getInteger("rz");
	}

	@Override
	protected void writeSyncTag(NBTTagCompound NBT) {
		super.writeSyncTag(NBT);

		NBT.setInteger("rx", readX);
		NBT.setInteger("ry", readY);
		NBT.setInteger("rz", readZ);
	}
	 */
}
