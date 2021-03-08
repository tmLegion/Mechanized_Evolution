package io.github.mechevo.common.registration;

import io.github.mechevo.common.MechEvo;
import io.github.mechevo.common.item.*;
import io.github.mechevo.common.tools.Hammer;
import io.github.mechevo.common.tools.TungstenCarbidePickaxe;
import io.github.mechevo.common.tools.TungstenPickaxe;
import io.github.mechevo.common.tools.WoodHandle;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.registries.IForgeRegistry;

public class MechItemsRegistry {

    public static Item.Properties properties = new Item.Properties();

    public static Item tungstenIngot;
    public static Item nickelIngot;
    public static Item aluminiumIngot;
    public static Item diamondDust;
    public static Item hammer;
    public static Item tungstenCarbideDust;
    public static Item woodHandle;
    public static Item tungstenPickaxe;
    public static Item tungstenDust;
    public static Item tungstenCarbideIngot;
    public static Item tungstenCarbidePickaxe;

    public static void registerItems(IForgeRegistry<Item> registry) {
        registry.registerAll(
                tungstenIngot = new TungstenIngot().setRegistryName(TungstenIngot.name),
                nickelIngot = new NickelIngot().setRegistryName(NickelIngot.name),
                aluminiumIngot = new AluminiumIngot().setRegistryName(AluminiumIngot.name),
                diamondDust = new DiamondDust().setRegistryName(DiamondDust.name),
                hammer = new Hammer().setRegistryName(Hammer.name),
                tungstenCarbideDust = new TungstenCarbideDust().setRegistryName(TungstenCarbideDust.name),
                woodHandle = new WoodHandle().setRegistryName(WoodHandle.name),
                tungstenPickaxe = new TungstenPickaxe(ItemTier.DIAMOND, 3, -2.8F, properties.group(MechEvo.creativeTabMechEvo).defaultMaxDamage(900)).setRegistryName(TungstenPickaxe.name),
                tungstenDust = new DiamondDust().setRegistryName(TungstenDust.name),
                tungstenCarbideIngot = new TungstenCarbideIngot().setRegistryName(TungstenCarbideIngot.name),
                tungstenCarbidePickaxe = new TungstenCarbidePickaxe(ItemTier.DIAMOND, 4, -1.8F, properties.group(MechEvo.creativeTabMechEvo).defaultMaxDamage(1200)).setRegistryName(TungstenCarbidePickaxe.name)
        );
    }
}
