package me.fzzyhmstrs.village_life.registry

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity
import net.minecraft.util.registry.Registry


object RegisterItem {
    val EXAMPLE = Item(FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON))

    fun registerAll() {
        Registry.register(Registry.ITEM, Identifier("amethyst_imbuement","golden_heart"), EXAMPLE)
    }
}