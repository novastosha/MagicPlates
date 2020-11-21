package dev.nova.magicplates.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PressurePlateEvent implements Listener {

    @EventHandler
    public void platePress(PlayerInteractEvent ev) {
        if (ev.getAction().equals(Action.PHYSICAL)) {
            if (ev.getClickedBlock().getType() == Material.IRON_PLATE) {
                Player player = ev.getPlayer();

            }
        }
    }
}
