package ca.alphaworld.alphaworld2.registries;

import ca.alphaworld.alphaworld2.data.entity.CrucibleBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlphaWorld2BlockEntities {
    public static BlockEntityType<CrucibleBlockEntity> CRUCIBLE;

    public static void blockEntityRegistry(){
        CRUCIBLE = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("alphaworld2", "crucible"), FabricBlockEntityTypeBuilder.create(CrucibleBlockEntity::new, AlphaWorld2Blocks.CRUCIBLE).build());

    }
}
