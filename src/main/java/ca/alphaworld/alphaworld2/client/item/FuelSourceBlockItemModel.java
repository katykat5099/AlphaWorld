package ca.alphaworld.alphaworld2.client.item;

import ca.alphaworld.alphaworld2.data.items.FuelSourceBlockItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class FuelSourceBlockItemModel extends GeoModel<FuelSourceBlockItem> {
    @Override
    public Identifier getModelResource(FuelSourceBlockItem animatable) {
        return new Identifier("alphaworld2", "geo/fuel_source_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(FuelSourceBlockItem animatable) {
        return new Identifier("alphaworld2", "textures/block/fuel_source_block.png");
    }

    @Override
    public Identifier getAnimationResource(FuelSourceBlockItem animatable) {
        return new Identifier("alphaworld2", "animations/fuel_source_block.animation.json");
    }
}