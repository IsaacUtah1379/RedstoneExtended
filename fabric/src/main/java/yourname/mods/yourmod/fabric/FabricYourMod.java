package yourname.mods.yourmod.fabric;

import isaacutah1379.mods.redstoneextended.RedstoneExtended;
import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;

public class FabricYourMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(RedstoneExtended.MOD_ID, EmptyLoadContext.INSTANCE, RedstoneExtended::initialize);
    }
}
