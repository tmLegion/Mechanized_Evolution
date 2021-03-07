package io.github.mechevo.common.world;

import io.github.mechevo.common.block.ores.MechOre;
import io.github.mechevo.common.block.ores.TungstenOre;
import io.github.mechevo.common.registration.MechBlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WorldGen {

    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    MechBlockRegistry.tungsten.getDefaultState(), 5, 5, 25, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    MechBlockRegistry.aluminium.getDefaultState(), 9, 20, 45, 20);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    MechBlockRegistry.nickel.getDefaultState(), 7, 1, 35, 15);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settingsBuilder, RuleTest fillerType, BlockState state, int veinSize,
                                    int minHeight, int maxHeight, int amountPerChunk) {
        settingsBuilder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().func_242731_b(amountPerChunk));
    }
}
