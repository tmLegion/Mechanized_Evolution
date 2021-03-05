package io.github.mechevo.common.datagen;

import io.github.mechevo.common.client.ModBlockStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generators = event.getGenerator();

        generators.addProvider(new ModBlockStateProvider(generators, event.getExistingFileHelper()));
    }
}
