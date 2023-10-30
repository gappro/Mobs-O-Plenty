package net.AL.mobsoplent.event;

import java.util.EnumSet;

import net.AL.mobsoplent.entity.AbstractMount;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class RunAroundLikeCrazyGoalMount extends Goal {
    private final AbstractMount mount;
    private final double speedModifier;
    private double posX;
    private double posY;
    private double posZ;

    public RunAroundLikeCrazyGoalMount(AbstractMount pMount, double pSpeedModifier) {
        this.mount = pMount;
        this.speedModifier = pSpeedModifier;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    /**
     * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
     * method as well.
     */
    public boolean canUse() {
        if (!this.mount.isTamed() && this.mount.isVehicle()) {
            Vec3 vec3 = DefaultRandomPos.getPos(this.mount, 5, 4);
            if (vec3 == null) {
                return false;
            } else {
                this.posX = vec3.x;
                this.posY = vec3.y;
                this.posZ = vec3.z;
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void start() {
        this.mount.getNavigation().moveTo(this.posX, this.posY, this.posZ, this.speedModifier);
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean canContinueToUse() {
        return !this.mount.isTamed() && !this.mount.getNavigation().isDone() && this.mount.isVehicle();
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void tick() {
        if (!this.mount.isTamed() && this.mount.getRandom().nextInt(this.adjustedTickDelay(50)) == 0) {
            Entity entity = this.mount.getPassengers().get(0);
            if (entity == null) {
                return;
            }

            if (entity instanceof Player) {
                int i = this.mount.getTemper();
                int j = this.mount.getMaxTemper();
                if (j > 0 && this.mount.getRandom().nextInt(j) < i && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(mount, (Player)entity)) {
                    this.mount.tameWithName((Player)entity);
                    return;
                }

                this.mount.modifyTemper(5);
            }

            this.mount.ejectPassengers();
            this.mount.makeMad();
            this.mount.level().broadcastEntityEvent(this.mount, (byte)6);
        }

    }
}
