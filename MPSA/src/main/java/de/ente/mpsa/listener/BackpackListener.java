package de.ente.mpsa.listener;

import de.ente.mpsa.commands.BackpackCommand;
import de.ente.mpsa.manager.BackPackManager;
import de.ente.mpsa.manager.ConfigManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class BackpackListener implements Listener {

    @EventHandler
    public void onInvClose(InventoryCloseEvent event) {
        if (event != null || event.getInventory() != null) {
            Player player = (Player) event.getPlayer();

            if (player.getUniqueId().equals(BackpackCommand.getOpenPlayerUUID())) {
                if (player.getOpenInventory().getTitle().equals(ConfigManager.getBackpackInvTitle())) {

                    BackpackCommand.setOpenPlayerUUID(null);

                    BackPackManager.saveBackpack(event.getInventory());

                    BackpackCommand.setBackapIsOpen(false);
                }
            }

        }
    }

}
