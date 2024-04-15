package net.brandon.modularcomputers.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.brandon.modularcomputers.ModularComputers;
import net.brandon.modularcomputers.item.ModItems;
import net.brandon.modularcomputers.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = ModularComputers.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
//        if (event.getType() == VillagerProfession.FARMER) {
//            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
//
//            // level 1 trade
//            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.EMERALD, 2), // input trade
//                    new ItemStack(ModItems.STRAWBERRY.get(), 16), // ouput trade
//                    10,8,0.02f));
//        }
//        if (event.getType() == ModVillagers.DRUG_DEALER.get()) {
//            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
//
//            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.GOLD_INGOT, 2), // input trade
//                    new ItemStack(ModItems.WEED.get(), 8), // ouput trade
//                    8,2,0.02f));
//
//            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.DIAMOND, 1), // input trade
//                    new ItemStack(ModItems.CRYSTAL_METH.get(), 2), // ouput trade
//                    4,4,0.02f));
//
//            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.DIAMOND, 1), // input trade
//                    new ItemStack(ModItems.BLUE_METH.get(), 2), // ouput trade
//                    4,4,0.02f));
//
//            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.EMERALD, 1), // input trade
//                    new ItemStack(ModItems.WEED_JELLY.get(), 16), // ouput trade
//                    4,6,0.02f));
//
//            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.EMERALD, 1), // input trade
//                    new ItemStack(ModItems.WEED_BROWNIE.get(), 4), // ouput trade
//                    2,6,0.02f));
//
//            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
//                    new ItemStack(Items.GOLD_INGOT, 8), // input trade
//                    new ItemStack(ModItems.COCAINE.get(), 4), // ouput trade
//                    8,8,0.02f));
//        }
    }

//    @SubscribeEvent
//    public static void addCustomWanderingTrades(WandererTradesEvent event) {
//        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
//        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();
//
//        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
//                new ItemStack(Items.EMERALD, 8),
//                new ItemStack(ModItems.COCAINE.get(),1),
//                5,2,0.2f));
//    }
}
