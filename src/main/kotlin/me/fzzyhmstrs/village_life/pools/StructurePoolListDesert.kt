package me.fzzyhmstrs.village_life.pools

import com.google.common.collect.ImmutableList
import com.mojang.datafixers.util.Pair
import me.fzzyhmstrs.village_life.VL
import net.minecraft.structure.pool.StructurePool
import net.minecraft.structure.pool.StructurePoolElement
import java.util.function.Function

object StructurePoolListDesert {

    val DESERT_STREET_DECOR: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
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
    val DESERT_STALLS: List<Pair<Function<StructurePool.Projection, out StructurePoolElement>, Int>> =
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
}