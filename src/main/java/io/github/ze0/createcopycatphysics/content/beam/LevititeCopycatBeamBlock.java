package io.github.ze0.createcopycatphysics.content.beam;

import com.copycatsplus.copycats.content.copycat.beam.CopycatBeamBlock;
import com.copycatsplus.copycats.foundation.copycat.CCCopycatBlockEntity;
import io.github.ze0.createcopycatphysics.registry.ModBlockEntities;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class LevititeCopycatBeamBlock extends CopycatBeamBlock {

    public LevititeCopycatBeamBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<? extends CCCopycatBlockEntity> getBlockEntityType() {
        return ModBlockEntities.LEVITITE_COPYCAT.get();
    }
}