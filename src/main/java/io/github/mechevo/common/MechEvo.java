package io.github.mechevo.common;

import io.github.mechevo.common.registration.MechCreativeTab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(MechEvo.MODID)
public class MechEvo {

    public static final String MODID = "mechevo";
    public static final String NAME = "Mechanized Evolution";
    public static final String VERSION = "0.1.1";
    public static MechEvo instance;
    /**
     * Mechanized Evolution Creative Tab
     */
    public static final MechCreativeTab tabMechEvo = new MechCreativeTab();

    public static ResourceLocation mechResource(String path) {
        return new ResourceLocation(MODID, path);
    }
}
