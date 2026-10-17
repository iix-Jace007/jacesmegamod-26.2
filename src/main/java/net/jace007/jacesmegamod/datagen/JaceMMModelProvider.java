package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.jace007.jacesmegamod.item.JaceMMItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;

public class JaceMMModelProvider extends ModelProvider {
    public JaceMMModelProvider(PackOutput output) {
        super(output, JacesMegaMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(JaceMMItems.GOTHITE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(JaceMMItems.BALLOONITE.get(), ModelTemplates.FLAT_ITEM);

        /* Blocks */
        blockModels.createTrivialCube(JacesMMBlocks.BALLOONITE_BLOCK.get());
        blockModels.createTrivialCube(JacesMMBlocks.BALLOONITE_ORE.get());

        blockModels.woodProvider(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get())
                .logWithHorizontal(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get())
                .wood(JacesMMBlocks.ATOWN_TRUMPHWOOD_WOOD.get());
        blockModels.woodProvider(JacesMMBlocks.AGRABAH_CEDAR_LOG.get())
                .logWithHorizontal(JacesMMBlocks.AGRABAH_CEDAR_LOG.get())
                .wood(JacesMMBlocks.AGRABAH_CEDAR_WOOD.get());

        blockModels.woodProvider(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG.get())
                .logWithHorizontal(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG.get())
                .wood(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_WOOD.get());
        blockModels.woodProvider(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get())
                .logWithHorizontal(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get())
                .wood(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_WOOD.get());

        blockModels.createTrivialCube(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get());
        blockModels.createTrivialCube(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get());

        blockModels.createTintedLeaves(JacesMMBlocks.ATOWN_TRUMPHWOOD_LEAVES.get(),
                TexturedModel.LEAVES, -2012265);
        blockModels.createTintedLeaves(JacesMMBlocks.AGRABAH_CEDAR_LEAVES.get(),
                TexturedModel.LEAVES, -2012265);

        //blockModels.createPlantWithDefaultItem(JacesMMBlocks.ATOWN_TRUMPHWOOD_SAPLING.get(),
        //        JacesMMBlocks.POTTED_ATOWN_TRUMPHWOOD_SAPLING.get(),
        //        BlockModelGenerators.PlantType.NOT_TINTED));
        // blockModels.createPlantWithDefaultItem(JacesMMBlocks.AGRABAH_CEDAR_SAPLING.get(),
        //        JacesMMBlocks.POTTED_AGRABAH_CEDAR_SAPLING.get(),
        //        BlockModelGenerators.PlantType.NOT_TINTED));

        blockModels.family(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get())
                .stairs(JacesMMBlocks.ATOWN_TRUMPHWOOD_STAIRS.get())
                .slab(JacesMMBlocks.ATOWN_TRUMPHWOOD_SLAB.get())
                .pressurePlate(JacesMMBlocks.ATOWN_TRUMPHWOOD_PRESSUREPLATE.get())
                .button(JacesMMBlocks.ATOWN_TRUMPHWOOD_BUTTON.get())
                .fence(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE.get())
                .fenceGate(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE_GATE.get())
                .door(JacesMMBlocks.ATOWN_TRUMPHWOOD_DOOR.get())
                .trapdoor(JacesMMBlocks.ATOWN_TRUMPHWOOD_TRAPDOOR.get());
        blockModels.family(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get())
                .stairs(JacesMMBlocks.AGRABAH_CEDAR_STAIRS.get())
                .slab(JacesMMBlocks.AGRABAH_CEDAR_SLAB.get())
                .pressurePlate(JacesMMBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get())
                .button(JacesMMBlocks.AGRABAH_CEDAR_BUTTON.get())
                .fence(JacesMMBlocks.AGRABAH_CEDAR_FENCE.get())
                .fenceGate(JacesMMBlocks.AGRABAH_CEDAR_FENCE_GATE.get())
                .door(JacesMMBlocks.AGRABAH_CEDAR_DOOR.get())
                .trapdoor(JacesMMBlocks.AGRABAH_CEDAR_TRAPDOOR.get());

        blockModels.family(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get())
                .stairs(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_STAIRS.get())
                .slab(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_SLAB.get())
                .fence(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE.get())
                .fenceGate(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE_GATE.get())
                .trapdoor(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_TRAPDOOR.get());
        blockModels.family(JacesMMBlocks.AGRABAH_CEDAR_LOG.get())
                .stairs(JacesMMBlocks.AGRABAH_CEDAR_LOG_STAIRS.get())
                .slab(JacesMMBlocks.AGRABAH_CEDAR_LOG_SLAB.get())
                .fence(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE.get())
                .fenceGate(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get())
                .trapdoor(JacesMMBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get());

        blockModels.family(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG.get())
                .stairs(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_STAIRS.get())
                .slab(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_SLAB.get());
        blockModels.family(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get())
                .stairs(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get())
                .slab(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get());
    }
}
