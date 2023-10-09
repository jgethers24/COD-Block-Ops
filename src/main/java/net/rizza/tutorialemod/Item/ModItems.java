package net.rizza.tutorialemod.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rizza.tutorialemod.Item.custom.AWPgun;
import net.rizza.tutorialemod.TutorialMod;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> AWP = ITEMS.register("awp", ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AWP_GUN = ITEMS.register("awp_gun", ()-> new AWPgun(new Item.Properties()));

    //public static final RegistryObject<Item> SHOTGUN = ITEMS.register("shotgun", ()-> new AWPgun(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
