package ca.alphaworld.alphaworld2.client.entity;

import ca.alphaworld.alphaworld2.data.entity.FuelSourceBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class FuelSourceBlockRenderer extends GeoBlockRenderer<FuelSourceBlockEntity> {

    public FuelSourceBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new FuelSourceBlockModel());
    }
}
