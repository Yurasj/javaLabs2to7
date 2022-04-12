package FishShop.manager;

import FishShop.model.Fish;
import FishShop.model.FishCategory;

import java.util.List;

public interface IShopManager {

    List<Fish> fishInPriceRange(float minPrice, float maxPrice, FishCategory category);

    void addFishes(List<Fish> fish);

    List<Fish> sortByPrice(boolean reverse);

    List<Fish> sortByWeight(boolean reverse);

}



