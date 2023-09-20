package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();

    private int waitingPeople;
    private int waitingCargo;

    public void loadShip(int passengers, int cargoWeight) {
        waitingPeople += passengers;
        waitingCargo += cargoWeight;
        for (Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                waitingPeople = ((CanCarryPassengers) ship).loadPassenger(waitingPeople);
            }
            if (ship instanceof CanCarryGoods) {
                waitingCargo = ((CanCarryGoods) ship).loadCargo(waitingCargo);
            }
        }
    }

    public void loadShipGood(int passengers, int cargoWeight) {
        int remainingPersons = passengers;
        int remainingCargo = cargoWeight;
        for (Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                    remainingPersons = ((CanCarryPassengers) ship).loadPassenger(remainingPersons);
            }
            if (ship instanceof CanCarryGoods) {
                    remainingCargo = ((CanCarryGoods) ship).loadCargo(remainingCargo);
            }
        }
        waitingPeople = remainingPersons;
        waitingCargo = remainingCargo;
    }

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
