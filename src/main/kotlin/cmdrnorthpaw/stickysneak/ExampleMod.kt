package cmdrnorthpaw.stickysneak

import io.github.cottonmc.cotton.config.ConfigManager
import cmdrnorthpaw.stickysneak.StickySneakConfig
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding
import net.fabricmc.fabric.api.event.client.ClientTickCallback
import net.minecraft.client.MinecraftClient

// For support join https://discord.gg/v6v4pMv

var secondSneak = false
var sneakTimer = 1
var areTheyHolding = 1

@Suppress("unused")
fun init() {
    configInit = ConfigManager.loadConfig(StickySneakConfig.class)
}

ClientTickCallback.EVENT.Register(e -> {
    if (areTheyHolding = 2 && MinecraftClient.getInstance().options.keySneak.isPressed()) {
        areTheyHolding = 3
    }
    else {
        areTheyHolding = 1
    }

    if (MinecraftClient.getInstance().options.keySneak.isPressed()) {
        when (secondSneak){
            true -> // Lock the sneak
            false -> secondSneak = true
        }
        when (areTheyHolding) {
            1 -> areTheyHolding = 2

        }
    }
    println(areTheyHolding)


})