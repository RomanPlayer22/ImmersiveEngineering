/*
 * BluSunrize
 * Copyright (c) 2017
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 */

package blusunrize.immersiveengineering.common.blocks.multiblocks;

import blusunrize.immersiveengineering.ImmersiveEngineering;
import blusunrize.immersiveengineering.common.register.IEBlocks.Multiblocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;

public class FermenterMultiblock extends IETemplateMultiblock
{
	public FermenterMultiblock()
	{
		super(
				new ResourceLocation(ImmersiveEngineering.MODID, "multiblocks/fermenter"),
				new BlockPos(1, 1, 1), new BlockPos(1, 1, 1), new BlockPos(3, 3, 3),
				Multiblocks.fermenter
		);
	}

	@Override
	public float getManualScale()
	{
		return 12;
	}
}
