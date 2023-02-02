package w02d01;

public class GasStation {
    //Legyen egy w02d01.GasStation osztály is melynek legyen egy ár attribútuma, amit konstruktoron keresztül állítunk be.
    // Legyen egy metódusa, a tankolás, ami egy kocsit és egy liter mennyiséget vár paraméterül.
    // Ez a metódus állítsa be a kocsi üzemanyag mennyiségét és adja vissza, hogy mennyit kellett ezért fizetni.
    // Teszteled az osztályokat main metódusban!
    // Commitold és töltsd fel a megoldásodat a megfelelő módon (ex-w02d01 kezdetű üzenettel)!

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int refuelling(Car car, int amount){
        car.setAddedFuel(amount);
        return price * amount;
    }
}
