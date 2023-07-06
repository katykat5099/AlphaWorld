package ca.alphaworld.alphaworld2.registries;

import ca.alphaworld.alphaworld2.data.blocks.CrucibleBlock;
import ca.alphaworld.alphaworld2.data.blocks.FuelSourceBlock;
import ca.alphaworld.alphaworld2.data.items.CrucibleBlockItem;
import ca.alphaworld.alphaworld2.data.items.FuelSourceBlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static ca.alphaworld.alphaworld2.AlphaWorld2Mod.LOGGER;

public class AlphaWorld2Blocks {

    //Block Variables (set item constructors)
    //Ores
    public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block DEEPSLATE_SAPPHIRE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block DEEPSLATE_RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block DEEPSLATE_SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block DEEPSLATE_TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block DEEPSLATE_PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());

    //Blocks of Minerals
    public static final Block SAPPHIRE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block RAW_SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block RAW_TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block RAW_PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().sounds(BlockSoundGroup.METAL));

    //Block Entities
    public static final Block CRUCIBLE = new CrucibleBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block FUEL_SOURCE_BLOCK = new FuelSourceBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());

    public static void blockRegistry(){
        //Console Log
        LOGGER.info("Loading Blocks...");

        //Block Registry
        //Ore
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "deepslate_sapphire_ore"), DEEPSLATE_SAPPHIRE_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "ruby_ore"), RUBY_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "deepslate_ruby_ore"), DEEPSLATE_RUBY_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "tungsten_ore"), TUNGSTEN_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "deepslate_tungsten_ore"), DEEPSLATE_TUNGSTEN_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "silver_ore"), SILVER_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "platinum_ore"), PLATINUM_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "deepslate_platinum_ore"), DEEPSLATE_PLATINUM_ORE);

        //Blocks of Minerals
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "sapphire_block"), SAPPHIRE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "ruby_block"), RUBY_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "silver_block"), SILVER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "raw_silver_block"), RAW_SILVER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "tungsten_block"), TUNGSTEN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "raw_tungsten_block"), RAW_TUNGSTEN_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "steel_block"), STEEL_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "platinum_block"), PLATINUM_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "raw_platinum_block"), RAW_PLATINUM_BLOCK);

        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "crucible"), CRUCIBLE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "fuel_source_block"), FUEL_SOURCE_BLOCK);

        //Block Item Registry
        //Ores
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "deepslate_sapphire_ore"), new BlockItem(DEEPSLATE_SAPPHIRE_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "deepslate_ruby_ore"), new BlockItem(DEEPSLATE_RUBY_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "tungsten_ore"), new BlockItem(TUNGSTEN_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "deepslate_tungsten_ore"), new BlockItem(DEEPSLATE_TUNGSTEN_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "silver_ore"), new BlockItem(SILVER_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "deepslate_silver_ore"), new BlockItem(DEEPSLATE_SILVER_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "platinum_ore"), new BlockItem(PLATINUM_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "deepslate_platinum_ore"), new BlockItem(DEEPSLATE_PLATINUM_ORE, new FabricItemSettings()));

        //Blocks of Minerals
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "sapphire_block"), new BlockItem(SAPPHIRE_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "silver_block"), new BlockItem(SILVER_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "raw_silver_block"), new BlockItem(RAW_SILVER_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "tungsten_block"), new BlockItem(TUNGSTEN_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "raw_tungsten_block"), new BlockItem(RAW_TUNGSTEN_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_block"), new BlockItem(STEEL_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "platinum_block"), new BlockItem(PLATINUM_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "raw_platinum_block"), new BlockItem(RAW_PLATINUM_BLOCK, new FabricItemSettings()));

        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "crucible"), new CrucibleBlockItem(CRUCIBLE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "fuel_source_block"), new FuelSourceBlockItem(FUEL_SOURCE_BLOCK, new FabricItemSettings()));
    }
}
