package de.couldbeworse.mylobby.listeners;

import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static net.md_5.bungee.api.ChatColor.*;

public class JoinQuitListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.getWorld().spawnParticle(Particle.TOTEM, player.getLocation(), 50);
        player.playSound(player.getLocation() , Sound.ENTITY_PLAYER_LEVELUP, 0.2F,1);
        event.setJoinMessage(GREEN + " +" + GRAY + " | " + BLUE + player.getName() + GRAY + " joined the server.");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(RED + " -" + GRAY + " | " + BLUE + player.getName() + GRAY + " left the server.");
    }
}
