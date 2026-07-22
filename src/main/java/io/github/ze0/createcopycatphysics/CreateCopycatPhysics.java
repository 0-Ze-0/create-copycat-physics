package io.github.ze0.createcopycatphysics;

import io.github.ze0.createcopycatphysics.registry.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(CreateCopycatPhysics.MOD_ID)
public class CreateCopycatPhysics {

    public static final String MOD_ID = "create_copycat_physics";

    public CreateCopycatPhysics(IEventBus modEventBus) {
        ModBlocks.register(modEventBus);
    }
}