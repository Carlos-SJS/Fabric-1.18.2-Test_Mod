package net.tintin.testmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.tintin.testmod.TestMod;
import net.tintin.testmod.item.ModItems;

public class ModRegistries {
    public static  void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        TestMod.LOGGER.info("Registering fuels for " + TestMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.BABY, 2000);
    }
}
