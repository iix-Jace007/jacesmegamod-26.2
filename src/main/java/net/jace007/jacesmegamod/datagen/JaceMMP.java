package net.jace007.jacesmegamod.datagen;

import net.jace007.jacesmegamod.JacesMegaMod;
import net.jace007.jacesmegamod.item.JaceMMItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class JaceMMP extends ModelProvider {
    public JaceMMP(PackOutput output) {
        super(output, JacesMegaMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(JaceMMItems.GOTHITE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(JaceMMItems.BALLOONITE.get(), ModelTemplates.FLAT_ITEM);
    }
}
