package com.Qing.soulcrystalblocker.mixin;

import com.Qing.soulcrystalblocker.config.ModConfigs;
import com.aizistral.enigmaticlegacy.handlers.SuperpositionHandler;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(
        value = {SuperpositionHandler.class},
        remap = false
)

public class SoulCrystalMixin {
    public SoulCrystalMixin(){
    }

    @Inject(
            method = "canDropSoulCrystal",
            at = @At("HEAD"),
            cancellable = true
    )
    private static void canDropSoulCrystal(Player player, boolean hadRing, CallbackInfoReturnable<Boolean> cir){
        if(ModConfigs.PREVENT_DROP_ENABLE.get()) {
            cir.setReturnValue(false);
        }
    }
}
