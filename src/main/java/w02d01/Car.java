package w02d01;

public class Car {
    //Készíts egy w02d01.Car osztályt, mely attribútumként tárolja, hogy hány litert a tankoltunk bele,
    // és hány kilométert ment el ekkora mennyiségű üzemanyaggal.
    // Mindkét attribútumhoz legyen setter metódus!
    // Legyen egy metódus ami kiszámolja az autó átlag fogyasztását,
    // azaz azt hogy 100km távolságon mennyit fogyasztott átlagosan.

    private int addedFuel;
    private int distance;

    public void setAddedFuel(int addedFuel) {
        this.addedFuel = addedFuel;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAddedFuel() {
        return addedFuel;
    }

    public int getDistance() {
        return distance;
    }

    public double fuelConsumption(){
        return addedFuel*100.0/distance;
    }
}
