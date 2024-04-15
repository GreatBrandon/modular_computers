package net.brandon.modularcomputers.villager;

import net.brandon.modularcomputers.ModularComputers;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, ModularComputers.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ModularComputers.MOD_ID);

//    public static final RegistryObject<PoiType> SOUND_POI = POI_TYPES.register("sound_poi",
//            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.SOUND_BLOCK.get().getStateDefinition().getPossibleStates()),
//                    1,1));
//
//    public static final RegistryObject<VillagerProfession> DRUG_DEALER =
//            VILLAGER_PROFESSIONS.register("drugdealer", () -> new VillagerProfession("drugdealer",
//                    holder -> holder.get() == SOUND_POI.get(), holder -> holder.get() == SOUND_POI.get(),
//                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_WEAPONSMITH));
    public static void register (IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
