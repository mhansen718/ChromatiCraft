/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 28/09/2015 8:13:09 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ChromatiCraft.Models;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.tileentity.TileEntity;

import Reika.ChromatiCraft.Base.ChromaModelBase;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.DragonAPI.Libraries.IO.ReikaRenderHelper;

public class ModelFence extends ChromaModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart Shape5;

	public ModelFence()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 12, 1, 12);
		Shape1.setRotationPoint(-6F, 23F, -6F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 49, 0);
		Shape2.addBox(0F, 0F, 0F, 8, 1, 8);
		Shape2.setRotationPoint(-4F, 22F, -4F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 14);
		Shape3.addBox(0F, 0F, 0F, 4, 13, 4);
		Shape3.setRotationPoint(-2F, 9F, -2F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 26, 32);
		Shape4.addBox(0F, 0F, 0F, 5, 14, 1);
		Shape4.setRotationPoint(-7F, 10F, -0.5F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 13, 32);
		Shape4a.addBox(0F, 0F, 0F, 1, 14, 5);
		Shape4a.setRotationPoint(-0.5F, 10F, -7F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 0, 32);
		Shape4b.addBox(0F, 0F, 0F, 5, 14, 1);
		Shape4b.setRotationPoint(2F, 10F, -0.5F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 39, 32);
		Shape4c.addBox(0F, 0F, 0F, 1, 14, 5);
		Shape4c.setRotationPoint(-0.5F, 10F, 2F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 17, 14);
		Shape5.addBox(0F, 0F, 0F, 3, 1, 3);
		Shape5.setRotationPoint(-1.5F, 8F, -1.5F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li)
	{
		GL11.glPushMatrix();
		if (te.hasWorldObj()) {
			GL11.glScaled(1, 2, 1);
			GL11.glTranslated(0, -0.75, 0);
		}
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape5.render(te, f5);

		GL11.glPushAttrib(GL11.GL_LIGHTING_BIT);
		GL11.glDisable(GL11.GL_LIGHTING);
		ReikaRenderHelper.disableEntityLighting();
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);
		GL11.glPopAttrib();
		GL11.glPopMatrix();
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
