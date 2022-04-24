package me.fzzyhmstrs.village_life.registry

import com.google.common.collect.ImmutableList
import me.fzzyhmstrs.village_life.VL
import net.minecraft.structure.pool.StructurePool
import net.minecraft.structure.pool.StructurePools
import net.minecraft.util.Identifier
import com.mojang.datafixers.util.Pair
import me.fzzyhmstrs.village_life.pools.StructurePoolListDesert
import me.fzzyhmstrs.village_life.pools.StructurePoolListPlains
import net.minecraft.structure.pool.StructurePoolElement
import net.minecraft.util.registry.BuiltinRegistries
import java.util.function.Function

object RegisterStructurePool {

    var haveNotRegistered: Boolean = true

    private val DESERT_STREET_DECOR: List<Pair<Function<StructurePool.Projection,out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_umbrella_01"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_umbrella_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_umbrella_03"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_umbrella_04"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_carpet_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_carpet_02"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_carpet_03"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_arch_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_arch_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_arch_03"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_lamp_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_lamp_02"),5),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_lamp_03"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_grate_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_grate_02"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_grate_03"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/street_decor/market_street_grate_04"),2)
        )
    private val DESERT_STALLS: List<Pair<Function<StructurePool.Projection,out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/alley_01"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/alley_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/alley_03"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/armorer_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/butcher_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/cartographer_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/cartographer_stall_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/cleric_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/farmer_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/farmer_stall_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/fisher_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/fisher_stall_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/fletcher_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/fountain_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/garden_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/hostel_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/hostel_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/leatherworker_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/librarian_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/shepherd_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/stonecutter_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/toolsmith_stall_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/warehouse_01"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/warehouse_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/weaponsmith_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/desert/stalls/weaponsmith_stall_02"),1)
        )



    fun registerAll(){
        if (haveNotRegistered) {
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/desert/street_decor"),
                    Identifier("empty"),
                    StructurePoolListDesert.DESERT_STREET_DECOR,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/desert/stalls"),
                    Identifier("empty"),
                    StructurePoolListDesert.DESERT_STALLS,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/town_hall_towers"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_TOWN_HALL_TOWERS,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/town_hall_rooms"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_TOWN_HALL_ROOMS,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/town_hall_halls"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_TOWN_HALL_HALLS,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/town_hall_squares"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_TOWN_HALL_SQUARES,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/square_stalls"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_SQUARE_STALLS,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/square_stalls_small"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_SQUARE_STALLS_SMALL,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/square_decor"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_SQUARE_DECOR,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/house_cores_2"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_HOUSE_CORES_2,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/house_cores_3"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_HOUSE_CORES_3,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/house_cores_back"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_HOUSE_CORES_BACK,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/house_cores_left"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_HOUSE_CORES_LEFT,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/house_cores_right"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_HOUSE_CORES_RIGHT,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/house_pieces"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_HOUSE_PIECES,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/plains/house_pieces_right"),
                    Identifier("empty"),
                    StructurePoolListPlains.PLAINS_HOUSE_PIECES_RIGHT,
                    StructurePool.Projection.RIGID
                )
            )
            haveNotRegistered = false
        }
    }

}