package net.brandon.modularcomputers.datagen;

import net.brandon.modularcomputers.ModularComputers;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider
{

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ModularComputers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) // was provider, change if error
    {
//        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
//                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);
//
//        this.tag(BlockTags.NEEDS_STONE_TOOL)
//                ;
//
//        this.tag(BlockTags.NEEDS_IRON_TOOL)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get());
//
//        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
//                ;
//
//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                ;
//
//        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
//                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
//                        ModBlocks.SAPPHIRE_ORE.get(),
//                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
//                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
//                        ModBlocks.END_SAPPHIRE_ORE.get(),
//                        ModBlocks.SOUND_BLOCK.get()
//                );
    }
}
