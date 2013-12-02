package com.min3craftdud3.InvisPowder;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InvisPowder extends JavaPlugin implements Listener{
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onInvis(PlayerInteractEvent e){
		Player p = e.getPlayer();
		try{
			if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
				if(p.getItemInHand().getType().equals(Material.SUGAR)){
					p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
					p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 400, 1));
					p.sendMessage("You have used Invisibility Powder.");
				}
			}
		}catch(Exception ex){ex.printStackTrace();}
	}

}
