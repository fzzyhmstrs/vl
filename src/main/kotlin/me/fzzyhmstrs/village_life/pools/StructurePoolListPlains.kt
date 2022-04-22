package me.fzzyhmstrs.village_life.pools

import com.google.common.collect.ImmutableList
import com.mojang.datafixers.util.Pair
import me.fzzyhmstrs.village_life.VL
import net.minecraft.structure.pool.StructurePool
import net.minecraft.structure.pool.StructurePoolElement
import java.util.function.Function

object StructurePoolListPlains {

    val PLAINS_TOWN_HALL_TOWERS: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_towers/town_hall_tower_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_towers/town_hall_tower_03"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_towers/town_hall_tower_04"),4)
        )

    val PLAINS_TOWN_HALL_HALLS: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_halls/town_hall_hall_01"),4)
        )

    val PLAINS_TOWN_HALL_ROOMS: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_rooms/town_hall_room_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_rooms/town_hall_room_02"),4)
        )

    val PLAINS_TOWN_HALL_SQUARES: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_squares/town_hall_square_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/town_hall_squares/town_hall_square_02"),4),
        )

    val PLAINS_SQUARE_STALLS: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_butcher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_farmer_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_farmer_stall_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_farmer_stall_03"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_fisher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_leatherworker_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_park_01"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_park_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_shepherd_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_stonemason_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls/square_stonemason_stall_02"),2),
        )

    val PLAINS_SQUARE_STALLS_SMALL: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls_small/small_square_butcher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls_small/small_square_farmer_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls_small/small_square_farmer_stall_02"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls_small/small_square_fisher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls_small/small_square_leatherworker_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls_small/small_square_shepherd_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_stalls_small/small_square_stonemason_stall_01"),4)
        )

    val PLAINS_SQUARE_DECOR: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_02"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_03"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_04"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_05"),4)
        )
}