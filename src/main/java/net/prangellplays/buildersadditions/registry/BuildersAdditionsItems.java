package net.prangellplays.buildersadditions.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.prangellplays.buildersadditions.BuildersAdditions;

public class BuildersAdditionsItems {
    public static final Item DEBUG = registerItem("debug", new Item(new FabricItemSettings().maxCount(1)));

    private static void addItemsToBuildingItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToColoredItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {

    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){

    }
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries){

    }
    private static void addItemsToSpawnItemGroup(FabricItemGroupEntries entries){
    }
    private static void addItemsToOperatorItemGroup(FabricItemGroupEntries entries){

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BuildersAdditions.MOD_ID, name), item);
    }

    public static void registerBuildersAdditionsItems() {
        BuildersAdditions.LOGGER.info("Registering Mod Items for " + BuildersAdditions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(BuildersAdditionsItems::addItemsToBuildingItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(BuildersAdditionsItems::addItemsToColoredItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(BuildersAdditionsItems::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(BuildersAdditionsItems::addItemsToFunctionalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(BuildersAdditionsItems::addItemsToRedstoneItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(BuildersAdditionsItems::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(BuildersAdditionsItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(BuildersAdditionsItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(BuildersAdditionsItems::addItemsToIngredientsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(BuildersAdditionsItems::addItemsToSpawnItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(BuildersAdditionsItems::addItemsToOperatorItemGroup);
    }
}
