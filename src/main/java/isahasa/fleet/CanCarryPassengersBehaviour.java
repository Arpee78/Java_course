package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{

    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        if (this.passengers + passengers > maxPassengers) {
            int remainder = passengers + this.passengers - maxPassengers;
            this.passengers = maxPassengers;
            return remainder;
        }
        this.passengers += passengers;
        return 0;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
