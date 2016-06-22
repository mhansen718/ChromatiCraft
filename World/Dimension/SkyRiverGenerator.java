/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.World.Dimension;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import Reika.ChromatiCraft.ChromatiCraft;
import Reika.ChromatiCraft.Base.ThreadedGenerator;
import Reika.DragonAPI.DragonAPICore;
import Reika.DragonAPI.Instantiable.Spline;
import Reika.DragonAPI.Instantiable.Spline.BasicSplinePoint;
import Reika.DragonAPI.Instantiable.Spline.SplineType;
import Reika.DragonAPI.Instantiable.Data.Immutable.DecimalPosition;
import Reika.DragonAPI.Instantiable.Data.Maps.MultiMap;
import Reika.DragonAPI.Libraries.Java.ReikaObfuscationHelper;


public class SkyRiverGenerator extends ThreadedGenerator {

	private static final Collection<Ray> rays = new ArrayList();
	private static final MultiMap<ChunkCoordIntPair, RiverPoint> points = new MultiMap().setNullEmpty();

	private static final double INNER_RADIUS_MIN = 64;
	private static final double INNER_RADIUS_MAX = 256;

	private static final double LAYER2_RADIUS_MIN = 1024;
	private static final double LAYER2_RADIUS_MAX = 3072;

	private static final double OUTER_RADIUS_MIN = StructureCalculator.getMaximumPossibleDistance()+RegionMapper.MAX_BUFFER;
	private static final double OUTER_RADIUS_MAX = OUTER_RADIUS_MIN+2048;

	private static final double FULL_RAY_ANGLE = 45;
	private static final double LAYER2_RAY_ANGLE = 22.5/2;
	private static final double NODE_LENGTH = 64*2;
	private static final double ANGLE_VARIATION = 10;
	private static final double VERTICAL_POSITION_MIN = 384;
	private static final double VERTICAL_POSITION_MAX = 512;

	public SkyRiverGenerator(long seed) {
		super(seed);
	}

	@Override
	public void run() throws Throwable {
		rays.clear();
		points.clear();
		for (double d = 0; d < 360; d += FULL_RAY_ANGLE) {
			double r1 = INNER_RADIUS_MIN+rand.nextDouble()*(INNER_RADIUS_MAX-INNER_RADIUS_MIN);
			double r2 = OUTER_RADIUS_MIN+rand.nextDouble()*(OUTER_RADIUS_MAX-OUTER_RADIUS_MIN);
			this.generateRay(d, r1, r2);
		}

		for (double d = 0; d < 360; d += LAYER2_RAY_ANGLE) {
			if (d%FULL_RAY_ANGLE != 0) {
				double r1 = LAYER2_RADIUS_MIN+rand.nextDouble()*(LAYER2_RADIUS_MAX-LAYER2_RADIUS_MIN);
				double r2 = OUTER_RADIUS_MIN+rand.nextDouble()*(OUTER_RADIUS_MAX-OUTER_RADIUS_MIN);
				this.generateRay(d, r1, r2);
			}
		}

		for (Ray r : rays) {
			for (int i = 1; i < r.points.size()-1; i++) {
				DecimalPosition p1 = r.points.get(i);
				DecimalPosition pb = r.points.get(i+1);
				DecimalPosition pa = r.points.get(i-1);
				ChunkCoordIntPair ch = new ChunkCoordIntPair(MathHelper.floor_double(p1.xCoord)/16, MathHelper.floor_double(p1.zCoord)/16);
				RiverPoint p = new RiverPoint(ch, p1, pa, pb);
				points.addValue(ch, p);
			}
		}
		if ((DragonAPICore.isReikasComputer() && ReikaObfuscationHelper.isDeObfEnvironment()) || DragonAPICore.debugtest) {
			ChromatiCraft.logger.log("Generated rivers: "+points);
		}
	}


	public static Collection<RiverPoint> getPointsForChunk(int x, int z) {
		ChunkCoordIntPair pos = new ChunkCoordIntPair(x, z);
		Collection<RiverPoint> c = points.get(pos);
		return c != null ? Collections.unmodifiableCollection(c) : null;
	}

