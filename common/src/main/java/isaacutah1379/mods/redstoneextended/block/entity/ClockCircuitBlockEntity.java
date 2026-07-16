package isaacutah1379.mods.redstoneextended.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ClockCircuitBlockEntity extends BlockEntity {
    public int onSetting = 1;
    public int offSetting = 1;
    private int countdown = 0;

    protected ClockCircuitBlockEntity(BlockEntityType<?> type, BlockPos position, BlockState state) {
        super(type, position, state);
    }

}
