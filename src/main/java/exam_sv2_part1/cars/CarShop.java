package exam_sv2_part1.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() < maxPrice) {
            carsForSell.add(car);
            return true;
        } else {
            return false;
        }
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car actual : carsForSell) {
            sum += actual.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int count = 0;
        for (Car actual : carsForSell) {
            if (actual.getPrice() <= price) {
                count++;
            }
        }
        return count;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> result = new ArrayList<>();

        for (Car actual : carsForSell) {
            if (actual.getBrand().equalsIgnoreCase(brand)) {
                result.add(actual);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

}
