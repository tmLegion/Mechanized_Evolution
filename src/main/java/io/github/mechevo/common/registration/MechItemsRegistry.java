package io.github.mechevo.common.registration;

import io.github.mechevo.common.item.*;
import io.github.mechevo.common.tools.Hammer;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class MechItemsRegistry {

    public static Item tungstenIngot;
    public static Item nickelIngot;
    public static Item aluminiumIngot;
    public static Item diamondDust;
    public static Item hammer;
    public static Item tungstenCarbideDust;

    public static void registerItems(IForgeRegistry<Item> registry) {
        registry.registerAll(
                tungstenIngot = new TungstenIngot().setRegistryName(TungstenIngot.name),
                nickelIngot = new NickelIngot().setRegistryName(NickelIngot.name),
                aluminiumIngot = new AluminiumIngot().setRegistryName(AluminiumIngot.name),
                diamondDust = new DiamondDust().setRegistryName(DiamondDust.name),
                hammer = new Hammer().setRegistryName(Hammer.name),
                tungstenCarbideDust = new TungstenCarbideDust().setRegistryName(TungstenCarbideDust.name)
        );
    }
}
