package isaacutah1379.mods.redstoneextended.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static isaacutah1379.mods.redstoneextended.RedstoneExtended.id;

public class REBlockTags {
    public static final TagKey<Block> YOUR_TAG = TagKey.create(Registries.BLOCK, id("your_tag"));
}
