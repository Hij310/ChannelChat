package me.thijs_a.channelchat;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	
	public void onEnable(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new ChatEvent(), this);
		chat = true;
	}
	
	public static boolean chat;

	static HashMap<String, String> kingdom = new HashMap<String, String>();
	
	public static String getKingdom(Player p){
		 if(p.hasPermission("kingdom.tatanka")){
			 //kingdom.put(p.getName(), "Tatanka");
			 return "Tatanka";
		 } else if(p.hasPermission("kingdom.trados")){
			 //kingdom.put(p.getName(), "Trados");
			 return "Trados";
		 } else if(p.hasPermission("kingdom.oranos")){
			 //kingdom.put(p.getName(), "Oranos");
			 return "Oranos";
		 } else if(p.hasPermission("kingdom.bovarie")){
			 //kingdom.put(p.getName(), "Bovarie");
			 return "Bovarie";
		 } else if(p.hasPermission("kingdom.fraza")){
			 //kingdom.put(p.getName(), "Fraza");
			 return "Fraza";
		 } else if(p.hasPermission("kingdom.triano")){
			 //kingdom.put(p.getName(), "Triano");
			 return "Triano";
		 } else if(p.hasPermission("kingdom.rovanie")){
			 //kingdom.put(p.getName(), "Rovanie");
			 return "Rovanie";
		 } else if(p.hasPermission("kingdom.terra")){
			 //kingdom.put(p.getName(), "Terra");
			 return "Terra";
		 } else if(p.hasPermission("kingdom.tyga")){
			 //kingdom.put(p.getName(), "Tyga");
			 return "Tyga";
		 } else if(p.hasPermission("kingdom.orebro")){
			 //kingdom.put(p.getName(), "Orebro");
			 return "Orebro";
		 } else if(p.hasPermission("kingdom.zzerffixia")){
			 //kingdom.put(p.getName(), "Zzerffixia");
			 return "Zzerffixia";
		 } else if(p.hasPermission("kingdom.eltro")){
			 //kingdom.put(p.getName(), "Eltro");
			 return "Eltro";
		 } else if(p.hasPermission("kingdom.tredia")){
			 //kingdom.put(p.getName(), "Tredia");
			 return "Tredia";
		 }else{
			 //kingdom.put(p.getName(), "No kingdom");
			 return "No kingdom";
		 }
		 
	}
}
