package de.couldbeworse.mylobby;

import de.couldbeworse.mylobby.manager.registry.CommandRegistry;
import de.couldbeworse.mylobby.manager.registry.ListenerRegistry;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyLobby extends JavaPlugin {

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public static MyLobby instance;

    private final CommandRegistry commandRegistry = new CommandRegistry();
    private final ListenerRegistry listenerRegistry = new ListenerRegistry();

    /////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onLoad() {
        instance = this;
        Bukkit.getConsoleSender().sendMessage("Instance Initialized");
    }

    @Override
    public void onEnable() {
        instance = this;

        PluginManager pluginManager = Bukkit.getPluginManager();

        commandRegistry.setup();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MyLobby getInstance() {
        return instance;
    }
}
