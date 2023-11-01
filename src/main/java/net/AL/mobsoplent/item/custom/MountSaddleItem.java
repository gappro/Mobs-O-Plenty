package net.AL.mobsoplent.item.custom;

import net.AL.mobsoplent.entity.custom.OstrichEntity;
import net.AL.mobsoplent.entity.custom.VoidsentEntity;
import net.AL.mobsoplent.implementables.MountSaddleable;
import net.AL.mobsoplent.item.ModItems;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Saddleable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.gameevent.GameEvent;

public class MountSaddleItem extends Item{
    public MountSaddleItem(Item.Properties pProperties) {
        super(pProperties);
    }

    /**
     * Try interacting with given entity. Return {@code InteractionResult.PASS} if nothing should happen.
     */
    public InteractionResult interactLivingEntity(ItemStack pStack, Player pPlayer, LivingEntity pTarget, InteractionHand pHand) {
        if (pTarget instanceof MountSaddleable saddleable && pTarget.isAlive()) {
            if (!saddleable.isSaddled() && saddleable.isSaddleable()) {
                if (!pPlayer.level().isClientSide) {
                    if(pTarget instanceof VoidsentEntity && pStack.is(ModItems.VOIDER_SADDLE.get()))
                        saddleable.equipSaddle(SoundSource.NEUTRAL);

                    if(pTarget instanceof OstrichEntity && pStack.is(ModItems.OSTRICH_SADDLE.get()))
                        saddleable.equipSaddle(SoundSource.NEUTRAL);


                    pTarget.level().gameEvent(pTarget, GameEvent.EQUIP, pTarget.position());
                    pStack.shrink(1);
                }

                return InteractionResult.sidedSuccess(pPlayer.level().isClientSide);
            }
        }

        return InteractionResult.PASS;
    }
}
