package io.github.mechevo.common.registration;

import io.github.mechevo.common.MechEvo;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class BiomeRegistry {

    public static RegistryKey<Biome> volcanoe = register("volcanoe");


    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation(MechEvo.MODID, name));
    }
}
