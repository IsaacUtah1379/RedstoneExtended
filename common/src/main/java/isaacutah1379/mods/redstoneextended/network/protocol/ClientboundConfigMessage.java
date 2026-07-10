package isaacutah1379.mods.redstoneextended.network.protocol;

import net.blay09.mods.balm.api.network.SyncConfigMessage;
import isaacutah1379.mods.redstoneextended.RedstoneExtendedConfig;

public class ClientboundConfigMessage extends SyncConfigMessage<RedstoneExtendedConfig> {
    public ClientboundConfigMessage(RedstoneExtendedConfig yourModConfig) {
        super(yourModConfig);
    }
}
