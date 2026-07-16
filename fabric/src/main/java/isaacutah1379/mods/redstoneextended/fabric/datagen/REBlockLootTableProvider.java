package isaacutah1379.mods.redstoneextended.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import isaacutah1379.mods.redstoneextended.block.REBlocks;

public class REBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected REBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropSelf(REBlocks.clockCircuitBlock);
    }
}
