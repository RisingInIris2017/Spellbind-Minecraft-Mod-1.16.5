package world.maryt.spellbind.actions;

import net.minecraft.entity.LivingEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExecuteCommand {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void executeCommandAt(LivingEntity target, String command) {
        String uuid = target.getUniqueID().toString();
        String parsedCommand = command.replace("#target", uuid);
        int result = target.getEntityWorld().getServer().getCommandManager().handleCommand(target.getEntityWorld().getServer().getCommandSource(), parsedCommand);
        if(result != 0) {
            LOGGER.debug("Command \"/" + parsedCommand + "\" returns " + result);
        }
    }
}
