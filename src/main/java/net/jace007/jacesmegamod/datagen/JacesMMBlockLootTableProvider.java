package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import java.util.Set;

public class JacesMMBlockLootTableProvider extends BlockLootSubProvider {
    public JacesMMBlockLootTableProvider(LootTableSubProvider.Context context) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), context);
    }

    @Override
    protected void generate() {

        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_STAIRS.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_STAIRS.get());
        dropSelf(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_STAIRS.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_STAIRS.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_STAIRS.get());
        dropSelf(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get());

        add(JacesMMBlocks.ATOWN_TRUMPHWOOD_SLAB.get(), this ::createSlabItemTable);
        add(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_SLAB.get(), this::createSlabItemTable);
        add(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_SLAB.get(), this::createSlabItemTable);
        add(JacesMMBlocks.AGRABAH_CEDAR_SLAB.get(), this ::createSlabItemTable);
        add(JacesMMBlocks.AGRABAH_CEDAR_LOG_SLAB.get(), this::createSlabItemTable);
        add(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(), this::createSlabItemTable);

        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_PRESSUREPLATE.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_BUTTON.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE_GATE.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE_GATE.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_TRAPDOOR.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_TRAPDOOR.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_BUTTON.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_FENCE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_FENCE_GATE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_TRAPDOOR.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get());

        add(JacesMMBlocks.ATOWN_TRUMPHWOOD_DOOR.get(), this::createDoorTable);
        add(JacesMMBlocks.AGRABAH_CEDAR_DOOR.get(), this::createDoorTable);

        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_WOOD.get());
        dropSelf(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG.get());
        dropSelf(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_WOOD.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_WOOD.get());
        dropSelf(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get());
        dropSelf(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get());

        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get());
        dropSelf(JacesMMBlocks.ATOWN_TRUMPHWOOD_SAPLING.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_SAPLING.get());

        add(JacesMMBlocks.ATOWN_TRUMPHWOOD_LEAVES.get(), block -> createLeavesDrops(block,
                JacesMMBlocks.ATOWN_TRUMPHWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(JacesMMBlocks.AGRABAH_CEDAR_LEAVES.get(), block -> createLeavesDrops(block,
                JacesMMBlocks.AGRABAH_CEDAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        // add(ModBlocks.POTTED_DRIFTWOOD_SAPLING.get(), createPotFlowerItemTable(ModBlocks.DRIFTWOOD_SAPLING));

    }

    @Override
    protected @NonNull Iterable<Block> getKnownBlocks() {
        return JacesMMBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
