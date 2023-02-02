package w02d01;

public class GasStation {

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int tankCar(Car car, int liter){
        car.setGas(liter);
        return liter*price;
    }
}
