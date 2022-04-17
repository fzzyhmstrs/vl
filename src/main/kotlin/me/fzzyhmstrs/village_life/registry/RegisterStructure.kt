package me.fzzyhmstrs.village_life.registry

import fzzyhmstrs.structurized_reborn.impl.FabricStructurePoolRegistry
import me.fzzyhmstrs.village_life.VL
import net.minecraft.structure.pool.StructurePool
import net.minecraft.structure.processor.StructureProcessorLists
import net.minecraft.util.Identifier

object RegisterStructure {

    fun registerAll(){
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/desert/streets"),
            Identifier(VL.MOD_ID,"village/desert/streets/market_street_straight_01"),
            2,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/desert/streets"),
            Identifier(VL.MOD_ID,"village/desert/streets/market_street_bent_01"),
            1,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/desert/streets"),
            Identifier(VL.MOD_ID,"village/desert/streets/market_street_tee_01"),
            2,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/desert/streets"),
            Identifier(VL.MOD_ID,"village/desert/streets/market_street_square_01"),
            2,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
    }

}