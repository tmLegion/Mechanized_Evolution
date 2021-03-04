package io.github.mechevo;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MechanizedEvolution.Mod_ID)
public class MechanizedEvolution {

    public static final String Mod_ID = "mechevo";

    public static final Logger LOGGER = LogManager.getLogger(Mod_ID);

    public MechanizedEvolution() {

        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }

}
