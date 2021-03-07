package io.github.mechevo.client;

import io.github.mechevo.common.network.CommonProxy;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class ClientProxy extends CommonProxy {

    @Override
    public List<ITextComponent> getItemTooltip(ItemStack itemStack, PlayerEntity player) {
        return itemStack.getTooltip(player, ITooltipFlag.TooltipFlags.NORMAL);
    }
}
