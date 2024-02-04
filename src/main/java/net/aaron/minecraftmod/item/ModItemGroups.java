package net.aaron.minecraftmod.item;

import net.aaron.minecraftmod.MinecraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * This class contains all of the item groups used in the mod.
 */
public class ModItemGroups {
    /**
     * The RUBY_GROUP is a tab in the creative inventory that contains the RUBY and RAW_RUBY items.
     */
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, // name of the item group
            new Identifier(MinecraftMod.MOD_ID, "ruby"), // id of the item group
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby")) // display name of the item group
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> { // function that adds the items to the creative tab
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                    }).build());

    /**
     * This method registers the item groups.
     */
    public static void registerItemGroups() {
        MinecraftMod.LOGGER.info("Registering Item Groups for " + MinecraftMod.MOD_ID);
    }
}
