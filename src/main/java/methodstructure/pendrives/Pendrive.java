package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        price += price * (percent / 100.0);
    }

    private double getPricePerCapacity(Pendrive pendrive) {
        return (double) pendrive.getPrice() / pendrive.getCapacity();
    }

    public int comparePricePerCapacity(Pendrive other) {
        double pricePerCapacity = getPricePerCapacity(this);
        double pricePerCapacityOther = getPricePerCapacity(other);
        if (pricePerCapacity > pricePerCapacityOther) {
            return 1;
        }
        if (pricePerCapacity < pricePerCapacityOther) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.getPrice();
    }
}
