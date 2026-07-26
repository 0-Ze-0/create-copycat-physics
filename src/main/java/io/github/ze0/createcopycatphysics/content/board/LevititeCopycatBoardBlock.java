package io.github.ze0.createcopycatphysics.content.board;

import com.copycatsplus.copycats.content.copycat.board.CopycatBoardBlock;
import com.copycatsplus.copycats.foundation.copycat.multistate.MultiStateCopycatBlockEntity;
import io.github.ze0.createcopycatphysics.registry.ModBlockEntities;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class LevititeCopycatBoardBlock extends CopycatBoardBlock {

    public LevititeCopycatBoardBlock(Properties properties) {
        super(properties);
    }

    @Override
    public Class<MultiStateCopycatBlockEntity> getBlockEntityClass() {
        return MultiStateCopycatBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends MultiStateCopycatBlockEntity> getBlockEntityType() {
        return ModBlockEntities.LEVITITE_MULTI_STATE_COPYCAT.get();
    }
}