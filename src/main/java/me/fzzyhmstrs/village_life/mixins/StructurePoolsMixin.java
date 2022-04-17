package me.fzzyhmstrs.village_life.mixins;

import me.fzzyhmstrs.village_life.registry.RegisterStructurePool;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.registry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StructurePools.class)
public class StructurePoolsMixin {

    @Inject(method = "initDefaultPools", at = @At(value = "HEAD"))
    private static void initVillageLifePools(CallbackInfoReturnable<RegistryEntry<StructurePool>> cir){
        RegisterStructurePool.INSTANCE.registerAll();
    }
}
