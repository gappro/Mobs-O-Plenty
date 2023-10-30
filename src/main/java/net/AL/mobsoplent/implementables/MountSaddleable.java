package net.AL.mobsoplent.implementables;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

import javax.annotation.Nullable;

public interface MountSaddleable {
    boolean isSaddleable();

    void equipSaddle(@Nullable SoundSource pSource);

    default SoundEvent getSaddleSoundEvent() {
        return SoundEvents.HORSE_SADDLE;
    }

    boolean isSaddled();
}
