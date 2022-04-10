package FishShop.manager.impl;

import FishShop.manager.IShopManager;
import FishShop.model.Fish;
import FishShop.model.FishCategory;

import java.util.*;

public class ShopManager implements IShopManager {

    private Map<String, List<Fish>> FishMap = new HashMap<>();

    @Override
    public List<Fish> findByCategory(FishCategory category) {
        return null;
    }

    @Override
    public List<Fish> findByPrice(float price) {
        return null;
    }

    @Override
    public void addFish(List<Fish> fish) {
    }

    @Override
    public List<Fish> sortByPrice(boolean reverse) {
        return null;
    }

    @Override
    public List<Fish> sortByWeight(boolean reverse) {
        return null;
    }



}
