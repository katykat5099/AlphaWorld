package ca.alphaworld.alphaworld2.data.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class StoneShardMaterial implements ToolMaterial {
    public static final StoneShardMaterial INSTANCE = new StoneShardMaterial();

    @Override
    public int getDurability(){
        return 13;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 1.2F;
    }

    @Override
    public float getAttackDamage(){
        return 1.5F;
    }

    @Override
    public int getMiningLevel(){
        return 1;
    }

    @Override
    public int getEnchantability(){
        return 1;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AIR);
    }
}
