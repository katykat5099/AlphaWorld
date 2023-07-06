package ca.alphaworld.alphaworld2.client.item;

import ca.alphaworld.alphaworld2.data.items.FuelSourceBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FuelSourceBlockItemRenderer extends GeoItemRenderer<FuelSourceBlockItem> {
    public FuelSourceBlockItemRenderer() {
        super(new FuelSourceBlockItemModel());
    }
}
