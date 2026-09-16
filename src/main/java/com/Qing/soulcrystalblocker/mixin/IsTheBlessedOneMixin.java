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
public class IsTheBlessedOneMixin {
    public IsTheBlessedOneMixin(){
    }

    @Inject(
            method = "isTheBlessedOne",
            at = @At("HEAD"),
            cancellable = true
    )
    private static void isTheBlessedOne(Player player, CallbackInfoReturnable<Boolean> cir){
        // Mod shouldn't be pay to just to use some specific items
        if(ModConfigs.IS_THE_BLESSED_ONE_ENABLE.get()){
            cir.setReturnValue(true);
        }
    }
}
