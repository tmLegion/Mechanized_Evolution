package io.github.mechevo.common.tools;

import io.github.mechevo.common.MechEvo;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class WoodHandle extends Item {

    public static final String name = "woodhandle";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);

    public WoodHandle() {
        super(new Item.Properties().group(MechEvo.creativeTabMechEvo).maxStackSize(16));
    }
}
