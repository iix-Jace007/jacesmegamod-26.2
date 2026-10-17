package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.worldgen.JacesMMBiomeModifiers;
import net.jace007.jacesmegamod.worldgen.JacesMMConfiguredFeatures;
import net.jace007.jacesmegamod.worldgen.JacesMMPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class JacesMMDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new
            RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, JacesMMConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, JacesMMPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, JacesMMBiomeModifiers::bootstrap);

    public JacesMMDatapackProvider(PackOutput output, CompletableFuture<RegistrySetBuilder.PatchedRegistries> registries, Set<String> modIds) {
        super(output, registries, modIds);

        RegistrySetBuilder RELOADABLE_BUILDER = new RegistrySetBuilder()
                .add(Registries.LOOT_TABLE, new LootTableProvider(Set.of(), List.of(
                        new LootTableProvider.SubProviderEntry(JacesMMBlockLootTableProvider::new, LootContextParamSets.BLOCK))));
    }
}
