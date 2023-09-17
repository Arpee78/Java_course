package virtualmethod.vehicle;

public class FerryBoat extends Vehicle{

    private Car car;
    public static final int MAX_CARRY_WEIGHT = 2000;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad()+ car.getGrossLoad();
    }

    public boolean canCarry(Car car){
        if (car.getVehicleWeight()<MAX_CARRY_WEIGHT){
            return true;
        }
        return false;
    }

    public boolean load(Car car){
        if (car !=null && car.getVehicleWeight()<MAX_CARRY_WEIGHT){
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
