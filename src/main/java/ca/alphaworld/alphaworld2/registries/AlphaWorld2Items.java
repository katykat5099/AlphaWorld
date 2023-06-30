package ca.alphaworld.alphaworld2.registries;

import ca.alphaworld.alphaworld2.data.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static ca.alphaworld.alphaworld2.AlphaWorld2Mod.LOGGER;

public class AlphaWorld2Items {

    //Items Variables
    public static final Item DRY_GRASS = new Item(new FabricItemSettings());
    public static final Item GRASS_ITEM = new Item(new FabricItemSettings());
    public static final Item BUNDLE_DRY_GRASS = new Item(new FabricItemSettings());
    public static final Item BUNDLE_DRY_LEAVES = new Item(new FabricItemSettings());
    public static final Item BUNDLE_DRY_PETALS = new Item(new FabricItemSettings());
    public static final Item BUNDLE_DRY_FLORA = new Item(new FabricItemSettings());
    public static final Item POPPY_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_POPPY_PETALS = new Item(new FabricItemSettings());
    public static final Item BLUE_ORCHID_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_BLUE_ORCHID_PETALS = new Item(new FabricItemSettings());
    public static final Item ALLIUM_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_ALLIUM_PETALS = new Item(new FabricItemSettings());
    public static final Item AZURE_BLUET_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_AZURE_BLUET_PETALS = new Item(new FabricItemSettings());
    public static final Item RED_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_RED_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item ORANGE_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_ORANGE_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item PINK_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_PINK_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item WHITE_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_WHITE_TULIP_PETALS = new Item(new FabricItemSettings());
    public static final Item OXEYE_DAISY_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_OXEYE_DAISY_PETALS = new Item(new FabricItemSettings());
    public static final Item CORNFLOWER_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_CORNFLOWER_PETALS = new Item(new FabricItemSettings());
    public static final Item LILY_OF_THE_VALLEY_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_LILY_OF_THE_VALLEY_PETALS = new Item(new FabricItemSettings());
    public static final Item WITHER_ROSE_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_WITHER_ROSE_PETALS = new Item(new FabricItemSettings());
    public static final Item SUNFLOWER_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_SUNFLOWER_PETALS = new Item(new FabricItemSettings());
    public static final Item LILAC_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_LILAC_PETALS = new Item(new FabricItemSettings());
    public static final Item ROSE_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_ROSE_PETALS = new Item(new FabricItemSettings());
    public static final Item PEONY_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_PEONY_PETALS = new Item(new FabricItemSettings());
    public static final Item OAK_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_OAK_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item SPRUCE_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_SPRUCE_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item BIRCH_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_BIRCH_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item JUNGLE_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_JUNGLE_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item ACACIA_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_ACACIA_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DARK_OAK_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_DARK_OAK_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item AZALEA_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_AZALEA_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item AZALEA_PETALS = new Item(new FabricItemSettings());
    public static final Item DRY_AZALEA_PETALS = new Item(new FabricItemSettings());
    public static final Item MANGROVE_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item DRY_MANGROVE_LEAVES_ITEM = new Item(new FabricItemSettings());
    public static final Item FERN_LEAVES = new Item(new FabricItemSettings());
    public static final Item DRY_FERN_LEAVES = new Item(new FabricItemSettings());
    public static final Item STONE_ITEM = new Item(new FabricItemSettings());
    public static final Item STONE_SHARD = new Item(new FabricItemSettings());
    public static final Item GRASS_STRING = new Item(new FabricItemSettings());
    public static final Item DIAMOND_CUT = new Item(new FabricItemSettings());
    public static final Item EMERALD_CUT = new Item(new FabricItemSettings());
    public static final Item SAPPHIRE = new Item(new FabricItemSettings());
    public static final Item SAPPHIRE_CUT = new Item(new FabricItemSettings());
    public static final Item RUBY = new Item(new FabricItemSettings());
    public static final Item RUBY_CUT = new Item(new FabricItemSettings());
    public static final Item PEARL = new Item(new FabricItemSettings());
    public static final Item SILVER_INGOT = new Item(new FabricItemSettings());
    public static final Item RAW_SILVER = new Item(new FabricItemSettings());
    public static final Item SALT = new Item(new FabricItemSettings());
    public static final Item AMETHYST_CUT = new Item(new FabricItemSettings());
    public static final Item RAW_TUNGSTEN = new Item(new FabricItemSettings());
    public static final Item TUNGSTEN_INGOT = new Item(new FabricItemSettings());
    public static final Item STEEL_INGOT = new Item(new FabricItemSettings());

    //Tool Items Variables
    public static ToolItem STONE_SHARD_PICKAXE = new CustomPickaxeItem(StoneShardMaterial.INSTANCE, 1, 1, new Item.Settings());
    public static ToolItem STEEL_SHOVEL = new ShovelItem(SteelMaterial.INSTANCE, 5.5F, 1.0F, new Item.Settings());
    public static ToolItem STEEL_SWORD = new SwordItem(SteelMaterial.INSTANCE, 9, 1.0F, new Item.Settings());
    public static ToolItem STEEL_PICKAXE = new CustomPickaxeItem(SteelMaterial.INSTANCE, 5, 1.2F, new Item.Settings());
    public static ToolItem STEEL_AXE = new CustomAxeItem(SteelMaterial.INSTANCE, 9, 1.0F, new Item.Settings());
    public static ToolItem STEEL_HOE = new CustomHoeItem(SteelMaterial.INSTANCE, 4, 1.0F, new Item.Settings());

