package isaacutah1379.mods.redstoneextended.forge;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import isaacutah1379.mods.redstoneextended.RedstoneExtended;
import isaacutah1379.mods.redstoneextended.client.RedstoneExtendedClient;

@Mod(RedstoneExtended.MOD_ID)
public class ForgeRedstoneExtended {

    public ForgeRedstoneExtended(FMLJavaModLoadingContext context) {
        Balm.initializeMod(RedstoneExtended.MOD_ID, EmptyLoadContext.INSTANCE, RedstoneExtended::initialize);
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> BalmClient.initializeMod(RedstoneExtended.MOD_ID, EmptyLoadContext.INSTANCE, RedstoneExtendedClient::initialize));
    }

}
