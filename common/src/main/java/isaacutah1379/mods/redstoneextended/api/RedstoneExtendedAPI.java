package isaacutah1379.mods.redstoneextended.api;

import java.lang.reflect.InvocationTargetException;

public class RedstoneExtendedAPI {
    public static final String MOD_ID = "yourmod";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("isaacutah1379.mods.redstoneextended.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
