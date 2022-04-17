package me.fzzyhmstrs.village_life.registry

import com.google.common.collect.ImmutableList
import me.fzzyhmstrs.village_life.VL
import net.minecraft.structure.pool.StructurePool
import net.minecraft.structure.pool.StructurePools
import net.minecraft.util.Identifier
import com.mojang.datafixers.util.Pair
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

    /*private val DESERT_STALLS_TEMP: List<Pair<Function<StructurePool.Projection,out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle("minecraft:village/desert/houses/desert_small_house_1"),1),
            Pair.of(StructurePoolElement.ofLegacySingle("minecraft:village/desert/houses/desert_small_house_2"),1)
        )
    private val DESERT_STALLS_TEMP2: List<Pair<Function<StructurePool.Projection,out StructurePoolElement>, Int>> =
        ImmutableList.of(
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+"village/desert/stalls/armorer_stall_01"),1),
            Pair.of(StructurePoolElement.ofLegacySingle(VL.MOD_ID+"village/desert/stalls/butcher_stall_01"),1)
        )*/

    fun registerAll(){
        if (haveNotRegistered) {
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/desert/street_decor"),
                    Identifier("empty"),
                    DESERT_STREET_DECOR,
                    StructurePool.Projection.RIGID
                )
            )
            StructurePools.register(
                StructurePool(
                    Identifier(VL.MOD_ID, "village/desert/stalls"),
                    Identifier("empty"),
                    DESERT_STALLS,
                    StructurePool.Projection.RIGID
                )
            )
            println(BuiltinRegistries.STRUCTURE_POOL[Identifier(VL.MOD_ID, "village/desert/street_decor")])
            haveNotRegistered = false
        }
    }

}