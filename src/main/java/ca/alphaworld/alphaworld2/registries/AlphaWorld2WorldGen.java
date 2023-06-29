package ca.alphaworld.alphaworld2.registries;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import static ca.alphaworld.alphaworld2.AlphaWorld2Mod.LOGGER;
import static net.minecraft.registry.tag.BiomeTags.IS_BADLANDS;
import static net.minecraft.registry.tag.BiomeTags.IS_DEEP_OCEAN;

public class AlphaWorld2WorldGen {

    //WorldGen Ore Key Registries
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("alphaworld2", "ore_sapphire"));
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("alphaworld2", "ore_ruby"));

    public static void WorldGenStuff(){
        //Console Log
        LOGGER.info("Loading WorldGen data...");

        //Add Ores to WorldGen
        BiomeModifications.addFeature(BiomeSelectors.tag(IS_DEEP_OCEAN), GenerationStep.Feature.UNDERGROUND_ORES, SAPPHIRE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(IS_BADLANDS), GenerationStep.Feature.UNDERGROUND_ORES, RUBY_ORE_PLACED_KEY);
    }
}
