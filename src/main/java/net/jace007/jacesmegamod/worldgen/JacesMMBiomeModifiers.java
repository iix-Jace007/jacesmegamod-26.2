package net.jace007.jacesmegamod.worldgen;

import com.mojang.serialization.MapCodec;
import net.jace007.jacesmegamod.JacesMegaMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.common.world.ModifiableBiomeInfo;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class JacesMMBiomeModifiers {
    // PF to BiomeModifier
    // NeoForge Class -> Places PlacedFeatures into specific Biomes
    public static final ResourceKey<BiomeModifier>
    ADD_OVERWORLD_BALLOONITE_ORE = registerKey("add_overworld_ballonite_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {

        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_OVERWORLD_BALLOONITE_ORE, new
                BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JacesMMPlacedFeatures.
                        OVERWORLD_BALLOONITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Identifier.fromNamespaceAndPath(JacesMegaMod.MOD_ID, name));
    }
}
