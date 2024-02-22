package net.prangellplays.buildersadditions.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.prangellplays.buildersadditions.BuildersAdditions;
import net.prangellplays.buildersadditions.block.BrownDyeBlock;

public class BuildersAdditionsBlocks {

    public static final Block BROWN_DYE_BLOCK = registerBlock("brown_dye_block",
            new BrownDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(BuildersAdditions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BuildersAdditions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerBuildersAdditionsBlocks() {
        BuildersAdditions.LOGGER.info("Registering ModBlocks for " + BuildersAdditions.MOD_ID);
    }
}
