package fishshop.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import fishshop.model.Fish;
import fishshop.model.FishCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class FishWriterTest {

    Path pathOfExpectedFile = Paths.get("C:\\Users\\Yurii\\IdeaProjects\\FishShop\\src\\test\\expected.csv");
    Path pathOfActualFile = Path.of("C:\\Users\\Yurii\\IdeaProjects\\FishShop\\result.csv");

    List<Fish> fishes = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Fish fish1 = new Fish(20, 60, FishCategory.FROZEN, 1.6, 200);
        Fish fish2 = new Fish(30, 50, FishCategory.ALIVE, 2.34, 175);
        Fish fish3 = new Fish(56, 34, FishCategory.HERRING, 0.56, 151);
        Fish fish4 = new Fish(23.5, 54, FishCategory.FROZEN, 5.9, 124);
        Fish fish5 = new Fish(67, 34, FishCategory.HERRING, 3.1, 103);
        Fish fish6 = new Fish(32, 21, FishCategory.ALIVE, 2.3, 121);

        fishes.addAll(Arrays.asList(fish1, fish2, fish3, fish4, fish5, fish6));
    }

    @Test
    void TestWriteToFile() throws IOException {
        Assertions.assertFalse(fishes.isEmpty());
        FishWriter.writeToFile(fishes);
        try (FileReader expectedReader = new FileReader(String.valueOf(pathOfExpectedFile));
             BufferedReader expectedBR = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader(String.valueOf(pathOfActualFile));
             BufferedReader actualBR = new BufferedReader(actualReader)) {
            String expectedLine = expectedBR.readLine();
            String actualLine = actualBR.readLine();
            while (expectedLine != null || actualLine != null) {
                Assertions.assertEquals(expectedLine, actualLine);
                expectedLine = expectedBR.readLine();
                actualLine = actualBR.readLine();
            }
        }
    }
}