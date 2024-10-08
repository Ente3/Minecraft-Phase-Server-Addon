package de.ente.mpsa;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.ente.mpsa.commands.*;
import de.ente.mpsa.manager.ConfigManager;
import lombok.Getter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class MPSA extends JavaPlugin {

    private String pluginVersion;
    private String latestVersion;

    @Getter
    public static Plugin plugin;

    @Getter
    public static String prefix = "§8[§9MPSA§8] §7";

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        ConfigManager.loadConfig();
        registerCommands();

        pluginVersion = getDescription().getVersion();
        if (isUpdateAvailable()) {
            getLogger().warning("");
            getLogger().warning("A new version of Minecraft-Phase-Server-Addon (MPSA) is available! Latest version: " + latestVersion);
            getLogger().warning("You are on version: " + pluginVersion);
            getLogger().warning("Download latest Version: https://github.com/Ente3/Minecraft-Phase-Server-Addon/releases/latest");
            getLogger().warning("");
        } else {
            getLogger().info("Minecraft-Phase-Server-Addon (MPSA) is up to date.");
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerCommands() {
        this.getCommand("home").setExecutor(new HomeCommand());
        this.getCommand("sethome").setExecutor(new SetHomeCommand());
        this.getCommand("delhome").setExecutor(new DelteHomeCommand());
        this.getCommand("homes").setExecutor(new HomesCommand());

        this.getCommand("warp").setExecutor(new HomeCommand());
        this.getCommand("setwarp").setExecutor(new SetHomeCommand());
        this.getCommand("delwarp").setExecutor(new DelteHomeCommand());
        this.getCommand("warps").setExecutor(new HomesCommand());

        TpaCommand tpaCommand = new TpaCommand();
        this.getCommand("tpa").setExecutor(tpaCommand);
        this.getCommand("tpaaccept").setExecutor(new TpaAcceptCommand(tpaCommand));

    }

    private boolean isUpdateAvailable() {

        try {
            URL url = new URL("https://github.com/Ente3/Minecraft-Phase-Server-Addon/releases/latest");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Accept", "application/vnd.github.v3+json");

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());

            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = jsonParser.parse(reader).getAsJsonObject();

            if (jsonObject != null && jsonObject.has("tag_name")) {
                latestVersion = jsonObject.get("tag_name").getAsString().replace("v", "");

                return !pluginVersion.equals(latestVersion);
            } else {
                getLogger().warning("Unexpected GitHub API response format. At getting latest plugin Version");
                return false;
            }
        } catch (Exception e) {
            if (ConfigManager.isDebugMode()) {
                getLogger().warning("Error checking for plugin updates: " + e.getMessage());
            } else {
                getLogger().warning("Error checking for plugin updates, please check for updates manually");
            }
            return false;
        }

    }

}
