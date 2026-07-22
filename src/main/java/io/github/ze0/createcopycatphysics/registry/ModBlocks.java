package io.github.ze0.createcopycatphysics.registry;

import io.github.ze0.createcopycatphysics.CreateCopycatPhysics;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Blocks;

public final class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateCopycatPhysics.MOD_ID);

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateCopycatPhysics.MOD_ID);

    public static final DeferredBlock<Block> LEVITITE_TEST_BLOCK =
            BLOCKS.registerSimpleBlock(
                    "levitite_test_block",
                    BlockBehaviour.Properties.of()
                            .strength(1.5F, 6.0F)
                            .sound(SoundType.AMETHYST)
                            .noOcclusion()
            );

    public static final DeferredItem<BlockItem> LEVITITE_TEST_BLOCK_ITEM =
            ITEMS.registerSimpleBlockItem(
                    LEVITITE_TEST_BLOCK,
                    new Item.Properties()
            );

    private ModBlocks() {
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }
}