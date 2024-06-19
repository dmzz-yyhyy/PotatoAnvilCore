package indi.nightfish;

import indi.nightfish.data.PotatoAnvilCoreDatagen;
import indi.nightfish.init.ModBlocks;
import indi.nightfish.init.ModCreativeModeTab;
import indi.nightfish.init.ModItems;
import dev.dubhe.anvilcraft.api.registry.AnvilCraftRegistrate;

public class PotatoAnvilCore {
    public static final String MOD_ID = "potato_anvil_core";

    public static final AnvilCraftRegistrate REGISTRATE = AnvilCraftRegistrate.create(MOD_ID);

    public static void init() {
        // common init
        ModItems.register();
        ModBlocks.register();
        ModCreativeModeTab.register();

        // datagen init
        PotatoAnvilCoreDatagen.init();

        // fabric exclusive, squeeze this in here to register before stuff is used
        REGISTRATE.registerRegistrate();
    }
}
