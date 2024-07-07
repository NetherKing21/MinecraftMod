package net.netherking.examplemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.netherking.examplemod.ExampleMod;
import net.netherking.examplemod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLAMING_CARROT.get()))
            .title(Component.translatable("creatvietab.example_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                //Tutorial items
                output.accept(ModItems.SAPPHIRE.get());
                output.accept(ModItems.RAW_SAPPHIRE.get());

                //My items
                output.accept(ModItems.FLAMING_CARROT.get());

                //Tutorial blocks
                output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                output.accept(ModBlocks.SAPPHIRE_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                //My blocks
                output.accept(ModBlocks.THICC_SLIME.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
