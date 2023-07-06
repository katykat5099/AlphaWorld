package ca.alphaworld.alphaworld2;

import ca.alphaworld.alphaworld2.client.entity.CrucibleBlockRenderer;
import ca.alphaworld.alphaworld2.client.screen.CrucibleScreen;
import ca.alphaworld.alphaworld2.client.screen.RaceSelectionGui;
import ca.alphaworld.alphaworld2.client.data.CustomScreen;
import ca.alphaworld.alphaworld2.registries.AlphaWorld2BlockEntities;
import ca.alphaworld.alphaworld2.registries.AlphaWorld2ScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import static ca.alphaworld.alphaworld2.AlphaWorld2Mod.LOGGER;

public class AlphaWorld2ModClient implements ClientModInitializer {

    private static KeyBinding keyBinding;

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing Client...");
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.alphaworld2.test_gui", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_N, "category.alphaworld2.testing"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {while(keyBinding.wasPressed()){
            MinecraftClient.getInstance().setScreen(new CustomScreen(new RaceSelectionGui()));
        }});

        HandledScreens.register(AlphaWorld2ScreenHandlers.CRUCIBLE_SCREEN_HANDLER, CrucibleScreen::new);

        BlockEntityRendererFactories.register(AlphaWorld2BlockEntities.CRUCIBLE, CrucibleBlockRenderer::new);
    }
}
