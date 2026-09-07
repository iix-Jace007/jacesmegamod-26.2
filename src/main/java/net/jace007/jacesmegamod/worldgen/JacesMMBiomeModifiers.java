package net.jace007.jacesmegamod.worldgen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class JacesMMBiomeModifiers {
    // PF to BiomeModifier
    // NeoForge Class -> Places PlacedFeatures into specific Biomes

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Identifier.fromNamespaceAndPath(JacesMegaMod.MOD_ID, name));
    }
}
