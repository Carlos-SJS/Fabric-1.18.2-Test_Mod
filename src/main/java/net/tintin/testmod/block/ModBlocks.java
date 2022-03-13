package net.tintin.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tintin.testmod.TestMod;
import net.tintin.testmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block TINTIN_BLOCK = registerBlock("tintin_block", new Block(FabricBlockSettings.of(Material.WOOD).luminance(15)), ModItemGroup.RANDOM);
    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(6f).requiresTool()), ModItemGroup.MOD_STUFF);
    public static final Block TIN_ORE = registerBlock("tin_ore", new  Block(FabricBlockSettings.of(Material.STONE).hardness(3f).requiresTool()), ModItemGroup.MOD_STUFF);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        TestMod.LOGGER.info("Registering blocks...");
    }
}
