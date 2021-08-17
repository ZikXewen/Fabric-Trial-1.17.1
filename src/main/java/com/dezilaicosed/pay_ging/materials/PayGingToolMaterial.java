package com.dezilaicosed.pay_ging.materials;

import com.dezilaicosed.pay_ging.registry.ModItems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PayGingToolMaterial implements ToolMaterial {
    @Override
    public float getAttackDamage() {
        return 2f;
    }

    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.PAY_GING);
    }
}