package isaacutah1379.mods.redstoneextended.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import isaacutah1379.mods.redstoneextended.RedstoneExtended;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        RedstoneExtended.logger.info("Hello from " + RedstoneExtended.MOD_ID);
    }
}
