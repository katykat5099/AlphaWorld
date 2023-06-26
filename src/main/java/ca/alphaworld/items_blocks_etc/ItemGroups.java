package ca.alphaworld.items_blocks_etc;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static ca.alphaworld.items_blocks_etc.Items.DRY_GRASS;

public class ItemGroups {

    private static final ItemGroup ALPHAWORLD_ITEM_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(DRY_GRASS)).displayName(Text.translatable("itemGroup.alphaworld.alphaworld_item_group")).build();

    public static void itemGroupRegistry(){
        Registry.register(Registries.ITEM_GROUP, new Identifier("alphaworld", "alphaworld_item_group"), ALPHAWORLD_ITEM_GROUP);

    }
}
