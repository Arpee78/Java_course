package inheritancemethods.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Auxiliary capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        if (fuel > calculateRefillAmount()) {
            throw new IllegalArgumentException("Total capacity is less than fuel!");
        }
        if (fuel > 0) {
            double fuelToAdd = fuel;
            if (getTankCapacity() >= getFuel() + fuelToAdd) {
                setFuel(getFuel() + fuelToAdd);
            } else {
                double removeFromFuelToAdd = getTankCapacity() - getFuel();
                setFuel(getTankCapacity());
                extraFuel = extraFuel + fuelToAdd - removeFromFuelToAdd;
            }
        }
        if (fuel < 0) {
            double fuelToRemove = fuel;
            if (extraFuel == 0) {
                setFuel(getFuel() + fuelToRemove);
            } else if (extraFuel > Math.abs(fuelToRemove)) {
                extraFuel = extraFuel + fuelToRemove;
            } else if (extraFuel < Math.abs(fuelToRemove)){
                double diff = Math.abs(fuelToRemove)-extraFuel;
                extraFuel = 0;
                setFuel(getFuel()-diff);
            }
        }

    }

    @Override
    public void drive(int km) {
        double isFuelNeeded = getFuelRate() * km / 100;
        isFuelEnoughToDrive(isFuelNeeded);
        modifyFuelAmount(-isFuelNeeded);
    }

    private void isFuelEnoughToDrive(double amount) {
        if (getFuel() + extraFuel < amount) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    }
}
