package net.brandon.modularcomputers.datagen;

import net.brandon.modularcomputers.ModularComputers;
import net.brandon.modularcomputers.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModularComputers.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
//        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);
//        blockWithItem(ModBlocks.SAPPHIRE_ORE);
//        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
//        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);
//        blockWithItem(ModBlocks.END_SAPPHIRE_ORE);
//        blockWithItem(ModBlocks.SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
