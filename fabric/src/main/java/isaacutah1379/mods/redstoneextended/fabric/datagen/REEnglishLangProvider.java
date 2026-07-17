package isaacutah1379.mods.redstoneextended.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class REEnglishLangProvider extends FabricLanguageProvider {
    protected REEnglishLangProvider(FabricDataOutput dataOutput) {
		super(dataOutput, "en_us");
	}

	@Override
	public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("block.redstoneextended.clock_circuit", "Clock Circuit");
	}
}
