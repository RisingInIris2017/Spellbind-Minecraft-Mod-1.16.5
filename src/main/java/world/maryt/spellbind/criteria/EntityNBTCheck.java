package world.maryt.spellbind.criteria;

import net.minecraft.entity.LivingEntity;

public class EntityNBTCheck {
    public static boolean entityNBTCheck(LivingEntity target, String nbtKey) {
        return target.serializeNBT().contains(nbtKey) ? true : false;
    }
}
