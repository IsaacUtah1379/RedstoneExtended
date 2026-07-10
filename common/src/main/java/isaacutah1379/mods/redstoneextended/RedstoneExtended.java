package isaacutah1379.mods.redstoneextended;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import isaacutah1379.mods.redstoneextended.RedstoneExtended;
import isaacutah1379.mods.redstoneextended.RedstoneExtendedConfig;
import isaacutah1379.mods.redstoneextended.block.ModBlocks;
import isaacutah1379.mods.redstoneextended.item.ModItems;
import isaacutah1379.mods.redstoneextended.network.ModNetworking;

public class RedstoneExtended {

    public static final Logger logger = LoggerFactory.getLogger(RedstoneExtended.class);

    public static final String MOD_ID = "redstoneextended";

    public static void initialize() {
        RedstoneExtendedConfig.initialize();
        ModNetworking.initialize(Balm.getNetworking());
        ModBlocks.initialize(Balm.getBlocks());
        ModItems.initialize(Balm.getItems());
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
