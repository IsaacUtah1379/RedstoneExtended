package isaacutah1379.mods.redstoneextended.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import isaacutah1379.mods.redstoneextended.item.REItems;
import isaacutah1379.mods.redstoneextended.tag.REItemTags;

import java.util.concurrent.CompletableFuture;

public class REItemTagProvider extends FabricTagProvider<Item> {
    public REItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.ITEM, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookup) {
        getOrCreateTagBuilder(REItemTags.YOUR_TAG).add(REItems.yourItem);
    }
}
