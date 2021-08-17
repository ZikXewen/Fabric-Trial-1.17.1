package com.dezilaicosed.pay_ging.registry;

import com.dezilaicosed.pay_ging.PayGing;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block PAY_GING_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(1.5f, 6.0f));

    public static <T extends Block> void registerBlock(String id, T block) {
        Registry.register(Registry.BLOCK, new Identifier(PayGing.MOD_ID, id), block);
        Registry.register(Registry.ITEM, new Identifier(PayGing.MOD_ID, id),
                new BlockItem(block, new Item.Settings().group(PayGing.TAB)));
    }

    public static void registerBlocks() {
        registerBlock("pay_ging_block", PAY_GING_BLOCK);
    }
}
