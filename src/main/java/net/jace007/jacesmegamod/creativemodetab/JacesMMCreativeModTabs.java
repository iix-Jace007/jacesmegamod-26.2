package net.jace007.jacesmegamod.creativemodetab;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.jace007.jacesmegamod.item.JaceMMItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JacesMMCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JacesMegaMod.MOD_ID);

    public static final Supplier<CreativeModeTab> JMM_ORES_TAB = CREATIVE_MODE_TABS.register("jmm_ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(JaceMMItems.BALLOONITE.get()))
                    .title(Component.translatable("creativetab.jacesmegamod.jmm_ores"))
                    .withTabsAfter(Identifier.fromNamespaceAndPath(JacesMegaMod.MOD_ID, "jmm_wood_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(JaceMMItems.BALLOONITE);
                        output.accept(JacesMMBlocks.BALLOONITE_BLOCK);
                        output.accept(JacesMMBlocks.BALLOONITE_ORE);
                        output.accept(JaceMMItems.GOTHITE_INGOT);


                    }).build());


    public static final Supplier<CreativeModeTab> JMM_WOOD_TAB = CREATIVE_MODE_TABS.register("jmm_wood_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(JaceMMItems.BALLOONITE.get()))
                    .title(Component.translatable("creativetab.jacesmegamod.jmm_woods"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_WOOD);
                        output.accept(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG);
                        output.accept(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_WOOD);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_STAIRS);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_STAIRS);
                        output.accept(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_STAIRS);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_SLAB);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_SLAB);
                        output.accept(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_SLAB);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE_GATE);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE_GATE);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_DOOR);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_TRAPDOOR);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_TRAPDOOR);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_PRESSUREPLATE);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_BUTTON);
                        output.accept(JacesMMBlocks.ATOWN_TRUMPHWOOD_SAPLING);

                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_LOG);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_WOOD);
                        output.accept(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG);
                        output.accept(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_WOOD);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_PLANKS);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_STAIRS);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_LOG_STAIRS);
                        output.accept(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_SLAB);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_LOG_SLAB);
                        output.accept(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_FENCE);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_FENCE_GATE);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_DOOR);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_TRAPDOOR);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_PRESSUREPLATE);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_BUTTON);
                        output.accept(JacesMMBlocks.AGRABAH_CEDAR_SAPLING);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
