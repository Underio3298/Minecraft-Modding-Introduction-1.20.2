package net.aaron.minecraftmod;

import net.aaron.minecraftmod.block.ModBlocks;
import net.aaron.minecraftmod.item.ModItemGroups;
import net.aaron.minecraftmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class initializes the mod.
 */
public class MinecraftMod implements ModInitializer {

  /**
   * The unique ID of the mod.
   */
  public static final String MOD_ID = "minecraft-mod";

  /**
   * The logger for the mod.
   */
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    // Register the items
    ModItems.registerModItems();
    // Register the item groups
    ModItemGroups.registerItemGroups();
    // Register the blocks
    ModBlocks.registerModBlocks();
    // Log that the mod has been initialized
    LOGGER.info(MOD_ID + " has been initialized.");
  }
}
