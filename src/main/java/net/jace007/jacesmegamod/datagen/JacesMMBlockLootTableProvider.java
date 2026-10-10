package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;

import java.util.Set;

public class JacesMMBlockLootTableProvider extends BlockLootSubProvider {
    protected JacesMMBlockLootTableProvider(Set<Item> explosionResistant, FeatureFlagSet enabledFeatures, HolderLookup.Provider registries) {
        super(explosionResistant, enabledFeatures, registries);
    }

    @Override
    protected void generate() {

        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_STAIRS.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_STAIRS.get());
        dropSelf(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get());

        add(JacesMMBlocks.AGRABAH_CEDAR_SLAB.get(), this ::createSlabItemTable);
        add(JacesMMBlocks.AGRABAH_CEDAR_LOG_SLAB.get(), this::createSlabItemTable);
        add(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(), this::createSlabItemTable);

        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_BUTTON.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_FENCE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_FENCE_GATE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_TRAPDOOR.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get());

        add(JacesMMBlocks.AGRABAH_CEDAR_DOOR.get(), this::createDoorTable);

        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_LOG.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_WOOD.get());
        dropSelf(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get());
        dropSelf(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get());

        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get());
        dropSelf(JacesMMBlocks.AGRABAH_CEDAR_SAPLING.get());

        add(JacesMMBlocks.AGRABAH_CEDAR_LEAVES.get(), block -> createLeavesDrops(block,
                JacesMMBlocks.AGRABAH_CEDAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        // add(ModBlocks.POTTED_DRIFTWOOD_SAPLING.get(), createPotFlowerItemTable(ModBlocks.DRIFTWOOD_SAPLING));

    }
}
