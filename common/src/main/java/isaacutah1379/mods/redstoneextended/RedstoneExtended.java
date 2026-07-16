package isaacutah1379.mods.redstoneextended;

import net.blay09.mods.balm.api.Balm;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import isaacutah1379.mods.redstoneextended.block.REBlocks;
import isaacutah1379.mods.redstoneextended.block.entity.REBlockEntities;
import isaacutah1379.mods.redstoneextended.item.REItems;
import isaacutah1379.mods.redstoneextended.network.RENetworking;

public class RedstoneExtended {

    public static final Logger logger = LoggerFactory.getLogger(RedstoneExtended.class);

    public static final String MOD_ID = "redstoneextended";

    public static void initialize() {
        RedstoneExtendedConfig.initialize();
        RENetworking.initialize(Balm.getNetworking());
        REBlocks.initialize(Balm.getBlocks());
        REBlockEntities.initialize(Balm.getBlockEntities());
        REItems.initialize(Balm.getItems());
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

}
