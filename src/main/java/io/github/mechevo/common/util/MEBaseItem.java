package io.github.mechevo.common.util;

import io.github.mechevo.common.MechEvo;
import net.minecraft.item.Item;

public class MEBaseItem extends Item {

    public String itemName;

    public MEBaseItem(String name) {
        this(name, new Properties());
    }

    public MEBaseItem(String name, Properties properties) {
        super(properties.group(MechEvo.creativeTabMechEvo));
        this.itemName = name;
        setRegistryName(MechEvo.MODID, name);
    }
}
