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

public class SheetmetalTankMultiblock extends IETemplateMultiblock
{
	public SheetmetalTankMultiblock()
	{
		super(new ResourceLocation(ImmersiveEngineering.MODID, "multiblocks/sheetmetal_tank"),
				new BlockPos(1, 0, 1), new BlockPos(1, 1, 2), new BlockPos(3, 5, 3),
				Multiblocks.tank);
	}

	@Override
	public float getManualScale()
	{
		return 12;
	}
}