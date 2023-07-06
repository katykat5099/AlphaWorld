package ca.alphaworld.alphaworld2.registries;

import ca.alphaworld.alphaworld2.data.entity.CrucibleBlockEntity;
import ca.alphaworld.alphaworld2.data.entity.FuelSourceBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlphaWorld2BlockEntities {
    public static BlockEntityType<CrucibleBlockEntity> CRUCIBLE;
    public static BlockEntityType<FuelSourceBlockEntity> FUEL_SOURCE_BLOCK;

    public static void blockEntityRegistry(){
        CRUCIBLE = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("alphaworld2", "crucible"), FabricBlockEntityTypeBuilder.create(CrucibleBlockEntity::new, AlphaWorld2Blocks.CRUCIBLE).build());
        FUEL_SOURCE_BLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("alphaworld2", "fuel_source_block"), FabricBlockEntityTypeBuilder.create(FuelSourceBlockEntity::new, AlphaWorld2Blocks.FUEL_SOURCE_BLOCK).build());

    }
}
