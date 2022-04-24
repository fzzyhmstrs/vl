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
            1,
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
            1,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/desert/streets"),
            Identifier(VL.MOD_ID,"village/desert/streets/market_street_square_01"),
            1,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/plains/town_centers"),
            Identifier(VL.MOD_ID,"village/plains/town_hall/town_hall_core_01"),
            50,
            StructureProcessorLists.MOSSIFY_10_PERCENT)
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/plains/streets"),
            Identifier(VL.MOD_ID,"village/plains/streets/square_market_01"),
            1,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
        FabricStructurePoolRegistry.register(
            Identifier("minecraft:village/plains/streets"),
            Identifier(VL.MOD_ID,"village/plains/streets/square_market_02"),
            1,
            StructureProcessorLists.EMPTY,
            StructurePool.Projection.TERRAIN_MATCHING)
        FabricStructurePoolRegistry.registerSimple(
            Identifier("minecraft:village/plains/houses"),
            Identifier(VL.MOD_ID,"village/plains/house_bases/house_base_2_way"),
            10)
        FabricStructurePoolRegistry.registerSimple(
            Identifier("minecraft:village/plains/houses"),
            Identifier(VL.MOD_ID,"village/plains/house_bases/house_base_3_way"),
            10)
        FabricStructurePoolRegistry.registerSimple(
            Identifier("minecraft:village/plains/houses"),
            Identifier(VL.MOD_ID,"village/plains/house_bases/house_base_left"),
            10)
        FabricStructurePoolRegistry.registerSimple(
            Identifier("minecraft:village/plains/houses"),
            Identifier(VL.MOD_ID,"village/plains/house_bases/house_base_right"),
            10)
        FabricStructurePoolRegistry.registerSimple(
            Identifier("minecraft:village/plains/houses"),
            Identifier(VL.MOD_ID,"village/plains/house_bases/house_base_back"),
            10)
    }

}