/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 24/08/2015 11:48:00 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;

public class ModelTurbo extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape2d;
	LODModelPart Shape2e;
	LODModelPart Shape2f;
	LODModelPart Shape2g;

	public ModelTurbo()
	{
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 55, 0);
		Shape1.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape1.setRotationPoint(-1F, 16F, -1F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 0);
		Shape1a.addBox(0F, 0F, 0F, 6, 3, 6);
		Shape1a.setRotationPoint(-3F, 21F, -3F);
		Shape1a.setTextureSize(64, 32);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 25, 0);
		Shape1b.addBox(0F, 0F, 0F, 4, 2, 4);
		Shape1b.setRotationPoint(-2F, 19F, -2F);
		Shape1b.setTextureSize(64, 32);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape1c = new LODModelPart(this, 42, 0);
		Shape1c.addBox(0F, 0F, 0F, 3, 1, 3);
		Shape1c.setRotationPoint(-1.5F, 17.86667F, -1.5F);
		Shape1c.setTextureSize(64, 32);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 25);
		Shape2.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape2.setRotationPoint(-1F, 22F, 3F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 9, 20);
		Shape2a.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape2a.setRotationPoint(-1F, 23F, -7F);
		Shape2a.setTextureSize(64, 32);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 10);
		Shape2b.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape2b.setRotationPoint(-1F, 22F, -5F);
		Shape2b.setTextureSize(64, 32);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 0, 15);
		Shape2c.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape2c.setRotationPoint(3F, 22F, -1F);
		Shape2c.setTextureSize(64, 32);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape2d = new LODModelPart(this, 0, 20);
		Shape2d.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape2d.setRotationPoint(-5F, 22F, -1F);
		Shape2d.setTextureSize(64, 32);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 0F);
		Shape2e = new LODModelPart(this, 9, 15);
		Shape2e.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape2e.setRotationPoint(-7F, 23F, -1F);
		Shape2e.setTextureSize(64, 32);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, 0F);
		Shape2f = new LODModelPart(this, 9, 25);
		Shape2f.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape2f.setRotationPoint(5F, 23F, -1F);
		Shape2f.setTextureSize(64, 32);
		Shape2f.mirror = true;
		this.setRotation(Shape2f, 0F, 0F, 0F);
		Shape2g = new LODModelPart(this, 9, 10);
		Shape2g.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape2g.setRotationPoint(-1F, 23F, 5F);
		Shape2g.setTextureSize(64, 32);
		Shape2g.mirror = true;
		this.setRotation(Shape2g, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li) {
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape2d.render(te, f5);
		Shape2e.render(te, f5);
		Shape2f.render(te, f5);
		Shape2g.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
