package ca.alphaworld.alphaworld2.registries;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static ca.alphaworld.alphaworld2.AlphaWorld2Mod.LOGGER;
import static ca.alphaworld.alphaworld2.registries.AlphaWorld2Blocks.*;
import static ca.alphaworld.alphaworld2.registries.AlphaWorld2Items.*;

public class AlphaWorld2ItemGroups {

    //Item Group Variables
    private static final ItemGroup ALPHAWORLD2_ITEM_GROUP_GRASS = FabricItemGroup.builder(new Identifier("alphaworld2", "alphaworld2_item_group_grass")).icon(() -> new ItemStack(BUNDLE_DRY_GRASS)).build();
    private static final ItemGroup ALPHAWORLD2_ITEM_GROUP_PETALS = FabricItemGroup.builder(new Identifier("alphaworld2", "alphaworld2_item_group_petals")).icon(() -> new ItemStack(BUNDLE_DRY_PETALS)).build();
    private static final ItemGroup ALPHAWORLD2_ITEM_GROUP_LEAVES = FabricItemGroup.builder(new Identifier("alphaworld2", "alphaworld2_item_group_leaves")).icon(() -> new ItemStack(BUNDLE_DRY_LEAVES)).build();
    private static final ItemGroup ALPHAWORLD2_ITEM_GROUP_MINERALS = FabricItemGroup.builder(new Identifier("alphaworld2", "alphaworld2_item_group_minerals")).icon(() -> new ItemStack(STONE_SHARD)).build();
    private static final ItemGroup ALPHAWORLD2_ITEM_GROUP_TOOLS = FabricItemGroup.builder(new Identifier("alphaworld2", "alphaworld2_item_group_tools")).icon(() -> new ItemStack(STONE_SHARD_PICKAXE)).build();

    public static void itemGroupRegistry(){
        //Console Log
        LOGGER.info("Loading Item Groups...");

        ItemGroupEvents.modifyEntriesEvent(ALPHAWORLD2_ITEM_GROUP_GRASS).register(content -> {
            content.add(GRASS_ITEM);
            content.add(GRASS_STRING);
            content.add(DRY_GRASS);
            content.add(BUNDLE_DRY_GRASS);
        });
        ItemGroupEvents.modifyEntriesEvent(ALPHAWORLD2_ITEM_GROUP_PETALS).register(content -> {
            content.add(POPPY_PETALS);
            content.add(DRY_POPPY_PETALS);
            content.add(BLUE_ORCHID_PETALS);
            content.add(DRY_BLUE_ORCHID_PETALS);
            content.add(ALLIUM_PETALS);
            content.add(DRY_ALLIUM_PETALS);
            content.add(AZURE_BLUET_PETALS);
            content.add(DRY_AZURE_BLUET_PETALS);
            content.add(RED_TULIP_PETALS);
            content.add(DRY_RED_TULIP_PETALS);
            content.add(ORANGE_TULIP_PETALS);
            content.add(DRY_ORANGE_TULIP_PETALS);
            content.add(WHITE_TULIP_PETALS);
            content.add(DRY_WHITE_TULIP_PETALS);
            content.add(PINK_TULIP_PETALS);
            content.add(DRY_PINK_TULIP_PETALS);
            content.add(OXEYE_DAISY_PETALS);
            content.add(DRY_OXEYE_DAISY_PETALS);
            content.add(CORNFLOWER_PETALS);
            content.add(DRY_CORNFLOWER_PETALS);
            content.add(LILY_OF_THE_VALLEY_PETALS);
            content.add(DRY_LILY_OF_THE_VALLEY_PETALS);
            content.add(WITHER_ROSE_PETALS);
            content.add(DRY_WITHER_ROSE_PETALS);
            content.add(SUNFLOWER_PETALS);
            content.add(DRY_SUNFLOWER_PETALS);
            content.add(LILAC_PETALS);
            content.add(DRY_LILAC_PETALS);
            content.add(ROSE_PETALS);
            content.add(DRY_ROSE_PETALS);
            content.add(PEONY_PETALS);
            content.add(DRY_PEONY_PETALS);
            content.add(AZALEA_PETALS);
            content.add(DRY_AZALEA_PETALS);
        });
        ItemGroupEvents.modifyEntriesEvent(ALPHAWORLD2_ITEM_GROUP_LEAVES).register(content -> {
            content.add(OAK_LEAVES_ITEM);
            content.add(DRY_OAK_LEAVES_ITEM);
            content.add(SPRUCE_LEAVES_ITEM);
            content.add(DRY_SPRUCE_LEAVES_ITEM);
            content.add(BIRCH_LEAVES_ITEM);
            content.add(DRY_BIRCH_LEAVES_ITEM);
            content.add(JUNGLE_LEAVES_ITEM);
            content.add(DRY_JUNGLE_LEAVES_ITEM);
            content.add(ACACIA_LEAVES_ITEM);
            content.add(DRY_ACACIA_LEAVES_ITEM);
            content.add(DARK_OAK_LEAVES_ITEM);
            content.add(DRY_DARK_OAK_LEAVES_ITEM);
            content.add(AZALEA_LEAVES_ITEM);
            content.add(DRY_AZALEA_LEAVES_ITEM);
            content.add(MANGROVE_LEAVES_ITEM);
            content.add(DRY_MANGROVE_LEAVES_ITEM);
            content.add(FERN_LEAVES);
            content.add(DRY_FERN_LEAVES);
        });
        ItemGroupEvents.modifyEntriesEvent(ALPHAWORLD2_ITEM_GROUP_MINERALS).register(content -> {
            content.add(STONE_ITEM);
            content.add(STONE_SHARD);
            content.add(DIAMOND_CUT);
            content.add(EMERALD_CUT);
            content.add(SAPPHIRE);
            content.add(SAPPHIRE_CUT);
            content.add(SAPPHIRE_ORE);
            content.add(DEEPSLATE_SAPPHIRE_ORE);
            content.add(RUBY);
            content.add(RUBY_CUT);
            content.add(RUBY_BLOCK);
            content.add(RUBY_ORE);
            content.add(DEEPSLATE_RUBY_ORE);
            content.add(PEARL);
            content.add(RAW_SILVER);
            content.add(SILVER_INGOT);
            content.add(SILVER_BLOCK);
            content.add(SILVER_ORE);
            content.add(DEEPSLATE_SILVER_ORE);
            content.add(SALT);
            content.add(AMETHYST_CUT);
            content.add(RAW_TUNGSTEN);
            content.add(TUNGSTEN_INGOT);
            content.add(TUNGSTEN_BLOCK);
            content.add(TUNGSTEN_ORE);
            content.add(DEEPSLATE_TUNGSTEN_ORE);
            content.add(STEEL_INGOT);
            content.add(STEEL_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ALPHAWORLD2_ITEM_GROUP_TOOLS).register(content -> {
            content.add(STONE_SHARD_PICKAXE);
            content.add(STEEL_SHOVEL);
            content.add(STEEL_SWORD);
            content.add(STEEL_PICKAXE);
            content.add(STEEL_AXE);
            content.add(STEEL_HOE);
            content.add(STEEL_HELMET);
            content.add(STEEL_CHESTPLATE);
            content.add(STEEL_LEGGINGS);
            content.add(STEEL_BOOTS);
        });
    }
}
