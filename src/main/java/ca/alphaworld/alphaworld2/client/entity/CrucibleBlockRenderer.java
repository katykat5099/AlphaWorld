package ca.alphaworld.alphaworld2.client.entity;

import ca.alphaworld.alphaworld2.data.entity.CrucibleBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CrucibleBlockRenderer extends GeoBlockRenderer<CrucibleBlockEntity> {

    public CrucibleBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new CrucibleBlockModel());
    }
}
