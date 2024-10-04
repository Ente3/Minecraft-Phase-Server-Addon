package de.ente.mpsa.manager;

import de.ente.mpsa.MPSA;
import lombok.Getter;
import org.bukkit.Bukkit;

public class ConfigManager {

    private static boolean isDebugMode = false;
    private static boolean isPermissionsEnabled = true;
    private static boolean isWarpsEnabled = true;
    private static boolean isHomesEnabled = true;
    private static boolean isBackpackEnabled = true;
    private static int warpNumber = 0;
    private static int homeNumber = 0;
    private static int backpackSize = 0;

    @Getter
    private static boolean isTpaEnabled;

    @Getter
    private static String noPermission;
    @Getter
    private static String onlyByPlayer;
    @Getter
    private static String addonDisabled;

    @Getter
    private static String yourHomes;
    @Getter
    private static String toManyHomes;
    @Getter
    private static String homeAlreadyExists;
    @Getter
    private static String homeAreDisabled;
    @Getter
    private static String homeNotExists;
    @Getter
    private static String teleportToHome;
    @Getter
    private static String newHomeCreated;

    @Getter
    private static String warps;
    @Getter
    private static String toManyWarps;
    @Getter
    private static String warpAlreadyExists;
    @Getter
    private static String warpsAreDisabled;
    @Getter
    private static String warpNotExists;
    @Getter
    private static String teleportToWarp;
    @Getter
    private static String newWarpCreated;

    @Getter
    private static String playerNotFound;
    @Getter
    private static String cantTpToYourself;
    @Getter
    private static String tpaRequest;
    @Getter
    private static String tpaRequestAccept;
    @Getter
    private static String sendRequest;
    @Getter
    private static String noOpenRequests;
    @Getter
    private static String playerNotOnline;
    @Getter
    private static String teleportTarget;
    @Getter
    private static String teleportCommandUser;

    public static void loadConfig() {
        try {
            MPSA.getPlugin().getConfig().options().copyDefaults(true);
            MPSA.getPlugin().saveConfig();

            isDebugMode = MPSA.getPlugin().getConfig().getBoolean("settings.enableDebugMode");
            isPermissionsEnabled = MPSA.getPlugin().getConfig().getBoolean("settings.enablePermissions");

            warpNumber = MPSA.getPlugin().getConfig().getInt("warps.maxWarpsPerPlayer");
            isWarpsEnabled = MPSA.getPlugin().getConfig().getBoolean("warps.enable");

            homeNumber = MPSA.getPlugin().getConfig().getInt("homes.maxHomesPerPlayer");
            isHomesEnabled = MPSA.getPlugin().getConfig().getBoolean("homes.enable");

            backpackSize = MPSA.getPlugin().getConfig().getInt("backpack.size");
            isBackpackEnabled = MPSA.getPlugin().getConfig().getBoolean("backpack.enable");

            isTpaEnabled = MPSA.getPlugin().getConfig().getBoolean("tpa.enable");

            noPermission = MPSA.getPlugin().getConfig().getString("messages.general.noPermission");
            onlyByPlayer = MPSA.getPlugin().getConfig().getString("messages.general.onlyByPlayer");
            addonDisabled = MPSA.getPlugin().getConfig().getString("messages.general.addonDisabled");

            yourHomes = MPSA.getPlugin().getConfig().getString("messages.homes.yourHomes");
            toManyHomes = MPSA.getPlugin().getConfig().getString("messages.homes.toManyHomes");
            homeAlreadyExists = MPSA.getPlugin().getConfig().getString("messages.homes.homeAlreadyExists");
            homeAreDisabled = MPSA.getPlugin().getConfig().getString("messages.homes.homeAreDisabled");
            homeNotExists = MPSA.getPlugin().getConfig().getString("messages.homes.homeNotExists");
            teleportToHome = MPSA.getPlugin().getConfig().getString("messages.homes.teleportToHome");
            newHomeCreated = MPSA.getPlugin().getConfig().getString("messages.homes.newHomeCreated");

            warps = MPSA.getPlugin().getConfig().getString("messages.warps.warps");
            toManyWarps = MPSA.getPlugin().getConfig().getString("messages.warps.toManyWarps");
            warpAlreadyExists = MPSA.getPlugin().getConfig().getString("messages.warps.warpAlreadyExists");
            warpsAreDisabled = MPSA.getPlugin().getConfig().getString("messages.warps.warpsAreDisabled");
            warpNotExists = MPSA.getPlugin().getConfig().getString("messages.warps.warpNotExists");
            teleportToWarp = MPSA.getPlugin().getConfig().getString("messages.warps.teleportToWarp");
            newWarpCreated = MPSA.getPlugin().getConfig().getString("messages.warps.newWarpCreated");

            playerNotFound = MPSA.getPlugin().getConfig().getString("messages.tpa.playerNotFound");
            cantTpToYourself = MPSA.getPlugin().getConfig().getString("messages.tpa.cantTpToYourself");
            tpaRequest = MPSA.getPlugin().getConfig().getString("messages.tpa.tpaRequest");
            tpaRequestAccept = MPSA.getPlugin().getConfig().getString("messages.tpa.tpaRequestAccept");
            sendRequest = MPSA.getPlugin().getConfig().getString("messages.tpa.sendRequest");
            noOpenRequests = MPSA.getPlugin().getConfig().getString("messages.tpa.noOpenRequests");
            playerNotOnline = MPSA.getPlugin().getConfig().getString("messages.tpa.playerNotOnline");
            teleportTarget = MPSA.getPlugin().getConfig().getString("messages.tpa.teleportTarget");
            teleportCommandUser = MPSA.getPlugin().getConfig().getString("messages.tpa.teleportCommandUser");

        }catch(Exception error) {
            Bukkit.getLogger().warning(error.getMessage());
        }
    }

    public static boolean isDebugMode() {
        return isDebugMode;
    }

    public static boolean isPermissionsEnabled() {
        return isPermissionsEnabled;
    }

    public static boolean isHomesEnabled() {
        return isHomesEnabled;
    }
    public static int getHomeNumber() {
        return homeNumber;
    }

    public static boolean isBackpackEnabled() {
        return isBackpackEnabled;
    }
    public static int getBackpackSize() {
        return backpackSize;
    }

    public static boolean isWarpsEnabled() {
        return isWarpsEnabled;
    }
    public static int getWarpNumber() {
        return warpNumber;
    }
}


