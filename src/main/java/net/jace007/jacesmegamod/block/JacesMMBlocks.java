package net.jace007.jacesmegamod.block;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.block.custom.JacesFRPBlock;
import net.jace007.jacesmegamod.block.custom.JacesMMLeaves;
import net.jace007.jacesmegamod.block.custom.JacesMMPlanks;
import net.jace007.jacesmegamod.item.JaceMMItems;
import net.jace007.jacesmegamod.worldgen.tree.JacesMMTreeGrower;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class JacesMMBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(JacesMegaMod.MOD_ID);

    // Ore Test
    public static final DeferredBlock<Block> BALLOONITE_BLOCK = registerBlock("balloonite_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> BALLOONITE_ORE = registerBlock("balloonite_ore",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // A Town Trumphwood

    // Aaron Mulberry
    // Abby Cherry
    // Abyssal Mangrove
    // Ace Blackwood
    // Adrian Sycamore
    // Agatha Cypress
    // Agrabah Cedar
    public static final DeferredBlock<Block> AGRABAH_CEDAR_LOG = registerBlock("agrabah_cedar_log",
            properties -> new JacesFRPBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDAR_LOG = registerBlock("stripped_agrabah_cedar_log",
            properties -> new JacesFRPBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> AGRABAH_CEDAR_WOOD = registerBlock("agrabah_cedar_wood",
            properties -> new JacesFRPBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDAR_WOOD = registerBlock("stripped_agrabah_cedar_wood",
            properties -> new JacesFRPBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredBlock<Block> AGRABAH_CEDAR_PLANKS = registerBlock("agrabah_cedar_planks",
            properties -> new JacesMMPlanks(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<StairBlock> AGRABAH_CEDAR_STAIRS = registerBlock("agrabah_cedar_stairs",
            properties -> new StairBlock(JacesMMBlocks.AGRABAH_CEDAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> AGRABAH_CEDAR_LOG_STAIRS = registerBlock("agrabah_cedar_log_stairs",
            properties -> new StairBlock(JacesMMBlocks.AGRABAH_CEDAR_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<StairBlock> STRIPPED_AGRABAH_CEDAR_LOG_STAIRS = registerBlock("stripped_agrabah_cedar_log_stairs",
            properties -> new StairBlock(JacesMMBlocks.STRIPPED_AGRABAH_CEDAR_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredBlock<SlabBlock> AGRABAH_CEDAR_SLAB = registerBlock("agrabah_cedar_slab",
            properties -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> AGRABAH_CEDAR_LOG_SLAB = registerBlock("agrabah_cedar_log_slab",
            properties -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<SlabBlock> STRIPPED_AGRABAH_CEDAR_LOG_SLAB = registerBlock("stripped_agrabah_cedar_log_slab",
            properties -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredBlock<FenceBlock> AGRABAH_CEDAR_FENCE = registerBlock("agrabah_cedar_fence",
            properties -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceBlock> AGRABAH_CEDAR_LOG_FENCE = registerBlock("agrabah_cedar_log_fence",
            properties -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDAR_FENCE_GATE = registerBlock("agrabah_cedar_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDAR_LOG_FENCE_GATE = registerBlock("agrabah_cedar_log_fence_gate",
            properties -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_FENCE_GATE)));
    public static final DeferredBlock<DoorBlock> AGRABAH_CEDAR_DOOR = registerBlock("agrabah_cedar_door",
            properties -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDAR_TRAPDOOR = registerBlock("agrabah_cedar_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDAR_LOG_TRAPDOOR = registerBlock("agrabah_cedar_log_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredBlock<ButtonBlock> AGRABAH_CEDAR_BUTTON = registerBlock("agrabah_cedar_button",
            properties -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredBlock<PressurePlateBlock> AGRABAH_CEDAR_PRESSUREPLATE = registerBlock("agrabah_cedar_pressureplate",
            properties -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<Block> AGRABAH_CEDAR_LEAVES = registerBlock("agrabah_cedar_leaves",
            properties -> new JacesMMLeaves(0.01f, ParticleTypes.CHERRY_LEAVES, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> AGRABAH_CEDAR_SAPLING = registerBlock("agrabah_cedar_sapling",
            properties -> new SaplingBlock(JacesMMTreeGrower.AGRABAH_CEDAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    // Ajay Loner
    // Alanth
    // Albon Willow
    // Aleister Ash
    // Alex Redwood
    // Alexander Hawthorn
    // All Aboard Aspen
    // Allmen Oak
    // Allmighty Ironwood
    // Almirola Walnut
    // Amber Rosewood
    // American Dragonwood
    // American Dreamwood
    // Applebrook
    // Archers Shadowwood
    // Asparagus Alder
    // Aspenthine
    // Astral Grove
    // Astromech Amberwood
    // Aubryn Hollow
    // Audraflora Oak
    // Aurelia Grove
    // Avalanche Grove
    // Awsomeleaf Starwood
    // Axiom Starwood
    // Aztec Flamewood

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();

    }
        private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        JaceMMItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
