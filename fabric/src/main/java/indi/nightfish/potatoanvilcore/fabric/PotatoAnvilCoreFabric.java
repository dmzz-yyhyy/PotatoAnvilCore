package indi.nightfish.potatoanvilcore.fabric;

import indi.nightfish.potatoanvilcore.PotatoAnvilCore;
import net.fabricmc.api.ModInitializer;

public class PotatoAnvilCoreFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PotatoAnvilCore.init();
    }
}