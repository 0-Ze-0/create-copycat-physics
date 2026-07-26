package io.github.ze0.createcopycatphysics;

import io.github.ze0.createcopycatphysics.registry.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import com.simibubi.create.foundation.data.CreateRegistrate;
import io.github.ze0.createcopycatphysics.registry.ModBlockEntities;

@Mod(CreateCopycatPhysics.MOD_ID)
public class CreateCopycatPhysics {

    public static final String MOD_ID = "create_copycat_physics";
    public static final CreateRegistrate REGISTRATE =
            CreateRegistrate.create(MOD_ID);

    public CreateCopycatPhysics(IEventBus modEventBus) {
        REGISTRATE.registerEventListeners(modEventBus);

        ModBlocks.register();
        ModBlockEntities.register();
    }
}