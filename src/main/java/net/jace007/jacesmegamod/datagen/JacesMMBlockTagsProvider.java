package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class JacesMMBlockTagsProvider extends BlockTagsProvider {
    public JacesMMBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, JacesMegaMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.STAIRS)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get()));

        tag(BlockTags.WOODEN_STAIRS)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG_STAIRS.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get()));

        tag(BlockTags.SLABS)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get()));

        tag(BlockTags.WOODEN_SLABS)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG_SLAB.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get()));

        tag(BlockTags.PRESSURE_PLATES)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_PRESSUREPLATE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get()));

        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_PRESSUREPLATE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get()));

        tag(BlockTags.BUTTONS)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_BUTTON.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_BUTTON.get()));

        tag(BlockTags.WOODEN_BUTTONS)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_BUTTON.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_BUTTON.get()));

        tag(BlockTags.FENCES)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_FENCE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE.get()));

        tag(BlockTags.WOODEN_FENCES)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_FENCE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE.get()));

        tag(BlockTags.FENCE_GATES)
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE_GATE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE_GATE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_FENCE_GATE.get()))
                .add(JacesMMBlocks.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get()));


    }
}