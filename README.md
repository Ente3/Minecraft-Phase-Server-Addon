
# ⚠⚠ THIS REPO IS MOVED TO INCONNU. ⚠⚠
# ⚠⚠ UPDATES AND FURTHER RELEASES CAN BE FOUND AND DOWNLOAD THERE: ⚠⚠
# https://github.com/Inconnu-Development/Minecraft-Phase-Server-Addon

## Minecraft Phase Server Addon

Minecraft Phase Server Addon is a plugin for Spigot and Paper (version 1.21.1) that adds useful features like Warps, Homes, Backpacks, and more to enhance your server's gameplay experience.

### Downlaod Plugin
https://github.com/Inconnu-Development/Minecraft-Phase-Server-Addon/releases

### Features

    Warps: Set warp points to allow players to quickly teleport to specific locations.
    Homes: Allow players to set personal home points for easy teleportation back to their base.
    TPA: Teleport to your friends
    Backpack: Provides players with additional inventory space through a portable backpack. (soon)
    More useful addons and features coming in future updates!

### Installation

    Spigot or Paper 1.21.1: Ensure your server is running on Minecraft version 1.21.1.
    Download the latest version of the plugin from GitHub Releases.
    Place the .jar file into your server's plugins folder.
    Restart the server or use /reload to load the plugin.

### Configuration

After installation, you will find a configuration file in the plugins folder. You can adjust various settings such as the maximum number of warps, homes, or the size of the backpack.
Example Configuration (config.yml):

yaml

```
settings:
  enableDebugMode: false
  enablePermissions: true
warps:
  enable: true
  maxWarpsPerPlayer: 5
homes:
  enable: true
  maxHomesPerPlayer: 5
backpack:
  enable: true
  size: 27
tpa:
  enable: true
messages:
  general:
    Prefix: "§8[§9MPSA§8] §7"
    noPermission: "§cDu hast keine Rechte dafür."
    onlyByPlayer: "§cDieser Befehl kann nur von einem Spieler ausgeführt werden."
    addonDisabled: "§cDieses Addon wurde deaktiviert."
  homes:
    yourHomes: "§7Das sind deine Homes:"
    toManyHomes: "§7Du kannst keine weiteren Homes anlegen."
    homeAlreadyExists: "§7Dieser Home Existiert schon."
    homeAreDisabled: "§7Homes sind deaktiviert."
    homeNotExists: "§7Dieser Home Existiert nicht."
    teleportToHome: "§7Du hast dich Teleportiert."
    newHomeCreated: "§7Du hast dir ein neuen Home erstellt"
  warps:
    warps: "§7Das sind alle Warps:"
    toManyWarps: "§7Du kannst keine weiteren Warps anlegen."
    warpAlreadyExists: "§7Dieser Warp Existiert schon."
    warpsAreDisabled: "§7Warps sind deaktiviert."
    warpNotExists: "§7Dieser Warp Existiert nicht."
    teleportToWarp: "§7Du hast dich Teleportiert."
    newWarpCreated: "§7Du hast dir ein neuen Warp erstellt"
  tpa:
    playerNotFound: "§7Spieler nicht gefunden."
    cantTpToYourself: "§7Du kannst dich nicht zu dir selbst teleportieren."
    tpaRequest: "§7%player% möchte sich zu dir teleportieren. "
    tpaRequestAccept: "§7[§aAkzeptieren§7]"
    sendRequest: "§7Anfrage an %player% gesendet."
    noOpenRequests: "§7Es gibt keine ausstehende TPA-Anfrage."
    playerNotOnline: "Der Spieler, der die Anfrage gesendet hat, ist nicht mehr online."
    teleportTarget: "Du wurdest zu %player% teleportiert."
    teleportCommandUser: "Du hast die Teleportanfrage von %player% angenommen."
```

Commands

    /setwarp <name> – Sets a warp point with the specified name.
    /warp <name> – Teleports you to a warp point.
    /delwarp <name> – Deletes a warp point.
    /sethome <name> – Sets a home point with the specified name.
    /home <name> – Teleports you to your home point.
    /delhome <name> – Deletes a home point.
    /tpa <name> - Teleport Request
    /tpaaccept - Accept Teleport
    /backpack – Opens your backpack.

Permissions

To manage access to specific commands, you can use a permissions management plugin like LuckPerms.

    phase.warp.use – Allows the use of the /warp command.
    phase.warp.set – Allows players to set warps using /setwarp.
    phase.warp.delete – Allows the deletion of warp points with /delwarp.
    phase.home.use – Allows the use of the /home command.
    phase.home.set – Allows players to set home points using /sethome.
    phase.home.delete – Allows the deletion of home points with /delhome.
    phase.tpa.use - TPA reuests and accpet those
    phase.backpack.use – Allows players to use the backpack.

Requirements

    Minecraft Server 1.21.1
    Spigot or Paper

Planned Features

    Additional backpack customization (e.g., expandable sizes, upgrades).
    Warp categories or groups for better organization.

Contributors

    Ente_3 – Developer and Maintainer
