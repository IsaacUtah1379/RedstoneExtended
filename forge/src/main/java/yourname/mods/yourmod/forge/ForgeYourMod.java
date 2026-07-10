package isaacutah1379.mods.redstoneextended.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import isaacutah1379.mods.redstoneextended.YourMod;
import isaacutah1379.mods.redstoneextended.client.YourModClient;

@Mod(YourMod.MOD_ID)
public class ForgeYourMod {

    public ForgeYourMod(FMLJavaModLoadingContext context) {
        Balm.initializeMod(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourMod::initialize);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> BalmClient.initializeMod(YourMod.MOD_ID, EmptyLoadContext.INSTANCE, YourModClient::initialize));
    }

}
