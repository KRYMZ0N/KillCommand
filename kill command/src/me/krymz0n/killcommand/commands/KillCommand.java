package me.krymz0n.killcommand.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.krymz0n.killcommand.Main;


public class KillCommand implements CommandExecutor {
	
	private Main plugin;
	
	public KillCommand(me.krymz0n.killcommand.Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("kill").setExecutor(this);
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// Checks to see if players have permission and then will kill them
		if (!(sender instanceof Player)) {
			
				sender.sendMessage("Command can not be executed from Console!");
			
		}
			Player p = (Player)sender;
			
			
			if (p.hasPermission("Kill.use")) {
				p.setHealth(0);
				return true;
			} else {
				p.sendMessage("You must vote to unlock this command using /vote!");
			
		}
		return false;
		
	}
		
}


