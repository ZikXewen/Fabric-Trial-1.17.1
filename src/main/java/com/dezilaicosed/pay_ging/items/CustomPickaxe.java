package com.dezilaicosed.pay_ging.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomPickaxe extends PickaxeItem {
    public CustomPickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
