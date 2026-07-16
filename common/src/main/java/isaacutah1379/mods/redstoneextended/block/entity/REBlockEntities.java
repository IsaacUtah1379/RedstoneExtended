package isaacutah1379.mods.redstoneextended.block.entity;

import isaacutah1379.mods.redstoneextended.RedstoneExtended;
import isaacutah1379.mods.redstoneextended.block.REBlocks;
import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.block.BalmBlockEntities;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class REBlockEntities {
    public static DeferredObject<BlockEntityType<ClockCircuitBlockEntity>> clockCircuitBlockEntity;

    public static void initialize(BalmBlockEntities blockEntities) {
        clockCircuitBlockEntity = blockEntities.registerBlockEntity(RedstoneExtended.id("clock_circuit_block"), ClockCircuitBlockEntity::new, () -> new Block[]{REBlocks.clockCircuitBlock});
    }
}
