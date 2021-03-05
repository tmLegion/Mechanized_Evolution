package io.github.mechevo.common.client;

import io.github.mechevo.common.MechanizedEvolution;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public final ResourceLocation TOP = new ResourceLocation(MechanizedEvolution.Mod_ID, "block/foundry_top");
    public final ResourceLocation SIDE = new ResourceLocation(MechanizedEvolution.Mod_ID, "block/foundry");
    public final ResourceLocation FRONT = new ResourceLocation(MechanizedEvolution.Mod_ID, "block/foundry_front");

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MechanizedEvolution.Mod_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlock(ModBlocks.FOUNDRY_BLOCK.get());
        //horizontalBlock(ModBlocks.FOUNDRY_BLOCK.get(), SIDE, FRONT, TOP);
    }
}
