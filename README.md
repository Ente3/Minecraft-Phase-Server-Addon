# Minecraft Phase Server Addon

Minecraft Phase Server Addon is a plugin for Spigot and Paper (version 1.21.1) that adds useful features like Warps, Homes, Backpacks, and more to enhance your server's gameplay experience.
### Features

    Warps: Set warp points to allow players to quickly teleport to specific locations.
    Homes: Allow players to set personal home points for easy teleportation back to their base.
    Backpack: Provides players with additional inventory space through a portable backpack.
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
warps:
  maxWarpsPerPlayer: 5  # Maximum number of warps a player can set

homes:
  maxHomesPerPlayer: 3  # Maximum number of homes a player can have

backpack:
  size: 36  # Backpack size (number of inventory slots)
```

Commands

    /setwarp <name> – Sets a warp point with the specified name.
    /warp <name> – Teleports you to a warp point.
    /delwarp <name> – Deletes a warp point.
    /sethome <name> – Sets a home point with the specified name.
    /home <name> – Teleports you to your home point.
    /delhome <name> – Deletes a home point.
    /backpack – Opens your backpack.

Permissions

To manage access to specific commands, you can use a permissions management plugin like LuckPerms.

    phase.warp.use – Allows the use of the /warp command.
    phase.warp.set – Allows players to set warps using /setwarp.
    phase.warp.delete – Allows the deletion of warp points with /delwarp.
    phase.home.use – Allows the use of the /home command.
    phase.home.set – Allows players to set home points using /sethome.
    phase.home.delete – Allows the deletion of home points with /delhome.
    phase.backpack.use – Allows players to use the backpack.

Requirements

    Minecraft Server 1.21.1
    Spigot or Paper

Planned Features

    Additional backpack customization (e.g., expandable sizes, upgrades).
    Warp categories or groups for better organization.
    Support for homes in specific worlds or dimensions.

Contributors

    Ente_3 – Developer and Maintainer
