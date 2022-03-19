package net.tintin.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tintin.testmod.TestMod;

public class ModItems {

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings().group(ModItemGroup.MOD_STUFF)));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings().group(ModItemGroup.MOD_STUFF)));
    public static final Item DUCK = registerItem("duck", new Item(new FabricItemSettings().group(ModItemGroup.RANDOM)));
    public static final Item BABY = registerItem("baby", new Item(new FabricItemSettings().group(ModItemGroup.RANDOM).food(ModFoodComponents.BABY)));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new FabricItemSettings().group(ModItemGroup.MOD_STUFF).food(ModFoodComponents.LETTUCE)));
    public static final Item TOMATOE = registerItem("tomatoe", new Item(new FabricItemSettings().group(ModItemGroup.MOD_STUFF).food(ModFoodComponents.TOMATOE)));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().group(ModItemGroup.MOD_STUFF).food(ModFoodComponents.CHEESE)));
    public static final Item TACO = registerItem("taco", new Item(new FabricItemSettings().group(ModItemGroup.MOD_STUFF).food(ModFoodComponents.TACO)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TestMod.LOGGER.info("Registering mod items...");
    }
}
