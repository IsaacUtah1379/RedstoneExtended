package isaacutah1379.mods.redstoneextended.fabric.client;

import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;
import isaacutah1379.mods.redstoneextended.YourMod;
import isaacutah1379.mods.redstoneextended.client.YourModClient;

public class FabricYourModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(RedstoneExtended.MOD_ID, EmptyLoadContext.INSTANCE, YourModClient::initialize);
    }
}
