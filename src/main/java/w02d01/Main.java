package w02d01;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Car secondCar = new Car();
        GasStation gasStation = new GasStation(480);

        System.out.println("Fuel in first car: " + car.getAddedFuel());

        int priceToPay = gasStation.refuelling(car, 30);

        System.out.println("Fuel in first car: " + car.getAddedFuel() + " price: " + priceToPay);
        System.out.println("Fuel in second car: " + secondCar.getAddedFuel());
        int secondCarPrice = gasStation.refuelling(secondCar, 25);
        System.out.println("Fuel in second car: " + secondCar.getAddedFuel() + " price: " + secondCarPrice);
    }
}
