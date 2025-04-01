package cars;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class TextCarReader {

    public static List<Car> loadFromTextFile() {
        try (var reader = new BufferedReader(new InputStreamReader(
                TextCarReader.class.getResourceAsStream("/cars/cars_list.txt")))) {

            return reader.lines()
                    .map(line -> line.split(","))
                    .map(parts -> new Car(
                            parts[0],
                            parts[1],
                            Integer.parseInt(parts[2]),
                            Integer.parseInt(parts[3])
                    ))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            throw new RuntimeException("Hiba a cars_list.txt olvasásakor", e);
        }
    }
}
