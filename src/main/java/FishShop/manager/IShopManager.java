package FishShop.manager;

import FishShop.model.Fish;
import FishShop.model.FishCategory;

import java.util.List;
import java.util.Set;

public interface IShopManager {

    List<Fish> findFishInPriceRange(double minPrice, double maxPrice, FishCategory category);

    void addFishes(List<Fish> fish);

    List<Fish> sortByPrice(boolean reverse);

    List<Fish> sortByWeight(boolean reverse);

    List<Fish> getFishes();

    Set<FishCategory> getKeys();

}



