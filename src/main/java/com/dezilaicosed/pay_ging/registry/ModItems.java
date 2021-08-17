package com.dezilaicosed.pay_ging.registry;

import java.util.function.Supplier;

import com.dezilaicosed.pay_ging.PayGing;
import com.dezilaicosed.pay_ging.items.CustomAxe;
import com.dezilaicosed.pay_ging.items.CustomHoe;
import com.dezilaicosed.pay_ging.items.CustomPickaxe;
import com.dezilaicosed.pay_ging.items.CustomShovel;
import com.dezilaicosed.pay_ging.items.CustomSword;
import com.dezilaicosed.pay_ging.materials.PayGingToolMaterial;

import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Supplier<Item> ITEM_GETTER = () -> new Item(new Item.Settings().group(PayGing.TAB));
    public static final Item PAY_GING = ITEM_GETTER.get();

    public static final ToolItem PAY_GING_PICKAXE = new CustomPickaxe(new PayGingToolMaterial());
    public static final ToolItem PAY_GING_AXE = new CustomAxe(new PayGingToolMaterial());
    public static final ToolItem PAY_GING_SHOVEL = new CustomShovel(new PayGingToolMaterial());
    public static final ToolItem PAY_GING_HOE = new CustomHoe(new PayGingToolMaterial());
    public static final ToolItem PAY_GING_SWORD = new CustomSword(new PayGingToolMaterial());

    public static <T extends Item> void registerItem(String id, T item) {
        Registry.register(Registry.ITEM, new Identifier(PayGing.MOD_ID, id), item);
    }

    public static void registerItems() {
        registerItem("pay_ging", PAY_GING);
        registerItem("pay_ging_pickaxe", PAY_GING_PICKAXE);
        registerItem("pay_ging_axe", PAY_GING_AXE);
        registerItem("pay_ging_hoe", PAY_GING_HOE);
        registerItem("pay_ging_shovel", PAY_GING_SHOVEL);
        registerItem("pay_ging_sword", PAY_GING_SWORD);
    }
}
