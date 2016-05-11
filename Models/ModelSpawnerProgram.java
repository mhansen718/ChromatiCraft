/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 01/08/2014 1:50:18 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;

public class ModelSpawnerProgram extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape3;
	LODModelPart Shape3a;

	public ModelSpawnerProgram()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 2, 16);
		Shape1.setRotationPoint(-8F, 22F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 24);
		Shape2.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape2.setRotationPoint(-7F, 20F, 6F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 20);
		Shape2a.addBox(0F, 0F, 0F, 14, 2, 1);
		Shape2a.setRotationPoint(-7F, 20F, -7F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 93, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 2, 12);
		Shape3.setRotationPoint(6F, 20F, -6F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 65, 0);
		Shape3a.addBox(0F, 0F, 0F, 1, 2, 12);
		Shape3a.setRotationPoint(-7F, 20F, -6F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		setRotation(Shape3a, 0F, 0F, 0F);
	}

	public void renderAll(TileEntity te, ArrayList li)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
