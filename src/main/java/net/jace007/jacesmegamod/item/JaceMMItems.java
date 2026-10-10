package net.jace007.jacesmegamod.item;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JaceMMItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JacesMegaMod.MOD_ID);

    public static final DeferredItem<Item> GOTHITE_INGOT = ITEMS.registerSimpleItem("gothite_ingot");
    public static final DeferredItem<Item> BALLOONITE = ITEMS.registerSimpleItem("balloonite");

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
