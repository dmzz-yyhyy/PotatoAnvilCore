package indi.nightfish.potatoanvilcore.data.fabric;

import indi.nightfish.potatoanvilcore.PotatoAnvilCore;
import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class PotatoAnvilCoreDatagenFabric implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        Path rootPath = FabricLoader.getInstance().getGameDir().normalize().getParent().getParent();
        ExistingFileHelper helper = ExistingFileHelper.withResources(
                rootPath.resolve("common").resolve("src").resolve("main").resolve("resources"),
                rootPath.resolve("fabric").resolve("src").resolve("main").resolve("resources")
        );
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        PotatoAnvilCore.REGISTRATE.setupDatagen(pack, helper);
    }
}
