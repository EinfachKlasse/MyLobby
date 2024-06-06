package de.couldbeworse.mylobby.manager.registry;

import de.couldbeworse.mylobby.MyLobby;
import de.couldbeworse.mylobby.listeners.JoinQuitListener;
import org.bukkit.plugin.PluginManager;

public class ListenerRegistry {


    public void setup(PluginManager pluginManager) {
        pluginManager.registerEvents(new JoinQuitListener(), MyLobby.getInstance());
    }
}
