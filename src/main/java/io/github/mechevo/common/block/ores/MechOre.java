package io.github.mechevo.common.block.ores;

import io.github.mechevo.common.registration.MechBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

import java.util.Random;

public class MechOre extends OreBlock {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    private final ResourceLocation registryName;
    private Random rand = new Random();

    public MechOre(Block.Properties properties, ResourceLocation registryName) {
        super(properties);
        this.registryName = registryName;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        int exp = 0;
        if (this == MechBlockRegistry.tungsten) {
            exp = MathHelper.nextInt(rand, 3, 7);
        } else if (this == MechBlockRegistry.nickel) {
            exp = MathHelper.nextInt(rand, 1, 5);
        } else if (this == MechBlockRegistry.aluminium) {
            exp = MathHelper.nextInt(rand, 0, 3);
        }
        return exp;
    }


}
