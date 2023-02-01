package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void store(int amount){
        this.stock += amount;
    }

    public void dispatch(int amount){
        this.stock -= amount;
    }
}
