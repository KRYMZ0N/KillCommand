package me.krymz0n.killcommand;

import org.bukkit.plugin.java.JavaPlugin;

import me.krymz0n.killcommand.commands.KillCommand;

public class Main extends JavaPlugin {
	
	public void onEnable() {
			new KillCommand(this);
			
		
		}
		
	
}
