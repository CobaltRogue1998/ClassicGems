package net.cobaltrogue.classicgems.util;

import net.cobaltrogue.classicgems.ClassicGems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.cobaltrogue.classicgems.item.ModItems;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PERIDOT_TOOL = createTag("needs_peridot_tool");
        public static final TagKey<Block> INCORRECT_FOR_PERIDOT_TOOL = createTag("incorrect_for_peridot_tool");
        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
        public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ClassicGems.MOD_ID, name));
        }
    }

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ClassicGems.MOD_ID, name));
        }

    }