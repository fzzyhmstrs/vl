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
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/butcher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/farmer_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/farmer_stall_02"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/farmer_stall_03"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/fisher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/leatherworker_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/park_01"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/park_02"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/shepherd_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/stonemason_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls/stonemason_stall_02"),2),
        )

    val PLAINS_SQUARE_STALLS_SMALL: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls_small/small_butcher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls_small/small_farmer_stall_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls_small/small_farmer_stall_02"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls_small/small_fisher_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls_small/small_leatherworker_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls_small/small_shepherd_stall_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/stalls_small/small_stonemason_stall_01"),4)
        )

    val PLAINS_SQUARE_DECOR: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_02"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_03"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_04"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/square_decor/square_decor_05"),4)
        )

    val PLAINS_HOUSE_CORES_2: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_cores/house_core_2_way"),2),
        )

    val PLAINS_HOUSE_CORES_3: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_cores/house_core_3_way"),2),
        )

    val PLAINS_HOUSE_CORES_BACK: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_cores/house_core_back"),2),
        )

    val PLAINS_HOUSE_CORES_RIGHT: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_cores/house_core_right"),2),
        )

    val PLAINS_HOUSE_CORES_LEFT: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_cores/house_core_left"),2),
        )

    val PLAINS_HOUSE_PIECES: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/animal_pen_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/bedroom_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/bedroom_02"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/bedroom_03"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/dining_room_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/kitchen_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/kitchen_02"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/large_bedroom_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/mudroom_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/mudroom_02"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/wall_01"),2)
        )
    val PLAINS_HOUSE_PIECES_RIGHT: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/bedroom_01"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/bedroom_02"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/bedroom_03"),2),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/dining_room_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/_house_pieces/kitchen_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/kitchen_02"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/large_bedroom_01"),3),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces_right/large_right_stairs_01"),4),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+":village/plains/house_pieces/wall_01"),2)
        )
}