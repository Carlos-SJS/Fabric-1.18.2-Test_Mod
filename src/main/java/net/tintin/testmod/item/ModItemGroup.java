package net.tintin.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tintin.testmod.TestMod;

public class ModItemGroup {

    public static final ItemGroup RANDOM = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "random"), () -> new ItemStack(ModItems.DUCK));
}
