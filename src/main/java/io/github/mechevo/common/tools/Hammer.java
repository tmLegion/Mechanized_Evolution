package io.github.mechevo.common.tools;

import io.github.mechevo.common.MechEvo;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class Hammer extends Item {

    public static final String name = "hammer";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);

    public Hammer() {
        super(new Item.Properties().group(MechEvo.creativeTabMechEvo).maxStackSize(1));
    }
}
