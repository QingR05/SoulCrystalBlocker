package com.Qing.soulcrystalblocker.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfigs {

    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue PREVENT_DROP_ENABLE;
    public static final ForgeConfigSpec.BooleanValue IS_THE_BLESSED_ONE_ENABLE;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        // Enable the mod setting
        builder.comment("Prevent player dropping soul crystal setting").push("Dropping Soul Crystal Setting");

        PREVENT_DROP_ENABLE = builder
                .comment("True to enable, preventing player dropping soul crystal, else disable")
                .define("Enable/disable this function?", true);

        builder.pop();

        builder.comment("Enable to bypass the limit to use The Architect's Favor").push("Bypass The Architect's Favor Setting");

        IS_THE_BLESSED_ONE_ENABLE = builder
                .comment("True to enable, bypass the limit to use The Architect's Favor, else disable")
                .define("Enable/disable this function?", true);

        SPEC = builder.build();
    }
}