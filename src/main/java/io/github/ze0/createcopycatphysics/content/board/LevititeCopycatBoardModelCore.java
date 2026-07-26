package io.github.ze0.createcopycatphysics.content.board;

import com.copycatsplus.copycats.content.copycat.board.CopycatMultiBoardModelCore;
import io.github.ze0.createcopycatphysics.registry.ModBlocks;
import io.github.ze0.createcopycatphysics.util.LevititeCopycatModelEntries;

import java.util.List;

public class LevititeCopycatBoardModelCore
        extends CopycatMultiBoardModelCore {

    @Override
    public void registerModels(List<ModelEntry> entries) {
        for (String property :
                ModBlocks.LEVITITE_COPYCAT_BOARD.get()
                        .storageProperties()) {

            entries.add(
                    LevititeCopycatModelEntries.multiState(
                            property,
                            this,
                            false
                    )
            );
        }
    }
}