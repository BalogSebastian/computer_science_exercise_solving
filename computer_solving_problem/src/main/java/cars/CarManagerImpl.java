package cars;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarManagerImpl implements CarManager {

    @Override
    public void printAllCars(){
        getCars().stream()
                .forEach(System.out::println);
    }

    @Override
    public void printPowerfulCars(){
        getCars().stream()
                .filter(car -> car.horsepower() > 200)
                .forEach(System.out::println);
    }

    @Override
    public List<Car> getSortedByHorsepower(){
        return getCars().stream()
                .sorted(Comparator.comparingInt(Car::horsepower).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getCarBrands(){
        return getCars().stream()
                .map(Car::brand)
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public long countCarsAfterYear(int year){
        return getCars().stream()
                .filter(car -> car.year() > year)
                .count();
    }


    public static void main(String[] args) {
        var manager = new CarManagerImpl();

        manager.printAllCars();
        manager.printPowerfulCars();
        System.out.println(manager.getSortedByHorsepower());
        System.out.println(manager.getCarBrands());
        System.out.println("Cars AFTER 2015:  " + manager.countCarsAfterYear(2015));
    }
}
