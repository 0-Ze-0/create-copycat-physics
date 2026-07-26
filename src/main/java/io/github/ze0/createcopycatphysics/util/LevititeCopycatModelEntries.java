package io.github.ze0.createcopycatphysics.util;

import com.copycatsplus.copycats.foundation.copycat.model.assembly.CopycatModelPart;
import com.copycatsplus.copycats.foundation.copycat.model.CopycatModelCore;

public final class LevititeCopycatModelEntries {

    private LevititeCopycatModelEntries() {
    }

    public static CopycatModelCore.ModelEntry simple(
            CopycatModelPart part
    ) {
        return new CopycatModelCore.ModelEntry(
                CopycatModelCore.MATERIAL_KEY,
                CopycatModelCore.ModelGetter.MATERIAL,
                part,
                (state, material) ->
                        LevititeCopycatHelper.resolveRenderMaterial(material),
                CopycatModelCore.EntryType.COPYCAT
        );
    }

    public static CopycatModelCore.ModelEntry multiState(
            String property,
            CopycatModelPart part,
            boolean kinetic
    ) {
        return new CopycatModelCore.ModelEntry(
                property,
                (state, material) ->
                        CopycatModelCore.getModelOf(material),
                part,
                (state, material) ->
                        LevititeCopycatHelper.resolveRenderMaterial(material),
                kinetic
                        ? CopycatModelCore.EntryType.KINETIC_COPYCAT
                        : CopycatModelCore.EntryType.COPYCAT
        );
    }
}