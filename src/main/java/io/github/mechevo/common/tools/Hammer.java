package io.github.mechevo.common.tools;

import com.google.common.collect.ImmutableSet;
import io.github.mechevo.common.MechEvo;
import io.github.mechevo.common.util.MechUtils;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nonnull;
import java.util.Set;

public class Hammer extends Item {

    public static final String name = "hammer";
    public static final ResourceLocation registryName = new ResourceLocation(MechEvo.MODID, name);
    public static final ToolType HAMMER_TOOL = ToolType.get(MechEvo.MODID + "_" + name);

    public Hammer() {
        super(new Item.Properties().group(MechEvo.creativeTabMechEvo).maxStackSize(1).defaultMaxDamage(100));
    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        ItemStack container = stack.copy();
        if(container.attemptDamageItem(1, MechUtils.RANDOM, null))
            return ItemStack.EMPTY;
        else
            return container;
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public int getItemEnchantability() {
        return 14;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment == Enchantments.EFFICIENCY || enchantment == Enchantments.UNBREAKING || enchantment == Enchantments.MENDING;
    }



    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, PlayerEntity player) {
        BlockState state = player.world.getBlockState(pos);
        boolean effective = false;
        for(ToolType tool : getToolTypes(itemstack))
            if(state.getBlock().isToolEffective(state, tool))
            {
                effective = true;
                break;
            }
        itemstack.attemptDamageItem(1, MechUtils.RANDOM, null);
        return effective;
    }

    @Nonnull
    @Override
    public Set<ToolType> getToolTypes(ItemStack stack) {
        return ImmutableSet.of(HAMMER_TOOL);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        for (ToolType type : this.getToolTypes(stack))
            if (state.getBlock().isToolEffective(state, type))
                return 2;
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public boolean canHarvestBlock(BlockState blockIn) {
        return false;
    }


}
