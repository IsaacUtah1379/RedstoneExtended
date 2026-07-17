package isaacutah1379.mods.redstoneextended.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class REDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(REBlockTagProvider::new);
        pack.addProvider(REItemTagProvider::new);
        pack.addProvider(REBlockLootTableProvider::new);
        pack.addProvider(RERecipeProvider::new);
        pack.addProvider(REEnglishLangProvider::new);
    }
}
