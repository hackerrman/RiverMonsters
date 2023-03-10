package net.matth.rivermonsters.item;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RiverMonsters.MOD_ID);

    public static final RegistryObject<Item> STEEL_KNIFE = ITEMS.register("steel_knife", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    public static final RegistryObject<Item> GOLIATH_TIGERFISH = ITEMS.register("goliath_tigerfish", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> GOLIATH_TIGERFISH_SPAWN_EGG = ITEMS.register("goliath_tigerfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GOLIATH_TIGER,0xe38827, 0xedd4a1,
                    new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> GIANT_STINGRAY_SPAWN_EGG = ITEMS.register("giant_stingray_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GIANT_STINGRAY,0x614927, 0x917143,
                    new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> BOWFIN_SPAWN_EGG = ITEMS.register("bowfin_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BOWFIN,0x593b1d, 0x22c743,
                    new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> ALLIGATOR_GAR_SPAWN_EGG = ITEMS.register("alligator_gar_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ALLIGATOR_GAR,0xddedde, 0x7a9e7e,
                    new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> GREENLAND_SHARK_SPAWN_EGG = ITEMS.register("greenland_shark_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GREENLAND_SHARK,0x494d46, 0x6e7575,
                    new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
