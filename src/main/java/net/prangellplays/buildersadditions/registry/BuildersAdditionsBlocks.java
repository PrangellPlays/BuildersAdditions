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
import net.prangellplays.buildersadditions.block.dye.*;

public class BuildersAdditionsBlocks {
    public static final Block BLACK_DYE_BLOCK = registerBlock("black_dye_block",
            new BlackDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block BLUE_DYE_BLOCK = registerBlock("blue_dye_block",
            new BlueDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block BROWN_DYE_BLOCK = registerBlock("brown_dye_block",
            new BrownDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block CYAN_DYE_BLOCK = registerBlock("cyan_dye_block",
            new CyanDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block GRAY_DYE_BLOCK = registerBlock("gray_dye_block",
            new GrayDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block GREEN_DYE_BLOCK = registerBlock("green_dye_block",
            new GreenDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_DYE_BLOCK = registerBlock("light_blue_dye_block",
            new LightBlueDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_DYE_BLOCK = registerBlock("light_gray_dye_block",
            new LightGrayDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block LIME_DYE_BLOCK = registerBlock("lime_dye_block",
            new LimeDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAGENTA_DYE_BLOCK = registerBlock("magenta_dye_block",
            new MagentaDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block ORANGE_DYE_BLOCK = registerBlock("orange_dye_block",
            new OrangeDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block PINK_DYE_BLOCK = registerBlock("pink_dye_block",
            new PinkDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block PURPLE_DYE_BLOCK = registerBlock("purple_dye_block",
            new PurpleDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block RED_DYE_BLOCK = registerBlock("red_dye_block",
            new RedDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block WHITE_DYE_BLOCK = registerBlock("white_dye_block",
            new WhiteDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block YELLOW_DYE_BLOCK = registerBlock("yellow_dye_block",
            new YellowDyeBlock(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0f).requiresTool().hardness(0f).sounds(BlockSoundGroup.HONEY)), ItemGroups.BUILDING_BLOCKS);


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
