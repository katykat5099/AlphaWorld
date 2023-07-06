package ca.alphaworld.alphaworld2.client.item;

import ca.alphaworld.alphaworld2.data.items.CrucibleBlockItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class CrucibleBlockItemModel extends GeoModel<CrucibleBlockItem> {
    @Override
    public Identifier getModelResource(CrucibleBlockItem animatable) {
        return new Identifier("alphaworld2", "geo/crucible.geo.json");
    }

    @Override
    public Identifier getTextureResource(CrucibleBlockItem animatable) {
        return new Identifier("alphaworld2", "textures/block/crucible.png");
    }

    @Override
    public Identifier getAnimationResource(CrucibleBlockItem animatable) {
        return new Identifier("alphaworld2", "animations/crucible.animation.json");
    }
}
