package indi.nightfish.potatoanvilcore;

import indi.nightfish.potatoanvilcore.data.PotatoAnvilCoreDatagen;
import indi.nightfish.potatoanvilcore.init.ModBlocks;
import indi.nightfish.potatoanvilcore.init.ModCreativeModeTab;
import indi.nightfish.potatoanvilcore.init.ModItems;
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
