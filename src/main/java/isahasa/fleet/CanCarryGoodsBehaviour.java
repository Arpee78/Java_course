package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        if (this.cargoWeight + cargoWeight > maxCargoWeight) {
            int remainder = cargoWeight + this.cargoWeight - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
            return remainder;
        }
        this.cargoWeight += cargoWeight;
        return 0;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

}
