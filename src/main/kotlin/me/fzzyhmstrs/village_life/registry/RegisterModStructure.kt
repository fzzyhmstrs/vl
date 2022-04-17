package me.fzzyhmstrs.village_life.registry

import fzzyhmstrs.structurized_reborn.impl.FabricStructurePoolRegistry
import me.fzzyhmstrs.village_life.VL
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.structure.pool.StructurePool
import net.minecraft.structure.processor.StructureProcessorLists
import net.minecraft.util.Identifier

object RegisterModStructure {

    fun registerAll(){
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            FabricStructurePoolRegistry.registerSimple(
                Identifier(VL.MOD_ID+"village/desert/stalls"),
                Identifier(VL.MOD_ID, "village/desert/mod_stalls/crystal_witch_stall_01"),
                3
            )
        }
    }

}