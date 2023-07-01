package ca.alphaworld.alphaworld2.data.items;

import ca.alphaworld.alphaworld2.registries.AlphaWorld2Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelMaterial implements ToolMaterial {
    public static final SteelMaterial INSTANCE = new SteelMaterial();

    @Override
    public int getDurability(){
        return 1561;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 8.0F;
    }

    @Override
    public float getAttackDamage(){
        return 5.0F;
    }

    @Override
    public int getMiningLevel(){
        return 3;
    }

    @Override
    public int getEnchantability(){
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AlphaWorld2Items.STEEL_INGOT);
    }
}
