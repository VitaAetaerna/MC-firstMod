package net.leon.tutorial;

import net.leon.tutorial.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// Mod id
@Mod("tutorial")
public class Tutorial{

    // Creative Tab, mod CATEGORY, like food or smth (in chat)
    public static final CreativeModeTab tutorial_Tab= new CreativeModeTab("tutorial"){
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon(){
            return new ItemStack(ItemInit.DOG_COOKIE.get());
        }
    };

    // MOD ID
    public static final String modID = "tutorial";

    // Constructor
    public Tutorial(){
        // Create EventBus
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // register Items into event bus, this means loading all ITEMS into the game
        ItemInit.Items.register(bus);
        // Tell MC Forge to register this class as mod
        MinecraftForge.EVENT_BUS.register(this);
    }
}