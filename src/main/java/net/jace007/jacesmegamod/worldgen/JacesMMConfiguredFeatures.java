package net.jace007.jacesmegamod.worldgen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class JacesMMConfiguredFeatures {
    // Feature --> Any Type of "build"
    // A Tree ==> Feature -> once Configured (you give values)
    // CF -> Describes HOW something looks like, how it is built.
    public static final ResourceKey<ConfiguredFeature<?, ?>>
    OVERWORLD_BALLOONITE_ORE_KEY = registerKey("overworld_ballonite_ore");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new
                TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new
                TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        register(context, OVERWORLD_BALLOONITE_ORE_KEY, Feature.ORE, new
                OreConfiguration(List.of(
                        OreConfiguration.target(stoneReplaceables,
                                JacesMMBlocks.BALLOONITE_ORE.get().defaultBlockState())),7));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(JacesMegaMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}