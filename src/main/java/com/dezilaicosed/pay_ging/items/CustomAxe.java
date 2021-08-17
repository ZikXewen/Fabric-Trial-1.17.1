package com.dezilaicosed.pay_ging.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomAxe extends AxeItem {
    public CustomAxe(ToolMaterial toolMaterial) {
        super(toolMaterial, 6, -3.1f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