    //Armor Items Variables
    public static final Item STEEL_HELMET = new SteelArmorItem(CustomArmorMaterial.STEEL, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item STEEL_CHESTPLATE = new SteelArmorItem(CustomArmorMaterial.STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item STEEL_LEGGINGS = new SteelArmorItem(CustomArmorMaterial.STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item STEEL_BOOTS = new SteelArmorItem(CustomArmorMaterial.STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings());

    public static void itemRegistry(){
        //Console Log
        LOGGER.info("Loading Items...");

        //Item Registry
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_grass"), DRY_GRASS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "grass_item"), GRASS_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "bundle_dry_grass"), BUNDLE_DRY_GRASS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "bundle_dry_leaves"), BUNDLE_DRY_LEAVES);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "bundle_dry_petals"), BUNDLE_DRY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "bundle_dry_flora"), BUNDLE_DRY_FLORA);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "poppy_petals"), POPPY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_poppy_petals"), DRY_POPPY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "blue_orchid_petals"), BLUE_ORCHID_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_blue_orchid_petals"), DRY_BLUE_ORCHID_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "allium_petals"), ALLIUM_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_allium_petals"), DRY_ALLIUM_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "azure_bluet_petals"), AZURE_BLUET_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_azure_bluet_petals"), DRY_AZURE_BLUET_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "red_tulip_petals"), RED_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_red_tulip_petals"), DRY_RED_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "orange_tulip_petals"), ORANGE_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_orange_tulip_petals"), DRY_ORANGE_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "pink_tulip_petals"), PINK_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_pink_tulip_petals"), DRY_PINK_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "white_tulip_petals"), WHITE_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_white_tulip_petals"), DRY_WHITE_TULIP_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "oxeye_daisy_petals"), OXEYE_DAISY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_oxeye_daisy_petals"), DRY_OXEYE_DAISY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "cornflower_petals"), CORNFLOWER_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_cornflower_petals"), DRY_CORNFLOWER_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "lily_of_the_valley_petals"), LILY_OF_THE_VALLEY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_lily_of_the_valley_petals"), DRY_LILY_OF_THE_VALLEY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "wither_rose_petals"), WITHER_ROSE_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_wither_rose_petals"), DRY_WITHER_ROSE_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "sunflower_petals"), SUNFLOWER_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_sunflower_petals"), DRY_SUNFLOWER_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "lilac_petals"), LILAC_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_lilac_petals"), DRY_LILAC_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "rose_petals"), ROSE_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_rose_petals"), DRY_ROSE_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "peony_petals"), PEONY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_peony_petals"), DRY_PEONY_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "oak_leaves_item"), OAK_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_oak_leaves_item"), DRY_OAK_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "spruce_leaves_item"), SPRUCE_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_spruce_leaves_item"), DRY_SPRUCE_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "birch_leaves_item"), BIRCH_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_birch_leaves_item"), DRY_BIRCH_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "jungle_leaves_item"), JUNGLE_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_jungle_leaves_item"), DRY_JUNGLE_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "acacia_leaves_item"), ACACIA_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_acacia_leaves_item"), DRY_ACACIA_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dark_oak_leaves_item"), DARK_OAK_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_dark_oak_leaves_item"), DRY_DARK_OAK_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "azalea_leaves_item"), AZALEA_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_azalea_leaves_item"), DRY_AZALEA_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "azalea_petals"), AZALEA_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_azalea_petals"), DRY_AZALEA_PETALS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "mangrove_leaves_item"), MANGROVE_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_mangrove_leaves_item"), DRY_MANGROVE_LEAVES_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "fern_leaves"), FERN_LEAVES);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "dry_fern_leaves"), DRY_FERN_LEAVES);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "stone_item"), STONE_ITEM);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "stone_shard"), STONE_SHARD);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "grass_string"), GRASS_STRING);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "diamond_cut"), DIAMOND_CUT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "emerald_cut"), EMERALD_CUT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "sapphire"), SAPPHIRE);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "sapphire_cut"), SAPPHIRE_CUT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "ruby"), RUBY);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "ruby_cut"), RUBY_CUT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "pearl"), PEARL);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "silver_ingot"), SILVER_INGOT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "raw_silver"), RAW_SILVER);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "salt"), SALT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "amethyst_cut"), AMETHYST_CUT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "raw_tungsten"), RAW_TUNGSTEN);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "tungsten_ingot"), TUNGSTEN_INGOT);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_ingot"), STEEL_INGOT);

        //Tool Items Registry
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "stone_shard_pickaxe"), STONE_SHARD_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_shovel"), STEEL_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_sword"), STEEL_SWORD);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_pickaxe"), STEEL_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_axe"), STEEL_AXE);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_hoe"), STEEL_HOE);

        //Armor Items Registry
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_helmet"), STEEL_HELMET);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_chestplate"), STEEL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_leggings"), STEEL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("alphaworld2", "steel_boots"), STEEL_BOOTS);
    }
}
