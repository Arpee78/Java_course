package inheritancemethods.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        double isFuelNeeded =  fuelRate * km / 100;
        isFuelEnoughToDrive(isFuelNeeded);
        modifyFuelAmount(-isFuelNeeded);
    } // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!

    private void isFuelEnoughToDrive(double amount) {
        if (fuel < amount) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    } //kiszámolja, mennyit lehet tankolni
}
