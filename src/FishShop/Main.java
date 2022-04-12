package FishShop;

import FishShop.model.Fish;
import FishShop.model.FishCategory;
import FishShop.manager.impl.ShopManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	    Fish fish1 = new Fish(FishCategory.FROZEN, 150, 1.6);
        Fish fish2 = new Fish(FishCategory.ALIVE, 165, 2.34);
        Fish fish3 = new Fish(FishCategory.HERRING, 111, 0.56);
        Fish fish4 = new Fish(FishCategory.FROZEN, 54, 5.9);
        Fish fish5 = new Fish(FishCategory.ALIVE, 121, 2.3);
        Fish fish6 = new Fish(FishCategory.HERRING, 133, 3.1);

        ShopManager Manager1 = new ShopManager();

        Manager1.addFishes(Arrays.asList(fish1, fish2, fish3, fish4, fish5, fish6 ));

        System.out.println("Sorted by price: " + Manager1.sortByPrice(false));

        System.out.println("Sorted by weight: " + Manager1.sortByWeight(true));

        System.out.println("Frozen fishes in price range of 50 - 125: " + Manager1.fishInPriceRange(50, 125, FishCategory.FROZEN ));
    }
}
