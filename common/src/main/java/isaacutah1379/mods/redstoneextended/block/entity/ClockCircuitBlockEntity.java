package isaacutah1379.mods.redstoneextended.block.entity;

import isaacutah1379.mods.redstoneextended.RedstoneExtended;
import isaacutah1379.mods.redstoneextended.block.ClockCircuitBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ClockCircuitBlockEntity extends BlockEntity {
    public int onSetting = 1;
    public int offSetting = 1;
    private int countdown = 0;


    // Constructors
    protected ClockCircuitBlockEntity(BlockEntityType<?> type, BlockPos position, BlockState state) {
        super(type, position, state);
    }

    public ClockCircuitBlockEntity(BlockPos position, BlockState state) {
        this(REBlockEntities.clockCircuitBlockEntity.get(), position, state);
    }


    // The ticker
    public static void tick(Level level, BlockPos position, BlockState state, ClockCircuitBlockEntity bEntity) {
        if (level.isClientSide) {
            return;
        }

        if (bEntity.countdown > 0) {
            bEntity.countdown--;
            bEntity.setChanged();
        } 
        
        if (bEntity.countdown == 0) {
            boolean wasPowered = state.getValue(ClockCircuitBlock.POWERED);
            BlockState newState = state.cycle(ClockCircuitBlock.POWERED);
            level.setBlock(position, newState, 3);

            if (wasPowered) {
                bEntity.countdown = bEntity.offSetting * 2;
            } else {
                bEntity.countdown = bEntity.onSetting * 2;
            }
            bEntity.setChanged();

            // DEBUG
            RedstoneExtended.logger.debug("Change!");
        } else {
            // DEBUG
            RedstoneExtended.logger.debug("No change.");
        }
    }


    // Read and write settings from disk
    public void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);

        tag.putInt("onSetting", onSetting);
        tag.putInt("offSetting", offSetting);
    }

    public void load(CompoundTag tag) {
        super.load(tag);

        this.onSetting = tag.getInt("onSetting");
        this.offSetting = tag.getInt("offSetting");

        if (!tag.contains("onSetting") || !tag.contains("offSetting")) {
            this.onSetting = 1;
            this.offSetting = 1;
        }
    }
}
