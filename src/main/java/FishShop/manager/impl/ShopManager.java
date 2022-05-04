package FishShop.manager.impl;

import FishShop.manager.IShopManager;
import FishShop.model.Fish;
import FishShop.model.FishCategory;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
public class ShopManager implements IShopManager {

    private final Map<FishCategory, List<Fish>> fishMap = new HashMap<>();


    @Override
    public List<Fish> findFishInPriceRange(double minPrice, double maxPrice, FishCategory category) {
        List<Fish> fishInPriceRange = new LinkedList<>();
        fishMap.get(category).forEach(fish-> {
            if (fish.getPriceInHryvnia() >= minPrice && fish.getPriceInHryvnia() <= maxPrice){
                fishInPriceRange.add(fish);
            }
        });
        return fishInPriceRange;
    }


    @Override
    public void addFishes(List<Fish> fishes) {
        fishes.forEach(fish -> {
            FishCategory category = fish.getCategory();
            var existingFish = fishMap.computeIfAbsent(category, k -> new LinkedList<>());

            existingFish.add(fish);
        });
    }

    @Override
    public List<Fish> sortByPrice(boolean reverse) {
        List<Fish> allFishes = new ArrayList<>();
        fishMap.values().forEach(allFishes::addAll);
        allFishes.sort(Comparator.comparing(Fish::getPriceInHryvnia));
        if(reverse){
            Collections.reverse(allFishes);
        }
        return allFishes;
    }

    @Override
    public List<Fish> sortByWeight(boolean reverse) {
        List<Fish> allFishes = new ArrayList<>();
        fishMap.values().forEach(allFishes::addAll);
        allFishes.sort(Comparator.comparing(Fish::getWeightInKilo));
        if(reverse){
            Collections.reverse(allFishes);
        }
        return allFishes;

    }

    @Override
    public List<Fish> getFishes() {
        List<Fish> result = new ArrayList<>();
        fishMap.values().forEach(result::addAll);
        return result;
    }

    @Override
    public Set<FishCategory> getKeys() {
        return fishMap.keySet();
    }


}
