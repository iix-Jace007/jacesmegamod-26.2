package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.jace007.jacesmegamod.tags.JacesMMTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class JacesMMRecipeProvider extends RecipeProvider {
    protected JacesMMRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }
    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new JacesMMRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "JacesMegaMod Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        // ATOWN_TRUMPHWOOD
        woodFromLogs(JacesMMBlocks.ATOWN_TRUMPHWOOD_WOOD, JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG);
        woodFromLogs(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG, JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG);
        planksFromLog(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS, JacesMMTags.Items.ATOWN_TRUMPHWOOD_LOGS, 4);
        stairBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_STAIRS.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS))
                .group("atown_trumphwood").save(output);
        stairBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_STAIRS.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get()))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG))
                .group("atown_trumphwood").save(output);
        stairBuilder(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_STAIRS.get(), Ingredient.of(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG))
                .unlockedBy(getHasName(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG.get()), has(JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG))
                .group("atown_trumphwood").save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, JacesMMBlocks.ATOWN_TRUMPHWOOD_SLAB.get(), JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get());
        slab(RecipeCategory.BUILDING_BLOCKS, JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_SLAB.get(), JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get());
        slab(RecipeCategory.BUILDING_BLOCKS, JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG_SLAB.get(), JacesMMBlocks.STRIPPED_ATOWN_TRUMPHWOOD_LOG);
        fenceBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS))
                .group("atown_trumphwood").save(output);
        fenceBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG))
                .group("atown_trumphwood").save(output);
        fenceGateBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_FENCE_GATE.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS))
                .group("atown_trumphwood").save(output);
        fenceGateBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_FENCE_GATE.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG))
                .group("atown_trumphwood").save(output);
        doorBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_DOOR.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS))
                .group("atown_trumphwood").save(output);
        trapdoorBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_TRAPDOOR.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS))
                .group("atown_trumphwood").save(output);
        trapdoorBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG_TRAPDOOR.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get()))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_LOG))
                .group("atown_trumphwood").save(output);
        buttonBuilder(JacesMMBlocks.ATOWN_TRUMPHWOOD_BUTTON.get(), Ingredient.of(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS.get()), has(JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS))
                .group("atown_trumphwood").save(output);
        pressurePlate(JacesMMBlocks.ATOWN_TRUMPHWOOD_PRESSUREPLATE.get(), JacesMMBlocks.ATOWN_TRUMPHWOOD_PLANKS);

        // Agrabah Cedar
        woodFromLogs(JacesMMBlocks.AGRABAH_CEDAR_WOOD, JacesMMBlocks.AGRABAH_CEDAR_LOG);
        woodFromLogs(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG, JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG);
        planksFromLog(JacesMMBlocks.AGRABAH_CEDAR_PLANKS, JacesMMTags.Items.AGRABAH_CEDAR_LOGS, 4);
        stairBuilder(JacesMMBlocks.AGRABAH_CEDAR_STAIRS.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()), has(JacesMMBlocks.AGRABAH_CEDAR_PLANKS))
                .group("agrabah_cedar").save(output);
        stairBuilder(JacesMMBlocks.AGRABAH_CEDAR_LOG_STAIRS.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()), has(JacesMMBlocks.AGRABAH_CEDAR_LOG))
                .group("agrabah_cedar").save(output);
        stairBuilder(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_STAIRS.get(), Ingredient.of(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG))
                .unlockedBy(getHasName(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get()), has(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG))
                .group("agrabah_cedar").save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, JacesMMBlocks.AGRABAH_CEDAR_SLAB.get(), JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get());
        slab(RecipeCategory.BUILDING_BLOCKS, JacesMMBlocks.AGRABAH_CEDAR_LOG_SLAB.get(), JacesMMBlocks.AGRABAH_CEDAR_LOG.get());
        slab(RecipeCategory.BUILDING_BLOCKS, JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG_SLAB.get(), JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG);
        fenceBuilder(JacesMMBlocks.AGRABAH_CEDAR_FENCE.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()), has(JacesMMBlocks.AGRABAH_CEDAR_PLANKS))
                .group("agrabah_cedar").save(output);
        fenceBuilder(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_LOG))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()), has(JacesMMBlocks.AGRABAH_CEDAR_LOG))
                .group("agrabah_cedar").save(output);
        fenceGateBuilder(JacesMMBlocks.AGRABAH_CEDAR_FENCE_GATE.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_PLANKS))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()), has(JacesMMBlocks.AGRABAH_CEDAR_PLANKS))
                .group("agrabah_cedar").save(output);
        fenceGateBuilder(JacesMMBlocks.AGRABAH_CEDAR_LOG_FENCE_GATE.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_LOG))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()), has(JacesMMBlocks.AGRABAH_CEDAR_LOG))
                .group("agrabah_cedar").save(output);
        doorBuilder(JacesMMBlocks.AGRABAH_CEDAR_DOOR.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()), has(JacesMMBlocks.AGRABAH_CEDAR_PLANKS))
                .group("agrabah_cedar").save(output);
        trapdoorBuilder(JacesMMBlocks.AGRABAH_CEDAR_TRAPDOOR.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()))
                 .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()), has(JacesMMBlocks.AGRABAH_CEDAR_PLANKS))
                 .group("agrabah_cedar").save(output);
        trapdoorBuilder(JacesMMBlocks.AGRABAH_CEDAR_LOG_TRAPDOOR.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()), has(JacesMMBlocks.AGRABAH_CEDAR_LOG))
                .group("agrabah_cedar").save(output);
        buttonBuilder(JacesMMBlocks.AGRABAH_CEDAR_BUTTON.get(), Ingredient.of(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()))
                .unlockedBy(getHasName(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get()), has(JacesMMBlocks.AGRABAH_CEDAR_PLANKS))
                .group("agrabah_cedar").save(output);
        pressurePlate(JacesMMBlocks.AGRABAH_CEDAR_PRESSUREPLATE.get(), JacesMMBlocks.AGRABAH_CEDAR_PLANKS);

    }
}
