package inid.nightfish.init;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.level.block.Block;

import static inid.nightfish.PotatoAnvilCore.REGISTRATE;


public class ModBlocks {

    static {
        REGISTRATE.creativeModeTab(ModCreativeModeTab.EXAMPLE_TAB);
    }

    public static final RegistryEntry<Block> EXAMPLE_BLOCK = REGISTRATE
            .block("example_block", Block::new).simpleItem().register();

    public static void register() {

    }
}
