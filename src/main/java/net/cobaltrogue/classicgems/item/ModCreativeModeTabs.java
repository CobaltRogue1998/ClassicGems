package net.cobaltrogue.classicgems.item;

import net.cobaltrogue.classicgems.ClassicGems;
import net.cobaltrogue.classicgems.block.ModBlocks;
import net.cobaltrogue.classicgems.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClassicGems.MOD_ID);

    public static final Supplier<CreativeModeTab> CLASSIC_GEMS_TAB = CREATIVE_MODE_TAB.register("classic_gems",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("CREATIVE_MODE_TAB.classic_gems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.PERIDOT);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        output.accept(ModBlocks.PERIDOT_ORE);
                        output.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE);

                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.PERIDOT_BLOCK);

                        output.accept(ModItems.RUBY_SHOVEL);
                        output.accept(ModItems.RUBY_PICKAXE);
                        output.accept(ModItems.RUBY_AXE);
                        output.accept(ModItems.RUBY_HOE);
                        output.accept(ModItems.RUBY_SWORD);

                        output.accept(ModItems.SAPPHIRE_SHOVEL);
                        output.accept(ModItems.SAPPHIRE_PICKAXE);
                        output.accept(ModItems.SAPPHIRE_AXE);
                        output.accept(ModItems.SAPPHIRE_HOE);
                        output.accept(ModItems.SAPPHIRE_SWORD);

                        output.accept(ModItems.PERIDOT_SHOVEL);
                        output.accept(ModItems.PERIDOT_PICKAXE);
                        output.accept(ModItems.PERIDOT_AXE);
                        output.accept(ModItems.PERIDOT_HOE);
                        output.accept(ModItems.PERIDOT_SWORD);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
