//package fishshop;
//
//import fishshop.manager.impl.ShopManager;
//import fishshop.model.Fish;
//import fishshop.model.FishCategory;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//
//  public static void main(String[] args) {
//
//    Fish fish1 = new Fish(20,60,FishCategory.FROZEN,1.6,150);
//    Fish fish2 = new Fish(30,50,FishCategory.ALIVE,2.34,165);
//    Fish fish3 = new Fish(56,34,FishCategory.HERRING,0.56,111);
//    Fish fish4 = new Fish(23.5,54,FishCategory.FROZEN,5.9,54);
//    Fish fish5 = new Fish(32,21,FishCategory.ALIVE,2.3,121);
//    Fish fish6 = new Fish(67,34,FishCategory.HERRING,3.1,133);
//    List<Fish> fishes = new ArrayList<>(Arrays.asList(fish1,fish2,fish3,fish4,fish5,fish6));
//    fishes.forEach(fish -> {
//      System.out.println("Length: " + fish.getLengthInCm() + " Width: " + fish.getWidthInCm()
//          + " Category: " + fish.getCategory() + " Weight:" + fish.getWeightInKilo()
//          + " Price: " + fish.getPriceInHryvnia());
//    });
//    System.out.println();
//
//    ShopManager manager1 = new ShopManager();
//    manager1.addFishes(fishes);
//
//    List<Fish> fishesSortedByPrice = manager1.sortByPrice(true);
//    System.out.println("sortedByPrice:");
//    fishesSortedByPrice.forEach(fish -> {
//      System.out.println("Length: " + fish.getLengthInCm() + " Width: " + fish.getWidthInCm()
//                    + " Category: " + fish.getCategory() + " Weight:" + fish.getWeightInKilo()
//                    + " Price: " + fish.getPriceInHryvnia());
//    });
//    System.out.println();
//    var fishesSortedByWeight = manager1.sortByWeight(true);
//    System.out.println("sortedByWeight:");
//    fishesSortedByWeight.forEach(fish -> {
//      System.out.println("Length: " + fish.getLengthInCm() + " Width: "
//                    + fish.getWidthInCm() + " Category: " + fish.getCategory()
//                    + " Weight:" + fish.getWeightInKilo() + " Price: " + fish.getPriceInHryvnia());
//    });
//    System.out.println();
//    var fishFoundInPriceRange = manager1.findFishInPriceRange(50, 150, FishCategory.FROZEN);
//    System.out.println("fishFoundInPriceRange:");
//    fishFoundInPriceRange.forEach(fish -> {
//      System.out.println("Length: " + fish.getLengthInCm() + " Width: "
//                  + fish.getWidthInCm() + " Category: " + fish.getCategory()
//                  + " Weight:" + fish.getWeightInKilo() + " Price: " + fish.getPriceInHryvnia());
//    });
//  }
//}
