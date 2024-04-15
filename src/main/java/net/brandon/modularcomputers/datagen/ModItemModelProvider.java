package net.brandon.modularcomputers.datagen;

import net.brandon.modularcomputers.ModularComputers;
import net.brandon.modularcomputers.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ModularComputers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        simpleItem(ModItems.SAPPHIRE);
//        simpleItem(ModItems.RAW_SAPPHIRE);
//        simpleItem(ModItems.METAL_DETECTOR);
//        simpleItem(ModItems.PINE_CONE);
//        simpleItem(ModItems.STRAWBERRY);
//        simpleItem(ModItems.COCAINE);
//        simpleItem(ModItems.CRYSTAL_METH);
//        simpleItem(ModItems.BLUE_METH);
//        simpleItem(ModItems.WEED);
//        simpleItem(ModItems.WEED_BROWNIE);
//        simpleItem(ModItems.WEED_JELLY);
//        withExistingParent(ModItems.ENDA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ModularComputers.MOD_ID, "item/" + item.getId().getPath()));
    }
}
