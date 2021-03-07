package io.github.mechevo.common.registration;

import io.github.mechevo.common.MechEvo;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class MechCreativeTab extends ItemGroup {

    public MechCreativeTab() {
        super(MechEvo.MODID);
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(MechBlockRegistry.tungsten);
    }

}
