package io.github.mechevo.common.tools;

import com.google.common.collect.ImmutableSet;
import io.github.mechevo.common.MechEvo;
import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

import java.util.Set;

public class TungstenPickaxe extends PickaxeItem {

    public static final String name = "tungstenpickaxe";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);
    public static final ToolType TUNGSTEN_PICK = ToolType.get(MechEvo.MODID + "_" + name);

    public TungstenPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public Set<ToolType> getToolTypes(ItemStack stack) {
        return ImmutableSet.of(TUNGSTEN_PICK);
    }

    @Override
    public boolean canHarvestBlock(BlockState blockIn) {
        return super.canHarvestBlock(blockIn);
    }
}
