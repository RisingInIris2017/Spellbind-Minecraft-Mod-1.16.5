package world.maryt.spellbind.criteria;

import net.minecraft.entity.LivingEntity;

public class EntityNBTCheck {
    public static boolean entityNBTCheck(LivingEntity target, String nbtKey) {
        if(!nbtKey.equals("#default_value#")) {
            return target.serializeNBT().contains(nbtKey) ? true : false;
        }
        return true;
    }
}
