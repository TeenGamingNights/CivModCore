package vg.civcraft.mc.civmodcore.chatDialog;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ChatListener implements Listener {

	@EventHandler
	public void logOff(PlayerQuitEvent e) {
		DialogManager.instance.forceEndDialog(e.getPlayer());
	}

}
