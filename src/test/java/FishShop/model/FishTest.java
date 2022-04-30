package FishShop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FishTest {
    Fish fish1, fish2;

    @BeforeEach
    void setUp(){

        fish1 = new Fish(20, 60, FishCategory.FROZEN,  1.6, 150);
    }

    @Test
    void testCompareToAnotherFish(){
        fish2 = new Fish(20, 60, FishCategory.FROZEN,  1.6, 150);
        Assertions.assertTrue(fish1.compareToAnotherFish(fish2));
    }
}