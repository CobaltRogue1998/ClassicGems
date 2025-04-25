package net.cobaltrogue.classicgems.item;

import net.cobaltrogue.classicgems.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;

public class ModToolTiers {
    public static final Tier PERIDOT = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            768, 8.0f, 1.0f, 14, () -> Ingredient.of(ModItems.PERIDOT));
    public static final Tier SAPPHIRE = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            768, 8.0f, 1.0f, 14, () -> Ingredient.of(ModItems.SAPPHIRE));
    public static final Tier RUBY = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            768, 8.0f, 1.0f, 14, () -> Ingredient.of(ModItems.RUBY));
}