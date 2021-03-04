package io.github.mechevo.utils;

import io.github.mechevo.MechanizedEvolution;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = MechanizedEvolution.Mod_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {

    }

    @SubscribeEvent
    public static void onModConfigEvent() {

    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onPostRegisterEntities(){

    }
}
