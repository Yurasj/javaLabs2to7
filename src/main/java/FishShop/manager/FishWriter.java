package FishShop.manager;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import FishShop.model.Fish;
import FishShop.model.FishCategory;


public class FishWriter {
    public static void writeToFile(List<Fish> fishes ) throws IOException{
        if (!fishes.isEmpty()) {
            try (FileWriter writer = new FileWriter("result.csv")){

                fishes.sort(Comparator.comparing(Fish::getCategory));

                FishCategory previousCategory = FishCategory.NULL;

                for (var fish : fishes) {
                    if (!fish.getCategory().equals(previousCategory)){
                        writer.write(fish.getHeaders());
                        writer.write("\r\n");
                        previousCategory = fish.getCategory();
                    }
                    writer.write(fish.toCSV());
                    writer.write("\r\n");
                }
                writer.flush();
            }
        }
    }
}
