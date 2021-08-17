package com.dezilaicosed.pay_ging;

import com.dezilaicosed.pay_ging.registry.ModBlocks;
import com.dezilaicosed.pay_ging.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class PayGing implements ModInitializer {
    public static final String MOD_ID = "pay_ging";

    public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "all"),
            () -> new ItemStack(ModItems.PAY_GING));

    private static final Identifier SMOOTH_STONE_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/smooth_stone");
    private static final Identifier PAY_GING_BLOCK_LOOT_TABLE_ID = new Identifier(MOD_ID, "blocks/pay_ging_block");

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        modifyLootTable();
    }

    private void modifyLootTable() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (SMOOTH_STONE_LOOT_TABLE_ID.equals(id)) {
                // Test adding item drop
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1)).with(ItemEntry.builder(Items.GOLD_NUGGET))
                        .withFunction(
                                SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 6.0f)).build());
                supplier.withPool(poolBuilder.build());
                // Add Loot Table
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(PAY_GING_BLOCK_LOOT_TABLE_ID));
                supplier.withPool(poolBuilder2.build());
            }
        });
    }
}
