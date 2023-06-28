package ca.alphaworld.items_blocks_etc;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Blocks {
    public static final Block GRASS_ITEM_TILE = new Block(FabricBlockSettings.create().breakInstantly().noCollision().mapColor(MapColor.GREEN).strength(1.0f));
    public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).hardness(5.0F));
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).hardness(1.0F));

    //Block Registry
    public static void blockRegistry(){
        //Register Block
        Registry.register(Registries.BLOCK, new Identifier("alphaworld", "grass_item_tile"), GRASS_ITEM_TILE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld", "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld", "ruby_ore"), RUBY_ORE);

        //Register Block's Inventory Item
        Registry.register(Registries.ITEM, new Identifier("alphaworld", "grass_item_tile"), new BlockItem(GRASS_ITEM_TILE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld", "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld", "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings()));
    }
}
