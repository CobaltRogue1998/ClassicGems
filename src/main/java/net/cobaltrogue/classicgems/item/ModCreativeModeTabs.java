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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("CREATIVE_MODE_TAB.classic_gems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.PERIDOT);
                        output.accept(ModBlocks.SAPPHIRE_ORE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
