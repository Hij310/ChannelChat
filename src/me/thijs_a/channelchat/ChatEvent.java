package me.thijs_a.channelchat;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event){
		Player p = event.getPlayer();
		String message = event.getMessage();
		 if (event.getMessage().startsWith("!")) {
			 if(Main.chat == false){
				 
				 p.sendMessage(ChatColor.RED + "Global Chat is disabled!");
				 event.setCancelled(true);
			 } else if(Main.chat == true){
				 
			 for (Player p1 : Bukkit.getOnlinePlayers()) {
		          p1.sendMessage(ChatColor.GRAY + "[!] " + ChatColor.AQUA + Main.getKingdom(event.getPlayer()) + ChatColor.WHITE + " " + event.getPlayer().getDisplayName() + ChatColor.WHITE + ChatColor.BOLD + " : " + ChatColor.RESET + ChatColor.WHITE + event.getMessage().replace("!", ""));
		          Bukkit.getLogger().log(Level.INFO,ChatColor.BLUE + "Global " + ChatColor.RESET + Main.getKingdom(p) + " " + p.getDisplayName() + " : " + event.getMessage().replace("!", ""));
		          event.setCancelled(true);
		        }
			 }
		 }else
			 if(p.hasPermission("kingdom.tatanka")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Tatanka"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.tatanka");
				 Bukkit.getLogger().log(Level.INFO,"Tatanka "+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.trados")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Trados"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.trados");
				 Bukkit.getLogger().log(Level.INFO,"Trados "+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.oranos")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Oranos"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.oranos");
				 Bukkit.getLogger().log(Level.INFO,"Oranos "+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.bovarie")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Bovarie"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.bovarie");
				 Bukkit.getLogger().log(Level.INFO,"Bovarie"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.fraza")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Fraza"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.fraza");
				 Bukkit.getLogger().log(Level.INFO,"Fraza"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.triano")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Triano"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.triano");
				 Bukkit.getLogger().log(Level.INFO,"Triano"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.rovanie")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Rovanie"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.rovanie");
				 Bukkit.getLogger().log(Level.INFO,"Rovanie"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.terra")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Terra"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.terra");
				 Bukkit.getLogger().log(Level.INFO,"Terra"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.Tyga")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Tyga"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.tyga");
				 Bukkit.getLogger().log(Level.INFO,"Tyga"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.Orebro")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Orebro"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.orebro");
				 Bukkit.getLogger().log(Level.INFO,"Orebro"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.Zzerffixia")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Zzerffixia"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.zzerffixia");
				 Bukkit.getLogger().log(Level.INFO,"Zzerffixia"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.Eltro")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Eltro"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.eltro");
				 Bukkit.getLogger().log(Level.INFO,"Eltro"+ p.getDisplayName() + " : " + message);

			 } else if(p.hasPermission("kingdom.Tredia")){
				 event.setCancelled(true);
				 Bukkit.broadcast(ChatColor.GRAY + "[@] [" + ChatColor.DARK_GRAY + "Tredia"+ ChatColor.GRAY + "] " + p.getDisplayName() + " : " + message, "kingdom.tredia");
				 Bukkit.getLogger().log(Level.INFO,"Tredia"+ p.getDisplayName() + " : " + message);
			 }
		 
		 
		
	}

}
