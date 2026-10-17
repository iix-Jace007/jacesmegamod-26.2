package net.jace007.jacesmegamod;

import net.jace007.jacesmegamod.datagen.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = JacesMegaMod.MOD_ID)
public class JacesMegaModDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new JaceMMModelProvider(packOutput));
        generator.addProvider(true, new JacesMMBlockTagsProvider(packOutput, lookupProvider));
        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(
                        new LootTableProvider.SubProviderEntry(JacesMMBlockLootTableProvider::new, LootContextParamSets.BLOCK)
                ), lookupProvider));
        generator.addProvider(true, new JacesMMRecipeProvider.Runner(packOutput, lookupProvider));
        generator.addProvider(true, new JacesMMDataMapProvider(packOutput, lookupProvider));
        generator.addProvider(true, new JacesMMItemTagsProvider(packOutput, lookupProvider));

        generator.addProvider(true, new JacesMMDatapackProvider(packOutput, lookupProvider));
    }
}
