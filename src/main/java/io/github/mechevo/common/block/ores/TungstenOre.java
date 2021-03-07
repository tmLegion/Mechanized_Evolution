package io.github.mechevo.common.block.ores;

import io.github.mechevo.common.MechEvo;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ResourceLocation;

public class TungstenOre extends MechOre {

    public static final String name = "tungstenore";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);

    public TungstenOre() {
        super(AbstractBlock.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA)
                .setRequiresTool()
                .harvestLevel(3)
                .hardnessAndResistance(15.0F, 500.0F)
                .sound(SoundType.METAL), registryName);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
