package io.github.ze0.createcopycatphysics.util;

import com.simibubi.create.AllBlocks;
import io.github.ze0.createcopycatphysics.registry.ModBlocks;
import net.minecraft.world.level.block.state.BlockState;

public final class LevititeCopycatHelper {

    private LevititeCopycatHelper() {
    }

    public static BlockState resolveRenderMaterial(BlockState material) {
        if (material != null && AllBlocks.COPYCAT_BASE.has(material)) {
            return ModBlocks.LEVITITE_COPYCAT_BASE.getDefaultState();
        }

        return material;
    }
}