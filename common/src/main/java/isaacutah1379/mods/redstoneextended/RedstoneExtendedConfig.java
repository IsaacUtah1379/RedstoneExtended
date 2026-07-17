package isaacutah1379.mods.redstoneextended;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.config.reflection.Comment;
import net.blay09.mods.balm.api.config.reflection.Config;
import net.blay09.mods.balm.api.config.reflection.NestedType;
import java.util.List;

@Config(RedstoneExtended.MOD_ID)
public class RedstoneExtendedConfig {

    @Comment("This is an example int property")
    public int exampleInt = 1234;

    @NestedType(String.class)
    @Comment("This is an example string list property")
    public List<String> exampleStringList = List.of("Hello", "World");

    public static void initialize() {
        Balm.getConfig().registerConfig(RedstoneExtendedConfig.class);
    }

    public static RedstoneExtendedConfig getActive() {
        return Balm.getConfig().getActiveConfig(RedstoneExtendedConfig.class);
    }
}
