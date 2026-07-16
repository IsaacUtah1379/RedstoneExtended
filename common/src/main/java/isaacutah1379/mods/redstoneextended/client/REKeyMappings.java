package isaacutah1379.mods.redstoneextended.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.blay09.mods.kuma.api.InputBinding;
import net.blay09.mods.kuma.api.Kuma;
import net.blay09.mods.kuma.api.ManagedKeyMapping;
import isaacutah1379.mods.redstoneextended.RedstoneExtended;

import static isaacutah1379.mods.redstoneextended.RedstoneExtended.id;

public class REKeyMappings {

    public static ManagedKeyMapping yourKey;

    public static void initialize() {
        yourKey = Kuma.createKeyMapping(id("your_key"))
                .withDefault(InputBinding.key(InputConstants.KEY_B))
                .handleScreenInput(event -> {
                    RedstoneExtended.logger.info("B was pressed - " + RedstoneExtended.MOD_ID);
                    return true;
                })
                .build();
    }
}
