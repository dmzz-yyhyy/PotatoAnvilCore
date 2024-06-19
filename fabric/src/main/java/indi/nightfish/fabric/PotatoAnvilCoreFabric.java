package indi.nightfish.fabric;

import indi.nightfish.PotatoAnvilCore;
import net.fabricmc.api.ModInitializer;

public class PotatoAnvilCoreFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PotatoAnvilCore.init();
    }
}