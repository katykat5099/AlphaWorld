package ca.alphaworld.alphaworld2.client.item;

import ca.alphaworld.alphaworld2.data.items.CrucibleBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class CrucibleBlockItemRenderer extends GeoItemRenderer<CrucibleBlockItem> {
    public CrucibleBlockItemRenderer() {
        super(new CrucibleBlockItemModel());
    }
}
