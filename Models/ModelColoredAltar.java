/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 07/08/2015 6:53:25 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.ChromatiCraft.Render.TESR.RenderColoredAltar;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.DragonAPI.Libraries.IO.ReikaColorAPI;

public class ModelColoredAltar extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart Shape4d;
	LODModelPart Shape4e;
	LODModelPart Shape3b;
	LODModelPart Shape3a;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape5;
	LODModelPart Shape5b;
	LODModelPart Shape5c;
	LODModelPart Shape5d;
	LODModelPart Shape5e;
	LODModelPart Shape5f;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape6b;
	LODModelPart Shape6c;
	LODModelPart Shape6d;
	LODModelPart Shape6e;
	LODModelPart Shape6f;
	LODModelPart Shape6g;
	LODModelPart Shape6h;
	LODModelPart Shape6i;
	LODModelPart Shape6j;
	LODModelPart Shape6k;
	LODModelPart Shape6l;
	LODModelPart Shape6m;
	LODModelPart Shape6n;
	LODModelPart Shape6o;
	LODModelPart Shape6p;
	LODModelPart Shape6q;
	LODModelPart Shape6r;
	LODModelPart Shape6s;
	LODModelPart Shape6t;
	LODModelPart Shape6u;
	LODModelPart Shape6v;
	LODModelPart Shape6w;

	private final LODModelPart[] crystal;

	public ModelColoredAltar()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 25);
		Shape1.addBox(0F, 0F, 0F, 6, 1, 6);
		Shape1.setRotationPoint(-3F, 21F, -3F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 0);
		Shape1a.addBox(0F, 0F, 0F, 12, 1, 12);
		Shape1a.setRotationPoint(-6F, 23F, -6F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 0, 14);
		Shape1b.addBox(0F, 0F, 0F, 9, 1, 9);
		Shape1b.setRotationPoint(-4.5F, 22F, -4.5F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 33);
		Shape2.addBox(-2F, 0F, -2F, 4, 1, 4);
		Shape2.setRotationPoint(0F, 20F, 0F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, -1.047198F, 0F);
		Shape3 = new LODModelPart(this, 50, 0);
		Shape3.addBox(-4F, 0F, -4F, 8, 1, 8);
		Shape3.setRotationPoint(0F, 19.5F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, -1.047198F, 0F);
		Shape4 = new LODModelPart(this, 45, 40);
		Shape4.addBox(-3F, -7F, 4.2F, 6, 6, 1);
		Shape4.setRotationPoint(0F, 16.5F, 0F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, -1.047198F, -1.047198F, 0F);
		Shape4a = new LODModelPart(this, 60, 40);
		Shape4a.addBox(-3F, -7F, 4.2F, 6, 6, 1);
		Shape4a.setRotationPoint(0F, 16.5F, 0F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, -1.047198F, 0F, 0F);
		Shape4b = new LODModelPart(this, 75, 40);
		Shape4b.addBox(-3F, -7F, 4.2F, 6, 6, 1);
		Shape4b.setRotationPoint(0F, 16.5F, 0F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, -1.047198F, 1.047198F, 0F);
		Shape4c = new LODModelPart(this, 15, 40);
		Shape4c.addBox(-3F, -7F, 4.2F, 6, 6, 1);
		Shape4c.setRotationPoint(0F, 16.5F, 0F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, -1.047198F, 3.141593F, 0F);
		Shape4d = new LODModelPart(this, 0, 40);
		Shape4d.addBox(-3F, -7F, 4.2F, 6, 6, 1);
		Shape4d.setRotationPoint(0F, 16.5F, 0F);
		Shape4d.setTextureSize(128, 128);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, -1.047198F, 2.094395F, 0F);
		Shape4e = new LODModelPart(this, 30, 40);
		Shape4e.addBox(-3F, -7F, 4.2F, 6, 6, 1);
		Shape4e.setRotationPoint(0F, 16.5F, 0F);
		Shape4e.setTextureSize(128, 128);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, -1.047198F, -2.094395F, 0F);
		Shape3b = new LODModelPart(this, 50, 0);
		Shape3b.addBox(0F, 0F, 0F, 8, 1, 8);
		Shape3b.setRotationPoint(-4F, 19.5F, -4F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 50, 0);
		Shape3a.addBox(-4F, 0F, -4F, 8, 1, 8);
		Shape3a.setRotationPoint(0F, 19.5F, 0F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 1.047198F, 0F);
		Shape2a = new LODModelPart(this, 0, 33);
		Shape2a.addBox(0F, 0F, 0F, 4, 1, 4);
		Shape2a.setRotationPoint(-2F, 20F, -2F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 33);
		Shape2b.addBox(-2F, 0F, -2F, 4, 1, 4);
		Shape2b.setRotationPoint(0F, 20F, 0F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 1.047198F, 0F);
		Shape5 = new LODModelPart(this, 0, 50);
		Shape5.addBox(-1.5F, 1.5F, 7.8F, 3, 1, 1);
		Shape5.setRotationPoint(0F, 19.7F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0.5235988F, -2.617994F, 0F);
		Shape5b = new LODModelPart(this, 10, 50);
		Shape5b.addBox(-1.5F, 1.5F, 7.8F, 3, 1, 1);
		Shape5b.setRotationPoint(0F, 19.7F, 0F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0.5235988F, 0.5235988F, 0F);
		Shape5c = new LODModelPart(this, 10, 54);
		Shape5c.addBox(-1.5F, 1.5F, 7.8F, 3, 1, 1);
		Shape5c.setRotationPoint(0F, 19.7F, 0F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0.5235988F, 1.570796F, 0F);
		Shape5d = new LODModelPart(this, 0, 54);
		Shape5d.addBox(-1.5F, 1.5F, 7.8F, 3, 1, 1);
		Shape5d.setRotationPoint(0F, 19.7F, 0F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0.5235988F, -1.570796F, 0F);
		Shape5e = new LODModelPart(this, 0, 58);
		Shape5e.addBox(-1.5F, 1.5F, 7.8F, 3, 1, 1);
		Shape5e.setRotationPoint(0F, 19.7F, 0F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0.5235988F, -0.5235988F, 0F);
		Shape5f = new LODModelPart(this, 10, 58);
		Shape5f.addBox(-1.5F, 1.5F, 7.8F, 3, 1, 1);
		Shape5f.setRotationPoint(0F, 19.7F, 0F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, 0.5235988F, 2.617994F, 0F);
		Shape6 = new LODModelPart(this, 0, 66);
		Shape6.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6.setRotationPoint(0F, 17F, -3F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 0, 66);
		Shape6a.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6a.setRotationPoint(-1F, 18F, -2F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 0, 66);
		Shape6b.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6b.setRotationPoint(0F, 19F, 0F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
		Shape6c = new LODModelPart(this, 0, 66);
		Shape6c.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6c.setRotationPoint(-1F, 19F, -3F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 0F, 0F);
		Shape6d = new LODModelPart(this, 0, 66);
		Shape6d.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6d.setRotationPoint(-3F, 18F, -1F);
		Shape6d.setTextureSize(128, 128);
		Shape6d.mirror = true;
		this.setRotation(Shape6d, 0F, 0F, 0F);
		Shape6e = new LODModelPart(this, 0, 66);
		Shape6e.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape6e.setRotationPoint(-2F, 16F, -1F);
		Shape6e.setTextureSize(128, 128);
		Shape6e.mirror = true;
		this.setRotation(Shape6e, 0F, 0F, 0F);
		Shape6f = new LODModelPart(this, 0, 66);
		Shape6f.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6f.setRotationPoint(-1F, 18F, 2F);
		Shape6f.setTextureSize(128, 128);
		Shape6f.mirror = true;
		this.setRotation(Shape6f, 0F, 0F, 0F);
		Shape6g = new LODModelPart(this, 0, 66);
		Shape6g.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6g.setRotationPoint(1F, 17F, 1F);
		Shape6g.setTextureSize(128, 128);
		Shape6g.mirror = true;
		this.setRotation(Shape6g, 0F, 0F, 0F);
		Shape6h = new LODModelPart(this, 0, 66);
		Shape6h.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape6h.setRotationPoint(1F, 16F, 0F);
		Shape6h.setTextureSize(128, 128);
		Shape6h.mirror = true;
		this.setRotation(Shape6h, 0F, 0F, 0F);
		Shape6i = new LODModelPart(this, 0, 66);
		Shape6i.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6i.setRotationPoint(-1F, 17F, 0F);
		Shape6i.setTextureSize(128, 128);
		Shape6i.mirror = true;
		this.setRotation(Shape6i, 0F, 0F, 0F);
		Shape6j = new LODModelPart(this, 0, 66);
		Shape6j.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6j.setRotationPoint(0F, 19F, 2F);
		Shape6j.setTextureSize(128, 128);
		Shape6j.mirror = true;
		this.setRotation(Shape6j, 0F, 0F, 0F);
		Shape6k = new LODModelPart(this, 0, 66);
		Shape6k.addBox(0F, 0F, 0F, 1, 4, 1);
		Shape6k.setRotationPoint(-1F, 16F, 1F);
		Shape6k.setTextureSize(128, 128);
		Shape6k.mirror = true;
		this.setRotation(Shape6k, 0F, 0F, 0F);
		Shape6l = new LODModelPart(this, 0, 66);
		Shape6l.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6l.setRotationPoint(1F, 17F, -2F);
		Shape6l.setTextureSize(128, 128);
		Shape6l.mirror = true;
		this.setRotation(Shape6l, 0F, 0F, 0F);
		Shape6m = new LODModelPart(this, 0, 66);
		Shape6m.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6m.setRotationPoint(2F, 18F, 0F);
		Shape6m.setTextureSize(128, 128);
		Shape6m.mirror = true;
		this.setRotation(Shape6m, 0F, 0F, 0F);
		Shape6n = new LODModelPart(this, 0, 66);
		Shape6n.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6n.setRotationPoint(2F, 19F, -1F);
		Shape6n.setTextureSize(128, 128);
		Shape6n.mirror = true;
		this.setRotation(Shape6n, 0F, 0F, 0F);
		Shape6o = new LODModelPart(this, 0, 66);
		Shape6o.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape6o.setRotationPoint(0F, 15F, -1F);
		Shape6o.setTextureSize(128, 128);
		Shape6o.mirror = true;
		this.setRotation(Shape6o, 0F, 0F, 0F);
		Shape6p = new LODModelPart(this, 0, 66);
		Shape6p.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6p.setRotationPoint(-1F, 19F, -1F);
		Shape6p.setTextureSize(128, 128);
		Shape6p.mirror = true;
		this.setRotation(Shape6p, 0F, 0F, 0F);
		Shape6q = new LODModelPart(this, 0, 66);
		Shape6q.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6q.setRotationPoint(1F, 18F, -1F);
		Shape6q.setTextureSize(128, 128);
		Shape6q.mirror = true;
		this.setRotation(Shape6q, 0F, 0F, 0F);
		Shape6r = new LODModelPart(this, 0, 66);
		Shape6r.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6r.setRotationPoint(-3F, 17F, 0F);
		Shape6r.setTextureSize(128, 128);
		Shape6r.mirror = true;
		this.setRotation(Shape6r, 0F, 0F, 0F);
		Shape6s = new LODModelPart(this, 0, 66);
		Shape6s.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6s.setRotationPoint(0F, 19F, -2F);
		Shape6s.setTextureSize(128, 128);
		Shape6s.mirror = true;
		this.setRotation(Shape6s, 0F, 0F, 0F);
		Shape6t = new LODModelPart(this, 0, 66);
		Shape6t.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6t.setRotationPoint(-2F, 17F, -2F);
		Shape6t.setTextureSize(128, 128);
		Shape6t.mirror = true;
		this.setRotation(Shape6t, 0F, 0F, 0F);
		Shape6u = new LODModelPart(this, 0, 66);
		Shape6u.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6u.setRotationPoint(-2F, 18F, 0F);
		Shape6u.setTextureSize(128, 128);
		Shape6u.mirror = true;
		this.setRotation(Shape6u, 0F, 0F, 0F);
		Shape6v = new LODModelPart(this, 0, 66);
		Shape6v.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape6v.setRotationPoint(0F, 18F, 1F);
		Shape6v.setTextureSize(128, 128);
		Shape6v.mirror = true;
		this.setRotation(Shape6v, 0F, 0F, 0F);
		Shape6w = new LODModelPart(this, 0, 66);
		Shape6w.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6w.setRotationPoint(-2F, 19F, 1F);
		Shape6w.setTextureSize(128, 128);
		Shape6w.mirror = true;
		this.setRotation(Shape6w, 0F, 0F, 0F);


		ArrayList<LODModelPart> li = new ArrayList();
		li.add(Shape6);
		li.add(Shape6a);
		li.add(Shape6b);
		li.add(Shape6c);
		li.add(Shape6d);
		li.add(Shape6e);
		li.add(Shape6f);
		li.add(Shape6g);
		li.add(Shape6h);
		li.add(Shape6i);
		li.add(Shape6j);
		li.add(Shape6k);
		li.add(Shape6l);
		li.add(Shape6m);
		li.add(Shape6n);
		li.add(Shape6o);
		li.add(Shape6p);
		li.add(Shape6q);
		li.add(Shape6r);
		li.add(Shape6s);
		li.add(Shape6t);
		li.add(Shape6u);
		li.add(Shape6v);
		li.add(Shape6w);
		crystal = li.toArray(new LODModelPart[li.size()]);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li) {

		CrystalElement e = (CrystalElement)li.get(0);
		double tick = (Double)li.get(1);

		GL11.glColor4f(1, 1, 1, 1);
		int pass = MinecraftForgeClient.getRenderPass();
		switch (pass) {
			case 0:
			case -1:
				Shape1.render(te, f5);
				Shape1a.render(te, f5);
				Shape1b.render(te, f5);
				Shape2.render(te, f5);
				Shape3.render(te, f5);
				Shape4.render(te, f5);
				Shape4a.render(te, f5);
				Shape4b.render(te, f5);
				Shape4c.render(te, f5);
				Shape4d.render(te, f5);
				Shape4e.render(te, f5);
				Shape3b.render(te, f5);
				Shape3a.render(te, f5);
				Shape2a.render(te, f5);
				Shape2b.render(te, f5);
				Shape5.render(te, f5);
				Shape5b.render(te, f5);
				Shape5c.render(te, f5);
				Shape5d.render(te, f5);
				Shape5e.render(te, f5);
				Shape5f.render(te, f5);
				if (pass != -1)
					break;
			case 1:
				for (int i = 0; i < crystal.length; i++) {
					LODModelPart p = crystal[i];
					int color = RenderColoredAltar.getBlendedCrystalColor(e, i, tick);
					float r = ReikaColorAPI.getRed(color)/255F;
					float g = ReikaColorAPI.getGreen(color)/255F;
					float b = ReikaColorAPI.getBlue(color)/255F;
					float a = ReikaColorAPI.getAlpha(color)/255F;
					GL11.glColor4f(r, g, b, a);
					p.render(te, f5);
				}
				break;
		}
		GL11.glColor4f(1, 1, 1, 1);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
