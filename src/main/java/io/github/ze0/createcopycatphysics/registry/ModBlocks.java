package io.github.ze0.createcopycatphysics.registry;

import com.copycatsplus.copycats.CCBuilderTransformers;
import io.github.ze0.createcopycatphysics.content.beam.LevititeCopycatBeamBlock;
import io.github.ze0.createcopycatphysics.CreateCopycatPhysics;
import io.github.ze0.createcopycatphysics.content.board.LevititeCopycatBoardBlock;
import io.github.ze0.createcopycatphysics.content.board.LevititeCopycatBoardModelCore;
import io.github.ze0.createcopycatphysics.content.beam.LevititeCopycatBeamModelCore;
import com.copycatsplus.copycats.foundation.copycat.model.CopycatModelCore;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.client.renderer.RenderType;

public final class ModBlocks {

    private static final CreateRegistrate REGISTRATE =
            CreateCopycatPhysics.REGISTRATE;

    public static final BlockEntry<Block> LEVITITE_COPYCAT_BASE =
            REGISTRATE.block(
                            "levitite_copycat_base",
                            Block::new
                    )
                    .initialProperties(() -> net.minecraft.world.level.block.Blocks.IRON_BLOCK)
                    .properties(properties -> properties
                            .strength(1.0F)
                            .noOcclusion()
                    )
                    .addLayer(() -> RenderType::cutout)
                    .simpleItem()
                    .register();

    public static final BlockEntry<LevititeCopycatBeamBlock> LEVITITE_COPYCAT_BEAM =
            REGISTRATE.block(
                            "levitite_copycat_beam",
                            LevititeCopycatBeamBlock::new
                    )
                    .transform(CCBuilderTransformers.copycat())
                    .onRegister(CreateRegistrate.blockModel(
                            () -> model -> CopycatModelCore.createModel(
                                    model,
                                    new LevititeCopycatBeamModelCore()
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

    public static final BlockEntry<LevititeCopycatBoardBlock> LEVITITE_COPYCAT_BOARD =
            REGISTRATE.block(
                            "levitite_copycat_board",
                            LevititeCopycatBoardBlock::new
                    )
                    .transform(CCBuilderTransformers.multiCopycat())
                    .onRegister(CreateRegistrate.blockModel(
                            () -> model -> CopycatModelCore.createModel(
                                    model,
                                    new LevititeCopycatBoardModelCore()
                            )
                    ))
                    .item()
                    .model((context, provider) ->
                            provider.withExistingParent(
                                    context.getName(),
                                    ResourceLocation.fromNamespaceAndPath(
                                            "copycats",
                                            "item/copycat_board"
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