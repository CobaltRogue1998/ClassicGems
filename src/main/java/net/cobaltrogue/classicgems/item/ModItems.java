package net.cobaltrogue.classicgems.item;

import net.cobaltrogue.classicgems.ClassicGems;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ClassicGems.MOD_ID);

    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<SwordItem> PERIDOT_SWORD = ITEMS.register("peridot_sword",
            () -> new SwordItem(ModToolTiers.PERIDOT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PERIDOT, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PERIDOT, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PERIDOT, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel",
            () -> new ShovelItem(ModToolTiers.PERIDOT, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PERIDOT, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> PERIDOT_AXE = ITEMS.register("peridot_axe",
            () -> new AxeItem(ModToolTiers.PERIDOT, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PERIDOT, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> PERIDOT_HOE = ITEMS.register("peridot_hoe",
            () -> new HoeItem(ModToolTiers.PERIDOT, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PERIDOT, 0F, -3.0f))));

    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.RUBY, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.RUBY, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.RUBY, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.RUBY, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.RUBY, 0F, -3.0f))));

    public static final DeferredItem<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SAPPHIRE, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SAPPHIRE, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SAPPHIRE, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SAPPHIRE, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SAPPHIRE, 0F, -3.0f))));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

