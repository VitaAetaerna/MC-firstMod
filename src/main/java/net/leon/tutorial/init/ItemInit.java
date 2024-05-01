package net.leon.tutorial.init;

import net.leon.tutorial.Tutorial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit{
    // Create a new Register for Items that are created in this Script
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorial.modID);

    // Create item itself with all it Stats etc.
    public static final RegistryObject<Item> DOG_COOKIE = register("Dog_Cookie", () -> new Item(new Item.Properties().tab(Tutorial.tutorial_Tab)));

    // Register Items created with name and ingame name
    private static <T extends Item>RegistryObject<T> register(final String name, final Supplier<T> item){
         return Items.register(name, item);
    }


}
