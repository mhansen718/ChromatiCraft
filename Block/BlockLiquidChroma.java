/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Block;

import java.awt.Color;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import Reika.DragonAPI.Libraries.IO.ReikaSoundHelper;
import Reika.DragonAPI.Libraries.Registry.ReikaDyeHelper;
import Reika.DragonAPI.Libraries.Registry.ReikaParticleHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidChroma extends BlockFluidClassic {

	public Icon[] theIcon = new Icon[2];

	public BlockLiquidChroma(int id, Fluid fluid, Material material) {
		super(id, fluid, material);
		this.setCreativeTab(null);

		this.setHardness(100F);
		this.setLightOpacity(0);
		this.setResistance(500);
		renderPass = 1;
	}

	@Override
	public Icon getIcon(int s, int meta) {
		renderPass = 1;
		this.setLightValue(1);
		return s <= 1 ? theIcon[0] : theIcon[1];
	}

	@Override
	public boolean isBlockReplaceable(World world, int x, int y, int z) {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ico) {
		theIcon = new Icon[]{ico.registerIcon("chromaticraft:fluid/chroma"), ico.registerIcon("chromaticraft:fluid/chroma_flowing")};
	}

	@Override
	public Fluid getFluid() {
		return FluidRegistry.getFluid("chroma");
	}

	@Override
	public FluidStack drain(World world, int x, int y, int z, boolean doDrain) {
		world.setBlock(x, y, z, 0);
		return new FluidStack(FluidRegistry.getFluid("chroma"), 1000);
	}

	@Override
	public boolean canDrain(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random r) {
		Color c = ReikaDyeHelper.getRandomColor().getJavaColor().brighter().brighter().brighter().brighter();
		ReikaParticleHelper.spawnColoredParticles(world, x, y, z, c.getRed()/255F, c.getGreen()/255F, c.getBlue()/255F, 2);
		ReikaSoundHelper.playSoundAtBlock(world, x, y, z, "random.explode");
	}

}
