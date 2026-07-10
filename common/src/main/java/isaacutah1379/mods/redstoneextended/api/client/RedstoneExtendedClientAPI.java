package isaacutah1379.mods.redstoneextended.api.client;

import java.lang.reflect.InvocationTargetException;

public class RedstoneExtendedClientAPI {

    private static final InternalClientMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalClientMethods) Class.forName("isaacutah1379.mods.redstoneextended.client.InternalClientMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
