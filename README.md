# Anti-Bats

A Fabric mod for Minecraft **26.2** that prevents bats from naturally spawning,
including during chunk generation. Existing bats are left alone. Mob spawners,
spawn eggs, and commands retain their normal behavior.

## Installation

Install Fabric Loader **0.19.5 or newer** for Minecraft **26.2**, then put
`antibat-26.2.jar` in your `mods` folder. Minecraft requires **Java 25 or newer**.
Fabric API and Architectury API are not required.

Install the mod on the server for multiplayer, or on your client for
single-player worlds. Multiplayer clients do not need the mod.

## Development

This project uses Fabric Loom 1.17.21 and the Gradle 9.6.0 wrapper. It targets
Java 25 and Minecraft's unobfuscated classes; no mappings dependency is needed.
The old Forge/Architectury modules have been replaced with a Fabric-only build.

In IntelliJ IDEA, open the project root and select **Java 25 or newer** for both
the Project SDK and **Settings → Build, Execution, Deployment → Build Tools →
Gradle → Gradle JVM**. Use the project's Gradle wrapper and reload the Gradle
project. The previous Temurin 19 setting must be updated.

Build using Java 25 or newer:

```sh
bash ./gradlew build
```

The installable mod is `build/libs/antibat-26.2.jar`; the `-sources.jar` is for
development only. On Windows, use `gradlew.bat build`.

Launch a development client with `bash ./gradlew runClient`, or a development
server with `bash ./gradlew runServer`. Server world files and logs are stored
in `run/`; review Minecraft's EULA before enabling the development server.
