package net.cobaltrogue.classicgems.block;

import net.cobaltrogue.classicgems.ClassicGems;
import net.cobaltrogue.classicgems.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ClassicGems.MOD_ID);

    public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .destroyTime(3.0f)
                            .explosionResistance(10.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .destroyTime(4.0f)
                            .explosionResistance(10.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of()
                            .destroyTime(5.0f)
                            .explosionResistance(6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> PERIDOT_ORE = registerBlock("peridot_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .destroyTime(3.0f)
                            .explosionResistance(10.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .destroyTime(4.0f)
                            .explosionResistance(10.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .destroyTime(3.0f)
                            .explosionResistance(10.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of()
                            .destroyTime(4.0f)
                            .explosionResistance(10.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}