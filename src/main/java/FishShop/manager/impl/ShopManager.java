package FishShop.manager.impl;

import FishShop.manager.IShopManager;
import FishShop.model.Fish;
import FishShop.model.FishCategory;

import java.util.*;

public class ShopManager implements IShopManager {

    private Map<FishCategory, List<Fish>> fishMap = new HashMap<>();


    @Override
    public List<Fish> fishInPriceRange(float minPrice, float maxPrice, FishCategory category) {
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
            var existingFish = fishMap.get(category);

            if (existingFish == null){
                existingFish = new LinkedList<Fish>();
                fishMap.put(category, existingFish);
            }

            existingFish.add(fish);
        });
    }

    @Override
    public List<Fish> sortByPrice(boolean reverse) {
        List<Fish> allFishes = new ArrayList<>();
        fishMap.values().forEach(fishes -> {
            fishes.forEach(fish -> {
                allFishes.add(fish);
            });
        });
        Collections.sort(allFishes, Comparator.comparing(Fish::getPriceInHryvnia));
        if(reverse){
            Collections.reverse(allFishes);
        }
        return allFishes;
    }

    @Override
    public List<Fish> sortByWeight(boolean reverse) {
        List<Fish> allFishes = new ArrayList<>();
        fishMap.values().forEach(fishes -> {
            fishes.forEach(fish -> {
                allFishes.add(fish);
            });
        });
        Collections.sort(allFishes, Comparator.comparing(Fish::getWeightInKilo));
        if(reverse){
            Collections.reverse(allFishes);
        }
        return allFishes;

    }



}
