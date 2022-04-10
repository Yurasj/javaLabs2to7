package FishShop;

import FishShop.model.Fish;
import FishShop.model.FishCategory;
import FishShop.manager.impl.ShopManager;

public class Main {

    public static void main(String[] args) {
	    Fish fish1 = new Fish(FishCategory.FROZEN, 150, 1.6);

        ShopManager manager1 = new ShopManager();
    }
}
