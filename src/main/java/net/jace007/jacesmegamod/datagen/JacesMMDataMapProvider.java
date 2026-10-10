package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.concurrent.CompletableFuture;

public class JacesMMDataMapProvider extends DataMapProvider {
    /**
     * Create a new provider.
     *
     * @param packOutput     the output location
     * @param lookupProvider a {@linkplain CompletableFuture} supplying the registries
     */
    protected JacesMMDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {

        builder(NeoForgeDataMaps.STRIPPABLES)
                .add(JacesMMBlocks.AGRABAH_CEDAR_LOG, new Strippable(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()), false)
                .add(JacesMMBlocks.AGRABAH_CEDAR_WOOD, new Strippable(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get()), false);

    }
}
