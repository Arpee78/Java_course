package attributes.bill;

public class Bill {

    public static void main(String[] args) {
        BillItem billItem = new BillItem("Betyár pogácsa", 100,5,27);
        System.out.println(billItem.calculateTotalPrice());
    }
}
