package ca.alphaworld.alphaworld2.client.entity;

import ca.alphaworld.alphaworld2.data.entity.FuelSourceBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class FuelSourceBlockModel extends GeoModel<FuelSourceBlockEntity> {
    @Override
    public Identifier getModelResource(FuelSourceBlockEntity animatable) {
        return new Identifier("alphaworld2", "geo/fuel_source_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(FuelSourceBlockEntity animatable) {
        return new Identifier("alphaworld2", "textures/block/fuel_source_block.png");
    }

    @Override
    public Identifier getAnimationResource(FuelSourceBlockEntity animatable) {
        return new Identifier("alphaworld2", "animations/fuel_source_block.animation.json");
    }
}
