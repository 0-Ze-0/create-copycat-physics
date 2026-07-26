package io.github.ze0.createcopycatphysics.registry;

import com.copycatsplus.copycats.foundation.copycat.CCCopycatBlockEntity;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import io.github.ze0.createcopycatphysics.CreateCopycatPhysics;

public final class ModBlockEntities {

    private static final CreateRegistrate REGISTRATE =
            CreateCopycatPhysics.REGISTRATE;

    public static final BlockEntityEntry<CCCopycatBlockEntity> LEVITITE_COPYCAT =
            REGISTRATE.blockEntity(
                            "levitite_copycat",
                            CCCopycatBlockEntity::new
                    )
                    .validBlocks(ModBlocks.LEVITITE_COPYCAT_BEAM)
                    .register();

    private ModBlockEntities() {
    }

    public static void register() {
        // Loading this class initializes the block-entity entries.
    }
}