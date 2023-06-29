package ca.alphaworld.alphaworld2.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlphaWorld2Blocks {

    //Block Variables
    public static final Block SAPPHIRE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool());

    public static void blockRegistry(){

        //Block Registry
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registries.BLOCK, new Identifier("alphaworld2", "ruby_ore"), RUBY_ORE);

        //Block Item Registry
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "sapphire_ore"), new BlockItem(SAPPHIRE_ORE, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "ruby_ore"), new BlockItem(RUBY_ORE, new FabricItemSettings()));
    }
}
