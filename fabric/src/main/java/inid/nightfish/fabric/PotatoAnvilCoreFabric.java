package inid.nightfish.fabric;

import net.fabricmc.api.ModInitializer;

public class PotatoAnvilCoreFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        inid.nightfish.PotatoAnvilCore.init();
    }
}