package ca.alphaworld.alphaworld2.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static ca.alphaworld.alphaworld2.AlphaWorld2Mod.LOGGER;

public class AlphaWorld2Blocks {

    //Block Variables
    public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    //public static final Block DEEPSLATE_SAPPHIRE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    //public static final Block DEEPSLATE_RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    //TUNGSTEN_ORE
    //DEEPSLATE_TUNGSTEN_ORE

    public static void blockRegistry(){
        //Console Log
        LOGGER.info("Loading Blocks...");

        //Block Registry
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "sapphire_ore"), SAPPHIRE_ORE);
        //Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "deepslate_sapphire_ore"), DEEPSLATE_SAPPHIRE_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "ruby_ore"), RUBY_ORE);
        //Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);

        //Block Item Registry
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings()));
        //Registry.register(Registries.ITEM, new Identifier("alphaworld2", "deepslate_sapphire_ore"), new BlockItem(DEEPSLATE_SAPPHIRE_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings()));
        //Registry.register(Registries.ITEM, new Identifier("alphaworld2", "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new FabricItemSettings()));
    }
}
