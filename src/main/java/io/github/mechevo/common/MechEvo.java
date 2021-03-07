package io.github.mechevo.common;

import io.github.mechevo.client.ClientProxy;
import io.github.mechevo.common.network.CommonProxy;
import io.github.mechevo.common.registration.MechBlockRegistry;
import io.github.mechevo.common.registration.MechCreativeTab;
import io.github.mechevo.common.registration.MechItemsRegistry;
import io.github.mechevo.common.world.WorldGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
@Mod(MechEvo.MODID)
public class MechEvo {

    public static final String MODID = "mechevo";
    public static final String MODNAME = "Mechanized Evolution";
    public static final String VERSION = "0.0.1";
    public static final MechCreativeTab creativeTabMechEvo = new MechCreativeTab();
    public static final Logger logger = LogManager.getLogger(MODNAME);

    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public MechEvo() {

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, WorldGen::generateOres);

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        MechBlockRegistry.registerBlock(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        MechBlockRegistry.registerBlockItem(event.getRegistry());
        MechItemsRegistry.registerItems(event.getRegistry());
    }
}
