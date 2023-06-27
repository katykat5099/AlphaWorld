package ca.alphaworld.items_blocks_etc;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Blocks {
    public static final Block GRASS_ITEM_TILE = new Block(FabricBlockSettings.create());

    //Block Registry
    public static void blockRegistry(){
        Registry.register(Registries.BLOCK, new Identifier("alphaworld", "grass_item_tile"), GRASS_ITEM_TILE);
    }
}
