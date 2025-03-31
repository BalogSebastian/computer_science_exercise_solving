package things;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CarManagerImpl implements CarManager {

    private static final List<Car> cars = loadCars();

    @Override
    public List<Car> getThings(){
        return cars;
    }


    @Override
    public void printAll(){
        getThings().stream().forEach(System.out::println);
    }

    @Override
    public Optional<Car> getMostPowerfulCar(){
        return getThings().stream()
                .max(Comparator.comparingInt(Car::getHorsepower));
    }

}
