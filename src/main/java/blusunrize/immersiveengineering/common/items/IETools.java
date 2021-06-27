/*
 * BluSunrize
 * Copyright (c) 2017
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 */

package blusunrize.immersiveengineering.common.items;

import blusunrize.immersiveengineering.ImmersiveEngineering;
import net.minecraft.item.*;

import java.util.function.Supplier;

public class IETools
{
	public static Supplier<ShovelItem> createShovel(IItemTier tier)
	{
		return () -> new ShovelItem(tier, 1.5f, -3.0f, toolProperties());
	}

	public static Supplier<AxeItem> createAxe(IItemTier tier)
	{
		return () -> new AxeItem(tier, 5.5f, -3.1f, toolProperties());
	}

	public static Supplier<PickaxeItem> createPickaxe(IItemTier tier)
	{
		return () -> new PickaxeItem(tier, 1, -2.8f, toolProperties());
	}

	public static Supplier<SwordItem> createSword(IItemTier tier)
	{
		return () -> new SwordItem(tier, 3, -2.4F, toolProperties());
	}

	public static Supplier<HoeItem> createHoe(IItemTier tier)
	{
		return () -> new HoeItem(tier, (int)-tier.getAttackDamage(), 0.0F, toolProperties());
	}

	private static Item.Properties toolProperties()
	{
		return new Item.Properties().group(ImmersiveEngineering.ITEM_GROUP).maxStackSize(1);
	}
}
