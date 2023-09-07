package inheritanceattributes.book;

public class ShippedBook extends Book {

    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        return super.purchase(pieces) + shippingCost;
    } // kiszámolja a darabszám ismeretében a teljes árat, postaköltséggel együtt

    public String toString() {
        return getTitle() + ": " + price + " Ft, postaköltség: " + shippingCost + " Ft";
    } // Egy ehhez hasonló szöveget ad vissza: "Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft"
}
