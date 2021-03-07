package io.github.mechevo.common.item;

import io.github.mechevo.common.MechEvo;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class DiamondDust extends Item {

    public static final String name = "diamonddust";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);

    public DiamondDust() {
        super(new Item.Properties().group(MechEvo.creativeTabMechEvo).maxStackSize(64));
    }
}
