package net.jace007.jacesmegamod.tags;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class JacesMMTags {
    public static class Blocks {

    }
    public static class Items {
        public static final TagKey<Item> AGRABAH_CEDAR_LOGS = createTag("agrabah_cedar_logs");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(JacesMegaMod.MOD_ID, name));
        }
    }
}
