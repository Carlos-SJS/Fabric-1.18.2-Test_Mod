package net.tintin.testmod;

import net.fabricmc.api.ModInitializer;
import net.tintin.testmod.block.ModBlocks;
import net.tintin.testmod.item.ModItems;
import net.tintin.testmod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}
