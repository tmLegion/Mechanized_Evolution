package io.github.mechevo.common.block.ores;

import io.github.mechevo.common.MechEvo;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.ResourceLocation;

public class AluminiumOre extends MechOre{

    public static final String name = "aluminiumore";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);

    public AluminiumOre() {
        super(Block.Properties.create(Material.IRON, MaterialColor.WHITE_TERRACOTTA)
                .setRequiresTool()
                .harvestLevel(0)
                .hardnessAndResistance(1.5F, 1.5F)
                .sound(SoundType.METAL), registryName);
    }
}
