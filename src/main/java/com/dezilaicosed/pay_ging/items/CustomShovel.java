package com.dezilaicosed.pay_ging.items;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class CustomShovel extends ShovelItem {
    public CustomShovel(ToolMaterial toolMaterial) {
        super(toolMaterial, 1.5f, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
