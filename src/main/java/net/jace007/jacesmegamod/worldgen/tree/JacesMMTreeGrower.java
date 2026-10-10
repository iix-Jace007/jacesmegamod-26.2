package net.jace007.jacesmegamod.worldgen.tree;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.worldgen.JacesMMConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class JacesMMTreeGrower {
    public static final TreeGrower AGRABAH_CEDAR = new TreeGrower(JacesMegaMod.MOD_ID + ":agrabah_cedar",
            Optional.empty(), Optional.of(JacesMMConfiguredFeatures.AGRABAH_CEDAR_KEY), Optional.empty());
}

