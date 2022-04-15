package FishShop;

import FishShop.model.Fish;
import FishShop.model.FishCategory;
import FishShop.manager.impl.ShopManager;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
	    Fish fish1 = new Fish(20, 60, FishCategory.FROZEN,  1.6, 150);
        Fish fish2 = new Fish(30, 50, FishCategory.ALIVE,  2.34, 165);
        Fish fish3 = new Fish(56, 34, FishCategory.HERRING, 0.56, 111 );
        Fish fish4 = new Fish(23.5, 54, FishCategory.FROZEN,  5.9, 54);
        Fish fish5 = new Fish(32, 21, FishCategory.ALIVE,  2.3, 121);
        Fish fish6 = new Fish(67, 34, FishCategory.HERRING, 3.1, 133);

        ShopManager Manager1 = new ShopManager();

        Manager1.addFishes(Arrays.asList(fish1, fish2, fish3, fish4, fish5, fish6 ));

        System.out.println("Sorted by price: " + Manager1.sortByPrice(false));

        System.out.println("Sorted by weight: " + Manager1.sortByWeight(true));

        System.out.println("Frozen fishes in price range of 50 - 125: " + Manager1.fishInPriceRange(50, 125, FishCategory.FROZEN ));
    }
}
