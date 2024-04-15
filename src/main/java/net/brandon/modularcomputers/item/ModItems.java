package net.brandon.modularcomputers.item;

import net.brandon.modularcomputers.ModularComputers;
import net.brandon.modularcomputers.item.custom.FuelItem;
import net.brandon.modularcomputers.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModularComputers.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
//            () -> new MetalDetectorItem(new Item.Properties().durability(64)));
//
//    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
//            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
//
//    public static final RegistryObject<Item> COCAINE = ITEMS.register("cocaine",
//            () -> new Item(new Item.Properties().food(ModFoods.DRUGS)));
//
//    public static final RegistryObject<Item> BLUE_METH = ITEMS.register("blue_meth",
//            () -> new Item(new Item.Properties().food(ModFoods.DRUGS)));
//
//    public static final RegistryObject<Item> CRYSTAL_METH = ITEMS.register("crystal_meth",
//            () -> new Item(new Item.Properties().food(ModFoods.DRUGS)));
//
//    public static final RegistryObject<Item> WEED = ITEMS.register("weed",
//            () -> new Item(new Item.Properties().food(ModFoods.WEED)));
//
//    public static final RegistryObject<Item> WEED_BROWNIE = ITEMS.register("weed_brownie",
//            () -> new Item(new Item.Properties().food(ModFoods.WEED_LACED_FOODS)));
//
//    public static final RegistryObject<Item> WEED_JELLY = ITEMS.register("weed_jelly",
//            () -> new Item(new Item.Properties().food(ModFoods.WEED_LACED_FOODS)));
//
//    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
//            () -> new FuelItem(new Item.Properties(), 200));

//    public static final RegistryObject<Item> ENDA_SPAWN_EGG = ITEMS.register("enda_spawn_egg",
//            () -> new ForgeSpawnEggItem(ModEntities.ENDA, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
