package com.dezilaicosed.pay_ging.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CustomSword extends SwordItem {
    public CustomSword(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, -2.4f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
