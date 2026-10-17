package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.jace007.jacesmegamod.item.JaceMMItems;
import net.jace007.jacesmegamod.tags.JacesMMTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class JacesMMItemTagsProvider extends ItemTagsProvider {
    public JacesMMItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, JacesMegaMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ItemTags.PLANKS)
                .add(JaceMMItems.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.asItem()));

        tag(ItemTags.LOGS_THAT_BURN)
                .add(JaceMMItems.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_WOOD.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_WOOD.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.AGRABAH_CEDAR_WOOD.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.asItem()));

        tag(JacesMMTags.Items.ATOWN_TRUMPHWOOD_LOGS)
                .add(JaceMMItems.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.ATOWN_TRUMPHWOOD_WOOD.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_WOOD.asItem()));

        tag(JacesMMTags.Items.AGRABAH_CEDAR_LOGS)
                .add(JaceMMItems.getRK(JacesMMBlocks.AGRABAH_CEDAR_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.AGRABAH_CEDAR_WOOD.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.asItem()))
                .add(JaceMMItems.getRK(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.asItem()));

    }
}
