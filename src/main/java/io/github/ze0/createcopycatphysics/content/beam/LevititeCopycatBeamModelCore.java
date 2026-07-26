package io.github.ze0.createcopycatphysics.content.beam;

import com.copycatsplus.copycats.content.copycat.beam.CopycatBeamModelCore;
import io.github.ze0.createcopycatphysics.util.LevititeCopycatModelEntries;

import java.util.List;

public class LevititeCopycatBeamModelCore
        extends CopycatBeamModelCore {

    @Override
    public void registerModels(List<ModelEntry> entries) {
        entries.add(LevititeCopycatModelEntries.simple(this));
    }
}