package net.jace007.jacesmegamod.worldgen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class JacesMMPlacedFeatures {
    // CF given to the Placed Features
    // How Many will be placed and some relation in where
    public static final ResourceKey<PlacedFeature>
    OVERWORLD_BALLOONITE_ORE_PLACED_KEY = registerKey
            ("overworld_balloonite_ore_placed_key");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures =
                context.lookup(Registries.CONFIGURED_FEATURE);

    //    register(context, OVERWORLD_BALLOONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(JacesMMConfiguredFeatures.OVERWORLD_BALLOONITE_ORE_KEY),
    //            OrePlacements.commonOrePlacement(12,
    //                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(JacesMegaMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
