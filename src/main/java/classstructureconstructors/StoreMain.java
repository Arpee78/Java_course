package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store1 = new Store("Macskakaja");
        Store store2 = new Store("Kutyakaja");

        store1.store(3);
        store2.store(5);

        System.out.println(store1.getProduct() + ": " + store1.getStock());
        System.out.println(store2.getProduct() + ": " + store2.getStock());

        store1.dispatch(1);
        store2.store(2);

        System.out.println(store1.getProduct() + ": " + store1.getStock());
        System.out.println(store2.getProduct() + ": " + store2.getStock());

    }
}
