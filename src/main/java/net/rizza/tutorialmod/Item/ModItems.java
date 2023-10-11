package net.rizza.tutorialmod.Item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rizza.tutorialmod.Item.custom.AKgun;
import net.rizza.tutorialmod.Item.custom.AWPgun;
import net.rizza.tutorialmod.Item.custom.MAGNUMgun;
import net.rizza.tutorialmod.Item.custom.SHOTgun;
import net.rizza.tutorialmod.TutorialMod;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //public static final RegistryObject<Item> AWP = ITEMS.register("awp", ()-> new Item(new Item.Properties()));


    public static final RegistryObject<Item> AWPGUN = ITEMS.register("awpgun",
            ()-> new AWPgun(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SHOTGUN = ITEMS.register("shotgun",
            ()-> new SHOTgun(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AKGUN = ITEMS.register("akgun",
            ()-> new AKgun(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAGNUMGUN = ITEMS.register("magnumgun",
            ()-> new MAGNUMgun(new Item.Properties().stacksTo(1)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
