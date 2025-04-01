package cars;

import java.util.List;

public interface CarManager {

    default List<Car> getCars() {
        return TextCarReader.loadFromTextFile();
    }

    void printAllCars();
    void printPowerfulCars();
    List<Car> getSortedByHorsepower();
    List<String> getCarBrands();
    long countCarsAfterYear(int year);

}
