package ca.alphaworld.alphaworld2.client.entity;

import ca.alphaworld.alphaworld2.data.entity.CrucibleBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CrucibleBlockModel extends GeoModel<CrucibleBlockEntity> {
    @Override
    public Identifier getModelResource(CrucibleBlockEntity animatable) {
        return new Identifier("alphaworld2", "geo/crucible.geo.json");
    }

    @Override
    public Identifier getTextureResource(CrucibleBlockEntity animatable) {
        return new Identifier("alphaworld2", "textures/block/crucible.png");
    }

    @Override
    public Identifier getAnimationResource(CrucibleBlockEntity animatable) {
        return new Identifier("alphaworld2", "animations/crucible.animation.json");
    }
}
