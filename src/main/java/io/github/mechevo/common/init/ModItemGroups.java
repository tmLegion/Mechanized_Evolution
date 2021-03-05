package io.github.mechevo.common.init;

import io.github.mechevo.common.MechanizedEvolution;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ModItemGroups extends ItemGroup{

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroups(MechanizedEvolution.Mod_ID, () -> new ItemStack(ModItems.TUNGSTEN_INGOT.get()));
    private final Supplier<ItemStack> iconSupplier;

    public ModItemGroups(@Nonnull String name, @Nonnull Supplier<ItemStack> iconSupplier) {
        super(name);
        this.iconSupplier = iconSupplier;

    }

    @Override
    @Nonnull
    public ItemStack createIcon() {
        return iconSupplier.get();
    }
}
