package things;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CarManager {

    List<Car> getThings;
    void printAll();
    void printSportsCars();
    Optional<Car> getMostPowerfulCar();
    List<String> getAllBrands();
    Map<String, Long> getCountByType();

}
