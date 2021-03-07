package io.github.mechevo.common.registration;

import io.github.mechevo.common.MechEvo;
import io.github.mechevo.common.block.ores.AluminiumOre;
import io.github.mechevo.common.block.ores.NickelOre;
import io.github.mechevo.common.block.ores.TungstenOre;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class MechBlockRegistry {

    public static Block tungsten;
    public static Block nickel;
    public static Block aluminium;

    public static void registerBlock(IForgeRegistry<Block> registry) {
        registry.registerAll(
                tungsten = new TungstenOre().setRegistryName(TungstenOre.name),
                nickel = new NickelOre().setRegistryName(NickelOre.name),
                aluminium = new AluminiumOre().setRegistryName(AluminiumOre.name)
        );
    }

    public static void registerBlockItem(IForgeRegistry<Item> registry) {
        registry.registerAll(
                new BlockItem(MechBlockRegistry.tungsten,createItemProperties()).setRegistryName(TungstenOre.name),
                new BlockItem(MechBlockRegistry.nickel,createItemProperties()).setRegistryName(NickelOre.name),
                new BlockItem(MechBlockRegistry.aluminium,createItemProperties()).setRegistryName(AluminiumOre.name)
        );
    }

    private static Item.Properties createItemProperties() {
        return new Item.Properties().group(MechEvo.creativeTabMechEvo);
    }
}
