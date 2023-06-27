package ca.alphaworld.screens.races;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class RacesScreen extends Screen {
    protected RacesScreen(){
        super(Text.literal("Choose your Race."));
    }

    public ButtonWidget button1;
    public ButtonWidget button2;

    @Override
    public void init() {
        button1 = ButtonWidget.builder(Text.literal("Test Button 1"), button -> {System.out.println("Clicked Test 1.");}).dimensions(width / 2 - 205, 20, 200, 20).tooltip(Tooltip.of(Text.literal("Tooltip test1"))).build();
        button2 = ButtonWidget.builder(Text.literal("Test Button 2"), button -> {System.out.println("Clicked Test 2.");}).dimensions(width / 2 + 5, 20, 200, 20).tooltip(Tooltip.of(Text.literal("Tooltip test2"))).build();

        addDrawableChild(button1);
        addDrawableChild(button2);
    }

}
