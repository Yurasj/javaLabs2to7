package FishShop.manager;

import FishShop.model.Fish;
import FishShop.model.FishCategory;

import java.util.List;

public interface IShopManager {

    List<Fish> findByCategory(FishCategory category);

    List<Fish> findByPrice(float price);

    void addFish(List<Fish> fish);

    List<Fish> sortByPrice(boolean reverse);

    List<Fish> sortByWeight(boolean reverse);

}



