package net.cobaltrogue.classicgems.item;

import net.cobaltrogue.classicgems.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier PERIDOT = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_PERIDOT_TOOL,
            768, 8.0f, 1.0f, 14, () -> Ingredient.of(ModItems.PERIDOT));
    public static final Tier SAPPHIRE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL,
            768, 8.0f, 1.0f, 14, () -> Ingredient.of(ModItems.SAPPHIRE));
    public static final Tier RUBY = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            768, 8.0f, 1.0f, 14, () -> Ingredient.of(ModItems.RUBY));
}