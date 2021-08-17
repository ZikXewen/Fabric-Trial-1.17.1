package com.dezilaicosed.pay_ging.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class CustomHoe extends HoeItem {
    public CustomHoe(ToolMaterial toolMaterial) {
        super(toolMaterial, -2, -1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
