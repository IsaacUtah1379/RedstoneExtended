package isaacutah1379.mods.redstoneextended.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import isaacutah1379.mods.redstoneextended.block.REBlocks;
import isaacutah1379.mods.redstoneextended.tag.REBlockTags;

import java.util.concurrent.CompletableFuture;

public class REBlockTagProvider extends FabricTagProvider<Block> {
    public REBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.BLOCK, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        TagKey<Block> mineWithPickaxe = TagKey.create(Registries.BLOCK, new ResourceLocation("minecraft", "mineable/pickaxe"));
        getOrCreateTagBuilder(mineWithPickaxe).add(REBlocks.clockCircuitBlock);
    }
}
