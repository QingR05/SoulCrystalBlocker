package com.Qing.soulcrystalblocker.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {

    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue PREVENT_DROP_ENABLE;
    public static final ForgeConfigSpec.BooleanValue IS_THE_BLESSED_ONE_ENABLE;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        // Enable the mod setting
        builder.comment("Prevent player dropping soul crystal setting").push("Preventing Player Dropping Soul Crystal Setting");

        PREVENT_DROP_ENABLE = builder
                .comment("Enable/disable this function?")
                .define("true to enable, preventing player dropping soul crystal. Else false to disable", true);

        builder.pop();

        builder.comment("Enable to bypass the limit to use The Architect's Favor").push("The Architect's Favor Setting");

        IS_THE_BLESSED_ONE_ENABLE = builder
                .comment("Enable/disable this function?")
                .define("true to enable, bypass the limit to use The Architect's Favor. Else false to disable", true);

        SPEC = builder.build();
    }
}