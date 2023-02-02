package w02d01;

public class Main {


    public static void main(String[] args) {

        Car car = new Car();
        Car secondCar = new Car();
        GasStation gasStation = new GasStation(480);

        System.out.println("Fuel in first car:" + car.getGas());

        int priceToPay = gasStation.tankCar(car, 30);

        System.out.println("Fuel in first car: " + car.getGas() + " price: " + priceToPay);
        System.out.println("Fuel in second car: " + secondCar.getGas());
        int secondCarPrice = gasStation.tankCar(secondCar, 25);
        System.out.println("Fuel in second car: " + secondCar.getGas() + " price: " + secondCarPrice);
    }
}

