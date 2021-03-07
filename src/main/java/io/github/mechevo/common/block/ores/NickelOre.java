package io.github.mechevo.common.block.ores;

import io.github.mechevo.common.MechEvo;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.ResourceLocation;

public class NickelOre extends MechOre {

    public static final String name = "nickelore";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);

    public NickelOre() {
        super(Block.Properties.create(Material.IRON, MaterialColor.YELLOW)
                .setRequiresTool()
                .harvestLevel(1)
                .hardnessAndResistance(3.0F, 3.0F)
                .sound(SoundType.METAL), registryName);
    }
}
