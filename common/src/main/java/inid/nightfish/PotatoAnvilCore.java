package inid.nightfish;

import inid.nightfish.data.PotatoAnvilCoreDatagen;
import inid.nightfish.init.ModBlocks;
import inid.nightfish.init.ModCreativeModeTab;
import inid.nightfish.init.ModItems;
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