	public static Collection<RiverPoint> getPointsWithin(EntityPlayer ep, double range) {
		int x = MathHelper.floor_double(ep.posX)/16;
		int z = MathHelper.floor_double(ep.posZ)/16;
		Collection<RiverPoint> c2 = new HashSet();
		for (int i = -(int)range-1; i <= range; i++) {
			for (int k = -(int)range-1; k <= range; k++) {
				Collection<RiverPoint> c = getPointsForChunk(x, z);
				c2.addAll(c);
			}
		}
		return c2;
	}

	public static RiverPoint getClosestPoint(EntityPlayer ep, double range) {
		Collection<RiverPoint> c = getPointsWithin(ep, range);
		Double d = Double.POSITIVE_INFINITY;
		RiverPoint cl = null;
		for (RiverPoint p : c) {
			double dist = ep.getDistanceSq(p.position.xCoord, p.position.yCoord, p.position.zCoord);
			if (dist < d && dist <= range*range) {
				d = dist;
				cl = p;
			}
		}
		return cl;
	}

	private void generateRay(double ang, double r1, double r2) {
		Ray r = new Ray();
		for (double d = r1; d <= r2; d += NODE_LENGTH) {
			double a = Math.toRadians(ang+rand.nextDouble()*ANGLE_VARIATION*2-ANGLE_VARIATION);
			double x = d*Math.cos(a);
			double z = d*Math.sin(a);
			double y = VERTICAL_POSITION_MIN+rand.nextDouble()*(VERTICAL_POSITION_MAX-VERTICAL_POSITION_MIN);
			r.addPoint(x, y, z);
		}
		if (r.points.size() <= 2)
			throw new RuntimeException(r1+">"+r2+"@"+ang);
		r.spline();
		rays.add(r);
	}

	@Override
	public String getStateMessage() {
		return "Generated sky rivers, with "+rays.size()+" rays and "+points.totalSize()+" points.";
	}

	private static class Ray {

		private List<DecimalPosition> points = new ArrayList();

		private void addPoint(double x, double y, double z) {
			points.add(new DecimalPosition(x, y, z));
		}

		private void spline() {
			Spline s = new Spline(SplineType.CHORDAL);
			for (DecimalPosition p : points) {
				s.addPoint(new BasicSplinePoint(p));
			}
			points = s.get(/*128*/8, false);
		}

		@Override
		public String toString() {
			return points.toString();
		}
	}

	public static class RiverPoint {

		private final ChunkCoordIntPair chunk;
		public final DecimalPosition position;
		public final DecimalPosition next;
		public final DecimalPosition prev;

		public RiverPoint(ChunkCoordIntPair ch, DecimalPosition p1, DecimalPosition pa, DecimalPosition pb) {
			chunk = ch;
			position = p1;
			next = pb;
			prev = pa;
		}

		@Override
		public String toString() {
			return prev+" > "+position+" > "+next;
		}

		public static RiverPoint readFromNBT(NBTTagCompound tag) {
			ChunkCoordIntPair ch = new ChunkCoordIntPair(tag.getInteger("cx"), tag.getInteger("cz"));
			return new RiverPoint(ch, DecimalPosition.readFromNBT("pos", tag), DecimalPosition.readFromNBT("pre", tag), DecimalPosition.readFromNBT("next", tag));
		}

		public void writeToNBT(NBTTagCompound tag) {
			tag.setInteger("cx", chunk.chunkXPos);
			tag.setInteger("cz", chunk.chunkZPos);
			position.writeToNBT("pos", tag);
			next.writeToNBT("next", tag);
			prev.writeToNBT("prev", tag);
		}

		public void writeToBuf(ByteBuf buf) {
			buf.writeInt(chunk.chunkXPos);
			buf.writeInt(chunk.chunkZPos);
			position.writeToBuf(buf);
			next.writeToBuf(buf);
			prev.writeToBuf(buf);
		}

		public static RiverPoint readFromBuf(ByteBuf buf) {
			int cx = buf.readInt();
			int cz = buf.readInt();
			DecimalPosition pos = DecimalPosition.readFromBuf(buf);
			DecimalPosition nex = DecimalPosition.readFromBuf(buf);
			DecimalPosition pre = DecimalPosition.readFromBuf(buf);
			return new RiverPoint(new ChunkCoordIntPair(cx, cz), pos, pre, nex);
		}

	}

}
