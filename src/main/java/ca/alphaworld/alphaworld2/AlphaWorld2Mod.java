package ca.alphaworld.alphaworld2;

import ca.alphaworld.alphaworld2.registries.AlphaWorld2Blocks;
import ca.alphaworld.alphaworld2.registries.AlphaWorld2ItemGroups;
import ca.alphaworld.alphaworld2.registries.AlphaWorld2Items;
import ca.alphaworld.alphaworld2.registries.AlphaWorld2WorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlphaWorld2Mod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Alpha World 2");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing...");

		//Register Items
		AlphaWorld2Items.itemRegistry();

		//Register Blocks
		AlphaWorld2Blocks.blockRegistry();

		//Register Item Group
		AlphaWorld2ItemGroups.itemGroupRegistry();

		//Load World Gen Mods
		AlphaWorld2WorldGen.WorldGenStuff();
	}
}
