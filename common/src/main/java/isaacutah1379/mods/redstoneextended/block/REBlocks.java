package isaacutah1379.mods.redstoneextended.block;

import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.world.level.block.Block;

import static net.blay09.mods.balm.api.block.BalmBlocks.blockProperties;
import static isaacutah1379.mods.redstoneextended.RedstoneExtended.id;

public class REBlocks {

    public static Block clockCircuitBlock;

    public static void initialize(BalmBlocks blocks) {
        blocks.register(
                (identifier) -> clockCircuitBlock = new ClockCircuitBlock(blockProperties(identifier).strength(3.5F).requiresCorrectToolForDrops()),
                BalmItems::blockItem,
                id("clock_circuit_block"));
    }
}
