package me.fzzyhmstrs.village_life

import me.fzzyhmstrs.village_life.registry.RegisterModStructure
import me.fzzyhmstrs.village_life.registry.RegisterStructure
import net.fabricmc.api.ModInitializer

object VL: ModInitializer {
    const val MOD_ID = "village_life"

    override fun onInitialize() {
        RegisterStructure.registerAll()
        RegisterModStructure.registerAll()
    }
}