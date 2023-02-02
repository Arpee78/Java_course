package w02d01;

public class Car {

    private int gas;
    private int distance;

    public double fuelConsumption(){
        double result = gas *100.0/distance;
        return result;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getGas() {
        return gas;
    }

    public int getDistance() {
        return distance;
    }
}
