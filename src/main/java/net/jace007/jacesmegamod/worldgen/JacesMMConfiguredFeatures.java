package net.jace007.jacesmegamod.worldgen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.block.JacesMMBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class JacesMMConfiguredFeatures {
    // Feature --> Any Type of "build"
    // A Tree ==> Feature -> once Configured (you give values)
    // CF -> Describes HOW something looks like, how it is built.
    public static final ResourceKey<ConfiguredFeature<?, ?>>
            OVERWORLD_BALLOONITE_ORE_KEY = registerKey("overworld_ballonite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>>
            AGRABAH_CEDAR_KEY = registerKey("agrabah_cedar");



    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new
                TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new
                TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        register(context, OVERWORLD_BALLOONITE_ORE_KEY, Feature.ORE, new
                OreConfiguration(List.of(
                        OreConfiguration.target(stoneReplaceables,
                                JacesMMBlocks.BALLOONITE_ORE.get().defaultBlockState())),7));

        register(context, AGRABAH_CEDAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(JacesMMBlocks.AGRABAH_CEDAR_LOG.get()),
                        new StraightTrunkPlacer(3, 4, 2),
                BlockStateProvider.simple(JacesMMBlocks.AGRABAH_CEDAR_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 1),
                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.simple(Blocks.GRASS_BLOCK)).build());

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(JacesMegaMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}