package isaacutah1379.mods.redstoneextended.network;

import net.blay09.mods.balm.api.network.BalmNetworking;
import net.blay09.mods.balm.api.network.SyncConfigMessage;
import isaacutah1379.mods.redstoneextended.RedstoneExtendedConfig;
import isaacutah1379.mods.redstoneextended.network.protocol.ClientboundConfigMessage;

import static isaacutah1379.mods.redstoneextended.RedstoneExtended.id;

public class ModNetworking {

    public static void initialize(BalmNetworking networking) {
        SyncConfigMessage.register(id("config"),
                ClientboundConfigMessage.class,
                ClientboundConfigMessage::new,
                RedstoneExtendedConfig.class,
                RedstoneExtendedConfig::new);
    }
}
