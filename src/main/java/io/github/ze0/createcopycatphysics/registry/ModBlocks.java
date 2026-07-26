package io.github.ze0.createcopycatphysics.registry;

import com.copycatsplus.copycats.CCBuilderTransformers;
import io.github.ze0.createcopycatphysics.content.beam.LevititeCopycatBeamBlock;
import com.copycatsplus.copycats.content.copycat.beam.CopycatBeamModelCore;
import com.copycatsplus.copycats.foundation.copycat.model.CopycatModelCore;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import io.github.ze0.createcopycatphysics.CreateCopycatPhysics;
import net.minecraft.resources.ResourceLocation;

public final class ModBlocks {

    private static final CreateRegistrate REGISTRATE =
            CreateCopycatPhysics.REGISTRATE;

    public static final BlockEntry<LevititeCopycatBeamBlock> LEVITITE_COPYCAT_BEAM =
            REGISTRATE.block(
                            "levitite_copycat_beam",
                            LevititeCopycatBeamBlock::new
                    )
                    .transform(CCBuilderTransformers.copycat())
                    .onRegister(CreateRegistrate.blockModel(
                            () -> model -> CopycatModelCore.createModel(
                                    model,
                                    new CopycatBeamModelCore()
                            )
                    ))
                    .item()
                    .model((context, provider) ->
                            provider.withExistingParent(
                                    context.getName(),
                                    ResourceLocation.fromNamespaceAndPath(
                                            "copycats",
                                            "item/copycat_beam"
                                    )
                            )
                    )
                    .build()
                    .register();

    private ModBlocks() {
    }

    public static void register() {
        // Loading this class creates the Registrate entries.
    }
}