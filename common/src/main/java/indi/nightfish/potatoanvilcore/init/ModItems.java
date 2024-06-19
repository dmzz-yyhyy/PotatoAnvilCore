package indi.nightfish.potatoanvilcore.init;

import com.tterrag.registrate.util.entry.ItemEntry;
import indi.nightfish.potatoanvilcore.PotatoAnvilCore;
import net.minecraft.world.item.Item;

public class ModItems {

    static {
        PotatoAnvilCore.REGISTRATE.creativeModeTab(ModCreativeModeTab.EXAMPLE_TAB);
    }

    public static final ItemEntry<Item> EXAMPLE_ITEM = PotatoAnvilCore.REGISTRATE
            .item("example_item", Item::new).register();

    public static void register() {

    }
}
