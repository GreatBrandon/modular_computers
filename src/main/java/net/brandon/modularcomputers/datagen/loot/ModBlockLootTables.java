package net.brandon.modularcomputers.datagen.loot;

import net.brandon.modularcomputers.block.ModBlocks;
import net.brandon.modularcomputers.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider
{
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
//        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
//        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
//
//        this.add(ModBlocks.SAPPHIRE_ORE.get(), block -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(), block -> createOreDrop(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        this.add(ModBlocks.END_SAPPHIRE_ORE.get(), block -> createOreDrop(ModBlocks.END_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
