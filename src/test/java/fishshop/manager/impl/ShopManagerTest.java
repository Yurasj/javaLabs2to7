package fishshop.manager.impl;

import fishshop.model.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class ShopManagerTest {

    private ShopManager Manager1;
    private List<Fish> fishes;

    @BeforeEach
    void setUp(){
        Manager1 = new ShopManager();
        fishes = new LinkedList<>();
        Fish fish1 = new Fish(20, 60, FishCategory.FROZEN,  1.6, 200);
        Fish fish2 = new Fish(30, 50, FishCategory.ALIVE,  2.34, 175);
        Fish fish3 = new Fish(56, 34, FishCategory.HERRING, 0.56, 151 );
        Fish fish4 = new Fish(23.5, 54, FishCategory.FROZEN,  5.9, 124);
        Fish fish5 = new Fish(32, 21, FishCategory.ALIVE,  2.3, 121);
        Fish fish6 = new Fish(67, 34, FishCategory.HERRING, 3.1, 103);

        fishes.addAll(Arrays.asList(fish1, fish2, fish3, fish4, fish5, fish6));
        Manager1.addFishes(fishes);
    }

    @Test
    public void TestAddFishes() {
        Assertions.assertFalse(Manager1.getFishMap().values().isEmpty());
        List<Fish> allFishesList = new ArrayList<>();
        Manager1.getFishMap().values().forEach(allFishesList::addAll);
        Assertions.assertEquals(fishes.size(), allFishesList.size());
    }

    @Test
    void TestFindFishInPriceRange() {
        Fish fish1 = new Fish(20, 60, FishCategory.FROZEN,  1.6, 200);
        Fish fish2 = new Fish(23.5, 54, FishCategory.FROZEN,  5.9, 124);

        double minPrice  = 123;
        double maxPrice  = 201;
        FishCategory someCategory = FishCategory.FROZEN;

        var expected = (Arrays.asList(fish1, fish2));
        var result = Manager1.findFishInPriceRange(minPrice, maxPrice, someCategory);
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(expected.size(), result.size());

        Fish[] expectedArray = expected.toArray(new Fish[expected.size()]);
        Fish[] resultArray = result.toArray(new Fish[result.size()]);

        for(int i = 0; i < expectedArray.length; i++){
            Assertions.assertTrue(expectedArray[i].compareToAnotherFish(resultArray[i]));
        }

    }

    @Test
    void TestSortByPrice() {
        Fish fish1 = new Fish(20, 60, FishCategory.FROZEN,  1.6, 200);
        Fish fish2 = new Fish(30, 50, FishCategory.ALIVE,  2.34, 175);
        Fish fish3 = new Fish(56, 34, FishCategory.HERRING, 0.56, 151 );
        Fish fish4 = new Fish(23.5, 54, FishCategory.FROZEN,  5.9, 124);
        Fish fish5 = new Fish(32, 21, FishCategory.ALIVE,  2.3, 121);
        Fish fish6 = new Fish(67, 34, FishCategory.HERRING, 3.1, 103);

        var expected = (Arrays.asList(fish1, fish2, fish3, fish4, fish5, fish6));
        var result = Manager1.sortByPrice(true);
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(expected.size(), result.size());

        Fish[] expectedArray = expected.toArray(new Fish[expected.size()]);
        Fish[] resultArray = result.toArray(new Fish[result.size()]);

        for(int i = 0; i < expectedArray.length; i++){
            Assertions.assertTrue(expectedArray[i].compareToAnotherFish(resultArray[i]));
        }
    }

    @Test
    void TestSortByWeight() {
        Fish fish5 = new Fish(20, 60, FishCategory.FROZEN,  1.6, 200);
        Fish fish3 = new Fish(30, 50, FishCategory.ALIVE,  2.34, 175);
        Fish fish6 = new Fish(56, 34, FishCategory.HERRING, 0.56, 151 );
        Fish fish1 = new Fish(23.5, 54, FishCategory.FROZEN,  5.9, 124);
        Fish fish4 = new Fish(32, 21, FishCategory.ALIVE,  2.3, 121);
        Fish fish2 = new Fish(67, 34, FishCategory.HERRING, 3.1, 103);

        var expected = (Arrays.asList(fish1, fish2, fish3, fish4, fish5, fish6));
        var result = Manager1.sortByWeight(true);
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(expected.size(), result.size());

        Fish[] expectedArray = expected.toArray(new Fish[expected.size()]);
        Fish[] resultArray = result.toArray(new Fish[result.size()]);

        for(int i = 0; i < expectedArray.length; i++){
            Assertions.assertTrue(expectedArray[i].compareToAnotherFish(resultArray[i]));
        }
    }

}